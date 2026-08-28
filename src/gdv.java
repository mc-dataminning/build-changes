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

public abstract class gdv {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdv.p c = new gdv.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdv.p d = new gdv.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdv.p e = new gdv.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdv.p f = new gdv.p(
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
   protected static final gdv.p g = new gdv.p(
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
   protected static final gdv.p h = new gdv.p(
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
   protected static final gdv.m i = new gdv.m();
   protected static final gdv.m j = new gdv.m(gdh::u);
   protected static final gdv.m k = new gdv.m(gdh::o);
   protected static final gdv.m l = new gdv.m(gdh::q);
   protected static final gdv.m m = new gdv.m(gdh::r);
   protected static final gdv.m n = new gdv.m(gdh::v);
   protected static final gdv.m o = new gdv.m(gdh::p);
   protected static final gdv.m p = new gdv.m(gdh::w);
   protected static final gdv.m q = new gdv.m(gdh::x);
   protected static final gdv.m r = new gdv.m(gdh::y);
   protected static final gdv.m s = new gdv.m(gdh::z);
   protected static final gdv.m t = new gdv.m(gdh::A);
   protected static final gdv.m u = new gdv.m(gdh::B);
   protected static final gdv.m v = new gdv.m(gdh::C);
   protected static final gdv.m w = new gdv.m(gdh::D);
   protected static final gdv.m x = new gdv.m(gdh::E);
   protected static final gdv.m y = new gdv.m(gdh::F);
   protected static final gdv.m z = new gdv.m(gdh::G);
   protected static final gdv.m A = new gdv.m(gdh::H);
   protected static final gdv.m B = new gdv.m(gdh::I);
   protected static final gdv.m C = new gdv.m(gdh::J);
   protected static final gdv.m D = new gdv.m(gdh::K);
   protected static final gdv.m E = new gdv.m(gdh::L);
   protected static final gdv.m F = new gdv.m(gdh::M);
   protected static final gdv.m G = new gdv.m(gdh::N);
   protected static final gdv.m H = new gdv.m(gdh::O);
   protected static final gdv.m I = new gdv.m(gdh::P);
   protected static final gdv.m J = new gdv.m(gdh::Q);
   protected static final gdv.m K = new gdv.m(gdh::R);
   protected static final gdv.m L = new gdv.m(gdh::T);
   protected static final gdv.m M = new gdv.m(gdh::U);
   protected static final gdv.m N = new gdv.m(gdh::V);
   protected static final gdv.m O = new gdv.m(gdh::W);
   protected static final gdv.m P = new gdv.m(gdh::X);
   protected static final gdv.m Q = new gdv.m(gdh::Y);
   protected static final gdv.m R = new gdv.m(gdh::Z);
   protected static final gdv.m S = new gdv.m(gdh::aa);
   protected static final gdv.m T = new gdv.m(gdh::ab);
   protected static final gdv.m U = new gdv.m(gdh::ac);
   protected static final gdv.m V = new gdv.m(gdh::ap);
   protected static final gdv.m W = new gdv.m(gdh::ad);
   protected static final gdv.m X = new gdv.m(gdh::ae);
   protected static final gdv.m Y = new gdv.m(gdh::af);
   protected static final gdv.m Z = new gdv.m(gdh::ag);
   protected static final gdv.m aa = new gdv.m(gdh::ah);
   protected static final gdv.m ab = new gdv.m(gdh::ai);
   protected static final gdv.m ac = new gdv.m(gdh::aj);
   protected static final gdv.m ad = new gdv.m(gdh::ak);
   protected static final gdv.m ae = new gdv.m(gdh::al);
   protected static final gdv.m af = new gdv.m(gdh::am);
   protected static final gdv.m ag = new gdv.m(gdh::an);
   protected static final gdv.m ah = new gdv.m(gdh::ao);
   protected static final gdv.m ai = new gdv.m(gdh::aq);
   protected static final gdv.m aj = new gdv.m(gdh::ar);
   protected static final gdv.m ak = new gdv.m(gdh::as);
   protected static final gdv.m al = new gdv.m(gdh::at);
   protected static final gdv.m am = new gdv.m(gdh::S);
   protected static final gdv.n an = new gdv.n(goy.e, false, true);
   protected static final gdv.n ao = new gdv.n(goy.e, false, false);
   protected static final gdv.e ap = new gdv.e();
   protected static final gdv.o aq = new gdv.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdv.o ar = new gdv.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdv.o as = new gdv.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdv.g at = new gdv.g(true);
   protected static final gdv.g au = new gdv.g(false);
   protected static final gdv.l av = new gdv.l(true);
   protected static final gdv.l aw = new gdv.l(false);
   protected static final gdv.c ax = new gdv.c(true);
   protected static final gdv.c ay = new gdv.c(false);
   protected static final gdv.d az = new gdv.d("always", 519);
   protected static final gdv.d aA = new gdv.d("==", 514);
   protected static final gdv.d aB = new gdv.d("<=", 515);
   protected static final gdv.d aC = new gdv.d(">", 516);
   protected static final gdv.q aD = new gdv.q(true, true);
   protected static final gdv.q aE = new gdv.q(true, false);
   protected static final gdv.q aF = new gdv.q(false, true);
   protected static final gdv.f aG = new gdv.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdv.f aH = new gdv.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdv.f aI = new gdv.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdv.k aJ = new gdv.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdv.k aK = new gdv.k("outline_target", () -> fff.Q().f.s().a(false), () -> fff.Q().h().a(false));
   protected static final gdv.k aL = new gdv.k("translucent_target", () -> {
      if (fff.O()) {
         fff.Q().f.t().a(false);
      }
   }, () -> {
      if (fff.O()) {
         fff.Q().h().a(false);
      }
   });
   protected static final gdv.k aM = new gdv.k("particles_target", () -> {
      if (fff.O()) {
         fff.Q().f.v().a(false);
      }
   }, () -> {
      if (fff.O()) {
         fff.Q().h().a(false);
      }
   });
   protected static final gdv.k aN = new gdv.k("weather_target", () -> {
      if (fff.O()) {
         fff.Q().f.w().a(false);
      }
   }, () -> {
      if (fff.O()) {
         fff.Q().h().a(false);
      }
   });
   protected static final gdv.k aO = new gdv.k("clouds_target", () -> {
      if (fff.O()) {
         fff.Q().f.x().a(false);
      }
   }, () -> {
      if (fff.O()) {
         fff.Q().h().a(false);
      }
   });
   protected static final gdv.k aP = new gdv.k("item_entity_target", () -> {
      if (fff.O()) {
         fff.Q().f.u().a(false);
      }
   }, () -> {
      if (fff.O()) {
         fff.Q().h().a(false);
      }
   });
   protected static final gdv.h aQ = new gdv.h(OptionalDouble.of(1.0));
   protected static final gdv.b aR = new gdv.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdv.b aS = new gdv.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdv(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * fff.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdv {
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

   protected static class b extends gdv {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdv.a {
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

   protected static class d extends gdv {
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

   protected static class e extends gdv {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alf> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gdv {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdv.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fff.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fff.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdv {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fff.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdv.e {
      private final Optional<alf> aT;

      i(ImmutableList<Triple<alf, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alf, Boolean, Boolean> $$2 = (Triple<alf, Boolean, Boolean>)var2.next();
               gpa $$3 = fff.Q().aa();
               $$3.b((alf)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alf)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alf> c() {
         return this.aT;
      }

      public static gdv.i.a d() {
         return new gdv.i.a();
      }

      public static final class a {
         private final Builder<Triple<alf, Boolean, Boolean>> a = new Builder();

         public gdv.i.a a(alf $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdv.i a() {
            return new gdv.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdv.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdv {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdv.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fff.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fff.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdv {
      private final Optional<Supplier<gec>> aT;

      public m(Supplier<gec> $$0) {
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

   protected static class n extends gdv.e {
      private final Optional<alf> aT;
      private final boolean aU;
      private final boolean aV;

      public n(alf $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpa $$3 = fff.Q().aa();
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
      protected Optional<alf> c() {
         return this.aT;
      }
   }

   protected static class o extends gdv {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdv {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdv {
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
