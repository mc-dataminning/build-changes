public class gbg extends fzs<ceu, fmh<ceu>> {
   private static final ahg a = new ahg("textures/entity/villager/villager.png");

   public gbg(fym.a $$0) {
      super($$0, new fmh<>($$0.a(fmv.bM)), 0.5F);
      this.a(new gcc<>(this, $$0.f(), $$0.d()));
      this.a(new gdi<>(this, $$0.e(), "villager"));
      this.a(new gcb<>(this, $$0.d()));
   }

   public ahg a(ceu $$0) {
      return a;
   }

   protected void a(ceu $$0, eqa $$1, float $$2) {
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
