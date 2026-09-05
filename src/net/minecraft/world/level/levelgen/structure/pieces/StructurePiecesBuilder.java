package net.minecraft.world.level.levelgen.structure.pieces;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import org.jspecify.annotations.Nullable;

public class StructurePiecesBuilder {
   private final List<StructurePiece> pieces = Lists.newArrayList();

   public void addPiece(final StructurePiece piece) {
      this.pieces.add(piece);
   }

   @Nullable
   public StructurePiece findCollisionPiece(final BoundingBox box) {
      return StructurePiece.findCollisionPiece(this.pieces, box);
   }

   @Deprecated
   public void offsetPiecesVertically(final int dy) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/level/levelgen/structure/pieces/StructurePiecesBuilder.pieces Ljava/util/List;
      // 04: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09: astore 2
      // 0a: aload 2
      // 0b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10: ifeq 27
      // 13: aload 2
      // 14: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19: checkcast net/minecraft/world/level/levelgen/structure/StructurePiece
      // 1c: astore 3
      // 1d: aload 3
      // 1e: bipush 0
      // 1f: iload 1
      // 20: bipush 0
      // 21: invokevirtual net/minecraft/world/level/levelgen/structure/StructurePiece.move (III)V
      // 24: goto 0a
      // 27: return
   }

   @Deprecated
   public int moveBelowSeaLevel(final int seaLevel, final int minY, final RandomSource random, final int offset) {
      int maxY = seaLevel - offset;
      BoundingBox boundingBox = this.getBoundingBox();
      int y1Pos = boundingBox.getYSpan() + minY + 1;
      if (y1Pos < maxY) {
         y1Pos += random.nextInt(maxY - y1Pos);
      }

      int dy = y1Pos - boundingBox.maxY();
      this.offsetPiecesVertically(dy);
      return dy;
   }

   public void moveInsideHeights(final RandomSource random, final int lowestAllowed, final int highestAllowed) {
      BoundingBox boundingBox = this.getBoundingBox();
      int heightSpan = highestAllowed - lowestAllowed + 1 - boundingBox.getYSpan();
      int y0Pos;
      if (heightSpan > 1) {
         y0Pos = lowestAllowed + random.nextInt(heightSpan);
      } else {
         y0Pos = lowestAllowed;
      }

      int dy = y0Pos - boundingBox.minY();
      this.offsetPiecesVertically(dy);
   }

   public PiecesContainer build() {
      return new PiecesContainer(this.pieces);
   }

   public void clear() {
      this.pieces.clear();
   }

   public boolean isEmpty() {
      return this.pieces.isEmpty();
   }

   public BoundingBox getBoundingBox() {
      return StructurePiece.createBoundingBox(this.pieces.stream());
   }
}
