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

public abstract class gfe {
   private static final float aQ = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aR;
   private final Runnable aS;
   protected static final gfe.p c = new gfe.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gfe.p d = new gfe.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfe.p e = new gfe.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gfe.p f = new gfe.p(
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
   protected static final gfe.p g = new gfe.p(
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
   protected static final gfe.p h = new gfe.p(
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
   protected static final gfe.m i = new gfe.m();
   protected static final gfe.m j = new gfe.m(geq::t);
   protected static final gfe.m k = new gfe.m(geq::o);
   protected static final gfe.m l = new gfe.m(geq::q);
   protected static final gfe.m m = new gfe.m(geq::u);
   protected static final gfe.m n = new gfe.m(geq::p);
   protected static final gfe.m o = new gfe.m(geq::v);
   protected static final gfe.m p = new gfe.m(geq::w);
   protected static final gfe.m q = new gfe.m(geq::x);
   protected static final gfe.m r = new gfe.m(geq::y);
   protected static final gfe.m s = new gfe.m(geq::z);
   protected static final gfe.m t = new gfe.m(geq::A);
   protected static final gfe.m u = new gfe.m(geq::B);
   protected static final gfe.m v = new gfe.m(geq::C);
   protected static final gfe.m w = new gfe.m(geq::D);
   protected static final gfe.m x = new gfe.m(geq::E);
   protected static final gfe.m y = new gfe.m(geq::F);
   protected static final gfe.m z = new gfe.m(geq::G);
   protected static final gfe.m A = new gfe.m(geq::H);
   protected static final gfe.m B = new gfe.m(geq::I);
   protected static final gfe.m C = new gfe.m(geq::J);
   protected static final gfe.m D = new gfe.m(geq::K);
   protected static final gfe.m E = new gfe.m(geq::L);
   protected static final gfe.m F = new gfe.m(geq::M);
   protected static final gfe.m G = new gfe.m(geq::N);
   protected static final gfe.m H = new gfe.m(geq::O);
   protected static final gfe.m I = new gfe.m(geq::P);
   protected static final gfe.m J = new gfe.m(geq::Q);
   protected static final gfe.m K = new gfe.m(geq::S);
   protected static final gfe.m L = new gfe.m(geq::T);
   protected static final gfe.m M = new gfe.m(geq::U);
   protected static final gfe.m N = new gfe.m(geq::W);
   protected static final gfe.m O = new gfe.m(geq::X);
   protected static final gfe.m P = new gfe.m(geq::Y);
   protected static final gfe.m Q = new gfe.m(geq::aa);
   protected static final gfe.m R = new gfe.m(geq::ab);
   protected static final gfe.m S = new gfe.m(geq::ao);
   protected static final gfe.m T = new gfe.m(geq::ac);
   protected static final gfe.m U = new gfe.m(geq::ad);
   protected static final gfe.m V = new gfe.m(geq::ae);
   protected static final gfe.m W = new gfe.m(geq::af);
   protected static final gfe.m X = new gfe.m(geq::ag);
   protected static final gfe.m Y = new gfe.m(geq::ah);
   protected static final gfe.m Z = new gfe.m(geq::ai);
   protected static final gfe.m aa = new gfe.m(geq::aj);
   protected static final gfe.m ab = new gfe.m(geq::ak);
   protected static final gfe.m ac = new gfe.m(geq::al);
   protected static final gfe.m ad = new gfe.m(geq::am);
   protected static final gfe.m ae = new gfe.m(geq::an);
   protected static final gfe.m af = new gfe.m(geq::ap);
   protected static final gfe.m ag = new gfe.m(geq::aq);
   protected static final gfe.m ah = new gfe.m(geq::ar);
   protected static final gfe.m ai = new gfe.m(geq::as);
   protected static final gfe.m aj = new gfe.m(geq::R);
   protected static final gfe.n ak = new gfe.n(gqi.e, false, true);
   protected static final gfe.n al = new gfe.n(gqi.e, false, false);
   protected static final gfe.e am = new gfe.e();
   protected static final gfe.o an = new gfe.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gfe.o ao = new gfe.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfe.o ap = new gfe.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gfe.g aq = new gfe.g(true);
   protected static final gfe.g ar = new gfe.g(false);
   protected static final gfe.l as = new gfe.l(true);
   protected static final gfe.l at = new gfe.l(false);
   protected static final gfe.c au = new gfe.c(true);
   protected static final gfe.c av = new gfe.c(false);
   protected static final gfe.d aw = new gfe.d("always", 519);
   protected static final gfe.d ax = new gfe.d("==", 514);
   protected static final gfe.d ay = new gfe.d("<=", 515);
   protected static final gfe.d az = new gfe.d(">", 516);
   protected static final gfe.q aA = new gfe.q(true, true);
   protected static final gfe.q aB = new gfe.q(true, false);
   protected static final gfe.q aC = new gfe.q(false, true);
   protected static final gfe.f aD = new gfe.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gfe.f aE = new gfe.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gfe.f aF = new gfe.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gfe.k aG = new gfe.k("main_target", () -> {
   }, () -> {
   });
   protected static final gfe.k aH = new gfe.k("outline_target", () -> fgm.Q().f.s().a(false), () -> fgm.Q().h().a(false));
   protected static final gfe.k aI = new gfe.k("translucent_target", () -> {
      if (fgm.O()) {
         fgm.Q().f.t().a(false);
      }
   }, () -> {
      if (fgm.O()) {
         fgm.Q().h().a(false);
      }
   });
   protected static final gfe.k aJ = new gfe.k("particles_target", () -> {
      if (fgm.O()) {
         fgm.Q().f.v().a(false);
      }
   }, () -> {
      if (fgm.O()) {
         fgm.Q().h().a(false);
      }
   });
   protected static final gfe.k aK = new gfe.k("weather_target", () -> {
      if (fgm.O()) {
         fgm.Q().f.w().a(false);
      }
   }, () -> {
      if (fgm.O()) {
         fgm.Q().h().a(false);
      }
   });
   protected static final gfe.k aL = new gfe.k("clouds_target", () -> {
      if (fgm.O()) {
         fgm.Q().f.x().a(false);
      }
   }, () -> {
      if (fgm.O()) {
         fgm.Q().h().a(false);
      }
   });
   protected static final gfe.k aM = new gfe.k("item_entity_target", () -> {
      if (fgm.O()) {
         fgm.Q().f.u().a(false);
      }
   }, () -> {
      if (fgm.O()) {
         fgm.Q().h().a(false);
      }
   });
   protected static final gfe.h aN = new gfe.h(OptionalDouble.of(1.0));
   protected static final gfe.b aO = new gfe.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gfe.b aP = new gfe.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gfe(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.c() * fgm.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gfe {
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

   protected static class b extends gfe {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gfe.a {
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

   protected static class d extends gfe {
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

   protected static class e extends gfe {
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

   protected static class f extends gfe {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gfe.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fgm.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               fgm.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gfe {
      private final OptionalDouble aQ;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fgm.Q().aM().l() / 1920.0F * 2.5F));
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

   protected static class i extends gfe.e {
      private final Optional<akr> aQ;

      i(ImmutableList<Triple<akr, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<akr, Boolean, Boolean> $$2 = (Triple<akr, Boolean, Boolean>)var2.next();
               gqk $$3 = fgm.Q().aa();
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

      public static gfe.i.a d() {
         return new gfe.i.a();
      }

      public static final class a {
         private final Builder<Triple<akr, Boolean, Boolean>> a = new Builder();

         public gfe.i.a a(akr $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gfe.i a() {
            return new gfe.i(this.a.build());
         }
      }
   }

   protected static final class j extends gfe.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gfe {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gfe.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fgm.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fgm.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gfe {
      private final Optional<Supplier<gfl>> aQ;

      public m(Supplier<gfl> $$0) {
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

   protected static class n extends gfe.e {
      private final Optional<akr> aQ;
      private final boolean aR;
      private final boolean aS;

      public n(akr $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gqk $$3 = fgm.Q().aa();
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

   protected static class o extends gfe {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gfe {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gfe {
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
