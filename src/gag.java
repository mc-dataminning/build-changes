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

public abstract class gag {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gag.p c = new gag.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gag.p d = new gag.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gag.p e = new gag.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gag.p f = new gag.p(
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
   protected static final gag.p g = new gag.p(
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
   protected static final gag.p h = new gag.p(
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
   protected static final gag.m i = new gag.m();
   protected static final gag.m j = new gag.m(fzs::w);
   protected static final gag.m k = new gag.m(fzs::q);
   protected static final gag.m l = new gag.m(fzs::s);
   protected static final gag.m m = new gag.m(fzs::t);
   protected static final gag.m n = new gag.m(fzs::x);
   protected static final gag.m o = new gag.m(fzs::r);
   protected static final gag.m p = new gag.m(fzs::y);
   protected static final gag.m q = new gag.m(fzs::z);
   protected static final gag.m r = new gag.m(fzs::A);
   protected static final gag.m s = new gag.m(fzs::B);
   protected static final gag.m t = new gag.m(fzs::C);
   protected static final gag.m u = new gag.m(fzs::D);
   protected static final gag.m v = new gag.m(fzs::E);
   protected static final gag.m w = new gag.m(fzs::F);
   protected static final gag.m x = new gag.m(fzs::G);
   protected static final gag.m y = new gag.m(fzs::H);
   protected static final gag.m z = new gag.m(fzs::I);
   protected static final gag.m A = new gag.m(fzs::J);
   protected static final gag.m B = new gag.m(fzs::K);
   protected static final gag.m C = new gag.m(fzs::L);
   protected static final gag.m D = new gag.m(fzs::M);
   protected static final gag.m E = new gag.m(fzs::N);
   protected static final gag.m F = new gag.m(fzs::O);
   protected static final gag.m G = new gag.m(fzs::P);
   protected static final gag.m H = new gag.m(fzs::Q);
   protected static final gag.m I = new gag.m(fzs::R);
   protected static final gag.m J = new gag.m(fzs::S);
   protected static final gag.m K = new gag.m(fzs::T);
   protected static final gag.m L = new gag.m(fzs::V);
   protected static final gag.m M = new gag.m(fzs::W);
   protected static final gag.m N = new gag.m(fzs::X);
   protected static final gag.m O = new gag.m(fzs::Y);
   protected static final gag.m P = new gag.m(fzs::Z);
   protected static final gag.m Q = new gag.m(fzs::aa);
   protected static final gag.m R = new gag.m(fzs::ab);
   protected static final gag.m S = new gag.m(fzs::ac);
   protected static final gag.m T = new gag.m(fzs::ad);
   protected static final gag.m U = new gag.m(fzs::ae);
   protected static final gag.m V = new gag.m(fzs::ar);
   protected static final gag.m W = new gag.m(fzs::af);
   protected static final gag.m X = new gag.m(fzs::ag);
   protected static final gag.m Y = new gag.m(fzs::ah);
   protected static final gag.m Z = new gag.m(fzs::ai);
   protected static final gag.m aa = new gag.m(fzs::aj);
   protected static final gag.m ab = new gag.m(fzs::ak);
   protected static final gag.m ac = new gag.m(fzs::al);
   protected static final gag.m ad = new gag.m(fzs::am);
   protected static final gag.m ae = new gag.m(fzs::an);
   protected static final gag.m af = new gag.m(fzs::ao);
   protected static final gag.m ag = new gag.m(fzs::ap);
   protected static final gag.m ah = new gag.m(fzs::aq);
   protected static final gag.m ai = new gag.m(fzs::as);
   protected static final gag.m aj = new gag.m(fzs::at);
   protected static final gag.m ak = new gag.m(fzs::au);
   protected static final gag.m al = new gag.m(fzs::av);
   protected static final gag.m am = new gag.m(fzs::U);
   protected static final gag.n an = new gag.n(gli.e, false, true);
   protected static final gag.n ao = new gag.n(gli.e, false, false);
   protected static final gag.e ap = new gag.e();
   protected static final gag.o aq = new gag.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gag.o ar = new gag.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gag.o as = new gag.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gag.g at = new gag.g(true);
   protected static final gag.g au = new gag.g(false);
   protected static final gag.l av = new gag.l(true);
   protected static final gag.l aw = new gag.l(false);
   protected static final gag.c ax = new gag.c(true);
   protected static final gag.c ay = new gag.c(false);
   protected static final gag.d az = new gag.d("always", 519);
   protected static final gag.d aA = new gag.d("==", 514);
   protected static final gag.d aB = new gag.d("<=", 515);
   protected static final gag.d aC = new gag.d(">", 516);
   protected static final gag.q aD = new gag.q(true, true);
   protected static final gag.q aE = new gag.q(true, false);
   protected static final gag.q aF = new gag.q(false, true);
   protected static final gag.f aG = new gag.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gag.f aH = new gag.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gag.f aI = new gag.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gag.k aJ = new gag.k("main_target", () -> {
   }, () -> {
   });
   protected static final gag.k aK = new gag.k("outline_target", () -> fbp.Q().f.s().a(false), () -> fbp.Q().h().a(false));
   protected static final gag.k aL = new gag.k("translucent_target", () -> {
      if (fbp.O()) {
         fbp.Q().f.t().a(false);
      }
   }, () -> {
      if (fbp.O()) {
         fbp.Q().h().a(false);
      }
   });
   protected static final gag.k aM = new gag.k("particles_target", () -> {
      if (fbp.O()) {
         fbp.Q().f.v().a(false);
      }
   }, () -> {
      if (fbp.O()) {
         fbp.Q().h().a(false);
      }
   });
   protected static final gag.k aN = new gag.k("weather_target", () -> {
      if (fbp.O()) {
         fbp.Q().f.w().a(false);
      }
   }, () -> {
      if (fbp.O()) {
         fbp.Q().h().a(false);
      }
   });
   protected static final gag.k aO = new gag.k("clouds_target", () -> {
      if (fbp.O()) {
         fbp.Q().f.x().a(false);
      }
   }, () -> {
      if (fbp.O()) {
         fbp.Q().h().a(false);
      }
   });
   protected static final gag.k aP = new gag.k("item_entity_target", () -> {
      if (fbp.O()) {
         fbp.Q().f.u().a(false);
      }
   }, () -> {
      if (fbp.O()) {
         fbp.Q().h().a(false);
      }
   });
   protected static final gag.h aQ = new gag.h(OptionalDouble.of(1.0));
   protected static final gag.b aR = new gag.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gag.b aS = new gag.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gag(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * fbp.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gag {
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

   protected static class b extends gag {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gag.a {
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

   protected static class d extends gag {
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

   protected static class e extends gag {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ajt> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gag {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gag.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fbp.Q().j.o().c();
            }
         }, () -> {
            if ($$0) {
               fbp.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gag {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fbp.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gag.e {
      private final Optional<ajt> aT;

      i(ImmutableList<Triple<ajt, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ajt, Boolean, Boolean> $$2 = (Triple<ajt, Boolean, Boolean>)var2.next();
               glk $$3 = fbp.Q().aa();
               $$3.b((ajt)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ajt)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ajt> c() {
         return this.aT;
      }

      public static gag.i.a d() {
         return new gag.i.a();
      }

      public static final class a {
         private final Builder<Triple<ajt, Boolean, Boolean>> a = new Builder();

         public gag.i.a a(ajt $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gag.i a() {
            return new gag.i(this.a.build());
         }
      }
   }

   protected static final class j extends gag.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gag {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gag.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fbp.Q().j.p().a();
            }
         }, () -> {
            if ($$0) {
               fbp.Q().j.p().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gag {
      private final Optional<Supplier<gan>> aT;

      public m(Supplier<gan> $$0) {
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

   protected static class n extends gag.e {
      private final Optional<ajt> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ajt $$0, boolean $$1, boolean $$2) {
         super(() -> {
            glk $$3 = fbp.Q().aa();
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
      protected Optional<ajt> c() {
         return this.aT;
      }
   }

   protected static class o extends gag {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gag {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gag {
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
