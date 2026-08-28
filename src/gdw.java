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

public abstract class gdw {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdw.p c = new gdw.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdw.p d = new gdw.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdw.p e = new gdw.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdw.p f = new gdw.p(
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
   protected static final gdw.p g = new gdw.p(
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
   protected static final gdw.p h = new gdw.p(
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
   protected static final gdw.m i = new gdw.m();
   protected static final gdw.m j = new gdw.m(gdi::u);
   protected static final gdw.m k = new gdw.m(gdi::o);
   protected static final gdw.m l = new gdw.m(gdi::q);
   protected static final gdw.m m = new gdw.m(gdi::r);
   protected static final gdw.m n = new gdw.m(gdi::v);
   protected static final gdw.m o = new gdw.m(gdi::p);
   protected static final gdw.m p = new gdw.m(gdi::w);
   protected static final gdw.m q = new gdw.m(gdi::x);
   protected static final gdw.m r = new gdw.m(gdi::y);
   protected static final gdw.m s = new gdw.m(gdi::z);
   protected static final gdw.m t = new gdw.m(gdi::A);
   protected static final gdw.m u = new gdw.m(gdi::B);
   protected static final gdw.m v = new gdw.m(gdi::C);
   protected static final gdw.m w = new gdw.m(gdi::D);
   protected static final gdw.m x = new gdw.m(gdi::E);
   protected static final gdw.m y = new gdw.m(gdi::F);
   protected static final gdw.m z = new gdw.m(gdi::G);
   protected static final gdw.m A = new gdw.m(gdi::H);
   protected static final gdw.m B = new gdw.m(gdi::I);
   protected static final gdw.m C = new gdw.m(gdi::J);
   protected static final gdw.m D = new gdw.m(gdi::K);
   protected static final gdw.m E = new gdw.m(gdi::L);
   protected static final gdw.m F = new gdw.m(gdi::M);
   protected static final gdw.m G = new gdw.m(gdi::N);
   protected static final gdw.m H = new gdw.m(gdi::O);
   protected static final gdw.m I = new gdw.m(gdi::P);
   protected static final gdw.m J = new gdw.m(gdi::Q);
   protected static final gdw.m K = new gdw.m(gdi::R);
   protected static final gdw.m L = new gdw.m(gdi::T);
   protected static final gdw.m M = new gdw.m(gdi::U);
   protected static final gdw.m N = new gdw.m(gdi::V);
   protected static final gdw.m O = new gdw.m(gdi::W);
   protected static final gdw.m P = new gdw.m(gdi::X);
   protected static final gdw.m Q = new gdw.m(gdi::Y);
   protected static final gdw.m R = new gdw.m(gdi::Z);
   protected static final gdw.m S = new gdw.m(gdi::aa);
   protected static final gdw.m T = new gdw.m(gdi::ab);
   protected static final gdw.m U = new gdw.m(gdi::ac);
   protected static final gdw.m V = new gdw.m(gdi::ap);
   protected static final gdw.m W = new gdw.m(gdi::ad);
   protected static final gdw.m X = new gdw.m(gdi::ae);
   protected static final gdw.m Y = new gdw.m(gdi::af);
   protected static final gdw.m Z = new gdw.m(gdi::ag);
   protected static final gdw.m aa = new gdw.m(gdi::ah);
   protected static final gdw.m ab = new gdw.m(gdi::ai);
   protected static final gdw.m ac = new gdw.m(gdi::aj);
   protected static final gdw.m ad = new gdw.m(gdi::ak);
   protected static final gdw.m ae = new gdw.m(gdi::al);
   protected static final gdw.m af = new gdw.m(gdi::am);
   protected static final gdw.m ag = new gdw.m(gdi::an);
   protected static final gdw.m ah = new gdw.m(gdi::ao);
   protected static final gdw.m ai = new gdw.m(gdi::aq);
   protected static final gdw.m aj = new gdw.m(gdi::ar);
   protected static final gdw.m ak = new gdw.m(gdi::as);
   protected static final gdw.m al = new gdw.m(gdi::at);
   protected static final gdw.m am = new gdw.m(gdi::S);
   protected static final gdw.n an = new gdw.n(goz.e, false, true);
   protected static final gdw.n ao = new gdw.n(goz.e, false, false);
   protected static final gdw.e ap = new gdw.e();
   protected static final gdw.o aq = new gdw.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdw.o ar = new gdw.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdw.o as = new gdw.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdw.g at = new gdw.g(true);
   protected static final gdw.g au = new gdw.g(false);
   protected static final gdw.l av = new gdw.l(true);
   protected static final gdw.l aw = new gdw.l(false);
   protected static final gdw.c ax = new gdw.c(true);
   protected static final gdw.c ay = new gdw.c(false);
   protected static final gdw.d az = new gdw.d("always", 519);
   protected static final gdw.d aA = new gdw.d("==", 514);
   protected static final gdw.d aB = new gdw.d("<=", 515);
   protected static final gdw.d aC = new gdw.d(">", 516);
   protected static final gdw.q aD = new gdw.q(true, true);
   protected static final gdw.q aE = new gdw.q(true, false);
   protected static final gdw.q aF = new gdw.q(false, true);
   protected static final gdw.f aG = new gdw.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdw.f aH = new gdw.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdw.f aI = new gdw.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdw.k aJ = new gdw.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdw.k aK = new gdw.k("outline_target", () -> ffg.Q().f.s().a(false), () -> ffg.Q().h().a(false));
   protected static final gdw.k aL = new gdw.k("translucent_target", () -> {
      if (ffg.O()) {
         ffg.Q().f.t().a(false);
      }
   }, () -> {
      if (ffg.O()) {
         ffg.Q().h().a(false);
      }
   });
   protected static final gdw.k aM = new gdw.k("particles_target", () -> {
      if (ffg.O()) {
         ffg.Q().f.v().a(false);
      }
   }, () -> {
      if (ffg.O()) {
         ffg.Q().h().a(false);
      }
   });
   protected static final gdw.k aN = new gdw.k("weather_target", () -> {
      if (ffg.O()) {
         ffg.Q().f.w().a(false);
      }
   }, () -> {
      if (ffg.O()) {
         ffg.Q().h().a(false);
      }
   });
   protected static final gdw.k aO = new gdw.k("clouds_target", () -> {
      if (ffg.O()) {
         ffg.Q().f.x().a(false);
      }
   }, () -> {
      if (ffg.O()) {
         ffg.Q().h().a(false);
      }
   });
   protected static final gdw.k aP = new gdw.k("item_entity_target", () -> {
      if (ffg.O()) {
         ffg.Q().f.u().a(false);
      }
   }, () -> {
      if (ffg.O()) {
         ffg.Q().h().a(false);
      }
   });
   protected static final gdw.h aQ = new gdw.h(OptionalDouble.of(1.0));
   protected static final gdw.b aR = new gdw.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdw.b aS = new gdw.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdw(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffg.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdw {
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

   protected static class b extends gdw {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdw.a {
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

   protected static class d extends gdw {
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

   protected static class e extends gdw {
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

   protected static class f extends gdw {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdw.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffg.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffg.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdw {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffg.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdw.e {
      private final Optional<alf> aT;

      i(ImmutableList<Triple<alf, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alf, Boolean, Boolean> $$2 = (Triple<alf, Boolean, Boolean>)var2.next();
               gpb $$3 = ffg.Q().aa();
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

      public static gdw.i.a d() {
         return new gdw.i.a();
      }

      public static final class a {
         private final Builder<Triple<alf, Boolean, Boolean>> a = new Builder();

         public gdw.i.a a(alf $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdw.i a() {
            return new gdw.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdw.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdw {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdw.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffg.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffg.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdw {
      private final Optional<Supplier<ged>> aT;

      public m(Supplier<ged> $$0) {
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

   protected static class n extends gdw.e {
      private final Optional<alf> aT;
      private final boolean aU;
      private final boolean aV;

      public n(alf $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpb $$3 = ffg.Q().aa();
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

   protected static class o extends gdw {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdw {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdw {
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
