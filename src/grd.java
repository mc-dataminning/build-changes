import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class grd implements AutoCloseable {
   private static final alr e = alr.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   public static final float b = 0.05F;
   private static final float g = 1000.0F;
   private static final float h = 20.0F;
   private static final float i = 7.0F;
   private final fqq j;
   private final avo k;
   private final bai l = bai.a();
   private float m;
   public final grg c;
   private final grv n;
   private float o;
   private float p;
   private float q;
   private float r;
   private float s;
   private float t;
   private boolean u = true;
   private boolean v = true;
   private long w;
   private boolean x;
   private long y = ag.c();
   private final grk z;
   private final hkg A = new hkg();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int d = 40;
   @Nullable
   private dak F;
   private int G;
   private float H;
   private float I;
   private final fkn J = new fkn(3);
   @Nullable
   private alr K;
   private boolean L;
   private final fpy M = new fpy();

   public grd(fqq $$0, grg $$1, avo $$2, grv $$3) {
      this.j = $$0;
      this.k = $$2;
      this.c = $$1;
      this.z = new grk(this, $$0);
      this.n = $$3;
   }

   @Override
   public void close() {
      this.z.close();
      this.A.close();
      this.J.close();
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public void b(boolean $$0) {
      this.v = $$0;
   }

   public void c(boolean $$0) {
      this.B = $$0;
   }

   public boolean a() {
      return this.B;
   }

   public void b() {
      this.K = null;
   }

   public void c() {
      this.L = !this.L;
   }

   public void a(@Nullable bxe $$0) {
      this.K = null;
      if ($$0 instanceof cow) {
         this.a(alr.b("creeper"));
      } else if ($$0 instanceof cpv) {
         this.a(alr.b("spider"));
      } else if ($$0 instanceof cpa) {
         this.a(alr.b("invert"));
      }
   }

   private void a(alr $$0) {
      this.K = $$0;
      this.L = true;
   }

   public void d() {
      float $$0 = (float)this.j.n.r();
      if (!($$0 < 1.0F)) {
         grr $$1 = this.j.ab().a(e, grj.h);
         if ($$1 != null) {
            $$1.a(this.j.h(), this.J, $$1x -> $$1x.setUniform("Radius", $$0));
         }
      }
   }

   public void a(avr $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      BiFunction<alr, ShaderType, String> $$2 = ($$1x, $$2x) -> {
         alr $$3 = $$2x.idConverter().a($$1x);

         try {
            String var5;
            try (Reader $$4 = $$0.getResourceOrThrow($$3).e()) {
               var5 = IOUtils.toString($$4);
            }

            return var5;
         } catch (IOException var9) {
            f.error("Coudln't preload {} shader {}: {}", new Object[]{$$2x, $$1x, var9});
            return null;
         }
      };
      $$1.precompilePipeline(grw.ap, $$2);
      $$1.precompilePipeline(grw.aq, $$2);
      $$1.precompilePipeline(grw.au, $$2);
      if (TracyClient.isAvailable()) {
         $$1.precompilePipeline(grw.aD, $$2);
      }
   }

   public void e() {
      this.n();
      this.z.b();
      gqm $$0 = this.j.t;
      if (this.j.ao() == null) {
         this.j.a($$0);
      }

      this.M.a();
      this.c.a();
      float $$1 = $$0.cw;
      float $$2 = $$0.a(bwk.i, 1.0F);
      if (!($$1 > 0.0F) && !($$2 > 0.0F)) {
         this.p = 0.0F;
      } else {
         this.p = ($$1 * 20.0F + $$2 * 7.0F) / ($$1 + $$2);
         this.o = this.o + this.p;
      }

      if (this.j.s.u().i()) {
         this.j.f.a(this.M);
         this.t = this.s;
         if (this.j.m.j().c()) {
            this.s += 0.05F;
            if (this.s > 1.0F) {
               this.s = 1.0F;
            }
         } else if (this.s > 0.0F) {
            this.s -= 0.0125F;
         }

         if (this.G > 0) {
            this.G--;
            if (this.G == 0) {
               this.F = null;
            }
         }
      }
   }

   @Nullable
   public alr f() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      this.J.b();
      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bxe $$1 = this.j.ao();
      if ($$1 != null) {
         if (this.j.s != null && this.j.t != null) {
            brl.a().a("pick");
            double $$2 = this.j.t.gM();
            double $$3 = this.j.t.gN();
            fga $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.w = $$4;
            this.j.v = $$4 instanceof ffz $$5 ? $$5.a() : null;
            brl.a().c();
         }
      }
   }

   private fga a(bxe $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = azz.k($$4);
      fgc $$6 = $$0.n($$3);
      fga $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != fga.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      fgc $$9 = $$0.h($$3);
      fgc $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      ffx $$12 = $$0.cR().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      ffz $$13 = ctf.a($$0, $$6, $$10, $$12, bxl.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static fga a(fga $$0, fgc $$1, double $$2) {
      fgc $$3 = $$0.g();
      if (!$$3.a((jq)$$1, $$2)) {
         fgc $$4 = $$0.g();
         jc $$5 = jc.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return ffy.a($$4, $$5, iw.a((jq)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.j.ao() instanceof gqj $$0) {
         fqu $$1 = this.j.n;
         boolean $$2 = $$1.aE().a();
         float $$3 = $$1.an().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.r = this.q;
      this.q = this.q + ($$4 - this.q) * 0.5F;
      this.q = azz.a(this.q, 0.1F, 1.5F);
   }

   private float a(fpy $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.j.n.ak().c().intValue();
            $$3 *= azz.h($$1, this.r, this.q);
         }

         if ($$0.g() instanceof byf $$4 && $$4.eH()) {
            float $$5 = Math.min((float)$$4.aP + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         eyc $$6 = $$0.k();
         if ($$6 == eyc.a || $$6 == eyc.b) {
            float $$7 = this.j.n.an().c().floatValue();
            $$3 *= azz.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fld $$0, float $$1) {
      if (this.j.ao() instanceof byf $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.eH()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = azz.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eM();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.n.ar().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fld $$0, float $$1) {
      if (this.j.ao() instanceof gqj $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = azz.h($$1, $$2.bV, $$2.bW);
         $$0.a(azz.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(azz.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(azz.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(azz.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(fqg.a);
      this.C = 1.0F;
   }

   private void a(fpy $$0, float $$1, Matrix4f $$2) {
      if (!this.B) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fig.a);
         fld $$4 = new fld();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.j.n.ae().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.j.ao() instanceof byf && ((byf)this.j.ao()).fR();
         if (this.j.n.aE().a() && !$$6 && !this.j.n.X && this.j.r.i() != dkg.d) {
            this.z.d();
            this.c.a($$1, $$4, this.n.c(), this.j.t, this.j.aq().a(this.j.t, $$1));
            this.z.c();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.j.n.aE().a() && !$$6) {
            grn.a $$7 = this.n.c();
            gsa.a(this.j, $$4, $$7);
            $$7.b();
         }
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.C != 1.0F) {
         $$1.translate(this.D, -this.E, 0.0F);
         $$1.scale(this.C, this.C, 1.0F);
      }

      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.j.aO().k() / (float)this.j.aO().l(), 0.05F, this.g());
   }

   public float g() {
      return this.m * 4.0F;
   }

   public static float a(byf $$0, float $$1) {
      bwi $$2 = $$0.c(bwk.p);
      return !$$2.a(200) ? 1.0F : 0.7F + azz.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(fqg $$0, boolean $$1) {
      if (!this.j.aC() && this.j.n.n && (!this.j.n.ac().c() || !this.j.o.d())) {
         if (ag.c() - this.y > 500L) {
            this.j.b(false);
         }
      } else {
         this.y = ag.c();
      }

      if (!this.j.y) {
         brm $$2 = brl.a();
         boolean $$3 = this.j.c();
         int $$4 = (int)this.j.o.a(this.j.aO());
         int $$5 = (int)this.j.o.b(this.j.aO());
         if ($$3 && $$1 && this.j.s != null) {
            $$2.a("level");
            this.a($$0);
            this.o();
            this.j.f.b();
            if (this.K != null && this.L) {
               RenderSystem.resetTextureMatrix();
               grr $$6 = this.j.ab().a(this.K, grj.h);
               if ($$6 != null) {
                  $$6.a(this.j.h(), this.J, null);
               }
            }
         }

         fki $$7 = this.j.aO();
         fjr $$8 = this.j.h();
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$8.d(), 1.0);
         Matrix4f $$9 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$9, fig.b);
         Matrix4fStack $$10 = RenderSystem.getModelViewStack();
         $$10.pushMatrix();
         $$10.translation(0.0F, 0.0F, -11000.0F);
         fkb.d();
         ftk $$11 = new ftk(this.j, this.n.c());
         if ($$3 && $$1 && this.j.s != null) {
            $$2.b("gui");
            if (!this.j.n.X) {
               this.a($$11, $$0.a(false));
            }

            this.j.m.a($$11, $$0);
            $$11.d();
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$8.d(), 1.0);
            $$2.c();
         }

         if (this.j.aM() != null) {
            try {
               this.j.aM().a($$11, $$4, $$5, $$0.a());
            } catch (Throwable var18) {
               p $$13 = p.a(var18, "Rendering overlay");
               q $$14 = $$13.a("Overlay render details");
               $$14.a("Overlay name", () -> this.j.aM().getClass().getCanonicalName());
               throw new aa($$13);
            }
         } else if ($$3 && this.j.z != null) {
            try {
               this.j.z.c($$11, $$4, $$5, $$0.a());
            } catch (Throwable var17) {
               p $$16 = p.a(var17, "Rendering screen");
               q $$17 = $$16.a("Screen render details");
               $$17.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               this.j.o.a($$17, this.j.aO());
               throw new aa($$16);
            }

            try {
               if (this.j.z != null) {
                  this.j.z.y();
               }
            } catch (Throwable var16) {
               p $$19 = p.a(var16, "Narrating screen");
               q $$20 = $$19.a("Screen details");
               $$20.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               throw new aa($$19);
            }
         }

         if ($$3 && $$1 && this.j.s != null) {
            this.j.m.b($$11, $$0);
         }

         if ($$3) {
            try (brr $$21 = $$2.d("toasts")) {
               this.j.aA().a($$11);
            }
         }

         $$11.d();
         $$10.popMatrix();
         this.J.a();
      }
   }

   private void o() {
      if (!this.x && this.j.T()) {
         long $$0 = ag.c();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            hpb $$1 = this.j.V();
            if ($$1 != null && !$$1.af()) {
               $$1.C().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.x = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.j.f.i() > 10 && this.j.f.n()) {
         fqy.a(this.j.h(), $$1 -> ag.i().execute(() -> {
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

               try (fkf $$6 = new fkf(64, 64, false)) {
                  $$1.a($$4, $$5, $$2, $$3, $$6);
                  $$6.a($$0);
               } catch (IOException var16) {
                  f.warn("Couldn't save auto screenshot", var16);
               } finally {
                  $$1.close();
               }
            }));
      }
   }

   private boolean p() {
      if (!this.v) {
         return false;
      } else {
         bxe $$0 = this.j.ao();
         boolean $$1 = $$0 instanceof csi && !this.j.n.X;
         if ($$1 && !((csi)$$0).gk().e) {
            dak $$2 = ((byf)$$0).fb();
            fga $$3 = this.j.w;
            if ($$3 != null && $$3.d() == fga.a.b) {
               iw $$4 = ((ffy)$$3).b();
               ebq $$5 = this.j.s.a_($$4);
               if (this.j.r.i() == dkg.d) {
                  $$1 = $$5.b(this.j.s, $$4) != null;
               } else {
                  ebu $$6 = new ebu(this.j.s, $$4, false);
                  jt<dno> $$7 = this.j.s.J_().f(mi.i);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(fqg $$0) {
      float $$1 = $$0.a(true);
      gqm $$2 = this.j.t;
      this.z.a($$1);
      if (this.j.ao() == null) {
         this.j.a($$2);
      }

      this.a($$1);
      brm $$3 = brl.a();
      $$3.a("center");
      boolean $$4 = this.p();
      $$3.b("camera");
      fpy $$5 = this.M;
      bxe $$6 = (bxe)(this.j.ao() == null ? $$2 : this.j.ao());
      float $$7 = this.j.s.u().a($$6) ? 1.0F : $$1;
      $$5.a(this.j.s, $$6, !this.j.n.aE().a(), this.j.n.aE().b(), $$7);
      this.m = (float)(this.j.n.aH() * 16);
      float $$8 = this.a($$5, $$1, true);
      Matrix4f $$9 = this.b($$8);
      fld $$10 = new fld();
      this.a($$10, $$5.p());
      if (this.j.n.ae().c()) {
         this.b($$10, $$5.p());
      }

      $$9.mul($$10.c().a());
      float $$11 = this.j.n.am().c().floatValue();
      float $$12 = azz.h($$1, $$2.cx, $$2.cw);
      float $$13 = $$2.a(bwk.i, $$1);
      float $$14 = Math.max($$12, $$13) * $$11 * $$11;
      if ($$14 > 0.0F) {
         float $$15 = 5.0F / ($$14 * $$14 + 5.0F) - $$14 * 0.04F;
         $$15 *= $$15;
         Vector3f $$16 = new Vector3f(0.0F, azz.g / 2.0F, azz.g / 2.0F);
         float $$17 = (this.o + $$1 * this.p) * (float) (Math.PI / 180.0);
         $$9.rotate($$17, $$16);
         $$9.scale(1.0F / $$15, 1.0F, 1.0F);
         $$9.rotate(-$$17, $$16);
      }

      float $$18 = Math.max($$8, (float)this.j.n.ak().c().intValue());
      Matrix4f $$19 = this.b($$18);
      RenderSystem.setProjectionMatrix($$9, fig.a);
      Quaternionf $$20 = $$5.f().conjugate(new Quaternionf());
      Matrix4f $$21 = new Matrix4f().rotation($$20);
      this.j.f.a($$5.b(), $$21, $$19);
      this.j.f.a(this.J, $$0, $$4, $$5, this, $$21, $$9);
      $$3.b("hand");
      if (this.u) {
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.j.h().d(), 1.0);
         this.a($$5, $$1, $$21);
      }

      $$3.c();
   }

   public void h() {
      this.F = null;
      this.j.aH().a();
      this.M.o();
      this.x = false;
   }

   public void a(dak $$0) {
      this.F = $$0;
      this.G = 40;
      this.H = this.l.i() * 2.0F - 1.0F;
      this.I = this.l.i() * 2.0F - 1.0F;
   }

   private void a(ftk $$0, float $$1) {
      if (this.F != null && this.G > 0) {
         int $$2 = 40 - this.G;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.H * (float)($$0.a() / 4);
         float $$9 = this.I * (float)($$0.b() / 4);
         fld $$10 = $$0.c();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * azz.e(azz.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * azz.e(azz.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * azz.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * azz.e(azz.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * azz.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * azz.b($$3 * 8.0F)));
         $$0.a($$1x -> this.j.as().a(this.F, dai.i, 15728880, hkg.d, $$10, $$1x, this.j.s, 0));
         $$10.b();
      }
   }

   public fqq i() {
      return this.j;
   }

   public float c(float $$0) {
      return azz.h($$0, this.t, this.s);
   }

   public float j() {
      return this.m;
   }

   public fpy k() {
      return this.M;
   }

   public grk l() {
      return this.z;
   }

   public hkg m() {
      return this.A;
   }
}
