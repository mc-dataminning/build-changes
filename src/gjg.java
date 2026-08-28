import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gjg {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final gjg.p c = new gjg.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gjg.p d = new gjg.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjg.p e = new gjg.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjg.p f = new gjg.p(
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
   protected static final gjg.p g = new gjg.p(
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
   protected static final gjg.p h = new gjg.p(
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
   protected static final gjg.p i = new gjg.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjg.p j = new gjg.p(
      "crosshair_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR,
            GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final gjg.p k = new gjg.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjg.p l = new gjg.p(
      "nausea_overlay_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final gjg.m m = new gjg.m();
   protected static final gjg.m n = new gjg.m(gih.f);
   protected static final gjg.m o = new gjg.m(gih.d);
   protected static final gjg.m p = new gjg.m(gih.h);
   protected static final gjg.m q = new gjg.m(gih.g);
   protected static final gjg.m r = new gjg.m(gih.e);
   protected static final gjg.m s = new gjg.m(gih.i);
   protected static final gjg.m t = new gjg.m(gih.j);
   protected static final gjg.m u = new gjg.m(gih.k);
   protected static final gjg.m v = new gjg.m(gih.l);
   protected static final gjg.m w = new gjg.m(gih.m);
   protected static final gjg.m x = new gjg.m(gih.n);
   protected static final gjg.m y = new gjg.m(gih.o);
   protected static final gjg.m z = new gjg.m(gih.p);
   protected static final gjg.m A = new gjg.m(gih.q);
   protected static final gjg.m B = new gjg.m(gih.r);
   protected static final gjg.m C = new gjg.m(gih.s);
   protected static final gjg.m D = new gjg.m(gih.t);
   protected static final gjg.m E = new gjg.m(gih.u);
   protected static final gjg.m F = new gjg.m(gih.v);
   protected static final gjg.m G = new gjg.m(gih.w);
   protected static final gjg.m H = new gjg.m(gih.x);
   protected static final gjg.m I = new gjg.m(gih.y);
   protected static final gjg.m J = new gjg.m(gih.z);
   protected static final gjg.m K = new gjg.m(gih.A);
   protected static final gjg.m L = new gjg.m(gih.B);
   protected static final gjg.m M = new gjg.m(gih.C);
   protected static final gjg.m N = new gjg.m(gih.D);
   protected static final gjg.m O = new gjg.m(gih.E);
   protected static final gjg.m P = new gjg.m(gih.F);
   protected static final gjg.m Q = new gjg.m(gih.G);
   protected static final gjg.m R = new gjg.m(gih.H);
   protected static final gjg.m S = new gjg.m(gih.I);
   protected static final gjg.m T = new gjg.m(gih.J);
   protected static final gjg.m U = new gjg.m(gih.K);
   protected static final gjg.m V = new gjg.m(gih.X);
   protected static final gjg.m W = new gjg.m(gih.L);
   protected static final gjg.m X = new gjg.m(gih.M);
   protected static final gjg.m Y = new gjg.m(gih.N);
   protected static final gjg.m Z = new gjg.m(gih.O);
   protected static final gjg.m aa = new gjg.m(gih.P);
   protected static final gjg.m ab = new gjg.m(gih.Q);
   protected static final gjg.m ac = new gjg.m(gih.R);
   protected static final gjg.m ad = new gjg.m(gih.S);
   protected static final gjg.m ae = new gjg.m(gih.T);
   protected static final gjg.m af = new gjg.m(gih.U);
   protected static final gjg.m ag = new gjg.m(gih.V);
   protected static final gjg.m ah = new gjg.m(gih.W);
   protected static final gjg.m ai = new gjg.m(gih.Y);
   protected static final gjg.m aj = new gjg.m(gih.Z);
   protected static final gjg.m ak = new gjg.m(gih.aa);
   protected static final gjg.m al = new gjg.m(gih.ab);
   protected static final gjg.m am = new gjg.m(gih.ac);
   protected static final gjg.n an = new gjg.n(gys.d, bar.b, true);
   protected static final gjg.n ao = new gjg.n(gys.d, bar.b, false);
   protected static final gjg.e ap = new gjg.e();
   protected static final gjg.o aq = new gjg.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gjg.o ar = new gjg.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gjg.o as = new gjg.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gjg.g at = new gjg.g(true);
   protected static final gjg.g au = new gjg.g(false);
   protected static final gjg.l av = new gjg.l(true);
   protected static final gjg.l aw = new gjg.l(false);
   protected static final gjg.c ax = new gjg.c(true);
   protected static final gjg.c ay = new gjg.c(false);
   protected static final gjg.d az = new gjg.d("always", 519);
   protected static final gjg.d aA = new gjg.d("==", 514);
   protected static final gjg.d aB = new gjg.d("<=", 515);
   protected static final gjg.d aC = new gjg.d(">", 516);
   protected static final gjg.q aD = new gjg.q(true, true);
   protected static final gjg.q aE = new gjg.q(true, false);
   protected static final gjg.q aF = new gjg.q(false, true);
   protected static final gjg.f aG = new gjg.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gjg.f aH = new gjg.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gjg.f aI = new gjg.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gjg.f aJ = new gjg.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gjg.k aK = new gjg.k("main_target", () -> fjx.Q().h().a(false), () -> {
   });
   protected static final gjg.k aL = new gjg.k("outline_target", () -> {
      fcu $$0 = fjx.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.k aM = new gjg.k("translucent_target", () -> {
      fcu $$0 = fjx.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.k aN = new gjg.k("particles_target", () -> {
      fcu $$0 = fjx.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.k aO = new gjg.k("weather_target", () -> {
      fcu $$0 = fjx.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.k aP = new gjg.k("clouds_target", () -> {
      fcu $$0 = fjx.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.k aQ = new gjg.k("item_entity_target", () -> {
      fcu $$0 = fjx.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fjx.Q().h().a(false);
      }
   }, () -> fjx.Q().h().a(false));
   protected static final gjg.h aR = new gjg.h(OptionalDouble.of(1.0));
   protected static final gjg.b aS = new gjg.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gjg.b aT = new gjg.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gjg(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aV = $$1;
      this.aW = $$2;
   }

   public void a() {
      this.aV.run();
   }

   public void b() {
      this.aW.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ae.c() * fjx.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gjg {
      private final boolean aU;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aU = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class b extends gjg {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gjg.a {
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

   protected static class d extends gjg {
      private final String aU;

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
         this.aU = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class e extends gjg {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<all> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gjg {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gjg.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fjx.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fjx.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gjg {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fjx.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aU = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aU.isPresent() ? this.aU.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends gjg.e {
      private final Optional<all> aU;

      i(ImmutableList<Triple<all, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<all, Boolean, Boolean> $$2 = (Triple<all, Boolean, Boolean>)var2.next();
               gyu $$3 = fjx.Q().aa();
               $$3.a((all)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (all)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<all> c() {
         return this.aU;
      }

      public static gjg.i.a d() {
         return new gjg.i.a();
      }

      public static final class a {
         private final Builder<Triple<all, Boolean, Boolean>> a = new Builder();

         public gjg.i.a a(all $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gjg.i a() {
            return new gjg.i(this.a.build());
         }
      }
   }

   protected static final class j extends gjg.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gjg {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gjg.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fjx.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fjx.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gjg {
      private final Optional<gjp> aU;

      public m(gjp $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aU = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aU = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "]";
      }
   }

   protected static class n extends gjg.e {
      private final Optional<all> aU;
      private final bar aV;
      private final boolean aW;

      public n(all $$0, bar $$1, boolean $$2) {
         super(() -> {
            gyu $$3 = fjx.Q().aa();
            gye $$4 = $$3.a($$0);
            $$4.a($$1.a($$4.c()), $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aU = Optional.of($$0);
         this.aV = $$1;
         this.aW = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aU + "(blur=" + this.aV + ", mipmap=" + this.aW + ")]";
      }

      @Override
      protected Optional<all> c() {
         return this.aU;
      }
   }

   protected static class o extends gjg {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gjg {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gjg {
      private final boolean aU;
      private final boolean aV;

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
         this.aU = $$0;
         this.aV = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aU + ", writeDepth=" + this.aV + "]";
      }
   }
}
