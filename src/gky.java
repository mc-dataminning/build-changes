public class gky implements gkh<dtx> {
   public gky(gki.a $$0) {
   }

   public void a(dtx $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      if (fja.Q().t.gH() || fja.Q().t.R_()) {
         jg $$6 = $$0.f();
         kk $$7 = $$0.j();
         if ($$7.u() >= 1 && $$7.v() >= 1 && $$7.w() >= 1) {
            if ($$0.v() == dwn.a || $$0.v() == dwn.b) {
               double $$8 = (double)$$6.u();
               double $$9 = (double)$$6.w();
               double $$10 = (double)$$6.v();
               double $$11 = $$10 + (double)$$7.v();
               double $$12;
               double $$13;
               switch ($$0.k()) {
                  case b:
                     $$12 = (double)$$7.u();
                     $$13 = (double)(-$$7.w());
                     break;
                  case c:
                     $$12 = (double)(-$$7.u());
                     $$13 = (double)$$7.w();
                     break;
                  default:
                     $$12 = (double)$$7.u();
                     $$13 = (double)$$7.w();
               }

               double $$30;
               double $$31;
               double $$32;
               double $$33;
               switch ($$0.t()) {
                  case b:
                     $$30 = $$13 < 0.0 ? $$8 : $$8 + 1.0;
                     $$31 = $$12 < 0.0 ? $$9 + 1.0 : $$9;
                     $$32 = $$30 - $$13;
                     $$33 = $$31 + $$12;
                     break;
                  case c:
                     $$30 = $$12 < 0.0 ? $$8 : $$8 + 1.0;
                     $$31 = $$13 < 0.0 ? $$9 : $$9 + 1.0;
                     $$32 = $$30 - $$12;
                     $$33 = $$31 - $$13;
                     break;
                  case d:
                     $$30 = $$13 < 0.0 ? $$8 + 1.0 : $$8;
                     $$31 = $$12 < 0.0 ? $$9 : $$9 + 1.0;
                     $$32 = $$30 + $$13;
                     $$33 = $$31 - $$12;
                     break;
                  default:
                     $$30 = $$12 < 0.0 ? $$8 + 1.0 : $$8;
                     $$31 = $$13 < 0.0 ? $$9 + 1.0 : $$9;
                     $$32 = $$30 + $$12;
                     $$33 = $$31 + $$13;
               }

               float $$34 = 1.0F;
               float $$35 = 0.9F;
               float $$36 = 0.5F;
               if ($$0.v() == dwn.a || $$0.F()) {
                  fdx $$37 = $$3.getBuffer(gig.y());
                  giq.a($$2, $$37, $$30, $$10, $$31, $$32, $$11, $$33, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
               }

               if ($$0.v() == dwn.a && $$0.E()) {
                  this.a($$0, $$3, $$2);
               }
            }
         }
      }
   }

   private void a(dtx $$0, ghw $$1, fdt $$2) {
      dea $$3 = $$0.i();
      fdx $$4 = $$1.getBuffer(gig.y());
      jg $$5 = $$0.aC_();
      jg $$6 = tu.c($$0);

      for (jg $$7 : jg.c($$6, $$6.a($$0.j()).b(-1, -1, -1))) {
         dvd $$8 = $$3.a_($$7);
         boolean $$9 = $$8.l();
         boolean $$10 = $$8.a(dia.kN);
         boolean $$11 = $$8.a(dia.hW);
         boolean $$12 = $$8.a(dia.hX);
         boolean $$13 = $$10 || $$11 || $$12;
         if ($$9 || $$13) {
            float $$14 = $$9 ? 0.05F : 0.0F;
            double $$15 = (double)((float)($$7.u() - $$5.u()) + 0.45F - $$14);
            double $$16 = (double)((float)($$7.v() - $$5.v()) + 0.45F - $$14);
            double $$17 = (double)((float)($$7.w() - $$5.w()) + 0.45F - $$14);
            double $$18 = (double)((float)($$7.u() - $$5.u()) + 0.55F + $$14);
            double $$19 = (double)((float)($$7.v() - $$5.v()) + 0.55F + $$14);
            double $$20 = (double)((float)($$7.w() - $$5.w()) + 0.55F + $$14);
            if ($$9) {
               giq.a($$2, $$4, $$15, $$16, $$17, $$18, $$19, $$20, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$10) {
               giq.a($$2, $$4, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$11) {
               giq.a($$2, $$4, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$12) {
               giq.a($$2, $$4, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   private void a(dtx $$0, fdx $$1, fdt $$2) {
      dea $$3 = $$0.i();
      if ($$3 != null) {
         jg $$4 = $$0.aC_();
         jg $$5 = tu.c($$0);
         kk $$6 = $$0.j();
         ezq $$7 = new ezk($$6.u(), $$6.v(), $$6.w());

         for (jg $$8 : jg.c($$5, $$5.a($$6).b(-1, -1, -1))) {
            if ($$3.a_($$8).a(dia.kN)) {
               $$7.c($$8.u() - $$5.u(), $$8.v() - $$5.v(), $$8.w() - $$5.w());
            }
         }

         $$7.a(($$4x, $$5x, $$6x, $$7x) -> {
            float $$8x = 0.48F;
            float $$9 = (float)($$5x + $$5.u() - $$4.u()) + 0.5F - 0.48F;
            float $$10 = (float)($$6x + $$5.v() - $$4.v()) + 0.5F - 0.48F;
            float $$11 = (float)($$7x + $$5.w() - $$4.w()) + 0.5F - 0.48F;
            float $$12 = (float)($$5x + $$5.u() - $$4.u()) + 0.5F + 0.48F;
            float $$13 = (float)($$6x + $$5.v() - $$4.v()) + 0.5F + 0.48F;
            float $$14 = (float)($$7x + $$5.w() - $$4.w()) + 0.5F + 0.48F;
            giq.a($$2, $$1, $$4x, $$9, $$10, $$11, $$12, $$13, $$14, 0.75F, 0.75F, 1.0F, 0.2F);
         });
      }
   }

   public boolean a(dtx $$0) {
      return true;
   }

   @Override
   public int aV_() {
      return 96;
   }
}
