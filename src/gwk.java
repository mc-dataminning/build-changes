public class gwk extends gwf<gyt, gdm> {
   private final gmo a;
   private final gso b;

   public gwk(gtn<gyt, gdm> $$0, gmo $$1, gso $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fgs $$0, gll $$1, int $$2, gyt $$3, float $$4, float $$5) {
      hdn $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().b().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cxp $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof cvv $$10) {
               dxv $$11 = $$10.d().m();
               hdn $$12 = this.a.a($$11);
               int $$13 = gsr.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(glv.s(hbk.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cxn.f, false, $$0, $$1, $$2, gsr.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
