package net.minecraft.core.particles;

public class ParticleLimit {
   public static final ParticleLimit SPORE_BLOSSOM = new ParticleLimit(1000);
   private final int limit;

   public ParticleLimit(final int limit) {
      this.limit = limit;
   }

   public int limit() {
      return this.limit;
   }
}
