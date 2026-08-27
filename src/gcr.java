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

public abstract class gcr {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gcr.p c = new gcr.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gcr.p d = new gcr.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gcr.p e = new gcr.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gcr.p f = new gcr.p(
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
   protected static final gcr.p g = new gcr.p(
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
   protected static final gcr.p h = new gcr.p(
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
   protected static final gcr.m i = new gcr.m();
   protected static final gcr.m j = new gcr.m(gcd::v);
   protected static final gcr.m k = new gcr.m(gcd::p);
   protected static final gcr.m l = new gcr.m(gcd::r);
   protected static final gcr.m m = new gcr.m(gcd::s);
   protected static final gcr.m n = new gcr.m(gcd::w);
   protected static final gcr.m o = new gcr.m(gcd::q);
   protected static final gcr.m p = new gcr.m(gcd::x);
   protected static final gcr.m q = new gcr.m(gcd::y);
   protected static final gcr.m r = new gcr.m(gcd::z);
   protected static final gcr.m s = new gcr.m(gcd::A);
   protected static final gcr.m t = new gcr.m(gcd::B);
   protected static final gcr.m u = new gcr.m(gcd::C);
   protected static final gcr.m v = new gcr.m(gcd::D);
   protected static final gcr.m w = new gcr.m(gcd::E);
   protected static final gcr.m x = new gcr.m(gcd::F);
   protected static final gcr.m y = new gcr.m(gcd::G);
   protected static final gcr.m z = new gcr.m(gcd::H);
   protected static final gcr.m A = new gcr.m(gcd::I);
   protected static final gcr.m B = new gcr.m(gcd::J);
   protected static final gcr.m C = new gcr.m(gcd::K);
   protected static final gcr.m D = new gcr.m(gcd::L);
   protected static final gcr.m E = new gcr.m(gcd::M);
   protected static final gcr.m F = new gcr.m(gcd::N);
   protected static final gcr.m G = new gcr.m(gcd::O);
   protected static final gcr.m H = new gcr.m(gcd::P);
   protected static final gcr.m I = new gcr.m(gcd::Q);
   protected static final gcr.m J = new gcr.m(gcd::R);
   protected static final gcr.m K = new gcr.m(gcd::S);
   protected static final gcr.m L = new gcr.m(gcd::U);
   protected static final gcr.m M = new gcr.m(gcd::V);
   protected static final gcr.m N = new gcr.m(gcd::W);
   protected static final gcr.m O = new gcr.m(gcd::X);
   protected static final gcr.m P = new gcr.m(gcd::Y);
   protected static final gcr.m Q = new gcr.m(gcd::Z);
   protected static final gcr.m R = new gcr.m(gcd::aa);
   protected static final gcr.m S = new gcr.m(gcd::ab);
   protected static final gcr.m T = new gcr.m(gcd::ac);
   protected static final gcr.m U = new gcr.m(gcd::ad);
   protected static final gcr.m V = new gcr.m(gcd::aq);
   protected static final gcr.m W = new gcr.m(gcd::ae);
   protected static final gcr.m X = new gcr.m(gcd::af);
   protected static final gcr.m Y = new gcr.m(gcd::ag);
   protected static final gcr.m Z = new gcr.m(gcd::ah);
   protected static final gcr.m aa = new gcr.m(gcd::ai);
   protected static final gcr.m ab = new gcr.m(gcd::aj);
   protected static final gcr.m ac = new gcr.m(gcd::ak);
   protected static final gcr.m ad = new gcr.m(gcd::al);
   protected static final gcr.m ae = new gcr.m(gcd::am);
   protected static final gcr.m af = new gcr.m(gcd::an);
   protected static final gcr.m ag = new gcr.m(gcd::ao);
   protected static final gcr.m ah = new gcr.m(gcd::ap);
   protected static final gcr.m ai = new gcr.m(gcd::ar);
   protected static final gcr.m aj = new gcr.m(gcd::as);
   protected static final gcr.m ak = new gcr.m(gcd::at);
   protected static final gcr.m al = new gcr.m(gcd::au);
   protected static final gcr.m am = new gcr.m(gcd::T);
   protected static final gcr.n an = new gcr.n(gnu.e, false, true);
   protected static final gcr.n ao = new gcr.n(gnu.e, false, false);
   protected static final gcr.e ap = new gcr.e();
   protected static final gcr.o aq = new gcr.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gcr.o ar = new gcr.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gcr.o as = new gcr.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gcr.g at = new gcr.g(true);
   protected static final gcr.g au = new gcr.g(false);
   protected static final gcr.l av = new gcr.l(true);
   protected static final gcr.l aw = new gcr.l(false);
   protected static final gcr.c ax = new gcr.c(true);
   protected static final gcr.c ay = new gcr.c(false);
   protected static final gcr.d az = new gcr.d("always", 519);
   protected static final gcr.d aA = new gcr.d("==", 514);
   protected static final gcr.d aB = new gcr.d("<=", 515);
   protected static final gcr.d aC = new gcr.d(">", 516);
   protected static final gcr.q aD = new gcr.q(true, true);
   protected static final gcr.q aE = new gcr.q(true, false);
   protected static final gcr.q aF = new gcr.q(false, true);
   protected static final gcr.f aG = new gcr.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gcr.f aH = new gcr.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gcr.f aI = new gcr.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gcr.k aJ = new gcr.k("main_target", () -> {
   }, () -> {
   });
   protected static final gcr.k aK = new gcr.k("outline_target", () -> fdz.Q().f.s().a(false), () -> fdz.Q().h().a(false));
   protected static final gcr.k aL = new gcr.k("translucent_target", () -> {
      if (fdz.O()) {
         fdz.Q().f.t().a(false);
      }
   }, () -> {
      if (fdz.O()) {
         fdz.Q().h().a(false);
      }
   });
   protected static final gcr.k aM = new gcr.k("particles_target", () -> {
      if (fdz.O()) {
         fdz.Q().f.v().a(false);
      }
   }, () -> {
      if (fdz.O()) {
         fdz.Q().h().a(false);
      }
   });
   protected static final gcr.k aN = new gcr.k("weather_target", () -> {
      if (fdz.O()) {
         fdz.Q().f.w().a(false);
      }
   }, () -> {
      if (fdz.O()) {
         fdz.Q().h().a(false);
      }
   });
   protected static final gcr.k aO = new gcr.k("clouds_target", () -> {
      if (fdz.O()) {
         fdz.Q().f.x().a(false);
      }
   }, () -> {
      if (fdz.O()) {
         fdz.Q().h().a(false);
      }
   });
   protected static final gcr.k aP = new gcr.k("item_entity_target", () -> {
      if (fdz.O()) {
         fdz.Q().f.u().a(false);
      }
   }, () -> {
      if (fdz.O()) {
         fdz.Q().h().a(false);
      }
   });
   protected static final gcr.h aQ = new gcr.h(OptionalDouble.of(1.0));
   protected static final gcr.b aR = new gcr.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gcr.b aS = new gcr.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gcr(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * fdz.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gcr {
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

   protected static class b extends gcr {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gcr.a {
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

   protected static class d extends gcr {
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

   protected static class e extends gcr {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akm> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gcr {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gcr.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fdz.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               fdz.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gcr {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fdz.Q().aP().k() / 1920.0F * 2.5F));
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

   protected static class i extends gcr.e {
      private final Optional<akm> aT;

      i(ImmutableList<Triple<akm, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akm, Boolean, Boolean> $$2 = (Triple<akm, Boolean, Boolean>)var2.next();
               gnw $$3 = fdz.Q().aa();
               $$3.b((akm)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akm)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akm> c() {
         return this.aT;
      }

      public static gcr.i.a d() {
         return new gcr.i.a();
      }

      public static final class a {
         private final Builder<Triple<akm, Boolean, Boolean>> a = new Builder();

         public gcr.i.a a(akm $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gcr.i a() {
            return new gcr.i(this.a.build());
         }
      }
   }

   protected static final class j extends gcr.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gcr {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gcr.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fdz.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               fdz.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gcr {
      private final Optional<Supplier<gcy>> aT;

      public m(Supplier<gcy> $$0) {
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

   protected static class n extends gcr.e {
      private final Optional<akm> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akm $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gnw $$3 = fdz.Q().aa();
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
      protected Optional<akm> c() {
         return this.aT;
      }
   }

   protected static class o extends gcr {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gcr {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gcr {
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
