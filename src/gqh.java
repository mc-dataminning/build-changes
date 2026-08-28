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

public class gqh implements AutoCloseable {
   private static final alg e = alg.b("blur");
   public static final int a = 10;
   private static final Logger f = LogUtils.getLogger();
   public static final float b = 0.05F;
   private static final float g = 1000.0F;
   private static final float h = 20.0F;
   private static final float i = 7.0F;
   private final fpt j;
   private final avd k;
   private final azv l = azv.a();
   private float m;
   public final gqk c;
   private final gqz n;
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
   private final gqo z;
   private final hjg A = new hjg();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int d = 40;
   @Nullable
   private czn F;
   private int G;
   private float H;
   private float I;
   private final fjh J = new fjh(3);
   @Nullable
   private alg K;
   private boolean L;
   private final fpb M = new fpb();

   public gqh(fpt $$0, gqk $$1, avd $$2, gqz $$3) {
      this.j = $$0;
      this.k = $$2;
      this.c = $$1;
      this.z = new gqo(this, $$0);
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

   public void a(@Nullable bwi $$0) {
      this.K = null;
      if ($$0 instanceof cnz) {
         this.a(alg.b("creeper"));
      } else if ($$0 instanceof coz) {
         this.a(alg.b("spider"));
      } else if ($$0 instanceof cod) {
         this.a(alg.b("invert"));
      }
   }

   private void a(alg $$0) {
      this.K = $$0;
      this.L = true;
   }

   public void d() {
      float $$0 = (float)this.j.n.r();
      if (!($$0 < 1.0F)) {
         gqv $$1 = this.j.ab().a(e, gqn.h);
         if ($$1 != null) {
            $$1.a("Radius", $$0);
            $$1.a(this.j.h(), this.J);
         }
      }
   }

   public void a(avg $$0) {
      try {
         this.j.ab().a($$0, gra.ao, gra.ap, gra.at);
      } catch (grj.b | IOException var3) {
         throw new RuntimeException("Could not preload shaders for loading UI", var3);
      }
   }

   public void e() {
      this.n();
      this.z.b();
      gpo $$0 = this.j.t;
      if (this.j.ao() == null) {
         this.j.a($$0);
      }

      this.M.a();
      this.c.a();
      float $$1 = $$0.cw;
      float $$2 = $$0.a(bvo.i, 1.0F);
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
   public alg f() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      this.J.b();
      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bwi $$1 = this.j.ao();
      if ($$1 != null) {
         if (this.j.s != null && this.j.t != null) {
            bqp.a().a("pick");
            double $$2 = this.j.t.gK();
            double $$3 = this.j.t.gL();
            ffa $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.w = $$4;
            this.j.v = $$4 instanceof fez $$5 ? $$5.a() : null;
            bqp.a().c();
         }
      }
   }

   private ffa a(bwi $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = azm.k($$4);
      ffc $$6 = $$0.n($$3);
      ffa $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != ffa.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ffc $$9 = $$0.h($$3);
      ffc $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      fex $$12 = $$0.cQ().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      fez $$13 = csj.a($$0, $$6, $$10, $$12, bwp.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ffa a(ffa $$0, ffc $$1, double $$2) {
      ffc $$3 = $$0.g();
      if (!$$3.a((jp)$$1, $$2)) {
         ffc $$4 = $$0.g();
         jb $$5 = jb.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return fey.a($$4, $$5, iv.a((jp)$$4));
      } else {
         return $$0;
      }
   }

   private void n() {
      float $$4;
      if (this.j.ao() instanceof gpl $$0) {
         fpx $$1 = this.j.n;
         boolean $$2 = $$1.aE().a();
         float $$3 = $$1.an().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.r = this.q;
      this.q = this.q + ($$4 - this.q) * 0.5F;
      this.q = azm.a(this.q, 0.1F, 1.5F);
   }

   private float a(fpb $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.j.n.ak().c().intValue();
            $$3 *= azm.h($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bxj $$4 && $$4.eG()) {
            float $$5 = Math.min((float)$$4.aP + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         exc $$6 = $$0.k();
         if ($$6 == exc.a || $$6 == exc.b) {
            float $$7 = this.j.n.an().c().floatValue();
            $$3 *= azm.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fkd $$0, float $$1) {
      if (this.j.ao() instanceof bxj $$2) {
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
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.n.ar().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fkd $$0, float $$1) {
      if (this.j.ao() instanceof gpl $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = azm.h($$1, $$2.bV, $$2.bW);
         $$0.a(azm.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(azm.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(azm.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(azm.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(fpj.a);
      this.C = 1.0F;
   }

   private void a(fpb $$0, float $$1, Matrix4f $$2) {
      if (!this.B) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fhg.a);
         fkd $$4 = new fkd();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.j.n.ae().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.j.ao() instanceof bxj && ((bxj)this.j.ao()).fQ();
         if (this.j.n.aE().a() && !$$6 && !this.j.n.X && this.j.r.i() != djj.d) {
            this.z.d();
            this.c.a($$1, $$4, this.n.c(), this.j.t, this.j.aq().a(this.j.t, $$1));
            this.z.c();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.j.n.aE().a() && !$$6) {
            gqr.a $$7 = this.n.c();
            gre.a(this.j, $$4, $$7);
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

   public static float a(bxj $$0, float $$1) {
      bvm $$2 = $$0.c(bvo.p);
      return !$$2.a(200) ? 1.0F : 0.7F + azm.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(fpj $$0, boolean $$1) {
      if (!this.j.aC() && this.j.n.n && (!this.j.n.ac().c() || !this.j.o.d())) {
         if (ag.c() - this.y > 500L) {
            this.j.b(false);
         }
      } else {
         this.y = ag.c();
      }

      if (!this.j.y) {
         bqq $$2 = bqp.a();
         boolean $$3 = this.j.c();
         int $$4 = (int)(this.j.o.e() * (double)this.j.aO().o() / (double)this.j.aO().m());
         int $$5 = (int)(this.j.o.f() * (double)this.j.aO().p() / (double)this.j.aO().n());
         RenderSystem.viewport(0, 0, this.j.aO().k(), this.j.aO().l());
         if ($$3 && $$1 && this.j.s != null) {
            $$2.a("level");
            this.a($$0);
            this.o();
            this.j.f.b();
            if (this.K != null && this.L) {
               RenderSystem.resetTextureMatrix();
               gqv $$6 = this.j.ab().a(this.K, gqn.h);
               if ($$6 != null) {
                  $$6.a(this.j.h(), this.J);
               }
            }

            this.j.h().a(true);
         }

         fjc $$7 = this.j.aO();
         RenderSystem.clear(256);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fhg.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         fiv.d();
         fsm $$10 = new fsm(this.j, this.n.c());
         if ($$3 && $$1 && this.j.s != null) {
            $$2.b("gui");
            if (!this.j.n.X) {
               this.a($$10, $$0.a(false));
            }

            this.j.m.a($$10, $$0);
            $$10.d();
            RenderSystem.clear(256);
            $$2.c();
         }

         if (this.j.aM() != null) {
            try {
               this.j.aM().a($$10, $$4, $$5, $$0.a());
            } catch (Throwable var17) {
               p $$12 = p.a(var17, "Rendering overlay");
               q $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.j.aM().getClass().getCanonicalName());
               throw new aa($$12);
            }
         } else if ($$3 && this.j.z != null) {
            try {
               this.j.z.c($$10, $$4, $$5, $$0.a());
            } catch (Throwable var16) {
               p $$15 = p.a(var16, "Rendering screen");
               q $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$4, $$5, this.j.o.e(), this.j.o.f()));
               $$16.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aO().o(),
                        this.j.aO().p(),
                        this.j.aO().k(),
                        this.j.aO().l(),
                        this.j.aO().s()
                     )
               );
               throw new aa($$15);
            }

            try {
               if (this.j.z != null) {
                  this.j.z.y();
               }
            } catch (Throwable var15) {
               p $$18 = p.a(var15, "Narrating screen");
               q $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               throw new aa($$18);
            }
         }

         if ($$3 && $$1 && this.j.s != null) {
            this.j.m.b($$10, $$0);
         }

         if ($$3) {
            try (bqv $$20 = $$2.d("toasts")) {
               this.j.aA().a($$10);
            }
         }

         $$10.d();
         $$9.popMatrix();
         this.J.a();
      }
   }

   private void o() {
      if (!this.x && this.j.T()) {
         long $$0 = ag.c();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            hoc $$1 = this.j.V();
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
         fqb.a(this.j.h(), $$1 -> ag.i().execute(() -> {
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

               try (fiz $$6 = new fiz(64, 64, false)) {
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
         bwi $$0 = this.j.ao();
         boolean $$1 = $$0 instanceof crm && !this.j.n.X;
         if ($$1 && !((crm)$$0).gj().e) {
            czn $$2 = ((bxj)$$0).fa();
            ffa $$3 = this.j.w;
            if ($$3 != null && $$3.d() == ffa.a.b) {
               iv $$4 = ((fey)$$3).b();
               eat $$5 = this.j.s.a_($$4);
               if (this.j.r.i() == djj.d) {
                  $$1 = $$5.b(this.j.s, $$4) != null;
               } else {
                  eax $$6 = new eax(this.j.s, $$4, false);
                  js<dmr> $$7 = this.j.s.F_().f(mh.i);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(fpj $$0) {
      float $$1 = $$0.a(true);
      gpo $$2 = this.j.t;
      this.z.a($$1);
      if (this.j.ao() == null) {
         this.j.a($$2);
      }

      this.a($$1);
      bqq $$3 = bqp.a();
      $$3.a("center");
      boolean $$4 = this.p();
      $$3.b("camera");
      fpb $$5 = this.M;
      bwi $$6 = (bwi)(this.j.ao() == null ? $$2 : this.j.ao());
      float $$7 = this.j.s.u().a($$6) ? 1.0F : $$1;
      $$5.a(this.j.s, $$6, !this.j.n.aE().a(), this.j.n.aE().b(), $$7);
      this.m = (float)(this.j.n.aH() * 16);
      float $$8 = this.a($$5, $$1, true);
      Matrix4f $$9 = this.b($$8);
      fkd $$10 = new fkd();
      this.a($$10, $$5.p());
      if (this.j.n.ae().c()) {
         this.b($$10, $$5.p());
      }

      $$9.mul($$10.c().a());
      float $$11 = this.j.n.am().c().floatValue();
      float $$12 = azm.h($$1, $$2.cx, $$2.cw);
      float $$13 = $$2.a(bvo.i, $$1);
      float $$14 = Math.max($$12, $$13) * $$11 * $$11;
      if ($$14 > 0.0F) {
         float $$15 = 5.0F / ($$14 * $$14 + 5.0F) - $$14 * 0.04F;
         $$15 *= $$15;
         Vector3f $$16 = new Vector3f(0.0F, azm.g / 2.0F, azm.g / 2.0F);
         float $$17 = (this.o + $$1 * this.p) * (float) (Math.PI / 180.0);
         $$9.rotate($$17, $$16);
         $$9.scale(1.0F / $$15, 1.0F, 1.0F);
         $$9.rotate(-$$17, $$16);
      }

      float $$18 = Math.max($$8, (float)this.j.n.ak().c().intValue());
      Matrix4f $$19 = this.b($$18);
      RenderSystem.setProjectionMatrix($$9, fhg.a);
      Quaternionf $$20 = $$5.f().conjugate(new Quaternionf());
      Matrix4f $$21 = new Matrix4f().rotation($$20);
      this.j.f.a($$5.b(), $$21, $$19);
      this.j.h().a(true);
      this.j.f.a(this.J, $$0, $$4, $$5, this, $$21, $$9);
      $$3.b("hand");
      if (this.u) {
         RenderSystem.clear(256);
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

   public void a(czn $$0) {
      this.F = $$0;
      this.G = 40;
      this.H = this.l.i() * 2.0F - 1.0F;
      this.I = this.l.i() * 2.0F - 1.0F;
   }

   private void a(fsm $$0, float $$1) {
      if (this.F != null && this.G > 0) {
         int $$2 = 40 - this.G;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.H * (float)($$0.a() / 4);
         float $$9 = this.I * (float)($$0.b() / 4);
         fkd $$10 = $$0.c();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * azm.e(azm.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * azm.e(azm.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * azm.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * azm.e(azm.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * azm.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * azm.b($$3 * 8.0F)));
         $$0.a($$1x -> this.j.as().a(this.F, czl.i, 15728880, hjg.d, $$10, $$1x, this.j.s, 0));
         $$10.b();
      }
   }

   public fpt i() {
      return this.j;
   }

   public float c(float $$0) {
      return azm.h($$0, this.t, this.s);
   }

   public float j() {
      return this.m;
   }

   public fpb k() {
      return this.M;
   }

   public gqo l() {
      return this.z;
   }

   public hjg m() {
      return this.A;
   }
}
