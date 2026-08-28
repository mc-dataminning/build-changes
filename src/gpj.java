public class gpj extends gny<bvb, gvg> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gox h;

   protected gpj(gnz.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gvg a() {
      return new gvg();
   }

   public void a(bvb $$0, gvg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvx $$3 = $$0.o();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dX(), null, 0) : null;
   }

   public void a(gvg $$0, fdt $$1, ghw $$2, int $$3) {
      gzu $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azj.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gov.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azr.a());
         $$1.b();
      }
   }
}
