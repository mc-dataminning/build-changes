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

public abstract class ghp {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final ghp.p c = new ghp.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ghp.p d = new ghp.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghp.p e = new ghp.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghp.p f = new ghp.p(
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
   protected static final ghp.p g = new ghp.p(
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
   protected static final ghp.p h = new ghp.p(
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
   protected static final ghp.p i = new ghp.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghp.p j = new ghp.p(
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
   protected static final ghp.p k = new ghp.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ghp.p l = new ghp.p(
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
   protected static final ghp.m m = new ghp.m();
   protected static final ghp.m n = new ghp.m(ggq.f);
   protected static final ghp.m o = new ghp.m(ggq.d);
   protected static final ghp.m p = new ghp.m(ggq.h);
   protected static final ghp.m q = new ghp.m(ggq.g);
   protected static final ghp.m r = new ghp.m(ggq.e);
   protected static final ghp.m s = new ghp.m(ggq.i);
   protected static final ghp.m t = new ghp.m(ggq.j);
   protected static final ghp.m u = new ghp.m(ggq.k);
   protected static final ghp.m v = new ghp.m(ggq.l);
   protected static final ghp.m w = new ghp.m(ggq.m);
   protected static final ghp.m x = new ghp.m(ggq.n);
   protected static final ghp.m y = new ghp.m(ggq.o);
   protected static final ghp.m z = new ghp.m(ggq.p);
   protected static final ghp.m A = new ghp.m(ggq.q);
   protected static final ghp.m B = new ghp.m(ggq.r);
   protected static final ghp.m C = new ghp.m(ggq.s);
   protected static final ghp.m D = new ghp.m(ggq.t);
   protected static final ghp.m E = new ghp.m(ggq.u);
   protected static final ghp.m F = new ghp.m(ggq.v);
   protected static final ghp.m G = new ghp.m(ggq.w);
   protected static final ghp.m H = new ghp.m(ggq.x);
   protected static final ghp.m I = new ghp.m(ggq.y);
   protected static final ghp.m J = new ghp.m(ggq.z);
   protected static final ghp.m K = new ghp.m(ggq.A);
   protected static final ghp.m L = new ghp.m(ggq.B);
   protected static final ghp.m M = new ghp.m(ggq.C);
   protected static final ghp.m N = new ghp.m(ggq.D);
   protected static final ghp.m O = new ghp.m(ggq.E);
   protected static final ghp.m P = new ghp.m(ggq.F);
   protected static final ghp.m Q = new ghp.m(ggq.G);
   protected static final ghp.m R = new ghp.m(ggq.H);
   protected static final ghp.m S = new ghp.m(ggq.I);
   protected static final ghp.m T = new ghp.m(ggq.J);
   protected static final ghp.m U = new ghp.m(ggq.K);
   protected static final ghp.m V = new ghp.m(ggq.X);
   protected static final ghp.m W = new ghp.m(ggq.L);
   protected static final ghp.m X = new ghp.m(ggq.M);
   protected static final ghp.m Y = new ghp.m(ggq.N);
   protected static final ghp.m Z = new ghp.m(ggq.O);
   protected static final ghp.m aa = new ghp.m(ggq.P);
   protected static final ghp.m ab = new ghp.m(ggq.Q);
   protected static final ghp.m ac = new ghp.m(ggq.R);
   protected static final ghp.m ad = new ghp.m(ggq.S);
   protected static final ghp.m ae = new ghp.m(ggq.T);
   protected static final ghp.m af = new ghp.m(ggq.U);
   protected static final ghp.m ag = new ghp.m(ggq.V);
   protected static final ghp.m ah = new ghp.m(ggq.W);
   protected static final ghp.m ai = new ghp.m(ggq.Y);
   protected static final ghp.m aj = new ghp.m(ggq.Z);
   protected static final ghp.m ak = new ghp.m(ggq.aa);
   protected static final ghp.m al = new ghp.m(ggq.ab);
   protected static final ghp.m am = new ghp.m(ggq.ac);
   protected static final ghp.n an = new ghp.n(gxa.d, bag.b, true);
   protected static final ghp.n ao = new ghp.n(gxa.d, bag.b, false);
   protected static final ghp.e ap = new ghp.e();
   protected static final ghp.o aq = new ghp.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ghp.o ar = new ghp.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghp.o as = new ghp.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ghp.g at = new ghp.g(true);
   protected static final ghp.g au = new ghp.g(false);
   protected static final ghp.l av = new ghp.l(true);
   protected static final ghp.l aw = new ghp.l(false);
   protected static final ghp.c ax = new ghp.c(true);
   protected static final ghp.c ay = new ghp.c(false);
   protected static final ghp.d az = new ghp.d("always", 519);
   protected static final ghp.d aA = new ghp.d("==", 514);
   protected static final ghp.d aB = new ghp.d("<=", 515);
   protected static final ghp.d aC = new ghp.d(">", 516);
   protected static final ghp.q aD = new ghp.q(true, true);
   protected static final ghp.q aE = new ghp.q(true, false);
   protected static final ghp.q aF = new ghp.q(false, true);
   protected static final ghp.f aG = new ghp.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ghp.f aH = new ghp.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ghp.f aI = new ghp.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghp.f aJ = new ghp.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final ghp.k aK = new ghp.k("main_target", () -> fil.Q().h().a(false), () -> {
   });
   protected static final ghp.k aL = new ghp.k("outline_target", () -> fil.Q().f.q().a(false), () -> fil.Q().h().a(false));
   protected static final ghp.k aM = new ghp.k("translucent_target", () -> {
      fbo $$0 = fil.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fil.Q().h().a(false);
      }
   }, () -> fil.Q().h().a(false));
   protected static final ghp.k aN = new ghp.k("particles_target", () -> {
      fbo $$0 = fil.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fil.Q().h().a(false);
      }
   }, () -> fil.Q().h().a(false));
   protected static final ghp.k aO = new ghp.k("weather_target", () -> {
      fbo $$0 = fil.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fil.Q().h().a(false);
      }
   }, () -> fil.Q().h().a(false));
   protected static final ghp.k aP = new ghp.k("clouds_target", () -> {
      fbo $$0 = fil.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fil.Q().h().a(false);
      }
   }, () -> fil.Q().h().a(false));
   protected static final ghp.k aQ = new ghp.k("item_entity_target", () -> {
      fbo $$0 = fil.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fil.Q().h().a(false);
      }
   }, () -> fil.Q().h().a(false));
   protected static final ghp.h aR = new ghp.h(OptionalDouble.of(1.0));
   protected static final ghp.b aS = new ghp.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ghp.b aT = new ghp.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ghp(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.c() * fil.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ghp {
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

   protected static class b extends ghp {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ghp.a {
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

   protected static class d extends ghp {
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

   protected static class e extends ghp {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alc> c() {
         return Optional.empty();
      }
   }

   protected static class f extends ghp {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ghp.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fil.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fil.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ghp {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fil.Q().aP().l() / 1920.0F * 2.5F));
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

   protected static class i extends ghp.e {
      private final Optional<alc> aU;

      i(ImmutableList<Triple<alc, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alc, Boolean, Boolean> $$2 = (Triple<alc, Boolean, Boolean>)var2.next();
               gxc $$3 = fil.Q().aa();
               $$3.a((alc)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alc)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alc> c() {
         return this.aU;
      }

      public static ghp.i.a d() {
         return new ghp.i.a();
      }

      public static final class a {
         private final Builder<Triple<alc, Boolean, Boolean>> a = new Builder();

         public ghp.i.a a(alc $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ghp.i a() {
            return new ghp.i(this.a.build());
         }
      }
   }

   protected static final class j extends ghp.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ghp {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ghp.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fil.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fil.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ghp {
      private final Optional<ghy> aU;

      public m(ghy $$0) {
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

   protected static class n extends ghp.e {
      private final Optional<alc> aU;
      private final bag aV;
      private final boolean aW;

      public n(alc $$0, bag $$1, boolean $$2) {
         super(() -> {
            gxc $$3 = fil.Q().aa();
            gwm $$4 = $$3.a($$0);
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
      protected Optional<alc> c() {
         return this.aU;
      }
   }

   protected static class o extends ghp {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ghp {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ghp {
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
