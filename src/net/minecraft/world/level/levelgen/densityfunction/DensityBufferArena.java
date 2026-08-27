package net.minecraft.world.level.levelgen.densityfunction;

public interface DensityBufferArena {
   DensityBufferArena GLOBAL = new DensityBufferArena() {
      @Override
      public ScopedDensityBuffer acquire(final int size) {
         return new ScopedDensityBuffer(this, size, size);
      }

      @Override
      public void release(final ScopedDensityBuffer buffer) {
      }
   };

   ScopedDensityBuffer acquire(int size);

   void release(ScopedDensityBuffer buffer);
}
