public class ggm extends ghm<fwr, fpk<fwr>> {
   public ggm(gew<fwr, fpk<fwr>> $$0) {
      super($$0);
   }

   public void a(eub $$0, fxs $$1, int $$2, fwr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(civ.a)) {
         gkb $$10 = $$3.b();
         if ($$10.c() != null) {
            cqm $$11 = $$3.d(bpe.e);
            if (!$$11.a(cqp.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = aww.d((double)$$6, $$3.cf, $$3.ci) - aww.d((double)$$6, $$3.K, $$3.dr());
               double $$13 = aww.d((double)$$6, $$3.cg, $$3.cj) - aww.d((double)$$6, $$3.L, $$3.dt());
               double $$14 = aww.d((double)$$6, $$3.ch, $$3.ck) - aww.d((double)$$6, $$3.M, $$3.dx());
               float $$15 = aww.j($$6, $$3.aY, $$3.aX);
               double $$16 = (double)aww.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-aww.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = aww.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = aww.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = aww.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = aww.i($$6, $$3.cc, $$3.cd);
               $$18 += aww.a(aww.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               euf $$22 = $$1.getBuffer(fya.c($$10.c()));
               this.c().b($$0, $$22, $$2, git.d);
               $$0.b();
            }
         }
      }
   }
}
