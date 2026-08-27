public class fwk extends fxk<fmy, fgd<fmy>> {
   public fwk(fux<fmy, fgd<fmy>> $$0) {
      super($$0);
   }

   public void a(elk $$0, fnz $$1, int $$2, fmy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd() && $$3.a(cbq.a)) {
         fzz $$10 = $$3.b();
         if ($$10.c() != null) {
            cja $$11 = $$3.c(biq.e);
            if (!$$11.a(cjd.nh)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ars.d((double)$$6, $$3.bW, $$3.bZ) - ars.d((double)$$6, $$3.K, $$3.dp());
               double $$13 = ars.d((double)$$6, $$3.bX, $$3.ca) - ars.d((double)$$6, $$3.L, $$3.dr());
               double $$14 = ars.d((double)$$6, $$3.bY, $$3.cb) - ars.d((double)$$6, $$3.M, $$3.dv());
               float $$15 = ars.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)ars.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ars.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ars.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ars.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ars.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ars.i($$6, $$3.bT, $$3.bU);
               $$18 += ars.a(ars.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bW()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               elo $$22 = $$1.getBuffer(foh.c($$10.c()));
               this.c().b($$0, $$22, $$2, fyq.d);
               $$0.b();
            }
         }
      }
   }
}
