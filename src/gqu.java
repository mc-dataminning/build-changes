public class gqu extends gpj<bvn, gws> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gqi h;

   protected gqu(gpk.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gws a() {
      return new gws();
   }

   public void a(bvn $$0, gws $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwm $$3 = $$0.l();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dV(), null, 0) : null;
   }

   public void a(gws $$0, fer $$1, gjg $$2, int $$3) {
      hbg $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azm.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gqg.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azu.a());
         $$1.b();
      }
   }
}
