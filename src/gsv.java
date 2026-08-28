public class gsv extends grk<bwd, gyu> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gsj h;

   protected gsv(grl.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gyu a() {
      return new gyu();
   }

   public void a(bwd $$0, gyu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxg $$3 = $$0.m();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dW(), null, 0) : null;
   }

   public void a(gyu $$0, fgl $$1, glg $$2, int $$3) {
      hdi $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azu.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gsh.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), bac.a());
         $$1.b();
      }
   }
}
