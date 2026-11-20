package net.minecraft.world.level.levelgen.structure.structures;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class RuinedPortalStructure extends Structure {
   private static final String[] STRUCTURE_LOCATION_PORTALS = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] STRUCTURE_LOCATION_GIANT_PORTALS = new String[]{
      "ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"
   };
   private static final float PROBABILITY_OF_GIANT_PORTAL = 0.05F;
   private static final int MIN_Y_INDEX = 15;
   private final List<RuinedPortalStructure.Setup> setups;
   public static final MapCodec<RuinedPortalStructure> CODEC = RecordCodecBuilder.mapCodec(
      i -> i.group(settingsCodec(i), ExtraCodecs.nonEmptyList(RuinedPortalStructure.Setup.CODEC.listOf()).fieldOf("setups").forGetter(s -> s.setups))
         .apply(i, RuinedPortalStructure::new)
   );

   public RuinedPortalStructure(final Structure.StructureSettings settings, final List<RuinedPortalStructure.Setup> setups) {
      super(settings);
      this.setups = setups;
   }

   public RuinedPortalStructure(final Structure.StructureSettings settings, final RuinedPortalStructure.Setup setup) {
      this(settings, List.of(setup));
   }

   @Override
   public Optional<Structure.GenerationStub> findGenerationPoint(final Structure.GenerationContext context) {
      WorldgenRandom random = context.random();
      RuinedPortalStructure.Setup chosenSetup = null;
      if (this.setups.size() > 1) {
         float total = 0.0F;

         for (RuinedPortalStructure.Setup s : this.setups) {
            total += s.weight();
         }

         float pick = random.nextFloat();

         for (RuinedPortalStructure.Setup s : this.setups) {
            pick -= s.weight() / total;
            if (pick < 0.0F) {
               chosenSetup = s;
               break;
            }
         }
      } else {
         chosenSetup = this.setups.get(0);
      }

      if (chosenSetup == null) {
         throw new IllegalStateException();
      }

      RuinedPortalStructure.Setup setup = chosenSetup;
      boolean airPocket = sample(random, setup.airPocketProbability());
      Identifier templateLocation;
      if (random.nextFloat() < 0.05F) {
         templateLocation = Identifier.withDefaultNamespace(STRUCTURE_LOCATION_GIANT_PORTALS[random.nextInt(STRUCTURE_LOCATION_GIANT_PORTALS.length)]);
      } else {
         templateLocation = Identifier.withDefaultNamespace(STRUCTURE_LOCATION_PORTALS[random.nextInt(STRUCTURE_LOCATION_PORTALS.length)]);
      }

      StructureTemplate template = context.structureTemplateManager().getOrEmpty(templateLocation);
      Rotation rotation = Util.getRandom(Rotation.values(), random);
      Mirror mirror = random.nextFloat() < 0.5F ? Mirror.NONE : Mirror.FRONT_BACK;
      BlockPos pivot = new BlockPos(template.getSize().getX() / 2, 0, template.getSize().getZ() / 2);
      ChunkGenerator chunkGenerator = context.chunkGenerator();
      LevelHeightAccessor heightAccessor = context.heightAccessor();
      RandomState randomState = context.randomState();
      BlockPos basePosition = context.chunkPos().getWorldPosition();
      BoundingBox boundingBox = template.getBoundingBox(basePosition, rotation, pivot, mirror);
      BlockPos center = boundingBox.getCenter();
      int surfaceY = chunkGenerator.getFirstFreeHeight(
            center.getX(), center.getZ(), RuinedPortalPiece.getHeightMapType(setup.placement()), heightAccessor, randomState
         )
         - 1;
      int projectedY = findSuitableY(
         random, chunkGenerator, setup.placement(), airPocket, surfaceY, boundingBox.getYSpan(), boundingBox, heightAccessor, randomState
      );
      BlockPos origin = new BlockPos(basePosition.getX(), projectedY, basePosition.getZ());
      return Optional.of(
         new Structure.GenerationStub(
            origin,
            builder -> {
               RuinedPortalPiece.Properties properties = new RuinedPortalPiece.Properties(
                  setup.canBeCold()
                     && isCold(
                        origin,
                        context.noiseBiomeResolver()
                           .getNoiseBiome(QuartPos.fromBlock(origin.getX()), QuartPos.fromBlock(origin.getY()), QuartPos.fromBlock(origin.getZ())),
                        chunkGenerator.getSeaLevel()
                     ),
                  setup.mossiness(),
                  airPocket,
                  setup.overgrown(),
                  setup.vines(),
                  setup.replaceWithBlackstone()
               );
               builder.addPiece(
                  new RuinedPortalPiece(
                     context.registryAccess(),
                     context.structureTemplateManager(),
                     origin,
                     setup.placement(),
                     properties,
                     templateLocation,
                     template,
                     rotation,
                     mirror,
                     pivot
                  )
               );
            }
         )
      );
   }

   private static boolean sample(final WorldgenRandom random, final float limit) {
      if (limit == 0.0F) {
         return false;
      } else {
         return limit == 1.0F ? true : random.nextFloat() < limit;
      }
   }

   private static boolean isCold(final BlockPos pos, final Holder<Biome> biome, final int seaLevel) {
      return biome.value().coldEnoughToSnow(pos, seaLevel);
   }

   private static int findSuitableY(
      final RandomSource random,
      final ChunkGenerator generator,
      final RuinedPortalPiece.VerticalPlacement verticalPlacement,
      final boolean airPocket,
      final int surfaceYAtCenter,
      final int ySpan,
      final BoundingBox boundingBox,
      final LevelHeightAccessor heightAccessor,
      final RandomState randomState
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 7
      // 002: invokeinterface net/minecraft/world/level/LevelHeightAccessor.getMinY ()I 1
      // 007: bipush 15
      // 009: iadd
      // 00a: istore 10
      // 00c: aload 2
      // 00d: getstatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement.IN_NETHER Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;
      // 010: if_acmpne 04a
      // 013: iload 3
      // 014: ifeq 024
      // 017: aload 0
      // 018: bipush 32
      // 01a: bipush 100
      // 01c: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 01f: istore 9
      // 021: goto 09d
      // 024: aload 0
      // 025: invokeinterface net/minecraft/util/RandomSource.nextFloat ()F 1
      // 02a: ldc 0.5
      // 02c: fcmpg
      // 02d: ifge 03d
      // 030: aload 0
      // 031: bipush 27
      // 033: bipush 29
      // 035: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 038: istore 9
      // 03a: goto 09d
      // 03d: aload 0
      // 03e: bipush 29
      // 040: bipush 100
      // 042: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 045: istore 9
      // 047: goto 09d
      // 04a: aload 2
      // 04b: getstatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement.IN_MOUNTAIN Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;
      // 04e: if_acmpne 065
      // 051: iload 4
      // 053: iload 5
      // 055: isub
      // 056: istore 11
      // 058: aload 0
      // 059: bipush 70
      // 05b: iload 11
      // 05d: invokestatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalStructure.getRandomWithinInterval (Lnet/minecraft/util/RandomSource;II)I
      // 060: istore 9
      // 062: goto 09d
      // 065: aload 2
      // 066: getstatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement.UNDERGROUND Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;
      // 069: if_acmpne 080
      // 06c: iload 4
      // 06e: iload 5
      // 070: isub
      // 071: istore 11
      // 073: aload 0
      // 074: iload 10
      // 076: iload 11
      // 078: invokestatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalStructure.getRandomWithinInterval (Lnet/minecraft/util/RandomSource;II)I
      // 07b: istore 9
      // 07d: goto 09d
      // 080: aload 2
      // 081: getstatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement.PARTLY_BURIED Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;
      // 084: if_acmpne 099
      // 087: iload 4
      // 089: iload 5
      // 08b: isub
      // 08c: aload 0
      // 08d: bipush 2
      // 08e: bipush 8
      // 090: invokestatic net/minecraft/util/Mth.randomBetweenInclusive (Lnet/minecraft/util/RandomSource;II)I
      // 093: iadd
      // 094: istore 9
      // 096: goto 09d
      // 099: iload 4
      // 09b: istore 9
      // 09d: new net/minecraft/core/BlockPos
      // 0a0: dup
      // 0a1: aload 6
      // 0a3: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.minX ()I
      // 0a6: bipush 0
      // 0a7: aload 6
      // 0a9: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.minZ ()I
      // 0ac: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0af: new net/minecraft/core/BlockPos
      // 0b2: dup
      // 0b3: aload 6
      // 0b5: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.maxX ()I
      // 0b8: bipush 0
      // 0b9: aload 6
      // 0bb: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.minZ ()I
      // 0be: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0c1: new net/minecraft/core/BlockPos
      // 0c4: dup
      // 0c5: aload 6
      // 0c7: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.minX ()I
      // 0ca: bipush 0
      // 0cb: aload 6
      // 0cd: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.maxZ ()I
      // 0d0: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0d3: new net/minecraft/core/BlockPos
      // 0d6: dup
      // 0d7: aload 6
      // 0d9: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.maxX ()I
      // 0dc: bipush 0
      // 0dd: aload 6
      // 0df: invokevirtual net/minecraft/world/level/levelgen/structure/BoundingBox.maxZ ()I
      // 0e2: invokespecial net/minecraft/core/BlockPos.<init> (III)V
      // 0e5: invokestatic com/google/common/collect/ImmutableList.of (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableList;
      // 0e8: astore 11
      // 0ea: aload 11
      // 0ec: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 0f1: aload 1
      // 0f2: aload 7
      // 0f4: aload 8
      // 0f6: invokedynamic apply (Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, net/minecraft/world/level/levelgen/structure/structures/RuinedPortalStructure.lambda$findSuitableY$0 (Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/NoiseColumn;, (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/NoiseColumn; ]
      // 0fb: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 100: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
      // 105: astore 12
      // 107: aload 2
      // 108: getstatic net/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement.ON_OCEAN_FLOOR Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;
      // 10b: if_acmpne 112
      // 10e: bipush 1
      // 10f: goto 113
      // 112: bipush 0
      // 113: istore 13
      // 115: iload 9
      // 117: istore 14
      // 119: iload 14
      // 11b: iload 10
      // 11d: if_icmple 17c
      // 120: bipush 0
      // 121: istore 15
      // 123: aload 12
      // 125: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 12a: astore 16
      // 12c: aload 16
      // 12e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 133: ifeq 176
      // 136: aload 16
      // 138: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13d: checkcast net/minecraft/world/level/levelgen/NoiseColumn
      // 140: astore 17
      // 142: iload 13
      // 144: ifeq 151
      // 147: aload 17
      // 149: iload 14
      // 14b: invokevirtual net/minecraft/world/level/levelgen/NoiseColumn.isSolid (I)Z
      // 14e: goto 160
      // 151: aload 17
      // 153: iload 14
      // 155: invokevirtual net/minecraft/world/level/levelgen/NoiseColumn.isEmpty (I)Z
      // 158: ifne 15f
      // 15b: bipush 1
      // 15c: goto 160
      // 15f: bipush 0
      // 160: istore 18
      // 162: iload 18
      // 164: ifeq 173
      // 167: iinc 15 1
      // 16a: iload 15
      // 16c: bipush 3
      // 16d: if_icmpne 173
      // 170: goto 17c
      // 173: goto 12c
      // 176: iinc 14 -1
      // 179: goto 119
      // 17c: iload 14
      // 17e: ireturn
   }

   private static int getRandomWithinInterval(final RandomSource random, final int minPreferred, final int max) {
      return minPreferred < max ? Mth.randomBetweenInclusive(random, minPreferred, max) : max;
   }

   @Override
   public StructureType<?> type() {
      return StructureType.RUINED_PORTAL;
   }

   public record Setup(
      RuinedPortalPiece.VerticalPlacement placement,
      float airPocketProbability,
      float mossiness,
      boolean overgrown,
      boolean vines,
      boolean canBeCold,
      boolean replaceWithBlackstone,
      float weight
   ) {
      public static final Codec<RuinedPortalStructure.Setup> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               RuinedPortalPiece.VerticalPlacement.CODEC.fieldOf("placement").forGetter(RuinedPortalStructure.Setup::placement),
               Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(RuinedPortalStructure.Setup::airPocketProbability),
               Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(RuinedPortalStructure.Setup::mossiness),
               Codec.BOOL.fieldOf("overgrown").forGetter(RuinedPortalStructure.Setup::overgrown),
               Codec.BOOL.fieldOf("vines").forGetter(RuinedPortalStructure.Setup::vines),
               Codec.BOOL.fieldOf("can_be_cold").forGetter(RuinedPortalStructure.Setup::canBeCold),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(RuinedPortalStructure.Setup::replaceWithBlackstone),
               ExtraCodecs.POSITIVE_FLOAT.fieldOf("weight").forGetter(RuinedPortalStructure.Setup::weight)
            )
            .apply(i, RuinedPortalStructure.Setup::new)
      );
   }
}
