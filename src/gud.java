public class gud<T extends dyo & dyr> implements gua<T> {
   public gud(gub.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      if (fqq.Q().t.gG() || fqq.Q().t.aa_()) {
         dyr.a $$7 = $$0.b();
         if ($$7 != dyr.a.a) {
            dyr.b $$8 = $$0.c();
            iw $$9 = $$8.a();
            kb $$10 = $$8.b();
            if ($$10.u() >= 1 && $$10.v() >= 1 && $$10.w() >= 1) {
               float $$11 = 1.0F;
               float $$12 = 0.9F;
               float $$13 = 0.5F;
               flg $$14 = $$3.getBuffer(gry.w());
               iw $$15 = $$9.a($$10);
               gsg.a(
                  $$2,
                  $$14,
                  (double)$$9.u(),
                  (double)$$9.v(),
                  (double)$$9.w(),
                  (double)$$15.u(),
                  (double)$$15.v(),
                  (double)$$15.w(),
                  0.9F,
                  0.9F,
                  0.9F,
                  1.0F,
                  0.5F,
                  0.5F,
                  0.5F
               );
               if ($$7 == dyr.a.c && $$0.i() != null) {
                  this.a($$0, $$0.i(), $$9, $$10, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(T $$0, djn $$1, iw $$2, kb $$3, grn $$4, fld $$5) {
      flg $$6 = $$4.getBuffer(gry.w());
      iw $$7 = $$0.aC_();
      iw $$8 = $$7.a((kb)$$2);

      for (iw $$9 : iw.c($$8, $$8.a($$3).b(-1, -1, -1))) {
         ebq $$10 = $$1.a_($$9);
         boolean $$11 = $$10.l();
         boolean $$12 = $$10.a(dnq.lt);
         boolean $$13 = $$10.a(dnq.iy);
         boolean $$14 = $$10.a(dnq.iz);
         boolean $$15 = $$12 || $$13 || $$14;
         if ($$11 || $$15) {
            float $$16 = $$11 ? 0.05F : 0.0F;
            double $$17 = (double)((float)($$9.u() - $$7.u()) + 0.45F - $$16);
            double $$18 = (double)((float)($$9.v() - $$7.v()) + 0.45F - $$16);
            double $$19 = (double)((float)($$9.w() - $$7.w()) + 0.45F - $$16);
            double $$20 = (double)((float)($$9.u() - $$7.u()) + 0.55F + $$16);
            double $$21 = (double)((float)($$9.v() - $$7.v()) + 0.55F + $$16);
            double $$22 = (double)((float)($$9.w() - $$7.w()) + 0.55F + $$16);
            if ($$11) {
               gsg.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$12) {
               gsg.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$13) {
               gsg.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$14) {
               gsg.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(T $$0, iw $$1, kb $$2, flg $$3, fld $$4) {
      djn $$5 = $$0.i();
      if ($$5 != null) {
         iw $$6 = $$0.aC_();
         fgl $$7 = new fgf($$2.u(), $$2.v(), $$2.w());

         for (iw $$8 : iw.c($$1, $$1.a($$2).b(-1, -1, -1))) {
            if ($$5.a_($$8).a(dnq.lt)) {
               $$7.c($$8.u() - $$1.u(), $$8.v() - $$1.v(), $$8.w() - $$1.w());
            }
         }

         $$7.a(($$4x, $$5x, $$6x, $$7x) -> {
            float $$8x = 0.48F;
            float $$9 = (float)($$5x + $$1.u() - $$6.u()) + 0.5F - 0.48F;
            float $$10 = (float)($$6x + $$1.v() - $$6.v()) + 0.5F - 0.48F;
            float $$11 = (float)($$7x + $$1.w() - $$6.w()) + 0.5F - 0.48F;
            float $$12 = (float)($$5x + $$1.u() - $$6.u()) + 0.5F + 0.48F;
            float $$13 = (float)($$6x + $$1.v() - $$6.v()) + 0.5F + 0.48F;
            float $$14 = (float)($$7x + $$1.w() - $$6.w()) + 0.5F + 0.48F;
            gsg.a($$4, $$3, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
         });
      }
   }

   @Override
   public boolean a(T $$0) {
      return true;
   }

   @Override
   public int aW_() {
      return 96;
   }
}
