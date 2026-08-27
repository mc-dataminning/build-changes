public class gfj extends ggj<fvp, foj<fvp>> {
   public gfj(gdt<fvp, foj<fvp>> $$0) {
      super($$0);
   }

   public void a(etd $$0, fwq $$1, int $$2, fvp $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb() && $$3.a(cib.a)) {
         giy $$10 = $$3.b();
         if ($$10.c() != null) {
            cpq $$11 = $$3.c(bom.e);
            if (!$$11.a(cpt.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = awm.d((double)$$6, $$3.cd, $$3.cg) - awm.d((double)$$6, $$3.J, $$3.do());
               double $$13 = awm.d((double)$$6, $$3.ce, $$3.ch) - awm.d((double)$$6, $$3.K, $$3.dq());
               double $$14 = awm.d((double)$$6, $$3.cf, $$3.ci) - awm.d((double)$$6, $$3.L, $$3.du());
               float $$15 = awm.j($$6, $$3.aW, $$3.aV);
               double $$16 = (double)awm.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-awm.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = awm.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = awm.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = awm.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = awm.i($$6, $$3.ca, $$3.cb);
               $$18 += awm.a(awm.i($$6, $$3.W, $$3.X) * 6.0F) * 32.0F * $$21;
               if ($$3.bU()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eth $$22 = $$1.getBuffer(fwy.c($$10.c()));
               this.c().b($$0, $$22, $$2, ghq.d);
               $$0.b();
            }
         }
      }
   }
}
