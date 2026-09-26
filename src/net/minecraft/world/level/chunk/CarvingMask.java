package net.minecraft.world.level.chunk;

import java.util.BitSet;

public class CarvingMask implements CarverOutput {
   private final int minY;
   private final int maxY;
   private final int height;
   private final BitSet mask;

   public CarvingMask(final int minY, final int maxY) {
      this.minY = minY;
      this.maxY = maxY;
      this.height = maxY - minY + 1;
      this.mask = new BitSet(256 * this.height);
   }

   private int getIndex(final int x, final int y, final int z) {
      return y - this.minY + this.getIndexXz(x, z);
   }

   private int getIndexXz(final int x, final int z) {
      return (z + (x << 4)) * this.height;
   }

   @Override
   public int minY() {
      return this.minY;
   }

   @Override
   public int maxY() {
      return this.maxY;
   }

   @Override
   public void carve(final int x, final int y, final int z) {
      this.mask.set(this.getIndex(x, y, z));
   }

   public void applyFilter(final CarvingMask.Filter filter) {
      if (!this.mask.isEmpty()) {
         int index = 0;

         for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
               for (int y = 0; y < this.height; y++) {
                  if (this.mask.get(index) && !filter.test(x, y + this.minY, z)) {
                     this.mask.clear(index);
                  }

                  index++;
               }
            }
         }
      }
   }

   public CarvingMask.Column getColumn(final int x, final int z) {
      if (x >= 0 && z >= 0 && x < 16 && z < 16) {
         return new CarvingMask.Column(this.getIndexXz(x, z));
      } else {
         throw new IllegalArgumentException("[" + x + "; " + z + "] is out of bounds");
      }
   }

   public boolean isEmpty() {
      return this.mask.isEmpty();
   }

   public class Column {
      private final int baseIndex;

      private Column(final int baseIndex) {
         this.baseIndex = baseIndex;
      }

      public boolean isCarved(final int y) {
         int indexY = y - CarvingMask.this.minY;
         return indexY >= 0 && indexY < CarvingMask.this.height ? CarvingMask.this.mask.get(this.baseIndex + indexY) : false;
      }
   }

   @FunctionalInterface
   public interface Filter {
      boolean test(int x, int y, int z);
   }
}
