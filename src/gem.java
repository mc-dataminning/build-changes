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

public abstract class gem {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gem.p c = new gem.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gem.p d = new gem.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gem.p e = new gem.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gem.p f = new gem.p(
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
   protected static final gem.p g = new gem.p(
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
   protected static final gem.p h = new gem.p(
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
   protected static final gem.m i = new gem.m();
   protected static final gem.m j = new gem.m(gdy::u);
   protected static final gem.m k = new gem.m(gdy::o);
   protected static final gem.m l = new gem.m(gdy::q);
   protected static final gem.m m = new gem.m(gdy::r);
   protected static final gem.m n = new gem.m(gdy::v);
   protected static final gem.m o = new gem.m(gdy::p);
   protected static final gem.m p = new gem.m(gdy::w);
   protected static final gem.m q = new gem.m(gdy::x);
   protected static final gem.m r = new gem.m(gdy::y);
   protected static final gem.m s = new gem.m(gdy::z);
   protected static final gem.m t = new gem.m(gdy::A);
   protected static final gem.m u = new gem.m(gdy::B);
   protected static final gem.m v = new gem.m(gdy::C);
   protected static final gem.m w = new gem.m(gdy::D);
   protected static final gem.m x = new gem.m(gdy::E);
   protected static final gem.m y = new gem.m(gdy::F);
   protected static final gem.m z = new gem.m(gdy::G);
   protected static final gem.m A = new gem.m(gdy::H);
   protected static final gem.m B = new gem.m(gdy::I);
   protected static final gem.m C = new gem.m(gdy::J);
   protected static final gem.m D = new gem.m(gdy::K);
   protected static final gem.m E = new gem.m(gdy::L);
   protected static final gem.m F = new gem.m(gdy::M);
   protected static final gem.m G = new gem.m(gdy::N);
   protected static final gem.m H = new gem.m(gdy::O);
   protected static final gem.m I = new gem.m(gdy::P);
   protected static final gem.m J = new gem.m(gdy::Q);
   protected static final gem.m K = new gem.m(gdy::R);
   protected static final gem.m L = new gem.m(gdy::T);
   protected static final gem.m M = new gem.m(gdy::U);
   protected static final gem.m N = new gem.m(gdy::V);
   protected static final gem.m O = new gem.m(gdy::W);
   protected static final gem.m P = new gem.m(gdy::X);
   protected static final gem.m Q = new gem.m(gdy::Y);
   protected static final gem.m R = new gem.m(gdy::Z);
   protected static final gem.m S = new gem.m(gdy::aa);
   protected static final gem.m T = new gem.m(gdy::ab);
   protected static final gem.m U = new gem.m(gdy::ac);
   protected static final gem.m V = new gem.m(gdy::ap);
   protected static final gem.m W = new gem.m(gdy::ad);
   protected static final gem.m X = new gem.m(gdy::ae);
   protected static final gem.m Y = new gem.m(gdy::af);
   protected static final gem.m Z = new gem.m(gdy::ag);
   protected static final gem.m aa = new gem.m(gdy::ah);
   protected static final gem.m ab = new gem.m(gdy::ai);
   protected static final gem.m ac = new gem.m(gdy::aj);
   protected static final gem.m ad = new gem.m(gdy::ak);
   protected static final gem.m ae = new gem.m(gdy::al);
   protected static final gem.m af = new gem.m(gdy::am);
   protected static final gem.m ag = new gem.m(gdy::an);
   protected static final gem.m ah = new gem.m(gdy::ao);
   protected static final gem.m ai = new gem.m(gdy::aq);
   protected static final gem.m aj = new gem.m(gdy::ar);
   protected static final gem.m ak = new gem.m(gdy::as);
   protected static final gem.m al = new gem.m(gdy::at);
   protected static final gem.m am = new gem.m(gdy::S);
   protected static final gem.n an = new gem.n(gpp.e, false, true);
   protected static final gem.n ao = new gem.n(gpp.e, false, false);
   protected static final gem.e ap = new gem.e();
   protected static final gem.o aq = new gem.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gem.o ar = new gem.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gem.o as = new gem.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gem.g at = new gem.g(true);
   protected static final gem.g au = new gem.g(false);
   protected static final gem.l av = new gem.l(true);
   protected static final gem.l aw = new gem.l(false);
   protected static final gem.c ax = new gem.c(true);
   protected static final gem.c ay = new gem.c(false);
   protected static final gem.d az = new gem.d("always", 519);
   protected static final gem.d aA = new gem.d("==", 514);
   protected static final gem.d aB = new gem.d("<=", 515);
   protected static final gem.d aC = new gem.d(">", 516);
   protected static final gem.q aD = new gem.q(true, true);
   protected static final gem.q aE = new gem.q(true, false);
   protected static final gem.q aF = new gem.q(false, true);
   protected static final gem.f aG = new gem.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gem.f aH = new gem.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gem.f aI = new gem.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gem.k aJ = new gem.k("main_target", () -> {
   }, () -> {
   });
   protected static final gem.k aK = new gem.k("outline_target", () -> ffw.Q().f.s().a(false), () -> ffw.Q().h().a(false));
   protected static final gem.k aL = new gem.k("translucent_target", () -> {
      if (ffw.O()) {
         ffw.Q().f.t().a(false);
      }
   }, () -> {
      if (ffw.O()) {
         ffw.Q().h().a(false);
      }
   });
   protected static final gem.k aM = new gem.k("particles_target", () -> {
      if (ffw.O()) {
         ffw.Q().f.v().a(false);
      }
   }, () -> {
      if (ffw.O()) {
         ffw.Q().h().a(false);
      }
   });
   protected static final gem.k aN = new gem.k("weather_target", () -> {
      if (ffw.O()) {
         ffw.Q().f.w().a(false);
      }
   }, () -> {
      if (ffw.O()) {
         ffw.Q().h().a(false);
      }
   });
   protected static final gem.k aO = new gem.k("clouds_target", () -> {
      if (ffw.O()) {
         ffw.Q().f.x().a(false);
      }
   }, () -> {
      if (ffw.O()) {
         ffw.Q().h().a(false);
      }
   });
   protected static final gem.k aP = new gem.k("item_entity_target", () -> {
      if (ffw.O()) {
         ffw.Q().f.u().a(false);
      }
   }, () -> {
      if (ffw.O()) {
         ffw.Q().h().a(false);
      }
   });
   protected static final gem.h aQ = new gem.h(OptionalDouble.of(1.0));
   protected static final gem.b aR = new gem.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gem.b aS = new gem.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gem(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffw.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gem {
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

   protected static class b extends gem {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gem.a {
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

   protected static class d extends gem {
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

   protected static class e extends gem {
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

   protected static class f extends gem {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gem.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffw.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffw.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gem {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffw.Q().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends gem.e {
      private final Optional<akk> aT;

      i(ImmutableList<Triple<akk, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akk, Boolean, Boolean> $$2 = (Triple<akk, Boolean, Boolean>)var2.next();
               gpr $$3 = ffw.Q().aa();
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

      public static gem.i.a d() {
         return new gem.i.a();
      }

      public static final class a {
         private final Builder<Triple<akk, Boolean, Boolean>> a = new Builder();

         public gem.i.a a(akk $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gem.i a() {
            return new gem.i(this.a.build());
         }
      }
   }

   protected static final class j extends gem.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gem {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gem.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffw.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffw.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gem {
      private final Optional<Supplier<get>> aT;

      public m(Supplier<get> $$0) {
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

   protected static class n extends gem.e {
      private final Optional<akk> aT;
      private final boolean aU;
      private final boolean aV;

      public n(akk $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gpr $$3 = ffw.Q().aa();
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

   protected static class o extends gem {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gem {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gem {
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
