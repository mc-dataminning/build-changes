public class gsz extends gro<bwl, gyy> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gsn h;

   protected gsz(grp.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gyy a() {
      return new gyy();
   }

   public void a(bwl $$0, gyy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxo $$3 = $$0.m();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dW(), null, 0) : null;
   }

   public void a(gyy $$0, fgr $$1, glk $$2, int $$3) {
      hdm $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = bae.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gsl.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), bam.a());
         $$1.b();
      }
   }
}
