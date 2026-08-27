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

public abstract class fxz {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final fxz.p c = new fxz.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fxz.p d = new fxz.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fxz.p e = new fxz.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fxz.p f = new fxz.p(
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
   protected static final fxz.p g = new fxz.p(
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
   protected static final fxz.p h = new fxz.p(
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
   protected static final fxz.m i = new fxz.m();
   protected static final fxz.m j = new fxz.m(fxl::v);
   protected static final fxz.m k = new fxz.m(fxl::p);
   protected static final fxz.m l = new fxz.m(fxl::r);
   protected static final fxz.m m = new fxz.m(fxl::s);
   protected static final fxz.m n = new fxz.m(fxl::w);
   protected static final fxz.m o = new fxz.m(fxl::q);
   protected static final fxz.m p = new fxz.m(fxl::x);
   protected static final fxz.m q = new fxz.m(fxl::y);
   protected static final fxz.m r = new fxz.m(fxl::z);
   protected static final fxz.m s = new fxz.m(fxl::A);
   protected static final fxz.m t = new fxz.m(fxl::B);
   protected static final fxz.m u = new fxz.m(fxl::C);
   protected static final fxz.m v = new fxz.m(fxl::D);
   protected static final fxz.m w = new fxz.m(fxl::E);
   protected static final fxz.m x = new fxz.m(fxl::F);
   protected static final fxz.m y = new fxz.m(fxl::G);
   protected static final fxz.m z = new fxz.m(fxl::H);
   protected static final fxz.m A = new fxz.m(fxl::I);
   protected static final fxz.m B = new fxz.m(fxl::J);
   protected static final fxz.m C = new fxz.m(fxl::K);
   protected static final fxz.m D = new fxz.m(fxl::L);
   protected static final fxz.m E = new fxz.m(fxl::M);
   protected static final fxz.m F = new fxz.m(fxl::N);
   protected static final fxz.m G = new fxz.m(fxl::O);
   protected static final fxz.m H = new fxz.m(fxl::P);
   protected static final fxz.m I = new fxz.m(fxl::Q);
   protected static final fxz.m J = new fxz.m(fxl::R);
   protected static final fxz.m K = new fxz.m(fxl::S);
   protected static final fxz.m L = new fxz.m(fxl::U);
   protected static final fxz.m M = new fxz.m(fxl::V);
   protected static final fxz.m N = new fxz.m(fxl::W);
   protected static final fxz.m O = new fxz.m(fxl::X);
   protected static final fxz.m P = new fxz.m(fxl::Y);
   protected static final fxz.m Q = new fxz.m(fxl::Z);
   protected static final fxz.m R = new fxz.m(fxl::aa);
   protected static final fxz.m S = new fxz.m(fxl::ab);
   protected static final fxz.m T = new fxz.m(fxl::ac);
   protected static final fxz.m U = new fxz.m(fxl::ad);
   protected static final fxz.m V = new fxz.m(fxl::aq);
   protected static final fxz.m W = new fxz.m(fxl::ae);
   protected static final fxz.m X = new fxz.m(fxl::af);
   protected static final fxz.m Y = new fxz.m(fxl::ag);
   protected static final fxz.m Z = new fxz.m(fxl::ah);
   protected static final fxz.m aa = new fxz.m(fxl::ai);
   protected static final fxz.m ab = new fxz.m(fxl::aj);
   protected static final fxz.m ac = new fxz.m(fxl::ak);
   protected static final fxz.m ad = new fxz.m(fxl::al);
   protected static final fxz.m ae = new fxz.m(fxl::am);
   protected static final fxz.m af = new fxz.m(fxl::an);
   protected static final fxz.m ag = new fxz.m(fxl::ao);
   protected static final fxz.m ah = new fxz.m(fxl::ap);
   protected static final fxz.m ai = new fxz.m(fxl::ar);
   protected static final fxz.m aj = new fxz.m(fxl::as);
   protected static final fxz.m ak = new fxz.m(fxl::at);
   protected static final fxz.m al = new fxz.m(fxl::au);
   protected static final fxz.m am = new fxz.m(fxl::T);
   protected static final fxz.n an = new fxz.n(gjb.e, false, true);
   protected static final fxz.n ao = new fxz.n(gjb.e, false, false);
   protected static final fxz.e ap = new fxz.e();
   protected static final fxz.o aq = new fxz.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fxz.o ar = new fxz.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fxz.o as = new fxz.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fxz.g at = new fxz.g(true);
   protected static final fxz.g au = new fxz.g(false);
   protected static final fxz.l av = new fxz.l(true);
   protected static final fxz.l aw = new fxz.l(false);
   protected static final fxz.c ax = new fxz.c(true);
   protected static final fxz.c ay = new fxz.c(false);
   protected static final fxz.d az = new fxz.d("always", 519);
   protected static final fxz.d aA = new fxz.d("==", 514);
   protected static final fxz.d aB = new fxz.d("<=", 515);
   protected static final fxz.d aC = new fxz.d(">", 516);
   protected static final fxz.q aD = new fxz.q(true, true);
   protected static final fxz.q aE = new fxz.q(true, false);
   protected static final fxz.q aF = new fxz.q(false, true);
   protected static final fxz.f aG = new fxz.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fxz.f aH = new fxz.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fxz.f aI = new fxz.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fxz.k aJ = new fxz.k("main_target", () -> {
   }, () -> {
   });
   protected static final fxz.k aK = new fxz.k("outline_target", () -> ezi.Q().f.s().a(false), () -> ezi.Q().h().a(false));
   protected static final fxz.k aL = new fxz.k("translucent_target", () -> {
      if (ezi.O()) {
         ezi.Q().f.t().a(false);
      }
   }, () -> {
      if (ezi.O()) {
         ezi.Q().h().a(false);
      }
   });
   protected static final fxz.k aM = new fxz.k("particles_target", () -> {
      if (ezi.O()) {
         ezi.Q().f.v().a(false);
      }
   }, () -> {
      if (ezi.O()) {
         ezi.Q().h().a(false);
      }
   });
   protected static final fxz.k aN = new fxz.k("weather_target", () -> {
      if (ezi.O()) {
         ezi.Q().f.w().a(false);
      }
   }, () -> {
      if (ezi.O()) {
         ezi.Q().h().a(false);
      }
   });
   protected static final fxz.k aO = new fxz.k("clouds_target", () -> {
      if (ezi.O()) {
         ezi.Q().f.x().a(false);
      }
   }, () -> {
      if (ezi.O()) {
         ezi.Q().h().a(false);
      }
   });
   protected static final fxz.k aP = new fxz.k("item_entity_target", () -> {
      if (ezi.O()) {
         ezi.Q().f.u().a(false);
      }
   }, () -> {
      if (ezi.O()) {
         ezi.Q().h().a(false);
      }
   });
   protected static final fxz.h aQ = new fxz.h(OptionalDouble.of(1.0));
   protected static final fxz.b aR = new fxz.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fxz.b aS = new fxz.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fxz(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * ezi.Q().m.ak().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fxz {
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

   protected static class b extends fxz {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fxz.a {
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

   protected static class d extends fxz {
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

   protected static class e extends fxz {
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

   protected static class f extends fxz {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fxz.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ezi.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               ezi.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fxz {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ezi.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends fxz.e {
      private final Optional<ajh> aT;

      i(ImmutableList<Triple<ajh, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ajh, Boolean, Boolean> $$2 = (Triple<ajh, Boolean, Boolean>)var2.next();
               gjd $$3 = ezi.Q().aa();
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

      public static fxz.i.a d() {
         return new fxz.i.a();
      }

      public static final class a {
         private final Builder<Triple<ajh, Boolean, Boolean>> a = new Builder();

         public fxz.i.a a(ajh $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fxz.i a() {
            return new fxz.i(this.a.build());
         }
      }
   }

   protected static final class j extends fxz.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fxz {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fxz.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ezi.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               ezi.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fxz {
      private final Optional<Supplier<fyg>> aT;

      public m(Supplier<fyg> $$0) {
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

   protected static class n extends fxz.e {
      private final Optional<ajh> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ajh $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gjd $$3 = ezi.Q().aa();
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

   protected static class o extends fxz {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fxz {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fxz {
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
