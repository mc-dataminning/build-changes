public class gjy extends gky<gad, fsw<gad>> {
   public gjy(gii<gad, fsw<gad>> $$0) {
      super($$0);
   }

   public void a(exn $$0, gbe $$1, int $$2, gad $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf() && $$3.a(ckm.a)) {
         gnn $$10 = $$3.b();
         if ($$10.c() != null) {
            csd $$11 = $$3.d(bqs.e);
            if (!$$11.a(csg.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = axw.d((double)$$6, $$3.ci, $$3.cl) - axw.d((double)$$6, $$3.L, $$3.ds());
               double $$13 = axw.d((double)$$6, $$3.cj, $$3.cm) - axw.d((double)$$6, $$3.M, $$3.du());
               double $$14 = axw.d((double)$$6, $$3.ck, $$3.cn) - axw.d((double)$$6, $$3.N, $$3.dy());
               float $$15 = axw.j($$6, $$3.ba, $$3.aZ);
               double $$16 = (double)axw.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-axw.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = axw.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = axw.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = axw.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = axw.i($$6, $$3.cf, $$3.cg);
               $$18 += axw.a(axw.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.bY()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               exr $$22 = $$1.getBuffer(gbm.c($$10.c()));
               this.c().b($$0, $$22, $$2, gmf.d);
               $$0.b();
            }
         }
      }
   }
}
