package net.minecraft.core.particles;

public enum ParticleLimit {
   SPORE_BLOSSOM(1000);

   private final int limit;

   ParticleLimit(final int limit) {
      this.limit = limit;
   }

   public int limit() {
      return this.limit;
   }
}
