import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;

public class gbd {
   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbd.b $$8 = new gbd.b($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b extends gct {
      b(fyl $$0, double $$1, double $$2, double $$3) {
         super($$0, $$1, $$2, $$3);
         this.t = 4;
      }

      @Override
      public gbx b() {
         return gbx.c;
      }

      @Override
      public void a(fas $$0, ffg $$1, float $$2) {
         this.e(0.6F - ((float)this.s + $$2 - 1.0F) * 0.25F * 0.5F);
         super.a($$0, $$1, $$2);
      }

      @Override
      public float b(float $$0) {
         return 7.1F * ayg.a(((float)this.s + $$0 - 1.0F) * 0.25F * (float) Math.PI);
      }
   }

   static class c extends gcf {
      private boolean b;
      private boolean F;
      private final gbv G;
      private float H;
      private float I;
      private float J;
      private boolean K;

      c(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbv $$7, gco $$8) {
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
      public void a(fas $$0, ffg $$1, float $$2) {
         if (!this.F || this.s < this.t / 3 || (this.s + this.t) / 3 % 2 == 0) {
            super.a($$0, $$1, $$2);
         }
      }

      @Override
      public void a() {
         super.a();
         if (this.b && this.s < this.t / 2 && (this.s + this.t) % 2 == 0) {
            gbd.c $$0 = new gbd.c(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.G, this.a);
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

   public static class d implements gbw<ln> {
      private final gco a;

      public d(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbd.c $$8 = new gbd.c($$1, $$2, $$3, $$4, $$5, $$6, $$7, ffw.Q().g, this.a);
         $$8.e(0.99F);
         return $$8;
      }
   }

   public static class e extends gbr {
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
      private final gbv E;
      private final List<cwv> F;
      private boolean G;

      public e(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbv $$7, List<cwv> $$8) {
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

            for (cwv $$9 : $$8) {
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
               for (cwv $$2 : this.F) {
                  if ($$2.a() == cwv.a.b) {
                     $$1 = true;
                     break;
                  }
               }
            }

            avg $$3;
            if ($$1) {
               $$3 = $$0 ? avh.iO : avh.iN;
            } else {
               $$3 = $$0 ? avh.iM : avh.iL;
            }

            this.c.a(this.g, this.h, this.i, $$3, avi.i, 20.0F, 0.95F + this.r.i() * 0.1F, true);
         }

         if (this.D % 2 == 0 && this.D / 2 < this.F.size()) {
            int $$5 = this.D / 2;
            cwv $$6 = this.F.get($$5);
            boolean $$7 = $$6.d();
            boolean $$8 = $$6.e();
            IntList $$9 = $$6.b();
            IntList $$10 = $$6.c();
            if ($$9.isEmpty()) {
               $$9 = IntList.of(csw.p.f());
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
            gbt $$12 = this.E.a(lj.N, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            $$12.a((float)axq.b.b($$11) / 255.0F, (float)axq.b.c($$11) / 255.0F, (float)axq.b.d($$11) / 255.0F);
         }

         this.D++;
         if (this.D > this.t) {
            if (this.G) {
               boolean $$13 = this.c();
               avg $$14 = $$13 ? avh.iS : avh.iR;
               this.c.a(this.g, this.h, this.i, $$14, avi.i, 20.0F, 0.9F + this.r.i() * 0.15F, true);
            }

            this.k();
         }
      }

      private boolean c() {
         ffw $$0 = ffw.Q();
         return $$0.j.l().b().c(this.g, this.h, this.i) >= 256.0;
      }

      private void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, IntList $$6, IntList $$7, boolean $$8, boolean $$9) {
         gbd.c $$10 = (gbd.c)this.E.a(lj.D, $$0, $$1, $$2, $$3, $$4, $$5);
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
                  double $$19 = ayg.d($$18, $$13, $$16) * $$0;
                  double $$20 = ayg.d($$18, $$14, $$17) * $$0;
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
