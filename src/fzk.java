public class fzk extends gak<fpy, fiz<fpy>> {
   public fzk(fxx<fpy, fiz<fpy>> $$0) {
      super($$0);
   }

   public void a(eob $$0, fqz $$1, int $$2, fpy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce() && $$3.a(cea.a)) {
         gcz $$10 = $$3.b();
         if ($$10.c() != null) {
            clo $$11 = $$3.c(bla.e);
            if (!$$11.a(clr.nS)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = atq.d((double)$$6, $$3.bY, $$3.cb) - atq.d((double)$$6, $$3.K, $$3.ds());
               double $$13 = atq.d((double)$$6, $$3.bZ, $$3.cc) - atq.d((double)$$6, $$3.L, $$3.du());
               double $$14 = atq.d((double)$$6, $$3.ca, $$3.cd) - atq.d((double)$$6, $$3.M, $$3.dy());
               float $$15 = atq.j($$6, $$3.aV, $$3.aU);
               double $$16 = (double)atq.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-atq.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = atq.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = atq.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = atq.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = atq.i($$6, $$3.bV, $$3.bW);
               $$18 += atq.a(atq.i($$6, $$3.X, $$3.Y) * 6.0F) * 32.0F * $$21;
               if ($$3.bX()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eof $$22 = $$1.getBuffer(frh.c($$10.c()));
               this.c().b($$0, $$22, $$2, gbq.d);
               $$0.b();
            }
         }
      }
   }
}
