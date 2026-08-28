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

public abstract class gdq {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdq.p c = new gdq.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdq.p d = new gdq.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdq.p e = new gdq.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdq.p f = new gdq.p(
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
   protected static final gdq.p g = new gdq.p(
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
   protected static final gdq.p h = new gdq.p(
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
   protected static final gdq.m i = new gdq.m();
   protected static final gdq.m j = new gdq.m(gdc::v);
   protected static final gdq.m k = new gdq.m(gdc::p);
   protected static final gdq.m l = new gdq.m(gdc::r);
   protected static final gdq.m m = new gdq.m(gdc::s);
   protected static final gdq.m n = new gdq.m(gdc::w);
   protected static final gdq.m o = new gdq.m(gdc::q);
   protected static final gdq.m p = new gdq.m(gdc::x);
   protected static final gdq.m q = new gdq.m(gdc::y);
   protected static final gdq.m r = new gdq.m(gdc::z);
   protected static final gdq.m s = new gdq.m(gdc::A);
   protected static final gdq.m t = new gdq.m(gdc::B);
   protected static final gdq.m u = new gdq.m(gdc::C);
   protected static final gdq.m v = new gdq.m(gdc::D);
   protected static final gdq.m w = new gdq.m(gdc::E);
   protected static final gdq.m x = new gdq.m(gdc::F);
   protected static final gdq.m y = new gdq.m(gdc::G);
   protected static final gdq.m z = new gdq.m(gdc::H);
   protected static final gdq.m A = new gdq.m(gdc::I);
   protected static final gdq.m B = new gdq.m(gdc::J);
   protected static final gdq.m C = new gdq.m(gdc::K);
   protected static final gdq.m D = new gdq.m(gdc::L);
   protected static final gdq.m E = new gdq.m(gdc::M);
   protected static final gdq.m F = new gdq.m(gdc::N);
   protected static final gdq.m G = new gdq.m(gdc::O);
   protected static final gdq.m H = new gdq.m(gdc::P);
   protected static final gdq.m I = new gdq.m(gdc::Q);
   protected static final gdq.m J = new gdq.m(gdc::R);
   protected static final gdq.m K = new gdq.m(gdc::S);
   protected static final gdq.m L = new gdq.m(gdc::U);
   protected static final gdq.m M = new gdq.m(gdc::V);
   protected static final gdq.m N = new gdq.m(gdc::W);
   protected static final gdq.m O = new gdq.m(gdc::X);
   protected static final gdq.m P = new gdq.m(gdc::Y);
   protected static final gdq.m Q = new gdq.m(gdc::Z);
   protected static final gdq.m R = new gdq.m(gdc::aa);
   protected static final gdq.m S = new gdq.m(gdc::ab);
   protected static final gdq.m T = new gdq.m(gdc::ac);
   protected static final gdq.m U = new gdq.m(gdc::ad);
   protected static final gdq.m V = new gdq.m(gdc::aq);
   protected static final gdq.m W = new gdq.m(gdc::ae);
   protected static final gdq.m X = new gdq.m(gdc::af);
   protected static final gdq.m Y = new gdq.m(gdc::ag);
   protected static final gdq.m Z = new gdq.m(gdc::ah);
   protected static final gdq.m aa = new gdq.m(gdc::ai);
   protected static final gdq.m ab = new gdq.m(gdc::aj);
   protected static final gdq.m ac = new gdq.m(gdc::ak);
   protected static final gdq.m ad = new gdq.m(gdc::al);
   protected static final gdq.m ae = new gdq.m(gdc::am);
   protected static final gdq.m af = new gdq.m(gdc::an);
   protected static final gdq.m ag = new gdq.m(gdc::ao);
   protected static final gdq.m ah = new gdq.m(gdc::ap);
   protected static final gdq.m ai = new gdq.m(gdc::ar);
   protected static final gdq.m aj = new gdq.m(gdc::as);
   protected static final gdq.m ak = new gdq.m(gdc::at);
   protected static final gdq.m al = new gdq.m(gdc::au);
   protected static final gdq.m am = new gdq.m(gdc::T);
   protected static final gdq.n an = new gdq.n(got.e, false, true);
   protected static final gdq.n ao = new gdq.n(got.e, false, false);
   protected static final gdq.e ap = new gdq.e();
   protected static final gdq.o aq = new gdq.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdq.o ar = new gdq.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdq.o as = new gdq.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdq.g at = new gdq.g(true);
   protected static final gdq.g au = new gdq.g(false);
   protected static final gdq.l av = new gdq.l(true);
   protected static final gdq.l aw = new gdq.l(false);
   protected static final gdq.c ax = new gdq.c(true);
   protected static final gdq.c ay = new gdq.c(false);
   protected static final gdq.d az = new gdq.d("always", 519);
   protected static final gdq.d aA = new gdq.d("==", 514);
   protected static final gdq.d aB = new gdq.d("<=", 515);
   protected static final gdq.d aC = new gdq.d(">", 516);
   protected static final gdq.q aD = new gdq.q(true, true);
   protected static final gdq.q aE = new gdq.q(true, false);
   protected static final gdq.q aF = new gdq.q(false, true);
   protected static final gdq.f aG = new gdq.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdq.f aH = new gdq.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdq.f aI = new gdq.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdq.k aJ = new gdq.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdq.k aK = new gdq.k("outline_target", () -> ffa.Q().f.s().a(false), () -> ffa.Q().h().a(false));
   protected static final gdq.k aL = new gdq.k("translucent_target", () -> {
      if (ffa.O()) {
         ffa.Q().f.t().a(false);
      }
   }, () -> {
      if (ffa.O()) {
         ffa.Q().h().a(false);
      }
   });
   protected static final gdq.k aM = new gdq.k("particles_target", () -> {
      if (ffa.O()) {
         ffa.Q().f.v().a(false);
      }
   }, () -> {
      if (ffa.O()) {
         ffa.Q().h().a(false);
      }
   });
   protected static final gdq.k aN = new gdq.k("weather_target", () -> {
      if (ffa.O()) {
         ffa.Q().f.w().a(false);
      }
   }, () -> {
      if (ffa.O()) {
         ffa.Q().h().a(false);
      }
   });
   protected static final gdq.k aO = new gdq.k("clouds_target", () -> {
      if (ffa.O()) {
         ffa.Q().f.x().a(false);
      }
   }, () -> {
      if (ffa.O()) {
         ffa.Q().h().a(false);
      }
   });
   protected static final gdq.k aP = new gdq.k("item_entity_target", () -> {
      if (ffa.O()) {
         ffa.Q().f.u().a(false);
      }
   }, () -> {
      if (ffa.O()) {
         ffa.Q().h().a(false);
      }
   });
   protected static final gdq.h aQ = new gdq.h(OptionalDouble.of(1.0));
   protected static final gdq.b aR = new gdq.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdq.b aS = new gdq.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdq(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffa.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdq {
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

   protected static class b extends gdq {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdq.a {
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

   protected static class d extends gdq {
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

   protected static class e extends gdq {
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

   protected static class f extends gdq {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdq.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffa.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               ffa.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdq {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffa.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdq.e {
      private final Optional<alb> aT;

      i(ImmutableList<Triple<alb, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alb, Boolean, Boolean> $$2 = (Triple<alb, Boolean, Boolean>)var2.next();
               gov $$3 = ffa.Q().aa();
               $$3.b((alb)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alb)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alb> c() {
         return this.aT;
      }

      public static gdq.i.a d() {
         return new gdq.i.a();
      }

      public static final class a {
         private final Builder<Triple<alb, Boolean, Boolean>> a = new Builder();

         public gdq.i.a a(alb $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdq.i a() {
            return new gdq.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdq.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdq {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdq.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffa.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               ffa.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdq {
      private final Optional<Supplier<gdx>> aT;

      public m(Supplier<gdx> $$0) {
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

   protected static class n extends gdq.e {
      private final Optional<alb> aT;
      private final boolean aU;
      private final boolean aV;

      public n(alb $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gov $$3 = ffa.Q().aa();
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
      protected Optional<alb> c() {
         return this.aT;
      }
   }

   protected static class o extends gdq {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdq {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdq {
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
