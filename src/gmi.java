import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gmi {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gmi.p c = new gmi.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gmi.p d = new gmi.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmi.p e = new gmi.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmi.p f = new gmi.p(
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
   protected static final gmi.p g = new gmi.p(
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
   protected static final gmi.p h = new gmi.p(
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
   protected static final gmi.p i = new gmi.p(
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
   protected static final gmi.p j = new gmi.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmi.p k = new gmi.p(
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
   protected static final gmi.p l = new gmi.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmi.p m = new gmi.p(
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
   protected static final gmi.m n = new gmi.m();
   protected static final gmi.m o = new gmi.m(glk.f);
   protected static final gmi.m p = new gmi.m(glk.d);
   protected static final gmi.m q = new gmi.m(glk.h);
   protected static final gmi.m r = new gmi.m(glk.g);
   protected static final gmi.m s = new gmi.m(glk.e);
   protected static final gmi.m t = new gmi.m(glk.i);
   protected static final gmi.m u = new gmi.m(glk.c);
   protected static final gmi.m v = new gmi.m(glk.j);
   protected static final gmi.m w = new gmi.m(glk.k);
   protected static final gmi.m x = new gmi.m(glk.l);
   protected static final gmi.m y = new gmi.m(glk.m);
   protected static final gmi.m z = new gmi.m(glk.n);
   protected static final gmi.m A = new gmi.m(glk.o);
   protected static final gmi.m B = new gmi.m(glk.p);
   protected static final gmi.m C = new gmi.m(glk.q);
   protected static final gmi.m D = new gmi.m(glk.r);
   protected static final gmi.m E = new gmi.m(glk.s);
   protected static final gmi.m F = new gmi.m(glk.t);
   protected static final gmi.m G = new gmi.m(glk.u);
   protected static final gmi.m H = new gmi.m(glk.v);
   protected static final gmi.m I = new gmi.m(glk.w);
   protected static final gmi.m J = new gmi.m(glk.x);
   protected static final gmi.m K = new gmi.m(glk.y);
   protected static final gmi.m L = new gmi.m(glk.z);
   protected static final gmi.m M = new gmi.m(glk.A);
   protected static final gmi.m N = new gmi.m(glk.B);
   protected static final gmi.m O = new gmi.m(glk.C);
   protected static final gmi.m P = new gmi.m(glk.D);
   protected static final gmi.m Q = new gmi.m(glk.E);
   protected static final gmi.m R = new gmi.m(glk.F);
   protected static final gmi.m S = new gmi.m(glk.G);
   protected static final gmi.m T = new gmi.m(glk.H);
   protected static final gmi.m U = new gmi.m(glk.I);
   protected static final gmi.m V = new gmi.m(glk.J);
   protected static final gmi.m W = new gmi.m(glk.K);
   protected static final gmi.m X = new gmi.m(glk.L);
   protected static final gmi.m Y = new gmi.m(glk.Y);
   protected static final gmi.m Z = new gmi.m(glk.M);
   protected static final gmi.m aa = new gmi.m(glk.N);
   protected static final gmi.m ab = new gmi.m(glk.O);
   protected static final gmi.m ac = new gmi.m(glk.P);
   protected static final gmi.m ad = new gmi.m(glk.Q);
   protected static final gmi.m ae = new gmi.m(glk.R);
   protected static final gmi.m af = new gmi.m(glk.S);
   protected static final gmi.m ag = new gmi.m(glk.T);
   protected static final gmi.m ah = new gmi.m(glk.U);
   protected static final gmi.m ai = new gmi.m(glk.V);
   protected static final gmi.m aj = new gmi.m(glk.W);
   protected static final gmi.m ak = new gmi.m(glk.X);
   protected static final gmi.m al = new gmi.m(glk.Z);
   protected static final gmi.m am = new gmi.m(glk.aa);
   protected static final gmi.m an = new gmi.m(glk.ab);
   protected static final gmi.m ao = new gmi.m(glk.ac);
   protected static final gmi.m ap = new gmi.m(glk.ad);
   protected static final gmi.n aq = new gmi.n(hes.d, bad.b, true);
   protected static final gmi.n ar = new gmi.n(hes.d, bad.b, false);
   protected static final gmi.e as = new gmi.e();
   protected static final gmi.o at = new gmi.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gmi.o au = new gmi.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmi.o av = new gmi.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmi.g aw = new gmi.g(true);
   protected static final gmi.g ax = new gmi.g(false);
   protected static final gmi.l ay = new gmi.l(true);
   protected static final gmi.l az = new gmi.l(false);
   protected static final gmi.c aA = new gmi.c(true);
   protected static final gmi.c aB = new gmi.c(false);
   protected static final gmi.d aC = new gmi.d("always", 519);
   protected static final gmi.d aD = new gmi.d("==", 514);
   protected static final gmi.d aE = new gmi.d("<=", 515);
   protected static final gmi.d aF = new gmi.d(">", 516);
   protected static final gmi.q aG = new gmi.q(true, true);
   protected static final gmi.q aH = new gmi.q(true, false);
   protected static final gmi.q aI = new gmi.q(false, true);
   protected static final gmi.f aJ = new gmi.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gmi.f aK = new gmi.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmi.f aL = new gmi.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmi.f aM = new gmi.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmi.f aN = new gmi.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmi.k aO = new gmi.k("main_target", () -> flk.Q().h().a(false), () -> {
   });
   protected static final gmi.k aP = new gmi.k("outline_target", () -> {
      fef $$0 = flk.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.k aQ = new gmi.k("translucent_target", () -> {
      fef $$0 = flk.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.k aR = new gmi.k("particles_target", () -> {
      fef $$0 = flk.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.k aS = new gmi.k("weather_target", () -> {
      fef $$0 = flk.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.k aT = new gmi.k("clouds_target", () -> {
      fef $$0 = flk.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.k aU = new gmi.k("item_entity_target", () -> {
      fef $$0 = flk.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flk.Q().h().a(false);
      }
   }, () -> flk.Q().h().a(false));
   protected static final gmi.h aV = new gmi.h(OptionalDouble.of(1.0));
   protected static final gmi.b aW = new gmi.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gmi.b aX = new gmi.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gmi(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)af.c() * flk.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gmi {
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

   protected static class b extends gmi {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gmi.a {
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

   protected static class d extends gmi {
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

   protected static class e extends gmi {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<akv> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gmi {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gmi.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               flk.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               flk.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gmi {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)flk.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gmi.e {
      private final Optional<akv> aY;

      i(List<gmi.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gmi.i.b $$2 = $$0.get($$1);
               hev $$3 = flk.Q().aa();
               hee $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.aY = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<akv> c() {
         return this.aY;
      }

      public static gmi.i.a d() {
         return new gmi.i.a();
      }

      public static final class a {
         private final Builder<gmi.i.b> a = new Builder();

         public gmi.i.a a(akv $$0, boolean $$1, boolean $$2) {
            this.a.add(new gmi.i.b($$0, $$1, $$2));
            return this;
         }

         public gmi.i a() {
            return new gmi.i(this.a.build());
         }
      }

      static record b(akv a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gmi.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gmi {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gmi.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               flk.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               flk.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gmi {
      private final Optional<gmr> aY;

      public m(gmr $$0) {
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

   protected static class n extends gmi.e {
      private final Optional<akv> aY;
      private final bad aZ;
      private final boolean ba;

      public n(akv $$0, bad $$1, boolean $$2) {
         super(() -> {
            hev $$3 = flk.Q().aa();
            hee $$4 = $$3.b($$0);
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
      protected Optional<akv> c() {
         return this.aY;
      }
   }

   protected static class o extends gmi {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gmi {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gmi {
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
