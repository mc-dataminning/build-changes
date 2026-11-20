package net.minecraft.client.renderer.debug;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.debug.DebugEntryEnvironmentAttribute;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.core.BlockPos;
import net.minecraft.gizmos.GizmoStyle;
import net.minecraft.gizmos.Gizmos;
import net.minecraft.gizmos.TextGizmo;
import net.minecraft.util.ARGB;
import net.minecraft.util.debug.DebugValueAccess;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.SpatialAttributeInterpolator;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3fc;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;

public class EnvironmentAttributeDebugRenderer implements DebugRenderer.SimpleDebugRenderer {
   private static final int HEATMAP_RADIUS = 16;
   private static final float HEATMAP_CELL_HEIGHT = 0.0625F;
   private static final float HEATMAP_OPACITY = 0.25F;
   private final Minecraft minecraft;
   private @Nullable Level cachedLevel;
   private @Nullable EnvironmentAttribute<?> cachedAttribute;
   private @Nullable BlockPos cachedCenter;
   private long cachedGameTime = Long.MIN_VALUE;
   private List<EnvironmentAttributeDebugRenderer.HeatmapSample> cachedSamples = List.of();

   public EnvironmentAttributeDebugRenderer(final Minecraft minecraft) {
      this.minecraft = minecraft;
   }

   @Override
   public void emitGizmos(
      final double camX, final double camY, final double camZ, final DebugValueAccess debugValues, final Frustum frustum, final float partialTicks
   ) {
      Level level = this.minecraft.level;
      if (level != null && !this.minecraft.showOnlyReducedInfo()) {
         EnvironmentAttribute<?> attribute = DebugEntryEnvironmentAttribute.getAttribute();
         if (attribute != null) {
            this.renderGizmoHeatmap(level, attribute, BlockPos.containing(camX, camY, camZ).below());
         }
      } else {
         this.forgetCaches();
      }
   }

   private void renderGizmoHeatmap(final Level level, final EnvironmentAttribute<?> attribute, final BlockPos center) {
      for (EnvironmentAttributeDebugRenderer.HeatmapSample sample : this.heatmapSamples(level, attribute, center)) {
         BlockPos pos = sample.pos();
         if (!attribute.isSyncable() && this.minecraft.getSingleplayerServer() == null) {
            Gizmos.billboardText("!", new Vec3(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5), TextGizmo.Style.whiteAndCentered());
         } else {
            Gizmos.cuboid(
               new AABB(pos.getX() + 0.05, pos.getY() + 0.05, pos.getZ() + 0.05, pos.getX() + 0.95, pos.getY() + 0.05 + 0.0625, pos.getZ() + 0.95),
               GizmoStyle.fill(sample.color())
            );
         }
      }
   }

   private List<EnvironmentAttributeDebugRenderer.HeatmapSample> heatmapSamples(
      final Level level, final EnvironmentAttribute<?> attribute, final BlockPos center
   ) {
      long gameTime = level.getGameTime();
      if (this.cachedLevel == level && this.cachedAttribute == attribute && center.equals(this.cachedCenter) && this.cachedGameTime == gameTime) {
         return this.cachedSamples;
      }

      SpatialAttributeInterpolator biomeInterpolator = attribute.isSpatiallyInterpolated() ? new SpatialAttributeInterpolator() : null;
      List<EnvironmentAttributeDebugRenderer.HeatmapSample> samples = new ArrayList<>();

      for (BlockPos cursor : BlockPos.betweenClosed(center.offset(-16, 0, -16), center.offset(16, 0, 16))) {
         BlockPos pos = cursor.immutable();
         if (biomeInterpolator != null) {
            biomeInterpolator.sampleBiomes(level, Vec3.atCenterOf(pos));
         }

         Object value = sampleValue(level, attribute, pos, biomeInterpolator);
         samples.add(new EnvironmentAttributeDebugRenderer.HeatmapSample(pos, ARGB.multiplyAlpha(colorFromValue(value), 0.25F)));
      }

      this.cachedLevel = level;
      this.cachedAttribute = attribute;
      this.cachedCenter = center;
      this.cachedGameTime = gameTime;
      this.cachedSamples = List.copyOf(samples);
      return this.cachedSamples;
   }

   private void forgetCaches() {
      this.cachedLevel = null;
      this.cachedAttribute = null;
      this.cachedCenter = null;
      this.cachedGameTime = Long.MIN_VALUE;
      this.cachedSamples = List.of();
   }

   private static <Value> Value sampleValue(
      final Level level, final EnvironmentAttribute<Value> attribute, final BlockPos pos, final @Nullable SpatialAttributeInterpolator biomeInterpolator
   ) {
      return biomeInterpolator == null
         ? level.environmentAttributes().getValue(attribute, pos)
         : level.environmentAttributes().getValue(attribute, Vec3.atCenterOf(pos), biomeInterpolator);
   }

   private static int colorFromValue(final Object value) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Ljava/lang/Object; with value 4
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:364)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.SwitchExprent.toJava(SwitchExprent.java:105)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:85)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:925)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:87)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:860)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 05: pop
      // 06: astore 1
      // 07: bipush 0
      // 08: istore 2
      // 09: aload 1
      // 0a: iload 2
      // 0b: invokedynamic typeSwitch (Ljava/lang/Object;I)I bsm=java/lang/runtime/SwitchBootstraps.typeSwitch (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ org/joml/Vector3fc, org/joml/Vector4fc, java/lang/Boolean, java/lang/Number, java/util/List ]
      // 10: tableswitch 119 0 4 36 48 62 88 88
      // 34: aload 1
      // 35: checkcast org/joml/Vector3fc
      // 38: astore 3
      // 39: aload 3
      // 3a: invokestatic net/minecraft/util/ARGB.colorFromVector3f (Lorg/joml/Vector3fc;)I
      // 3d: goto ac
      // 40: aload 1
      // 41: checkcast org/joml/Vector4fc
      // 44: astore 4
      // 46: aload 4
      // 48: invokestatic net/minecraft/util/ARGB.colorFromVector4f (Lorg/joml/Vector4fc;)I
      // 4b: goto ac
      // 4e: aload 1
      // 4f: checkcast java/lang/Boolean
      // 52: astore 5
      // 54: aload 5
      // 56: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 59: ifeq 62
      // 5c: ldc_w -16711936
      // 5f: goto ac
      // 62: ldc_w -65536
      // 65: goto ac
      // 68: aload 1
      // 69: instanceof java/lang/Number
      // 6c: ifeq 72
      // 6f: goto 81
      // 72: aload 1
      // 73: instanceof java/util/List
      // 76: ifeq 7c
      // 79: goto 81
      // 7c: bipush 5
      // 7d: istore 2
      // 7e: goto 09
      // 81: ldc_w -8355712
      // 84: goto ac
      // 87: aload 0
      // 88: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 8b: invokevirtual java/lang/String.hashCode ()I
      // 8e: istore 6
      // 90: iload 6
      // 92: ldc_w 65535
      // 95: iand
      // 96: i2f
      // 97: ldc_w 65535.0
      // 9a: fdiv
      // 9b: fstore 7
      // 9d: fload 7
      // 9f: ldc_w 0.65
      // a2: fconst_1
      // a3: sipush 255
      // a6: invokestatic net/minecraft/util/Mth.hsvToArgb (FFFI)I
      // a9: goto ac
      // ac: ireturn
   }

   private record HeatmapSample(BlockPos pos, int color) {
   }
}
