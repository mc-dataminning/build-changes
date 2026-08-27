public class gai extends fyu<cee, flj<cee>> {
   private static final agt a = new agt("textures/entity/villager/villager.png");

   public gai(fxo.a $$0) {
      super($$0, new flj<>($$0.a(flx.bM)), 0.5F);
      this.a(new gbe<>(this, $$0.f(), $$0.d()));
      this.a(new gck<>(this, $$0.e(), "villager"));
      this.a(new gbd<>(this, $$0.d()));
   }

   public agt a(cee $$0) {
      return a;
   }

   protected void a(cee $$0, epd $$1, float $$2) {
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
