public class grs<T extends dwn & dwq> implements grp<T> {
   public grs(grq.a $$0) {
   }

   @Override
   public void a(T $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      if (fof.Q().t.gF() || fof.Q().t.U_()) {
         dwq.a $$6 = $$0.b();
         if ($$6 != dwq.a.a) {
            dwq.b $$7 = $$0.c();
            iu $$8 = $$7.a();
            jz $$9 = $$7.b();
            if ($$9.u() >= 1 && $$9.v() >= 1 && $$9.w() >= 1) {
               float $$10 = 1.0F;
               float $$11 = 0.9F;
               float $$12 = 0.5F;
               fiu $$13 = $$3.getBuffer(gpn.y());
               iu $$14 = $$8.a($$9);
               gpx.a(
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
               if ($$6 == dwq.a.c && $$0.i() != null) {
                  this.a($$0, $$0.i(), $$8, $$9, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(T $$0, dhv $$1, iu $$2, jz $$3, gpd $$4, fiq $$5) {
      fiu $$6 = $$4.getBuffer(gpn.y());
      iu $$7 = $$0.aw_();
      iu $$8 = $$7.a((jz)$$2);

      for (iu $$9 : iu.c($$8, $$8.a($$3).b(-1, -1, -1))) {
         dzo $$10 = $$1.a_($$9);
         boolean $$11 = $$10.l();
         boolean $$12 = $$10.a(dlw.lp);
         boolean $$13 = $$10.a(dlw.iu);
         boolean $$14 = $$10.a(dlw.iv);
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
               gpx.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$12) {
               gpx.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$13) {
               gpx.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$14) {
               gpx.a($$5, $$6, $$17, $$18, $$19, $$20, $$21, $$22, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(T $$0, iu $$1, jz $$2, fiu $$3, fiq $$4) {
      dhv $$5 = $$0.i();
      if ($$5 != null) {
         iu $$6 = $$0.aw_();
         fef $$7 = new fdz($$2.u(), $$2.v(), $$2.w());

         for (iu $$8 : iu.c($$1, $$1.a($$2).b(-1, -1, -1))) {
            if ($$5.a_($$8).a(dlw.lp)) {
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
            gpx.a($$4, $$3, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
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
