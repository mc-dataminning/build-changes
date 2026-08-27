public class gee extends gfe<ful, fng<ful>> {
   public gee(gco<ful, fng<ful>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvm $$1, int $$2, ful $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(chi.a)) {
         ght $$10 = $$3.b();
         if ($$10.c() != null) {
            coz $$11 = $$3.c(bnv.e);
            if (!$$11.a(cpc.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = awh.d((double)$$6, $$3.cc, $$3.cf) - awh.d((double)$$6, $$3.J, $$3.dr());
               double $$13 = awh.d((double)$$6, $$3.cd, $$3.cg) - awh.d((double)$$6, $$3.K, $$3.dt());
               double $$14 = awh.d((double)$$6, $$3.ce, $$3.ch) - awh.d((double)$$6, $$3.L, $$3.dx());
               float $$15 = awh.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)awh.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-awh.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = awh.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = awh.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = awh.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = awh.i($$6, $$3.bZ, $$3.ca);
               $$18 += awh.a(awh.i($$6, $$3.W, $$3.X) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               ese $$22 = $$1.getBuffer(fvu.c($$10.c()));
               this.c().b($$0, $$22, $$2, ggl.d);
               $$0.b();
            }
         }
      }
   }
}
