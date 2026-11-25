package net.minecraft.world.level.pathfinder;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.PathNavigationRegion;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jspecify.annotations.Nullable;

public class FlyNodeEvaluator extends WalkNodeEvaluator {
   private final Long2ObjectMap<PathType> pathTypeByPosCache = new Long2ObjectOpenHashMap();
   private static final float SMALL_MOB_SIZE = 1.0F;
   private static final float SMALL_MOB_INFLATED_START_NODE_BOUNDING_BOX = 1.1F;
   private static final int MAX_START_NODE_CANDIDATES = 10;

   @Override
   public void prepare(final PathNavigationRegion level, final Mob entity) {
      super.prepare(level, entity);
      this.pathTypeByPosCache.clear();
      entity.onPathfindingStart();
   }

   @Override
   public void done() {
      this.mob.onPathfindingDone();
      this.pathTypeByPosCache.clear();
      super.done();
   }

   @Override
   public Node getStart() {
      int startY;
      if (this.canFloat() && this.mob.isInWater()) {
         startY = this.mob.getBlockY();
         BlockPos.MutableBlockPos reusableBlockPos = new BlockPos.MutableBlockPos(this.mob.getX(), startY, this.mob.getZ());

         for (BlockState state = this.currentContext.getBlockState(reusableBlockPos);
            state.is(Blocks.WATER);
            state = this.currentContext.getBlockState(reusableBlockPos)
         ) {
            reusableBlockPos.set(this.mob.getX(), ++startY, this.mob.getZ());
         }
      } else {
         startY = Mth.floor(this.mob.getY() + 0.5);
      }

      BlockPos startPos = BlockPos.containing(this.mob.getX(), startY, this.mob.getZ());
      if (!this.canStartAt(startPos)) {
         for (BlockPos testedPosition : this.iteratePathfindingStartNodeCandidatePositions(this.mob)) {
            if (this.canStartAt(testedPosition)) {
               return super.getStartNode(testedPosition);
            }
         }
      }

      return super.getStartNode(startPos);
   }

   @Override
   protected boolean canStartAt(final BlockPos pos) {
      PathType blockPathType = this.getCachedPathType(pos.getX(), pos.getY(), pos.getZ());
      return this.mob.getPathfindingMalus(blockPathType) >= 0.0F;
   }

   @Override
   public Target getTarget(final double x, final double y, final double z) {
      return this.getTargetNodeAt(x, y, z);
   }

   @Override
   public int getNeighbors(final Node[] neighbors, final Node pos) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: aload 0
      // 003: aload 2
      // 004: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 007: aload 2
      // 008: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 00b: aload 2
      // 00c: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 00f: bipush 1
      // 010: iadd
      // 011: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 014: astore 4
      // 016: aload 0
      // 017: aload 4
      // 019: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 01c: ifeq 027
      // 01f: aload 1
      // 020: iload 3
      // 021: iinc 3 1
      // 024: aload 4
      // 026: aastore
      // 027: aload 0
      // 028: aload 2
      // 029: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 02c: bipush 1
      // 02d: isub
      // 02e: aload 2
      // 02f: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 032: aload 2
      // 033: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 036: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 039: astore 5
      // 03b: aload 0
      // 03c: aload 5
      // 03e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 041: ifeq 04c
      // 044: aload 1
      // 045: iload 3
      // 046: iinc 3 1
      // 049: aload 5
      // 04b: aastore
      // 04c: aload 0
      // 04d: aload 2
      // 04e: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 051: bipush 1
      // 052: iadd
      // 053: aload 2
      // 054: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 057: aload 2
      // 058: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 05b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 05e: astore 6
      // 060: aload 0
      // 061: aload 6
      // 063: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 066: ifeq 071
      // 069: aload 1
      // 06a: iload 3
      // 06b: iinc 3 1
      // 06e: aload 6
      // 070: aastore
      // 071: aload 0
      // 072: aload 2
      // 073: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 076: aload 2
      // 077: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 07a: aload 2
      // 07b: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 07e: bipush 1
      // 07f: isub
      // 080: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 083: astore 7
      // 085: aload 0
      // 086: aload 7
      // 088: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 08b: ifeq 096
      // 08e: aload 1
      // 08f: iload 3
      // 090: iinc 3 1
      // 093: aload 7
      // 095: aastore
      // 096: aload 0
      // 097: aload 2
      // 098: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 09b: aload 2
      // 09c: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 09f: bipush 1
      // 0a0: iadd
      // 0a1: aload 2
      // 0a2: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 0a5: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 0a8: astore 8
      // 0aa: aload 0
      // 0ab: aload 8
      // 0ad: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 0b0: ifeq 0bb
      // 0b3: aload 1
      // 0b4: iload 3
      // 0b5: iinc 3 1
      // 0b8: aload 8
      // 0ba: aastore
      // 0bb: aload 0
      // 0bc: aload 2
      // 0bd: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 0c0: aload 2
      // 0c1: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 0c4: bipush 1
      // 0c5: isub
      // 0c6: aload 2
      // 0c7: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 0ca: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 0cd: astore 9
      // 0cf: aload 0
      // 0d0: aload 9
      // 0d2: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 0d5: ifeq 0e0
      // 0d8: aload 1
      // 0d9: iload 3
      // 0da: iinc 3 1
      // 0dd: aload 9
      // 0df: aastore
      // 0e0: aload 0
      // 0e1: aload 2
      // 0e2: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 0e5: aload 2
      // 0e6: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 0e9: bipush 1
      // 0ea: iadd
      // 0eb: aload 2
      // 0ec: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 0f4: astore 10
      // 0f6: aload 0
      // 0f7: aload 10
      // 0f9: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 0fc: ifeq 119
      // 0ff: aload 0
      // 100: aload 4
      // 102: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 105: ifeq 119
      // 108: aload 0
      // 109: aload 8
      // 10b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 10e: ifeq 119
      // 111: aload 1
      // 112: iload 3
      // 113: iinc 3 1
      // 116: aload 10
      // 118: aastore
      // 119: aload 0
      // 11a: aload 2
      // 11b: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 11e: bipush 1
      // 11f: isub
      // 120: aload 2
      // 121: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 124: bipush 1
      // 125: iadd
      // 126: aload 2
      // 127: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 12a: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 12d: astore 11
      // 12f: aload 0
      // 130: aload 11
      // 132: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 135: ifeq 152
      // 138: aload 0
      // 139: aload 5
      // 13b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 13e: ifeq 152
      // 141: aload 0
      // 142: aload 8
      // 144: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 147: ifeq 152
      // 14a: aload 1
      // 14b: iload 3
      // 14c: iinc 3 1
      // 14f: aload 11
      // 151: aastore
      // 152: aload 0
      // 153: aload 2
      // 154: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 157: bipush 1
      // 158: iadd
      // 159: aload 2
      // 15a: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 15d: bipush 1
      // 15e: iadd
      // 15f: aload 2
      // 160: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 163: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 166: astore 12
      // 168: aload 0
      // 169: aload 12
      // 16b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 16e: ifeq 18b
      // 171: aload 0
      // 172: aload 6
      // 174: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 177: ifeq 18b
      // 17a: aload 0
      // 17b: aload 8
      // 17d: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 180: ifeq 18b
      // 183: aload 1
      // 184: iload 3
      // 185: iinc 3 1
      // 188: aload 12
      // 18a: aastore
      // 18b: aload 0
      // 18c: aload 2
      // 18d: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 190: aload 2
      // 191: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 194: bipush 1
      // 195: iadd
      // 196: aload 2
      // 197: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 19a: bipush 1
      // 19b: isub
      // 19c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 19f: astore 13
      // 1a1: aload 0
      // 1a2: aload 13
      // 1a4: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1a7: ifeq 1c4
      // 1aa: aload 0
      // 1ab: aload 7
      // 1ad: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1b0: ifeq 1c4
      // 1b3: aload 0
      // 1b4: aload 8
      // 1b6: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1b9: ifeq 1c4
      // 1bc: aload 1
      // 1bd: iload 3
      // 1be: iinc 3 1
      // 1c1: aload 13
      // 1c3: aastore
      // 1c4: aload 0
      // 1c5: aload 2
      // 1c6: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 1c9: aload 2
      // 1ca: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 1cd: bipush 1
      // 1ce: isub
      // 1cf: aload 2
      // 1d0: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 1d3: bipush 1
      // 1d4: iadd
      // 1d5: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 1d8: astore 14
      // 1da: aload 0
      // 1db: aload 14
      // 1dd: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1e0: ifeq 1fd
      // 1e3: aload 0
      // 1e4: aload 4
      // 1e6: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1e9: ifeq 1fd
      // 1ec: aload 0
      // 1ed: aload 9
      // 1ef: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 1f2: ifeq 1fd
      // 1f5: aload 1
      // 1f6: iload 3
      // 1f7: iinc 3 1
      // 1fa: aload 14
      // 1fc: aastore
      // 1fd: aload 0
      // 1fe: aload 2
      // 1ff: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 202: bipush 1
      // 203: isub
      // 204: aload 2
      // 205: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 208: bipush 1
      // 209: isub
      // 20a: aload 2
      // 20b: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 20e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 211: astore 15
      // 213: aload 0
      // 214: aload 15
      // 216: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 219: ifeq 236
      // 21c: aload 0
      // 21d: aload 5
      // 21f: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 222: ifeq 236
      // 225: aload 0
      // 226: aload 9
      // 228: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 22b: ifeq 236
      // 22e: aload 1
      // 22f: iload 3
      // 230: iinc 3 1
      // 233: aload 15
      // 235: aastore
      // 236: aload 0
      // 237: aload 2
      // 238: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 23b: bipush 1
      // 23c: iadd
      // 23d: aload 2
      // 23e: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 241: bipush 1
      // 242: isub
      // 243: aload 2
      // 244: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 247: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 24a: astore 16
      // 24c: aload 0
      // 24d: aload 16
      // 24f: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 252: ifeq 26f
      // 255: aload 0
      // 256: aload 6
      // 258: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 25b: ifeq 26f
      // 25e: aload 0
      // 25f: aload 9
      // 261: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 264: ifeq 26f
      // 267: aload 1
      // 268: iload 3
      // 269: iinc 3 1
      // 26c: aload 16
      // 26e: aastore
      // 26f: aload 0
      // 270: aload 2
      // 271: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 274: aload 2
      // 275: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 278: bipush 1
      // 279: isub
      // 27a: aload 2
      // 27b: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 27e: bipush 1
      // 27f: isub
      // 280: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 283: astore 17
      // 285: aload 0
      // 286: aload 17
      // 288: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 28b: ifeq 2a8
      // 28e: aload 0
      // 28f: aload 7
      // 291: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 294: ifeq 2a8
      // 297: aload 0
      // 298: aload 9
      // 29a: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 29d: ifeq 2a8
      // 2a0: aload 1
      // 2a1: iload 3
      // 2a2: iinc 3 1
      // 2a5: aload 17
      // 2a7: aastore
      // 2a8: aload 0
      // 2a9: aload 2
      // 2aa: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 2ad: bipush 1
      // 2ae: iadd
      // 2af: aload 2
      // 2b0: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 2b3: aload 2
      // 2b4: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 2b7: bipush 1
      // 2b8: isub
      // 2b9: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 2bc: astore 18
      // 2be: aload 0
      // 2bf: aload 18
      // 2c1: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 2c4: ifeq 2e1
      // 2c7: aload 0
      // 2c8: aload 7
      // 2ca: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 2cd: ifeq 2e1
      // 2d0: aload 0
      // 2d1: aload 6
      // 2d3: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 2d6: ifeq 2e1
      // 2d9: aload 1
      // 2da: iload 3
      // 2db: iinc 3 1
      // 2de: aload 18
      // 2e0: aastore
      // 2e1: aload 0
      // 2e2: aload 2
      // 2e3: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 2e6: bipush 1
      // 2e7: iadd
      // 2e8: aload 2
      // 2e9: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 2ec: aload 2
      // 2ed: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 2f0: bipush 1
      // 2f1: iadd
      // 2f2: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 2f5: astore 19
      // 2f7: aload 0
      // 2f8: aload 19
      // 2fa: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 2fd: ifeq 31a
      // 300: aload 0
      // 301: aload 4
      // 303: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 306: ifeq 31a
      // 309: aload 0
      // 30a: aload 6
      // 30c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 30f: ifeq 31a
      // 312: aload 1
      // 313: iload 3
      // 314: iinc 3 1
      // 317: aload 19
      // 319: aastore
      // 31a: aload 0
      // 31b: aload 2
      // 31c: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 31f: bipush 1
      // 320: isub
      // 321: aload 2
      // 322: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 325: aload 2
      // 326: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 329: bipush 1
      // 32a: isub
      // 32b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 32e: astore 20
      // 330: aload 0
      // 331: aload 20
      // 333: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 336: ifeq 353
      // 339: aload 0
      // 33a: aload 7
      // 33c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 33f: ifeq 353
      // 342: aload 0
      // 343: aload 5
      // 345: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 348: ifeq 353
      // 34b: aload 1
      // 34c: iload 3
      // 34d: iinc 3 1
      // 350: aload 20
      // 352: aastore
      // 353: aload 0
      // 354: aload 2
      // 355: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 358: bipush 1
      // 359: isub
      // 35a: aload 2
      // 35b: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 35e: aload 2
      // 35f: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 362: bipush 1
      // 363: iadd
      // 364: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 367: astore 21
      // 369: aload 0
      // 36a: aload 21
      // 36c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 36f: ifeq 38c
      // 372: aload 0
      // 373: aload 4
      // 375: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 378: ifeq 38c
      // 37b: aload 0
      // 37c: aload 5
      // 37e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 381: ifeq 38c
      // 384: aload 1
      // 385: iload 3
      // 386: iinc 3 1
      // 389: aload 21
      // 38b: aastore
      // 38c: aload 0
      // 38d: aload 2
      // 38e: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 391: bipush 1
      // 392: iadd
      // 393: aload 2
      // 394: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 397: bipush 1
      // 398: iadd
      // 399: aload 2
      // 39a: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 39d: bipush 1
      // 39e: isub
      // 39f: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 3a2: astore 22
      // 3a4: aload 0
      // 3a5: aload 22
      // 3a7: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3aa: ifeq 3eb
      // 3ad: aload 0
      // 3ae: aload 18
      // 3b0: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3b3: ifeq 3eb
      // 3b6: aload 0
      // 3b7: aload 7
      // 3b9: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3bc: ifeq 3eb
      // 3bf: aload 0
      // 3c0: aload 6
      // 3c2: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3c5: ifeq 3eb
      // 3c8: aload 0
      // 3c9: aload 8
      // 3cb: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3ce: ifeq 3eb
      // 3d1: aload 0
      // 3d2: aload 13
      // 3d4: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3d7: ifeq 3eb
      // 3da: aload 0
      // 3db: aload 12
      // 3dd: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 3e0: ifeq 3eb
      // 3e3: aload 1
      // 3e4: iload 3
      // 3e5: iinc 3 1
      // 3e8: aload 22
      // 3ea: aastore
      // 3eb: aload 0
      // 3ec: aload 2
      // 3ed: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 3f0: bipush 1
      // 3f1: iadd
      // 3f2: aload 2
      // 3f3: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 3f6: bipush 1
      // 3f7: iadd
      // 3f8: aload 2
      // 3f9: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 3fc: bipush 1
      // 3fd: iadd
      // 3fe: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 401: astore 23
      // 403: aload 0
      // 404: aload 23
      // 406: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 409: ifeq 44a
      // 40c: aload 0
      // 40d: aload 19
      // 40f: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 412: ifeq 44a
      // 415: aload 0
      // 416: aload 4
      // 418: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 41b: ifeq 44a
      // 41e: aload 0
      // 41f: aload 6
      // 421: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 424: ifeq 44a
      // 427: aload 0
      // 428: aload 8
      // 42a: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 42d: ifeq 44a
      // 430: aload 0
      // 431: aload 10
      // 433: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 436: ifeq 44a
      // 439: aload 0
      // 43a: aload 12
      // 43c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 43f: ifeq 44a
      // 442: aload 1
      // 443: iload 3
      // 444: iinc 3 1
      // 447: aload 23
      // 449: aastore
      // 44a: aload 0
      // 44b: aload 2
      // 44c: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 44f: bipush 1
      // 450: isub
      // 451: aload 2
      // 452: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 455: bipush 1
      // 456: iadd
      // 457: aload 2
      // 458: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 45b: bipush 1
      // 45c: isub
      // 45d: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 460: astore 24
      // 462: aload 0
      // 463: aload 24
      // 465: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 468: ifeq 4a9
      // 46b: aload 0
      // 46c: aload 20
      // 46e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 471: ifeq 4a9
      // 474: aload 0
      // 475: aload 7
      // 477: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 47a: ifeq 4a9
      // 47d: aload 0
      // 47e: aload 5
      // 480: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 483: ifeq 4a9
      // 486: aload 0
      // 487: aload 8
      // 489: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 48c: ifeq 4a9
      // 48f: aload 0
      // 490: aload 13
      // 492: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 495: ifeq 4a9
      // 498: aload 0
      // 499: aload 11
      // 49b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 49e: ifeq 4a9
      // 4a1: aload 1
      // 4a2: iload 3
      // 4a3: iinc 3 1
      // 4a6: aload 24
      // 4a8: aastore
      // 4a9: aload 0
      // 4aa: aload 2
      // 4ab: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 4ae: bipush 1
      // 4af: isub
      // 4b0: aload 2
      // 4b1: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 4b4: bipush 1
      // 4b5: iadd
      // 4b6: aload 2
      // 4b7: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 4ba: bipush 1
      // 4bb: iadd
      // 4bc: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 4bf: astore 25
      // 4c1: aload 0
      // 4c2: aload 25
      // 4c4: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4c7: ifeq 508
      // 4ca: aload 0
      // 4cb: aload 21
      // 4cd: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4d0: ifeq 508
      // 4d3: aload 0
      // 4d4: aload 4
      // 4d6: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4d9: ifeq 508
      // 4dc: aload 0
      // 4dd: aload 5
      // 4df: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4e2: ifeq 508
      // 4e5: aload 0
      // 4e6: aload 8
      // 4e8: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4eb: ifeq 508
      // 4ee: aload 0
      // 4ef: aload 10
      // 4f1: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4f4: ifeq 508
      // 4f7: aload 0
      // 4f8: aload 11
      // 4fa: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 4fd: ifeq 508
      // 500: aload 1
      // 501: iload 3
      // 502: iinc 3 1
      // 505: aload 25
      // 507: aastore
      // 508: aload 0
      // 509: aload 2
      // 50a: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 50d: bipush 1
      // 50e: iadd
      // 50f: aload 2
      // 510: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 513: bipush 1
      // 514: isub
      // 515: aload 2
      // 516: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 519: bipush 1
      // 51a: isub
      // 51b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 51e: astore 26
      // 520: aload 0
      // 521: aload 26
      // 523: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 526: ifeq 567
      // 529: aload 0
      // 52a: aload 18
      // 52c: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 52f: ifeq 567
      // 532: aload 0
      // 533: aload 7
      // 535: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 538: ifeq 567
      // 53b: aload 0
      // 53c: aload 6
      // 53e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 541: ifeq 567
      // 544: aload 0
      // 545: aload 9
      // 547: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 54a: ifeq 567
      // 54d: aload 0
      // 54e: aload 17
      // 550: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 553: ifeq 567
      // 556: aload 0
      // 557: aload 16
      // 559: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 55c: ifeq 567
      // 55f: aload 1
      // 560: iload 3
      // 561: iinc 3 1
      // 564: aload 26
      // 566: aastore
      // 567: aload 0
      // 568: aload 2
      // 569: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 56c: bipush 1
      // 56d: iadd
      // 56e: aload 2
      // 56f: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 572: bipush 1
      // 573: isub
      // 574: aload 2
      // 575: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 578: bipush 1
      // 579: iadd
      // 57a: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 57d: astore 27
      // 57f: aload 0
      // 580: aload 27
      // 582: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 585: ifeq 5c6
      // 588: aload 0
      // 589: aload 19
      // 58b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 58e: ifeq 5c6
      // 591: aload 0
      // 592: aload 4
      // 594: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 597: ifeq 5c6
      // 59a: aload 0
      // 59b: aload 6
      // 59d: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5a0: ifeq 5c6
      // 5a3: aload 0
      // 5a4: aload 9
      // 5a6: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5a9: ifeq 5c6
      // 5ac: aload 0
      // 5ad: aload 14
      // 5af: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5b2: ifeq 5c6
      // 5b5: aload 0
      // 5b6: aload 16
      // 5b8: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5bb: ifeq 5c6
      // 5be: aload 1
      // 5bf: iload 3
      // 5c0: iinc 3 1
      // 5c3: aload 27
      // 5c5: aastore
      // 5c6: aload 0
      // 5c7: aload 2
      // 5c8: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 5cb: bipush 1
      // 5cc: isub
      // 5cd: aload 2
      // 5ce: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 5d1: bipush 1
      // 5d2: isub
      // 5d3: aload 2
      // 5d4: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 5d7: bipush 1
      // 5d8: isub
      // 5d9: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 5dc: astore 28
      // 5de: aload 0
      // 5df: aload 28
      // 5e1: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5e4: ifeq 625
      // 5e7: aload 0
      // 5e8: aload 20
      // 5ea: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5ed: ifeq 625
      // 5f0: aload 0
      // 5f1: aload 7
      // 5f3: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5f6: ifeq 625
      // 5f9: aload 0
      // 5fa: aload 5
      // 5fc: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 5ff: ifeq 625
      // 602: aload 0
      // 603: aload 9
      // 605: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 608: ifeq 625
      // 60b: aload 0
      // 60c: aload 17
      // 60e: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 611: ifeq 625
      // 614: aload 0
      // 615: aload 15
      // 617: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 61a: ifeq 625
      // 61d: aload 1
      // 61e: iload 3
      // 61f: iinc 3 1
      // 622: aload 28
      // 624: aastore
      // 625: aload 0
      // 626: aload 2
      // 627: getfield net/minecraft/world/level/pathfinder/Node.x I
      // 62a: bipush 1
      // 62b: isub
      // 62c: aload 2
      // 62d: getfield net/minecraft/world/level/pathfinder/Node.y I
      // 630: bipush 1
      // 631: isub
      // 632: aload 2
      // 633: getfield net/minecraft/world/level/pathfinder/Node.z I
      // 636: bipush 1
      // 637: iadd
      // 638: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.findAcceptedNode (III)Lnet/minecraft/world/level/pathfinder/Node;
      // 63b: astore 29
      // 63d: aload 0
      // 63e: aload 29
      // 640: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.isOpen (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 643: ifeq 684
      // 646: aload 0
      // 647: aload 21
      // 649: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 64c: ifeq 684
      // 64f: aload 0
      // 650: aload 4
      // 652: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 655: ifeq 684
      // 658: aload 0
      // 659: aload 5
      // 65b: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 65e: ifeq 684
      // 661: aload 0
      // 662: aload 9
      // 664: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 667: ifeq 684
      // 66a: aload 0
      // 66b: aload 14
      // 66d: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 670: ifeq 684
      // 673: aload 0
      // 674: aload 15
      // 676: invokevirtual net/minecraft/world/level/pathfinder/FlyNodeEvaluator.hasMalus (Lnet/minecraft/world/level/pathfinder/Node;)Z
      // 679: ifeq 684
      // 67c: aload 1
      // 67d: iload 3
      // 67e: iinc 3 1
      // 681: aload 29
      // 683: aastore
      // 684: iload 3
      // 685: ireturn
   }

   private boolean hasMalus(final @Nullable Node node) {
      return node != null && node.costMalus >= 0.0F;
   }

   private boolean isOpen(final @Nullable Node node) {
      return node != null && !node.closed;
   }

   protected @Nullable Node findAcceptedNode(final int x, final int y, final int z) {
      Node best = null;
      PathType pathType = this.getCachedPathType(x, y, z);
      float pathCost = this.mob.getPathfindingMalus(pathType);
      if (pathCost >= 0.0F) {
         best = this.getNode(x, y, z);
         best.type = pathType;
         best.costMalus = Math.max(best.costMalus, pathCost);
         if (pathType == PathType.WALKABLE) {
            best.costMalus++;
         }
      }

      return best;
   }

   @Override
   protected PathType getCachedPathType(final int x, final int y, final int z) {
      return (PathType)this.pathTypeByPosCache.computeIfAbsent(BlockPos.asLong(x, y, z), key -> this.getPathTypeOfMob(this.currentContext, x, y, z, this.mob));
   }

   @Override
   public PathType getPathType(final PathfindingContext context, final int x, final int y, final int z) {
      PathType blockPathType = context.getPathTypeFromState(x, y, z);
      if (blockPathType == PathType.OPEN && y >= context.level().getMinY() + 1) {
         BlockPos belowPos = new BlockPos(x, y - 1, z);
         PathType belowType = context.getPathTypeFromState(belowPos.getX(), belowPos.getY(), belowPos.getZ());
         if (belowType == PathType.FIRE || belowType == PathType.LAVA) {
            blockPathType = PathType.FIRE;
         } else if (belowType == PathType.DAMAGING) {
            blockPathType = PathType.DAMAGING;
         } else if (belowType == PathType.AVOID_IN_AIR) {
            blockPathType = PathType.AVOID_IN_AIR;
         } else if (belowType == PathType.FENCE) {
            if (!belowPos.equals(context.mobPosition())) {
               blockPathType = PathType.FENCE;
            }
         } else {
            blockPathType = belowType != PathType.WALKABLE && belowType != PathType.OPEN && belowType != PathType.WATER ? PathType.WALKABLE : PathType.OPEN;
         }
      }

      if (blockPathType == PathType.WALKABLE || blockPathType == PathType.OPEN) {
         blockPathType = checkNeighbourBlocks(context, x, y, z, blockPathType);
      }

      return blockPathType;
   }

   private Iterable<BlockPos> iteratePathfindingStartNodeCandidatePositions(final Mob mob) {
      AABB boundingBox = mob.getBoundingBox();
      boolean isSmallMob = boundingBox.getSize() < 1.0;
      if (!isSmallMob) {
         return List.of(
            BlockPos.containing(boundingBox.minX, mob.getBlockY(), boundingBox.minZ),
            BlockPos.containing(boundingBox.minX, mob.getBlockY(), boundingBox.maxZ),
            BlockPos.containing(boundingBox.maxX, mob.getBlockY(), boundingBox.minZ),
            BlockPos.containing(boundingBox.maxX, mob.getBlockY(), boundingBox.maxZ)
         );
      }

      double zPadding = Math.max(0.0, 1.1F - boundingBox.getZsize());
      double xPadding = Math.max(0.0, 1.1F - boundingBox.getXsize());
      double yPadding = Math.max(0.0, 1.1F - boundingBox.getYsize());
      AABB inflatedBoundingBox = boundingBox.inflate(xPadding, yPadding, zPadding);
      return BlockPos.randomBetweenClosed(
         mob.getRandom(),
         10,
         Mth.floor(inflatedBoundingBox.minX),
         Mth.floor(inflatedBoundingBox.minY),
         Mth.floor(inflatedBoundingBox.minZ),
         Mth.floor(inflatedBoundingBox.maxX),
         Mth.floor(inflatedBoundingBox.maxY),
         Mth.floor(inflatedBoundingBox.maxZ)
      );
   }
}
