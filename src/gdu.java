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

public abstract class gdu {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdu.p c = new gdu.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdu.p d = new gdu.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdu.p e = new gdu.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdu.p f = new gdu.p(
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
   protected static final gdu.p g = new gdu.p(
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
   protected static final gdu.p h = new gdu.p(
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
   protected static final gdu.m i = new gdu.m();
   protected static final gdu.m j = new gdu.m(gdg::u);
   protected static final gdu.m k = new gdu.m(gdg::o);
   protected static final gdu.m l = new gdu.m(gdg::q);
   protected static final gdu.m m = new gdu.m(gdg::r);
   protected static final gdu.m n = new gdu.m(gdg::v);
   protected static final gdu.m o = new gdu.m(gdg::p);
   protected static final gdu.m p = new gdu.m(gdg::w);
   protected static final gdu.m q = new gdu.m(gdg::x);
   protected static final gdu.m r = new gdu.m(gdg::y);
   protected static final gdu.m s = new gdu.m(gdg::z);
   protected static final gdu.m t = new gdu.m(gdg::A);
   protected static final gdu.m u = new gdu.m(gdg::B);
   protected static final gdu.m v = new gdu.m(gdg::C);
   protected static final gdu.m w = new gdu.m(gdg::D);
   protected static final gdu.m x = new gdu.m(gdg::E);
   protected static final gdu.m y = new gdu.m(gdg::F);
   protected static final gdu.m z = new gdu.m(gdg::G);
   protected static final gdu.m A = new gdu.m(gdg::H);
   protected static final gdu.m B = new gdu.m(gdg::I);
   protected static final gdu.m C = new gdu.m(gdg::J);
   protected static final gdu.m D = new gdu.m(gdg::K);
   protected static final gdu.m E = new gdu.m(gdg::L);
   protected static final gdu.m F = new gdu.m(gdg::M);
   protected static final gdu.m G = new gdu.m(gdg::N);
   protected static final gdu.m H = new gdu.m(gdg::O);
   protected static final gdu.m I = new gdu.m(gdg::P);
   protected static final gdu.m J = new gdu.m(gdg::Q);
   protected static final gdu.m K = new gdu.m(gdg::R);
   protected static final gdu.m L = new gdu.m(gdg::T);
   protected static final gdu.m M = new gdu.m(gdg::U);
   protected static final gdu.m N = new gdu.m(gdg::V);
   protected static final gdu.m O = new gdu.m(gdg::W);
   protected static final gdu.m P = new gdu.m(gdg::X);
   protected static final gdu.m Q = new gdu.m(gdg::Y);
   protected static final gdu.m R = new gdu.m(gdg::Z);
   protected static final gdu.m S = new gdu.m(gdg::aa);
   protected static final gdu.m T = new gdu.m(gdg::ab);
   protected static final gdu.m U = new gdu.m(gdg::ac);
   protected static final gdu.m V = new gdu.m(gdg::ap);
   protected static final gdu.m W = new gdu.m(gdg::ad);
   protected static final gdu.m X = new gdu.m(gdg::ae);
   protected static final gdu.m Y = new gdu.m(gdg::af);
   protected static final gdu.m Z = new gdu.m(gdg::ag);
   protected static final gdu.m aa = new gdu.m(gdg::ah);
   protected static final gdu.m ab = new gdu.m(gdg::ai);
   protected static final gdu.m ac = new gdu.m(gdg::aj);
   protected static final gdu.m ad = new gdu.m(gdg::ak);
   protected static final gdu.m ae = new gdu.m(gdg::al);
   protected static final gdu.m af = new gdu.m(gdg::am);
   protected static final gdu.m ag = new gdu.m(gdg::an);
   protected static final gdu.m ah = new gdu.m(gdg::ao);
   protected static final gdu.m ai = new gdu.m(gdg::aq);
   protected static final gdu.m aj = new gdu.m(gdg::ar);
   protected static final gdu.m ak = new gdu.m(gdg::as);
   protected static final gdu.m al = new gdu.m(gdg::at);
   protected static final gdu.m am = new gdu.m(gdg::S);
   protected static final gdu.n an = new gdu.n(gox.e, false, true);
   protected static final gdu.n ao = new gdu.n(gox.e, false, false);
   protected static final gdu.e ap = new gdu.e();
   protected static final gdu.o aq = new gdu.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdu.o ar = new gdu.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdu.o as = new gdu.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdu.g at = new gdu.g(true);
   protected static final gdu.g au = new gdu.g(false);
   protected static final gdu.l av = new gdu.l(true);
   protected static final gdu.l aw = new gdu.l(false);
   protected static final gdu.c ax = new gdu.c(true);
   protected static final gdu.c ay = new gdu.c(false);
   protected static final gdu.d az = new gdu.d("always", 519);
   protected static final gdu.d aA = new gdu.d("==", 514);
   protected static final gdu.d aB = new gdu.d("<=", 515);
   protected static final gdu.d aC = new gdu.d(">", 516);
   protected static final gdu.q aD = new gdu.q(true, true);
   protected static final gdu.q aE = new gdu.q(true, false);
   protected static final gdu.q aF = new gdu.q(false, true);
   protected static final gdu.f aG = new gdu.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdu.f aH = new gdu.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdu.f aI = new gdu.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdu.k aJ = new gdu.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdu.k aK = new gdu.k("outline_target", () -> ffe.Q().f.s().a(false), () -> ffe.Q().h().a(false));
   protected static final gdu.k aL = new gdu.k("translucent_target", () -> {
      if (ffe.O()) {
         ffe.Q().f.t().a(false);
      }
   }, () -> {
      if (ffe.O()) {
         ffe.Q().h().a(false);
      }
   });
   protected static final gdu.k aM = new gdu.k("particles_target", () -> {
      if (ffe.O()) {
         ffe.Q().f.v().a(false);
      }
   }, () -> {
      if (ffe.O()) {
         ffe.Q().h().a(false);
      }
   });
   protected static final gdu.k aN = new gdu.k("weather_target", () -> {
      if (ffe.O()) {
         ffe.Q().f.w().a(false);
      }
   }, () -> {
      if (ffe.O()) {
         ffe.Q().h().a(false);
      }
   });
   protected static final gdu.k aO = new gdu.k("clouds_target", () -> {
      if (ffe.O()) {
         ffe.Q().f.x().a(false);
      }
   }, () -> {
      if (ffe.O()) {
         ffe.Q().h().a(false);
      }
   });
   protected static final gdu.k aP = new gdu.k("item_entity_target", () -> {
      if (ffe.O()) {
         ffe.Q().f.u().a(false);
      }
   }, () -> {
      if (ffe.O()) {
         ffe.Q().h().a(false);
      }
   });
   protected static final gdu.h aQ = new gdu.h(OptionalDouble.of(1.0));
   protected static final gdu.b aR = new gdu.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdu.b aS = new gdu.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdu(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffe.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdu {
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

   protected static class b extends gdu {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdu.a {
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

   protected static class d extends gdu {
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

   protected static class e extends gdu {
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

   protected static class f extends gdu {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdu.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffe.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffe.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdu {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffe.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdu.e {
      private final Optional<ale> aT;

      i(ImmutableList<Triple<ale, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ale, Boolean, Boolean> $$2 = (Triple<ale, Boolean, Boolean>)var2.next();
               goz $$3 = ffe.Q().aa();
               $$3.b((ale)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ale)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ale> c() {
         return this.aT;
      }

      public static gdu.i.a d() {
         return new gdu.i.a();
      }

      public static final class a {
         private final Builder<Triple<ale, Boolean, Boolean>> a = new Builder();

         public gdu.i.a a(ale $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdu.i a() {
            return new gdu.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdu.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdu {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdu.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffe.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffe.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdu {
      private final Optional<Supplier<geb>> aT;

      public m(Supplier<geb> $$0) {
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

   protected static class n extends gdu.e {
      private final Optional<ale> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ale $$0, boolean $$1, boolean $$2) {
         super(() -> {
            goz $$3 = ffe.Q().aa();
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
      protected Optional<ale> c() {
         return this.aT;
      }
   }

   protected static class o extends gdu {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdu {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdu {
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
