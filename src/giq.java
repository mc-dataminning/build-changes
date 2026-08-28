import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class giq {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final giq.p c = new giq.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final giq.p d = new giq.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final giq.p e = new giq.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final giq.p f = new giq.p(
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
   protected static final giq.p g = new giq.p(
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
   protected static final giq.p h = new giq.p(
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
   protected static final giq.p i = new giq.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final giq.p j = new giq.p(
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
   protected static final giq.p k = new giq.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final giq.p l = new giq.p(
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
   protected static final giq.m m = new giq.m();
   protected static final giq.m n = new giq.m(ghr.f);
   protected static final giq.m o = new giq.m(ghr.d);
   protected static final giq.m p = new giq.m(ghr.h);
   protected static final giq.m q = new giq.m(ghr.g);
   protected static final giq.m r = new giq.m(ghr.e);
   protected static final giq.m s = new giq.m(ghr.i);
   protected static final giq.m t = new giq.m(ghr.j);
   protected static final giq.m u = new giq.m(ghr.k);
   protected static final giq.m v = new giq.m(ghr.l);
   protected static final giq.m w = new giq.m(ghr.m);
   protected static final giq.m x = new giq.m(ghr.n);
   protected static final giq.m y = new giq.m(ghr.o);
   protected static final giq.m z = new giq.m(ghr.p);
   protected static final giq.m A = new giq.m(ghr.q);
   protected static final giq.m B = new giq.m(ghr.r);
   protected static final giq.m C = new giq.m(ghr.s);
   protected static final giq.m D = new giq.m(ghr.t);
   protected static final giq.m E = new giq.m(ghr.u);
   protected static final giq.m F = new giq.m(ghr.v);
   protected static final giq.m G = new giq.m(ghr.w);
   protected static final giq.m H = new giq.m(ghr.x);
   protected static final giq.m I = new giq.m(ghr.y);
   protected static final giq.m J = new giq.m(ghr.z);
   protected static final giq.m K = new giq.m(ghr.A);
   protected static final giq.m L = new giq.m(ghr.B);
   protected static final giq.m M = new giq.m(ghr.C);
   protected static final giq.m N = new giq.m(ghr.D);
   protected static final giq.m O = new giq.m(ghr.E);
   protected static final giq.m P = new giq.m(ghr.F);
   protected static final giq.m Q = new giq.m(ghr.G);
   protected static final giq.m R = new giq.m(ghr.H);
   protected static final giq.m S = new giq.m(ghr.I);
   protected static final giq.m T = new giq.m(ghr.J);
   protected static final giq.m U = new giq.m(ghr.K);
   protected static final giq.m V = new giq.m(ghr.X);
   protected static final giq.m W = new giq.m(ghr.L);
   protected static final giq.m X = new giq.m(ghr.M);
   protected static final giq.m Y = new giq.m(ghr.N);
   protected static final giq.m Z = new giq.m(ghr.O);
   protected static final giq.m aa = new giq.m(ghr.P);
   protected static final giq.m ab = new giq.m(ghr.Q);
   protected static final giq.m ac = new giq.m(ghr.R);
   protected static final giq.m ad = new giq.m(ghr.S);
   protected static final giq.m ae = new giq.m(ghr.T);
   protected static final giq.m af = new giq.m(ghr.U);
   protected static final giq.m ag = new giq.m(ghr.V);
   protected static final giq.m ah = new giq.m(ghr.W);
   protected static final giq.m ai = new giq.m(ghr.Y);
   protected static final giq.m aj = new giq.m(ghr.Z);
   protected static final giq.m ak = new giq.m(ghr.aa);
   protected static final giq.m al = new giq.m(ghr.ab);
   protected static final giq.m am = new giq.m(ghr.ac);
   protected static final giq.n an = new giq.n(gyc.d, ban.b, true);
   protected static final giq.n ao = new giq.n(gyc.d, ban.b, false);
   protected static final giq.e ap = new giq.e();
   protected static final giq.o aq = new giq.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final giq.o ar = new giq.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final giq.o as = new giq.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final giq.g at = new giq.g(true);
   protected static final giq.g au = new giq.g(false);
   protected static final giq.l av = new giq.l(true);
   protected static final giq.l aw = new giq.l(false);
   protected static final giq.c ax = new giq.c(true);
   protected static final giq.c ay = new giq.c(false);
   protected static final giq.d az = new giq.d("always", 519);
   protected static final giq.d aA = new giq.d("==", 514);
   protected static final giq.d aB = new giq.d("<=", 515);
   protected static final giq.d aC = new giq.d(">", 516);
   protected static final giq.q aD = new giq.q(true, true);
   protected static final giq.q aE = new giq.q(true, false);
   protected static final giq.q aF = new giq.q(false, true);
   protected static final giq.f aG = new giq.f("no_layering", () -> {
   }, () -> {
   });
   protected static final giq.f aH = new giq.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final giq.f aI = new giq.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final giq.f aJ = new giq.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final giq.k aK = new giq.k("main_target", () -> fji.Q().h().a(false), () -> {
   });
   protected static final giq.k aL = new giq.k("outline_target", () -> fji.Q().f.q().a(false), () -> fji.Q().h().a(false));
   protected static final giq.k aM = new giq.k("translucent_target", () -> {
      fcl $$0 = fji.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fji.Q().h().a(false);
      }
   }, () -> fji.Q().h().a(false));
   protected static final giq.k aN = new giq.k("particles_target", () -> {
      fcl $$0 = fji.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fji.Q().h().a(false);
      }
   }, () -> fji.Q().h().a(false));
   protected static final giq.k aO = new giq.k("weather_target", () -> {
      fcl $$0 = fji.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fji.Q().h().a(false);
      }
   }, () -> fji.Q().h().a(false));
   protected static final giq.k aP = new giq.k("clouds_target", () -> {
      fcl $$0 = fji.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fji.Q().h().a(false);
      }
   }, () -> fji.Q().h().a(false));
   protected static final giq.k aQ = new giq.k("item_entity_target", () -> {
      fcl $$0 = fji.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fji.Q().h().a(false);
      }
   }, () -> fji.Q().h().a(false));
   protected static final giq.h aR = new giq.h(OptionalDouble.of(1.0));
   protected static final giq.b aS = new giq.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final giq.b aT = new giq.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public giq(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aV = $$1;
      this.aW = $$2;
   }

   public void a() {
      this.aV.run();
   }

   public void b() {
      this.aW.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ae.c() * fji.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends giq {
      private final boolean aU;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aU = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class b extends giq {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends giq.a {
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

   protected static class d extends giq {
      private final String aU;

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
         this.aU = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class e extends giq {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ali> c() {
         return Optional.empty();
      }
   }

   protected static class f extends giq {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends giq.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fji.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fji.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends giq {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fji.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aU = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aU.isPresent() ? this.aU.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends giq.e {
      private final Optional<ali> aU;

      i(ImmutableList<Triple<ali, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ali, Boolean, Boolean> $$2 = (Triple<ali, Boolean, Boolean>)var2.next();
               gye $$3 = fji.Q().aa();
               $$3.a((ali)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ali)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ali> c() {
         return this.aU;
      }

      public static giq.i.a d() {
         return new giq.i.a();
      }

      public static final class a {
         private final Builder<Triple<ali, Boolean, Boolean>> a = new Builder();

         public giq.i.a a(ali $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public giq.i a() {
            return new giq.i(this.a.build());
         }
      }
   }

   protected static final class j extends giq.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends giq {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends giq.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fji.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fji.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends giq {
      private final Optional<giz> aU;

      public m(giz $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aU = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aU = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class n extends giq.e {
      private final Optional<ali> aU;
      private final ban aV;
      private final boolean aW;

      public n(ali $$0, ban $$1, boolean $$2) {
         super(() -> {
            gye $$3 = fji.Q().aa();
            gxo $$4 = $$3.a($$0);
            $$4.a($$1.a($$4.c()), $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aU = Optional.of($$0);
         this.aV = $$1;
         this.aW = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "(blur=" + this.aV + ", mipmap=" + this.aW + ")]";
      }

      @Override
      protected Optional<ali> c() {
         return this.aU;
      }
   }

   protected static class o extends giq {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends giq {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends giq {
      private final boolean aU;
      private final boolean aV;

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
         this.aU = $$0;
         this.aV = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aU + ", writeDepth=" + this.aV + "]";
      }
   }
}
