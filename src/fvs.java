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

public abstract class fvs {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fvs.p c = new fvs.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fvs.p d = new fvs.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fvs.p e = new fvs.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fvs.p f = new fvs.p(
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
   protected static final fvs.p g = new fvs.p(
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
   protected static final fvs.p h = new fvs.p(
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
   protected static final fvs.m i = new fvs.m();
   protected static final fvs.m j = new fvs.m(fve::v);
   protected static final fvs.m k = new fvs.m(fve::p);
   protected static final fvs.m l = new fvs.m(fve::r);
   protected static final fvs.m m = new fvs.m(fve::s);
   protected static final fvs.m n = new fvs.m(fve::w);
   protected static final fvs.m o = new fvs.m(fve::q);
   protected static final fvs.m p = new fvs.m(fve::z);
   protected static final fvs.m q = new fvs.m(fve::A);
   protected static final fvs.m r = new fvs.m(fve::B);
   protected static final fvs.m s = new fvs.m(fve::C);
   protected static final fvs.m t = new fvs.m(fve::D);
   protected static final fvs.m u = new fvs.m(fve::E);
   protected static final fvs.m v = new fvs.m(fve::F);
   protected static final fvs.m w = new fvs.m(fve::G);
   protected static final fvs.m x = new fvs.m(fve::H);
   protected static final fvs.m y = new fvs.m(fve::I);
   protected static final fvs.m z = new fvs.m(fve::J);
   protected static final fvs.m A = new fvs.m(fve::K);
   protected static final fvs.m B = new fvs.m(fve::L);
   protected static final fvs.m C = new fvs.m(fve::M);
   protected static final fvs.m D = new fvs.m(fve::N);
   protected static final fvs.m E = new fvs.m(fve::O);
   protected static final fvs.m F = new fvs.m(fve::P);
   protected static final fvs.m G = new fvs.m(fve::Q);
   protected static final fvs.m H = new fvs.m(fve::R);
   protected static final fvs.m I = new fvs.m(fve::S);
   protected static final fvs.m J = new fvs.m(fve::T);
   protected static final fvs.m K = new fvs.m(fve::U);
   protected static final fvs.m L = new fvs.m(fve::W);
   protected static final fvs.m M = new fvs.m(fve::X);
   protected static final fvs.m N = new fvs.m(fve::Y);
   protected static final fvs.m O = new fvs.m(fve::Z);
   protected static final fvs.m P = new fvs.m(fve::aa);
   protected static final fvs.m Q = new fvs.m(fve::ab);
   protected static final fvs.m R = new fvs.m(fve::ac);
   protected static final fvs.m S = new fvs.m(fve::ad);
   protected static final fvs.m T = new fvs.m(fve::ae);
   protected static final fvs.m U = new fvs.m(fve::af);
   protected static final fvs.m V = new fvs.m(fve::ar);
   protected static final fvs.m W = new fvs.m(fve::ag);
   protected static final fvs.m X = new fvs.m(fve::ah);
   protected static final fvs.m Y = new fvs.m(fve::ai);
   protected static final fvs.m Z = new fvs.m(fve::aj);
   protected static final fvs.m aa = new fvs.m(fve::ak);
   protected static final fvs.m ab = new fvs.m(fve::al);
   protected static final fvs.m ac = new fvs.m(fve::am);
   protected static final fvs.m ad = new fvs.m(fve::an);
   protected static final fvs.m ae = new fvs.m(fve::ao);
   protected static final fvs.m af = new fvs.m(fve::ap);
   protected static final fvs.m ag = new fvs.m(fve::aq);
   protected static final fvs.m ah = new fvs.m(fve::as);
   protected static final fvs.m ai = new fvs.m(fve::at);
   protected static final fvs.m aj = new fvs.m(fve::au);
   protected static final fvs.m ak = new fvs.m(fve::av);
   protected static final fvs.m al = new fvs.m(fve::V);
   protected static final fvs.n am = new fvs.n(ggs.e, false, true);
   protected static final fvs.n an = new fvs.n(ggs.e, false, false);
   protected static final fvs.e ao = new fvs.e();
   protected static final fvs.o ap = new fvs.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fvs.o aq = new fvs.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fvs.o ar = new fvs.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fvs.g as = new fvs.g(true);
   protected static final fvs.g at = new fvs.g(false);
   protected static final fvs.l au = new fvs.l(true);
   protected static final fvs.l av = new fvs.l(false);
   protected static final fvs.c aw = new fvs.c(true);
   protected static final fvs.c ax = new fvs.c(false);
   protected static final fvs.d ay = new fvs.d("always", 519);
   protected static final fvs.d az = new fvs.d("==", 514);
   protected static final fvs.d aA = new fvs.d("<=", 515);
   protected static final fvs.d aB = new fvs.d(">", 516);
   protected static final fvs.q aC = new fvs.q(true, true);
   protected static final fvs.q aD = new fvs.q(true, false);
   protected static final fvs.q aE = new fvs.q(false, true);
   protected static final fvs.f aF = new fvs.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fvs.f aG = new fvs.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fvs.f aH = new fvs.f("view_offset_z_layering", () -> {
      esa $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      esa $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fvs.k aI = new fvs.k("main_target", () -> {
   }, () -> {
   });
   protected static final fvs.k aJ = new fvs.k("outline_target", () -> exh.O().f.s().a(false), () -> exh.O().g().a(false));
   protected static final fvs.k aK = new fvs.k("translucent_target", () -> {
      if (exh.M()) {
         exh.O().f.t().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvs.k aL = new fvs.k("particles_target", () -> {
      if (exh.M()) {
         exh.O().f.v().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvs.k aM = new fvs.k("weather_target", () -> {
      if (exh.M()) {
         exh.O().f.w().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvs.k aN = new fvs.k("clouds_target", () -> {
      if (exh.M()) {
         exh.O().f.x().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvs.k aO = new fvs.k("item_entity_target", () -> {
      if (exh.M()) {
         exh.O().f.u().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvs.h aP = new fvs.h(OptionalDouble.of(1.0));
   protected static final fvs.b aQ = new fvs.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fvs.b aR = new fvs.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fvs(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * exh.O().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fvs {
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

   protected static class b extends fvs {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fvs.a {
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

   protected static class d extends fvs {
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

   protected static class e extends fvs {
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

   protected static class f extends fvs {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fvs.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               exh.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               exh.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fvs {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)exh.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fvs.e {
      private final Optional<aiy> aS;

      i(ImmutableList<Triple<aiy, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aiy, Boolean, Boolean> $$2 = (Triple<aiy, Boolean, Boolean>)var2.next();
               ggu $$3 = exh.O().Y();
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

      public static fvs.i.a d() {
         return new fvs.i.a();
      }

      public static final class a {
         private final Builder<Triple<aiy, Boolean, Boolean>> a = new Builder();

         public fvs.i.a a(aiy $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fvs.i a() {
            return new fvs.i(this.a.build());
         }
      }
   }

   protected static final class j extends fvs.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fvs {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fvs.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               exh.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               exh.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fvs {
      private final Optional<Supplier<fvz>> aS;

      public m(Supplier<fvz> $$0) {
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

   protected static class n extends fvs.e {
      private final Optional<aiy> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aiy $$0, boolean $$1, boolean $$2) {
         super(() -> {
            ggu $$3 = exh.O().Y();
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

   protected static class o extends fvs {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fvs {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fvs {
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
