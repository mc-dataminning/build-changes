public class gbh extends fzt<cev, fmi<cev>> {
   private static final ahg a = new ahg("textures/entity/villager/villager.png");

   public gbh(fyn.a $$0) {
      super($$0, new fmi<>($$0.a(fmw.bM)), 0.5F);
      this.a(new gcd<>(this, $$0.f(), $$0.d()));
      this.a(new gdj<>(this, $$0.e(), "villager"));
      this.a(new gcc<>(this, $$0.d()));
   }

   public ahg a(cev $$0) {
      return a;
   }

   protected void a(cev $$0, eqb $$1, float $$2) {
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
