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

public abstract class gfa {
   private static final float aQ = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aR;
   private final Runnable aS;
   protected static final gfa.p c = new gfa.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gfa.p d = new gfa.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfa.p e = new gfa.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfa.p f = new gfa.p(
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
   protected static final gfa.p g = new gfa.p(
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
   protected static final gfa.p h = new gfa.p(
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
   protected static final gfa.m i = new gfa.m();
   protected static final gfa.m j = new gfa.m(gem::t);
   protected static final gfa.m k = new gfa.m(gem::o);
   protected static final gfa.m l = new gfa.m(gem::q);
   protected static final gfa.m m = new gfa.m(gem::u);
   protected static final gfa.m n = new gfa.m(gem::p);
   protected static final gfa.m o = new gfa.m(gem::v);
   protected static final gfa.m p = new gfa.m(gem::w);
   protected static final gfa.m q = new gfa.m(gem::x);
   protected static final gfa.m r = new gfa.m(gem::y);
   protected static final gfa.m s = new gfa.m(gem::z);
   protected static final gfa.m t = new gfa.m(gem::A);
   protected static final gfa.m u = new gfa.m(gem::B);
   protected static final gfa.m v = new gfa.m(gem::C);
   protected static final gfa.m w = new gfa.m(gem::D);
   protected static final gfa.m x = new gfa.m(gem::E);
   protected static final gfa.m y = new gfa.m(gem::F);
   protected static final gfa.m z = new gfa.m(gem::G);
   protected static final gfa.m A = new gfa.m(gem::H);
   protected static final gfa.m B = new gfa.m(gem::I);
   protected static final gfa.m C = new gfa.m(gem::J);
   protected static final gfa.m D = new gfa.m(gem::K);
   protected static final gfa.m E = new gfa.m(gem::L);
   protected static final gfa.m F = new gfa.m(gem::M);
   protected static final gfa.m G = new gfa.m(gem::N);
   protected static final gfa.m H = new gfa.m(gem::O);
   protected static final gfa.m I = new gfa.m(gem::P);
   protected static final gfa.m J = new gfa.m(gem::Q);
   protected static final gfa.m K = new gfa.m(gem::S);
   protected static final gfa.m L = new gfa.m(gem::T);
   protected static final gfa.m M = new gfa.m(gem::U);
   protected static final gfa.m N = new gfa.m(gem::W);
   protected static final gfa.m O = new gfa.m(gem::X);
   protected static final gfa.m P = new gfa.m(gem::Y);
   protected static final gfa.m Q = new gfa.m(gem::aa);
   protected static final gfa.m R = new gfa.m(gem::ab);
   protected static final gfa.m S = new gfa.m(gem::ao);
   protected static final gfa.m T = new gfa.m(gem::ac);
   protected static final gfa.m U = new gfa.m(gem::ad);
   protected static final gfa.m V = new gfa.m(gem::ae);
   protected static final gfa.m W = new gfa.m(gem::af);
   protected static final gfa.m X = new gfa.m(gem::ag);
   protected static final gfa.m Y = new gfa.m(gem::ah);
   protected static final gfa.m Z = new gfa.m(gem::ai);
   protected static final gfa.m aa = new gfa.m(gem::aj);
   protected static final gfa.m ab = new gfa.m(gem::ak);
   protected static final gfa.m ac = new gfa.m(gem::al);
   protected static final gfa.m ad = new gfa.m(gem::am);
   protected static final gfa.m ae = new gfa.m(gem::an);
   protected static final gfa.m af = new gfa.m(gem::ap);
   protected static final gfa.m ag = new gfa.m(gem::aq);
   protected static final gfa.m ah = new gfa.m(gem::ar);
   protected static final gfa.m ai = new gfa.m(gem::as);
   protected static final gfa.m aj = new gfa.m(gem::R);
   protected static final gfa.n ak = new gfa.n(gqe.e, false, true);
   protected static final gfa.n al = new gfa.n(gqe.e, false, false);
   protected static final gfa.e am = new gfa.e();
   protected static final gfa.o an = new gfa.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gfa.o ao = new gfa.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfa.o ap = new gfa.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfa.g aq = new gfa.g(true);
   protected static final gfa.g ar = new gfa.g(false);
   protected static final gfa.l as = new gfa.l(true);
   protected static final gfa.l at = new gfa.l(false);
   protected static final gfa.c au = new gfa.c(true);
   protected static final gfa.c av = new gfa.c(false);
   protected static final gfa.d aw = new gfa.d("always", 519);
   protected static final gfa.d ax = new gfa.d("==", 514);
   protected static final gfa.d ay = new gfa.d("<=", 515);
   protected static final gfa.d az = new gfa.d(">", 516);
   protected static final gfa.q aA = new gfa.q(true, true);
   protected static final gfa.q aB = new gfa.q(true, false);
   protected static final gfa.q aC = new gfa.q(false, true);
   protected static final gfa.f aD = new gfa.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gfa.f aE = new gfa.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gfa.f aF = new gfa.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gfa.k aG = new gfa.k("main_target", () -> {
   }, () -> {
   });
   protected static final gfa.k aH = new gfa.k("outline_target", () -> fgi.Q().f.s().a(false), () -> fgi.Q().h().a(false));
   protected static final gfa.k aI = new gfa.k("translucent_target", () -> {
      if (fgi.O()) {
         fgi.Q().f.t().a(false);
      }
   }, () -> {
      if (fgi.O()) {
         fgi.Q().h().a(false);
      }
   });
   protected static final gfa.k aJ = new gfa.k("particles_target", () -> {
      if (fgi.O()) {
         fgi.Q().f.v().a(false);
      }
   }, () -> {
      if (fgi.O()) {
         fgi.Q().h().a(false);
      }
   });
   protected static final gfa.k aK = new gfa.k("weather_target", () -> {
      if (fgi.O()) {
         fgi.Q().f.w().a(false);
      }
   }, () -> {
      if (fgi.O()) {
         fgi.Q().h().a(false);
      }
   });
   protected static final gfa.k aL = new gfa.k("clouds_target", () -> {
      if (fgi.O()) {
         fgi.Q().f.x().a(false);
      }
   }, () -> {
      if (fgi.O()) {
         fgi.Q().h().a(false);
      }
   });
   protected static final gfa.k aM = new gfa.k("item_entity_target", () -> {
      if (fgi.O()) {
         fgi.Q().f.u().a(false);
      }
   }, () -> {
      if (fgi.O()) {
         fgi.Q().h().a(false);
      }
   });
   protected static final gfa.h aN = new gfa.h(OptionalDouble.of(1.0));
   protected static final gfa.b aO = new gfa.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gfa.b aP = new gfa.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gfa(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.c() * fgi.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gfa {
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

   protected static class b extends gfa {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gfa.a {
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

   protected static class d extends gfa {
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

   protected static class e extends gfa {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akq> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gfa {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gfa.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fgi.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fgi.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gfa {
      private final OptionalDouble aQ;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fgi.Q().aM().l() / 1920.0F * 2.5F));
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

   protected static class i extends gfa.e {
      private final Optional<akq> aQ;

      i(ImmutableList<Triple<akq, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akq, Boolean, Boolean> $$2 = (Triple<akq, Boolean, Boolean>)var2.next();
               gqg $$3 = fgi.Q().aa();
               $$3.b((akq)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (akq)$$2.getLeft());
            }
         }, () -> {
         });
         this.aQ = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<akq> c() {
         return this.aQ;
      }

      public static gfa.i.a d() {
         return new gfa.i.a();
      }

      public static final class a {
         private final Builder<Triple<akq, Boolean, Boolean>> a = new Builder();

         public gfa.i.a a(akq $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gfa.i a() {
            return new gfa.i(this.a.build());
         }
      }
   }

   protected static final class j extends gfa.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gfa {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gfa.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fgi.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fgi.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gfa {
      private final Optional<Supplier<gfh>> aQ;

      public m(Supplier<gfh> $$0) {
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

   protected static class n extends gfa.e {
      private final Optional<akq> aQ;
      private final boolean aR;
      private final boolean aS;

      public n(akq $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gqg $$3 = fgi.Q().aa();
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
      protected Optional<akq> c() {
         return this.aQ;
      }
   }

   protected static class o extends gfa {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gfa {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gfa {
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
