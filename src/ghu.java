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

public abstract class ghu {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final ghu.p c = new ghu.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ghu.p d = new ghu.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghu.p e = new ghu.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghu.p f = new ghu.p(
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
   protected static final ghu.p g = new ghu.p(
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
   protected static final ghu.p h = new ghu.p(
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
   protected static final ghu.p i = new ghu.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghu.p j = new ghu.p(
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
   protected static final ghu.p k = new ghu.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghu.p l = new ghu.p(
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
   protected static final ghu.m m = new ghu.m();
   protected static final ghu.m n = new ghu.m(ggv.f);
   protected static final ghu.m o = new ghu.m(ggv.d);
   protected static final ghu.m p = new ghu.m(ggv.h);
   protected static final ghu.m q = new ghu.m(ggv.g);
   protected static final ghu.m r = new ghu.m(ggv.e);
   protected static final ghu.m s = new ghu.m(ggv.i);
   protected static final ghu.m t = new ghu.m(ggv.j);
   protected static final ghu.m u = new ghu.m(ggv.k);
   protected static final ghu.m v = new ghu.m(ggv.l);
   protected static final ghu.m w = new ghu.m(ggv.m);
   protected static final ghu.m x = new ghu.m(ggv.n);
   protected static final ghu.m y = new ghu.m(ggv.o);
   protected static final ghu.m z = new ghu.m(ggv.p);
   protected static final ghu.m A = new ghu.m(ggv.q);
   protected static final ghu.m B = new ghu.m(ggv.r);
   protected static final ghu.m C = new ghu.m(ggv.s);
   protected static final ghu.m D = new ghu.m(ggv.t);
   protected static final ghu.m E = new ghu.m(ggv.u);
   protected static final ghu.m F = new ghu.m(ggv.v);
   protected static final ghu.m G = new ghu.m(ggv.w);
   protected static final ghu.m H = new ghu.m(ggv.x);
   protected static final ghu.m I = new ghu.m(ggv.y);
   protected static final ghu.m J = new ghu.m(ggv.z);
   protected static final ghu.m K = new ghu.m(ggv.A);
   protected static final ghu.m L = new ghu.m(ggv.B);
   protected static final ghu.m M = new ghu.m(ggv.C);
   protected static final ghu.m N = new ghu.m(ggv.D);
   protected static final ghu.m O = new ghu.m(ggv.E);
   protected static final ghu.m P = new ghu.m(ggv.F);
   protected static final ghu.m Q = new ghu.m(ggv.G);
   protected static final ghu.m R = new ghu.m(ggv.H);
   protected static final ghu.m S = new ghu.m(ggv.I);
   protected static final ghu.m T = new ghu.m(ggv.J);
   protected static final ghu.m U = new ghu.m(ggv.K);
   protected static final ghu.m V = new ghu.m(ggv.X);
   protected static final ghu.m W = new ghu.m(ggv.L);
   protected static final ghu.m X = new ghu.m(ggv.M);
   protected static final ghu.m Y = new ghu.m(ggv.N);
   protected static final ghu.m Z = new ghu.m(ggv.O);
   protected static final ghu.m aa = new ghu.m(ggv.P);
   protected static final ghu.m ab = new ghu.m(ggv.Q);
   protected static final ghu.m ac = new ghu.m(ggv.R);
   protected static final ghu.m ad = new ghu.m(ggv.S);
   protected static final ghu.m ae = new ghu.m(ggv.T);
   protected static final ghu.m af = new ghu.m(ggv.U);
   protected static final ghu.m ag = new ghu.m(ggv.V);
   protected static final ghu.m ah = new ghu.m(ggv.W);
   protected static final ghu.m ai = new ghu.m(ggv.Y);
   protected static final ghu.m aj = new ghu.m(ggv.Z);
   protected static final ghu.m ak = new ghu.m(ggv.aa);
   protected static final ghu.m al = new ghu.m(ggv.ab);
   protected static final ghu.m am = new ghu.m(ggv.ac);
   protected static final ghu.n an = new ghu.n(gxf.d, bai.b, true);
   protected static final ghu.n ao = new ghu.n(gxf.d, bai.b, false);
   protected static final ghu.e ap = new ghu.e();
   protected static final ghu.o aq = new ghu.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ghu.o ar = new ghu.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghu.o as = new ghu.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghu.g at = new ghu.g(true);
   protected static final ghu.g au = new ghu.g(false);
   protected static final ghu.l av = new ghu.l(true);
   protected static final ghu.l aw = new ghu.l(false);
   protected static final ghu.c ax = new ghu.c(true);
   protected static final ghu.c ay = new ghu.c(false);
   protected static final ghu.d az = new ghu.d("always", 519);
   protected static final ghu.d aA = new ghu.d("==", 514);
   protected static final ghu.d aB = new ghu.d("<=", 515);
   protected static final ghu.d aC = new ghu.d(">", 516);
   protected static final ghu.q aD = new ghu.q(true, true);
   protected static final ghu.q aE = new ghu.q(true, false);
   protected static final ghu.q aF = new ghu.q(false, true);
   protected static final ghu.f aG = new ghu.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ghu.f aH = new ghu.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ghu.f aI = new ghu.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghu.f aJ = new ghu.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghu.k aK = new ghu.k("main_target", () -> fip.Q().h().a(false), () -> {
   });
   protected static final ghu.k aL = new ghu.k("outline_target", () -> fip.Q().f.q().a(false), () -> fip.Q().h().a(false));
   protected static final ghu.k aM = new ghu.k("translucent_target", () -> {
      fbs $$0 = fip.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fip.Q().h().a(false);
      }
   }, () -> fip.Q().h().a(false));
   protected static final ghu.k aN = new ghu.k("particles_target", () -> {
      fbs $$0 = fip.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fip.Q().h().a(false);
      }
   }, () -> fip.Q().h().a(false));
   protected static final ghu.k aO = new ghu.k("weather_target", () -> {
      fbs $$0 = fip.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fip.Q().h().a(false);
      }
   }, () -> fip.Q().h().a(false));
   protected static final ghu.k aP = new ghu.k("clouds_target", () -> {
      fbs $$0 = fip.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fip.Q().h().a(false);
      }
   }, () -> fip.Q().h().a(false));
   protected static final ghu.k aQ = new ghu.k("item_entity_target", () -> {
      fbs $$0 = fip.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fip.Q().h().a(false);
      }
   }, () -> fip.Q().h().a(false));
   protected static final ghu.h aR = new ghu.h(OptionalDouble.of(1.0));
   protected static final ghu.b aS = new ghu.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ghu.b aT = new ghu.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ghu(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.c() * fip.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ghu {
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

   protected static class b extends ghu {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ghu.a {
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

   protected static class d extends ghu {
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

   protected static class e extends ghu {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ale> c() {
         return Optional.empty();
      }
   }

   protected static class f extends ghu {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ghu.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fip.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fip.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ghu {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fip.Q().aP().l() / 1920.0F * 2.5F));
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

   protected static class i extends ghu.e {
      private final Optional<ale> aU;

      i(ImmutableList<Triple<ale, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ale, Boolean, Boolean> $$2 = (Triple<ale, Boolean, Boolean>)var2.next();
               gxh $$3 = fip.Q().aa();
               $$3.a((ale)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ale)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ale> c() {
         return this.aU;
      }

      public static ghu.i.a d() {
         return new ghu.i.a();
      }

      public static final class a {
         private final Builder<Triple<ale, Boolean, Boolean>> a = new Builder();

         public ghu.i.a a(ale $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ghu.i a() {
            return new ghu.i(this.a.build());
         }
      }
   }

   protected static final class j extends ghu.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ghu {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ghu.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fip.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fip.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ghu {
      private final Optional<gid> aU;

      public m(gid $$0) {
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

   protected static class n extends ghu.e {
      private final Optional<ale> aU;
      private final bai aV;
      private final boolean aW;

      public n(ale $$0, bai $$1, boolean $$2) {
         super(() -> {
            gxh $$3 = fip.Q().aa();
            gwr $$4 = $$3.a($$0);
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
      protected Optional<ale> c() {
         return this.aU;
      }
   }

   protected static class o extends ghu {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ghu {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ghu {
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
