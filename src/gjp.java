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

public abstract class gjp {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final gjp.p c = new gjp.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gjp.p d = new gjp.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjp.p e = new gjp.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjp.p f = new gjp.p(
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
   protected static final gjp.p g = new gjp.p(
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
   protected static final gjp.p h = new gjp.p(
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
   protected static final gjp.p i = new gjp.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjp.p j = new gjp.p(
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
   protected static final gjp.p k = new gjp.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gjp.p l = new gjp.p(
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
   protected static final gjp.m m = new gjp.m();
   protected static final gjp.m n = new gjp.m(giq.f);
   protected static final gjp.m o = new gjp.m(giq.d);
   protected static final gjp.m p = new gjp.m(giq.h);
   protected static final gjp.m q = new gjp.m(giq.g);
   protected static final gjp.m r = new gjp.m(giq.e);
   protected static final gjp.m s = new gjp.m(giq.i);
   protected static final gjp.m t = new gjp.m(giq.j);
   protected static final gjp.m u = new gjp.m(giq.k);
   protected static final gjp.m v = new gjp.m(giq.l);
   protected static final gjp.m w = new gjp.m(giq.m);
   protected static final gjp.m x = new gjp.m(giq.n);
   protected static final gjp.m y = new gjp.m(giq.o);
   protected static final gjp.m z = new gjp.m(giq.p);
   protected static final gjp.m A = new gjp.m(giq.q);
   protected static final gjp.m B = new gjp.m(giq.r);
   protected static final gjp.m C = new gjp.m(giq.s);
   protected static final gjp.m D = new gjp.m(giq.t);
   protected static final gjp.m E = new gjp.m(giq.u);
   protected static final gjp.m F = new gjp.m(giq.v);
   protected static final gjp.m G = new gjp.m(giq.w);
   protected static final gjp.m H = new gjp.m(giq.x);
   protected static final gjp.m I = new gjp.m(giq.y);
   protected static final gjp.m J = new gjp.m(giq.z);
   protected static final gjp.m K = new gjp.m(giq.A);
   protected static final gjp.m L = new gjp.m(giq.B);
   protected static final gjp.m M = new gjp.m(giq.C);
   protected static final gjp.m N = new gjp.m(giq.D);
   protected static final gjp.m O = new gjp.m(giq.E);
   protected static final gjp.m P = new gjp.m(giq.F);
   protected static final gjp.m Q = new gjp.m(giq.G);
   protected static final gjp.m R = new gjp.m(giq.H);
   protected static final gjp.m S = new gjp.m(giq.I);
   protected static final gjp.m T = new gjp.m(giq.J);
   protected static final gjp.m U = new gjp.m(giq.K);
   protected static final gjp.m V = new gjp.m(giq.X);
   protected static final gjp.m W = new gjp.m(giq.L);
   protected static final gjp.m X = new gjp.m(giq.M);
   protected static final gjp.m Y = new gjp.m(giq.N);
   protected static final gjp.m Z = new gjp.m(giq.O);
   protected static final gjp.m aa = new gjp.m(giq.P);
   protected static final gjp.m ab = new gjp.m(giq.Q);
   protected static final gjp.m ac = new gjp.m(giq.R);
   protected static final gjp.m ad = new gjp.m(giq.S);
   protected static final gjp.m ae = new gjp.m(giq.T);
   protected static final gjp.m af = new gjp.m(giq.U);
   protected static final gjp.m ag = new gjp.m(giq.V);
   protected static final gjp.m ah = new gjp.m(giq.W);
   protected static final gjp.m ai = new gjp.m(giq.Y);
   protected static final gjp.m aj = new gjp.m(giq.Z);
   protected static final gjp.m ak = new gjp.m(giq.aa);
   protected static final gjp.m al = new gjp.m(giq.ab);
   protected static final gjp.m am = new gjp.m(giq.ac);
   protected static final gjp.n an = new gjp.n(gzd.d, baq.b, true);
   protected static final gjp.n ao = new gjp.n(gzd.d, baq.b, false);
   protected static final gjp.e ap = new gjp.e();
   protected static final gjp.o aq = new gjp.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gjp.o ar = new gjp.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gjp.o as = new gjp.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gjp.g at = new gjp.g(true);
   protected static final gjp.g au = new gjp.g(false);
   protected static final gjp.l av = new gjp.l(true);
   protected static final gjp.l aw = new gjp.l(false);
   protected static final gjp.c ax = new gjp.c(true);
   protected static final gjp.c ay = new gjp.c(false);
   protected static final gjp.d az = new gjp.d("always", 519);
   protected static final gjp.d aA = new gjp.d("==", 514);
   protected static final gjp.d aB = new gjp.d("<=", 515);
   protected static final gjp.d aC = new gjp.d(">", 516);
   protected static final gjp.q aD = new gjp.q(true, true);
   protected static final gjp.q aE = new gjp.q(true, false);
   protected static final gjp.q aF = new gjp.q(false, true);
   protected static final gjp.f aG = new gjp.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gjp.f aH = new gjp.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gjp.f aI = new gjp.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gjp.f aJ = new gjp.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gjp.k aK = new gjp.k("main_target", () -> fke.Q().h().a(false), () -> {
   });
   protected static final gjp.k aL = new gjp.k("outline_target", () -> {
      fdb $$0 = fke.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.k aM = new gjp.k("translucent_target", () -> {
      fdb $$0 = fke.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.k aN = new gjp.k("particles_target", () -> {
      fdb $$0 = fke.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.k aO = new gjp.k("weather_target", () -> {
      fdb $$0 = fke.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.k aP = new gjp.k("clouds_target", () -> {
      fdb $$0 = fke.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.k aQ = new gjp.k("item_entity_target", () -> {
      fdb $$0 = fke.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fke.Q().h().a(false);
      }
   }, () -> fke.Q().h().a(false));
   protected static final gjp.h aR = new gjp.h(OptionalDouble.of(1.0));
   protected static final gjp.b aS = new gjp.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gjp.b aT = new gjp.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gjp(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * fke.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gjp {
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

   protected static class b extends gjp {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gjp.a {
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

   protected static class d extends gjp {
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

   protected static class e extends gjp {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alj> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gjp {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gjp.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fke.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fke.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gjp {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fke.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gjp.e {
      private final Optional<alj> aU;

      i(ImmutableList<Triple<alj, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alj, Boolean, Boolean> $$2 = (Triple<alj, Boolean, Boolean>)var2.next();
               gzf $$3 = fke.Q().aa();
               $$3.a((alj)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alj)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alj> c() {
         return this.aU;
      }

      public static gjp.i.a d() {
         return new gjp.i.a();
      }

      public static final class a {
         private final Builder<Triple<alj, Boolean, Boolean>> a = new Builder();

         public gjp.i.a a(alj $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gjp.i a() {
            return new gjp.i(this.a.build());
         }
      }
   }

   protected static final class j extends gjp.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gjp {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gjp.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fke.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fke.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gjp {
      private final Optional<gjy> aU;

      public m(gjy $$0) {
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

   protected static class n extends gjp.e {
      private final Optional<alj> aU;
      private final baq aV;
      private final boolean aW;

      public n(alj $$0, baq $$1, boolean $$2) {
         super(() -> {
            gzf $$3 = fke.Q().aa();
            gyp $$4 = $$3.a($$0);
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
      protected Optional<alj> c() {
         return this.aU;
      }
   }

   protected static class o extends gjp {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gjp {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gjp {
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
