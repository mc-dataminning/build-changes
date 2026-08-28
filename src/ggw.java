import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class ggw implements AutoCloseable {
   private static final alc e = alc.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   private static final boolean g = false;
   public static final float b = 0.05F;
   private static final float h = 1000.0F;
   private final fil i;
   private final aut j;
   private final azl k = azl.a();
   private float l;
   public final ggz c;
   private final gho m;
   private int n;
   private float o;
   private float p;
   private float q;
   private float r;
   private boolean s = true;
   private boolean t = true;
   private long u;
   private boolean v;
   private long w = ad.c();
   private final ghe x;
   private final gws y = new gws();
   private boolean z;
   private float A = 1.0F;
   private float B;
   private float C;
   public static final int d = 40;
   @Nullable
   private cvp D;
   private int E;
   private float F;
   private float G;
   private final fcm H = new fcm(3);
   @Nullable
   private alc I;
   private boolean J;
   private final fhu K = new fhu();

   public ggw(fil $$0, ggz $$1, aut $$2, gho $$3) {
      this.i = $$0;
      this.j = $$2;
      this.c = $$1;
      this.x = new ghe(this, $$0);
      this.m = $$3;
   }

   @Override
   public void close() {
      this.x.close();
      this.y.close();
      this.H.close();
   }

   public void a(boolean $$0) {
      this.s = $$0;
   }

   public void b(boolean $$0) {
      this.t = $$0;
   }

   public void c(boolean $$0) {
      this.z = $$0;
   }

   public boolean a() {
      return this.z;
   }

   public void b() {
      this.I = null;
   }

   public void c() {
      this.J = !this.J;
   }

   public void a(@Nullable bto $$0) {
      this.I = null;
      if ($$0 instanceof ckm) {
         this.a(alc.b("creeper"));
      } else if ($$0 instanceof cll) {
         this.a(alc.b("spider"));
      } else if ($$0 instanceof ckq) {
         this.a(alc.b("invert"));
      }
   }

   private void a(alc $$0) {
      this.I = $$0;
      this.J = true;
   }

   public void d() {
      float $$0 = (float)this.i.n.r();
      if (!($$0 < 1.0F)) {
         ghk $$1 = this.i.ab().a(e, ghd.h);
         if ($$1 != null) {
            $$1.a("Radius", $$0);
            $$1.a(this.i.h(), this.H);
         }
      }
   }

   public void a(auw $$0) {
      try {
         this.i.ab().a($$0, ggq.Y, ggq.Z, ggq.i);
      } catch (ghx.a | IOException var3) {
         throw new RuntimeException("Could not preload shaders for loading UI", var3);
      }
   }

   public void e() {
      this.n();
      this.x.a();
      if (this.i.ao() == null) {
         this.i.a(this.i.t);
      }

      this.K.a();
      this.c.a();
      this.n++;
      if (this.i.s.s().i()) {
         this.i.f.a(this.K);
         this.r = this.q;
         if (this.i.m.j().c()) {
            this.q += 0.05F;
            if (this.q > 1.0F) {
               this.q = 1.0F;
            }
         } else if (this.q > 0.0F) {
            this.q -= 0.0125F;
         }

         if (this.E > 0) {
            this.E--;
            if (this.E == 0) {
               this.D = null;
            }
         }
      }
   }

   @Nullable
   public alc f() {
      return this.I;
   }

   public void a(int $$0, int $$1) {
      this.H.b();
      this.i.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bto $$1 = this.i.ao();
      if ($$1 != null) {
         if (this.i.s != null && this.i.t != null) {
            this.i.aK().a("pick");
            double $$2 = this.i.t.gC();
            double $$3 = this.i.t.gD();
            eyq $$4 = this.a($$1, $$2, $$3, $$0);
            this.i.w = $$4;
            this.i.v = $$4 instanceof eyp $$5 ? $$5.a() : null;
            this.i.aK().c();
         }
      }
   }

   private eyq a(bto $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = azd.k($$4);
      eys $$6 = $$0.m($$3);
      eyq $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != eyq.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      eys $$9 = $$0.g($$3);
      eys $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      eyn $$12 = $$0.cO().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      eyp $$13 = coq.a($$0, $$6, $$10, $$12, btt.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static eyq a(eyq $$0, eys $$1, double $$2) {
      eys $$3 = $$0.g();
      if (!$$3.a((jx)$$1, $$2)) {
         eys $$4 = $$0.g();
         jj $$5 = jj.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return eyo.a($$4, $$5, je.a((jx)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.i.ao() instanceof gfz $$0) {
         fip $$1 = this.i.n;
         boolean $$2 = $$1.aD().a();
         float $$3 = $$1.am().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.p = this.o;
      this.o = this.o + ($$4 - this.o) * 0.5F;
      this.o = azd.a(this.o, 0.1F, 1.5F);
   }

   private float a(fhu $$0, float $$1, boolean $$2) {
      if (this.z) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.i.n.aj().c().intValue();
            $$3 *= azd.h($$1, this.p, this.o);
         }

         if ($$0.g() instanceof buk $$4 && $$4.eB()) {
            float $$5 = Math.min((float)$$4.aL + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         eqr $$6 = $$0.k();
         if ($$6 == eqr.a || $$6 == eqr.b) {
            float $$7 = this.i.n.am().c().floatValue();
            $$3 *= azd.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fde $$0, float $$1) {
      if (this.i.ao() instanceof buk $$2) {
         float $$3 = (float)$$2.aJ - $$1;
         if ($$2.eB()) {
            float $$4 = Math.min((float)$$2.aL + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aK;
         $$3 = azd.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eI();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.i.n.aq().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fde $$0, float $$1) {
      if (this.i.ao() instanceof gfz $$2) {
         float var7 = $$2.h - $$2.g;
         float $$5 = -($$2.h + var7 * $$1);
         float $$6 = azd.h($$1, $$2.cc, $$2.cd);
         $$0.a(azd.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(azd.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(azd.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(azd.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.A = $$0;
      this.B = $$1;
      this.C = $$2;
      this.b(false);
      this.a(false);
      this.a(fib.a);
      this.A = 1.0F;
   }

   private void a(fhu $$0, float $$1, Matrix4f $$2) {
      if (!this.z) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fdm.a);
         fde $$4 = new fde();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.i.n.ad().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.i.ao() instanceof buk && ((buk)this.i.ao()).fM();
         if (this.i.n.aD().a() && !$$6 && !this.i.n.X && this.i.r.j() != ded.d) {
            this.x.c();
            this.c.a($$1, $$4, this.m.c(), this.i.t, this.i.aq().a(this.i.t, $$1));
            this.x.b();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.i.n.aD().a() && !$$6) {
            ghs.a(this.i, $$4);
         }
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.A != 1.0F) {
         $$1.translate(this.B, -this.C, 0.0F);
         $$1.scale(this.A, this.A, 1.0F);
      }

      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.i.aP().l() / (float)this.i.aP().m(), 0.05F, this.g());
   }

   public float g() {
      return this.l * 4.0F;
   }

   public static float a(buk $$0, float $$1) {
      bsv $$2 = $$0.c(bsx.p);
      return !$$2.a(200) ? 1.0F : 0.7F + azd.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(fib $$0, boolean $$1) {
      if (!this.i.aC() && this.i.n.n && (!this.i.n.ab().c() || !this.i.o.d())) {
         if (ad.c() - this.w > 500L) {
            this.i.b(false);
         }
      } else {
         this.w = ad.c();
      }

      if (!this.i.y) {
         boolean $$2 = this.i.c();
         int $$3 = (int)(this.i.o.e() * (double)this.i.aP().p() / (double)this.i.aP().n());
         int $$4 = (int)(this.i.o.f() * (double)this.i.aP().q() / (double)this.i.aP().o());
         RenderSystem.viewport(0, 0, this.i.aP().l(), this.i.aP().m());
         if ($$2 && $$1 && this.i.s != null) {
            this.i.aK().a("level");
            this.a($$0);
            this.o();
            this.i.f.b();
            if (this.I != null && this.J) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               ghk $$5 = this.i.ab().a(this.I, ghd.h);
               if ($$5 != null) {
                  $$5.a(this.i.h(), this.H);
               }
            }

            this.i.h().a(true);
         }

         fch $$6 = this.i.aP();
         RenderSystem.clear(256);
         Matrix4f $$7 = new Matrix4f().setOrtho(0.0F, (float)((double)$$6.l() / $$6.t()), (float)((double)$$6.m() / $$6.t()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$7, fdm.b);
         Matrix4fStack $$8 = RenderSystem.getModelViewStack();
         $$8.pushMatrix();
         $$8.translation(0.0F, 0.0F, -11000.0F);
         fca.d();
         fjx $$9 = new fjx(this.i, this.m.c());
         if ($$2 && $$1 && this.i.s != null) {
            this.i.aK().b("gui");
            if (!this.i.n.X) {
               this.a($$9, $$0.a(false));
            }

            this.i.m.a($$9, $$0);
            $$9.e();
            RenderSystem.clear(256);
            this.i.aK().c();
         }

         if (this.i.aN() != null) {
            try {
               this.i.aN().a($$9, $$3, $$4, $$0.a());
            } catch (Throwable var15) {
               o $$11 = o.a(var15, "Rendering overlay");
               p $$12 = $$11.a("Overlay render details");
               $$12.a("Overlay name", () -> this.i.aN().getClass().getCanonicalName());
               throw new z($$11);
            }
         } else if ($$2 && this.i.z != null) {
            try {
               this.i.z.c($$9, $$3, $$4, $$0.a());
            } catch (Throwable var14) {
               o $$14 = o.a(var14, "Rendering screen");
               p $$15 = $$14.a("Screen render details");
               $$15.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               $$15.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$3, $$4, this.i.o.e(), this.i.o.f()));
               $$15.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.i.aP().p(),
                        this.i.aP().q(),
                        this.i.aP().l(),
                        this.i.aP().m(),
                        this.i.aP().t()
                     )
               );
               throw new z($$14);
            }

            try {
               if (this.i.z != null) {
                  this.i.z.z();
               }
            } catch (Throwable var13) {
               o $$17 = o.a(var13, "Narrating screen");
               p $$18 = $$17.a("Screen details");
               $$18.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               throw new z($$17);
            }
         }

         if ($$2 && $$1 && this.i.s != null) {
            this.i.m.b($$9, $$0);
         }

         if ($$2) {
            this.i.aK().a("toasts");
            this.i.aA().a($$9);
            this.i.aK().c();
         }

         $$9.e();
         $$8.popMatrix();
         this.H.a();
      }
   }

   private void o() {
      if (!this.v && this.i.T()) {
         long $$0 = ad.c();
         if ($$0 - this.u >= 1000L) {
            this.u = $$0;
            hbj $$1 = this.i.V();
            if ($$1 != null && !$$1.af()) {
               $$1.C().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.v = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.i.f.j() > 10 && this.i.f.o()) {
         fce $$1 = fiu.a(this.i.h());
         ad.h().execute(() -> {
            int $$2 = $$1.a();
            int $$3 = $$1.b();
            int $$4 = 0;
            int $$5 = 0;
            if ($$2 > $$3) {
               $$4 = ($$2 - $$3) / 2;
               $$2 = $$3;
            } else {
               $$5 = ($$3 - $$2) / 2;
               $$3 = $$2;
            }

            try (fce $$6 = new fce(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               f.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean p() {
      if (!this.t) {
         return false;
      } else {
         bto $$0 = this.i.ao();
         boolean $$1 = $$0 instanceof cnu && !this.i.n.X;
         if ($$1 && !((cnu)$$0).gd().e) {
            cvp $$2 = ((buk)$$0).eW();
            eyq $$3 = this.i.w;
            if ($$3 != null && $$3.d() == eyq.a.b) {
               je $$4 = ((eyo)$$3).b();
               duo $$5 = this.i.s.a_($$4);
               if (this.i.r.j() == ded.d) {
                  $$1 = $$5.b(this.i.s, $$4) != null;
               } else {
                  dus $$6 = new dus(this.i.s, $$4, false);
                  ka<dhj> $$7 = this.i.s.F_().d(lv.f);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(fib $$0) {
      float $$1 = $$0.a(true);
      this.x.a($$1);
      if (this.i.ao() == null) {
         this.i.a(this.i.t);
      }

      this.a($$1);
      this.i.aK().a("center");
      boolean $$2 = this.p();
      this.i.aK().b("camera");
      fhu $$3 = this.K;
      bto $$4 = (bto)(this.i.ao() == null ? this.i.t : this.i.ao());
      float $$5 = this.i.s.s().a($$4) ? 1.0F : $$1;
      $$3.a(this.i.s, $$4, !this.i.n.aD().a(), this.i.n.aD().b(), $$5);
      this.l = (float)(this.i.n.aG() * 16);
      float $$6 = this.a($$3, $$1, true);
      Matrix4f $$7 = this.b($$6);
      fde $$8 = new fde();
      this.a($$8, $$3.p());
      if (this.i.n.ad().c()) {
         this.b($$8, $$3.p());
      }

      $$7.mul($$8.c().a());
      float $$9 = this.i.n.al().c().floatValue();
      float $$10 = azd.h($$1, this.i.t.cG, this.i.t.cF) * $$9 * $$9;
      if ($$10 > 0.0F) {
         int $$11 = this.i.t.b(bsx.i) ? 7 : 20;
         float $$12 = 5.0F / ($$10 * $$10 + 5.0F) - $$10 * 0.04F;
         $$12 *= $$12;
         Vector3f $$13 = new Vector3f(0.0F, azd.g / 2.0F, azd.g / 2.0F);
         float $$14 = ((float)this.n + $$1) * (float)$$11 * (float) (Math.PI / 180.0);
         $$7.rotate($$14, $$13);
         $$7.scale(1.0F / $$12, 1.0F, 1.0F);
         $$7.rotate(-$$14, $$13);
      }

      float $$15 = Math.max($$6, (float)this.i.n.aj().c().intValue());
      Matrix4f $$16 = this.b($$15);
      RenderSystem.setProjectionMatrix($$7, fdm.a);
      Quaternionf $$17 = $$3.f().conjugate(new Quaternionf());
      Matrix4f $$18 = new Matrix4f().rotation($$17);
      this.i.f.a($$3.b(), $$18, $$16);
      this.i.h().a(true);
      this.i.f.a(this.H, $$0, $$2, $$3, this, this.x, $$18, $$7);
      this.i.aK().b("hand");
      if (this.s) {
         RenderSystem.clear(256);
         this.a($$3, $$1, $$18);
      }

      this.i.aK().c();
   }

   public void h() {
      this.D = null;
      this.i.aH().a();
      this.K.o();
      this.v = false;
   }

   public void a(cvp $$0) {
      this.D = $$0;
      this.E = 40;
      this.F = this.k.i() * 2.0F - 1.0F;
      this.G = this.k.i() * 2.0F - 1.0F;
   }

   private void a(fjx $$0, float $$1) {
      if (this.D != null && this.E > 0) {
         int $$2 = 40 - this.E;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.F * (float)($$0.a() / 4);
         float $$9 = this.G * (float)($$0.b() / 4);
         fde $$10 = new fde();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * azd.e(azd.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * azd.e(azd.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * azd.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * azd.e(azd.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * azd.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * azd.b($$3 * 8.0F)));
         this.i.as().a(this.D, cvm.i, 15728880, gws.d, $$10, $$0.d(), this.i.s, 0);
         $$10.b();
      }
   }

   public fil i() {
      return this.i;
   }

   public float c(float $$0) {
      return azd.h($$0, this.r, this.q);
   }

   public float j() {
      return this.l;
   }

   public fhu k() {
      return this.K;
   }

   public ghe l() {
      return this.x;
   }

   public gws m() {
      return this.y;
   }
}
