public class gaz extends fzl<ceo, fma<ceo>> {
   private static final ahd a = new ahd("textures/entity/villager/villager.png");

   public gaz(fyf.a $$0) {
      super($$0, new fma<>($$0.a(fmo.bM)), 0.5F);
      this.a(new gbv<>(this, $$0.f(), $$0.d()));
      this.a(new gdb<>(this, $$0.e(), "villager"));
      this.a(new gbu<>(this, $$0.d()));
   }

   public ahd a(ceo $$0) {
      return a;
   }

   protected void a(ceo $$0, ept $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.o_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
