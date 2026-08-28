public class guq<T extends dyc & dyf> implements gun<T> {
   public guq(guo.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      if (frd.Q().t.gG() || frd.Q().t.Z_()) {
         dyf.a $$7 = $$0.b();
         if ($$7 != dyf.a.a) {
            dyf.b $$8 = $$0.c();
            iv $$9 = $$8.a();
            ka $$10 = $$8.b();
            if ($$10.u() >= 1 && $$10.v() >= 1 && $$10.w() >= 1) {
               float $$11 = 1.0F;
               float $$12 = 0.9F;
               float $$13 = 0.5F;
               flr $$14 = $$3.getBuffer(gsl.w());
               iv $$15 = $$9.a($$10);
               gst.a(
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
               if ($$7 == dyf.a.c && $$0.i() != null) {
                  this.a($$0, $$0.i(), $$9, $$10, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(T $$0, djb $$1, iv $$2, ka $$3, gsa $$4, flo $$5) {
      flr $$6 = $$4.getBuffer(gsl.w());
      iv $$7 = $$0.aB_();
      iv $$8 = $$7.a((ka)$$2);

      for (iv $$9 : iv.c($$8, $$8.a($$3).b(-1, -1, -1))) {
         ebe $$10 = $$1.a_($$9);
         boolean $$11 = $$10.l();
         boolean $$12 = $$10.a(dne.lt);
         boolean $$13 = $$10.a(dne.iy);
         boolean $$14 = $$10.a(dne.iz);
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
               gst.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$12) {
               gst.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$13) {
               gst.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$14) {
               gst.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(T $$0, iv $$1, ka $$2, flr $$3, flo $$4) {
      djb $$5 = $$0.i();
      if ($$5 != null) {
         iv $$6 = $$0.aB_();
         ffz $$7 = new fft($$2.u(), $$2.v(), $$2.w());

         for (iv $$8 : iv.c($$1, $$1.a($$2).b(-1, -1, -1))) {
            if ($$5.a_($$8).a(dne.lt)) {
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
            gst.a($$4, $$3, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
         });
      }
   }

   @Override
   public boolean a(T $$0) {
      return true;
   }

   @Override
   public int aV_() {
      return 96;
   }
}
