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

public abstract class gbv {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gbv.p c = new gbv.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gbv.p d = new gbv.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gbv.p e = new gbv.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gbv.p f = new gbv.p(
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
   protected static final gbv.p g = new gbv.p(
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
   protected static final gbv.p h = new gbv.p(
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
   protected static final gbv.m i = new gbv.m();
   protected static final gbv.m j = new gbv.m(gbh::v);
   protected static final gbv.m k = new gbv.m(gbh::p);
   protected static final gbv.m l = new gbv.m(gbh::r);
   protected static final gbv.m m = new gbv.m(gbh::s);
   protected static final gbv.m n = new gbv.m(gbh::w);
   protected static final gbv.m o = new gbv.m(gbh::q);
   protected static final gbv.m p = new gbv.m(gbh::x);
   protected static final gbv.m q = new gbv.m(gbh::y);
   protected static final gbv.m r = new gbv.m(gbh::z);
   protected static final gbv.m s = new gbv.m(gbh::A);
   protected static final gbv.m t = new gbv.m(gbh::B);
   protected static final gbv.m u = new gbv.m(gbh::C);
   protected static final gbv.m v = new gbv.m(gbh::D);
   protected static final gbv.m w = new gbv.m(gbh::E);
   protected static final gbv.m x = new gbv.m(gbh::F);
   protected static final gbv.m y = new gbv.m(gbh::G);
   protected static final gbv.m z = new gbv.m(gbh::H);
   protected static final gbv.m A = new gbv.m(gbh::I);
   protected static final gbv.m B = new gbv.m(gbh::J);
   protected static final gbv.m C = new gbv.m(gbh::K);
   protected static final gbv.m D = new gbv.m(gbh::L);
   protected static final gbv.m E = new gbv.m(gbh::M);
   protected static final gbv.m F = new gbv.m(gbh::N);
   protected static final gbv.m G = new gbv.m(gbh::O);
   protected static final gbv.m H = new gbv.m(gbh::P);
   protected static final gbv.m I = new gbv.m(gbh::Q);
   protected static final gbv.m J = new gbv.m(gbh::R);
   protected static final gbv.m K = new gbv.m(gbh::S);
   protected static final gbv.m L = new gbv.m(gbh::U);
   protected static final gbv.m M = new gbv.m(gbh::V);
   protected static final gbv.m N = new gbv.m(gbh::W);
   protected static final gbv.m O = new gbv.m(gbh::X);
   protected static final gbv.m P = new gbv.m(gbh::Y);
   protected static final gbv.m Q = new gbv.m(gbh::Z);
   protected static final gbv.m R = new gbv.m(gbh::aa);
   protected static final gbv.m S = new gbv.m(gbh::ab);
   protected static final gbv.m T = new gbv.m(gbh::ac);
   protected static final gbv.m U = new gbv.m(gbh::ad);
   protected static final gbv.m V = new gbv.m(gbh::aq);
   protected static final gbv.m W = new gbv.m(gbh::ae);
   protected static final gbv.m X = new gbv.m(gbh::af);
   protected static final gbv.m Y = new gbv.m(gbh::ag);
   protected static final gbv.m Z = new gbv.m(gbh::ah);
   protected static final gbv.m aa = new gbv.m(gbh::ai);
   protected static final gbv.m ab = new gbv.m(gbh::aj);
   protected static final gbv.m ac = new gbv.m(gbh::ak);
   protected static final gbv.m ad = new gbv.m(gbh::al);
   protected static final gbv.m ae = new gbv.m(gbh::am);
   protected static final gbv.m af = new gbv.m(gbh::an);
   protected static final gbv.m ag = new gbv.m(gbh::ao);
   protected static final gbv.m ah = new gbv.m(gbh::ap);
   protected static final gbv.m ai = new gbv.m(gbh::ar);
   protected static final gbv.m aj = new gbv.m(gbh::as);
   protected static final gbv.m ak = new gbv.m(gbh::at);
   protected static final gbv.m al = new gbv.m(gbh::au);
   protected static final gbv.m am = new gbv.m(gbh::T);
   protected static final gbv.n an = new gbv.n(gmx.e, false, true);
   protected static final gbv.n ao = new gbv.n(gmx.e, false, false);
   protected static final gbv.e ap = new gbv.e();
   protected static final gbv.o aq = new gbv.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gbv.o ar = new gbv.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gbv.o as = new gbv.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gbv.g at = new gbv.g(true);
   protected static final gbv.g au = new gbv.g(false);
   protected static final gbv.l av = new gbv.l(true);
   protected static final gbv.l aw = new gbv.l(false);
   protected static final gbv.c ax = new gbv.c(true);
   protected static final gbv.c ay = new gbv.c(false);
   protected static final gbv.d az = new gbv.d("always", 519);
   protected static final gbv.d aA = new gbv.d("==", 514);
   protected static final gbv.d aB = new gbv.d("<=", 515);
   protected static final gbv.d aC = new gbv.d(">", 516);
   protected static final gbv.q aD = new gbv.q(true, true);
   protected static final gbv.q aE = new gbv.q(true, false);
   protected static final gbv.q aF = new gbv.q(false, true);
   protected static final gbv.f aG = new gbv.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gbv.f aH = new gbv.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gbv.f aI = new gbv.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gbv.k aJ = new gbv.k("main_target", () -> {
   }, () -> {
   });
   protected static final gbv.k aK = new gbv.k("outline_target", () -> fde.Q().f.s().a(false), () -> fde.Q().h().a(false));
   protected static final gbv.k aL = new gbv.k("translucent_target", () -> {
      if (fde.O()) {
         fde.Q().f.t().a(false);
      }
   }, () -> {
      if (fde.O()) {
         fde.Q().h().a(false);
      }
   });
   protected static final gbv.k aM = new gbv.k("particles_target", () -> {
      if (fde.O()) {
         fde.Q().f.v().a(false);
      }
   }, () -> {
      if (fde.O()) {
         fde.Q().h().a(false);
      }
   });
   protected static final gbv.k aN = new gbv.k("weather_target", () -> {
      if (fde.O()) {
         fde.Q().f.w().a(false);
      }
   }, () -> {
      if (fde.O()) {
         fde.Q().h().a(false);
      }
   });
   protected static final gbv.k aO = new gbv.k("clouds_target", () -> {
      if (fde.O()) {
         fde.Q().f.x().a(false);
      }
   }, () -> {
      if (fde.O()) {
         fde.Q().h().a(false);
      }
   });
   protected static final gbv.k aP = new gbv.k("item_entity_target", () -> {
      if (fde.O()) {
         fde.Q().f.u().a(false);
      }
   }, () -> {
      if (fde.O()) {
         fde.Q().h().a(false);
      }
   });
   protected static final gbv.h aQ = new gbv.h(OptionalDouble.of(1.0));
   protected static final gbv.b aR = new gbv.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gbv.b aS = new gbv.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gbv(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * fde.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gbv {
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

   protected static class b extends gbv {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gbv.a {
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

   protected static class d extends gbv {
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

   protected static class e extends gbv {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akh> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gbv {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gbv.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fde.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               fde.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gbv {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fde.Q().aP().k() / 1920.0F * 2.5F));
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

   protected static class i extends gbv.e {
      private final Optional<akh> aT;

      i(ImmutableList<Triple<akh, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akh, Boolean, Boolean> $$2 = (Triple<akh, Boolean, Boolean>)var2.next();
               gmz $$3 = fde.Q().aa();
               $$3.b((akh)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akh)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akh> c() {
         return this.aT;
      }

      public static gbv.i.a d() {
         return new gbv.i.a();
      }

      public static final class a {
         private final Builder<Triple<akh, Boolean, Boolean>> a = new Builder();

         public gbv.i.a a(akh $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gbv.i a() {
            return new gbv.i(this.a.build());
         }
      }
   }

   protected static final class j extends gbv.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gbv {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gbv.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fde.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               fde.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gbv {
      private final Optional<Supplier<gcc>> aT;

      public m(Supplier<gcc> $$0) {
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

   protected static class n extends gbv.e {
      private final Optional<akh> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akh $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gmz $$3 = fde.Q().aa();
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
      protected Optional<akh> c() {
         return this.aT;
      }
   }

   protected static class o extends gbv {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gbv {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gbv {
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
