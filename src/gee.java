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

public abstract class gee {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gee.p c = new gee.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gee.p d = new gee.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gee.p e = new gee.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gee.p f = new gee.p(
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
   protected static final gee.p g = new gee.p(
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
   protected static final gee.p h = new gee.p(
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
   protected static final gee.m i = new gee.m();
   protected static final gee.m j = new gee.m(gdq::u);
   protected static final gee.m k = new gee.m(gdq::o);
   protected static final gee.m l = new gee.m(gdq::q);
   protected static final gee.m m = new gee.m(gdq::r);
   protected static final gee.m n = new gee.m(gdq::v);
   protected static final gee.m o = new gee.m(gdq::p);
   protected static final gee.m p = new gee.m(gdq::w);
   protected static final gee.m q = new gee.m(gdq::x);
   protected static final gee.m r = new gee.m(gdq::y);
   protected static final gee.m s = new gee.m(gdq::z);
   protected static final gee.m t = new gee.m(gdq::A);
   protected static final gee.m u = new gee.m(gdq::B);
   protected static final gee.m v = new gee.m(gdq::C);
   protected static final gee.m w = new gee.m(gdq::D);
   protected static final gee.m x = new gee.m(gdq::E);
   protected static final gee.m y = new gee.m(gdq::F);
   protected static final gee.m z = new gee.m(gdq::G);
   protected static final gee.m A = new gee.m(gdq::H);
   protected static final gee.m B = new gee.m(gdq::I);
   protected static final gee.m C = new gee.m(gdq::J);
   protected static final gee.m D = new gee.m(gdq::K);
   protected static final gee.m E = new gee.m(gdq::L);
   protected static final gee.m F = new gee.m(gdq::M);
   protected static final gee.m G = new gee.m(gdq::N);
   protected static final gee.m H = new gee.m(gdq::O);
   protected static final gee.m I = new gee.m(gdq::P);
   protected static final gee.m J = new gee.m(gdq::Q);
   protected static final gee.m K = new gee.m(gdq::R);
   protected static final gee.m L = new gee.m(gdq::T);
   protected static final gee.m M = new gee.m(gdq::U);
   protected static final gee.m N = new gee.m(gdq::V);
   protected static final gee.m O = new gee.m(gdq::W);
   protected static final gee.m P = new gee.m(gdq::X);
   protected static final gee.m Q = new gee.m(gdq::Y);
   protected static final gee.m R = new gee.m(gdq::Z);
   protected static final gee.m S = new gee.m(gdq::aa);
   protected static final gee.m T = new gee.m(gdq::ab);
   protected static final gee.m U = new gee.m(gdq::ac);
   protected static final gee.m V = new gee.m(gdq::ap);
   protected static final gee.m W = new gee.m(gdq::ad);
   protected static final gee.m X = new gee.m(gdq::ae);
   protected static final gee.m Y = new gee.m(gdq::af);
   protected static final gee.m Z = new gee.m(gdq::ag);
   protected static final gee.m aa = new gee.m(gdq::ah);
   protected static final gee.m ab = new gee.m(gdq::ai);
   protected static final gee.m ac = new gee.m(gdq::aj);
   protected static final gee.m ad = new gee.m(gdq::ak);
   protected static final gee.m ae = new gee.m(gdq::al);
   protected static final gee.m af = new gee.m(gdq::am);
   protected static final gee.m ag = new gee.m(gdq::an);
   protected static final gee.m ah = new gee.m(gdq::ao);
   protected static final gee.m ai = new gee.m(gdq::aq);
   protected static final gee.m aj = new gee.m(gdq::ar);
   protected static final gee.m ak = new gee.m(gdq::as);
   protected static final gee.m al = new gee.m(gdq::at);
   protected static final gee.m am = new gee.m(gdq::S);
   protected static final gee.n an = new gee.n(gph.e, false, true);
   protected static final gee.n ao = new gee.n(gph.e, false, false);
   protected static final gee.e ap = new gee.e();
   protected static final gee.o aq = new gee.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gee.o ar = new gee.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gee.o as = new gee.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gee.g at = new gee.g(true);
   protected static final gee.g au = new gee.g(false);
   protected static final gee.l av = new gee.l(true);
   protected static final gee.l aw = new gee.l(false);
   protected static final gee.c ax = new gee.c(true);
   protected static final gee.c ay = new gee.c(false);
   protected static final gee.d az = new gee.d("always", 519);
   protected static final gee.d aA = new gee.d("==", 514);
   protected static final gee.d aB = new gee.d("<=", 515);
   protected static final gee.d aC = new gee.d(">", 516);
   protected static final gee.q aD = new gee.q(true, true);
   protected static final gee.q aE = new gee.q(true, false);
   protected static final gee.q aF = new gee.q(false, true);
   protected static final gee.f aG = new gee.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gee.f aH = new gee.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gee.f aI = new gee.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gee.k aJ = new gee.k("main_target", () -> {
   }, () -> {
   });
   protected static final gee.k aK = new gee.k("outline_target", () -> ffn.Q().f.s().a(false), () -> ffn.Q().h().a(false));
   protected static final gee.k aL = new gee.k("translucent_target", () -> {
      if (ffn.O()) {
         ffn.Q().f.t().a(false);
      }
   }, () -> {
      if (ffn.O()) {
         ffn.Q().h().a(false);
      }
   });
   protected static final gee.k aM = new gee.k("particles_target", () -> {
      if (ffn.O()) {
         ffn.Q().f.v().a(false);
      }
   }, () -> {
      if (ffn.O()) {
         ffn.Q().h().a(false);
      }
   });
   protected static final gee.k aN = new gee.k("weather_target", () -> {
      if (ffn.O()) {
         ffn.Q().f.w().a(false);
      }
   }, () -> {
      if (ffn.O()) {
         ffn.Q().h().a(false);
      }
   });
   protected static final gee.k aO = new gee.k("clouds_target", () -> {
      if (ffn.O()) {
         ffn.Q().f.x().a(false);
      }
   }, () -> {
      if (ffn.O()) {
         ffn.Q().h().a(false);
      }
   });
   protected static final gee.k aP = new gee.k("item_entity_target", () -> {
      if (ffn.O()) {
         ffn.Q().f.u().a(false);
      }
   }, () -> {
      if (ffn.O()) {
         ffn.Q().h().a(false);
      }
   });
   protected static final gee.h aQ = new gee.h(OptionalDouble.of(1.0));
   protected static final gee.b aR = new gee.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gee.b aS = new gee.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gee(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffn.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gee {
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

   protected static class b extends gee {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gee.a {
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

   protected static class d extends gee {
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

   protected static class e extends gee {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akk> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gee {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gee.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffn.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffn.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gee {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffn.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gee.e {
      private final Optional<akk> aT;

      i(ImmutableList<Triple<akk, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akk, Boolean, Boolean> $$2 = (Triple<akk, Boolean, Boolean>)var2.next();
               gpj $$3 = ffn.Q().aa();
               $$3.b((akk)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akk)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akk> c() {
         return this.aT;
      }

      public static gee.i.a d() {
         return new gee.i.a();
      }

      public static final class a {
         private final Builder<Triple<akk, Boolean, Boolean>> a = new Builder();

         public gee.i.a a(akk $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gee.i a() {
            return new gee.i(this.a.build());
         }
      }
   }

   protected static final class j extends gee.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gee {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gee.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffn.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffn.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gee {
      private final Optional<Supplier<gel>> aT;

      public m(Supplier<gel> $$0) {
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

   protected static class n extends gee.e {
      private final Optional<akk> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akk $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpj $$3 = ffn.Q().aa();
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
      protected Optional<akk> c() {
         return this.aT;
      }
   }

   protected static class o extends gee {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gee {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gee {
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
