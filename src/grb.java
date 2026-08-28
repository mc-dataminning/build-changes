public class grb implements gqk<dxd> {
   private final gud a;

   public grb(gql.a $$0) {
      this.a = $$0.c();
   }

   public void a(dxd $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dhp $$6 = $$0.i();
      if ($$6 != null) {
         dgr $$7 = $$0.c();
         bvs $$8 = $$7.b($$6, $$0.aw_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, fho $$1, gny $$2, int $$3, bvs $$4, gud $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dq(), $$4.dr());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azk.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
