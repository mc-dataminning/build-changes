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

public abstract class glt {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final glt.p c = new glt.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final glt.p d = new glt.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glt.p e = new glt.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glt.p f = new glt.p(
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
   protected static final glt.p g = new glt.p(
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
   protected static final glt.p h = new glt.p(
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
   protected static final glt.p i = new glt.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glt.p j = new glt.p(
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
   protected static final glt.p k = new glt.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glt.p l = new glt.p(
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
   protected static final glt.m m = new glt.m();
   protected static final glt.m n = new glt.m(gku.f);
   protected static final glt.m o = new glt.m(gku.d);
   protected static final glt.m p = new glt.m(gku.h);
   protected static final glt.m q = new glt.m(gku.g);
   protected static final glt.m r = new glt.m(gku.e);
   protected static final glt.m s = new glt.m(gku.i);
   protected static final glt.m t = new glt.m(gku.j);
   protected static final glt.m u = new glt.m(gku.k);
   protected static final glt.m v = new glt.m(gku.l);
   protected static final glt.m w = new glt.m(gku.m);
   protected static final glt.m x = new glt.m(gku.n);
   protected static final glt.m y = new glt.m(gku.o);
   protected static final glt.m z = new glt.m(gku.p);
   protected static final glt.m A = new glt.m(gku.q);
   protected static final glt.m B = new glt.m(gku.r);
   protected static final glt.m C = new glt.m(gku.s);
   protected static final glt.m D = new glt.m(gku.t);
   protected static final glt.m E = new glt.m(gku.u);
   protected static final glt.m F = new glt.m(gku.v);
   protected static final glt.m G = new glt.m(gku.w);
   protected static final glt.m H = new glt.m(gku.x);
   protected static final glt.m I = new glt.m(gku.y);
   protected static final glt.m J = new glt.m(gku.z);
   protected static final glt.m K = new glt.m(gku.A);
   protected static final glt.m L = new glt.m(gku.B);
   protected static final glt.m M = new glt.m(gku.C);
   protected static final glt.m N = new glt.m(gku.D);
   protected static final glt.m O = new glt.m(gku.E);
   protected static final glt.m P = new glt.m(gku.F);
   protected static final glt.m Q = new glt.m(gku.G);
   protected static final glt.m R = new glt.m(gku.H);
   protected static final glt.m S = new glt.m(gku.I);
   protected static final glt.m T = new glt.m(gku.J);
   protected static final glt.m U = new glt.m(gku.K);
   protected static final glt.m V = new glt.m(gku.L);
   protected static final glt.m W = new glt.m(gku.Y);
   protected static final glt.m X = new glt.m(gku.M);
   protected static final glt.m Y = new glt.m(gku.N);
   protected static final glt.m Z = new glt.m(gku.O);
   protected static final glt.m aa = new glt.m(gku.P);
   protected static final glt.m ab = new glt.m(gku.Q);
   protected static final glt.m ac = new glt.m(gku.R);
   protected static final glt.m ad = new glt.m(gku.S);
   protected static final glt.m ae = new glt.m(gku.T);
   protected static final glt.m af = new glt.m(gku.U);
   protected static final glt.m ag = new glt.m(gku.V);
   protected static final glt.m ah = new glt.m(gku.W);
   protected static final glt.m ai = new glt.m(gku.X);
   protected static final glt.m aj = new glt.m(gku.Z);
   protected static final glt.m ak = new glt.m(gku.aa);
   protected static final glt.m al = new glt.m(gku.ab);
   protected static final glt.m am = new glt.m(gku.ac);
   protected static final glt.m an = new glt.m(gku.ad);
   protected static final glt.n ao = new glt.n(hbj.d, bbi.b, true);
   protected static final glt.n ap = new glt.n(hbj.d, bbi.b, false);
   protected static final glt.e aq = new glt.e();
   protected static final glt.o ar = new glt.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final glt.o as = new glt.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final glt.o at = new glt.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final glt.g au = new glt.g(true);
   protected static final glt.g av = new glt.g(false);
   protected static final glt.l aw = new glt.l(true);
   protected static final glt.l ax = new glt.l(false);
   protected static final glt.c ay = new glt.c(true);
   protected static final glt.c az = new glt.c(false);
   protected static final glt.d aA = new glt.d("always", 519);
   protected static final glt.d aB = new glt.d("==", 514);
   protected static final glt.d aC = new glt.d("<=", 515);
   protected static final glt.d aD = new glt.d(">", 516);
   protected static final glt.q aE = new glt.q(true, true);
   protected static final glt.q aF = new glt.q(true, false);
   protected static final glt.q aG = new glt.q(false, true);
   protected static final glt.f aH = new glt.f("no_layering", () -> {
   }, () -> {
   });
   protected static final glt.f aI = new glt.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final glt.f aJ = new glt.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glt.f aK = new glt.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glt.k aL = new glt.k("main_target", () -> fmf.Q().h().a(false), () -> {
   });
   protected static final glt.k aM = new glt.k("outline_target", () -> {
      ffb $$0 = fmf.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.k aN = new glt.k("translucent_target", () -> {
      ffb $$0 = fmf.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.k aO = new glt.k("particles_target", () -> {
      ffb $$0 = fmf.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.k aP = new glt.k("weather_target", () -> {
      ffb $$0 = fmf.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.k aQ = new glt.k("clouds_target", () -> {
      ffb $$0 = fmf.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.k aR = new glt.k("item_entity_target", () -> {
      ffb $$0 = fmf.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fmf.Q().h().a(false);
      }
   }, () -> fmf.Q().h().a(false));
   protected static final glt.h aS = new glt.h(OptionalDouble.of(1.0));
   protected static final glt.b aT = new glt.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final glt.b aU = new glt.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public glt(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * fmf.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends glt {
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

   protected static class b extends glt {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends glt.a {
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

   protected static class d extends glt {
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

   protected static class e extends glt {
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

   protected static class f extends glt {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends glt.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fmf.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fmf.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends glt {
      private final OptionalDouble aV;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fmf.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends glt.e {
      private final Optional<alz> aV;

      i(ImmutableList<Triple<alz, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alz, Boolean, Boolean> $$2 = (Triple<alz, Boolean, Boolean>)var2.next();
               hbl $$3 = fmf.Q().aa();
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

      public static glt.i.a d() {
         return new glt.i.a();
      }

      public static final class a {
         private final Builder<Triple<alz, Boolean, Boolean>> a = new Builder();

         public glt.i.a a(alz $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public glt.i a() {
            return new glt.i(this.a.build());
         }
      }
   }

   protected static final class j extends glt.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends glt {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends glt.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fmf.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fmf.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends glt {
      private final Optional<gmc> aV;

      public m(gmc $$0) {
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

   protected static class n extends glt.e {
      private final Optional<alz> aV;
      private final bbi aW;
      private final boolean aX;

      public n(alz $$0, bbi $$1, boolean $$2) {
         super(() -> {
            hbl $$3 = fmf.Q().aa();
            hav $$4 = $$3.a($$0);
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

   protected static class o extends glt {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends glt {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends glt {
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
