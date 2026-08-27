public class glf extends gmf<gbj, fub<gbj>> {
   public glf(gjp<gbj, fub<gbj>> $$0) {
      super($$0);
   }

   public void a(eys $$0, gck $$1, int $$2, gbj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch() && $$3.a(clx.a)) {
         gov $$10 = $$3.b();
         if ($$10.c() != null) {
            cto $$11 = $$3.a(bsb.e);
            if (!$$11.a(ctr.nT)) {
               $$0.a();
               $$0.a(0.0F, 0.0F, 0.125F);
               double $$12 = ayd.d((double)$$6, $$3.ci, $$3.cl) - ayd.d((double)$$6, $$3.L, $$3.du());
               double $$13 = ayd.d((double)$$6, $$3.cj, $$3.cm) - ayd.d((double)$$6, $$3.M, $$3.dw());
               double $$14 = ayd.d((double)$$6, $$3.ck, $$3.cn) - ayd.d((double)$$6, $$3.N, $$3.dA());
               float $$15 = ayd.j($$6, $$3.ba, $$3.aZ);
               double $$16 = (double)ayd.a($$15 * (float) (Math.PI / 180.0));
               double $$17 = (double)(-ayd.b($$15 * (float) (Math.PI / 180.0)));
               float $$18 = (float)$$13 * 10.0F;
               $$18 = ayd.a($$18, -6.0F, 32.0F);
               float $$19 = (float)($$12 * $$16 + $$14 * $$17) * 100.0F;
               $$19 = ayd.a($$19, 0.0F, 150.0F);
               float $$20 = (float)($$12 * $$17 - $$14 * $$16) * 100.0F;
               $$20 = ayd.a($$20, -20.0F, 20.0F);
               if ($$19 < 0.0F) {
                  $$19 = 0.0F;
               }

               float $$21 = ayd.i($$6, $$3.cf, $$3.cg);
               $$18 += ayd.a(ayd.i($$6, $$3.Y, $$3.Z) * 6.0F) * 32.0F * $$21;
               if ($$3.ca()) {
                  $$18 += 25.0F;
               }

               $$0.a(a.b.rotationDegrees(6.0F + $$19 / 2.0F + $$18));
               $$0.a(a.f.rotationDegrees($$20 / 2.0F));
               $$0.a(a.d.rotationDegrees(180.0F - $$20 / 2.0F));
               eyw $$22 = $$1.getBuffer(gcs.c($$10.c()));
               this.c().b($$0, $$22, $$2, gnm.d);
               $$0.b();
            }
         }
      }
   }
}
