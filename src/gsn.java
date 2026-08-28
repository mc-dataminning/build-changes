import java.util.ArrayList;
import java.util.List;

public class gsn {
   private static final int a = 10;
   private static final int b = 21;
   private static final alr c = alr.b("textures/environment/rain.png");
   private static final alr d = alr.b("textures/environment/snow.png");
   private static final int e = 32;
   private static final int f = 16;
   private int g;
   private final float[] h = new float[1024];
   private final float[] i = new float[1024];

   public gsn() {
      for (int $$0 = 0; $$0 < 32; $$0++) {
         for (int $$1 = 0; $$1 < 32; $$1++) {
            float $$2 = (float)($$1 - 16);
            float $$3 = (float)($$0 - 16);
            float $$4 = azz.f($$2, $$3);
            this.h[$$0 * 32 + $$1] = -$$3 / $$4;
            this.i[$$0 * 32 + $$1] = $$2 / $$4;
         }
      }
   }

   public void a(dkj $$0, grn $$1, int $$2, float $$3, fgc $$4) {
      float $$5 = $$0.d($$3);
      if (!($$5 <= 0.0F)) {
         int $$6 = fqq.N() ? 10 : 5;
         List<gsn.a> $$7 = new ArrayList<>();
         List<gsn.a> $$8 = new ArrayList<>();
         this.a($$0, $$2, $$3, $$4, $$6, $$7, $$8);
         if (!$$7.isEmpty() || !$$8.isEmpty()) {
            this.a($$1, $$4, $$6, $$5, $$7, $$8);
         }
      }
   }

   private void a(dkj $$0, int $$1, float $$2, fgc $$3, int $$4, List<gsn.a> $$5, List<gsn.a> $$6) {
      int $$7 = azz.a($$3.d);
      int $$8 = azz.a($$3.e);
      int $$9 = azz.a($$3.f);
      iw.a $$10 = new iw.a();
      bai $$11 = bai.a();

      for (int $$12 = $$9 - $$4; $$12 <= $$9 + $$4; $$12++) {
         for (int $$13 = $$7 - $$4; $$13 <= $$7 + $$4; $$13++) {
            int $$14 = $$0.a(ehp.a.e, $$13, $$12);
            int $$15 = Math.max($$8 - $$4, $$14);
            int $$16 = Math.max($$8 + $$4, $$14);
            if ($$16 - $$15 != 0) {
               dlm.c $$17 = this.a($$0, $$10.d($$13, $$8, $$12));
               if ($$17 != dlm.c.a) {
                  int $$18 = $$13 * $$13 * 3121 + $$13 * 45238971 ^ $$12 * $$12 * 418711 + $$12 * 13761;
                  $$11.b((long)$$18);
                  int $$19 = Math.max($$8, $$14);
                  int $$20 = gri.a($$0, $$10.d($$13, $$19, $$12));
                  if ($$17 == dlm.c.b) {
                     $$5.add(this.a($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  } else if ($$17 == dlm.c.c) {
                     $$6.add(this.b($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  }
               }
            }
         }
      }
   }

   private void a(grn $$0, fgc $$1, int $$2, float $$3, List<gsn.a> $$4, List<gsn.a> $$5) {
      if (!$$4.isEmpty()) {
         gry $$6 = gry.f(c, fqq.O());
         this.a($$0.getBuffer($$6), $$4, $$1, 1.0F, $$2, $$3);
      }

      if (!$$5.isEmpty()) {
         gry $$7 = gry.f(d, fqq.O());
         this.a($$0.getBuffer($$7), $$5, $$1, 0.8F, $$2, $$3);
      }
   }

   private gsn.a a(bai $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      int $$8 = $$1 & 131071;
      int $$9 = $$2 * $$2 * 3121 + $$2 * 45238971 + $$5 * $$5 * 418711 + $$5 * 13761 & 0xFF;
      float $$10 = 3.0F + $$0.i();
      float $$11 = -((float)($$8 + $$9) + $$7) / 32.0F * $$10;
      float $$12 = $$11 % 32.0F;
      return new gsn.a($$2, $$5, $$3, $$4, 0.0F, $$12, $$6);
   }

   private gsn.a b(bai $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      float $$8 = (float)$$1 + $$7;
      float $$9 = (float)($$0.j() + (double)($$8 * 0.01F * (float)$$0.k()));
      float $$10 = (float)($$0.j() + (double)($$8 * (float)$$0.k() * 0.001F));
      float $$11 = -((float)($$1 & 511) + $$7) / 512.0F;
      int $$12 = grk.a((grk.a($$6) * 3 + 15) / 4, (grk.b($$6) * 3 + 15) / 4);
      return new gsn.a($$2, $$5, $$3, $$4, $$9, $$11 + $$10, $$12);
   }

   private void a(flg $$0, List<gsn.a> $$1, fgc $$2, float $$3, int $$4, float $$5) {
      for (gsn.a $$6 : $$1) {
         float $$7 = (float)((double)$$6.a + 0.5 - $$2.d);
         float $$8 = (float)((double)$$6.b + 0.5 - $$2.f);
         float $$9 = (float)azz.e((double)$$7, (double)$$8);
         float $$10 = azz.h($$9 / (float)($$4 * $$4), $$3, 0.5F) * $$5;
         int $$11 = ayh.a($$10);
         int $$12 = ($$6.b - azz.a($$2.f) + 16) * 32 + $$6.a - azz.a($$2.d) + 16;
         float $$13 = this.h[$$12] / 2.0F;
         float $$14 = this.i[$$12] / 2.0F;
         float $$15 = $$7 - $$13;
         float $$16 = $$7 + $$13;
         float $$17 = (float)((double)$$6.d - $$2.e);
         float $$18 = (float)((double)$$6.c - $$2.e);
         float $$19 = $$8 - $$14;
         float $$20 = $$8 + $$14;
         float $$21 = $$6.e + 0.0F;
         float $$22 = $$6.e + 1.0F;
         float $$23 = (float)$$6.c * 0.25F + $$6.f;
         float $$24 = (float)$$6.d * 0.25F + $$6.f;
         $$0.a($$15, $$17, $$19).a($$21, $$23).a($$11).c($$6.g);
         $$0.a($$16, $$17, $$20).a($$22, $$23).a($$11).c($$6.g);
         $$0.a($$16, $$18, $$20).a($$22, $$24).a($$11).c($$6.g);
         $$0.a($$15, $$18, $$19).a($$21, $$24).a($$11).c($$6.g);
      }
   }

   public void a(glo $$0, fpy $$1, int $$2, art $$3) {
      float $$4 = $$0.d(1.0F) / (fqq.N() ? 1.0F : 2.0F);
      if (!($$4 <= 0.0F)) {
         bai $$5 = bai.a((long)$$2 * 312987231L);
         iw $$6 = iw.a((jq)$$1.b());
         iw $$7 = null;
         int $$8 = (int)(100.0F * $$4 * $$4) / ($$3 == art.b ? 2 : 1);

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$5.a(21) - 10;
            int $$11 = $$5.a(21) - 10;
            iw $$12 = $$0.a(ehp.a.e, $$6.b($$10, 0, $$11));
            if ($$12.v() > $$0.K_() && $$12.v() <= $$6.v() + 10 && $$12.v() >= $$6.v() - 10 && this.a($$0, $$12) == dlm.c.b) {
               $$7 = $$12.e();
               if ($$3 == art.c) {
                  break;
               }

               double $$13 = $$5.j();
               double $$14 = $$5.j();
               ebq $$15 = $$0.a_($$7);
               eya $$16 = $$0.b_($$7);
               fgw $$17 = $$15.g($$0, $$7);
               double $$18 = $$17.b(jc.a.b, $$13, $$14);
               double $$19 = (double)$$16.a($$0, $$7);
               double $$20 = Math.max($$18, $$19);
               lx $$21 = !$$16.a(axs.b) && !$$15.a(dnq.lp) && !doe.h($$15) ? lz.ag : lz.ah;
               $$0.a($$21, (double)$$7.u() + $$13, (double)$$7.v() + $$20, (double)$$7.w() + $$14, 0.0, 0.0, 0.0);
            }
         }

         if ($$7 != null && $$5.a(3) < this.g++) {
            this.g = 0;
            if ($$7.v() > $$6.v() + 1 && $$0.a(ehp.a.e, $$6).v() > azz.d((float)$$6.v())) {
               $$0.a($$7, awy.Di, awz.d, 0.1F, 0.5F, false);
            } else {
               $$0.a($$7, awy.Dh, awz.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   private dlm.c a(dkj $$0, iw $$1) {
      if (!$$0.S().b(jz.a($$1.u()), jz.a($$1.w()))) {
         return dlm.c.a;
      } else {
         dlm $$2 = $$0.u($$1).a();
         return $$2.a($$1, $$0.P());
      }
   }

   static record a(int a, int b, int c, int d, float e, float f, int g) {
   }
}
