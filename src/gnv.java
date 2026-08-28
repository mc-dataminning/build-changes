public class gnv extends gov<gdy, fwp<gdy>> {
   public gnv(gmf<gdy, fwp<gdy>> $$0) {
      super($$0);
   }

   public void a(fbi $$0, gez $$1, int $$2, gdy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci() && $$3.a(cmy.a)) {
         grl $$10 = $$3.b();
         if ($$10.c() != null) {
            cuq $$11 = $$3.a(bsy.e);
            if (!$$11.a(cut.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayo.d((double)$$6, $$3.cj, $$3.cm) - ayo.d((double)$$6, $$3.L, $$3.dt());
               double $$13 = ayo.d((double)$$6, $$3.ck, $$3.cn) - ayo.d((double)$$6, $$3.M, $$3.dv());
               double $$14 = ayo.d((double)$$6, $$3.cl, $$3.co) - ayo.d((double)$$6, $$3.N, $$3.dz());
               float $$15 = ayo.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)ayo.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayo.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayo.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayo.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayo.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayo.i($$6, $$3.cg, $$3.ch);
               $$18 += ayo.a(ayo.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.cb()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               fbm $$22 = $$1.getBuffer(gfh.c($$10.c()));
               this.c().c($$0, $$22, $$2, gqc.d);
               $$0.b();
            }
         }
      }
   }
}
