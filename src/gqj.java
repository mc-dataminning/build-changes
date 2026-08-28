import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gqj {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aZ;
   private final Runnable ba;
   protected static final gqj.p c = new gqj.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gqj.p d = new gqj.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqj.p e = new gqj.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqj.p f = new gqj.p(
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
   protected static final gqj.p g = new gqj.p(
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
   protected static final gqj.p h = new gqj.p(
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
   protected static final gqj.p i = new gqj.p(
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
   protected static final gqj.p j = new gqj.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqj.p k = new gqj.p(
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
   protected static final gqj.p l = new gqj.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gqj.p m = new gqj.p(
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
   protected static final gqj.m n = new gqj.m();
   protected static final gqj.m o = new gqj.m(gpk.f);
   protected static final gqj.m p = new gqj.m(gpk.d);
   protected static final gqj.m q = new gqj.m(gpk.h);
   protected static final gqj.m r = new gqj.m(gpk.g);
   protected static final gqj.m s = new gqj.m(gpk.e);
   protected static final gqj.m t = new gqj.m(gpk.i);
   protected static final gqj.m u = new gqj.m(gpk.c);
   protected static final gqj.m v = new gqj.m(gpk.j);
   protected static final gqj.m w = new gqj.m(gpk.k);
   protected static final gqj.m x = new gqj.m(gpk.l);
   protected static final gqj.m y = new gqj.m(gpk.m);
   protected static final gqj.m z = new gqj.m(gpk.n);
   protected static final gqj.m A = new gqj.m(gpk.o);
   protected static final gqj.m B = new gqj.m(gpk.p);
   protected static final gqj.m C = new gqj.m(gpk.q);
   protected static final gqj.m D = new gqj.m(gpk.r);
   protected static final gqj.m E = new gqj.m(gpk.s);
   protected static final gqj.m F = new gqj.m(gpk.t);
   protected static final gqj.m G = new gqj.m(gpk.u);
   protected static final gqj.m H = new gqj.m(gpk.v);
   protected static final gqj.m I = new gqj.m(gpk.w);
   protected static final gqj.m J = new gqj.m(gpk.x);
   protected static final gqj.m K = new gqj.m(gpk.y);
   protected static final gqj.m L = new gqj.m(gpk.z);
   protected static final gqj.m M = new gqj.m(gpk.A);
   protected static final gqj.m N = new gqj.m(gpk.B);
   protected static final gqj.m O = new gqj.m(gpk.C);
   protected static final gqj.m P = new gqj.m(gpk.D);
   protected static final gqj.m Q = new gqj.m(gpk.E);
   protected static final gqj.m R = new gqj.m(gpk.F);
   protected static final gqj.m S = new gqj.m(gpk.G);
   protected static final gqj.m T = new gqj.m(gpk.H);
   protected static final gqj.m U = new gqj.m(gpk.I);
   protected static final gqj.m V = new gqj.m(gpk.J);
   protected static final gqj.m W = new gqj.m(gpk.K);
   protected static final gqj.m X = new gqj.m(gpk.L);
   protected static final gqj.m Y = new gqj.m(gpk.Z);
   protected static final gqj.m Z = new gqj.m(gpk.M);
   protected static final gqj.m aa = new gqj.m(gpk.N);
   protected static final gqj.m ab = new gqj.m(gpk.O);
   protected static final gqj.m ac = new gqj.m(gpk.P);
   protected static final gqj.m ad = new gqj.m(gpk.Q);
   protected static final gqj.m ae = new gqj.m(gpk.R);
   protected static final gqj.m af = new gqj.m(gpk.S);
   protected static final gqj.m ag = new gqj.m(gpk.T);
   protected static final gqj.m ah = new gqj.m(gpk.U);
   protected static final gqj.m ai = new gqj.m(gpk.V);
   protected static final gqj.m aj = new gqj.m(gpk.W);
   protected static final gqj.m ak = new gqj.m(gpk.X);
   protected static final gqj.m al = new gqj.m(gpk.Y);
   protected static final gqj.m am = new gqj.m(gpk.aa);
   protected static final gqj.m an = new gqj.m(gpk.ab);
   protected static final gqj.m ao = new gqj.m(gpk.ac);
   protected static final gqj.m ap = new gqj.m(gpk.ad);
   protected static final gqj.m aq = new gqj.m(gpk.ae);
   protected static final gqj.n ar = new gqj.n(hiw.d, bas.b, true);
   protected static final gqj.n as = new gqj.n(hiw.d, bas.b, false);
   protected static final gqj.e at = new gqj.e();
   protected static final gqj.o au = new gqj.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gqj.o av = new gqj.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqj.o aw = new gqj.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqj.g ax = new gqj.g(true);
   protected static final gqj.g ay = new gqj.g(false);
   protected static final gqj.l az = new gqj.l(true);
   protected static final gqj.l aA = new gqj.l(false);
   protected static final gqj.c aB = new gqj.c(true);
   protected static final gqj.c aC = new gqj.c(false);
   protected static final gqj.d aD = new gqj.d("always", 519);
   protected static final gqj.d aE = new gqj.d("==", 514);
   protected static final gqj.d aF = new gqj.d("<=", 515);
   protected static final gqj.d aG = new gqj.d(">", 516);
   protected static final gqj.q aH = new gqj.q(true, true);
   protected static final gqj.q aI = new gqj.q(true, false);
   protected static final gqj.q aJ = new gqj.q(false, true);
   protected static final gqj.f aK = new gqj.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gqj.f aL = new gqj.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqj.f aM = new gqj.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqj.f aN = new gqj.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqj.f aO = new gqj.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqj.k aP = new gqj.k("main_target", () -> foz.Q().h().a(false), () -> {
   });
   protected static final gqj.k aQ = new gqj.k("outline_target", () -> {
      fhu $$0 = foz.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.k aR = new gqj.k("translucent_target", () -> {
      fhu $$0 = foz.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.k aS = new gqj.k("particles_target", () -> {
      fhu $$0 = foz.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.k aT = new gqj.k("weather_target", () -> {
      fhu $$0 = foz.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.k aU = new gqj.k("clouds_target", () -> {
      fhu $$0 = foz.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.k aV = new gqj.k("item_entity_target", () -> {
      fhu $$0 = foz.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         foz.Q().h().a(false);
      }
   }, () -> foz.Q().h().a(false));
   protected static final gqj.h aW = new gqj.h(OptionalDouble.of(1.0));
   protected static final gqj.b aX = new gqj.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gqj.b aY = new gqj.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gqj(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aZ = $$1;
      this.ba = $$2;
   }

   public void a() {
      this.aZ.run();
   }

   public void b() {
      this.ba.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)af.c() * foz.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gqj {
      private final boolean aZ;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aZ = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aZ + "]";
      }
   }

   protected static class b extends gqj {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gqj.a {
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

   protected static class d extends gqj {
      private final String aZ;

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
         this.aZ = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aZ + "]";
      }
   }

   protected static class e extends gqj {
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

   protected static class f extends gqj {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gqj.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               foz.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               foz.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gqj {
      private final OptionalDouble aZ;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)foz.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aZ = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aZ.isPresent() ? this.aZ.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends gqj.e {
      private final Optional<alg> aZ;

      i(List<gqj.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gqj.i.b $$2 = $$0.get($$1);
               hiz $$3 = foz.Q().aa();
               hii $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aZ = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alg> c() {
         return this.aZ;
      }

      public static gqj.i.a d() {
         return new gqj.i.a();
      }

      public static final class a {
         private final Builder<gqj.i.b> a = new Builder();

         public gqj.i.a a(alg $$0, boolean $$1, boolean $$2) {
            this.a.add(new gqj.i.b($$0, $$1, $$2));
            return this;
         }

         public gqj.i a() {
            return new gqj.i(this.a.build());
         }
      }

      static record b(alg a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gqj.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gqj {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gqj.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               foz.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               foz.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gqj {
      private final Optional<gqs> aZ;

      public m(gqs $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aZ = Optional.of($$0);
      }

      public m() {
         super("shader", RenderSystem::clearShader, () -> {
         });
         this.aZ = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aZ + "]";
      }
   }

   protected static class n extends gqj.e {
      private final Optional<alg> aZ;
      private final bas ba;
      private final boolean bb;

      public n(alg $$0, bas $$1, boolean $$2) {
         super(() -> {
            hiz $$3 = foz.Q().aa();
            hii $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.a());
         }, () -> {
         });
         this.aZ = Optional.of($$0);
         this.ba = $$1;
         this.bb = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aZ + "(blur=" + this.ba + ", mipmap=" + this.bb + ")]";
      }

      @Override
      protected Optional<alg> c() {
         return this.aZ;
      }
   }

   protected static class o extends gqj {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gqj {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gqj {
      private final boolean aZ;
      private final boolean ba;

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
         this.aZ = $$0;
         this.ba = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aZ + ", writeDepth=" + this.ba + "]";
      }
   }
}
