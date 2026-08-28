public class gqn<T extends dvl & dvo> implements gqk<T> {
   public gqn(gql.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      if (fnd.Q().t.gF() || fnd.Q().t.U_()) {
         dvo.a $$6 = $$0.b();
         if ($$6 != dvo.a.a) {
            dvo.b $$7 = $$0.c();
            jj $$8 = $$7.a();
            kn $$9 = $$7.b();
            if ($$9.u() >= 1 && $$9.v() >= 1 && $$9.w() >= 1) {
               float $$10 = 1.0F;
               float $$11 = 0.9F;
               float $$12 = 0.5F;
               fhs $$13 = $$3.getBuffer(goi.y());
               jj $$14 = $$8.a($$9);
               gos.a(
                  $$2,
                  $$13,
                  (double)$$8.u(),
                  (double)$$8.v(),
                  (double)$$8.w(),
                  (double)$$14.u(),
                  (double)$$14.v(),
                  (double)$$14.w(),
                  0.9F,
                  0.9F,
                  0.9F,
                  1.0F,
                  0.5F,
                  0.5F,
                  0.5F
               );
               if ($$6 == dvo.a.c && $$0.i() != null) {
                  this.a($$0, $$0.i(), $$8, $$9, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(T $$0, dgv $$1, jj $$2, kn $$3, gny $$4, fho $$5) {
      fhs $$6 = $$4.getBuffer(goi.y());
      jj $$7 = $$0.aw_();
      jj $$8 = $$7.a((kn)$$2);

      for (jj $$9 : jj.c($$8, $$8.a($$3).b(-1, -1, -1))) {
         dym $$10 = $$1.a_($$9);
         boolean $$11 = $$10.l();
         boolean $$12 = $$10.a(dkw.lp);
         boolean $$13 = $$10.a(dkw.iu);
         boolean $$14 = $$10.a(dkw.iv);
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
               gos.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$12) {
               gos.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$13) {
               gos.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$14) {
               gos.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(T $$0, jj $$1, kn $$2, fhs $$3, fho $$4) {
      dgv $$5 = $$0.i();
      if ($$5 != null) {
         jj $$6 = $$0.aw_();
         fdd $$7 = new fcx($$2.u(), $$2.v(), $$2.w());

         for (jj $$8 : jj.c($$1, $$1.a($$2).b(-1, -1, -1))) {
            if ($$5.a_($$8).a(dkw.lp)) {
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
            gos.a($$4, $$3, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
         });
      }
   }

   @Override
   public boolean a(T $$0) {
      return true;
   }

   @Override
   public int aQ_() {
      return 96;
   }
}
