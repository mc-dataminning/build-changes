public class gsi extends gqq<col, gxx, gbv> {
   private static final alj a = alj.b("textures/entity/wandering_trader.png");

   public gsi(gpk.a $$0) {
      super($$0, new gbv($$0.a(gck.dn)), 0.5F);
      this.a(new gtd<>(this, $$0.f(), $$0.b()));
      this.a(new gtc<>(this, $$0.b()));
   }

   public alj a(gxx $$0) {
      return a;
   }

   protected void a(gxx $$0, fer $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gxx b() {
      return new gxx();
   }

   public void a(col $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n() > 0;
   }
}
