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

public abstract class gdt {
   private static final float aT = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aU;
   private final Runnable aV;
   protected static final gdt.p c = new gdt.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gdt.p d = new gdt.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdt.p e = new gdt.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gdt.p f = new gdt.p(
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
   protected static final gdt.p g = new gdt.p(
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
   protected static final gdt.p h = new gdt.p(
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
   protected static final gdt.m i = new gdt.m();
   protected static final gdt.m j = new gdt.m(gdf::u);
   protected static final gdt.m k = new gdt.m(gdf::o);
   protected static final gdt.m l = new gdt.m(gdf::q);
   protected static final gdt.m m = new gdt.m(gdf::r);
   protected static final gdt.m n = new gdt.m(gdf::v);
   protected static final gdt.m o = new gdt.m(gdf::p);
   protected static final gdt.m p = new gdt.m(gdf::w);
   protected static final gdt.m q = new gdt.m(gdf::x);
   protected static final gdt.m r = new gdt.m(gdf::y);
   protected static final gdt.m s = new gdt.m(gdf::z);
   protected static final gdt.m t = new gdt.m(gdf::A);
   protected static final gdt.m u = new gdt.m(gdf::B);
   protected static final gdt.m v = new gdt.m(gdf::C);
   protected static final gdt.m w = new gdt.m(gdf::D);
   protected static final gdt.m x = new gdt.m(gdf::E);
   protected static final gdt.m y = new gdt.m(gdf::F);
   protected static final gdt.m z = new gdt.m(gdf::G);
   protected static final gdt.m A = new gdt.m(gdf::H);
   protected static final gdt.m B = new gdt.m(gdf::I);
   protected static final gdt.m C = new gdt.m(gdf::J);
   protected static final gdt.m D = new gdt.m(gdf::K);
   protected static final gdt.m E = new gdt.m(gdf::L);
   protected static final gdt.m F = new gdt.m(gdf::M);
   protected static final gdt.m G = new gdt.m(gdf::N);
   protected static final gdt.m H = new gdt.m(gdf::O);
   protected static final gdt.m I = new gdt.m(gdf::P);
   protected static final gdt.m J = new gdt.m(gdf::Q);
   protected static final gdt.m K = new gdt.m(gdf::R);
   protected static final gdt.m L = new gdt.m(gdf::T);
   protected static final gdt.m M = new gdt.m(gdf::U);
   protected static final gdt.m N = new gdt.m(gdf::V);
   protected static final gdt.m O = new gdt.m(gdf::W);
   protected static final gdt.m P = new gdt.m(gdf::X);
   protected static final gdt.m Q = new gdt.m(gdf::Y);
   protected static final gdt.m R = new gdt.m(gdf::Z);
   protected static final gdt.m S = new gdt.m(gdf::aa);
   protected static final gdt.m T = new gdt.m(gdf::ab);
   protected static final gdt.m U = new gdt.m(gdf::ac);
   protected static final gdt.m V = new gdt.m(gdf::ap);
   protected static final gdt.m W = new gdt.m(gdf::ad);
   protected static final gdt.m X = new gdt.m(gdf::ae);
   protected static final gdt.m Y = new gdt.m(gdf::af);
   protected static final gdt.m Z = new gdt.m(gdf::ag);
   protected static final gdt.m aa = new gdt.m(gdf::ah);
   protected static final gdt.m ab = new gdt.m(gdf::ai);
   protected static final gdt.m ac = new gdt.m(gdf::aj);
   protected static final gdt.m ad = new gdt.m(gdf::ak);
   protected static final gdt.m ae = new gdt.m(gdf::al);
   protected static final gdt.m af = new gdt.m(gdf::am);
   protected static final gdt.m ag = new gdt.m(gdf::an);
   protected static final gdt.m ah = new gdt.m(gdf::ao);
   protected static final gdt.m ai = new gdt.m(gdf::aq);
   protected static final gdt.m aj = new gdt.m(gdf::ar);
   protected static final gdt.m ak = new gdt.m(gdf::as);
   protected static final gdt.m al = new gdt.m(gdf::at);
   protected static final gdt.m am = new gdt.m(gdf::S);
   protected static final gdt.n an = new gdt.n(gow.e, false, true);
   protected static final gdt.n ao = new gdt.n(gow.e, false, false);
   protected static final gdt.e ap = new gdt.e();
   protected static final gdt.o aq = new gdt.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gdt.o ar = new gdt.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdt.o as = new gdt.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gdt.g at = new gdt.g(true);
   protected static final gdt.g au = new gdt.g(false);
   protected static final gdt.l av = new gdt.l(true);
   protected static final gdt.l aw = new gdt.l(false);
   protected static final gdt.c ax = new gdt.c(true);
   protected static final gdt.c ay = new gdt.c(false);
   protected static final gdt.d az = new gdt.d("always", 519);
   protected static final gdt.d aA = new gdt.d("==", 514);
   protected static final gdt.d aB = new gdt.d("<=", 515);
   protected static final gdt.d aC = new gdt.d(">", 516);
   protected static final gdt.q aD = new gdt.q(true, true);
   protected static final gdt.q aE = new gdt.q(true, false);
   protected static final gdt.q aF = new gdt.q(false, true);
   protected static final gdt.f aG = new gdt.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gdt.f aH = new gdt.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gdt.f aI = new gdt.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final gdt.k aJ = new gdt.k("main_target", () -> {
   }, () -> {
   });
   protected static final gdt.k aK = new gdt.k("outline_target", () -> ffd.Q().f.s().a(false), () -> ffd.Q().h().a(false));
   protected static final gdt.k aL = new gdt.k("translucent_target", () -> {
      if (ffd.O()) {
         ffd.Q().f.t().a(false);
      }
   }, () -> {
      if (ffd.O()) {
         ffd.Q().h().a(false);
      }
   });
   protected static final gdt.k aM = new gdt.k("particles_target", () -> {
      if (ffd.O()) {
         ffd.Q().f.v().a(false);
      }
   }, () -> {
      if (ffd.O()) {
         ffd.Q().h().a(false);
      }
   });
   protected static final gdt.k aN = new gdt.k("weather_target", () -> {
      if (ffd.O()) {
         ffd.Q().f.w().a(false);
      }
   }, () -> {
      if (ffd.O()) {
         ffd.Q().h().a(false);
      }
   });
   protected static final gdt.k aO = new gdt.k("clouds_target", () -> {
      if (ffd.O()) {
         ffd.Q().f.x().a(false);
      }
   }, () -> {
      if (ffd.O()) {
         ffd.Q().h().a(false);
      }
   });
   protected static final gdt.k aP = new gdt.k("item_entity_target", () -> {
      if (ffd.O()) {
         ffd.Q().f.u().a(false);
      }
   }, () -> {
      if (ffd.O()) {
         ffd.Q().h().a(false);
      }
   });
   protected static final gdt.h aQ = new gdt.h(OptionalDouble.of(1.0));
   protected static final gdt.b aR = new gdt.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gdt.b aS = new gdt.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gdt(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.c() * ffd.Q().m.am().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gdt {
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

   protected static class b extends gdt {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gdt.a {
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

   protected static class d extends gdt {
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

   protected static class e extends gdt {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ale> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gdt {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gdt.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ffd.Q().j.m().c();
            }
         }, () -> {
            if ($$0) {
               ffd.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gdt {
      private final OptionalDouble aT;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ffd.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gdt.e {
      private final Optional<ale> aT;

      i(ImmutableList<Triple<ale, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ale, Boolean, Boolean> $$2 = (Triple<ale, Boolean, Boolean>)var2.next();
               goy $$3 = ffd.Q().aa();
               $$3.b((ale)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ale)$$2.getLeft());
            }
         }, () -> {
         });
         this.aT = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ale> c() {
         return this.aT;
      }

      public static gdt.i.a d() {
         return new gdt.i.a();
      }

      public static final class a {
         private final Builder<Triple<ale, Boolean, Boolean>> a = new Builder();

         public gdt.i.a a(ale $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gdt.i a() {
            return new gdt.i(this.a.build());
         }
      }
   }

   protected static final class j extends gdt.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gdt {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gdt.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ffd.Q().j.n().a();
            }
         }, () -> {
            if ($$0) {
               ffd.Q().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gdt {
      private final Optional<Supplier<gea>> aT;

      public m(Supplier<gea> $$0) {
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

   protected static class n extends gdt.e {
      private final Optional<ale> aT;
      private final boolean aU;
      private final boolean aV;

      public n(ale $$0, boolean $$1, boolean $$2) {
         super(() -> {
            goy $$3 = ffd.Q().aa();
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
      protected Optional<ale> c() {
         return this.aT;
      }
   }

   protected static class o extends gdt {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gdt {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gdt {
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
