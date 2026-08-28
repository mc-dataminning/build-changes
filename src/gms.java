public class gms extends gns<gcw, fvn<gcw>> {
   public gms(glc<gcw, fvn<gcw>> $$0) {
      super($$0);
   }

   public void a(fag $$0, gdx $$1, int $$2, gcw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch() && $$3.a(cmi.a)) {
         gqi $$10 = $$3.b();
         if ($$10.c() != null) {
            cua $$11 = $$3.a(bsk.e);
            if (!$$11.a(cud.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = aye.d((double)$$6, $$3.cj, $$3.cm) - aye.d((double)$$6, $$3.L, $$3.du());
               double $$13 = aye.d((double)$$6, $$3.ck, $$3.cn) - aye.d((double)$$6, $$3.M, $$3.dw());
               double $$14 = aye.d((double)$$6, $$3.cl, $$3.co) - aye.d((double)$$6, $$3.N, $$3.dA());
               float $$15 = aye.j($$6, $$3.aZ, $$3.aY);
               double $$16 = (double)aye.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-aye.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = aye.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = aye.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = aye.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = aye.i($$6, $$3.cg, $$3.ch);
               $$18 += aye.a(aye.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.ca()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               fak $$22 = $$1.getBuffer(gef.c($$10.c()));
               this.c().b($$0, $$22, $$2, goz.d);
               $$0.b();
            }
         }
      }
   }
}
