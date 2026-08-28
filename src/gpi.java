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

public class gpi implements AutoCloseable {
   private static final alg e = alg.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   private static final boolean g = false;
   public static final float b = 0.05F;
   private static final float h = 1000.0F;
   private static final float i = 20.0F;
   private static final float j = 7.0F;
   private final fos k;
   private final avd l;
   private final azv m = azv.a();
   private float n;
   public final gpl c;
   private final gqa o;
   private float p;
   private float q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = af.c();
   private final gpp A;
   private final hif B = new hif();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int d = 40;
   @Nullable
   private cyy G;
   private int H;
   private float I;
   private float J;
   private final fik K = new fik(3);
   @Nullable
   private alg L;
   private boolean M;
   private final fnz N = new fnz();

   public gpi(fos $$0, gpl $$1, avd $$2, gqa $$3) {
      this.k = $$0;
      this.l = $$2;
      this.c = $$1;
      this.A = new gpp(this, $$0);
      this.o = $$3;
   }

   @Override
   public void close() {
      this.A.close();
      this.B.close();
      this.K.close();
   }

   public void a(boolean $$0) {
      this.v = $$0;
   }

   public void b(boolean $$0) {
      this.w = $$0;
   }

   public void c(boolean $$0) {
      this.C = $$0;
   }

   public boolean a() {
      return this.C;
   }

   public void b() {
      this.L = null;
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable bwd $$0) {
      this.L = null;
      if ($$0 instanceof cnl) {
         this.a(alg.b("creeper"));
      } else if ($$0 instanceof cok) {
         this.a(alg.b("spider"));
      } else if ($$0 instanceof cnp) {
         this.a(alg.b("invert"));
      }
   }

   private void a(alg $$0) {
      this.L = $$0;
      this.M = true;
   }

   public void d() {
      float $$0 = (float)this.k.n.r();
      if (!($$0 < 1.0F)) {
         gpw $$1 = this.k.ab().a(e, gpo.h);
         if ($$1 != null) {
            $$1.a("Radius", $$0);
            $$1.a(this.k.h(), this.K);
         }
      }
   }

   public void a(avg $$0) {
      try {
         this.k.ab().a($$0, gpc.Z, gpc.aa, gpc.i);
      } catch (gqj.b | IOException var3) {
         throw new RuntimeException("Could not preload shaders for loading UI", var3);
      }
   }

   public void e() {
      this.n();
      this.A.a();
      gop $$0 = this.k.t;
      if (this.k.ao() == null) {
         this.k.a($$0);
      }

      this.N.a();
      this.c.a();
      float $$1 = $$0.cv;
      float $$2 = $$0.a(bvj.i, 1.0F);
      if (!($$1 > 0.0F) && !($$2 > 0.0F)) {
         this.q = 0.0F;
      } else {
         this.q = ($$1 * 20.0F + $$2 * 7.0F) / ($$1 + $$2);
         this.p = this.p + this.q;
      }

      if (this.k.s.u().i()) {
         this.k.f.a(this.N);
         this.u = this.t;
         if (this.k.m.j().c()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         if (this.H > 0) {
            this.H--;
            if (this.H == 0) {
               this.G = null;
            }
         }
      }
   }

   @Nullable
   public alg f() {
      return this.L;
   }

   public void a(int $$0, int $$1) {
      this.K.b();
      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bwd $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.s != null && this.k.t != null) {
            bql.a().a("pick");
            double $$2 = this.k.t.gK();
            double $$3 = this.k.t.gL();
            feg $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.w = $$4;
            this.k.v = $$4 instanceof fef $$5 ? $$5.a() : null;
            bql.a().c();
         }
      }
   }

   private feg a(bwd $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = azm.k($$4);
      fei $$6 = $$0.n($$3);
      feg $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != feg.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      fei $$9 = $$0.h($$3);
      fei $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      fed $$12 = $$0.cR().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      fef $$13 = cru.a($$0, $$6, $$10, $$12, bwk.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static feg a(feg $$0, fei $$1, double $$2) {
      fei $$3 = $$0.g();
      if (!$$3.a((jo)$$1, $$2)) {
         fei $$4 = $$0.g();
         ja $$5 = ja.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return fee.a($$4, $$5, iu.a((jo)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.k.ao() instanceof gom $$0) {
         fow $$1 = this.k.n;
         boolean $$2 = $$1.aE().a();
         float $$3 = $$1.an().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.s = this.r;
      this.r = this.r + ($$4 - this.r) * 0.5F;
      this.r = azm.a(this.r, 0.1F, 1.5F);
   }

   private float a(fnz $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.k.n.ak().c().intValue();
            $$3 *= azm.h($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bxc $$4 && $$4.eG()) {
            float $$5 = Math.min((float)$$4.aP + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         ewi $$6 = $$0.k();
         if ($$6 == ewi.a || $$6 == ewi.b) {
            float $$7 = this.k.n.an().c().floatValue();
            $$3 *= azm.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fjc $$0, float $$1) {
      if (this.k.ao() instanceof bxc $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.eG()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = azm.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eL();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.n.ar().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fjc $$0, float $$1) {
      if (this.k.ao() instanceof gom $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = azm.h($$1, $$2.bU, $$2.bV);
         $$0.a(azm.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(azm.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(azm.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(azm.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(foh.a);
      this.D = 1.0F;
   }

   private void a(fnz $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fgl.a);
         fjc $$4 = new fjc();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.k.n.ae().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.k.ao() instanceof bxc && ((bxc)this.k.ao()).fQ();
         if (this.k.n.aE().a() && !$$6 && !this.k.n.X && this.k.r.i() != dis.d) {
            this.A.c();
            this.c.a($$1, $$4, this.o.c(), this.k.t, this.k.aq().a(this.k.t, $$1));
            this.A.b();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.k.n.aE().a() && !$$6) {
            gps.a $$7 = this.o.c();
            gqe.a(this.k, $$4, $$7);
            $$7.b();
         }
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.k.aO().k() / (float)this.k.aO().l(), 0.05F, this.g());
   }

   public float g() {
      return this.n * 4.0F;
   }

   public static float a(bxc $$0, float $$1) {
      bvh $$2 = $$0.c(bvj.p);
      return !$$2.a(200) ? 1.0F : 0.7F + azm.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(foh $$0, boolean $$1) {
      if (!this.k.aC() && this.k.n.n && (!this.k.n.ac().c() || !this.k.o.d())) {
         if (af.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = af.c();
      }

      if (!this.k.y) {
         bqm $$2 = bql.a();
         boolean $$3 = this.k.c();
         int $$4 = (int)(this.k.o.e() * (double)this.k.aO().o() / (double)this.k.aO().m());
         int $$5 = (int)(this.k.o.f() * (double)this.k.aO().p() / (double)this.k.aO().n());
         RenderSystem.viewport(0, 0, this.k.aO().k(), this.k.aO().l());
         if ($$3 && $$1 && this.k.s != null) {
            $$2.a("level");
            this.a($$0);
            this.o();
            this.k.f.b();
            if (this.L != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               gpw $$6 = this.k.ab().a(this.L, gpo.h);
               if ($$6 != null) {
                  $$6.a(this.k.h(), this.K);
               }
            }

            this.k.h().a(true);
         }

         fif $$7 = this.k.aO();
         RenderSystem.clear(256);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fgl.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         fhy.d();
         fro $$10 = new fro(this.k, this.o.c());
         if ($$3 && $$1 && this.k.s != null) {
            $$2.b("gui");
            if (!this.k.n.X) {
               this.a($$10, $$0.a(false));
            }

            this.k.m.a($$10, $$0);
            $$10.d();
            RenderSystem.clear(256);
            $$2.c();
         }

         if (this.k.aM() != null) {
            try {
               this.k.aM().a($$10, $$4, $$5, $$0.a());
            } catch (Throwable var17) {
               o $$12 = o.a(var17, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.k.aM().getClass().getCanonicalName());
               throw new z($$12);
            }
         } else if ($$3 && this.k.z != null) {
            try {
               this.k.z.c($$10, $$4, $$5, $$0.a());
            } catch (Throwable var16) {
               o $$15 = o.a(var16, "Rendering screen");
               p $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.k.z.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.k.o.e(), this.k.o.f()));
               $$16.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aO().o(),
                        this.k.aO().p(),
                        this.k.aO().k(),
                        this.k.aO().l(),
                        this.k.aO().s()
                     )
               );
               throw new z($$15);
            }

            try {
               if (this.k.z != null) {
                  this.k.z.y();
               }
            } catch (Throwable var15) {
               o $$18 = o.a(var15, "Narrating screen");
               p $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.k.z.getClass().getCanonicalName());
               throw new z($$18);
            }
         }

         if ($$3 && $$1 && this.k.s != null) {
            this.k.m.b($$10, $$0);
         }

         if ($$3) {
            try (bqr $$20 = $$2.d("toasts")) {
               this.k.aA().a($$10);
            }
         }

         $$10.d();
         $$9.popMatrix();
         this.K.a();
      }
   }

   private void o() {
      if (!this.y && this.k.T()) {
         long $$0 = af.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            hna $$1 = this.k.V();
            if ($$1 != null && !$$1.af()) {
               $$1.C().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.y = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.k.f.j() > 10 && this.k.f.o()) {
         fic $$1 = fpa.a(this.k.h());
         af.i().execute(() -> {
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

            try (fic $$6 = new fic(64, 64, false)) {
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
      if (!this.w) {
         return false;
      } else {
         bwd $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof cqy && !this.k.n.X;
         if ($$1 && !((cqy)$$0).gj().e) {
            cyy $$2 = ((bxc)$$0).fa();
            feg $$3 = this.k.w;
            if ($$3 != null && $$3.d() == feg.a.b) {
               iu $$4 = ((fee)$$3).b();
               dzz $$5 = this.k.s.a_($$4);
               if (this.k.r.i() == dis.d) {
                  $$1 = $$5.b(this.k.s, $$4) != null;
               } else {
                  ead $$6 = new ead(this.k.s, $$4, false);
                  jr<dma> $$7 = this.k.s.F_().f(mg.i);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(foh $$0) {
      float $$1 = $$0.a(true);
      gop $$2 = this.k.t;
      this.A.a($$1);
      if (this.k.ao() == null) {
         this.k.a($$2);
      }

      this.a($$1);
      bqm $$3 = bql.a();
      $$3.a("center");
      boolean $$4 = this.p();
      $$3.b("camera");
      fnz $$5 = this.N;
      bwd $$6 = (bwd)(this.k.ao() == null ? $$2 : this.k.ao());
      float $$7 = this.k.s.u().a($$6) ? 1.0F : $$1;
      $$5.a(this.k.s, $$6, !this.k.n.aE().a(), this.k.n.aE().b(), $$7);
      this.n = (float)(this.k.n.aH() * 16);
      float $$8 = this.a($$5, $$1, true);
      Matrix4f $$9 = this.b($$8);
      fjc $$10 = new fjc();
      this.a($$10, $$5.p());
      if (this.k.n.ae().c()) {
         this.b($$10, $$5.p());
      }

      $$9.mul($$10.c().a());
      float $$11 = this.k.n.am().c().floatValue();
      float $$12 = azm.h($$1, $$2.cw, $$2.cv);
      float $$13 = $$2.a(bvj.i, $$1);
      float $$14 = Math.max($$12, $$13) * $$11 * $$11;
      if ($$14 > 0.0F) {
         float $$15 = 5.0F / ($$14 * $$14 + 5.0F) - $$14 * 0.04F;
         $$15 *= $$15;
         Vector3f $$16 = new Vector3f(0.0F, azm.g / 2.0F, azm.g / 2.0F);
         float $$17 = (this.p + $$1 * this.q) * (float) (Math.PI / 180.0);
         $$9.rotate($$17, $$16);
         $$9.scale(1.0F / $$15, 1.0F, 1.0F);
         $$9.rotate(-$$17, $$16);
      }

      float $$18 = Math.max($$8, (float)this.k.n.ak().c().intValue());
      Matrix4f $$19 = this.b($$18);
      RenderSystem.setProjectionMatrix($$9, fgl.a);
      Quaternionf $$20 = $$5.f().conjugate(new Quaternionf());
      Matrix4f $$21 = new Matrix4f().rotation($$20);
      this.k.f.a($$5.b(), $$21, $$19);
      this.k.h().a(true);
      this.k.f.a(this.K, $$0, $$4, $$5, this, $$21, $$9);
      $$3.b("hand");
      if (this.v) {
         RenderSystem.clear(256);
         this.a($$5, $$1, $$21);
      }

      $$3.c();
   }

   public void h() {
      this.G = null;
      this.k.aH().a();
      this.N.o();
      this.y = false;
   }

   public void a(cyy $$0) {
      this.G = $$0;
      this.H = 40;
      this.I = this.m.i() * 2.0F - 1.0F;
      this.J = this.m.i() * 2.0F - 1.0F;
   }

   private void a(fro $$0, float $$1) {
      if (this.G != null && this.H > 0) {
         int $$2 = 40 - this.H;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.I * (float)($$0.a() / 4);
         float $$9 = this.J * (float)($$0.b() / 4);
         fjc $$10 = $$0.c();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * azm.e(azm.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * azm.e(azm.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * azm.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * azm.e(azm.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * azm.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * azm.b($$3 * 8.0F)));
         $$0.a($$1x -> this.k.as().a(this.G, cyw.i, 15728880, hif.d, $$10, $$1x, this.k.s, 0));
         $$10.b();
      }
   }

   public fos i() {
      return this.k;
   }

   public float c(float $$0) {
      return azm.h($$0, this.u, this.t);
   }

   public float j() {
      return this.n;
   }

   public fnz k() {
      return this.N;
   }

   public gpp l() {
      return this.A;
   }

   public hif m() {
      return this.B;
   }
}
