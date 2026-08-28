public class gmy extends gny<gdc, fvt<gdc>> {
   public gmy(gli<gdc, fvt<gdc>> $$0) {
      super($$0);
   }

   public void a(fam $$0, ged $$1, int $$2, gdc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci() && $$3.a(cml.a)) {
         gqo $$10 = $$3.b();
         if ($$10.c() != null) {
            cuc $$11 = $$3.a(bsn.e);
            if (!$$11.a(cuf.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayg.d((double)$$6, $$3.cj, $$3.cm) - ayg.d((double)$$6, $$3.L, $$3.dv());
               double $$13 = ayg.d((double)$$6, $$3.ck, $$3.cn) - ayg.d((double)$$6, $$3.M, $$3.dx());
               double $$14 = ayg.d((double)$$6, $$3.cl, $$3.co) - ayg.d((double)$$6, $$3.N, $$3.dB());
               float $$15 = ayg.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)ayg.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayg.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayg.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayg.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayg.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayg.i($$6, $$3.cg, $$3.ch);
               $$18 += ayg.a(ayg.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.cb()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               faq $$22 = $$1.getBuffer(gel.c($$10.c()));
               this.c().b($$0, $$22, $$2, gpf.d);
               $$0.b();
            }
         }
      }
   }
}
