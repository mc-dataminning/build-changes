public class gkm implements gjw<dtl> {
   private final gnm a;

   public gkm(gjx.a $$0) {
      this.a = $$0.c();
   }

   public void a(dtl $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      dej $$6 = $$0.i();
      if ($$6 != null) {
         ddk $$7 = $$0.c();
         btr $$8 = $$7.b($$6, $$0.aC_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, fdi $$1, ghl $$2, int $$3, btr $$4, gnm $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dn(), $$4.do());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azf.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
