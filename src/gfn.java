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

public abstract class gfn {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gfn.p c = new gfn.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gfn.p d = new gfn.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfn.p e = new gfn.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfn.p f = new gfn.p(
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
   protected static final gfn.p g = new gfn.p(
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
   protected static final gfn.p h = new gfn.p(
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
   protected static final gfn.m i = new gfn.m();
   protected static final gfn.m j = new gfn.m(gez::v);
   protected static final gfn.m k = new gfn.m(gez::p);
   protected static final gfn.m l = new gfn.m(gez::r);
   protected static final gfn.m m = new gfn.m(gez::s);
   protected static final gfn.m n = new gfn.m(gez::w);
   protected static final gfn.m o = new gfn.m(gez::q);
   protected static final gfn.m p = new gfn.m(gez::x);
   protected static final gfn.m q = new gfn.m(gez::y);
   protected static final gfn.m r = new gfn.m(gez::z);
   protected static final gfn.m s = new gfn.m(gez::A);
   protected static final gfn.m t = new gfn.m(gez::B);
   protected static final gfn.m u = new gfn.m(gez::C);
   protected static final gfn.m v = new gfn.m(gez::D);
   protected static final gfn.m w = new gfn.m(gez::E);
   protected static final gfn.m x = new gfn.m(gez::F);
   protected static final gfn.m y = new gfn.m(gez::G);
   protected static final gfn.m z = new gfn.m(gez::H);
   protected static final gfn.m A = new gfn.m(gez::I);
   protected static final gfn.m B = new gfn.m(gez::J);
   protected static final gfn.m C = new gfn.m(gez::K);
   protected static final gfn.m D = new gfn.m(gez::L);
   protected static final gfn.m E = new gfn.m(gez::M);
   protected static final gfn.m F = new gfn.m(gez::N);
   protected static final gfn.m G = new gfn.m(gez::O);
   protected static final gfn.m H = new gfn.m(gez::P);
   protected static final gfn.m I = new gfn.m(gez::Q);
   protected static final gfn.m J = new gfn.m(gez::R);
   protected static final gfn.m K = new gfn.m(gez::S);
   protected static final gfn.m L = new gfn.m(gez::U);
   protected static final gfn.m M = new gfn.m(gez::V);
   protected static final gfn.m N = new gfn.m(gez::W);
   protected static final gfn.m O = new gfn.m(gez::X);
   protected static final gfn.m P = new gfn.m(gez::Y);
   protected static final gfn.m Q = new gfn.m(gez::Z);
   protected static final gfn.m R = new gfn.m(gez::aa);
   protected static final gfn.m S = new gfn.m(gez::ab);
   protected static final gfn.m T = new gfn.m(gez::ac);
   protected static final gfn.m U = new gfn.m(gez::ad);
   protected static final gfn.m V = new gfn.m(gez::aq);
   protected static final gfn.m W = new gfn.m(gez::ae);
   protected static final gfn.m X = new gfn.m(gez::af);
   protected static final gfn.m Y = new gfn.m(gez::ag);
   protected static final gfn.m Z = new gfn.m(gez::ah);
   protected static final gfn.m aa = new gfn.m(gez::ai);
   protected static final gfn.m ab = new gfn.m(gez::aj);
   protected static final gfn.m ac = new gfn.m(gez::ak);
   protected static final gfn.m ad = new gfn.m(gez::al);
   protected static final gfn.m ae = new gfn.m(gez::am);
   protected static final gfn.m af = new gfn.m(gez::an);
   protected static final gfn.m ag = new gfn.m(gez::ao);
   protected static final gfn.m ah = new gfn.m(gez::ap);
   protected static final gfn.m ai = new gfn.m(gez::ar);
   protected static final gfn.m aj = new gfn.m(gez::as);
   protected static final gfn.m ak = new gfn.m(gez::at);
   protected static final gfn.m al = new gfn.m(gez::au);
   protected static final gfn.m am = new gfn.m(gez::T);
   protected static final gfn.n an = new gfn.n(gqx.e, false, true);
   protected static final gfn.n ao = new gfn.n(gqx.e, false, false);
   protected static final gfn.e ap = new gfn.e();
   protected static final gfn.o aq = new gfn.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gfn.o ar = new gfn.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfn.o as = new gfn.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfn.g at = new gfn.g(true);
   protected static final gfn.g au = new gfn.g(false);
   protected static final gfn.l av = new gfn.l(true);
   protected static final gfn.l aw = new gfn.l(false);
   protected static final gfn.c ax = new gfn.c(true);
   protected static final gfn.c ay = new gfn.c(false);
   protected static final gfn.d az = new gfn.d("always", 519);
   protected static final gfn.d aA = new gfn.d("==", 514);
   protected static final gfn.d aB = new gfn.d("<=", 515);
   protected static final gfn.d aC = new gfn.d(">", 516);
   protected static final gfn.q aD = new gfn.q(true, true);
   protected static final gfn.q aE = new gfn.q(true, false);
   protected static final gfn.q aF = new gfn.q(false, true);
   protected static final gfn.f aG = new gfn.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gfn.f aH = new gfn.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gfn.f aI = new gfn.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gfn.k aJ = new gfn.k("main_target", () -> {
   }, () -> {
   });
   protected static final gfn.k aK = new gfn.k("outline_target", () -> fgj.Q().f.s().a(false), () -> fgj.Q().h().a(false));
   protected static final gfn.k aL = new gfn.k("translucent_target", () -> {
      if (fgj.O()) {
         fgj.Q().f.t().a(false);
      }
   }, () -> {
      if (fgj.O()) {
         fgj.Q().h().a(false);
      }
   });
   protected static final gfn.k aM = new gfn.k("particles_target", () -> {
      if (fgj.O()) {
         fgj.Q().f.v().a(false);
      }
   }, () -> {
      if (fgj.O()) {
         fgj.Q().h().a(false);
      }
   });
   protected static final gfn.k aN = new gfn.k("weather_target", () -> {
      if (fgj.O()) {
         fgj.Q().f.w().a(false);
      }
   }, () -> {
      if (fgj.O()) {
         fgj.Q().h().a(false);
      }
   });
   protected static final gfn.k aO = new gfn.k("clouds_target", () -> {
      if (fgj.O()) {
         fgj.Q().f.x().a(false);
      }
   }, () -> {
      if (fgj.O()) {
         fgj.Q().h().a(false);
      }
   });
   protected static final gfn.k aP = new gfn.k("item_entity_target", () -> {
      if (fgj.O()) {
         fgj.Q().f.u().a(false);
      }
   }, () -> {
      if (fgj.O()) {
         fgj.Q().h().a(false);
      }
   });
   protected static final gfn.h aQ = new gfn.h(OptionalDouble.of(1.0));
   protected static final gfn.b aR = new gfn.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gfn.b aS = new gfn.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gfn(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.b() * fgj.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gfn {
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

   protected static class b extends gfn {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gfn.a {
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

   protected static class d extends gfn {
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

   protected static class e extends gfn {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akt> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gfn {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gfn.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fgj.Q().j.n().c();
            }
         }, () -> {
            if ($$0) {
               fgj.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gfn {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fgj.Q().aP().k() / 1920.0F * 2.5F));
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

   protected static class i extends gfn.e {
      private final Optional<akt> aT;

      i(ImmutableList<Triple<akt, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akt, Boolean, Boolean> $$2 = (Triple<akt, Boolean, Boolean>)var2.next();
               gqz $$3 = fgj.Q().aa();
               $$3.b((akt)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akt)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akt> c() {
         return this.aT;
      }

      public static gfn.i.a d() {
         return new gfn.i.a();
      }

      public static final class a {
         private final Builder<Triple<akt, Boolean, Boolean>> a = new Builder();

         public gfn.i.a a(akt $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gfn.i a() {
            return new gfn.i(this.a.build());
         }
      }
   }

   protected static final class j extends gfn.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gfn {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gfn.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fgj.Q().j.o().a();
            }
         }, () -> {
            if ($$0) {
               fgj.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gfn {
      private final Optional<Supplier<gfu>> aT;

      public m(Supplier<gfu> $$0) {
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

   protected static class n extends gfn.e {
      private final Optional<akt> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akt $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gqz $$3 = fgj.Q().aa();
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
      protected Optional<akt> c() {
         return this.aT;
      }
   }

   protected static class o extends gfn {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gfn {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gfn {
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
