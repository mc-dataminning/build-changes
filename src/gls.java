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

public abstract class gls {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final gls.p c = new gls.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gls.p d = new gls.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gls.p e = new gls.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gls.p f = new gls.p(
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
   protected static final gls.p g = new gls.p(
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
   protected static final gls.p h = new gls.p(
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
   protected static final gls.p i = new gls.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gls.p j = new gls.p(
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
   protected static final gls.p k = new gls.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gls.p l = new gls.p(
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
   protected static final gls.m m = new gls.m();
   protected static final gls.m n = new gls.m(gkt.f);
   protected static final gls.m o = new gls.m(gkt.d);
   protected static final gls.m p = new gls.m(gkt.h);
   protected static final gls.m q = new gls.m(gkt.g);
   protected static final gls.m r = new gls.m(gkt.e);
   protected static final gls.m s = new gls.m(gkt.i);
   protected static final gls.m t = new gls.m(gkt.j);
   protected static final gls.m u = new gls.m(gkt.k);
   protected static final gls.m v = new gls.m(gkt.l);
   protected static final gls.m w = new gls.m(gkt.m);
   protected static final gls.m x = new gls.m(gkt.n);
   protected static final gls.m y = new gls.m(gkt.o);
   protected static final gls.m z = new gls.m(gkt.p);
   protected static final gls.m A = new gls.m(gkt.q);
   protected static final gls.m B = new gls.m(gkt.r);
   protected static final gls.m C = new gls.m(gkt.s);
   protected static final gls.m D = new gls.m(gkt.t);
   protected static final gls.m E = new gls.m(gkt.u);
   protected static final gls.m F = new gls.m(gkt.v);
   protected static final gls.m G = new gls.m(gkt.w);
   protected static final gls.m H = new gls.m(gkt.x);
   protected static final gls.m I = new gls.m(gkt.y);
   protected static final gls.m J = new gls.m(gkt.z);
   protected static final gls.m K = new gls.m(gkt.A);
   protected static final gls.m L = new gls.m(gkt.B);
   protected static final gls.m M = new gls.m(gkt.C);
   protected static final gls.m N = new gls.m(gkt.D);
   protected static final gls.m O = new gls.m(gkt.E);
   protected static final gls.m P = new gls.m(gkt.F);
   protected static final gls.m Q = new gls.m(gkt.G);
   protected static final gls.m R = new gls.m(gkt.H);
   protected static final gls.m S = new gls.m(gkt.I);
   protected static final gls.m T = new gls.m(gkt.J);
   protected static final gls.m U = new gls.m(gkt.K);
   protected static final gls.m V = new gls.m(gkt.X);
   protected static final gls.m W = new gls.m(gkt.L);
   protected static final gls.m X = new gls.m(gkt.M);
   protected static final gls.m Y = new gls.m(gkt.N);
   protected static final gls.m Z = new gls.m(gkt.O);
   protected static final gls.m aa = new gls.m(gkt.P);
   protected static final gls.m ab = new gls.m(gkt.Q);
   protected static final gls.m ac = new gls.m(gkt.R);
   protected static final gls.m ad = new gls.m(gkt.S);
   protected static final gls.m ae = new gls.m(gkt.T);
   protected static final gls.m af = new gls.m(gkt.U);
   protected static final gls.m ag = new gls.m(gkt.V);
   protected static final gls.m ah = new gls.m(gkt.W);
   protected static final gls.m ai = new gls.m(gkt.Y);
   protected static final gls.m aj = new gls.m(gkt.Z);
   protected static final gls.m ak = new gls.m(gkt.aa);
   protected static final gls.m al = new gls.m(gkt.ab);
   protected static final gls.m am = new gls.m(gkt.ac);
   protected static final gls.n an = new gls.n(hbi.d, bbi.b, true);
   protected static final gls.n ao = new gls.n(hbi.d, bbi.b, false);
   protected static final gls.e ap = new gls.e();
   protected static final gls.o aq = new gls.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gls.o ar = new gls.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gls.o as = new gls.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gls.g at = new gls.g(true);
   protected static final gls.g au = new gls.g(false);
   protected static final gls.l av = new gls.l(true);
   protected static final gls.l aw = new gls.l(false);
   protected static final gls.c ax = new gls.c(true);
   protected static final gls.c ay = new gls.c(false);
   protected static final gls.d az = new gls.d("always", 519);
   protected static final gls.d aA = new gls.d("==", 514);
   protected static final gls.d aB = new gls.d("<=", 515);
   protected static final gls.d aC = new gls.d(">", 516);
   protected static final gls.q aD = new gls.q(true, true);
   protected static final gls.q aE = new gls.q(true, false);
   protected static final gls.q aF = new gls.q(false, true);
   protected static final gls.f aG = new gls.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gls.f aH = new gls.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gls.f aI = new gls.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gls.f aJ = new gls.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gls.k aK = new gls.k("main_target", () -> fme.Q().h().a(false), () -> {
   });
   protected static final gls.k aL = new gls.k("outline_target", () -> {
      ffa $$0 = fme.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.k aM = new gls.k("translucent_target", () -> {
      ffa $$0 = fme.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.k aN = new gls.k("particles_target", () -> {
      ffa $$0 = fme.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.k aO = new gls.k("weather_target", () -> {
      ffa $$0 = fme.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.k aP = new gls.k("clouds_target", () -> {
      ffa $$0 = fme.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.k aQ = new gls.k("item_entity_target", () -> {
      ffa $$0 = fme.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fme.Q().h().a(false);
      }
   }, () -> fme.Q().h().a(false));
   protected static final gls.h aR = new gls.h(OptionalDouble.of(1.0));
   protected static final gls.b aS = new gls.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gls.b aT = new gls.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gls(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * fme.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gls {
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

   protected static class b extends gls {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gls.a {
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

   protected static class d extends gls {
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

   protected static class e extends gls {
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

   protected static class f extends gls {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gls.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fme.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fme.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gls {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fme.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gls.e {
      private final Optional<alz> aU;

      i(ImmutableList<Triple<alz, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alz, Boolean, Boolean> $$2 = (Triple<alz, Boolean, Boolean>)var2.next();
               hbk $$3 = fme.Q().aa();
               $$3.a((alz)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alz)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alz> c() {
         return this.aU;
      }

      public static gls.i.a d() {
         return new gls.i.a();
      }

      public static final class a {
         private final Builder<Triple<alz, Boolean, Boolean>> a = new Builder();

         public gls.i.a a(alz $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gls.i a() {
            return new gls.i(this.a.build());
         }
      }
   }

   protected static final class j extends gls.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gls {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gls.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fme.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fme.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gls {
      private final Optional<gmb> aU;

      public m(gmb $$0) {
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

   protected static class n extends gls.e {
      private final Optional<alz> aU;
      private final bbi aV;
      private final boolean aW;

      public n(alz $$0, bbi $$1, boolean $$2) {
         super(() -> {
            hbk $$3 = fme.Q().aa();
            hau $$4 = $$3.a($$0);
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
      protected Optional<alz> c() {
         return this.aU;
      }
   }

   protected static class o extends gls {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gls {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gls {
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
