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

public class glo implements AutoCloseable {
   private static final akv e = akv.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   private static final boolean g = false;
   public static final float b = 0.05F;
   private static final float h = 1000.0F;
   private final fli i;
   private final aup j;
   private final azh k = azh.a();
   private float l;
   public final glr c;
   private final gmf m;
   private int n;
   private float o;
   private float p;
   private float q;
   private float r;
   private boolean s = true;
   private boolean t = true;
   private long u;
   private boolean v;
   private long w = af.c();
   private final glv x;
   private final heh y = new heh();
   private boolean z;
   private float A = 1.0F;
   private float B;
   private float C;
   public static final int d = 40;
   @Nullable
   private cwo D;
   private int E;
   private float F;
   private float G;
   private final ffb H = new ffb(3);
   @Nullable
   private akv I;
   private boolean J;
   private final fkq K = new fkq();

   public glo(fli $$0, glr $$1, aup $$2, gmf $$3) {
      this.i = $$0;
      this.j = $$2;
      this.c = $$1;
      this.x = new glv(this, $$0);
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

   public void a(@Nullable buk $$0) {
      this.I = null;
      if ($$0 instanceof clj) {
         this.a(akv.b("creeper"));
      } else if ($$0 instanceof cmi) {
         this.a(akv.b("spider"));
      } else if ($$0 instanceof cln) {
         this.a(akv.b("invert"));
      }
   }

   private void a(akv $$0) {
      this.I = $$0;
      this.J = true;
   }

   public void d() {
      float $$0 = (float)this.i.n.r();
      if (!($$0 < 1.0F)) {
         gmb $$1 = this.i.ab().a(e, glu.h);
         if ($$1 != null) {
            $$1.a("Radius", $$0);
            $$1.a(this.i.h(), this.H);
         }
      }
   }

   public void a(aus $$0) {
      try {
         this.i.ab().a($$0, gli.Z, gli.aa, gli.i);
      } catch (gmo.b | IOException var3) {
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
      if (this.i.s.u().i()) {
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
   public akv f() {
      return this.I;
   }

   public void a(int $$0, int $$1) {
      this.H.b();
      this.i.f.a($$0, $$1);
   }

   public void a(float $$0) {
      buk $$1 = this.i.ao();
      if ($$1 != null) {
         if (this.i.s != null && this.i.t != null) {
            bor.a().a("pick");
            double $$2 = this.i.t.gL();
            double $$3 = this.i.t.gM();
            fax $$4 = this.a($$1, $$2, $$3, $$0);
            this.i.w = $$4;
            this.i.v = $$4 instanceof faw $$5 ? $$5.a() : null;
            bor.a().c();
         }
      }
   }

   private fax a(buk $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayz.k($$4);
      faz $$6 = $$0.m($$3);
      fax $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != fax.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      faz $$9 = $$0.g($$3);
      faz $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      fau $$12 = $$0.cR().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      faw $$13 = cpr.a($$0, $$6, $$10, $$12, bup.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static fax a(fax $$0, faz $$1, double $$2) {
      faz $$3 = $$0.g();
      if (!$$3.a((kb)$$1, $$2)) {
         faz $$4 = $$0.g();
         jn $$5 = jn.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return fav.a($$4, $$5, ji.a((kb)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.i.ao() instanceof gks $$0) {
         flm $$1 = this.i.n;
         boolean $$2 = $$1.aE().a();
         float $$3 = $$1.an().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.p = this.o;
      this.o = this.o + ($$4 - this.o) * 0.5F;
      this.o = ayz.a(this.o, 0.1F, 1.5F);
   }

   private float a(fkq $$0, float $$1, boolean $$2) {
      if (this.z) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.i.n.ak().c().intValue();
            $$3 *= ayz.h($$1, this.p, this.o);
         }

         if ($$0.g() instanceof bvg $$4 && $$4.eE()) {
            float $$5 = Math.min((float)$$4.aP + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         eta $$6 = $$0.k();
         if ($$6 == eta.a || $$6 == eta.b) {
            float $$7 = this.i.n.an().c().floatValue();
            $$3 *= ayz.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fft $$0, float $$1) {
      if (this.i.ao() instanceof bvg $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.eE()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = ayz.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eJ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.i.n.ar().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fft $$0, float $$1) {
      if (this.i.ao() instanceof gks $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = ayz.h($$1, $$2.ch, $$2.ci);
         $$0.a(ayz.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(ayz.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(ayz.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayz.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.A = $$0;
      this.B = $$1;
      this.C = $$2;
      this.b(false);
      this.a(false);
      this.a(fky.a);
      this.A = 1.0F;
   }

   private void a(fkq $$0, float $$1, Matrix4f $$2) {
      if (!this.z) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fdc.a);
         fft $$4 = new fft();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.i.n.ae().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.i.ao() instanceof bvg && ((bvg)this.i.ao()).fR();
         if (this.i.n.aE().a() && !$$6 && !this.i.n.X && this.i.r.j() != dge.d) {
            this.x.c();
            this.c.a($$1, $$4, this.m.c(), this.i.t, this.i.aq().a(this.i.t, $$1));
            this.x.b();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.i.n.aE().a() && !$$6) {
            glx.a $$7 = this.m.c();
            gmj.a(this.i, $$4, $$7);
            $$7.b();
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

   public static float a(bvg $$0, float $$1) {
      btp $$2 = $$0.c(btr.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayz.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(fky $$0, boolean $$1) {
      if (!this.i.aC() && this.i.n.n && (!this.i.n.ac().c() || !this.i.o.d())) {
         if (af.c() - this.w > 500L) {
            this.i.b(false);
         }
      } else {
         this.w = af.c();
      }

      if (!this.i.y) {
         bos $$2 = bor.a();
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
               gmb $$6 = this.i.ab().a(this.I, glu.h);
               if ($$6 != null) {
                  $$6.a(this.i.h(), this.H);
               }
            }

            this.i.h().a(true);
         }

         few $$7 = this.i.aO();
         RenderSystem.clear(256);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fdc.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         fep.d();
         fod $$10 = new fod(this.i, this.m.c());
         if ($$3 && $$1 && this.i.s != null) {
            $$2.b("gui");
            if (!this.i.n.X) {
               this.a($$10, $$0.a(false));
            }

            this.i.m.a($$10, $$0);
            $$10.d();
            RenderSystem.clear(256);
            $$2.c();
         }

         if (this.i.aM() != null) {
            try {
               this.i.aM().a($$10, $$4, $$5, $$0.a());
            } catch (Throwable var17) {
               o $$12 = o.a(var17, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.i.aM().getClass().getCanonicalName());
               throw new z($$12);
            }
         } else if ($$3 && this.i.z != null) {
            try {
               this.i.z.c($$10, $$4, $$5, $$0.a());
            } catch (Throwable var16) {
               o $$15 = o.a(var16, "Rendering screen");
               p $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.i.o.e(), this.i.o.f()));
               $$16.a(
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
               throw new z($$15);
            }

            try {
               if (this.i.z != null) {
                  this.i.z.y();
               }
            } catch (Throwable var15) {
               o $$18 = o.a(var15, "Narrating screen");
               p $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.i.z.getClass().getCanonicalName());
               throw new z($$18);
            }
         }

         if ($$3 && $$1 && this.i.s != null) {
            this.i.m.b($$10, $$0);
         }

         if ($$3) {
            try (box $$20 = $$2.d("toasts")) {
               this.i.aA().a($$10);
            }
         }

         $$10.d();
         $$9.popMatrix();
         this.H.a();
      }
   }

   private void o() {
      if (!this.v && this.i.T()) {
         long $$0 = af.c();
         if ($$0 - this.u >= 1000L) {
            this.u = $$0;
            hjc $$1 = this.i.V();
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
         fet $$1 = flq.a(this.i.h());
         af.h().execute(() -> {
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

            try (fet $$6 = new fet(64, 64, false)) {
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
         buk $$0 = this.i.ao();
         boolean $$1 = $$0 instanceof cow && !this.i.n.X;
         if ($$1 && !((cow)$$0).gj().e) {
            cwo $$2 = ((bvg)$$0).eZ();
            fax $$3 = this.i.w;
            if ($$3 != null && $$3.d() == fax.a.b) {
               ji $$4 = ((fav)$$3).b();
               dww $$5 = this.i.s.a_($$4);
               if (this.i.r.j() == dge.d) {
                  $$1 = $$5.c(this.i.s, $$4) != null;
               } else {
                  dxa $$6 = new dxa(this.i.s, $$4, false);
                  ke<djl> $$7 = this.i.s.K_().e(mc.f);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(fky $$0) {
      float $$1 = $$0.a(true);
      this.x.a($$1);
      if (this.i.ao() == null) {
         this.i.a(this.i.t);
      }

      this.a($$1);
      bos $$2 = bor.a();
      $$2.a("center");
      boolean $$3 = this.p();
      $$2.b("camera");
      fkq $$4 = this.K;
      buk $$5 = (buk)(this.i.ao() == null ? this.i.t : this.i.ao());
      float $$6 = this.i.s.u().a($$5) ? 1.0F : $$1;
      $$4.a(this.i.s, $$5, !this.i.n.aE().a(), this.i.n.aE().b(), $$6);
      this.l = (float)(this.i.n.aH() * 16);
      float $$7 = this.a($$4, $$1, true);
      Matrix4f $$8 = this.b($$7);
      fft $$9 = new fft();
      this.a($$9, $$4.p());
      if (this.i.n.ae().c()) {
         this.b($$9, $$4.p());
      }

      $$8.mul($$9.c().a());
      float $$10 = this.i.n.am().c().floatValue();
      float $$11 = ayz.h($$1, this.i.t.cJ, this.i.t.cI) * $$10 * $$10;
      if ($$11 > 0.0F) {
         int $$12 = this.i.t.b(btr.i) ? 7 : 20;
         float $$13 = 5.0F / ($$11 * $$11 + 5.0F) - $$11 * 0.04F;
         $$13 *= $$13;
         Vector3f $$14 = new Vector3f(0.0F, ayz.g / 2.0F, ayz.g / 2.0F);
         float $$15 = ((float)this.n + $$1) * (float)$$12 * (float) (Math.PI / 180.0);
         $$8.rotate($$15, $$14);
         $$8.scale(1.0F / $$13, 1.0F, 1.0F);
         $$8.rotate(-$$15, $$14);
      }

      float $$16 = Math.max($$7, (float)this.i.n.ak().c().intValue());
      Matrix4f $$17 = this.b($$16);
      RenderSystem.setProjectionMatrix($$8, fdc.a);
      Quaternionf $$18 = $$4.f().conjugate(new Quaternionf());
      Matrix4f $$19 = new Matrix4f().rotation($$18);
      this.i.f.a($$4.b(), $$19, $$17);
      this.i.h().a(true);
      this.i.f.a(this.H, $$0, $$3, $$4, this, $$19, $$8);
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

   public void a(cwo $$0) {
      this.D = $$0;
      this.E = 40;
      this.F = this.k.i() * 2.0F - 1.0F;
      this.G = this.k.i() * 2.0F - 1.0F;
   }

   private void a(fod $$0, float $$1) {
      if (this.D != null && this.E > 0) {
         int $$2 = 40 - this.E;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.F * (float)($$0.a() / 4);
         float $$9 = this.G * (float)($$0.b() / 4);
         fft $$10 = $$0.c();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * ayz.e(ayz.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * ayz.e(ayz.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * ayz.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * ayz.e(ayz.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * ayz.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * ayz.b($$3 * 8.0F)));
         $$0.a($$1x -> this.i.as().a(this.D, cwm.i, 15728880, heh.d, $$10, $$1x, this.i.s, 0));
         $$10.b();
      }
   }

   public fli i() {
      return this.i;
   }

   public float c(float $$0) {
      return ayz.h($$0, this.r, this.q);
   }

   public float j() {
      return this.l;
   }

   public fkq k() {
      return this.K;
   }

   public glv l() {
      return this.x;
   }

   public heh m() {
      return this.y;
   }
}
