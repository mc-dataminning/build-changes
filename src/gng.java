import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gng {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gng.p c = new gng.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gng.p d = new gng.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gng.p e = new gng.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gng.p f = new gng.p(
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
   protected static final gng.p g = new gng.p(
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
   protected static final gng.p h = new gng.p(
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
   protected static final gng.p i = new gng.p(
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
   protected static final gng.p j = new gng.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gng.p k = new gng.p(
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
   protected static final gng.p l = new gng.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gng.p m = new gng.p(
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
   protected static final gng.m n = new gng.m();
   protected static final gng.m o = new gng.m(gmi.f);
   protected static final gng.m p = new gng.m(gmi.d);
   protected static final gng.m q = new gng.m(gmi.h);
   protected static final gng.m r = new gng.m(gmi.g);
   protected static final gng.m s = new gng.m(gmi.e);
   protected static final gng.m t = new gng.m(gmi.i);
   protected static final gng.m u = new gng.m(gmi.c);
   protected static final gng.m v = new gng.m(gmi.j);
   protected static final gng.m w = new gng.m(gmi.k);
   protected static final gng.m x = new gng.m(gmi.l);
   protected static final gng.m y = new gng.m(gmi.m);
   protected static final gng.m z = new gng.m(gmi.n);
   protected static final gng.m A = new gng.m(gmi.o);
   protected static final gng.m B = new gng.m(gmi.p);
   protected static final gng.m C = new gng.m(gmi.q);
   protected static final gng.m D = new gng.m(gmi.r);
   protected static final gng.m E = new gng.m(gmi.s);
   protected static final gng.m F = new gng.m(gmi.t);
   protected static final gng.m G = new gng.m(gmi.u);
   protected static final gng.m H = new gng.m(gmi.v);
   protected static final gng.m I = new gng.m(gmi.w);
   protected static final gng.m J = new gng.m(gmi.x);
   protected static final gng.m K = new gng.m(gmi.y);
   protected static final gng.m L = new gng.m(gmi.z);
   protected static final gng.m M = new gng.m(gmi.A);
   protected static final gng.m N = new gng.m(gmi.B);
   protected static final gng.m O = new gng.m(gmi.C);
   protected static final gng.m P = new gng.m(gmi.D);
   protected static final gng.m Q = new gng.m(gmi.E);
   protected static final gng.m R = new gng.m(gmi.F);
   protected static final gng.m S = new gng.m(gmi.G);
   protected static final gng.m T = new gng.m(gmi.H);
   protected static final gng.m U = new gng.m(gmi.I);
   protected static final gng.m V = new gng.m(gmi.J);
   protected static final gng.m W = new gng.m(gmi.K);
   protected static final gng.m X = new gng.m(gmi.L);
   protected static final gng.m Y = new gng.m(gmi.Y);
   protected static final gng.m Z = new gng.m(gmi.M);
   protected static final gng.m aa = new gng.m(gmi.N);
   protected static final gng.m ab = new gng.m(gmi.O);
   protected static final gng.m ac = new gng.m(gmi.P);
   protected static final gng.m ad = new gng.m(gmi.Q);
   protected static final gng.m ae = new gng.m(gmi.R);
   protected static final gng.m af = new gng.m(gmi.S);
   protected static final gng.m ag = new gng.m(gmi.T);
   protected static final gng.m ah = new gng.m(gmi.U);
   protected static final gng.m ai = new gng.m(gmi.V);
   protected static final gng.m aj = new gng.m(gmi.W);
   protected static final gng.m ak = new gng.m(gmi.X);
   protected static final gng.m al = new gng.m(gmi.Z);
   protected static final gng.m am = new gng.m(gmi.aa);
   protected static final gng.m an = new gng.m(gmi.ab);
   protected static final gng.m ao = new gng.m(gmi.ac);
   protected static final gng.m ap = new gng.m(gmi.ad);
   protected static final gng.n aq = new gng.n(hfq.d, bad.b, true);
   protected static final gng.n ar = new gng.n(hfq.d, bad.b, false);
   protected static final gng.e as = new gng.e();
   protected static final gng.o at = new gng.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gng.o au = new gng.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gng.o av = new gng.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gng.g aw = new gng.g(true);
   protected static final gng.g ax = new gng.g(false);
   protected static final gng.l ay = new gng.l(true);
   protected static final gng.l az = new gng.l(false);
   protected static final gng.c aA = new gng.c(true);
   protected static final gng.c aB = new gng.c(false);
   protected static final gng.d aC = new gng.d("always", 519);
   protected static final gng.d aD = new gng.d("==", 514);
   protected static final gng.d aE = new gng.d("<=", 515);
   protected static final gng.d aF = new gng.d(">", 516);
   protected static final gng.q aG = new gng.q(true, true);
   protected static final gng.q aH = new gng.q(true, false);
   protected static final gng.q aI = new gng.q(false, true);
   protected static final gng.f aJ = new gng.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gng.f aK = new gng.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gng.f aL = new gng.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gng.f aM = new gng.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gng.f aN = new gng.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gng.k aO = new gng.k("main_target", () -> fmg.Q().h().a(false), () -> {
   });
   protected static final gng.k aP = new gng.k("outline_target", () -> {
      ffb $$0 = fmg.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.k aQ = new gng.k("translucent_target", () -> {
      ffb $$0 = fmg.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.k aR = new gng.k("particles_target", () -> {
      ffb $$0 = fmg.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.k aS = new gng.k("weather_target", () -> {
      ffb $$0 = fmg.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.k aT = new gng.k("clouds_target", () -> {
      ffb $$0 = fmg.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.k aU = new gng.k("item_entity_target", () -> {
      ffb $$0 = fmg.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final gng.h aV = new gng.h(OptionalDouble.of(1.0));
   protected static final gng.b aW = new gng.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gng.b aX = new gng.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gng(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)af.c() * fmg.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gng {
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

   protected static class b extends gng {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gng.a {
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

   protected static class d extends gng {
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

   protected static class e extends gng {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aku> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gng {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gng.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fmg.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fmg.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gng {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fmg.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gng.e {
      private final Optional<aku> aY;

      i(List<gng.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gng.i.b $$2 = $$0.get($$1);
               hft $$3 = fmg.Q().aa();
               hfc $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aY = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<aku> c() {
         return this.aY;
      }

      public static gng.i.a d() {
         return new gng.i.a();
      }

      public static final class a {
         private final Builder<gng.i.b> a = new Builder();

         public gng.i.a a(aku $$0, boolean $$1, boolean $$2) {
            this.a.add(new gng.i.b($$0, $$1, $$2));
            return this;
         }

         public gng.i a() {
            return new gng.i(this.a.build());
         }
      }

      static record b(aku a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gng.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gng {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gng.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fmg.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fmg.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gng {
      private final Optional<gnp> aY;

      public m(gnp $$0) {
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

   protected static class n extends gng.e {
      private final Optional<aku> aY;
      private final bad aZ;
      private final boolean ba;

      public n(aku $$0, bad $$1, boolean $$2) {
         super(() -> {
            hft $$3 = fmg.Q().aa();
            hfc $$4 = $$3.b($$0);
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
      protected Optional<aku> c() {
         return this.aY;
      }
   }

   protected static class o extends gng {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gng {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gng {
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
