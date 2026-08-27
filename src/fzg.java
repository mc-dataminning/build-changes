public class fzg implements fyq<dky> {
   private final gbw a;

   public fzg(fyr.a $$0) {
      this.a = $$0.c();
   }

   public void a(dky $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      cwe $$6 = $$0.i();
      if ($$6 != null) {
         cvg $$7 = $$0.c();
         bof $$8 = $$7.b($$6, $$0.aD_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, etd $$1, fwq $$2, int $$3, bof $$4, gbw $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dd(), $$4.de());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)awm.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, 0.0F, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
