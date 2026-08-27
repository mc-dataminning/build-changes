public class fwj implements fvt<diq> {
   private final fyy a;

   public fwj(fvu.a $$0) {
      this.a = $$0.c();
   }

   public void a(diq $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      ctx $$6 = $$0.i();
      if ($$6 != null) {
         csz $$7 = $$0.d();
         blw $$8 = $$7.b($$6, $$0.aE_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, eqk $$1, ftt $$2, int $$3, blw $$4, fyy $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dg(), $$4.dh());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)aup.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, 0.0F, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
