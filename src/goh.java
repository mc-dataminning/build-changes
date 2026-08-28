import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class goh {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final goh.p c = new goh.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final goh.p d = new goh.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final goh.p e = new goh.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final goh.p f = new goh.p(
      "glint_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.p g = new goh.p(
      "crumbling_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.p h = new goh.p(
      "overlay_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.p i = new goh.p(
      "translucent_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.p j = new goh.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final goh.p k = new goh.p(
      "crosshair_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
            GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.p l = new goh.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final goh.p m = new goh.p(
      "nausea_overlay_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final goh.m n = new goh.m();
   protected static final goh.m o = new goh.m(gnj.f);
   protected static final goh.m p = new goh.m(gnj.d);
   protected static final goh.m q = new goh.m(gnj.h);
   protected static final goh.m r = new goh.m(gnj.g);
   protected static final goh.m s = new goh.m(gnj.e);
   protected static final goh.m t = new goh.m(gnj.i);
   protected static final goh.m u = new goh.m(gnj.c);
   protected static final goh.m v = new goh.m(gnj.j);
   protected static final goh.m w = new goh.m(gnj.k);
   protected static final goh.m x = new goh.m(gnj.l);
   protected static final goh.m y = new goh.m(gnj.m);
   protected static final goh.m z = new goh.m(gnj.n);
   protected static final goh.m A = new goh.m(gnj.o);
   protected static final goh.m B = new goh.m(gnj.p);
   protected static final goh.m C = new goh.m(gnj.q);
   protected static final goh.m D = new goh.m(gnj.r);
   protected static final goh.m E = new goh.m(gnj.s);
   protected static final goh.m F = new goh.m(gnj.t);
   protected static final goh.m G = new goh.m(gnj.u);
   protected static final goh.m H = new goh.m(gnj.v);
   protected static final goh.m I = new goh.m(gnj.w);
   protected static final goh.m J = new goh.m(gnj.x);
   protected static final goh.m K = new goh.m(gnj.y);
   protected static final goh.m L = new goh.m(gnj.z);
   protected static final goh.m M = new goh.m(gnj.A);
   protected static final goh.m N = new goh.m(gnj.B);
   protected static final goh.m O = new goh.m(gnj.C);
   protected static final goh.m P = new goh.m(gnj.D);
   protected static final goh.m Q = new goh.m(gnj.E);
   protected static final goh.m R = new goh.m(gnj.F);
   protected static final goh.m S = new goh.m(gnj.G);
   protected static final goh.m T = new goh.m(gnj.H);
   protected static final goh.m U = new goh.m(gnj.I);
   protected static final goh.m V = new goh.m(gnj.J);
   protected static final goh.m W = new goh.m(gnj.K);
   protected static final goh.m X = new goh.m(gnj.L);
   protected static final goh.m Y = new goh.m(gnj.Y);
   protected static final goh.m Z = new goh.m(gnj.M);
   protected static final goh.m aa = new goh.m(gnj.N);
   protected static final goh.m ab = new goh.m(gnj.O);
   protected static final goh.m ac = new goh.m(gnj.P);
   protected static final goh.m ad = new goh.m(gnj.Q);
   protected static final goh.m ae = new goh.m(gnj.R);
   protected static final goh.m af = new goh.m(gnj.S);
   protected static final goh.m ag = new goh.m(gnj.T);
   protected static final goh.m ah = new goh.m(gnj.U);
   protected static final goh.m ai = new goh.m(gnj.V);
   protected static final goh.m aj = new goh.m(gnj.W);
   protected static final goh.m ak = new goh.m(gnj.X);
   protected static final goh.m al = new goh.m(gnj.Z);
   protected static final goh.m am = new goh.m(gnj.aa);
   protected static final goh.m an = new goh.m(gnj.ab);
   protected static final goh.m ao = new goh.m(gnj.ac);
   protected static final goh.m ap = new goh.m(gnj.ad);
   protected static final goh.n aq = new goh.n(hgr.d, bao.b, true);
   protected static final goh.n ar = new goh.n(hgr.d, bao.b, false);
   protected static final goh.e as = new goh.e();
   protected static final goh.o at = new goh.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final goh.o au = new goh.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final goh.o av = new goh.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final goh.g aw = new goh.g(true);
   protected static final goh.g ax = new goh.g(false);
   protected static final goh.l ay = new goh.l(true);
   protected static final goh.l az = new goh.l(false);
   protected static final goh.c aA = new goh.c(true);
   protected static final goh.c aB = new goh.c(false);
   protected static final goh.d aC = new goh.d("always", 519);
   protected static final goh.d aD = new goh.d("==", 514);
   protected static final goh.d aE = new goh.d("<=", 515);
   protected static final goh.d aF = new goh.d(">", 516);
   protected static final goh.q aG = new goh.q(true, true);
   protected static final goh.q aH = new goh.q(true, false);
   protected static final goh.q aI = new goh.q(false, true);
   protected static final goh.f aJ = new goh.f("no_layering", () -> {
   }, () -> {
   });
   protected static final goh.f aK = new goh.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final goh.f aL = new goh.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final goh.f aM = new goh.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final goh.f aN = new goh.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final goh.k aO = new goh.k("main_target", () -> fnd.Q().h().a(false), () -> {
   });
   protected static final goh.k aP = new goh.k("outline_target", () -> {
      ffy $$0 = fnd.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.k aQ = new goh.k("translucent_target", () -> {
      ffy $$0 = fnd.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.k aR = new goh.k("particles_target", () -> {
      ffy $$0 = fnd.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.k aS = new goh.k("weather_target", () -> {
      ffy $$0 = fnd.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.k aT = new goh.k("clouds_target", () -> {
      ffy $$0 = fnd.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.k aU = new goh.k("item_entity_target", () -> {
      ffy $$0 = fnd.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fnd.Q().h().a(false);
      }
   }, () -> fnd.Q().h().a(false));
   protected static final goh.h aV = new goh.h(OptionalDouble.of(1.0));
   protected static final goh.b aW = new goh.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final goh.b aX = new goh.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public goh(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aY = $$1;
      this.aZ = $$2;
   }

   public void a() {
      this.aY.run();
   }

   public void b() {
      this.aZ.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)af.c() * fnd.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends goh {
      private final boolean aY;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aY = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class b extends goh {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends goh.a {
      public c(boolean $$0) {
         super("cull", () -> {
            if (!$$0) {
               RenderSystem.disableCull();
            }
         }, () -> {
            if (!$$0) {
               RenderSystem.enableCull();
            }
         }, $$0);
      }
   }

   protected static class d extends goh {
      private final String aY;

      public d(String $$0, int $$1) {
         super("depth_test", () -> {
            if ($$1 != 519) {
               RenderSystem.enableDepthTest();
               RenderSystem.depthFunc($$1);
            }
         }, () -> {
            if ($$1 != 519) {
               RenderSystem.disableDepthTest();
               RenderSystem.depthFunc(515);
            }
         });
         this.aY = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class e extends goh {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ald> c() {
         return Optional.empty();
      }
   }

   protected static class f extends goh {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends goh.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fnd.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fnd.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends goh {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fnd.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aY = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aY.isPresent() ? this.aY.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends goh.e {
      private final Optional<ald> aY;

      i(List<goh.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               goh.i.b $$2 = $$0.get($$1);
               hgu $$3 = fnd.Q().aa();
               hgd $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aY = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<ald> c() {
         return this.aY;
      }

      public static goh.i.a d() {
         return new goh.i.a();
      }

      public static final class a {
         private final Builder<goh.i.b> a = new Builder();

         public goh.i.a a(ald $$0, boolean $$1, boolean $$2) {
            this.a.add(new goh.i.b($$0, $$1, $$2));
            return this;
         }

         public goh.i a() {
            return new goh.i(this.a.build());
         }
      }

      static record b(ald a, boolean b, boolean c) {
      }
   }

   protected static final class j extends goh.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends goh {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends goh.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fnd.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fnd.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends goh {
      private final Optional<goq> aY;

      public m(goq $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aY = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aY = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class n extends goh.e {
      private final Optional<ald> aY;
      private final bao aZ;
      private final boolean ba;

      public n(ald $$0, bao $$1, boolean $$2) {
         super(() -> {
            hgu $$3 = fnd.Q().aa();
            hgd $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.a());
         }, () -> {
         });
         this.aY = Optional.of($$0);
         this.aZ = $$1;
         this.ba = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "(blur=" + this.aZ + ", mipmap=" + this.ba + ")]";
      }

      @Override
      protected Optional<ald> c() {
         return this.aY;
      }
   }

   protected static class o extends goh {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends goh {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends goh {
      private final boolean aY;
      private final boolean aZ;

      public q(boolean $$0, boolean $$1) {
         super("write_mask_state", () -> {
            if (!$$1) {
               RenderSystem.depthMask($$1);
            }

            if (!$$0) {
               RenderSystem.colorMask($$0, $$0, $$0, $$0);
            }
         }, () -> {
            if (!$$1) {
               RenderSystem.depthMask(true);
            }

            if (!$$0) {
               RenderSystem.colorMask(true, true, true, true);
            }
         });
         this.aY = $$0;
         this.aZ = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aY + ", writeDepth=" + this.aZ + "]";
      }
   }
}
