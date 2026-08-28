import java.util.ArrayList;
import java.util.List;

public class gmz {
   private static final int a = 10;
   private static final int b = 21;
   private static final akv c = akv.b("textures/environment/rain.png");
   private static final akv d = akv.b("textures/environment/snow.png");
   private static final int e = 32;
   private static final int f = 16;
   private int g;
   private final float[] h = new float[1024];
   private final float[] i = new float[1024];

   public gmz() {
      for (int $$0 = 0; $$0 < 32; $$0++) {
         for (int $$1 = 0; $$1 < 32; $$1++) {
            float $$2 = (float)($$1 - 16);
            float $$3 = (float)($$0 - 16);
            float $$4 = ayz.f($$2, $$3);
            this.h[$$0 * 32 + $$1] = -$$3 / $$4;
            this.i[$$0 * 32 + $$1] = $$2 / $$4;
         }
      }
   }

   public void a(dgi $$0, gly $$1, int $$2, float $$3, fba $$4) {
      float $$5 = $$0.d($$3);
      if (!($$5 <= 0.0F)) {
         int $$6 = flj.N() ? 10 : 5;
         List<gmz.a> $$7 = new ArrayList<>();
         List<gmz.a> $$8 = new ArrayList<>();
         this.a($$0, $$2, $$3, $$4, $$6, $$7, $$8);
         if (!$$7.isEmpty() || !$$8.isEmpty()) {
            this.a($$1, $$4, $$6, $$5, $$7, $$8);
         }
      }
   }

   private void a(dgi $$0, int $$1, float $$2, fba $$3, int $$4, List<gmz.a> $$5, List<gmz.a> $$6) {
      int $$7 = ayz.a($$3.d);
      int $$8 = ayz.a($$3.e);
      int $$9 = ayz.a($$3.f);
      ji.a $$10 = new ji.a();
      azh $$11 = azh.a();

      for (int $$12 = $$9 - $$4; $$12 <= $$9 + $$4; $$12++) {
         for (int $$13 = $$7 - $$4; $$13 <= $$7 + $$4; $$13++) {
            int $$14 = $$0.a(ecs.a.e, $$13, $$12);
            int $$15 = Math.max($$8 - $$4, $$14);
            int $$16 = Math.max($$8 + $$4, $$14);
            if ($$16 - $$15 != 0) {
               dhk.c $$17 = this.a($$0, $$10.d($$13, $$8, $$12));
               if ($$17 != dhk.c.a) {
                  int $$18 = $$13 * $$13 * 3121 + $$13 * 45238971 ^ $$12 * $$12 * 418711 + $$12 * 13761;
                  $$11.b((long)$$18);
                  int $$19 = Math.max($$8, $$14);
                  int $$20 = glu.a($$0, $$10.d($$13, $$19, $$12));
                  if ($$17 == dhk.c.b) {
                     $$5.add(this.a($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  } else if ($$17 == dhk.c.c) {
                     $$6.add(this.b($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  }
               }
            }
         }
      }
   }

   private void a(gly $$0, fba $$1, int $$2, float $$3, List<gmz.a> $$4, List<gmz.a> $$5) {
      if (!$$4.isEmpty()) {
         gmi $$6 = gmi.f(c, flj.O());
         this.a($$0.getBuffer($$6), $$4, $$1, 1.0F, $$2, $$3);
      }

      if (!$$5.isEmpty()) {
         gmi $$7 = gmi.f(d, flj.O());
         this.a($$0.getBuffer($$7), $$5, $$1, 0.8F, $$2, $$3);
      }
   }

   private gmz.a a(azh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      int $$8 = $$1 & 131071;
      int $$9 = $$2 * $$2 * 3121 + $$2 * 45238971 + $$5 * $$5 * 418711 + $$5 * 13761 & 0xFF;
      float $$10 = 3.0F + $$0.i();
      float $$11 = -((float)($$8 + $$9) + $$7) / 32.0F * $$10;
      float $$12 = $$11 % 32.0F;
      return new gmz.a($$2, $$5, $$3, $$4, 0.0F, $$12, $$6);
   }

   private gmz.a b(azh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      float $$8 = (float)$$1 + $$7;
      float $$9 = (float)($$0.j() + (double)($$8 * 0.01F * (float)$$0.k()));
      float $$10 = (float)($$0.j() + (double)($$8 * (float)$$0.k() * 0.001F));
      float $$11 = -((float)($$1 & 511) + $$7) / 512.0F;
      int $$12 = glw.a((glw.a($$6) * 3 + 15) / 4, (glw.b($$6) * 3 + 15) / 4);
      return new gmz.a($$2, $$5, $$3, $$4, $$9, $$11 + $$10, $$12);
   }

   private void a(ffy $$0, List<gmz.a> $$1, fba $$2, float $$3, int $$4, float $$5) {
      for (gmz.a $$6 : $$1) {
         float $$7 = (float)((double)$$6.a + 0.5 - $$2.d);
         float $$8 = (float)((double)$$6.b + 0.5 - $$2.f);
         float $$9 = (float)ayz.e((double)$$7, (double)$$8);
         float $$10 = ayz.h($$9 / (float)($$4 * $$4), $$3, 0.5F) * $$5;
         int $$11 = axk.a($$10);
         int $$12 = ($$6.b - ayz.a($$2.f) + 16) * 32 + $$6.a - ayz.a($$2.d) + 16;
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

   public void a(gfz $$0, fkr $$1, int $$2, aqv $$3) {
      float $$4 = $$0.d(1.0F) / (flj.N() ? 1.0F : 2.0F);
      if (!($$4 <= 0.0F)) {
         azh $$5 = azh.a((long)$$2 * 312987231L);
         ji $$6 = ji.a((kb)$$1.b());
         ji $$7 = null;
         int $$8 = (int)(100.0F * $$4 * $$4) / ($$3 == aqv.b ? 2 : 1);

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$5.a(21) - 10;
            int $$11 = $$5.a(21) - 10;
            ji $$12 = $$0.a(ecs.a.e, $$6.b($$10, 0, $$11));
            if ($$12.v() > $$0.L_() && $$12.v() <= $$6.v() + 10 && $$12.v() >= $$6.v() - 10 && this.a($$0, $$12) == dhk.c.b) {
               $$7 = $$12.e();
               if ($$3 == aqv.c) {
                  break;
               }

               double $$13 = $$5.j();
               double $$14 = $$5.j();
               dwx $$15 = $$0.a_($$7);
               esz $$16 = $$0.b_($$7);
               fbu $$17 = $$15.g($$0, $$7);
               double $$18 = $$17.b(jn.a.b, $$13, $$14);
               double $$19 = (double)$$16.a($$0, $$7);
               double $$20 = Math.max($$18, $$19);
               lr $$21 = !$$16.a(awv.b) && !$$15.a(djo.ll) && !dkb.h($$15) ? lt.af : lt.ag;
               $$0.a($$21, (double)$$7.u() + $$13, (double)$$7.v() + $$20, (double)$$7.w() + $$14, 0.0, 0.0, 0.0);
            }
         }

         if ($$7 != null && $$5.a(3) < this.g++) {
            this.g = 0;
            if ($$7.v() > $$6.v() + 1 && $$0.a(ecs.a.e, $$6).v() > ayz.d((float)$$6.v())) {
               $$0.a($$7, awa.CS, awb.d, 0.1F, 0.5F, false);
            } else {
               $$0.a($$7, awa.CR, awb.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   private dhk.c a(dgi $$0, ji $$1) {
      if (!$$0.S().b(kk.a($$1.u()), kk.a($$1.w()))) {
         return dhk.c.a;
      } else {
         dhk $$2 = $$0.t($$1).a();
         return $$2.a($$1, $$0.P());
      }
   }

   static record a(int a, int b, int c, int d, float e, float f, int g) {
   }
}
