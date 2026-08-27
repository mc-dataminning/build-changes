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

public abstract class gbl {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gbl.p c = new gbl.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gbl.p d = new gbl.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gbl.p e = new gbl.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gbl.p f = new gbl.p(
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
   protected static final gbl.p g = new gbl.p(
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
   protected static final gbl.p h = new gbl.p(
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
   protected static final gbl.m i = new gbl.m();
   protected static final gbl.m j = new gbl.m(gax::v);
   protected static final gbl.m k = new gbl.m(gax::p);
   protected static final gbl.m l = new gbl.m(gax::r);
   protected static final gbl.m m = new gbl.m(gax::s);
   protected static final gbl.m n = new gbl.m(gax::w);
   protected static final gbl.m o = new gbl.m(gax::q);
   protected static final gbl.m p = new gbl.m(gax::x);
   protected static final gbl.m q = new gbl.m(gax::y);
   protected static final gbl.m r = new gbl.m(gax::z);
   protected static final gbl.m s = new gbl.m(gax::A);
   protected static final gbl.m t = new gbl.m(gax::B);
   protected static final gbl.m u = new gbl.m(gax::C);
   protected static final gbl.m v = new gbl.m(gax::D);
   protected static final gbl.m w = new gbl.m(gax::E);
   protected static final gbl.m x = new gbl.m(gax::F);
   protected static final gbl.m y = new gbl.m(gax::G);
   protected static final gbl.m z = new gbl.m(gax::H);
   protected static final gbl.m A = new gbl.m(gax::I);
   protected static final gbl.m B = new gbl.m(gax::J);
   protected static final gbl.m C = new gbl.m(gax::K);
   protected static final gbl.m D = new gbl.m(gax::L);
   protected static final gbl.m E = new gbl.m(gax::M);
   protected static final gbl.m F = new gbl.m(gax::N);
   protected static final gbl.m G = new gbl.m(gax::O);
   protected static final gbl.m H = new gbl.m(gax::P);
   protected static final gbl.m I = new gbl.m(gax::Q);
   protected static final gbl.m J = new gbl.m(gax::R);
   protected static final gbl.m K = new gbl.m(gax::S);
   protected static final gbl.m L = new gbl.m(gax::U);
   protected static final gbl.m M = new gbl.m(gax::V);
   protected static final gbl.m N = new gbl.m(gax::W);
   protected static final gbl.m O = new gbl.m(gax::X);
   protected static final gbl.m P = new gbl.m(gax::Y);
   protected static final gbl.m Q = new gbl.m(gax::Z);
   protected static final gbl.m R = new gbl.m(gax::aa);
   protected static final gbl.m S = new gbl.m(gax::ab);
   protected static final gbl.m T = new gbl.m(gax::ac);
   protected static final gbl.m U = new gbl.m(gax::ad);
   protected static final gbl.m V = new gbl.m(gax::aq);
   protected static final gbl.m W = new gbl.m(gax::ae);
   protected static final gbl.m X = new gbl.m(gax::af);
   protected static final gbl.m Y = new gbl.m(gax::ag);
   protected static final gbl.m Z = new gbl.m(gax::ah);
   protected static final gbl.m aa = new gbl.m(gax::ai);
   protected static final gbl.m ab = new gbl.m(gax::aj);
   protected static final gbl.m ac = new gbl.m(gax::ak);
   protected static final gbl.m ad = new gbl.m(gax::al);
   protected static final gbl.m ae = new gbl.m(gax::am);
   protected static final gbl.m af = new gbl.m(gax::an);
   protected static final gbl.m ag = new gbl.m(gax::ao);
   protected static final gbl.m ah = new gbl.m(gax::ap);
   protected static final gbl.m ai = new gbl.m(gax::ar);
   protected static final gbl.m aj = new gbl.m(gax::as);
   protected static final gbl.m ak = new gbl.m(gax::at);
   protected static final gbl.m al = new gbl.m(gax::au);
   protected static final gbl.m am = new gbl.m(gax::T);
   protected static final gbl.n an = new gbl.n(gmn.e, false, true);
   protected static final gbl.n ao = new gbl.n(gmn.e, false, false);
   protected static final gbl.e ap = new gbl.e();
   protected static final gbl.o aq = new gbl.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gbl.o ar = new gbl.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gbl.o as = new gbl.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gbl.g at = new gbl.g(true);
   protected static final gbl.g au = new gbl.g(false);
   protected static final gbl.l av = new gbl.l(true);
   protected static final gbl.l aw = new gbl.l(false);
   protected static final gbl.c ax = new gbl.c(true);
   protected static final gbl.c ay = new gbl.c(false);
   protected static final gbl.d az = new gbl.d("always", 519);
   protected static final gbl.d aA = new gbl.d("==", 514);
   protected static final gbl.d aB = new gbl.d("<=", 515);
   protected static final gbl.d aC = new gbl.d(">", 516);
   protected static final gbl.q aD = new gbl.q(true, true);
   protected static final gbl.q aE = new gbl.q(true, false);
   protected static final gbl.q aF = new gbl.q(false, true);
   protected static final gbl.f aG = new gbl.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gbl.f aH = new gbl.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gbl.f aI = new gbl.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gbl.k aJ = new gbl.k("main_target", () -> {
   }, () -> {
   });
   protected static final gbl.k aK = new gbl.k("outline_target", () -> fcu.Q().f.s().a(false), () -> fcu.Q().h().a(false));
   protected static final gbl.k aL = new gbl.k("translucent_target", () -> {
      if (fcu.O()) {
         fcu.Q().f.t().a(false);
      }
   }, () -> {
      if (fcu.O()) {
         fcu.Q().h().a(false);
      }
   });
   protected static final gbl.k aM = new gbl.k("particles_target", () -> {
      if (fcu.O()) {
         fcu.Q().f.v().a(false);
      }
   }, () -> {
      if (fcu.O()) {
         fcu.Q().h().a(false);
      }
   });
   protected static final gbl.k aN = new gbl.k("weather_target", () -> {
      if (fcu.O()) {
         fcu.Q().f.w().a(false);
      }
   }, () -> {
      if (fcu.O()) {
         fcu.Q().h().a(false);
      }
   });
   protected static final gbl.k aO = new gbl.k("clouds_target", () -> {
      if (fcu.O()) {
         fcu.Q().f.x().a(false);
      }
   }, () -> {
      if (fcu.O()) {
         fcu.Q().h().a(false);
      }
   });
   protected static final gbl.k aP = new gbl.k("item_entity_target", () -> {
      if (fcu.O()) {
         fcu.Q().f.u().a(false);
      }
   }, () -> {
      if (fcu.O()) {
         fcu.Q().h().a(false);
      }
   });
   protected static final gbl.h aQ = new gbl.h(OptionalDouble.of(1.0));
   protected static final gbl.b aR = new gbl.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gbl.b aS = new gbl.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gbl(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * fcu.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gbl {
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

   protected static class b extends gbl {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gbl.a {
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

   protected static class d extends gbl {
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

   protected static class e extends gbl {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akf> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gbl {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gbl.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fcu.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               fcu.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gbl {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fcu.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gbl.e {
      private final Optional<akf> aT;

      i(ImmutableList<Triple<akf, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akf, Boolean, Boolean> $$2 = (Triple<akf, Boolean, Boolean>)var2.next();
               gmp $$3 = fcu.Q().aa();
               $$3.b((akf)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akf)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akf> c() {
         return this.aT;
      }

      public static gbl.i.a d() {
         return new gbl.i.a();
      }

      public static final class a {
         private final Builder<Triple<akf, Boolean, Boolean>> a = new Builder();

         public gbl.i.a a(akf $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gbl.i a() {
            return new gbl.i(this.a.build());
         }
      }
   }

   protected static final class j extends gbl.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gbl {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gbl.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fcu.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               fcu.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gbl {
      private final Optional<Supplier<gbs>> aT;

      public m(Supplier<gbs> $$0) {
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

   protected static class n extends gbl.e {
      private final Optional<akf> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akf $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gmp $$3 = fcu.Q().aa();
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
      protected Optional<akf> c() {
         return this.aT;
      }
   }

   protected static class o extends gbl {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gbl {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gbl {
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
