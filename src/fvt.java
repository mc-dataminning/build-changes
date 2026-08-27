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

public abstract class fvt {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fvt.p c = new fvt.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fvt.p d = new fvt.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fvt.p e = new fvt.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fvt.p f = new fvt.p(
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
   protected static final fvt.p g = new fvt.p(
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
   protected static final fvt.p h = new fvt.p(
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
   protected static final fvt.m i = new fvt.m();
   protected static final fvt.m j = new fvt.m(fvf::v);
   protected static final fvt.m k = new fvt.m(fvf::p);
   protected static final fvt.m l = new fvt.m(fvf::r);
   protected static final fvt.m m = new fvt.m(fvf::s);
   protected static final fvt.m n = new fvt.m(fvf::w);
   protected static final fvt.m o = new fvt.m(fvf::q);
   protected static final fvt.m p = new fvt.m(fvf::z);
   protected static final fvt.m q = new fvt.m(fvf::A);
   protected static final fvt.m r = new fvt.m(fvf::B);
   protected static final fvt.m s = new fvt.m(fvf::C);
   protected static final fvt.m t = new fvt.m(fvf::D);
   protected static final fvt.m u = new fvt.m(fvf::E);
   protected static final fvt.m v = new fvt.m(fvf::F);
   protected static final fvt.m w = new fvt.m(fvf::G);
   protected static final fvt.m x = new fvt.m(fvf::H);
   protected static final fvt.m y = new fvt.m(fvf::I);
   protected static final fvt.m z = new fvt.m(fvf::J);
   protected static final fvt.m A = new fvt.m(fvf::K);
   protected static final fvt.m B = new fvt.m(fvf::L);
   protected static final fvt.m C = new fvt.m(fvf::M);
   protected static final fvt.m D = new fvt.m(fvf::N);
   protected static final fvt.m E = new fvt.m(fvf::O);
   protected static final fvt.m F = new fvt.m(fvf::P);
   protected static final fvt.m G = new fvt.m(fvf::Q);
   protected static final fvt.m H = new fvt.m(fvf::R);
   protected static final fvt.m I = new fvt.m(fvf::S);
   protected static final fvt.m J = new fvt.m(fvf::T);
   protected static final fvt.m K = new fvt.m(fvf::U);
   protected static final fvt.m L = new fvt.m(fvf::W);
   protected static final fvt.m M = new fvt.m(fvf::X);
   protected static final fvt.m N = new fvt.m(fvf::Y);
   protected static final fvt.m O = new fvt.m(fvf::Z);
   protected static final fvt.m P = new fvt.m(fvf::aa);
   protected static final fvt.m Q = new fvt.m(fvf::ab);
   protected static final fvt.m R = new fvt.m(fvf::ac);
   protected static final fvt.m S = new fvt.m(fvf::ad);
   protected static final fvt.m T = new fvt.m(fvf::ae);
   protected static final fvt.m U = new fvt.m(fvf::af);
   protected static final fvt.m V = new fvt.m(fvf::ar);
   protected static final fvt.m W = new fvt.m(fvf::ag);
   protected static final fvt.m X = new fvt.m(fvf::ah);
   protected static final fvt.m Y = new fvt.m(fvf::ai);
   protected static final fvt.m Z = new fvt.m(fvf::aj);
   protected static final fvt.m aa = new fvt.m(fvf::ak);
   protected static final fvt.m ab = new fvt.m(fvf::al);
   protected static final fvt.m ac = new fvt.m(fvf::am);
   protected static final fvt.m ad = new fvt.m(fvf::an);
   protected static final fvt.m ae = new fvt.m(fvf::ao);
   protected static final fvt.m af = new fvt.m(fvf::ap);
   protected static final fvt.m ag = new fvt.m(fvf::aq);
   protected static final fvt.m ah = new fvt.m(fvf::as);
   protected static final fvt.m ai = new fvt.m(fvf::at);
   protected static final fvt.m aj = new fvt.m(fvf::au);
   protected static final fvt.m ak = new fvt.m(fvf::av);
   protected static final fvt.m al = new fvt.m(fvf::V);
   protected static final fvt.n am = new fvt.n(ggt.e, false, true);
   protected static final fvt.n an = new fvt.n(ggt.e, false, false);
   protected static final fvt.e ao = new fvt.e();
   protected static final fvt.o ap = new fvt.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fvt.o aq = new fvt.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fvt.o ar = new fvt.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fvt.g as = new fvt.g(true);
   protected static final fvt.g at = new fvt.g(false);
   protected static final fvt.l au = new fvt.l(true);
   protected static final fvt.l av = new fvt.l(false);
   protected static final fvt.c aw = new fvt.c(true);
   protected static final fvt.c ax = new fvt.c(false);
   protected static final fvt.d ay = new fvt.d("always", 519);
   protected static final fvt.d az = new fvt.d("==", 514);
   protected static final fvt.d aA = new fvt.d("<=", 515);
   protected static final fvt.d aB = new fvt.d(">", 516);
   protected static final fvt.q aC = new fvt.q(true, true);
   protected static final fvt.q aD = new fvt.q(true, false);
   protected static final fvt.q aE = new fvt.q(false, true);
   protected static final fvt.f aF = new fvt.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fvt.f aG = new fvt.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fvt.f aH = new fvt.f("view_offset_z_layering", () -> {
      esa $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      esa $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fvt.k aI = new fvt.k("main_target", () -> {
   }, () -> {
   });
   protected static final fvt.k aJ = new fvt.k("outline_target", () -> exh.O().f.s().a(false), () -> exh.O().g().a(false));
   protected static final fvt.k aK = new fvt.k("translucent_target", () -> {
      if (exh.M()) {
         exh.O().f.t().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvt.k aL = new fvt.k("particles_target", () -> {
      if (exh.M()) {
         exh.O().f.v().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvt.k aM = new fvt.k("weather_target", () -> {
      if (exh.M()) {
         exh.O().f.w().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvt.k aN = new fvt.k("clouds_target", () -> {
      if (exh.M()) {
         exh.O().f.x().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvt.k aO = new fvt.k("item_entity_target", () -> {
      if (exh.M()) {
         exh.O().f.u().a(false);
      }
   }, () -> {
      if (exh.M()) {
         exh.O().g().a(false);
      }
   });
   protected static final fvt.h aP = new fvt.h(OptionalDouble.of(1.0));
   protected static final fvt.b aQ = new fvt.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fvt.b aR = new fvt.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fvt(String $$0, Runnable $$1, Runnable $$2) {
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

   static class a extends fvt {
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

   protected static class b extends fvt {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fvt.a {
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

   protected static class d extends fvt {
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

   protected static class e extends fvt {
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

   protected static class f extends fvt {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fvt.a {
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

   protected static class h extends fvt {
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

   protected static class i extends fvt.e {
      private final Optional<aiy> aS;

      i(ImmutableList<Triple<aiy, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aiy, Boolean, Boolean> $$2 = (Triple<aiy, Boolean, Boolean>)var2.next();
               ggv $$3 = exh.O().Y();
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

      public static fvt.i.a d() {
         return new fvt.i.a();
      }

      public static final class a {
         private final Builder<Triple<aiy, Boolean, Boolean>> a = new Builder();

         public fvt.i.a a(aiy $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fvt.i a() {
            return new fvt.i(this.a.build());
         }
      }
   }

   protected static final class j extends fvt.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fvt {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fvt.a {
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

   protected static class m extends fvt {
      private final Optional<Supplier<fwa>> aS;

      public m(Supplier<fwa> $$0) {
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

   protected static class n extends fvt.e {
      private final Optional<aiy> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aiy $$0, boolean $$1, boolean $$2) {
         super(() -> {
            ggv $$3 = exh.O().Y();
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

   protected static class o extends fvt {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fvt {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fvt {
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
