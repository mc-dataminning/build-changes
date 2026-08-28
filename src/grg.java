import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import org.joml.Matrix4f;

public class grg {
   private static final gry a = gry.u(alr.b("textures/map/map_background.png"));
   private static final gry b = gry.u(alr.b("textures/map/map_background_checkerboard.png"));
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
   private final fqq au;
   private final hjz av = new hjz();
   private dak aw = dak.l;
   private dak ax = dak.l;
   private float ay;
   private float az;
   private float aA;
   private float aB;
   private final gxt aC;
   private final gyt aD;
   private final hhg aE;

   public grg(fqq $$0, gxt $$1, gyt $$2, hhg $$3) {
      this.au = $$0;
      this.aC = $$1;
      this.aD = $$2;
      this.aE = $$3;
   }

   public void a(byf $$0, dak $$1, dai $$2, fld $$3, grn $$4, int $$5) {
      if (!$$1.f()) {
         this.aD.a($$0, $$1, $$2, $$3, $$4, $$0.dV(), $$5, hkg.d, $$0.ao() + $$2.ordinal());
      }
   }

   private float a(float $$0) {
      float $$1 = 1.0F - $$0 / 45.0F + 0.1F;
      $$1 = azz.a($$1, 0.0F, 1.0F);
      return -azz.b($$1 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void a(fld $$0, grn $$1, int $$2, bxw $$3) {
      hdc $$4 = (hdc)this.aC.<gqj>a(this.au.t);
      $$0.a();
      float $$5 = $$3 == bxw.b ? 1.0F : -1.0F;
      $$0.a(a.d.rotationDegrees(92.0F));
      $$0.a(a.b.rotationDegrees(45.0F));
      $$0.a(a.f.rotationDegrees($$5 * -41.0F));
      $$0.a($$5 * 0.3F, -1.1F, 0.45F);
      alr $$6 = this.au.t.c().a();
      if ($$3 == bxw.b) {
         $$4.a($$0, $$1, $$2, $$6, this.au.t.a(csk.d));
      } else {
         $$4.b($$0, $$1, $$2, $$6, this.au.t.a(csk.c));
      }

      $$0.b();
   }

   private void a(fld $$0, grn $$1, int $$2, float $$3, bxw $$4, float $$5, dak $$6) {
      float $$7 = $$4 == bxw.b ? 1.0F : -1.0F;
      $$0.a($$7 * 0.125F, -0.125F, 0.0F);
      if (!this.au.t.co()) {
         $$0.a();
         $$0.a(a.f.rotationDegrees($$7 * 10.0F));
         this.a($$0, $$1, $$2, $$3, $$5, $$4);
         $$0.b();
      }

      $$0.a();
      $$0.a($$7 * 0.51F, -0.08F + $$3 * -1.2F, -0.75F);
      float $$8 = azz.c($$5);
      float $$9 = azz.a($$8 * (float) Math.PI);
      float $$10 = -0.5F * $$9;
      float $$11 = 0.4F * azz.a($$8 * (float) (Math.PI * 2));
      float $$12 = -0.3F * azz.a($$5 * (float) Math.PI);
      $$0.a($$7 * $$10, $$11 - 0.3F * $$9, $$12);
      $$0.a(a.b.rotationDegrees($$9 * -45.0F));
      $$0.a(a.d.rotationDegrees($$7 * $$9 * -30.0F));
      this.a($$0, $$1, $$2, $$6);
      $$0.b();
   }

   private void a(fld $$0, grn $$1, int $$2, float $$3, float $$4, float $$5) {
      float $$6 = azz.c($$5);
      float $$7 = -0.2F * azz.a($$5 * (float) Math.PI);
      float $$8 = -0.4F * azz.a($$6 * (float) Math.PI);
      $$0.a(0.0F, -$$7 / 2.0F, $$8);
      float $$9 = this.a($$3);
      $$0.a(0.0F, 0.04F + $$4 * -1.2F + $$9 * -0.5F, -0.72F);
      $$0.a(a.b.rotationDegrees($$9 * -85.0F));
      if (!this.au.t.co()) {
         $$0.a();
         $$0.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$1, $$2, bxw.b);
         this.a($$0, $$1, $$2, bxw.a);
         $$0.b();
      }

      float $$10 = azz.a($$6 * (float) Math.PI);
      $$0.a(a.b.rotationDegrees($$10 * 20.0F));
      $$0.b(2.0F, 2.0F, 2.0F);
      this.a($$0, $$1, $$2, this.aw);
   }

   private void a(fld $$0, grn $$1, int $$2, dak $$3) {
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.a(a.f.rotationDegrees(180.0F));
      $$0.b(0.38F, 0.38F, 0.38F);
      $$0.a(-0.5F, -0.5F, 0.0F);
      $$0.b(0.0078125F, 0.0078125F, 0.0078125F);
      ezt $$4 = $$3.a(kl.M);
      ezv $$5 = dax.a($$4, this.au.s);
      flg $$6 = $$1.getBuffer($$5 == null ? a : b);
      Matrix4f $$7 = $$0.c().a();
      $$6.a($$7, -7.0F, 135.0F, 0.0F).a(-1).a(0.0F, 1.0F).c($$2);
      $$6.a($$7, 135.0F, 135.0F, 0.0F).a(-1).a(1.0F, 1.0F).c($$2);
      $$6.a($$7, 135.0F, -7.0F, 0.0F).a(-1).a(1.0F, 0.0F).c($$2);
      $$6.a($$7, -7.0F, -7.0F, 0.0F).a(-1).a(0.0F, 0.0F).c($$2);
      if ($$5 != null) {
         grl $$8 = this.au.at();
         $$8.a($$4, $$5, this.av);
         $$8.a(this.av, $$0, $$1, false, $$2);
      }
   }

   private void a(fld $$0, grn $$1, int $$2, float $$3, float $$4, bxw $$5) {
      boolean $$6 = $$5 != bxw.a;
      float $$7 = $$6 ? 1.0F : -1.0F;
      float $$8 = azz.c($$4);
      float $$9 = -0.3F * azz.a($$8 * (float) Math.PI);
      float $$10 = 0.4F * azz.a($$8 * (float) (Math.PI * 2));
      float $$11 = -0.4F * azz.a($$4 * (float) Math.PI);
      $$0.a($$7 * ($$9 + 0.64000005F), $$10 + -0.6F + $$3 * -0.6F, $$11 + -0.71999997F);
      $$0.a(a.d.rotationDegrees($$7 * 45.0F));
      float $$12 = azz.a($$4 * $$4 * (float) Math.PI);
      float $$13 = azz.a($$8 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees($$7 * $$13 * 70.0F));
      $$0.a(a.f.rotationDegrees($$7 * $$12 * -20.0F));
      gqj $$14 = this.au.t;
      $$0.a($$7 * -1.0F, 3.6F, 3.5F);
      $$0.a(a.f.rotationDegrees($$7 * 120.0F));
      $$0.a(a.b.rotationDegrees(200.0F));
      $$0.a(a.d.rotationDegrees($$7 * -135.0F));
      $$0.a($$7 * 5.6F, 0.0F, 0.0F);
      hdc $$15 = (hdc)this.aC.<gqj>a($$14);
      alr $$16 = $$14.c().a();
      if ($$6) {
         $$15.a($$0, $$1, $$2, $$16, $$14.a(csk.d));
      } else {
         $$15.b($$0, $$1, $$2, $$16, $$14.a(csk.c));
      }
   }

   private void a(fld $$0, float $$1, bxw $$2, dak $$3, csi $$4) {
      float $$5 = (float)$$4.fC() - $$1 + 1.0F;
      float $$6 = $$5 / (float)$$3.a((byf)$$4);
      if ($$6 < 0.8F) {
         float $$7 = azz.e(azz.b($$5 / 4.0F * (float) Math.PI) * 0.1F);
         $$0.a(0.0F, $$7, 0.0F);
      }

      float $$8 = 1.0F - (float)Math.pow((double)$$6, 27.0);
      int $$9 = $$2 == bxw.b ? 1 : -1;
      $$0.a($$8 * 0.6F * (float)$$9, $$8 * -0.5F, $$8 * 0.0F);
      $$0.a(a.d.rotationDegrees((float)$$9 * $$8 * 90.0F));
      $$0.a(a.b.rotationDegrees($$8 * 10.0F));
      $$0.a(a.f.rotationDegrees((float)$$9 * $$8 * 30.0F));
   }

   private void a(fld $$0, float $$1, bxw $$2, dak $$3, csi $$4, float $$5) {
      this.b($$0, $$2, $$5);
      float $$6 = (float)($$4.fC() % 10);
      float $$7 = $$6 - $$1 + 1.0F;
      float $$8 = 1.0F - $$7 / 10.0F;
      float $$9 = -90.0F;
      float $$10 = 60.0F;
      float $$11 = 150.0F;
      float $$12 = -15.0F;
      int $$13 = 2;
      float $$14 = -15.0F + 75.0F * azz.b($$8 * 2.0F * (float) Math.PI);
      if ($$2 != bxw.b) {
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

   private void a(fld $$0, bxw $$1, float $$2) {
      int $$3 = $$1 == bxw.b ? 1 : -1;
      float $$4 = azz.a($$2 * $$2 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees((float)$$3 * (45.0F + $$4 * -20.0F)));
      float $$5 = azz.a(azz.c($$2) * (float) Math.PI);
      $$0.a(a.f.rotationDegrees((float)$$3 * $$5 * -20.0F));
      $$0.a(a.b.rotationDegrees($$5 * -80.0F));
      $$0.a(a.d.rotationDegrees((float)$$3 * -45.0F));
   }

   private void b(fld $$0, bxw $$1, float $$2) {
      int $$3 = $$1 == bxw.b ? 1 : -1;
      $$0.a((float)$$3 * 0.56F, -0.52F + $$2 * -0.6F, -0.72F);
   }

   public void a(float $$0, fld $$1, grn.a $$2, gqm $$3, int $$4) {
      float $$5 = $$3.D($$0);
      bvb $$6 = (bvb)MoreObjects.firstNonNull($$3.aJ, bvb.a);
      float $$7 = $$3.k($$0);
      grg.a $$8 = a($$3);
      float $$9 = azz.h($$0, $$3.cv, $$3.ct);
      float $$10 = azz.h($$0, $$3.cu, $$3.cs);
      $$1.a(a.b.rotationDegrees(($$3.i($$0) - $$9) * 0.1F));
      $$1.a(a.d.rotationDegrees(($$3.j($$0) - $$10) * 0.1F));
      if ($$8.d) {
         float $$11 = $$6 == bvb.a ? $$5 : 0.0F;
         float $$12 = 1.0F - azz.h($$0, this.az, this.ay);
         this.a($$3, $$0, $$7, bvb.a, $$11, this.aw, $$12, $$1, $$2, $$4);
      }

      if ($$8.e) {
         float $$13 = $$6 == bvb.b ? $$5 : 0.0F;
         float $$14 = 1.0F - azz.h($$0, this.aB, this.aA);
         this.a($$3, $$0, $$7, bvb.b, $$13, this.ax, $$14, $$1, $$2, $$4);
      }

      $$2.b();
   }

   @VisibleForTesting
   static grg.a a(gqm $$0) {
      dak $$1 = $$0.fb();
      dak $$2 = $$0.fc();
      boolean $$3 = $$1.a(dao.pj) || $$2.a(dao.pj);
      boolean $$4 = $$1.a(dao.xg) || $$2.a(dao.xg);
      if (!$$3 && !$$4) {
         return grg.a.a;
      } else if ($$0.fz()) {
         return b($$0);
      } else {
         return a($$1) ? grg.a.b : grg.a.a;
      }
   }

   private static grg.a b(gqm $$0) {
      dak $$1 = $$0.fB();
      bvb $$2 = $$0.fA();
      if (!$$1.a(dao.pj) && !$$1.a(dao.xg)) {
         return $$2 == bvb.a && a($$0.fc()) ? grg.a.b : grg.a.a;
      } else {
         return grg.a.a($$2);
      }
   }

   private static boolean a(dak $$0) {
      return $$0.a(dao.xg) && czd.g($$0);
   }

   private void a(gqj $$0, float $$1, float $$2, bvb $$3, float $$4, dak $$5, float $$6, fld $$7, grn $$8, int $$9) {
      if (!$$0.gI()) {
         boolean $$10 = $$3 == bvb.a;
         bxw $$11 = $$10 ? $$0.fy() : $$0.fy().e();
         $$7.a();
         if ($$5.f()) {
            if ($$10 && !$$0.co()) {
               this.a($$7, $$8, $$9, $$6, $$4, $$11);
            }
         } else if ($$5.c(kl.M)) {
            if ($$10 && this.ax.f()) {
               this.a($$7, $$8, $$9, $$2, $$6, $$4);
            } else {
               this.a($$7, $$8, $$9, $$6, $$11, $$4, $$5);
            }
         } else if ($$5.a(dao.xg)) {
            boolean $$12 = czd.g($$5);
            boolean $$13 = $$11 == bxw.b;
            int $$14 = $$13 ? 1 : -1;
            if ($$0.fz() && $$0.fC() > 0 && $$0.fA() == $$3 && !$$12) {
               this.b($$7, $$11, $$6);
               $$7.a((float)$$14 * -0.4785682F, -0.094387F, 0.05731531F);
               $$7.a(a.b.rotationDegrees(-11.935F));
               $$7.a(a.d.rotationDegrees((float)$$14 * 65.3F));
               $$7.a(a.f.rotationDegrees((float)$$14 * -9.785F));
               float $$15 = (float)$$5.a((byf)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
               float $$16 = $$15 / (float)czd.b($$5, $$0);
               if ($$16 > 1.0F) {
                  $$16 = 1.0F;
               }

               if ($$16 > 0.1F) {
                  float $$17 = azz.a(($$15 - 0.1F) * 1.3F);
                  float $$18 = $$16 - 0.1F;
                  float $$19 = $$17 * $$18;
                  $$7.a($$19 * 0.0F, $$19 * 0.004F, $$19 * 0.0F);
               }

               $$7.a($$16 * 0.0F, $$16 * 0.0F, $$16 * 0.04F);
               $$7.b(1.0F, 1.0F, 1.0F + $$16 * 0.2F);
               $$7.a(a.c.rotationDegrees((float)$$14 * 45.0F));
            } else {
               this.a($$4, $$6, $$7, $$14, $$11);
               if ($$12 && $$4 < 0.001F && $$10) {
                  $$7.a((float)$$14 * -0.641864F, 0.0F, 0.0F);
                  $$7.a(a.d.rotationDegrees((float)$$14 * 10.0F));
               }
            }

            this.a($$0, $$5, $$13 ? dai.e : dai.d, $$7, $$8, $$9);
         } else {
            boolean $$20 = $$11 == bxw.b;
            int $$21 = $$20 ? 1 : -1;
            if ($$0.fz() && $$0.fC() > 0 && $$0.fA() == $$3) {
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
                     if (!($$5.h() instanceof dbk)) {
                        $$7.a((float)$$21 * -0.14142136F, 0.08F, 0.14142136F);
                        $$7.a(a.b.rotationDegrees(-102.25F));
                        $$7.a(a.d.rotationDegrees((float)$$21 * 13.365F));
                        $$7.a(a.f.rotationDegrees((float)$$21 * 78.05F));
                     }
                     break;
                  case e:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$21 * -0.2785682F, 0.18344387F, 0.15731531F);
                     $$7.a(a.b.rotationDegrees(-13.935F));
                     $$7.a(a.d.rotationDegrees((float)$$21 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$21 * -9.785F));
                     float $$22 = (float)$$5.a((byf)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
                     float $$23 = $$22 / 20.0F;
                     $$23 = ($$23 * $$23 + $$23 * 2.0F) / 3.0F;
                     if ($$23 > 1.0F) {
                        $$23 = 1.0F;
                     }

                     if ($$23 > 0.1F) {
                        float $$24 = azz.a(($$22 - 0.1F) * 1.3F);
                        float $$25 = $$23 - 0.1F;
                        float $$26 = $$24 * $$25;
                        $$7.a($$26 * 0.0F, $$26 * 0.004F, $$26 * 0.0F);
                     }

                     $$7.a($$23 * 0.0F, $$23 * 0.0F, $$23 * 0.04F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$23 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$21 * 45.0F));
                     break;
                  case f:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$21 * -0.5F, 0.7F, 0.1F);
                     $$7.a(a.b.rotationDegrees(-55.0F));
                     $$7.a(a.d.rotationDegrees((float)$$21 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$21 * -9.785F));
                     float $$27 = (float)$$5.a((byf)$$0) - ((float)$$0.fC() - $$1 + 1.0F);
                     float $$28 = $$27 / 10.0F;
                     if ($$28 > 1.0F) {
                        $$28 = 1.0F;
                     }

                     if ($$28 > 0.1F) {
                        float $$29 = azz.a(($$27 - 0.1F) * 1.3F);
                        float $$30 = $$28 - 0.1F;
                        float $$31 = $$29 * $$30;
                        $$7.a($$31 * 0.0F, $$31 * 0.004F, $$31 * 0.0F);
                     }

                     $$7.a(0.0F, 0.0F, $$28 * 0.2F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$28 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$21 * 45.0F));
                     break;
                  case j:
                     this.a($$7, $$1, $$11, $$5, $$0, $$6);
                     break;
                  case k:
                     this.a($$4, $$6, $$7, $$21, $$11);
               }
            } else if ($$0.fv()) {
               this.b($$7, $$11, $$6);
               $$7.a((float)$$21 * -0.4F, 0.8F, 0.3F);
               $$7.a(a.d.rotationDegrees((float)$$21 * 65.0F));
               $$7.a(a.f.rotationDegrees((float)$$21 * -85.0F));
            } else {
               this.a($$4, $$6, $$7, $$21, $$11);
            }

            this.a($$0, $$5, $$20 ? dai.e : dai.d, $$7, $$8, $$9);
         }

         $$7.b();
      }
   }

   private void a(float $$0, float $$1, fld $$2, int $$3, bxw $$4) {
      float $$5 = -0.4F * azz.a(azz.c($$0) * (float) Math.PI);
      float $$6 = 0.2F * azz.a(azz.c($$0) * (float) (Math.PI * 2));
      float $$7 = -0.2F * azz.a($$0 * (float) Math.PI);
      $$2.a((float)$$3 * $$5, $$6, $$7);
      this.b($$2, $$4, $$1);
      this.a($$2, $$4, $$0);
   }

   private boolean a(dak $$0, dak $$1) {
      return dak.a($$0, $$1) ? true : !this.aE.a($$1);
   }

   public void a() {
      this.az = this.ay;
      this.aB = this.aA;
      gqm $$0 = this.au.t;
      dak $$1 = $$0.fb();
      dak $$2 = $$0.fc();
      if (this.a(this.aw, $$1)) {
         this.aw = $$1;
      }

      if (this.a(this.ax, $$2)) {
         this.ax = $$2;
      }

      if ($$0.C()) {
         this.ay = azz.a(this.ay - 0.4F, 0.0F, 1.0F);
         this.aA = azz.a(this.aA - 0.4F, 0.0F, 1.0F);
      } else {
         float $$3 = $$0.H(1.0F);
         float $$4 = this.aw != $$1 ? 0.0F : $$3 * $$3 * $$3;
         float $$5 = this.ax != $$2 ? 0.0F : 1.0F;
         this.ay = this.ay + azz.a($$4 - this.ay, -0.4F, 0.4F);
         this.aA = this.aA + azz.a($$5 - this.aA, -0.4F, 0.4F);
      }

      if (this.ay < 0.1F) {
         this.aw = $$1;
      }

      if (this.aA < 0.1F) {
         this.ax = $$2;
      }
   }

   public void a(bvb $$0) {
      if ($$0 == bvb.a) {
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

      public static grg.a a(bvb $$0) {
         return $$0 == bvb.a ? b : c;
      }
   }
}
