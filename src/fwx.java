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

public abstract class fwx {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final fwx.p c = new fwx.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fwx.p d = new fwx.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fwx.p e = new fwx.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fwx.p f = new fwx.p(
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
   protected static final fwx.p g = new fwx.p(
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
   protected static final fwx.p h = new fwx.p(
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
   protected static final fwx.m i = new fwx.m();
   protected static final fwx.m j = new fwx.m(fwj::v);
   protected static final fwx.m k = new fwx.m(fwj::p);
   protected static final fwx.m l = new fwx.m(fwj::r);
   protected static final fwx.m m = new fwx.m(fwj::s);
   protected static final fwx.m n = new fwx.m(fwj::w);
   protected static final fwx.m o = new fwx.m(fwj::q);
   protected static final fwx.m p = new fwx.m(fwj::x);
   protected static final fwx.m q = new fwx.m(fwj::y);
   protected static final fwx.m r = new fwx.m(fwj::z);
   protected static final fwx.m s = new fwx.m(fwj::A);
   protected static final fwx.m t = new fwx.m(fwj::B);
   protected static final fwx.m u = new fwx.m(fwj::C);
   protected static final fwx.m v = new fwx.m(fwj::D);
   protected static final fwx.m w = new fwx.m(fwj::E);
   protected static final fwx.m x = new fwx.m(fwj::F);
   protected static final fwx.m y = new fwx.m(fwj::G);
   protected static final fwx.m z = new fwx.m(fwj::H);
   protected static final fwx.m A = new fwx.m(fwj::I);
   protected static final fwx.m B = new fwx.m(fwj::J);
   protected static final fwx.m C = new fwx.m(fwj::K);
   protected static final fwx.m D = new fwx.m(fwj::L);
   protected static final fwx.m E = new fwx.m(fwj::M);
   protected static final fwx.m F = new fwx.m(fwj::N);
   protected static final fwx.m G = new fwx.m(fwj::O);
   protected static final fwx.m H = new fwx.m(fwj::P);
   protected static final fwx.m I = new fwx.m(fwj::Q);
   protected static final fwx.m J = new fwx.m(fwj::R);
   protected static final fwx.m K = new fwx.m(fwj::S);
   protected static final fwx.m L = new fwx.m(fwj::U);
   protected static final fwx.m M = new fwx.m(fwj::V);
   protected static final fwx.m N = new fwx.m(fwj::W);
   protected static final fwx.m O = new fwx.m(fwj::X);
   protected static final fwx.m P = new fwx.m(fwj::Y);
   protected static final fwx.m Q = new fwx.m(fwj::Z);
   protected static final fwx.m R = new fwx.m(fwj::aa);
   protected static final fwx.m S = new fwx.m(fwj::ab);
   protected static final fwx.m T = new fwx.m(fwj::ac);
   protected static final fwx.m U = new fwx.m(fwj::ad);
   protected static final fwx.m V = new fwx.m(fwj::aq);
   protected static final fwx.m W = new fwx.m(fwj::ae);
   protected static final fwx.m X = new fwx.m(fwj::af);
   protected static final fwx.m Y = new fwx.m(fwj::ag);
   protected static final fwx.m Z = new fwx.m(fwj::ah);
   protected static final fwx.m aa = new fwx.m(fwj::ai);
   protected static final fwx.m ab = new fwx.m(fwj::aj);
   protected static final fwx.m ac = new fwx.m(fwj::ak);
   protected static final fwx.m ad = new fwx.m(fwj::al);
   protected static final fwx.m ae = new fwx.m(fwj::am);
   protected static final fwx.m af = new fwx.m(fwj::an);
   protected static final fwx.m ag = new fwx.m(fwj::ao);
   protected static final fwx.m ah = new fwx.m(fwj::ap);
   protected static final fwx.m ai = new fwx.m(fwj::ar);
   protected static final fwx.m aj = new fwx.m(fwj::as);
   protected static final fwx.m ak = new fwx.m(fwj::at);
   protected static final fwx.m al = new fwx.m(fwj::au);
   protected static final fwx.m am = new fwx.m(fwj::T);
   protected static final fwx.n an = new fwx.n(ghy.e, false, true);
   protected static final fwx.n ao = new fwx.n(ghy.e, false, false);
   protected static final fwx.e ap = new fwx.e();
   protected static final fwx.o aq = new fwx.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fwx.o ar = new fwx.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fwx.o as = new fwx.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fwx.g at = new fwx.g(true);
   protected static final fwx.g au = new fwx.g(false);
   protected static final fwx.l av = new fwx.l(true);
   protected static final fwx.l aw = new fwx.l(false);
   protected static final fwx.c ax = new fwx.c(true);
   protected static final fwx.c ay = new fwx.c(false);
   protected static final fwx.d az = new fwx.d("always", 519);
   protected static final fwx.d aA = new fwx.d("==", 514);
   protected static final fwx.d aB = new fwx.d("<=", 515);
   protected static final fwx.d aC = new fwx.d(">", 516);
   protected static final fwx.q aD = new fwx.q(true, true);
   protected static final fwx.q aE = new fwx.q(true, false);
   protected static final fwx.q aF = new fwx.q(false, true);
   protected static final fwx.f aG = new fwx.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fwx.f aH = new fwx.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fwx.f aI = new fwx.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fwx.k aJ = new fwx.k("main_target", () -> {
   }, () -> {
   });
   protected static final fwx.k aK = new fwx.k("outline_target", () -> eyk.P().f.s().a(false), () -> eyk.P().g().a(false));
   protected static final fwx.k aL = new fwx.k("translucent_target", () -> {
      if (eyk.N()) {
         eyk.P().f.t().a(false);
      }
   }, () -> {
      if (eyk.N()) {
         eyk.P().g().a(false);
      }
   });
   protected static final fwx.k aM = new fwx.k("particles_target", () -> {
      if (eyk.N()) {
         eyk.P().f.v().a(false);
      }
   }, () -> {
      if (eyk.N()) {
         eyk.P().g().a(false);
      }
   });
   protected static final fwx.k aN = new fwx.k("weather_target", () -> {
      if (eyk.N()) {
         eyk.P().f.w().a(false);
      }
   }, () -> {
      if (eyk.N()) {
         eyk.P().g().a(false);
      }
   });
   protected static final fwx.k aO = new fwx.k("clouds_target", () -> {
      if (eyk.N()) {
         eyk.P().f.x().a(false);
      }
   }, () -> {
      if (eyk.N()) {
         eyk.P().g().a(false);
      }
   });
   protected static final fwx.k aP = new fwx.k("item_entity_target", () -> {
      if (eyk.N()) {
         eyk.P().f.u().a(false);
      }
   }, () -> {
      if (eyk.N()) {
         eyk.P().g().a(false);
      }
   });
   protected static final fwx.h aQ = new fwx.h(OptionalDouble.of(1.0));
   protected static final fwx.b aR = new fwx.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fwx.b aS = new fwx.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fwx(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aU = $$1;
      this.aV = $$2;
   }

   public void a() {
      this.aU.run();
   }

   public void b() {
      this.aV.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ac.b() * eyk.P().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fwx {
      private final boolean aT;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aT = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aT + "]";
      }
   }

   protected static class b extends fwx {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fwx.a {
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

   protected static class d extends fwx {
      private final String aT;

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
         this.aT = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aT + "]";
      }
   }

   protected static class e extends fwx {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ajc> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fwx {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fwx.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eyk.P().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eyk.P().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fwx {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eyk.P().aN().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aT = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aT.isPresent() ? this.aT.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends fwx.e {
      private final Optional<ajc> aT;

      i(ImmutableList<Triple<ajc, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ajc, Boolean, Boolean> $$2 = (Triple<ajc, Boolean, Boolean>)var2.next();
               gia $$3 = eyk.P().Z();
               $$3.b((ajc)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ajc)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ajc> c() {
         return this.aT;
      }

      public static fwx.i.a d() {
         return new fwx.i.a();
      }

      public static final class a {
         private final Builder<Triple<ajc, Boolean, Boolean>> a = new Builder();

         public fwx.i.a a(ajc $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fwx.i a() {
            return new fwx.i(this.a.build());
         }
      }
   }

   protected static final class j extends fwx.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fwx {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fwx.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eyk.P().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eyk.P().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fwx {
      private final Optional<Supplier<fxe>> aT;

      public m(Supplier<fxe> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aT = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aT = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aT + "]";
      }
   }

   protected static class n extends fwx.e {
      private final Optional<ajc> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ajc $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gia $$3 = eyk.P().Z();
            $$3.b($$0).a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aT = Optional.of($$0);
         this.aU = $$1;
         this.aV = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aT + "(blur=" + this.aU + ", mipmap=" + this.aV + ")]";
      }

      @Override
      protected Optional<ajc> c() {
         return this.aT;
      }
   }

   protected static class o extends fwx {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fwx {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fwx {
      private final boolean aT;
      private final boolean aU;

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
         this.aT = $$0;
         this.aU = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aT + ", writeDepth=" + this.aU + "]";
      }
   }
}
