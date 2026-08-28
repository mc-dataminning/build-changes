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

public abstract class gfg {
   private static final float aQ = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aR;
   private final Runnable aS;
   protected static final gfg.p c = new gfg.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gfg.p d = new gfg.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfg.p e = new gfg.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfg.p f = new gfg.p(
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
   protected static final gfg.p g = new gfg.p(
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
   protected static final gfg.p h = new gfg.p(
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
   protected static final gfg.m i = new gfg.m();
   protected static final gfg.m j = new gfg.m(ges::t);
   protected static final gfg.m k = new gfg.m(ges::o);
   protected static final gfg.m l = new gfg.m(ges::q);
   protected static final gfg.m m = new gfg.m(ges::u);
   protected static final gfg.m n = new gfg.m(ges::p);
   protected static final gfg.m o = new gfg.m(ges::v);
   protected static final gfg.m p = new gfg.m(ges::w);
   protected static final gfg.m q = new gfg.m(ges::x);
   protected static final gfg.m r = new gfg.m(ges::y);
   protected static final gfg.m s = new gfg.m(ges::z);
   protected static final gfg.m t = new gfg.m(ges::A);
   protected static final gfg.m u = new gfg.m(ges::B);
   protected static final gfg.m v = new gfg.m(ges::C);
   protected static final gfg.m w = new gfg.m(ges::D);
   protected static final gfg.m x = new gfg.m(ges::E);
   protected static final gfg.m y = new gfg.m(ges::F);
   protected static final gfg.m z = new gfg.m(ges::G);
   protected static final gfg.m A = new gfg.m(ges::H);
   protected static final gfg.m B = new gfg.m(ges::I);
   protected static final gfg.m C = new gfg.m(ges::J);
   protected static final gfg.m D = new gfg.m(ges::K);
   protected static final gfg.m E = new gfg.m(ges::L);
   protected static final gfg.m F = new gfg.m(ges::M);
   protected static final gfg.m G = new gfg.m(ges::N);
   protected static final gfg.m H = new gfg.m(ges::O);
   protected static final gfg.m I = new gfg.m(ges::P);
   protected static final gfg.m J = new gfg.m(ges::Q);
   protected static final gfg.m K = new gfg.m(ges::S);
   protected static final gfg.m L = new gfg.m(ges::T);
   protected static final gfg.m M = new gfg.m(ges::U);
   protected static final gfg.m N = new gfg.m(ges::W);
   protected static final gfg.m O = new gfg.m(ges::X);
   protected static final gfg.m P = new gfg.m(ges::Y);
   protected static final gfg.m Q = new gfg.m(ges::aa);
   protected static final gfg.m R = new gfg.m(ges::ab);
   protected static final gfg.m S = new gfg.m(ges::ao);
   protected static final gfg.m T = new gfg.m(ges::ac);
   protected static final gfg.m U = new gfg.m(ges::ad);
   protected static final gfg.m V = new gfg.m(ges::ae);
   protected static final gfg.m W = new gfg.m(ges::af);
   protected static final gfg.m X = new gfg.m(ges::ag);
   protected static final gfg.m Y = new gfg.m(ges::ah);
   protected static final gfg.m Z = new gfg.m(ges::ai);
   protected static final gfg.m aa = new gfg.m(ges::aj);
   protected static final gfg.m ab = new gfg.m(ges::ak);
   protected static final gfg.m ac = new gfg.m(ges::al);
   protected static final gfg.m ad = new gfg.m(ges::am);
   protected static final gfg.m ae = new gfg.m(ges::an);
   protected static final gfg.m af = new gfg.m(ges::ap);
   protected static final gfg.m ag = new gfg.m(ges::aq);
   protected static final gfg.m ah = new gfg.m(ges::ar);
   protected static final gfg.m ai = new gfg.m(ges::as);
   protected static final gfg.m aj = new gfg.m(ges::R);
   protected static final gfg.n ak = new gfg.n(gqk.e, false, true);
   protected static final gfg.n al = new gfg.n(gqk.e, false, false);
   protected static final gfg.e am = new gfg.e();
   protected static final gfg.o an = new gfg.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gfg.o ao = new gfg.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfg.o ap = new gfg.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfg.g aq = new gfg.g(true);
   protected static final gfg.g ar = new gfg.g(false);
   protected static final gfg.l as = new gfg.l(true);
   protected static final gfg.l at = new gfg.l(false);
   protected static final gfg.c au = new gfg.c(true);
   protected static final gfg.c av = new gfg.c(false);
   protected static final gfg.d aw = new gfg.d("always", 519);
   protected static final gfg.d ax = new gfg.d("==", 514);
   protected static final gfg.d ay = new gfg.d("<=", 515);
   protected static final gfg.d az = new gfg.d(">", 516);
   protected static final gfg.q aA = new gfg.q(true, true);
   protected static final gfg.q aB = new gfg.q(true, false);
   protected static final gfg.q aC = new gfg.q(false, true);
   protected static final gfg.f aD = new gfg.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gfg.f aE = new gfg.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gfg.f aF = new gfg.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gfg.k aG = new gfg.k("main_target", () -> {
   }, () -> {
   });
   protected static final gfg.k aH = new gfg.k("outline_target", () -> fgo.Q().f.s().a(false), () -> fgo.Q().h().a(false));
   protected static final gfg.k aI = new gfg.k("translucent_target", () -> {
      if (fgo.O()) {
         fgo.Q().f.t().a(false);
      }
   }, () -> {
      if (fgo.O()) {
         fgo.Q().h().a(false);
      }
   });
   protected static final gfg.k aJ = new gfg.k("particles_target", () -> {
      if (fgo.O()) {
         fgo.Q().f.v().a(false);
      }
   }, () -> {
      if (fgo.O()) {
         fgo.Q().h().a(false);
      }
   });
   protected static final gfg.k aK = new gfg.k("weather_target", () -> {
      if (fgo.O()) {
         fgo.Q().f.w().a(false);
      }
   }, () -> {
      if (fgo.O()) {
         fgo.Q().h().a(false);
      }
   });
   protected static final gfg.k aL = new gfg.k("clouds_target", () -> {
      if (fgo.O()) {
         fgo.Q().f.x().a(false);
      }
   }, () -> {
      if (fgo.O()) {
         fgo.Q().h().a(false);
      }
   });
   protected static final gfg.k aM = new gfg.k("item_entity_target", () -> {
      if (fgo.O()) {
         fgo.Q().f.u().a(false);
      }
   }, () -> {
      if (fgo.O()) {
         fgo.Q().h().a(false);
      }
   });
   protected static final gfg.h aN = new gfg.h(OptionalDouble.of(1.0));
   protected static final gfg.b aO = new gfg.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gfg.b aP = new gfg.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gfg(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aR = $$1;
      this.aS = $$2;
   }

   public void a() {
      this.aR.run();
   }

   public void b() {
      this.aS.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ad.c() * fgo.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gfg {
      private final boolean aQ;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aQ = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aQ + "]";
      }
   }

   protected static class b extends gfg {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gfg.a {
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

   protected static class d extends gfg {
      private final String aQ;

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
         this.aQ = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aQ + "]";
      }
   }

   protected static class e extends gfg {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akr> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gfg {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gfg.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fgo.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fgo.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gfg {
      private final OptionalDouble aQ;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fgo.Q().aM().l() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aQ = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aQ.isPresent() ? this.aQ.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends gfg.e {
      private final Optional<akr> aQ;

      i(ImmutableList<Triple<akr, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akr, Boolean, Boolean> $$2 = (Triple<akr, Boolean, Boolean>)var2.next();
               gqm $$3 = fgo.Q().aa();
               $$3.b((akr)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akr)$$2.getLeft());
            }
         }, () -> {
         });
         this.aQ = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akr> c() {
         return this.aQ;
      }

      public static gfg.i.a d() {
         return new gfg.i.a();
      }

      public static final class a {
         private final Builder<Triple<akr, Boolean, Boolean>> a = new Builder();

         public gfg.i.a a(akr $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gfg.i a() {
            return new gfg.i(this.a.build());
         }
      }
   }

   protected static final class j extends gfg.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gfg {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gfg.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fgo.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fgo.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gfg {
      private final Optional<Supplier<gfn>> aQ;

      public m(Supplier<gfn> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aQ = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aQ = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aQ + "]";
      }
   }

   protected static class n extends gfg.e {
      private final Optional<akr> aQ;
      private final boolean aR;
      private final boolean aS;

      public n(akr $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gqm $$3 = fgo.Q().aa();
            $$3.b($$0).a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aQ = Optional.of($$0);
         this.aR = $$1;
         this.aS = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aQ + "(blur=" + this.aR + ", mipmap=" + this.aS + ")]";
      }

      @Override
      protected Optional<akr> c() {
         return this.aQ;
      }
   }

   protected static class o extends gfg {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gfg {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gfg {
      private final boolean aQ;
      private final boolean aR;

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
         this.aQ = $$0;
         this.aR = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aQ + ", writeDepth=" + this.aR + "]";
      }
   }
}
