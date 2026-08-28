import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import org.joml.Matrix4f;

public class gkz {
   private static final glq a = glq.u(alp.b("textures/map/map_background.png"));
   private static final glq b = glq.u(alp.b("textures/map/map_background_checkerboard.png"));
   private static final float c = -0.4F;
   private static final float d = 0.2F;
   private static final float e = -0.2F;
   private static final float f = -0.6F;
   private static final float g = 0.56F;
   private static final float h = -0.52F;
   private static final float i = -0.72F;
   private static final float j = 45.0F;
   private static final float k = -80.0F;
   private static final float l = -20.0F;
   private static final float m = -20.0F;
   private static final float n = 10.0F;
   private static final float o = 90.0F;
   private static final float p = 30.0F;
   private static final float q = 0.6F;
   private static final float r = -0.5F;
   private static final float s = 0.0F;
   private static final double t = 27.0;
   private static final float u = 0.8F;
   private static final float v = 0.1F;
   private static final float w = -0.3F;
   private static final float x = 0.4F;
   private static final float y = -0.4F;
   private static final float z = 70.0F;
   private static final float A = -20.0F;
   private static final float B = -0.6F;
   private static final float C = 0.8F;
   private static final float D = 0.8F;
   private static final float E = -0.75F;
   private static final float F = -0.9F;
   private static final float G = 45.0F;
   private static final float H = -1.0F;
   private static final float I = 3.6F;
   private static final float J = 3.5F;
   private static final float K = 5.6F;
   private static final int L = 200;
   private static final int M = -135;
   private static final int N = 120;
   private static final float O = -0.4F;
   private static final float P = -0.2F;
   private static final float Q = 0.0F;
   private static final float R = 0.04F;
   private static final float S = -0.72F;
   private static final float T = -1.2F;
   private static final float U = -0.5F;
   private static final float V = 45.0F;
   private static final float W = -85.0F;
   private static final float X = 45.0F;
   private static final float Y = 92.0F;
   private static final float Z = -41.0F;
   private static final float aa = 0.3F;
   private static final float ab = -1.1F;
   private static final float ac = 0.45F;
   private static final float ad = 20.0F;
   private static final float ae = 0.38F;
   private static final float af = -0.5F;
   private static final float ag = -0.5F;
   private static final float ah = 0.0F;
   private static final float ai = 0.0078125F;
   private static final int aj = 7;
   private static final int ak = 128;
   private static final int al = 128;
   private static final float am = 0.0F;
   private static final float an = 0.0F;
   private static final float ao = 0.04F;
   private static final float ap = 0.0F;
   private static final float aq = 0.004F;
   private static final float ar = 0.0F;
   private static final float as = 0.2F;
   private static final float at = 0.1F;
   private final flz au;
   private final hap av = new hap();
   private cxg aw = cxg.j;
   private cxg ax = cxg.j;
   private float ay;
   private float az;
   private float aA;
   private float aB;
   private final grj aC;
   private final gsj aD;

   public gkz(flz $$0, grj $$1, gsj $$2) {
      this.au = $$0;
      this.aC = $$1;
      this.aD = $$2;
   }

   public void a(bvx $$0, cxg $$1, cxe $$2, boolean $$3, fgl $$4, glg $$5, int $$6) {
      if (!$$1.f()) {
         this.aD.a($$0, $$1, $$2, $$3, $$4, $$5, $$0.dW(), $$6, hax.d, $$0.ar() + $$2.ordinal());
      }
   }

   private float a(float $$0) {
      float $$1 = 1.0F - $$0 / 45.0F + 0.1F;
      $$1 = azu.a($$1, 0.0F, 1.0F);
      return -azu.b($$1 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void a(fgl $$0, glg $$1, int $$2, bvr $$3) {
      gws $$4 = (gws)this.aC.<gjz>a(this.au.t);
      $$0.a();
      float $$5 = $$3 == bvr.b ? 1.0F : -1.0F;
      $$0.a(a.d.rotationDegrees(92.0F));
      $$0.a(a.b.rotationDegrees(45.0F));
      $$0.a(a.f.rotationDegrees($$5 * -41.0F));
      $$0.a($$5 * 0.3F, -1.1F, 0.45F);
      alp $$6 = this.au.t.d().a();
      if ($$3 == bvr.b) {
         $$4.a($$0, $$1, $$2, $$6, this.au.t.a(cpp.d));
      } else {
         $$4.b($$0, $$1, $$2, $$6, this.au.t.a(cpp.c));
      }

      $$0.b();
   }

   private void a(fgl $$0, glg $$1, int $$2, float $$3, bvr $$4, float $$5, cxg $$6) {
      float $$7 = $$4 == bvr.b ? 1.0F : -1.0F;
      $$0.a($$7 * 0.125F, -0.125F, 0.0F);
      if (!this.au.t.cp()) {
         $$0.a();
         $$0.a(a.f.rotationDegrees($$7 * 10.0F));
         this.a($$0, $$1, $$2, $$3, $$5, $$4);
         $$0.b();
      }

      $$0.a();
      $$0.a($$7 * 0.51F, -0.08F + $$3 * -1.2F, -0.75F);
      float $$8 = azu.c($$5);
      float $$9 = azu.a($$8 * (float) Math.PI);
      float $$10 = -0.5F * $$9;
      float $$11 = 0.4F * azu.a($$8 * (float) (Math.PI * 2));
      float $$12 = -0.3F * azu.a($$5 * (float) Math.PI);
      $$0.a($$7 * $$10, $$11 - 0.3F * $$9, $$12);
      $$0.a(a.b.rotationDegrees($$9 * -45.0F));
      $$0.a(a.d.rotationDegrees($$7 * $$9 * -30.0F));
      this.a($$0, $$1, $$2, $$6);
      $$0.b();
   }

   private void a(fgl $$0, glg $$1, int $$2, float $$3, float $$4, float $$5) {
      float $$6 = azu.c($$5);
      float $$7 = -0.2F * azu.a($$5 * (float) Math.PI);
      float $$8 = -0.4F * azu.a($$6 * (float) Math.PI);
      $$0.a(0.0F, -$$7 / 2.0F, $$8);
      float $$9 = this.a($$3);
      $$0.a(0.0F, 0.04F + $$4 * -1.2F + $$9 * -0.5F, -0.72F);
      $$0.a(a.b.rotationDegrees($$9 * -85.0F));
      if (!this.au.t.cp()) {
         $$0.a();
         $$0.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$1, $$2, bvr.b);
         this.a($$0, $$1, $$2, bvr.a);
         $$0.b();
      }

      float $$10 = azu.a($$6 * (float) Math.PI);
      $$0.a(a.b.rotationDegrees($$10 * 20.0F));
      $$0.b(2.0F, 2.0F, 2.0F);
      this.a($$0, $$1, $$2, this.aw);
   }

   private void a(fgl $$0, glg $$1, int $$2, cxg $$3) {
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.a(a.f.rotationDegrees(180.0F));
      $$0.b(0.38F, 0.38F, 0.38F);
      $$0.a(-0.5F, -0.5F, 0.0F);
      $$0.b(0.0078125F, 0.0078125F, 0.0078125F);
      evi $$4 = $$3.a(ku.L);
      evk $$5 = cxt.a($$4, this.au.s);
      fgp $$6 = $$1.getBuffer($$5 == null ? a : b);
      Matrix4f $$7 = $$0.c().a();
      $$6.a($$7, -7.0F, 135.0F, 0.0F).a(-1).a(0.0F, 1.0F).c($$2);
      $$6.a($$7, 135.0F, 135.0F, 0.0F).a(-1).a(1.0F, 1.0F).c($$2);
      $$6.a($$7, 135.0F, -7.0F, 0.0F).a(-1).a(1.0F, 0.0F).c($$2);
      $$6.a($$7, -7.0F, -7.0F, 0.0F).a(-1).a(0.0F, 0.0F).c($$2);
      if ($$5 != null) {
         glf $$8 = this.au.at();
         $$8.a($$4, $$5, this.av);
         $$8.a(this.av, $$0, $$1, false, $$2);
      }
   }

   private void a(fgl $$0, glg $$1, int $$2, float $$3, float $$4, bvr $$5) {
      boolean $$6 = $$5 != bvr.a;
      float $$7 = $$6 ? 1.0F : -1.0F;
      float $$8 = azu.c($$4);
      float $$9 = -0.3F * azu.a($$8 * (float) Math.PI);
      float $$10 = 0.4F * azu.a($$8 * (float) (Math.PI * 2));
      float $$11 = -0.4F * azu.a($$4 * (float) Math.PI);
      $$0.a($$7 * ($$9 + 0.64000005F), $$10 + -0.6F + $$3 * -0.6F, $$11 + -0.71999997F);
      $$0.a(a.d.rotationDegrees($$7 * 45.0F));
      float $$12 = azu.a($$4 * $$4 * (float) Math.PI);
      float $$13 = azu.a($$8 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees($$7 * $$13 * 70.0F));
      $$0.a(a.f.rotationDegrees($$7 * $$12 * -20.0F));
      gjz $$14 = this.au.t;
      $$0.a($$7 * -1.0F, 3.6F, 3.5F);
      $$0.a(a.f.rotationDegrees($$7 * 120.0F));
      $$0.a(a.b.rotationDegrees(200.0F));
      $$0.a(a.d.rotationDegrees($$7 * -135.0F));
      $$0.a($$7 * 5.6F, 0.0F, 0.0F);
      gws $$15 = (gws)this.aC.<gjz>a($$14);
      alp $$16 = $$14.d().a();
      if ($$6) {
         $$15.a($$0, $$1, $$2, $$16, $$14.a(cpp.d));
      } else {
         $$15.b($$0, $$1, $$2, $$16, $$14.a(cpp.c));
      }
   }

   private void a(fgl $$0, float $$1, bvr $$2, cxg $$3, cpo $$4) {
      float $$5 = (float)$$4.fC() - $$1 + 1.0F;
      float $$6 = $$5 / (float)$$3.a((bvx)$$4);
      if ($$6 < 0.8F) {
         float $$7 = azu.e(azu.b($$5 / 4.0F * (float) Math.PI) * 0.1F);
         $$0.a(0.0F, $$7, 0.0F);
      }

      float $$8 = 1.0F - (float)Math.pow((double)$$6, 27.0);
      int $$9 = $$2 == bvr.b ? 1 : -1;
      $$0.a($$8 * 0.6F * (float)$$9, $$8 * -0.5F, $$8 * 0.0F);
      $$0.a(a.d.rotationDegrees((float)$$9 * $$8 * 90.0F));
      $$0.a(a.b.rotationDegrees($$8 * 10.0F));
      $$0.a(a.f.rotationDegrees((float)$$9 * $$8 * 30.0F));
   }

   private void a(fgl $$0, float $$1, bvr $$2, cxg $$3, cpo $$4, float $$5) {
      this.b($$0, $$2, $$5);
      float $$6 = (float)($$4.fC() % 10);
      float $$7 = $$6 - $$1 + 1.0F;
      float $$8 = 1.0F - $$7 / 10.0F;
      float $$9 = -90.0F;
      float $$10 = 60.0F;
      float $$11 = 150.0F;
      float $$12 = -15.0F;
      int $$13 = 2;
      float $$14 = -15.0F + 75.0F * azu.b($$8 * 2.0F * (float) Math.PI);
      if ($$2 != bvr.b) {
         $$0.a(0.1, 0.83, 0.35);
         $$0.a(a.b.rotationDegrees(-80.0F));
         $$0.a(a.d.rotationDegrees(-90.0F));
         $$0.a(a.b.rotationDegrees($$14));
         $$0.a(-0.3, 0.22, 0.35);
      } else {
         $$0.a(-0.25, 0.22, 0.35);
         $$0.a(a.b.rotationDegrees(-80.0F));
         $$0.a(a.d.rotationDegrees(90.0F));
         $$0.a(a.f.rotationDegrees(0.0F));
         $$0.a(a.b.rotationDegrees($$14));
      }
   }

   private void a(fgl $$0, bvr $$1, float $$2) {
      int $$3 = $$1 == bvr.b ? 1 : -1;
      float $$4 = azu.a($$2 * $$2 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees((float)$$3 * (45.0F + $$4 * -20.0F)));
      float $$5 = azu.a(azu.c($$2) * (float) Math.PI);
      $$0.a(a.f.rotationDegrees((float)$$3 * $$5 * -20.0F));
      $$0.a(a.b.rotationDegrees($$5 * -80.0F));
      $$0.a(a.d.rotationDegrees((float)$$3 * -45.0F));
   }

   private void b(fgl $$0, bvr $$1, float $$2) {
      int $$3 = $$1 == bvr.b ? 1 : -1;
      $$0.a((float)$$3 * 0.56F, -0.52F + $$2 * -0.6F, -0.72F);
   }

   public void a(float $$0, fgl $$1, glg.a $$2, gkc $$3, int $$4) {
      float $$5 = $$3.D($$0);
      bsz $$6 = (bsz)MoreObjects.firstNonNull($$3.aJ, bsz.a);
      float $$7 = $$3.j($$0);
      gkz.a $$8 = a($$3);
      float $$9 = azu.h($$0, $$3.cG, $$3.cE);
      float $$10 = azu.h($$0, $$3.cF, $$3.cD);
      $$1.a(a.b.rotationDegrees(($$3.h($$0) - $$9) * 0.1F));
      $$1.a(a.d.rotationDegrees(($$3.i($$0) - $$10) * 0.1F));
      if ($$8.d) {
         float $$11 = $$6 == bsz.a ? $$5 : 0.0F;
         float $$12 = 1.0F - azu.h($$0, this.az, this.ay);
         this.a($$3, $$0, $$7, bsz.a, $$11, this.aw, $$12, $$1, $$2, $$4);
      }

      if ($$8.e) {
         float $$13 = $$6 == bsz.b ? $$5 : 0.0F;
         float $$14 = 1.0F - azu.h($$0, this.aB, this.aA);
         this.a($$3, $$0, $$7, bsz.b, $$13, this.ax, $$14, $$1, $$2, $$4);
      }

      $$2.b();
   }

   @VisibleForTesting
   static gkz.a a(gkc $$0) {
      cxg $$1 = $$0.eZ();
      cxg $$2 = $$0.fa();
      boolean $$3 = $$1.a(cxk.pa) || $$2.a(cxk.pa);
      boolean $$4 = $$1.a(cxk.wV) || $$2.a(cxk.wV);
      if (!$$3 && !$$4) {
         return gkz.a.a;
      } else if ($$0.fz()) {
         return b($$0);
      } else {
         return a($$1) ? gkz.a.b : gkz.a.a;
      }
   }

   private static gkz.a b(gkc $$0) {
      cxg $$1 = $$0.fB();
      bsz $$2 = $$0.fA();
      if (!$$1.a(cxk.pa) && !$$1.a(cxk.wV)) {
         return $$2 == bsz.a && a($$0.fa()) ? gkz.a.b : gkz.a.a;
      } else {
         return gkz.a.a($$2);
      }
   }

   private static boolean a(cxg $$0) {
      return $$0.a(cxk.wV) && cvx.g($$0);
   }

   private void a(gjz $$0, float $$1, float $$2, bsz $$3, float $$4, cxg $$5, float $$6, fgl $$7, glg $$8, int $$9) {
      if (!$$0.gH()) {
         boolean $$10 = $$3 == bsz.a;
         bvr $$11 = $$10 ? $$0.fy() : $$0.fy().e();
         $$7.a();
         if ($$5.f()) {
            if ($$10 && !$$0.cp()) {
               this.a($$7, $$8, $$9, $$6, $$4, $$11);
            }
         } else if ($$5.b(ku.L)) {
            if ($$10 && this.ax.f()) {
               this.a($$7, $$8, $$9, $$2, $$6, $$4);
            } else {
               this.a($$7, $$8, $$9, $$6, $$11, $$4, $$5);
            }
         } else if ($$5.a(cxk.wV)) {
            boolean $$12 = cvx.g($$5);
            boolean $$13 = $$11 == bvr.b;
            int $$14 = $$13 ? 1 : -1;
            if ($$0.fz() && $$0.fC() > 0 && $$0.fA() == $$3) {
               this.b($$7, $$11, $$6);
               $$7.a((float)$$14 * -0.4785682F, -0.094387F, 0.05731531F);
               $$7.a(a.b.rotationDegrees(-11.935F));
               $$7.a(a.d.rotationDegrees((float)$$14 * 65.3F));
               $$7.a(a.f.rotationDegrees((float)$$14 * -9.785F));
               float $$15 = (float)$$5.a((bvx)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
               float $$16 = $$15 / (float)cvx.b($$5, $$0);
               if ($$16 > 1.0F) {
                  $$16 = 1.0F;
               }

               if ($$16 > 0.1F) {
                  float $$17 = azu.a(($$15 - 0.1F) * 1.3F);
                  float $$18 = $$16 - 0.1F;
                  float $$19 = $$17 * $$18;
                  $$7.a($$19 * 0.0F, $$19 * 0.004F, $$19 * 0.0F);
               }

               $$7.a($$16 * 0.0F, $$16 * 0.0F, $$16 * 0.04F);
               $$7.b(1.0F, 1.0F, 1.0F + $$16 * 0.2F);
               $$7.a(a.c.rotationDegrees((float)$$14 * 45.0F));
            } else {
               float $$20 = -0.4F * azu.a(azu.c($$4) * (float) Math.PI);
               float $$21 = 0.2F * azu.a(azu.c($$4) * (float) (Math.PI * 2));
               float $$22 = -0.2F * azu.a($$4 * (float) Math.PI);
               $$7.a((float)$$14 * $$20, $$21, $$22);
               this.b($$7, $$11, $$6);
               this.a($$7, $$11, $$4);
               if ($$12 && $$4 < 0.001F && $$10) {
                  $$7.a((float)$$14 * -0.641864F, 0.0F, 0.0F);
                  $$7.a(a.d.rotationDegrees((float)$$14 * 10.0F));
               }
            }

            this.a($$0, $$5, $$13 ? cxe.e : cxe.d, !$$13, $$7, $$8, $$9);
         } else {
            boolean $$23 = $$11 == bvr.b;
            if ($$0.fz() && $$0.fC() > 0 && $$0.fA() == $$3) {
               int $$24 = $$23 ? 1 : -1;
               switch ($$5.w()) {
                  case a:
                     this.b($$7, $$11, $$6);
                     break;
                  case b:
                  case c:
                     this.a($$7, $$1, $$11, $$5, $$0);
                     this.b($$7, $$11, $$6);
                     break;
                  case d:
                     this.b($$7, $$11, $$6);
                     if (!($$5.h() instanceof cyi)) {
                        $$7.a((float)$$24 * -0.14142136F, 0.08F, 0.14142136F);
                        $$7.a(a.b.rotationDegrees(-102.25F));
                        $$7.a(a.d.rotationDegrees((float)$$24 * 13.365F));
                        $$7.a(a.f.rotationDegrees((float)$$24 * 78.05F));
                     }
                     break;
                  case e:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$24 * -0.2785682F, 0.18344387F, 0.15731531F);
                     $$7.a(a.b.rotationDegrees(-13.935F));
                     $$7.a(a.d.rotationDegrees((float)$$24 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$24 * -9.785F));
                     float $$25 = (float)$$5.a((bvx)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
                     float $$26 = $$25 / 20.0F;
                     $$26 = ($$26 * $$26 + $$26 * 2.0F) / 3.0F;
                     if ($$26 > 1.0F) {
                        $$26 = 1.0F;
                     }

                     if ($$26 > 0.1F) {
                        float $$27 = azu.a(($$25 - 0.1F) * 1.3F);
                        float $$28 = $$26 - 0.1F;
                        float $$29 = $$27 * $$28;
                        $$7.a($$29 * 0.0F, $$29 * 0.004F, $$29 * 0.0F);
                     }

                     $$7.a($$26 * 0.0F, $$26 * 0.0F, $$26 * 0.04F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$26 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$24 * 45.0F));
                     break;
                  case f:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$24 * -0.5F, 0.7F, 0.1F);
                     $$7.a(a.b.rotationDegrees(-55.0F));
                     $$7.a(a.d.rotationDegrees((float)$$24 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$24 * -9.785F));
                     float $$30 = (float)$$5.a((bvx)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
                     float $$31 = $$30 / 10.0F;
                     if ($$31 > 1.0F) {
                        $$31 = 1.0F;
                     }

                     if ($$31 > 0.1F) {
                        float $$32 = azu.a(($$30 - 0.1F) * 1.3F);
                        float $$33 = $$31 - 0.1F;
                        float $$34 = $$32 * $$33;
                        $$7.a($$34 * 0.0F, $$34 * 0.004F, $$34 * 0.0F);
                     }

                     $$7.a(0.0F, 0.0F, $$31 * 0.2F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$31 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$24 * 45.0F));
                     break;
                  case j:
                     this.a($$7, $$1, $$11, $$5, $$0, $$6);
               }
            } else if ($$0.fv()) {
               this.b($$7, $$11, $$6);
               int $$35 = $$23 ? 1 : -1;
               $$7.a((float)$$35 * -0.4F, 0.8F, 0.3F);
               $$7.a(a.d.rotationDegrees((float)$$35 * 65.0F));
               $$7.a(a.f.rotationDegrees((float)$$35 * -85.0F));
            } else {
               float $$36 = -0.4F * azu.a(azu.c($$4) * (float) Math.PI);
               float $$37 = 0.2F * azu.a(azu.c($$4) * (float) (Math.PI * 2));
               float $$38 = -0.2F * azu.a($$4 * (float) Math.PI);
               int $$39 = $$23 ? 1 : -1;
               $$7.a((float)$$39 * $$36, $$37, $$38);
               this.b($$7, $$11, $$6);
               this.a($$7, $$11, $$4);
            }

            this.a($$0, $$5, $$23 ? cxe.e : cxe.d, !$$23, $$7, $$8, $$9);
         }

         $$7.b();
      }
   }

   public void a() {
      this.az = this.ay;
      this.aB = this.aA;
      gkc $$0 = this.au.t;
      cxg $$1 = $$0.eZ();
      cxg $$2 = $$0.fa();
      if (cxg.a(this.aw, $$1)) {
         this.aw = $$1;
      }

      if (cxg.a(this.ax, $$2)) {
         this.ax = $$2;
      }

      if ($$0.D()) {
         this.ay = azu.a(this.ay - 0.4F, 0.0F, 1.0F);
         this.aA = azu.a(this.aA - 0.4F, 0.0F, 1.0F);
      } else {
         float $$3 = $$0.H(1.0F);
         this.ay = this.ay + azu.a((this.aw == $$1 ? $$3 * $$3 * $$3 : 0.0F) - this.ay, -0.4F, 0.4F);
         this.aA = this.aA + azu.a((float)(this.ax == $$2 ? 1 : 0) - this.aA, -0.4F, 0.4F);
      }

      if (this.ay < 0.1F) {
         this.aw = $$1;
      }

      if (this.aA < 0.1F) {
         this.ax = $$2;
      }
   }

   public void a(bsz $$0) {
      if ($$0 == bsz.a) {
         this.ay = 0.0F;
      } else {
         this.aA = 0.0F;
      }
   }

   @VisibleForTesting
   static enum a {
      a(true, true),
      b(true, false),
      c(false, true);

      final boolean d;
      final boolean e;

      private a(final boolean $$0, final boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public static gkz.a a(bsz $$0) {
         return $$0 == bsz.a ? b : c;
      }
   }
}
