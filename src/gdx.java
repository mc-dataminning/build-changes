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

public abstract class gdx {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdx.p c = new gdx.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdx.p d = new gdx.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdx.p e = new gdx.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdx.p f = new gdx.p(
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
   protected static final gdx.p g = new gdx.p(
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
   protected static final gdx.p h = new gdx.p(
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
   protected static final gdx.m i = new gdx.m();
   protected static final gdx.m j = new gdx.m(gdj::u);
   protected static final gdx.m k = new gdx.m(gdj::o);
   protected static final gdx.m l = new gdx.m(gdj::q);
   protected static final gdx.m m = new gdx.m(gdj::r);
   protected static final gdx.m n = new gdx.m(gdj::v);
   protected static final gdx.m o = new gdx.m(gdj::p);
   protected static final gdx.m p = new gdx.m(gdj::w);
   protected static final gdx.m q = new gdx.m(gdj::x);
   protected static final gdx.m r = new gdx.m(gdj::y);
   protected static final gdx.m s = new gdx.m(gdj::z);
   protected static final gdx.m t = new gdx.m(gdj::A);
   protected static final gdx.m u = new gdx.m(gdj::B);
   protected static final gdx.m v = new gdx.m(gdj::C);
   protected static final gdx.m w = new gdx.m(gdj::D);
   protected static final gdx.m x = new gdx.m(gdj::E);
   protected static final gdx.m y = new gdx.m(gdj::F);
   protected static final gdx.m z = new gdx.m(gdj::G);
   protected static final gdx.m A = new gdx.m(gdj::H);
   protected static final gdx.m B = new gdx.m(gdj::I);
   protected static final gdx.m C = new gdx.m(gdj::J);
   protected static final gdx.m D = new gdx.m(gdj::K);
   protected static final gdx.m E = new gdx.m(gdj::L);
   protected static final gdx.m F = new gdx.m(gdj::M);
   protected static final gdx.m G = new gdx.m(gdj::N);
   protected static final gdx.m H = new gdx.m(gdj::O);
   protected static final gdx.m I = new gdx.m(gdj::P);
   protected static final gdx.m J = new gdx.m(gdj::Q);
   protected static final gdx.m K = new gdx.m(gdj::R);
   protected static final gdx.m L = new gdx.m(gdj::T);
   protected static final gdx.m M = new gdx.m(gdj::U);
   protected static final gdx.m N = new gdx.m(gdj::V);
   protected static final gdx.m O = new gdx.m(gdj::W);
   protected static final gdx.m P = new gdx.m(gdj::X);
   protected static final gdx.m Q = new gdx.m(gdj::Y);
   protected static final gdx.m R = new gdx.m(gdj::Z);
   protected static final gdx.m S = new gdx.m(gdj::aa);
   protected static final gdx.m T = new gdx.m(gdj::ab);
   protected static final gdx.m U = new gdx.m(gdj::ac);
   protected static final gdx.m V = new gdx.m(gdj::ap);
   protected static final gdx.m W = new gdx.m(gdj::ad);
   protected static final gdx.m X = new gdx.m(gdj::ae);
   protected static final gdx.m Y = new gdx.m(gdj::af);
   protected static final gdx.m Z = new gdx.m(gdj::ag);
   protected static final gdx.m aa = new gdx.m(gdj::ah);
   protected static final gdx.m ab = new gdx.m(gdj::ai);
   protected static final gdx.m ac = new gdx.m(gdj::aj);
   protected static final gdx.m ad = new gdx.m(gdj::ak);
   protected static final gdx.m ae = new gdx.m(gdj::al);
   protected static final gdx.m af = new gdx.m(gdj::am);
   protected static final gdx.m ag = new gdx.m(gdj::an);
   protected static final gdx.m ah = new gdx.m(gdj::ao);
   protected static final gdx.m ai = new gdx.m(gdj::aq);
   protected static final gdx.m aj = new gdx.m(gdj::ar);
   protected static final gdx.m ak = new gdx.m(gdj::as);
   protected static final gdx.m al = new gdx.m(gdj::at);
   protected static final gdx.m am = new gdx.m(gdj::S);
   protected static final gdx.n an = new gdx.n(gpa.e, false, true);
   protected static final gdx.n ao = new gdx.n(gpa.e, false, false);
   protected static final gdx.e ap = new gdx.e();
   protected static final gdx.o aq = new gdx.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdx.o ar = new gdx.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdx.o as = new gdx.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdx.g at = new gdx.g(true);
   protected static final gdx.g au = new gdx.g(false);
   protected static final gdx.l av = new gdx.l(true);
   protected static final gdx.l aw = new gdx.l(false);
   protected static final gdx.c ax = new gdx.c(true);
   protected static final gdx.c ay = new gdx.c(false);
   protected static final gdx.d az = new gdx.d("always", 519);
   protected static final gdx.d aA = new gdx.d("==", 514);
   protected static final gdx.d aB = new gdx.d("<=", 515);
   protected static final gdx.d aC = new gdx.d(">", 516);
   protected static final gdx.q aD = new gdx.q(true, true);
   protected static final gdx.q aE = new gdx.q(true, false);
   protected static final gdx.q aF = new gdx.q(false, true);
   protected static final gdx.f aG = new gdx.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdx.f aH = new gdx.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdx.f aI = new gdx.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdx.k aJ = new gdx.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdx.k aK = new gdx.k("outline_target", () -> ffh.Q().f.s().a(false), () -> ffh.Q().h().a(false));
   protected static final gdx.k aL = new gdx.k("translucent_target", () -> {
      if (ffh.O()) {
         ffh.Q().f.t().a(false);
      }
   }, () -> {
      if (ffh.O()) {
         ffh.Q().h().a(false);
      }
   });
   protected static final gdx.k aM = new gdx.k("particles_target", () -> {
      if (ffh.O()) {
         ffh.Q().f.v().a(false);
      }
   }, () -> {
      if (ffh.O()) {
         ffh.Q().h().a(false);
      }
   });
   protected static final gdx.k aN = new gdx.k("weather_target", () -> {
      if (ffh.O()) {
         ffh.Q().f.w().a(false);
      }
   }, () -> {
      if (ffh.O()) {
         ffh.Q().h().a(false);
      }
   });
   protected static final gdx.k aO = new gdx.k("clouds_target", () -> {
      if (ffh.O()) {
         ffh.Q().f.x().a(false);
      }
   }, () -> {
      if (ffh.O()) {
         ffh.Q().h().a(false);
      }
   });
   protected static final gdx.k aP = new gdx.k("item_entity_target", () -> {
      if (ffh.O()) {
         ffh.Q().f.u().a(false);
      }
   }, () -> {
      if (ffh.O()) {
         ffh.Q().h().a(false);
      }
   });
   protected static final gdx.h aQ = new gdx.h(OptionalDouble.of(1.0));
   protected static final gdx.b aR = new gdx.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdx.b aS = new gdx.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdx(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffh.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdx {
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

   protected static class b extends gdx {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdx.a {
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

   protected static class d extends gdx {
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

   protected static class e extends gdx {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alf> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gdx {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdx.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffh.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffh.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdx {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffh.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdx.e {
      private final Optional<alf> aT;

      i(ImmutableList<Triple<alf, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alf, Boolean, Boolean> $$2 = (Triple<alf, Boolean, Boolean>)var2.next();
               gpc $$3 = ffh.Q().aa();
               $$3.b((alf)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alf)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alf> c() {
         return this.aT;
      }

      public static gdx.i.a d() {
         return new gdx.i.a();
      }

      public static final class a {
         private final Builder<Triple<alf, Boolean, Boolean>> a = new Builder();

         public gdx.i.a a(alf $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdx.i a() {
            return new gdx.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdx.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdx {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdx.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffh.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffh.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdx {
      private final Optional<Supplier<gee>> aT;

      public m(Supplier<gee> $$0) {
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

   protected static class n extends gdx.e {
      private final Optional<alf> aT;
      private final boolean aU;
      private final boolean aV;

      public n(alf $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpc $$3 = ffh.Q().aa();
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
      protected Optional<alf> c() {
         return this.aT;
      }
   }

   protected static class o extends gdx {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdx {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdx {
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
