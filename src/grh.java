public class grh extends gpq<coe, gww, gaw> {
   private static final ali a = ali.b("textures/entity/wandering_trader.png");

   public grh(gok.a $$0) {
      super($$0, new gaw($$0.a(gbl.cW)), 0.5F);
      this.a(new gsc<>(this, $$0.f(), $$0.b()));
      this.a(new gsb<>(this, $$0.b()));
   }

   public ali a(gww $$0) {
      return a;
   }

   protected void a(gww $$0, feb $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gww c() {
      return new gww();
   }

   public void a(coe $$0, gww $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
