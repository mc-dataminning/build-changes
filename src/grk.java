public class grk extends grf<gts, fza> {
   private final ghu a;
   private final gnq b;

   public grk(goo<gts, fza> $$0, ghu $$1, gnq $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   public void a(fcu $$0, ggv $$1, int $$2, gts $$3, float $$4, float $$5) {
      gym $$6 = $$3.an;
      if ($$6 != null) {
         boolean $$7 = $$3.aj && $$3.u;
         if (!$$3.u || $$7) {
            $$0.a();
            this.d().c().a($$0);
            float $$8 = 0.625F;
            $$0.a(0.0F, -0.34375F, 0.0F);
            $$0.a(a.d.rotationDegrees(180.0F));
            $$0.b(0.625F, -0.625F, -0.625F);
            cvl $$9 = $$3.ao;
            if ($$7 && $$9.h() instanceof ctl $$10) {
               dua $$11 = $$10.d().o();
               gym $$12 = this.a.a($$11);
               int $$13 = gnt.a($$3, 0.0F);
               $$0.a(-0.5F, -0.5F, -0.5F);
               this.a.b().a($$0.c(), $$1.getBuffer(ghe.s(gwj.d)), $$11, $$12, 0.0F, 0.0F, 0.0F, $$2, $$13);
            } else {
               this.b.a($$9, cvi.f, false, $$0, $$1, $$2, gnt.a($$3, 0.0F), $$6);
            }

            $$0.b();
         }
      }
   }
}
