public class fvq implements fuz<dic> {
   public fvq(fva.a $$0) {
   }

   public void a(dic $$0, float $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      if (eva.N().s.gp() || eva.N().s.P_()) {
         hx $$6 = $$0.g();
         jb $$7 = $$0.k();
         if ($$7.u() >= 1 && $$7.v() >= 1 && $$7.w() >= 1) {
            if ($$0.x() == dkk.a || $$0.x() == dkk.b) {
               double $$8 = (double)$$6.u();
               double $$9 = (double)$$6.w();
               double $$10 = (double)$$6.v();
               double $$11 = $$10 + (double)$$7.v();
               double $$12;
               double $$13;
               switch ($$0.l()) {
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
               switch ($$0.m()) {
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
               epx $$37 = $$3.getBuffer(fth.w());
               if ($$0.x() == dkk.a || $$0.H()) {
                  fsx.a($$2, $$37, $$30, $$10, $$31, $$32, $$11, $$33, 0.9F, 0.9F, 0.9F, 1.0F, 0.5F, 0.5F, 0.5F);
               }

               if ($$0.x() == dkk.a && $$0.G()) {
                  this.a($$0, $$37, $$6, $$2);
               }
            }
         }
      }
   }

   private void a(dic $$0, epx $$1, hx $$2, ept $$3) {
      cso $$4 = $$0.i();
      hx $$5 = $$0.aB_();
      hx $$6 = $$5.a((jb)$$2);

      for (hx $$7 : hx.a($$6, $$6.a($$0.k()).b(-1, -1, -1))) {
         dja $$8 = $$4.a_($$7);
         boolean $$9 = $$8.i();
         boolean $$10 = $$8.a(cwl.kN);
         boolean $$11 = $$8.a(cwl.hW);
         boolean $$12 = $$8.a(cwl.hX);
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
               fsx.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 0.5F, 0.5F, 1.0F, 1.0F, 0.5F, 0.5F, 1.0F);
            } else if ($$10) {
               fsx.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 0.75F, 0.75F, 1.0F, 1.0F, 0.75F, 0.75F);
            } else if ($$11) {
               fsx.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
            } else if ($$12) {
               fsx.a($$3, $$1, $$15, $$16, $$17, $$18, $$19, $$20, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F);
            }
         }
      }
   }

   public boolean a(dic $$0) {
      return true;
   }

   @Override
   public int aQ_() {
      return 96;
   }
}
