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

public abstract class fxx {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final fxx.p c = new fxx.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fxx.p d = new fxx.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fxx.p e = new fxx.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fxx.p f = new fxx.p(
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
   protected static final fxx.p g = new fxx.p(
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
   protected static final fxx.p h = new fxx.p(
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
   protected static final fxx.m i = new fxx.m();
   protected static final fxx.m j = new fxx.m(fxj::v);
   protected static final fxx.m k = new fxx.m(fxj::p);
   protected static final fxx.m l = new fxx.m(fxj::r);
   protected static final fxx.m m = new fxx.m(fxj::s);
   protected static final fxx.m n = new fxx.m(fxj::w);
   protected static final fxx.m o = new fxx.m(fxj::q);
   protected static final fxx.m p = new fxx.m(fxj::x);
   protected static final fxx.m q = new fxx.m(fxj::y);
   protected static final fxx.m r = new fxx.m(fxj::z);
   protected static final fxx.m s = new fxx.m(fxj::A);
   protected static final fxx.m t = new fxx.m(fxj::B);
   protected static final fxx.m u = new fxx.m(fxj::C);
   protected static final fxx.m v = new fxx.m(fxj::D);
   protected static final fxx.m w = new fxx.m(fxj::E);
   protected static final fxx.m x = new fxx.m(fxj::F);
   protected static final fxx.m y = new fxx.m(fxj::G);
   protected static final fxx.m z = new fxx.m(fxj::H);
   protected static final fxx.m A = new fxx.m(fxj::I);
   protected static final fxx.m B = new fxx.m(fxj::J);
   protected static final fxx.m C = new fxx.m(fxj::K);
   protected static final fxx.m D = new fxx.m(fxj::L);
   protected static final fxx.m E = new fxx.m(fxj::M);
   protected static final fxx.m F = new fxx.m(fxj::N);
   protected static final fxx.m G = new fxx.m(fxj::O);
   protected static final fxx.m H = new fxx.m(fxj::P);
   protected static final fxx.m I = new fxx.m(fxj::Q);
   protected static final fxx.m J = new fxx.m(fxj::R);
   protected static final fxx.m K = new fxx.m(fxj::S);
   protected static final fxx.m L = new fxx.m(fxj::U);
   protected static final fxx.m M = new fxx.m(fxj::V);
   protected static final fxx.m N = new fxx.m(fxj::W);
   protected static final fxx.m O = new fxx.m(fxj::X);
   protected static final fxx.m P = new fxx.m(fxj::Y);
   protected static final fxx.m Q = new fxx.m(fxj::Z);
   protected static final fxx.m R = new fxx.m(fxj::aa);
   protected static final fxx.m S = new fxx.m(fxj::ab);
   protected static final fxx.m T = new fxx.m(fxj::ac);
   protected static final fxx.m U = new fxx.m(fxj::ad);
   protected static final fxx.m V = new fxx.m(fxj::aq);
   protected static final fxx.m W = new fxx.m(fxj::ae);
   protected static final fxx.m X = new fxx.m(fxj::af);
   protected static final fxx.m Y = new fxx.m(fxj::ag);
   protected static final fxx.m Z = new fxx.m(fxj::ah);
   protected static final fxx.m aa = new fxx.m(fxj::ai);
   protected static final fxx.m ab = new fxx.m(fxj::aj);
   protected static final fxx.m ac = new fxx.m(fxj::ak);
   protected static final fxx.m ad = new fxx.m(fxj::al);
   protected static final fxx.m ae = new fxx.m(fxj::am);
   protected static final fxx.m af = new fxx.m(fxj::an);
   protected static final fxx.m ag = new fxx.m(fxj::ao);
   protected static final fxx.m ah = new fxx.m(fxj::ap);
   protected static final fxx.m ai = new fxx.m(fxj::ar);
   protected static final fxx.m aj = new fxx.m(fxj::as);
   protected static final fxx.m ak = new fxx.m(fxj::at);
   protected static final fxx.m al = new fxx.m(fxj::au);
   protected static final fxx.m am = new fxx.m(fxj::T);
   protected static final fxx.n an = new fxx.n(giy.e, false, true);
   protected static final fxx.n ao = new fxx.n(giy.e, false, false);
   protected static final fxx.e ap = new fxx.e();
   protected static final fxx.o aq = new fxx.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fxx.o ar = new fxx.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fxx.o as = new fxx.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fxx.g at = new fxx.g(true);
   protected static final fxx.g au = new fxx.g(false);
   protected static final fxx.l av = new fxx.l(true);
   protected static final fxx.l aw = new fxx.l(false);
   protected static final fxx.c ax = new fxx.c(true);
   protected static final fxx.c ay = new fxx.c(false);
   protected static final fxx.d az = new fxx.d("always", 519);
   protected static final fxx.d aA = new fxx.d("==", 514);
   protected static final fxx.d aB = new fxx.d("<=", 515);
   protected static final fxx.d aC = new fxx.d(">", 516);
   protected static final fxx.q aD = new fxx.q(true, true);
   protected static final fxx.q aE = new fxx.q(true, false);
   protected static final fxx.q aF = new fxx.q(false, true);
   protected static final fxx.f aG = new fxx.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fxx.f aH = new fxx.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fxx.f aI = new fxx.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fxx.k aJ = new fxx.k("main_target", () -> {
   }, () -> {
   });
   protected static final fxx.k aK = new fxx.k("outline_target", () -> ezg.Q().f.s().a(false), () -> ezg.Q().h().a(false));
   protected static final fxx.k aL = new fxx.k("translucent_target", () -> {
      if (ezg.O()) {
         ezg.Q().f.t().a(false);
      }
   }, () -> {
      if (ezg.O()) {
         ezg.Q().h().a(false);
      }
   });
   protected static final fxx.k aM = new fxx.k("particles_target", () -> {
      if (ezg.O()) {
         ezg.Q().f.v().a(false);
      }
   }, () -> {
      if (ezg.O()) {
         ezg.Q().h().a(false);
      }
   });
   protected static final fxx.k aN = new fxx.k("weather_target", () -> {
      if (ezg.O()) {
         ezg.Q().f.w().a(false);
      }
   }, () -> {
      if (ezg.O()) {
         ezg.Q().h().a(false);
      }
   });
   protected static final fxx.k aO = new fxx.k("clouds_target", () -> {
      if (ezg.O()) {
         ezg.Q().f.x().a(false);
      }
   }, () -> {
      if (ezg.O()) {
         ezg.Q().h().a(false);
      }
   });
   protected static final fxx.k aP = new fxx.k("item_entity_target", () -> {
      if (ezg.O()) {
         ezg.Q().f.u().a(false);
      }
   }, () -> {
      if (ezg.O()) {
         ezg.Q().h().a(false);
      }
   });
   protected static final fxx.h aQ = new fxx.h(OptionalDouble.of(1.0));
   protected static final fxx.b aR = new fxx.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fxx.b aS = new fxx.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fxx(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * ezg.Q().m.ak().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fxx {
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

   protected static class b extends fxx {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fxx.a {
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

   protected static class d extends fxx {
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

   protected static class e extends fxx {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ajh> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fxx {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fxx.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ezg.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               ezg.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fxx {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ezg.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends fxx.e {
      private final Optional<ajh> aT;

      i(ImmutableList<Triple<ajh, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ajh, Boolean, Boolean> $$2 = (Triple<ajh, Boolean, Boolean>)var2.next();
               gja $$3 = ezg.Q().aa();
               $$3.b((ajh)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ajh)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ajh> c() {
         return this.aT;
      }

      public static fxx.i.a d() {
         return new fxx.i.a();
      }

      public static final class a {
         private final Builder<Triple<ajh, Boolean, Boolean>> a = new Builder();

         public fxx.i.a a(ajh $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fxx.i a() {
            return new fxx.i(this.a.build());
         }
      }
   }

   protected static final class j extends fxx.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fxx {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fxx.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ezg.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               ezg.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fxx {
      private final Optional<Supplier<fye>> aT;

      public m(Supplier<fye> $$0) {
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

   protected static class n extends fxx.e {
      private final Optional<ajh> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ajh $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gja $$3 = ezg.Q().aa();
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
      protected Optional<ajh> c() {
         return this.aT;
      }
   }

   protected static class o extends fxx {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fxx {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fxx {
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
