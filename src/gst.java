public class gst extends gri<bwh, gys> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gsh h;

   protected gst(grj.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gys a() {
      return new gys();
   }

   public void a(bwh $$0, gys $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxk $$3 = $$0.m();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dV(), null, 0) : null;
   }

   public void a(gys $$0, fgl $$1, gle $$2, int $$3) {
      hdg $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = bae.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gsf.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), bam.a());
         $$1.b();
      }
   }
}
