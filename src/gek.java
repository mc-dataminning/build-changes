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

public abstract class gek {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gek.p c = new gek.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gek.p d = new gek.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gek.p e = new gek.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gek.p f = new gek.p(
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
   protected static final gek.p g = new gek.p(
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
   protected static final gek.p h = new gek.p(
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
   protected static final gek.m i = new gek.m();
   protected static final gek.m j = new gek.m(gdw::u);
   protected static final gek.m k = new gek.m(gdw::o);
   protected static final gek.m l = new gek.m(gdw::q);
   protected static final gek.m m = new gek.m(gdw::r);
   protected static final gek.m n = new gek.m(gdw::v);
   protected static final gek.m o = new gek.m(gdw::p);
   protected static final gek.m p = new gek.m(gdw::w);
   protected static final gek.m q = new gek.m(gdw::x);
   protected static final gek.m r = new gek.m(gdw::y);
   protected static final gek.m s = new gek.m(gdw::z);
   protected static final gek.m t = new gek.m(gdw::A);
   protected static final gek.m u = new gek.m(gdw::B);
   protected static final gek.m v = new gek.m(gdw::C);
   protected static final gek.m w = new gek.m(gdw::D);
   protected static final gek.m x = new gek.m(gdw::E);
   protected static final gek.m y = new gek.m(gdw::F);
   protected static final gek.m z = new gek.m(gdw::G);
   protected static final gek.m A = new gek.m(gdw::H);
   protected static final gek.m B = new gek.m(gdw::I);
   protected static final gek.m C = new gek.m(gdw::J);
   protected static final gek.m D = new gek.m(gdw::K);
   protected static final gek.m E = new gek.m(gdw::L);
   protected static final gek.m F = new gek.m(gdw::M);
   protected static final gek.m G = new gek.m(gdw::N);
   protected static final gek.m H = new gek.m(gdw::O);
   protected static final gek.m I = new gek.m(gdw::P);
   protected static final gek.m J = new gek.m(gdw::Q);
   protected static final gek.m K = new gek.m(gdw::R);
   protected static final gek.m L = new gek.m(gdw::T);
   protected static final gek.m M = new gek.m(gdw::U);
   protected static final gek.m N = new gek.m(gdw::V);
   protected static final gek.m O = new gek.m(gdw::W);
   protected static final gek.m P = new gek.m(gdw::X);
   protected static final gek.m Q = new gek.m(gdw::Y);
   protected static final gek.m R = new gek.m(gdw::Z);
   protected static final gek.m S = new gek.m(gdw::aa);
   protected static final gek.m T = new gek.m(gdw::ab);
   protected static final gek.m U = new gek.m(gdw::ac);
   protected static final gek.m V = new gek.m(gdw::ap);
   protected static final gek.m W = new gek.m(gdw::ad);
   protected static final gek.m X = new gek.m(gdw::ae);
   protected static final gek.m Y = new gek.m(gdw::af);
   protected static final gek.m Z = new gek.m(gdw::ag);
   protected static final gek.m aa = new gek.m(gdw::ah);
   protected static final gek.m ab = new gek.m(gdw::ai);
   protected static final gek.m ac = new gek.m(gdw::aj);
   protected static final gek.m ad = new gek.m(gdw::ak);
   protected static final gek.m ae = new gek.m(gdw::al);
   protected static final gek.m af = new gek.m(gdw::am);
   protected static final gek.m ag = new gek.m(gdw::an);
   protected static final gek.m ah = new gek.m(gdw::ao);
   protected static final gek.m ai = new gek.m(gdw::aq);
   protected static final gek.m aj = new gek.m(gdw::ar);
   protected static final gek.m ak = new gek.m(gdw::as);
   protected static final gek.m al = new gek.m(gdw::at);
   protected static final gek.m am = new gek.m(gdw::S);
   protected static final gek.n an = new gek.n(gpn.e, false, true);
   protected static final gek.n ao = new gek.n(gpn.e, false, false);
   protected static final gek.e ap = new gek.e();
   protected static final gek.o aq = new gek.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gek.o ar = new gek.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gek.o as = new gek.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gek.g at = new gek.g(true);
   protected static final gek.g au = new gek.g(false);
   protected static final gek.l av = new gek.l(true);
   protected static final gek.l aw = new gek.l(false);
   protected static final gek.c ax = new gek.c(true);
   protected static final gek.c ay = new gek.c(false);
   protected static final gek.d az = new gek.d("always", 519);
   protected static final gek.d aA = new gek.d("==", 514);
   protected static final gek.d aB = new gek.d("<=", 515);
   protected static final gek.d aC = new gek.d(">", 516);
   protected static final gek.q aD = new gek.q(true, true);
   protected static final gek.q aE = new gek.q(true, false);
   protected static final gek.q aF = new gek.q(false, true);
   protected static final gek.f aG = new gek.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gek.f aH = new gek.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gek.f aI = new gek.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gek.k aJ = new gek.k("main_target", () -> {
   }, () -> {
   });
   protected static final gek.k aK = new gek.k("outline_target", () -> fft.Q().f.s().a(false), () -> fft.Q().h().a(false));
   protected static final gek.k aL = new gek.k("translucent_target", () -> {
      if (fft.O()) {
         fft.Q().f.t().a(false);
      }
   }, () -> {
      if (fft.O()) {
         fft.Q().h().a(false);
      }
   });
   protected static final gek.k aM = new gek.k("particles_target", () -> {
      if (fft.O()) {
         fft.Q().f.v().a(false);
      }
   }, () -> {
      if (fft.O()) {
         fft.Q().h().a(false);
      }
   });
   protected static final gek.k aN = new gek.k("weather_target", () -> {
      if (fft.O()) {
         fft.Q().f.w().a(false);
      }
   }, () -> {
      if (fft.O()) {
         fft.Q().h().a(false);
      }
   });
   protected static final gek.k aO = new gek.k("clouds_target", () -> {
      if (fft.O()) {
         fft.Q().f.x().a(false);
      }
   }, () -> {
      if (fft.O()) {
         fft.Q().h().a(false);
      }
   });
   protected static final gek.k aP = new gek.k("item_entity_target", () -> {
      if (fft.O()) {
         fft.Q().f.u().a(false);
      }
   }, () -> {
      if (fft.O()) {
         fft.Q().h().a(false);
      }
   });
   protected static final gek.h aQ = new gek.h(OptionalDouble.of(1.0));
   protected static final gek.b aR = new gek.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gek.b aS = new gek.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gek(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * fft.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gek {
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

   protected static class b extends gek {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gek.a {
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

   protected static class d extends gek {
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

   protected static class e extends gek {
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

   protected static class f extends gek {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gek.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fft.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fft.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gek {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fft.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gek.e {
      private final Optional<akk> aT;

      i(ImmutableList<Triple<akk, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akk, Boolean, Boolean> $$2 = (Triple<akk, Boolean, Boolean>)var2.next();
               gpp $$3 = fft.Q().aa();
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

      public static gek.i.a d() {
         return new gek.i.a();
      }

      public static final class a {
         private final Builder<Triple<akk, Boolean, Boolean>> a = new Builder();

         public gek.i.a a(akk $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gek.i a() {
            return new gek.i(this.a.build());
         }
      }
   }

   protected static final class j extends gek.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gek {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gek.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fft.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fft.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gek {
      private final Optional<Supplier<ger>> aT;

      public m(Supplier<ger> $$0) {
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

   protected static class n extends gek.e {
      private final Optional<akk> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akk $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpp $$3 = fft.Q().aa();
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

   protected static class o extends gek {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gek {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gek {
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
