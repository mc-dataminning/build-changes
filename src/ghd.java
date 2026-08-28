import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class ghd {
   private static final float aW = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aX;
   private final Runnable aY;
   protected static final ghd.p c = new ghd.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ghd.p d = new ghd.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghd.p e = new ghd.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghd.p f = new ghd.p(
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
   protected static final ghd.p g = new ghd.p(
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
   protected static final ghd.p h = new ghd.p(
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
   protected static final ghd.p i = new ghd.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghd.p j = new ghd.p(
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
   protected static final ghd.p k = new ghd.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghd.p l = new ghd.p(
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
   protected static final ghd.m m = new ghd.m();
   protected static final ghd.m n = new ghd.m(ggl::t);
   protected static final ghd.m o = new ghd.m(ggl::o);
   protected static final ghd.m p = new ghd.m(ggl::q);
   protected static final ghd.m q = new ghd.m(ggl::u);
   protected static final ghd.m r = new ghd.m(ggl::p);
   protected static final ghd.m s = new ghd.m(ggl::r);
   protected static final ghd.m t = new ghd.m(ggl::v);
   protected static final ghd.m u = new ghd.m(ggl::w);
   protected static final ghd.m v = new ghd.m(ggl::x);
   protected static final ghd.m w = new ghd.m(ggl::y);
   protected static final ghd.m x = new ghd.m(ggl::z);
   protected static final ghd.m y = new ghd.m(ggl::A);
   protected static final ghd.m z = new ghd.m(ggl::B);
   protected static final ghd.m A = new ghd.m(ggl::C);
   protected static final ghd.m B = new ghd.m(ggl::D);
   protected static final ghd.m C = new ghd.m(ggl::E);
   protected static final ghd.m D = new ghd.m(ggl::F);
   protected static final ghd.m E = new ghd.m(ggl::G);
   protected static final ghd.m F = new ghd.m(ggl::H);
   protected static final ghd.m G = new ghd.m(ggl::I);
   protected static final ghd.m H = new ghd.m(ggl::J);
   protected static final ghd.m I = new ghd.m(ggl::K);
   protected static final ghd.m J = new ghd.m(ggl::L);
   protected static final ghd.m K = new ghd.m(ggl::M);
   protected static final ghd.m L = new ghd.m(ggl::N);
   protected static final ghd.m M = new ghd.m(ggl::O);
   protected static final ghd.m N = new ghd.m(ggl::P);
   protected static final ghd.m O = new ghd.m(ggl::Q);
   protected static final ghd.m P = new ghd.m(ggl::S);
   protected static final ghd.m Q = new ghd.m(ggl::T);
   protected static final ghd.m R = new ghd.m(ggl::U);
   protected static final ghd.m S = new ghd.m(ggl::W);
   protected static final ghd.m T = new ghd.m(ggl::X);
   protected static final ghd.m U = new ghd.m(ggl::Y);
   protected static final ghd.m V = new ghd.m(ggl::aa);
   protected static final ghd.m W = new ghd.m(ggl::ab);
   protected static final ghd.m X = new ghd.m(ggl::ao);
   protected static final ghd.m Y = new ghd.m(ggl::ac);
   protected static final ghd.m Z = new ghd.m(ggl::ad);
   protected static final ghd.m aa = new ghd.m(ggl::ae);
   protected static final ghd.m ab = new ghd.m(ggl::af);
   protected static final ghd.m ac = new ghd.m(ggl::ag);
   protected static final ghd.m ad = new ghd.m(ggl::ah);
   protected static final ghd.m ae = new ghd.m(ggl::ai);
   protected static final ghd.m af = new ghd.m(ggl::aj);
   protected static final ghd.m ag = new ghd.m(ggl::ak);
   protected static final ghd.m ah = new ghd.m(ggl::al);
   protected static final ghd.m ai = new ghd.m(ggl::am);
   protected static final ghd.m aj = new ghd.m(ggl::an);
   protected static final ghd.m ak = new ghd.m(ggl::ap);
   protected static final ghd.m al = new ghd.m(ggl::aq);
   protected static final ghd.m am = new ghd.m(ggl::ar);
   protected static final ghd.m an = new ghd.m(ggl::as);
   protected static final ghd.m ao = new ghd.m(ggl::R);
   protected static final ghd.n ap = new ghd.n(gwj.d, baf.b, true);
   protected static final ghd.n aq = new ghd.n(gwj.d, baf.b, false);
   protected static final ghd.e ar = new ghd.e();
   protected static final ghd.o as = new ghd.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ghd.o at = new ghd.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghd.o au = new ghd.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghd.g av = new ghd.g(true);
   protected static final ghd.g aw = new ghd.g(false);
   protected static final ghd.l ax = new ghd.l(true);
   protected static final ghd.l ay = new ghd.l(false);
   protected static final ghd.c az = new ghd.c(true);
   protected static final ghd.c aA = new ghd.c(false);
   protected static final ghd.d aB = new ghd.d("always", 519);
   protected static final ghd.d aC = new ghd.d("==", 514);
   protected static final ghd.d aD = new ghd.d("<=", 515);
   protected static final ghd.d aE = new ghd.d(">", 516);
   protected static final ghd.q aF = new ghd.q(true, true);
   protected static final ghd.q aG = new ghd.q(true, false);
   protected static final ghd.q aH = new ghd.q(false, true);
   protected static final ghd.f aI = new ghd.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ghd.f aJ = new ghd.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ghd.f aK = new ghd.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghd.f aL = new ghd.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghd.k aM = new ghd.k("main_target", () -> fib.Q().h().a(false), () -> {
   });
   protected static final ghd.k aN = new ghd.k("outline_target", () -> fib.Q().f.r().a(false), () -> fib.Q().h().a(false));
   protected static final ghd.k aO = new ghd.k("translucent_target", () -> {
      if (fib.O()) {
         fib.Q().f.s().a(false);
      } else {
         fib.Q().h().a(false);
      }
   }, () -> {
      if (fib.O()) {
         fib.Q().h().a(false);
      }
   });
   protected static final ghd.k aP = new ghd.k("particles_target", () -> {
      if (fib.O()) {
         fib.Q().f.u().a(false);
      } else {
         fib.Q().h().a(false);
      }
   }, () -> {
      if (fib.O()) {
         fib.Q().h().a(false);
      }
   });
   protected static final ghd.k aQ = new ghd.k("weather_target", () -> {
      if (fib.O()) {
         fib.Q().f.v().a(false);
      } else {
         fib.Q().h().a(false);
      }
   }, () -> {
      if (fib.O()) {
         fib.Q().h().a(false);
      }
   });
   protected static final ghd.k aR = new ghd.k("clouds_target", () -> {
      if (fib.O()) {
         fib.Q().f.w().a(false);
      } else {
         fib.Q().h().a(false);
      }
   }, () -> {
      if (fib.O()) {
         fib.Q().h().a(false);
      }
   });
   protected static final ghd.k aS = new ghd.k("item_entity_target", () -> {
      if (fib.O()) {
         fib.Q().f.t().a(false);
      } else {
         fib.Q().h().a(false);
      }
   }, () -> {
      if (fib.O()) {
         fib.Q().h().a(false);
      }
   });
   protected static final ghd.h aT = new ghd.h(OptionalDouble.of(1.0));
   protected static final ghd.b aU = new ghd.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ghd.b aV = new ghd.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ghd(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aX = $$1;
      this.aY = $$2;
   }

   public void a() {
      this.aX.run();
   }

   public void b() {
      this.aY.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ad.c() * fib.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ghd {
      private final boolean aW;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aW = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aW + "]";
      }
   }

   protected static class b extends ghd {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ghd.a {
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

   protected static class d extends ghd {
      private final String aW;

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
         this.aW = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aW + "]";
      }
   }

   protected static class e extends ghd {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alb> c() {
         return Optional.empty();
      }
   }

   protected static class f extends ghd {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ghd.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fib.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fib.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ghd {
      private final OptionalDouble aW;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fib.Q().aO().l() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aW = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aW.isPresent() ? this.aW.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends ghd.e {
      private final Optional<alb> aW;

      i(ImmutableList<Triple<alb, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alb, Boolean, Boolean> $$2 = (Triple<alb, Boolean, Boolean>)var2.next();
               gwl $$3 = fib.Q().aa();
               $$3.b((alb)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alb)$$2.getLeft());
            }
         }, () -> {
         });
         this.aW = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alb> c() {
         return this.aW;
      }

      public static ghd.i.a d() {
         return new ghd.i.a();
      }

      public static final class a {
         private final Builder<Triple<alb, Boolean, Boolean>> a = new Builder();

         public ghd.i.a a(alb $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ghd.i a() {
            return new ghd.i(this.a.build());
         }
      }
   }

   protected static final class j extends ghd.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ghd {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ghd.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fib.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fib.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ghd {
      private final Optional<Supplier<ghk>> aW;

      public m(Supplier<ghk> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aW = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aW = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aW + "]";
      }
   }

   protected static class n extends ghd.e {
      private final Optional<alb> aW;
      private final baf aX;
      private final boolean aY;

      public n(alb $$0, baf $$1, boolean $$2) {
         super(() -> {
            gwl $$3 = fib.Q().aa();
            gvv $$4 = $$3.b($$0);
            $$4.a($$1.a($$4.c()), $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aW = Optional.of($$0);
         this.aX = $$1;
         this.aY = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aW + "(blur=" + this.aX + ", mipmap=" + this.aY + ")]";
      }

      @Override
      protected Optional<alb> c() {
         return this.aW;
      }
   }

   protected static class o extends ghd {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ghd {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ghd {
      private final boolean aW;
      private final boolean aX;

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
         this.aW = $$0;
         this.aX = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aW + ", writeDepth=" + this.aX + "]";
      }
   }
}
