public class gme extends gne<gci, fva<gci>> {
   public gme(gko<gci, fva<gci>> $$0) {
      super($$0);
   }

   public void a(ezt $$0, gdj $$1, int $$2, gci $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch() && $$3.a(cmt.a)) {
         gpu $$10 = $$3.b();
         if ($$10.c() != null) {
            cuk $$11 = $$3.a(bsw.e);
            if (!$$11.a(cun.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayu.d((double)$$6, $$3.ch, $$3.ck) - ayu.d((double)$$6, $$3.L, $$3.du());
               double $$13 = ayu.d((double)$$6, $$3.ci, $$3.cl) - ayu.d((double)$$6, $$3.M, $$3.dw());
               double $$14 = ayu.d((double)$$6, $$3.cj, $$3.cm) - ayu.d((double)$$6, $$3.N, $$3.dA());
               float $$15 = ayu.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)ayu.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayu.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayu.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayu.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayu.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayu.i($$6, $$3.ce, $$3.cf);
               $$18 += ayu.a(ayu.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.ca()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               ezx $$22 = $$1.getBuffer(gdr.c($$10.c()));
               this.c().b($$0, $$22, $$2, gol.d);
               $$0.b();
            }
         }
      }
   }
}
