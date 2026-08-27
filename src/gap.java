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

public abstract class gap {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gap.p c = new gap.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gap.p d = new gap.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gap.p e = new gap.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gap.p f = new gap.p(
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
   protected static final gap.p g = new gap.p(
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
   protected static final gap.p h = new gap.p(
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
   protected static final gap.m i = new gap.m();
   protected static final gap.m j = new gap.m(gab::w);
   protected static final gap.m k = new gap.m(gab::q);
   protected static final gap.m l = new gap.m(gab::s);
   protected static final gap.m m = new gap.m(gab::t);
   protected static final gap.m n = new gap.m(gab::x);
   protected static final gap.m o = new gap.m(gab::r);
   protected static final gap.m p = new gap.m(gab::y);
   protected static final gap.m q = new gap.m(gab::z);
   protected static final gap.m r = new gap.m(gab::A);
   protected static final gap.m s = new gap.m(gab::B);
   protected static final gap.m t = new gap.m(gab::C);
   protected static final gap.m u = new gap.m(gab::D);
   protected static final gap.m v = new gap.m(gab::E);
   protected static final gap.m w = new gap.m(gab::F);
   protected static final gap.m x = new gap.m(gab::G);
   protected static final gap.m y = new gap.m(gab::H);
   protected static final gap.m z = new gap.m(gab::I);
   protected static final gap.m A = new gap.m(gab::J);
   protected static final gap.m B = new gap.m(gab::K);
   protected static final gap.m C = new gap.m(gab::L);
   protected static final gap.m D = new gap.m(gab::M);
   protected static final gap.m E = new gap.m(gab::N);
   protected static final gap.m F = new gap.m(gab::O);
   protected static final gap.m G = new gap.m(gab::P);
   protected static final gap.m H = new gap.m(gab::Q);
   protected static final gap.m I = new gap.m(gab::R);
   protected static final gap.m J = new gap.m(gab::S);
   protected static final gap.m K = new gap.m(gab::T);
   protected static final gap.m L = new gap.m(gab::V);
   protected static final gap.m M = new gap.m(gab::W);
   protected static final gap.m N = new gap.m(gab::X);
   protected static final gap.m O = new gap.m(gab::Y);
   protected static final gap.m P = new gap.m(gab::Z);
   protected static final gap.m Q = new gap.m(gab::aa);
   protected static final gap.m R = new gap.m(gab::ab);
   protected static final gap.m S = new gap.m(gab::ac);
   protected static final gap.m T = new gap.m(gab::ad);
   protected static final gap.m U = new gap.m(gab::ae);
   protected static final gap.m V = new gap.m(gab::ar);
   protected static final gap.m W = new gap.m(gab::af);
   protected static final gap.m X = new gap.m(gab::ag);
   protected static final gap.m Y = new gap.m(gab::ah);
   protected static final gap.m Z = new gap.m(gab::ai);
   protected static final gap.m aa = new gap.m(gab::aj);
   protected static final gap.m ab = new gap.m(gab::ak);
   protected static final gap.m ac = new gap.m(gab::al);
   protected static final gap.m ad = new gap.m(gab::am);
   protected static final gap.m ae = new gap.m(gab::an);
   protected static final gap.m af = new gap.m(gab::ao);
   protected static final gap.m ag = new gap.m(gab::ap);
   protected static final gap.m ah = new gap.m(gab::aq);
   protected static final gap.m ai = new gap.m(gab::as);
   protected static final gap.m aj = new gap.m(gab::at);
   protected static final gap.m ak = new gap.m(gab::au);
   protected static final gap.m al = new gap.m(gab::av);
   protected static final gap.m am = new gap.m(gab::U);
   protected static final gap.n an = new gap.n(glr.e, false, true);
   protected static final gap.n ao = new gap.n(glr.e, false, false);
   protected static final gap.e ap = new gap.e();
   protected static final gap.o aq = new gap.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gap.o ar = new gap.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gap.o as = new gap.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gap.g at = new gap.g(true);
   protected static final gap.g au = new gap.g(false);
   protected static final gap.l av = new gap.l(true);
   protected static final gap.l aw = new gap.l(false);
   protected static final gap.c ax = new gap.c(true);
   protected static final gap.c ay = new gap.c(false);
   protected static final gap.d az = new gap.d("always", 519);
   protected static final gap.d aA = new gap.d("==", 514);
   protected static final gap.d aB = new gap.d("<=", 515);
   protected static final gap.d aC = new gap.d(">", 516);
   protected static final gap.q aD = new gap.q(true, true);
   protected static final gap.q aE = new gap.q(true, false);
   protected static final gap.q aF = new gap.q(false, true);
   protected static final gap.f aG = new gap.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gap.f aH = new gap.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gap.f aI = new gap.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gap.k aJ = new gap.k("main_target", () -> {
   }, () -> {
   });
   protected static final gap.k aK = new gap.k("outline_target", () -> fby.Q().f.s().a(false), () -> fby.Q().h().a(false));
   protected static final gap.k aL = new gap.k("translucent_target", () -> {
      if (fby.O()) {
         fby.Q().f.t().a(false);
      }
   }, () -> {
      if (fby.O()) {
         fby.Q().h().a(false);
      }
   });
   protected static final gap.k aM = new gap.k("particles_target", () -> {
      if (fby.O()) {
         fby.Q().f.v().a(false);
      }
   }, () -> {
      if (fby.O()) {
         fby.Q().h().a(false);
      }
   });
   protected static final gap.k aN = new gap.k("weather_target", () -> {
      if (fby.O()) {
         fby.Q().f.w().a(false);
      }
   }, () -> {
      if (fby.O()) {
         fby.Q().h().a(false);
      }
   });
   protected static final gap.k aO = new gap.k("clouds_target", () -> {
      if (fby.O()) {
         fby.Q().f.x().a(false);
      }
   }, () -> {
      if (fby.O()) {
         fby.Q().h().a(false);
      }
   });
   protected static final gap.k aP = new gap.k("item_entity_target", () -> {
      if (fby.O()) {
         fby.Q().f.u().a(false);
      }
   }, () -> {
      if (fby.O()) {
         fby.Q().h().a(false);
      }
   });
   protected static final gap.h aQ = new gap.h(OptionalDouble.of(1.0));
   protected static final gap.b aR = new gap.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gap.b aS = new gap.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gap(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * fby.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gap {
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

   protected static class b extends gap {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gap.a {
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

   protected static class d extends gap {
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

   protected static class e extends gap {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ajv> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gap {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gap.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fby.Q().j.o().c();
            }
         }, () -> {
            if ($$0) {
               fby.Q().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gap {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fby.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gap.e {
      private final Optional<ajv> aT;

      i(ImmutableList<Triple<ajv, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ajv, Boolean, Boolean> $$2 = (Triple<ajv, Boolean, Boolean>)var2.next();
               glt $$3 = fby.Q().aa();
               $$3.b((ajv)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ajv)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ajv> c() {
         return this.aT;
      }

      public static gap.i.a d() {
         return new gap.i.a();
      }

      public static final class a {
         private final Builder<Triple<ajv, Boolean, Boolean>> a = new Builder();

         public gap.i.a a(ajv $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gap.i a() {
            return new gap.i(this.a.build());
         }
      }
   }

   protected static final class j extends gap.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gap {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gap.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fby.Q().j.p().a();
            }
         }, () -> {
            if ($$0) {
               fby.Q().j.p().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gap {
      private final Optional<Supplier<gaw>> aT;

      public m(Supplier<gaw> $$0) {
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

   protected static class n extends gap.e {
      private final Optional<ajv> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ajv $$0, boolean $$1, boolean $$2) {
         super(() -> {
            glt $$3 = fby.Q().aa();
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
      protected Optional<ajv> c() {
         return this.aT;
      }
   }

   protected static class o extends gap {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gap {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gap {
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
