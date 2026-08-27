import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;

public class fwy {
   public static class a implements fxq<ko> {
      private final fyi a;

      public a(fyi $$0) {
         this.a = $$0;
      }

      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fwy.b $$8 = new fwy.b($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b extends fyn {
      b(fuh $$0, double $$1, double $$2, double $$3) {
         super($$0, $$1, $$2, $$3);
         this.t = 4;
      }

      @Override
      public fxr b() {
         return fxr.c;
      }

      @Override
      public void a(ewm $$0, fba $$1, float $$2) {
         this.e(0.6F - ((float)this.s + $$2 - 1.0F) * 0.25F * 0.5F);
         super.a($$0, $$1, $$2);
      }

      @Override
      public float b(float $$0) {
         return 7.1F * axk.a(((float)this.s + $$0 - 1.0F) * 0.25F * (float) Math.PI);
      }
   }

   static class c extends fxz {
      private boolean b;
      private boolean F;
      private final fxp G;
      private float H;
      private float I;
      private float J;
      private boolean K;

      c(fuh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fxp $$7, fyi $$8) {
         super($$0, $$1, $$2, $$3, $$8, 0.1F);
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
         this.G = $$7;
         this.D *= 0.75F;
         this.t = 48 + this.r.a(12);
         this.b($$8);
      }

      public void a(boolean $$0) {
         this.b = $$0;
      }

      public void b(boolean $$0) {
         this.F = $$0;
      }

      @Override
      public void a(ewm $$0, fba $$1, float $$2) {
         if (!this.F || this.s < this.t / 3 || (this.s + this.t) / 3 % 2 == 0) {
            super.a($$0, $$1, $$2);
         }
      }

      @Override
      public void a() {
         super.a();
         if (this.b && this.s < this.t / 2 && (this.s + this.t) % 2 == 0) {
            fwy.c $$0 = new fwy.c(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.G, this.a);
            $$0.e(0.99F);
            $$0.a(this.v, this.w, this.x);
            $$0.s = $$0.t / 2;
            if (this.K) {
               $$0.K = true;
               $$0.H = this.H;
               $$0.I = this.I;
               $$0.J = this.J;
            }

            $$0.F = this.F;
            this.G.a($$0);
         }
      }
   }

   public static class d implements fxq<ko> {
      private final fyi a;

      public d(fyi $$0) {
         this.a = $$0;
      }

      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fwy.c $$8 = new fwy.c($$1, $$2, $$3, $$4, $$5, $$6, $$7, fbp.Q().g, this.a);
         $$8.e(0.99F);
         return $$8;
      }
   }

   public static class e extends fxl {
      private static final double[][] a = new double[][]{
         {0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}
      };
      private static final double[][] b = new double[][]{
         {0.0, 1.0},
         {0.3455, 0.309},
         {0.9511, 0.309},
         {0.3795918367346939, -0.12653061224489795},
         {0.6122448979591837, -0.8040816326530612},
         {0.0, -0.35918367346938773}
      };
      private int D;
      private final fxp E;
      private final List<ctx> F;
      private boolean G;

      public e(fuh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fxp $$7, List<ctx> $$8) {
         super($$0, $$1, $$2, $$3);
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
         this.E = $$7;
         if ($$8.isEmpty()) {
            throw new IllegalArgumentException("Cannot create firework starter with no explosions");
         } else {
            this.F = $$8;
            this.t = $$8.size() * 2 - 1;

            for (ctx $$9 : $$8) {
               if ($$9.e()) {
                  this.G = true;
                  this.t += 15;
                  break;
               }
            }
         }
      }

      @Override
      public void a() {
         if (this.D == 0) {
            boolean $$0 = this.c();
            boolean $$1 = false;
            if (this.F.size() >= 3) {
               $$1 = true;
            } else {
               for (ctx $$2 : this.F) {
                  if ($$2.a() == ctx.a.b) {
                     $$1 = true;
                     break;
                  }
               }
            }

            aul $$3;
            if ($$1) {
               $$3 = $$0 ? aum.iJ : aum.iI;
            } else {
               $$3 = $$0 ? aum.iH : aum.iG;
            }

            this.c.a(this.g, this.h, this.i, $$3, aun.i, 20.0F, 0.95F + this.r.i() * 0.1F, true);
         }

         if (this.D % 2 == 0 && this.D / 2 < this.F.size()) {
            int $$5 = this.D / 2;
            ctx $$6 = this.F.get($$5);
            boolean $$7 = $$6.d();
            boolean $$8 = $$6.e();
            IntList $$9 = $$6.b();
            IntList $$10 = $$6.c();
            if ($$9.isEmpty()) {
               $$9 = IntList.of(cqc.p.f());
            }

            switch ($$6.a()) {
               case a:
                  this.a(0.25, 2, $$9, $$10, $$7, $$8);
                  break;
               case b:
                  this.a(0.5, 4, $$9, $$10, $$7, $$8);
                  break;
               case c:
                  this.a(0.5, b, $$9, $$10, $$7, $$8, false);
                  break;
               case d:
                  this.a(0.5, a, $$9, $$10, $$7, $$8, true);
                  break;
               case e:
                  this.a($$9, $$10, $$7, $$8);
            }

            int $$11 = $$9.getInt(0);
            fxn $$12 = this.E.a(kl.M, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            $$12.a((float)awu.b.b($$11) / 255.0F, (float)awu.b.c($$11) / 255.0F, (float)awu.b.d($$11) / 255.0F);
         }

         this.D++;
         if (this.D > this.t) {
            if (this.G) {
               boolean $$13 = this.c();
               aul $$14 = $$13 ? aum.iN : aum.iM;
               this.c.a(this.g, this.h, this.i, $$14, aun.i, 20.0F, 0.9F + this.r.i() * 0.15F, true);
            }

            this.k();
         }
      }

      private boolean c() {
         fbp $$0 = fbp.Q();
         return $$0.j.n().b().c(this.g, this.h, this.i) >= 256.0;
      }

      private void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, IntList $$6, IntList $$7, boolean $$8, boolean $$9) {
         fwy.c $$10 = (fwy.c)this.E.a(kl.D, $$0, $$1, $$2, $$3, $$4, $$5);
         $$10.a($$8);
         $$10.b($$9);
         $$10.e(0.99F);
         $$10.b(ac.<Integer>a($$6, this.r));
         if (!$$7.isEmpty()) {
            $$10.c(ac.<Integer>a($$7, this.r));
         }
      }

      private void a(double $$0, int $$1, IntList $$2, IntList $$3, boolean $$4, boolean $$5) {
         double $$6 = this.g;
         double $$7 = this.h;
         double $$8 = this.i;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               for (int $$11 = -$$1; $$11 <= $$1; $$11++) {
                  double $$12 = (double)$$10 + (this.r.j() - this.r.j()) * 0.5;
                  double $$13 = (double)$$9 + (this.r.j() - this.r.j()) * 0.5;
                  double $$14 = (double)$$11 + (this.r.j() - this.r.j()) * 0.5;
                  double $$15 = Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) / $$0 + this.r.k() * 0.05;
                  this.a($$6, $$7, $$8, $$12 / $$15, $$13 / $$15, $$14 / $$15, $$2, $$3, $$4, $$5);
                  if ($$9 != -$$1 && $$9 != $$1 && $$10 != -$$1 && $$10 != $$1) {
                     $$11 += $$1 * 2 - 1;
                  }
               }
            }
         }
      }

      private void a(double $$0, double[][] $$1, IntList $$2, IntList $$3, boolean $$4, boolean $$5, boolean $$6) {
         double $$7 = $$1[0][0];
         double $$8 = $$1[0][1];
         this.a(this.g, this.h, this.i, $$7 * $$0, $$8 * $$0, 0.0, $$2, $$3, $$4, $$5);
         float $$9 = this.r.i() * (float) Math.PI;
         double $$10 = $$6 ? 0.034 : 0.34;

         for (int $$11 = 0; $$11 < 3; $$11++) {
            double $$12 = (double)$$9 + (double)((float)$$11 * (float) Math.PI) * $$10;
            double $$13 = $$7;
            double $$14 = $$8;

            for (int $$15 = 1; $$15 < $$1.length; $$15++) {
               double $$16 = $$1[$$15][0];
               double $$17 = $$1[$$15][1];

               for (double $$18 = 0.25; $$18 <= 1.0; $$18 += 0.25) {
                  double $$19 = axk.d($$18, $$13, $$16) * $$0;
                  double $$20 = axk.d($$18, $$14, $$17) * $$0;
                  double $$21 = $$19 * Math.sin($$12);
                  $$19 *= Math.cos($$12);

                  for (double $$22 = -1.0; $$22 <= 1.0; $$22 += 2.0) {
                     this.a(this.g, this.h, this.i, $$19 * $$22, $$20, $$21 * $$22, $$2, $$3, $$4, $$5);
                  }
               }

               $$13 = $$16;
               $$14 = $$17;
            }
         }
      }

      private void a(IntList $$0, IntList $$1, boolean $$2, boolean $$3) {
         double $$4 = this.r.k() * 0.05;
         double $$5 = this.r.k() * 0.05;

         for (int $$6 = 0; $$6 < 70; $$6++) {
            double $$7 = this.j * 0.5 + this.r.k() * 0.15 + $$4;
            double $$8 = this.l * 0.5 + this.r.k() * 0.15 + $$5;
            double $$9 = this.k * 0.5 + this.r.j() * 0.5;
            this.a(this.g, this.h, this.i, $$7, $$9, $$8, $$0, $$1, $$2, $$3);
         }
      }
   }
}
