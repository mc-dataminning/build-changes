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

public class gkz implements AutoCloseable {
   private static final alz e = alz.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   private static final boolean g = false;
   public static final float b = 0.05F;
   private static final float h = 1000.0F;
   private final fme i;
   private final avv j;
   private final bam k = bam.a();
   private float l;
   public final glc c;
   private final glr m;
   private int n;
   private float o;
   private float p;
   private float q;
   private float r;
   private boolean s = true;
   private boolean t = true;
   private long u;
   private boolean v;
   private long w = ae.c();
   private final glh x;
   private final hba y = new hba();
   private boolean z;
   private float A = 1.0F;
   private float B;
   private float C;
   public static final int d = 40;
   @Nullable
   private cxo D;
   private int E;
   private float F;
   private float G;
   private final ffy H = new ffy(3);
   @Nullable
   private alz I;
   private boolean J;
   private final fln K = new fln();

   public gkz(fme $$0, glc $$1, avv $$2, glr $$3) {
      this.i = $$0;
      this.j = $$2;
      this.c = $$1;
      this.x = new glh(this, $$0);
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

   public void a(@Nullable bvj $$0) {
      this.I = null;
      if ($$0 instanceof cmi) {
         this.a(alz.b("creeper"));
      } else if ($$0 instanceof cnh) {
         this.a(alz.b("spider"));
      } else if ($$0 instanceof cmm) {
         this.a(alz.b("invert"));
      }
   }

   private void a(alz $$0) {
      this.I = $$0;
      this.J = true;
   }

   public void d() {
      float $$0 = (float)this.i.n.r();
      if (!($$0 < 1.0F)) {
         gln $$1 = this.i.ab().a(e, glg.h);
         if ($$1 != null) {
            $$1.a("Radius", $$0);
            $$1.a(this.i.h(), this.H);
         }
      }
   }

   public void a(avy $$0) {
      try {
         this.i.ab().a($$0, gkt.Y, gkt.Z, gkt.i);
      } catch (gma.b | IOException var3) {
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
      if (this.i.s.t().i()) {
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
   public alz f() {
      return this.I;
   }

   public void a(int $$0, int $$1) {
      this.H.b();
      this.i.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bvj $$1 = this.i.ao();
      if ($$1 != null) {
         if (this.i.s != null && this.i.t != null) {
            bpr.a().a("pick");
            double $$2 = this.i.t.gH();
            double $$3 = this.i.t.gI();
            fbv $$4 = this.a($$1, $$2, $$3, $$0);
            this.i.w = $$4;
            this.i.v = $$4 instanceof fbu $$5 ? $$5.a() : null;
            bpr.a().c();
         }
      }
   }

   private fbv a(bvj $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = bae.k($$4);
      fbx $$6 = $$0.m($$3);
      fbv $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != fbv.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      fbx $$9 = $$0.g($$3);
      fbx $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      fbs $$12 = $$0.cR().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      fbu $$13 = cqr.a($$0, $$6, $$10, $$12, bvo.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static fbv a(fbv $$0, fbx $$1, double $$2) {
      fbx $$3 = $$0.g();
      if (!$$3.a((ka)$$1, $$2)) {
         fbx $$4 = $$0.g();
         jm $$5 = jm.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return fbt.a($$4, $$5, jh.a((ka)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.i.ao() instanceof gkc $$0) {
         fmi $$1 = this.i.n;
         boolean $$2 = $$1.aE().a();
         float $$3 = $$1.an().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.p = this.o;
      this.o = this.o + ($$4 - this.o) * 0.5F;
      this.o = bae.a(this.o, 0.1F, 1.5F);
   }

   private float a(fln $$0, float $$1, boolean $$2) {
      if (this.z) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.i.n.ak().c().intValue();
            $$3 *= bae.h($$1, this.p, this.o);
         }

         if ($$0.g() instanceof bwf $$4 && $$4.eE()) {
            float $$5 = Math.min((float)$$4.aP + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         ety $$6 = $$0.k();
         if ($$6 == ety.a || $$6 == ety.b) {
            float $$7 = this.i.n.an().c().floatValue();
            $$3 *= bae.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fgq $$0, float $$1) {
      if (this.i.ao() instanceof bwf $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.eE()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = bae.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eJ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.i.n.ar().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fgq $$0, float $$1) {
      if (this.i.ao() instanceof gkc $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = bae.h($$1, $$2.cg, $$2.ch);
         $$0.a(bae.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(bae.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(bae.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(bae.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.A = $$0;
      this.B = $$1;
      this.C = $$2;
      this.b(false);
      this.a(false);
      this.a(flu.a);
      this.A = 1.0F;
   }

   private void a(fln $$0, float $$1, Matrix4f $$2) {
      if (!this.z) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fgy.a);
         fgq $$4 = new fgq();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.i.n.ae().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.i.ao() instanceof bwf && ((bwf)this.i.ao()).fP();
         if (this.i.n.aE().a() && !$$6 && !this.i.n.X && this.i.r.j() != dhe.d) {
            this.x.c();
            this.c.a($$1, $$4, this.m.c(), this.i.t, this.i.aq().a(this.i.t, $$1));
            this.x.b();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.i.n.aE().a() && !$$6) {
            glv.a(this.i, $$4);
         }
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.A != 1.0F) {
         $$1.translate(this.B, -this.C, 0.0F);
         $$1.scale(this.A, this.A, 1.0F);
      }

      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.i.aO().k() / (float)this.i.aO().l(), 0.05F, this.g());
   }

   public float g() {
      return this.l * 4.0F;
   }

   public static float a(bwf $$0, float $$1) {
      buo $$2 = $$0.c(buq.p);
      return !$$2.a(200) ? 1.0F : 0.7F + bae.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(flu $$0, boolean $$1) {
      if (!this.i.aC() && this.i.n.n && (!this.i.n.ac().c() || !this.i.o.d())) {
         if (ae.c() - this.w > 500L) {
            this.i.b(false);
         }
      } else {
         this.w = ae.c();
      }

      if (!this.i.y) {
         bps $$2 = bpr.a();
         boolean $$3 = this.i.c();
         int $$4 = (int)(this.i.o.e() * (double)this.i.aO().o() / (double)this.i.aO().m());
         int $$5 = (int)(this.i.o.f() * (double)this.i.aO().p() / (double)this.i.aO().n());
         RenderSystem.viewport(0, 0, this.i.aO().k(), this.i.aO().l());
         if ($$3 && $$1 && this.i.s != null) {
            $$2.a("level");
            this.a($$0);
            this.o();
            this.i.f.b();
            if (this.I != null && this.J) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               gln $$6 = this.i.ab().a(this.I, glg.h);
               if ($$6 != null) {
                  $$6.a(this.i.h(), this.H);
               }
            }

            this.i.h().a(true);
         }

         fft $$7 = this.i.aO();
         RenderSystem.clear(256);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fgy.b);
         float $$9 = 1000.0F;
         Matrix4fStack $$10 = RenderSystem.getModelViewStack();
         $$10.pushMatrix();
         $$10.translation(0.0F, 0.0F, -10000.0F);
         ffm.d();
         fnq $$11 = new fnq(this.i, this.m.c());
         $$11.c().a(0.0F, 0.0F, -1000.0F);
         if ($$3 && $$1 && this.i.s != null) {
            $$2.b("gui");
            if (!this.i.n.X) {
               this.a($$11, $$0.a(false));
            }

            this.i.m.a($$11, $$0);
            $$11.d();
            RenderSystem.clear(256);
            $$2.c();
         }

         if (this.i.aM() != null) {
            try {
               this.i.aM().a($$11, $$4, $$5, $$0.a());
            } catch (Throwable var18) {
               o $$13 = o.a(var18, "Rendering overlay");
               p $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.i.aM().getClass().getCanonicalName());
               throw new z($$13);
            }
         } else if ($$3 && this.i.z != null) {
            try {
               this.i.z.c($$11, $$4, $$5, $$0.a());
            } catch (Throwable var17) {
               o $$16 = o.a(var17, "Rendering screen");
               p $$17 = $$16.a("Screen render details");
               $$17.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               $$17.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.i.o.e(), this.i.o.f()));
               $$17.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.i.aO().o(),
                        this.i.aO().p(),
                        this.i.aO().k(),
                        this.i.aO().l(),
                        this.i.aO().s()
                     )
               );
               throw new z($$16);
            }

            try {
               if (this.i.z != null) {
                  this.i.z.y();
               }
            } catch (Throwable var16) {
               o $$19 = o.a(var16, "Narrating screen");
               p $$20 = $$19.a("Screen details");
               $$20.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               throw new z($$19);
            }
         }

         if ($$3 && $$1 && this.i.s != null) {
            this.i.m.b($$11, $$0);
         }

         if ($$3) {
            try (bpx $$21 = $$2.d("toasts")) {
               this.i.aA().a($$11);
            }
         }

         $$11.d();
         $$10.popMatrix();
         this.H.a();
      }
   }

   private void o() {
      if (!this.v && this.i.T()) {
         long $$0 = ae.c();
         if ($$0 - this.u >= 1000L) {
            this.u = $$0;
            hfu $$1 = this.i.V();
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
         ffq $$1 = fmm.a(this.i.h());
         ae.h().execute(() -> {
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

            try (ffq $$6 = new ffq(64, 64, false)) {
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
         bvj $$0 = this.i.ao();
         boolean $$1 = $$0 instanceof cpw && !this.i.n.X;
         if ($$1 && !((cpw)$$0).gh().e) {
            cxo $$2 = ((bwf)$$0).eX();
            fbv $$3 = this.i.w;
            if ($$3 != null && $$3.d() == fbv.a.b) {
               jh $$4 = ((fbt)$$3).b();
               dxu $$5 = this.i.s.a_($$4);
               if (this.i.r.j() == dhe.d) {
                  $$1 = $$5.c(this.i.s, $$4) != null;
               } else {
                  dxy $$6 = new dxy(this.i.s, $$4, false);
                  kd<dkl> $$7 = this.i.s.K_().e(mb.f);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(flu $$0) {
      float $$1 = $$0.a(true);
      this.x.a($$1);
      if (this.i.ao() == null) {
         this.i.a(this.i.t);
      }

      this.a($$1);
      bps $$2 = bpr.a();
      $$2.a("center");
      boolean $$3 = this.p();
      $$2.b("camera");
      fln $$4 = this.K;
      bvj $$5 = (bvj)(this.i.ao() == null ? this.i.t : this.i.ao());
      float $$6 = this.i.s.t().a($$5) ? 1.0F : $$1;
      $$4.a(this.i.s, $$5, !this.i.n.aE().a(), this.i.n.aE().b(), $$6);
      this.l = (float)(this.i.n.aH() * 16);
      float $$7 = this.a($$4, $$1, true);
      Matrix4f $$8 = this.b($$7);
      fgq $$9 = new fgq();
      this.a($$9, $$4.p());
      if (this.i.n.ae().c()) {
         this.b($$9, $$4.p());
      }

      $$8.mul($$9.c().a());
      float $$10 = this.i.n.am().c().floatValue();
      float $$11 = bae.h($$1, this.i.t.cH, this.i.t.cG) * $$10 * $$10;
      if ($$11 > 0.0F) {
         int $$12 = this.i.t.b(buq.i) ? 7 : 20;
         float $$13 = 5.0F / ($$11 * $$11 + 5.0F) - $$11 * 0.04F;
         $$13 *= $$13;
         Vector3f $$14 = new Vector3f(0.0F, bae.g / 2.0F, bae.g / 2.0F);
         float $$15 = ((float)this.n + $$1) * (float)$$12 * (float) (Math.PI / 180.0);
         $$8.rotate($$15, $$14);
         $$8.scale(1.0F / $$13, 1.0F, 1.0F);
         $$8.rotate(-$$15, $$14);
      }

      float $$16 = Math.max($$7, (float)this.i.n.ak().c().intValue());
      Matrix4f $$17 = this.b($$16);
      RenderSystem.setProjectionMatrix($$8, fgy.a);
      Quaternionf $$18 = $$4.f().conjugate(new Quaternionf());
      Matrix4f $$19 = new Matrix4f().rotation($$18);
      this.i.f.a($$4.b(), $$19, $$17);
      this.i.h().a(true);
      this.i.f.a(this.H, $$0, $$3, $$4, this, this.x, $$19, $$8);
      $$2.b("hand");
      if (this.s) {
         RenderSystem.clear(256);
         this.a($$4, $$1, $$19);
      }

      $$2.c();
   }

   public void h() {
      this.D = null;
      this.i.aH().a();
      this.K.o();
      this.v = false;
   }

   public void a(cxo $$0) {
      this.D = $$0;
      this.E = 40;
      this.F = this.k.i() * 2.0F - 1.0F;
      this.G = this.k.i() * 2.0F - 1.0F;
   }

   private void a(fnq $$0, float $$1) {
      if (this.D != null && this.E > 0) {
         int $$2 = 40 - this.E;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.F * (float)($$0.a() / 4);
         float $$9 = this.G * (float)($$0.b() / 4);
         fgq $$10 = $$0.c();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * bae.e(bae.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * bae.e(bae.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * bae.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * bae.e(bae.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * bae.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * bae.b($$3 * 8.0F)));
         $$0.a($$1x -> this.i.as().a(this.D, cxm.i, 15728880, hba.d, $$10, $$1x, this.i.s, 0));
         $$10.b();
      }
   }

   public fme i() {
      return this.i;
   }

   public float c(float $$0) {
      return bae.h($$0, this.r, this.q);
   }

   public float j() {
      return this.l;
   }

   public fln k() {
      return this.K;
   }

   public glh l() {
      return this.x;
   }

   public hba m() {
      return this.y;
   }
}
