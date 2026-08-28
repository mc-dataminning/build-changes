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

public abstract class gif {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final gif.p c = new gif.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gif.p d = new gif.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gif.p e = new gif.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gif.p f = new gif.p(
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
   protected static final gif.p g = new gif.p(
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
   protected static final gif.p h = new gif.p(
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
   protected static final gif.p i = new gif.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gif.p j = new gif.p(
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
   protected static final gif.p k = new gif.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gif.p l = new gif.p(
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
   protected static final gif.m m = new gif.m();
   protected static final gif.m n = new gif.m(ghg.f);
   protected static final gif.m o = new gif.m(ghg.d);
   protected static final gif.m p = new gif.m(ghg.h);
   protected static final gif.m q = new gif.m(ghg.g);
   protected static final gif.m r = new gif.m(ghg.e);
   protected static final gif.m s = new gif.m(ghg.i);
   protected static final gif.m t = new gif.m(ghg.j);
   protected static final gif.m u = new gif.m(ghg.k);
   protected static final gif.m v = new gif.m(ghg.l);
   protected static final gif.m w = new gif.m(ghg.m);
   protected static final gif.m x = new gif.m(ghg.n);
   protected static final gif.m y = new gif.m(ghg.o);
   protected static final gif.m z = new gif.m(ghg.p);
   protected static final gif.m A = new gif.m(ghg.q);
   protected static final gif.m B = new gif.m(ghg.r);
   protected static final gif.m C = new gif.m(ghg.s);
   protected static final gif.m D = new gif.m(ghg.t);
   protected static final gif.m E = new gif.m(ghg.u);
   protected static final gif.m F = new gif.m(ghg.v);
   protected static final gif.m G = new gif.m(ghg.w);
   protected static final gif.m H = new gif.m(ghg.x);
   protected static final gif.m I = new gif.m(ghg.y);
   protected static final gif.m J = new gif.m(ghg.z);
   protected static final gif.m K = new gif.m(ghg.A);
   protected static final gif.m L = new gif.m(ghg.B);
   protected static final gif.m M = new gif.m(ghg.C);
   protected static final gif.m N = new gif.m(ghg.D);
   protected static final gif.m O = new gif.m(ghg.E);
   protected static final gif.m P = new gif.m(ghg.F);
   protected static final gif.m Q = new gif.m(ghg.G);
   protected static final gif.m R = new gif.m(ghg.H);
   protected static final gif.m S = new gif.m(ghg.I);
   protected static final gif.m T = new gif.m(ghg.J);
   protected static final gif.m U = new gif.m(ghg.K);
   protected static final gif.m V = new gif.m(ghg.X);
   protected static final gif.m W = new gif.m(ghg.L);
   protected static final gif.m X = new gif.m(ghg.M);
   protected static final gif.m Y = new gif.m(ghg.N);
   protected static final gif.m Z = new gif.m(ghg.O);
   protected static final gif.m aa = new gif.m(ghg.P);
   protected static final gif.m ab = new gif.m(ghg.Q);
   protected static final gif.m ac = new gif.m(ghg.R);
   protected static final gif.m ad = new gif.m(ghg.S);
   protected static final gif.m ae = new gif.m(ghg.T);
   protected static final gif.m af = new gif.m(ghg.U);
   protected static final gif.m ag = new gif.m(ghg.V);
   protected static final gif.m ah = new gif.m(ghg.W);
   protected static final gif.m ai = new gif.m(ghg.Y);
   protected static final gif.m aj = new gif.m(ghg.Z);
   protected static final gif.m ak = new gif.m(ghg.aa);
   protected static final gif.m al = new gif.m(ghg.ab);
   protected static final gif.m am = new gif.m(ghg.ac);
   protected static final gif.n an = new gif.n(gxr.d, bam.b, true);
   protected static final gif.n ao = new gif.n(gxr.d, bam.b, false);
   protected static final gif.e ap = new gif.e();
   protected static final gif.o aq = new gif.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gif.o ar = new gif.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gif.o as = new gif.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gif.g at = new gif.g(true);
   protected static final gif.g au = new gif.g(false);
   protected static final gif.l av = new gif.l(true);
   protected static final gif.l aw = new gif.l(false);
   protected static final gif.c ax = new gif.c(true);
   protected static final gif.c ay = new gif.c(false);
   protected static final gif.d az = new gif.d("always", 519);
   protected static final gif.d aA = new gif.d("==", 514);
   protected static final gif.d aB = new gif.d("<=", 515);
   protected static final gif.d aC = new gif.d(">", 516);
   protected static final gif.q aD = new gif.q(true, true);
   protected static final gif.q aE = new gif.q(true, false);
   protected static final gif.q aF = new gif.q(false, true);
   protected static final gif.f aG = new gif.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gif.f aH = new gif.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gif.f aI = new gif.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gif.f aJ = new gif.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gif.k aK = new gif.k("main_target", () -> fja.Q().h().a(false), () -> {
   });
   protected static final gif.k aL = new gif.k("outline_target", () -> fja.Q().f.q().a(false), () -> fja.Q().h().a(false));
   protected static final gif.k aM = new gif.k("translucent_target", () -> {
      fcd $$0 = fja.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fja.Q().h().a(false);
      }
   }, () -> fja.Q().h().a(false));
   protected static final gif.k aN = new gif.k("particles_target", () -> {
      fcd $$0 = fja.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fja.Q().h().a(false);
      }
   }, () -> fja.Q().h().a(false));
   protected static final gif.k aO = new gif.k("weather_target", () -> {
      fcd $$0 = fja.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fja.Q().h().a(false);
      }
   }, () -> fja.Q().h().a(false));
   protected static final gif.k aP = new gif.k("clouds_target", () -> {
      fcd $$0 = fja.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fja.Q().h().a(false);
      }
   }, () -> fja.Q().h().a(false));
   protected static final gif.k aQ = new gif.k("item_entity_target", () -> {
      fcd $$0 = fja.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fja.Q().h().a(false);
      }
   }, () -> fja.Q().h().a(false));
   protected static final gif.h aR = new gif.h(OptionalDouble.of(1.0));
   protected static final gif.b aS = new gif.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gif.b aT = new gif.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gif(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ad.c() * fja.Q().n.ao().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gif {
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

   protected static class b extends gif {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gif.a {
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

   protected static class d extends gif {
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

   protected static class e extends gif {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alh> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gif {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gif.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fja.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fja.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gif {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fja.Q().aP().l() / 1920.0F * 2.5F));
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

   protected static class i extends gif.e {
      private final Optional<alh> aU;

      i(ImmutableList<Triple<alh, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alh, Boolean, Boolean> $$2 = (Triple<alh, Boolean, Boolean>)var2.next();
               gxt $$3 = fja.Q().aa();
               $$3.a((alh)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alh)$$2.getLeft());
            }
         }, () -> {
         });
         this.aU = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alh> c() {
         return this.aU;
      }

      public static gif.i.a d() {
         return new gif.i.a();
      }

      public static final class a {
         private final Builder<Triple<alh, Boolean, Boolean>> a = new Builder();

         public gif.i.a a(alh $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gif.i a() {
            return new gif.i(this.a.build());
         }
      }
   }

   protected static final class j extends gif.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gif {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gif.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fja.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fja.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gif {
      private final Optional<gio> aU;

      public m(gio $$0) {
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

   protected static class n extends gif.e {
      private final Optional<alh> aU;
      private final bam aV;
      private final boolean aW;

      public n(alh $$0, bam $$1, boolean $$2) {
         super(() -> {
            gxt $$3 = fja.Q().aa();
            gxd $$4 = $$3.a($$0);
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
      protected Optional<alh> c() {
         return this.aU;
      }
   }

   protected static class o extends gif {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gif {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gif {
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
