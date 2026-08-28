public class gxr extends gwg<bxk, hdi> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hfo h;
   private final azv i = azv.a();

   protected gxr(gwh.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hdi a() {
      return new hdi();
   }

   public void a(bxk $$0, hdi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      czd $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hdi $$0, fjj $$1, gqa $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azm.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gxd.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
