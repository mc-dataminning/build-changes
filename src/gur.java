public class gur implements gua<eag> {
   private final gxt a;

   public gur(gub.a $$0) {
      this.a = $$0.c();
   }

   public void a(eag $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      dkj $$7 = $$0.i();
      if ($$7 != null) {
         djj $$8 = $$0.c();
         bxe $$9 = $$8.b($$7, $$0.aC_());
         if ($$9 != null) {
            a($$1, $$2, $$3, $$4, $$9, this.a, $$8.b(), $$8.a());
         }
      }
   }

   public static void a(float $$0, fld $$1, grn $$2, int $$3, bxe $$4, gxt $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dq(), $$4.dr());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azz.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
