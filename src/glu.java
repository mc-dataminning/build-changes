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

public abstract class glu {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final glu.p c = new glu.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final glu.p d = new glu.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glu.p e = new glu.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glu.p f = new glu.p(
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
   protected static final glu.p g = new glu.p(
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
   protected static final glu.p h = new glu.p(
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
   protected static final glu.p i = new glu.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glu.p j = new glu.p(
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
   protected static final glu.p k = new glu.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glu.p l = new glu.p(
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
   protected static final glu.m m = new glu.m();
   protected static final glu.m n = new glu.m(gkv.f);
   protected static final glu.m o = new glu.m(gkv.d);
   protected static final glu.m p = new glu.m(gkv.h);
   protected static final glu.m q = new glu.m(gkv.g);
   protected static final glu.m r = new glu.m(gkv.e);
   protected static final glu.m s = new glu.m(gkv.i);
   protected static final glu.m t = new glu.m(gkv.j);
   protected static final glu.m u = new glu.m(gkv.k);
   protected static final glu.m v = new glu.m(gkv.l);
   protected static final glu.m w = new glu.m(gkv.m);
   protected static final glu.m x = new glu.m(gkv.n);
   protected static final glu.m y = new glu.m(gkv.o);
   protected static final glu.m z = new glu.m(gkv.p);
   protected static final glu.m A = new glu.m(gkv.q);
   protected static final glu.m B = new glu.m(gkv.r);
   protected static final glu.m C = new glu.m(gkv.s);
   protected static final glu.m D = new glu.m(gkv.t);
   protected static final glu.m E = new glu.m(gkv.u);
   protected static final glu.m F = new glu.m(gkv.v);
   protected static final glu.m G = new glu.m(gkv.w);
   protected static final glu.m H = new glu.m(gkv.x);
   protected static final glu.m I = new glu.m(gkv.y);
   protected static final glu.m J = new glu.m(gkv.z);
   protected static final glu.m K = new glu.m(gkv.A);
   protected static final glu.m L = new glu.m(gkv.B);
   protected static final glu.m M = new glu.m(gkv.C);
   protected static final glu.m N = new glu.m(gkv.D);
   protected static final glu.m O = new glu.m(gkv.E);
   protected static final glu.m P = new glu.m(gkv.F);
   protected static final glu.m Q = new glu.m(gkv.G);
   protected static final glu.m R = new glu.m(gkv.H);
   protected static final glu.m S = new glu.m(gkv.I);
   protected static final glu.m T = new glu.m(gkv.J);
   protected static final glu.m U = new glu.m(gkv.K);
   protected static final glu.m V = new glu.m(gkv.L);
   protected static final glu.m W = new glu.m(gkv.Y);
   protected static final glu.m X = new glu.m(gkv.M);
   protected static final glu.m Y = new glu.m(gkv.N);
   protected static final glu.m Z = new glu.m(gkv.O);
   protected static final glu.m aa = new glu.m(gkv.P);
   protected static final glu.m ab = new glu.m(gkv.Q);
   protected static final glu.m ac = new glu.m(gkv.R);
   protected static final glu.m ad = new glu.m(gkv.S);
   protected static final glu.m ae = new glu.m(gkv.T);
   protected static final glu.m af = new glu.m(gkv.U);
   protected static final glu.m ag = new glu.m(gkv.V);
   protected static final glu.m ah = new glu.m(gkv.W);
   protected static final glu.m ai = new glu.m(gkv.X);
   protected static final glu.m aj = new glu.m(gkv.Z);
   protected static final glu.m ak = new glu.m(gkv.aa);
   protected static final glu.m al = new glu.m(gkv.ab);
   protected static final glu.m am = new glu.m(gkv.ac);
   protected static final glu.m an = new glu.m(gkv.ad);
   protected static final glu.n ao = new glu.n(hbk.d, bbi.b, true);
   protected static final glu.n ap = new glu.n(hbk.d, bbi.b, false);
   protected static final glu.e aq = new glu.e();
   protected static final glu.o ar = new glu.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final glu.o as = new glu.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final glu.o at = new glu.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final glu.g au = new glu.g(true);
   protected static final glu.g av = new glu.g(false);
   protected static final glu.l aw = new glu.l(true);
   protected static final glu.l ax = new glu.l(false);
   protected static final glu.c ay = new glu.c(true);
   protected static final glu.c az = new glu.c(false);
   protected static final glu.d aA = new glu.d("always", 519);
   protected static final glu.d aB = new glu.d("==", 514);
   protected static final glu.d aC = new glu.d("<=", 515);
   protected static final glu.d aD = new glu.d(">", 516);
   protected static final glu.q aE = new glu.q(true, true);
   protected static final glu.q aF = new glu.q(true, false);
   protected static final glu.q aG = new glu.q(false, true);
   protected static final glu.f aH = new glu.f("no_layering", () -> {
   }, () -> {
   });
   protected static final glu.f aI = new glu.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final glu.f aJ = new glu.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glu.f aK = new glu.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glu.k aL = new glu.k("main_target", () -> fmg.Q().h().a(false), () -> {
   });
   protected static final glu.k aM = new glu.k("outline_target", () -> {
      ffc $$0 = fmg.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.k aN = new glu.k("translucent_target", () -> {
      ffc $$0 = fmg.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.k aO = new glu.k("particles_target", () -> {
      ffc $$0 = fmg.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.k aP = new glu.k("weather_target", () -> {
      ffc $$0 = fmg.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.k aQ = new glu.k("clouds_target", () -> {
      ffc $$0 = fmg.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.k aR = new glu.k("item_entity_target", () -> {
      ffc $$0 = fmg.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmg.Q().h().a(false);
      }
   }, () -> fmg.Q().h().a(false));
   protected static final glu.h aS = new glu.h(OptionalDouble.of(1.0));
   protected static final glu.b aT = new glu.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final glu.b aU = new glu.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public glu(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * fmg.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends glu {
      private final boolean aV;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aV = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aV + "]";
      }
   }

   protected static class b extends glu {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends glu.a {
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

   protected static class d extends glu {
      private final String aV;

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
         this.aV = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aV + "]";
      }
   }

   protected static class e extends glu {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alz> c() {
         return Optional.empty();
      }
   }

   protected static class f extends glu {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends glu.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fmg.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fmg.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends glu {
      private final OptionalDouble aV;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fmg.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aV = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aV.isPresent() ? this.aV.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends glu.e {
      private final Optional<alz> aV;

      i(ImmutableList<Triple<alz, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alz, Boolean, Boolean> $$2 = (Triple<alz, Boolean, Boolean>)var2.next();
               hbm $$3 = fmg.Q().aa();
               $$3.a((alz)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alz)$$2.getLeft());
            }
         }, () -> {
         });
         this.aV = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alz> c() {
         return this.aV;
      }

      public static glu.i.a d() {
         return new glu.i.a();
      }

      public static final class a {
         private final Builder<Triple<alz, Boolean, Boolean>> a = new Builder();

         public glu.i.a a(alz $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public glu.i a() {
            return new glu.i(this.a.build());
         }
      }
   }

   protected static final class j extends glu.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends glu {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends glu.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fmg.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fmg.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends glu {
      private final Optional<gmd> aV;

      public m(gmd $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aV = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aV = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aV + "]";
      }
   }

   protected static class n extends glu.e {
      private final Optional<alz> aV;
      private final bbi aW;
      private final boolean aX;

      public n(alz $$0, bbi $$1, boolean $$2) {
         super(() -> {
            hbm $$3 = fmg.Q().aa();
            haw $$4 = $$3.a($$0);
            $$4.a($$1.a($$4.c()), $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aV = Optional.of($$0);
         this.aW = $$1;
         this.aX = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aV + "(blur=" + this.aW + ", mipmap=" + this.aX + ")]";
      }

      @Override
      protected Optional<alz> c() {
         return this.aV;
      }
   }

   protected static class o extends glu {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends glu {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends glu {
      private final boolean aV;
      private final boolean aW;

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
         this.aV = $$0;
         this.aW = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aV + ", writeDepth=" + this.aW + "]";
      }
   }
}
