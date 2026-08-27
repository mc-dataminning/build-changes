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

public abstract class fwa {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fwa.p c = new fwa.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fwa.p d = new fwa.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fwa.p e = new fwa.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fwa.p f = new fwa.p(
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
   protected static final fwa.p g = new fwa.p(
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
   protected static final fwa.p h = new fwa.p(
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
   protected static final fwa.m i = new fwa.m();
   protected static final fwa.m j = new fwa.m(fvm::v);
   protected static final fwa.m k = new fwa.m(fvm::p);
   protected static final fwa.m l = new fwa.m(fvm::r);
   protected static final fwa.m m = new fwa.m(fvm::s);
   protected static final fwa.m n = new fwa.m(fvm::w);
   protected static final fwa.m o = new fwa.m(fvm::q);
   protected static final fwa.m p = new fwa.m(fvm::z);
   protected static final fwa.m q = new fwa.m(fvm::A);
   protected static final fwa.m r = new fwa.m(fvm::B);
   protected static final fwa.m s = new fwa.m(fvm::C);
   protected static final fwa.m t = new fwa.m(fvm::D);
   protected static final fwa.m u = new fwa.m(fvm::E);
   protected static final fwa.m v = new fwa.m(fvm::F);
   protected static final fwa.m w = new fwa.m(fvm::G);
   protected static final fwa.m x = new fwa.m(fvm::H);
   protected static final fwa.m y = new fwa.m(fvm::I);
   protected static final fwa.m z = new fwa.m(fvm::J);
   protected static final fwa.m A = new fwa.m(fvm::K);
   protected static final fwa.m B = new fwa.m(fvm::L);
   protected static final fwa.m C = new fwa.m(fvm::M);
   protected static final fwa.m D = new fwa.m(fvm::N);
   protected static final fwa.m E = new fwa.m(fvm::O);
   protected static final fwa.m F = new fwa.m(fvm::P);
   protected static final fwa.m G = new fwa.m(fvm::Q);
   protected static final fwa.m H = new fwa.m(fvm::R);
   protected static final fwa.m I = new fwa.m(fvm::S);
   protected static final fwa.m J = new fwa.m(fvm::T);
   protected static final fwa.m K = new fwa.m(fvm::U);
   protected static final fwa.m L = new fwa.m(fvm::W);
   protected static final fwa.m M = new fwa.m(fvm::X);
   protected static final fwa.m N = new fwa.m(fvm::Y);
   protected static final fwa.m O = new fwa.m(fvm::Z);
   protected static final fwa.m P = new fwa.m(fvm::aa);
   protected static final fwa.m Q = new fwa.m(fvm::ab);
   protected static final fwa.m R = new fwa.m(fvm::ac);
   protected static final fwa.m S = new fwa.m(fvm::ad);
   protected static final fwa.m T = new fwa.m(fvm::ae);
   protected static final fwa.m U = new fwa.m(fvm::af);
   protected static final fwa.m V = new fwa.m(fvm::ar);
   protected static final fwa.m W = new fwa.m(fvm::ag);
   protected static final fwa.m X = new fwa.m(fvm::ah);
   protected static final fwa.m Y = new fwa.m(fvm::ai);
   protected static final fwa.m Z = new fwa.m(fvm::aj);
   protected static final fwa.m aa = new fwa.m(fvm::ak);
   protected static final fwa.m ab = new fwa.m(fvm::al);
   protected static final fwa.m ac = new fwa.m(fvm::am);
   protected static final fwa.m ad = new fwa.m(fvm::an);
   protected static final fwa.m ae = new fwa.m(fvm::ao);
   protected static final fwa.m af = new fwa.m(fvm::ap);
   protected static final fwa.m ag = new fwa.m(fvm::aq);
   protected static final fwa.m ah = new fwa.m(fvm::as);
   protected static final fwa.m ai = new fwa.m(fvm::at);
   protected static final fwa.m aj = new fwa.m(fvm::au);
   protected static final fwa.m ak = new fwa.m(fvm::av);
   protected static final fwa.m al = new fwa.m(fvm::V);
   protected static final fwa.n am = new fwa.n(gha.e, false, true);
   protected static final fwa.n an = new fwa.n(gha.e, false, false);
   protected static final fwa.e ao = new fwa.e();
   protected static final fwa.o ap = new fwa.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fwa.o aq = new fwa.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fwa.o ar = new fwa.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fwa.g as = new fwa.g(true);
   protected static final fwa.g at = new fwa.g(false);
   protected static final fwa.l au = new fwa.l(true);
   protected static final fwa.l av = new fwa.l(false);
   protected static final fwa.c aw = new fwa.c(true);
   protected static final fwa.c ax = new fwa.c(false);
   protected static final fwa.d ay = new fwa.d("always", 519);
   protected static final fwa.d az = new fwa.d("==", 514);
   protected static final fwa.d aA = new fwa.d("<=", 515);
   protected static final fwa.d aB = new fwa.d(">", 516);
   protected static final fwa.q aC = new fwa.q(true, true);
   protected static final fwa.q aD = new fwa.q(true, false);
   protected static final fwa.q aE = new fwa.q(false, true);
   protected static final fwa.f aF = new fwa.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fwa.f aG = new fwa.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fwa.f aH = new fwa.f("view_offset_z_layering", () -> {
      esh $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      esh $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fwa.k aI = new fwa.k("main_target", () -> {
   }, () -> {
   });
   protected static final fwa.k aJ = new fwa.k("outline_target", () -> exo.P().f.s().a(false), () -> exo.P().g().a(false));
   protected static final fwa.k aK = new fwa.k("translucent_target", () -> {
      if (exo.N()) {
         exo.P().f.t().a(false);
      }
   }, () -> {
      if (exo.N()) {
         exo.P().g().a(false);
      }
   });
   protected static final fwa.k aL = new fwa.k("particles_target", () -> {
      if (exo.N()) {
         exo.P().f.v().a(false);
      }
   }, () -> {
      if (exo.N()) {
         exo.P().g().a(false);
      }
   });
   protected static final fwa.k aM = new fwa.k("weather_target", () -> {
      if (exo.N()) {
         exo.P().f.w().a(false);
      }
   }, () -> {
      if (exo.N()) {
         exo.P().g().a(false);
      }
   });
   protected static final fwa.k aN = new fwa.k("clouds_target", () -> {
      if (exo.N()) {
         exo.P().f.x().a(false);
      }
   }, () -> {
      if (exo.N()) {
         exo.P().g().a(false);
      }
   });
   protected static final fwa.k aO = new fwa.k("item_entity_target", () -> {
      if (exo.N()) {
         exo.P().f.u().a(false);
      }
   }, () -> {
      if (exo.N()) {
         exo.P().g().a(false);
      }
   });
   protected static final fwa.h aP = new fwa.h(OptionalDouble.of(1.0));
   protected static final fwa.b aQ = new fwa.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fwa.b aR = new fwa.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fwa(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aT = $$1;
      this.aU = $$2;
   }

   public void a() {
      this.aT.run();
   }

   public void b() {
      this.aU.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ac.b() * exo.P().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fwa {
      private final boolean aS;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aS = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class b extends fwa {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fwa.a {
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

   protected static class d extends fwa {
      private final String aS;

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
         this.aS = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class e extends fwa {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aiy> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fwa {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fwa.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               exo.P().j.n().c();
            }
         }, () -> {
            if ($$0) {
               exo.P().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fwa {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)exo.P().aN().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aS = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aS.isPresent() ? this.aS.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends fwa.e {
      private final Optional<aiy> aS;

      i(ImmutableList<Triple<aiy, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aiy, Boolean, Boolean> $$2 = (Triple<aiy, Boolean, Boolean>)var2.next();
               ghc $$3 = exo.P().Z();
               $$3.b((aiy)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aiy)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aiy> c() {
         return this.aS;
      }

      public static fwa.i.a d() {
         return new fwa.i.a();
      }

      public static final class a {
         private final Builder<Triple<aiy, Boolean, Boolean>> a = new Builder();

         public fwa.i.a a(aiy $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fwa.i a() {
            return new fwa.i(this.a.build());
         }
      }
   }

   protected static final class j extends fwa.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fwa {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fwa.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               exo.P().j.o().a();
            }
         }, () -> {
            if ($$0) {
               exo.P().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fwa {
      private final Optional<Supplier<fwh>> aS;

      public m(Supplier<fwh> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aS = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aS = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class n extends fwa.e {
      private final Optional<aiy> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aiy $$0, boolean $$1, boolean $$2) {
         super(() -> {
            ghc $$3 = exo.P().Z();
            $$3.b($$0).a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aS = Optional.of($$0);
         this.aT = $$1;
         this.aU = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "(blur=" + this.aT + ", mipmap=" + this.aU + ")]";
      }

      @Override
      protected Optional<aiy> c() {
         return this.aS;
      }
   }

   protected static class o extends fwa {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fwa {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fwa {
      private final boolean aS;
      private final boolean aT;

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
         this.aS = $$0;
         this.aT = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aS + ", writeDepth=" + this.aT + "]";
      }
   }
}
