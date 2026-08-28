public class gsy extends grn<bwl, gyx> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gsm h;

   protected gsy(gro.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gyx a() {
      return new gyx();
   }

   public void a(bwl $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxo $$3 = $$0.m();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dV(), null, 0) : null;
   }

   public void a(gyx $$0, fgq $$1, glj $$2, int $$3) {
      hdl $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = bae.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gsk.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), bam.a());
         $$1.b();
      }
   }
}
