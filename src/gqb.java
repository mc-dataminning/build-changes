import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gqb {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gqb.p c = new gqb.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gqb.p d = new gqb.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqb.p e = new gqb.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqb.p f = new gqb.p(
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
   protected static final gqb.p g = new gqb.p(
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
   protected static final gqb.p h = new gqb.p(
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
   protected static final gqb.p i = new gqb.p(
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
   protected static final gqb.p j = new gqb.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqb.p k = new gqb.p(
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
   protected static final gqb.p l = new gqb.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqb.p m = new gqb.p(
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
   protected static final gqb.m n = new gqb.m();
   protected static final gqb.m o = new gqb.m(gpc.f);
   protected static final gqb.m p = new gqb.m(gpc.d);
   protected static final gqb.m q = new gqb.m(gpc.h);
   protected static final gqb.m r = new gqb.m(gpc.g);
   protected static final gqb.m s = new gqb.m(gpc.e);
   protected static final gqb.m t = new gqb.m(gpc.i);
   protected static final gqb.m u = new gqb.m(gpc.c);
   protected static final gqb.m v = new gqb.m(gpc.j);
   protected static final gqb.m w = new gqb.m(gpc.k);
   protected static final gqb.m x = new gqb.m(gpc.l);
   protected static final gqb.m y = new gqb.m(gpc.m);
   protected static final gqb.m z = new gqb.m(gpc.n);
   protected static final gqb.m A = new gqb.m(gpc.o);
   protected static final gqb.m B = new gqb.m(gpc.p);
   protected static final gqb.m C = new gqb.m(gpc.q);
   protected static final gqb.m D = new gqb.m(gpc.r);
   protected static final gqb.m E = new gqb.m(gpc.s);
   protected static final gqb.m F = new gqb.m(gpc.t);
   protected static final gqb.m G = new gqb.m(gpc.u);
   protected static final gqb.m H = new gqb.m(gpc.v);
   protected static final gqb.m I = new gqb.m(gpc.w);
   protected static final gqb.m J = new gqb.m(gpc.x);
   protected static final gqb.m K = new gqb.m(gpc.y);
   protected static final gqb.m L = new gqb.m(gpc.z);
   protected static final gqb.m M = new gqb.m(gpc.A);
   protected static final gqb.m N = new gqb.m(gpc.B);
   protected static final gqb.m O = new gqb.m(gpc.C);
   protected static final gqb.m P = new gqb.m(gpc.D);
   protected static final gqb.m Q = new gqb.m(gpc.E);
   protected static final gqb.m R = new gqb.m(gpc.F);
   protected static final gqb.m S = new gqb.m(gpc.G);
   protected static final gqb.m T = new gqb.m(gpc.H);
   protected static final gqb.m U = new gqb.m(gpc.I);
   protected static final gqb.m V = new gqb.m(gpc.J);
   protected static final gqb.m W = new gqb.m(gpc.K);
   protected static final gqb.m X = new gqb.m(gpc.L);
   protected static final gqb.m Y = new gqb.m(gpc.Y);
   protected static final gqb.m Z = new gqb.m(gpc.M);
   protected static final gqb.m aa = new gqb.m(gpc.N);
   protected static final gqb.m ab = new gqb.m(gpc.O);
   protected static final gqb.m ac = new gqb.m(gpc.P);
   protected static final gqb.m ad = new gqb.m(gpc.Q);
   protected static final gqb.m ae = new gqb.m(gpc.R);
   protected static final gqb.m af = new gqb.m(gpc.S);
   protected static final gqb.m ag = new gqb.m(gpc.T);
   protected static final gqb.m ah = new gqb.m(gpc.U);
   protected static final gqb.m ai = new gqb.m(gpc.V);
   protected static final gqb.m aj = new gqb.m(gpc.W);
   protected static final gqb.m ak = new gqb.m(gpc.X);
   protected static final gqb.m al = new gqb.m(gpc.Z);
   protected static final gqb.m am = new gqb.m(gpc.aa);
   protected static final gqb.m an = new gqb.m(gpc.ab);
   protected static final gqb.m ao = new gqb.m(gpc.ac);
   protected static final gqb.m ap = new gqb.m(gpc.ad);
   protected static final gqb.n aq = new gqb.n(hio.d, bas.b, true);
   protected static final gqb.n ar = new gqb.n(hio.d, bas.b, false);
   protected static final gqb.e as = new gqb.e();
   protected static final gqb.o at = new gqb.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gqb.o au = new gqb.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqb.o av = new gqb.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqb.g aw = new gqb.g(true);
   protected static final gqb.g ax = new gqb.g(false);
   protected static final gqb.l ay = new gqb.l(true);
   protected static final gqb.l az = new gqb.l(false);
   protected static final gqb.c aA = new gqb.c(true);
   protected static final gqb.c aB = new gqb.c(false);
   protected static final gqb.d aC = new gqb.d("always", 519);
   protected static final gqb.d aD = new gqb.d("==", 514);
   protected static final gqb.d aE = new gqb.d("<=", 515);
   protected static final gqb.d aF = new gqb.d(">", 516);
   protected static final gqb.q aG = new gqb.q(true, true);
   protected static final gqb.q aH = new gqb.q(true, false);
   protected static final gqb.q aI = new gqb.q(false, true);
   protected static final gqb.f aJ = new gqb.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gqb.f aK = new gqb.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqb.f aL = new gqb.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqb.f aM = new gqb.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqb.f aN = new gqb.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqb.k aO = new gqb.k("main_target", () -> fos.Q().h().a(false), () -> {
   });
   protected static final gqb.k aP = new gqb.k("outline_target", () -> {
      fhm $$0 = fos.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.k aQ = new gqb.k("translucent_target", () -> {
      fhm $$0 = fos.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.k aR = new gqb.k("particles_target", () -> {
      fhm $$0 = fos.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.k aS = new gqb.k("weather_target", () -> {
      fhm $$0 = fos.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.k aT = new gqb.k("clouds_target", () -> {
      fhm $$0 = fos.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.k aU = new gqb.k("item_entity_target", () -> {
      fhm $$0 = fos.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fos.Q().h().a(false);
      }
   }, () -> fos.Q().h().a(false));
   protected static final gqb.h aV = new gqb.h(OptionalDouble.of(1.0));
   protected static final gqb.b aW = new gqb.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gqb.b aX = new gqb.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gqb(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)af.c() * fos.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gqb {
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

   protected static class b extends gqb {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gqb.a {
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

   protected static class d extends gqb {
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

   protected static class e extends gqb {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alg> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gqb {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gqb.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fos.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               fos.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gqb {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fos.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gqb.e {
      private final Optional<alg> aY;

      i(List<gqb.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gqb.i.b $$2 = $$0.get($$1);
               hir $$3 = fos.Q().aa();
               hia $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aY = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alg> c() {
         return this.aY;
      }

      public static gqb.i.a d() {
         return new gqb.i.a();
      }

      public static final class a {
         private final Builder<gqb.i.b> a = new Builder();

         public gqb.i.a a(alg $$0, boolean $$1, boolean $$2) {
            this.a.add(new gqb.i.b($$0, $$1, $$2));
            return this;
         }

         public gqb.i a() {
            return new gqb.i(this.a.build());
         }
      }

      static record b(alg a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gqb.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gqb {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gqb.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fos.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fos.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gqb {
      private final Optional<gqk> aY;

      public m(gqk $$0) {
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

   protected static class n extends gqb.e {
      private final Optional<alg> aY;
      private final bas aZ;
      private final boolean ba;

      public n(alg $$0, bas $$1, boolean $$2) {
         super(() -> {
            hir $$3 = fos.Q().aa();
            hia $$4 = $$3.b($$0);
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
      protected Optional<alg> c() {
         return this.aY;
      }
   }

   protected static class o extends gqb {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gqb {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gqb {
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
