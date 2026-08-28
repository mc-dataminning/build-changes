import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gpm {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gpm.p c = new gpm.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gpm.p d = new gpm.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gpm.p e = new gpm.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gpm.p f = new gpm.p(
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
   protected static final gpm.p g = new gpm.p(
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
   protected static final gpm.p h = new gpm.p(
      "overlay_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final gpm.p i = new gpm.p(
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
   protected static final gpm.p j = new gpm.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gpm.p k = new gpm.p(
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
   protected static final gpm.p l = new gpm.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gpm.p m = new gpm.p(
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
   protected static final gpm.m n = new gpm.m();
   protected static final gpm.m o = new gpm.m(gon.f);
   protected static final gpm.m p = new gpm.m(gon.d);
   protected static final gpm.m q = new gpm.m(gon.h);
   protected static final gpm.m r = new gpm.m(gon.g);
   protected static final gpm.m s = new gpm.m(gon.e);
   protected static final gpm.m t = new gpm.m(gon.i);
   protected static final gpm.m u = new gpm.m(gon.c);
   protected static final gpm.m v = new gpm.m(gon.j);
   protected static final gpm.m w = new gpm.m(gon.k);
   protected static final gpm.m x = new gpm.m(gon.l);
   protected static final gpm.m y = new gpm.m(gon.m);
   protected static final gpm.m z = new gpm.m(gon.n);
   protected static final gpm.m A = new gpm.m(gon.o);
   protected static final gpm.m B = new gpm.m(gon.p);
   protected static final gpm.m C = new gpm.m(gon.q);
   protected static final gpm.m D = new gpm.m(gon.r);
   protected static final gpm.m E = new gpm.m(gon.s);
   protected static final gpm.m F = new gpm.m(gon.t);
   protected static final gpm.m G = new gpm.m(gon.u);
   protected static final gpm.m H = new gpm.m(gon.v);
   protected static final gpm.m I = new gpm.m(gon.w);
   protected static final gpm.m J = new gpm.m(gon.x);
   protected static final gpm.m K = new gpm.m(gon.y);
   protected static final gpm.m L = new gpm.m(gon.z);
   protected static final gpm.m M = new gpm.m(gon.A);
   protected static final gpm.m N = new gpm.m(gon.B);
   protected static final gpm.m O = new gpm.m(gon.C);
   protected static final gpm.m P = new gpm.m(gon.D);
   protected static final gpm.m Q = new gpm.m(gon.E);
   protected static final gpm.m R = new gpm.m(gon.F);
   protected static final gpm.m S = new gpm.m(gon.G);
   protected static final gpm.m T = new gpm.m(gon.H);
   protected static final gpm.m U = new gpm.m(gon.I);
   protected static final gpm.m V = new gpm.m(gon.J);
   protected static final gpm.m W = new gpm.m(gon.K);
   protected static final gpm.m X = new gpm.m(gon.L);
   protected static final gpm.m Y = new gpm.m(gon.Y);
   protected static final gpm.m Z = new gpm.m(gon.M);
   protected static final gpm.m aa = new gpm.m(gon.N);
   protected static final gpm.m ab = new gpm.m(gon.O);
   protected static final gpm.m ac = new gpm.m(gon.P);
   protected static final gpm.m ad = new gpm.m(gon.Q);
   protected static final gpm.m ae = new gpm.m(gon.R);
   protected static final gpm.m af = new gpm.m(gon.S);
   protected static final gpm.m ag = new gpm.m(gon.T);
   protected static final gpm.m ah = new gpm.m(gon.U);
   protected static final gpm.m ai = new gpm.m(gon.V);
   protected static final gpm.m aj = new gpm.m(gon.W);
   protected static final gpm.m ak = new gpm.m(gon.X);
   protected static final gpm.m al = new gpm.m(gon.Z);
   protected static final gpm.m am = new gpm.m(gon.aa);
   protected static final gpm.m an = new gpm.m(gon.ab);
   protected static final gpm.m ao = new gpm.m(gon.ac);
   protected static final gpm.m ap = new gpm.m(gon.ad);
   protected static final gpm.n aq = new gpm.n(hhy.d, baq.b, true);
   protected static final gpm.n ar = new gpm.n(hhy.d, baq.b, false);
   protected static final gpm.e as = new gpm.e();
   protected static final gpm.o at = new gpm.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gpm.o au = new gpm.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gpm.o av = new gpm.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gpm.g aw = new gpm.g(true);
   protected static final gpm.g ax = new gpm.g(false);
   protected static final gpm.l ay = new gpm.l(true);
   protected static final gpm.l az = new gpm.l(false);
   protected static final gpm.c aA = new gpm.c(true);
   protected static final gpm.c aB = new gpm.c(false);
   protected static final gpm.d aC = new gpm.d("always", 519);
   protected static final gpm.d aD = new gpm.d("==", 514);
   protected static final gpm.d aE = new gpm.d("<=", 515);
   protected static final gpm.d aF = new gpm.d(">", 516);
   protected static final gpm.q aG = new gpm.q(true, true);
   protected static final gpm.q aH = new gpm.q(true, false);
   protected static final gpm.q aI = new gpm.q(false, true);
   protected static final gpm.f aJ = new gpm.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gpm.f aK = new gpm.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gpm.f aL = new gpm.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gpm.f aM = new gpm.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gpm.f aN = new gpm.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gpm.k aO = new gpm.k("main_target", () -> fof.Q().h().a(false), () -> {
   });
   protected static final gpm.k aP = new gpm.k("outline_target", () -> {
      fha $$0 = fof.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.k aQ = new gpm.k("translucent_target", () -> {
      fha $$0 = fof.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.k aR = new gpm.k("particles_target", () -> {
      fha $$0 = fof.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.k aS = new gpm.k("weather_target", () -> {
      fha $$0 = fof.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.k aT = new gpm.k("clouds_target", () -> {
      fha $$0 = fof.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.k aU = new gpm.k("item_entity_target", () -> {
      fha $$0 = fof.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fof.Q().h().a(false);
      }
   }, () -> fof.Q().h().a(false));
   protected static final gpm.h aV = new gpm.h(OptionalDouble.of(1.0));
   protected static final gpm.b aW = new gpm.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gpm.b aX = new gpm.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gpm(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aY = $$1;
      this.aZ = $$2;
   }

   public void a() {
      this.aY.run();
   }

   public void b() {
      this.aZ.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)af.c() * fof.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gpm {
      private final boolean aY;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aY = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class b extends gpm {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gpm.a {
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

   protected static class d extends gpm {
      private final String aY;

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
         this.aY = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class e extends gpm {
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

   protected static class f extends gpm {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gpm.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fof.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fof.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gpm {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fof.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aY = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aY.isPresent() ? this.aY.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends gpm.e {
      private final Optional<ale> aY;

      i(List<gpm.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gpm.i.b $$2 = $$0.get($$1);
               hib $$3 = fof.Q().aa();
               hhk $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aY = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<ale> c() {
         return this.aY;
      }

      public static gpm.i.a d() {
         return new gpm.i.a();
      }

      public static final class a {
         private final Builder<gpm.i.b> a = new Builder();

         public gpm.i.a a(ale $$0, boolean $$1, boolean $$2) {
            this.a.add(new gpm.i.b($$0, $$1, $$2));
            return this;
         }

         public gpm.i a() {
            return new gpm.i(this.a.build());
         }
      }

      static record b(ale a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gpm.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gpm {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gpm.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fof.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fof.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gpm {
      private final Optional<gpv> aY;

      public m(gpv $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aY = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aY = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "]";
      }
   }

   protected static class n extends gpm.e {
      private final Optional<ale> aY;
      private final baq aZ;
      private final boolean ba;

      public n(ale $$0, baq $$1, boolean $$2) {
         super(() -> {
            hib $$3 = fof.Q().aa();
            hhk $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.a());
         }, () -> {
         });
         this.aY = Optional.of($$0);
         this.aZ = $$1;
         this.ba = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aY + "(blur=" + this.aZ + ", mipmap=" + this.ba + ")]";
      }

      @Override
      protected Optional<ale> c() {
         return this.aY;
      }
   }

   protected static class o extends gpm {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gpm {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gpm {
      private final boolean aY;
      private final boolean aZ;

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
         this.aY = $$0;
         this.aZ = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aY + ", writeDepth=" + this.aZ + "]";
      }
   }
}
