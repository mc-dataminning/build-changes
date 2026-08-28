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

public abstract class gln {
   private static final float aU = 2.4414062E-4F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aV;
   private final Runnable aW;
   protected static final gln.p c = new gln.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gln.p d = new gln.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gln.p e = new gln.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gln.p f = new gln.p(
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
   protected static final gln.p g = new gln.p(
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
   protected static final gln.p h = new gln.p(
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
   protected static final gln.p i = new gln.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gln.p j = new gln.p(
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
   protected static final gln.p k = new gln.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gln.p l = new gln.p(
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
   protected static final gln.m m = new gln.m();
   protected static final gln.m n = new gln.m(gko.f);
   protected static final gln.m o = new gln.m(gko.d);
   protected static final gln.m p = new gln.m(gko.h);
   protected static final gln.m q = new gln.m(gko.g);
   protected static final gln.m r = new gln.m(gko.e);
   protected static final gln.m s = new gln.m(gko.i);
   protected static final gln.m t = new gln.m(gko.j);
   protected static final gln.m u = new gln.m(gko.k);
   protected static final gln.m v = new gln.m(gko.l);
   protected static final gln.m w = new gln.m(gko.m);
   protected static final gln.m x = new gln.m(gko.n);
   protected static final gln.m y = new gln.m(gko.o);
   protected static final gln.m z = new gln.m(gko.p);
   protected static final gln.m A = new gln.m(gko.q);
   protected static final gln.m B = new gln.m(gko.r);
   protected static final gln.m C = new gln.m(gko.s);
   protected static final gln.m D = new gln.m(gko.t);
   protected static final gln.m E = new gln.m(gko.u);
   protected static final gln.m F = new gln.m(gko.v);
   protected static final gln.m G = new gln.m(gko.w);
   protected static final gln.m H = new gln.m(gko.x);
   protected static final gln.m I = new gln.m(gko.y);
   protected static final gln.m J = new gln.m(gko.z);
   protected static final gln.m K = new gln.m(gko.A);
   protected static final gln.m L = new gln.m(gko.B);
   protected static final gln.m M = new gln.m(gko.C);
   protected static final gln.m N = new gln.m(gko.D);
   protected static final gln.m O = new gln.m(gko.E);
   protected static final gln.m P = new gln.m(gko.F);
   protected static final gln.m Q = new gln.m(gko.G);
   protected static final gln.m R = new gln.m(gko.H);
   protected static final gln.m S = new gln.m(gko.I);
   protected static final gln.m T = new gln.m(gko.J);
   protected static final gln.m U = new gln.m(gko.K);
   protected static final gln.m V = new gln.m(gko.X);
   protected static final gln.m W = new gln.m(gko.L);
   protected static final gln.m X = new gln.m(gko.M);
   protected static final gln.m Y = new gln.m(gko.N);
   protected static final gln.m Z = new gln.m(gko.O);
   protected static final gln.m aa = new gln.m(gko.P);
   protected static final gln.m ab = new gln.m(gko.Q);
   protected static final gln.m ac = new gln.m(gko.R);
   protected static final gln.m ad = new gln.m(gko.S);
   protected static final gln.m ae = new gln.m(gko.T);
   protected static final gln.m af = new gln.m(gko.U);
   protected static final gln.m ag = new gln.m(gko.V);
   protected static final gln.m ah = new gln.m(gko.W);
   protected static final gln.m ai = new gln.m(gko.Y);
   protected static final gln.m aj = new gln.m(gko.Z);
   protected static final gln.m ak = new gln.m(gko.aa);
   protected static final gln.m al = new gln.m(gko.ab);
   protected static final gln.m am = new gln.m(gko.ac);
   protected static final gln.n an = new gln.n(hbd.d, bbi.b, true);
   protected static final gln.n ao = new gln.n(hbd.d, bbi.b, false);
   protected static final gln.e ap = new gln.e();
   protected static final gln.o aq = new gln.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gln.o ar = new gln.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gln.o as = new gln.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gln.g at = new gln.g(true);
   protected static final gln.g au = new gln.g(false);
   protected static final gln.l av = new gln.l(true);
   protected static final gln.l aw = new gln.l(false);
   protected static final gln.c ax = new gln.c(true);
   protected static final gln.c ay = new gln.c(false);
   protected static final gln.d az = new gln.d("always", 519);
   protected static final gln.d aA = new gln.d("==", 514);
   protected static final gln.d aB = new gln.d("<=", 515);
   protected static final gln.d aC = new gln.d(">", 516);
   protected static final gln.q aD = new gln.q(true, true);
   protected static final gln.q aE = new gln.q(true, false);
   protected static final gln.q aF = new gln.q(false, true);
   protected static final gln.f aG = new gln.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gln.f aH = new gln.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gln.f aI = new gln.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(0.99975586F, 0.99975586F, 0.99975586F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gln.f aJ = new gln.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.scale(1.0002441F, 1.0002441F, 1.0002441F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gln.k aK = new gln.k("main_target", () -> flz.Q().h().a(false), () -> {
   });
   protected static final gln.k aL = new gln.k("outline_target", () -> {
      fev $$0 = flz.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.k aM = new gln.k("translucent_target", () -> {
      fev $$0 = flz.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.k aN = new gln.k("particles_target", () -> {
      fev $$0 = flz.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.k aO = new gln.k("weather_target", () -> {
      fev $$0 = flz.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.k aP = new gln.k("clouds_target", () -> {
      fev $$0 = flz.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.k aQ = new gln.k("item_entity_target", () -> {
      fev $$0 = flz.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final gln.h aR = new gln.h(OptionalDouble.of(1.0));
   protected static final gln.b aS = new gln.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gln.b aT = new gln.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gln(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * flz.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gln {
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

   protected static class b extends gln {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gln.a {
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

   protected static class d extends gln {
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

   protected static class e extends gln {
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

   protected static class f extends gln {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gln.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               flz.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               flz.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gln {
      private final OptionalDouble aU;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)flz.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gln.e {
      private final Optional<alz> aU;

      i(ImmutableList<Triple<alz, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alz, Boolean, Boolean> $$2 = (Triple<alz, Boolean, Boolean>)var2.next();
               hbf $$3 = flz.Q().aa();
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

      public static gln.i.a d() {
         return new gln.i.a();
      }

      public static final class a {
         private final Builder<Triple<alz, Boolean, Boolean>> a = new Builder();

         public gln.i.a a(alz $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gln.i a() {
            return new gln.i(this.a.build());
         }
      }
   }

   protected static final class j extends gln.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gln {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gln.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               flz.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               flz.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gln {
      private final Optional<glw> aU;

      public m(glw $$0) {
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

   protected static class n extends gln.e {
      private final Optional<alz> aU;
      private final bbi aV;
      private final boolean aW;

      public n(alz $$0, bbi $$1, boolean $$2) {
         super(() -> {
            hbf $$3 = flz.Q().aa();
            hap $$4 = $$3.a($$0);
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

   protected static class o extends gln {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gln {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gln {
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
