public class gsv implements gse<dyp> {
   private final gvx a;

   public gsv(gsf.a $$0) {
      this.a = $$0.c();
   }

   public void a(dyp $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      div $$7 = $$0.i();
      if ($$7 != null) {
         dhx $$8 = $$0.c();
         bwd $$9 = $$8.b($$7, $$0.aw_());
         if ($$9 != null) {
            a($$1, $$2, $$3, $$4, $$9, this.a, $$8.b(), $$8.a());
         }
      }
   }

   public static void a(float $$0, fjc $$1, gps $$2, int $$3, bwd $$4, gvx $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dq(), $$4.dr());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azm.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
