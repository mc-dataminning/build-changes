public class glf extends gmf<gbj, fub<gbj>> {
   public glf(gjp<gbj, fub<gbj>> $$0) {
      super($$0);
   }

   public void a(eyu $$0, gck $$1, int $$2, gbj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch() && $$3.a(clz.a)) {
         gov $$10 = $$3.b();
         if ($$10.c() != null) {
            ctq $$11 = $$3.a(bsd.e);
            if (!$$11.a(ctt.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayf.d((double)$$6, $$3.ch, $$3.ck) - ayf.d((double)$$6, $$3.L, $$3.du());
               double $$13 = ayf.d((double)$$6, $$3.ci, $$3.cl) - ayf.d((double)$$6, $$3.M, $$3.dw());
               double $$14 = ayf.d((double)$$6, $$3.cj, $$3.cm) - ayf.d((double)$$6, $$3.N, $$3.dA());
               float $$15 = ayf.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)ayf.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayf.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayf.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayf.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayf.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayf.i($$6, $$3.ce, $$3.cf);
               $$18 += ayf.a(ayf.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.ca()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eyy $$22 = $$1.getBuffer(gcs.c($$10.c()));
               this.c().b($$0, $$22, $$2, gnm.d);
               $$0.b();
            }
         }
      }
   }
}
