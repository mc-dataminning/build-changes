import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gmh {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gmh.p c = new gmh.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gmh.p d = new gmh.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmh.p e = new gmh.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmh.p f = new gmh.p(
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
   protected static final gmh.p g = new gmh.p(
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
   protected static final gmh.p h = new gmh.p(
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
   protected static final gmh.p i = new gmh.p(
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
   protected static final gmh.p j = new gmh.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmh.p k = new gmh.p(
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
   protected static final gmh.p l = new gmh.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmh.p m = new gmh.p(
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
   protected static final gmh.m n = new gmh.m();
   protected static final gmh.m o = new gmh.m(glj.f);
   protected static final gmh.m p = new gmh.m(glj.d);
   protected static final gmh.m q = new gmh.m(glj.h);
   protected static final gmh.m r = new gmh.m(glj.g);
   protected static final gmh.m s = new gmh.m(glj.e);
   protected static final gmh.m t = new gmh.m(glj.i);
   protected static final gmh.m u = new gmh.m(glj.c);
   protected static final gmh.m v = new gmh.m(glj.j);
   protected static final gmh.m w = new gmh.m(glj.k);
   protected static final gmh.m x = new gmh.m(glj.l);
   protected static final gmh.m y = new gmh.m(glj.m);
   protected static final gmh.m z = new gmh.m(glj.n);
   protected static final gmh.m A = new gmh.m(glj.o);
   protected static final gmh.m B = new gmh.m(glj.p);
   protected static final gmh.m C = new gmh.m(glj.q);
   protected static final gmh.m D = new gmh.m(glj.r);
   protected static final gmh.m E = new gmh.m(glj.s);
   protected static final gmh.m F = new gmh.m(glj.t);
   protected static final gmh.m G = new gmh.m(glj.u);
   protected static final gmh.m H = new gmh.m(glj.v);
   protected static final gmh.m I = new gmh.m(glj.w);
   protected static final gmh.m J = new gmh.m(glj.x);
   protected static final gmh.m K = new gmh.m(glj.y);
   protected static final gmh.m L = new gmh.m(glj.z);
   protected static final gmh.m M = new gmh.m(glj.A);
   protected static final gmh.m N = new gmh.m(glj.B);
   protected static final gmh.m O = new gmh.m(glj.C);
   protected static final gmh.m P = new gmh.m(glj.D);
   protected static final gmh.m Q = new gmh.m(glj.E);
   protected static final gmh.m R = new gmh.m(glj.F);
   protected static final gmh.m S = new gmh.m(glj.G);
   protected static final gmh.m T = new gmh.m(glj.H);
   protected static final gmh.m U = new gmh.m(glj.I);
   protected static final gmh.m V = new gmh.m(glj.J);
   protected static final gmh.m W = new gmh.m(glj.K);
   protected static final gmh.m X = new gmh.m(glj.L);
   protected static final gmh.m Y = new gmh.m(glj.Y);
   protected static final gmh.m Z = new gmh.m(glj.M);
   protected static final gmh.m aa = new gmh.m(glj.N);
   protected static final gmh.m ab = new gmh.m(glj.O);
   protected static final gmh.m ac = new gmh.m(glj.P);
   protected static final gmh.m ad = new gmh.m(glj.Q);
   protected static final gmh.m ae = new gmh.m(glj.R);
   protected static final gmh.m af = new gmh.m(glj.S);
   protected static final gmh.m ag = new gmh.m(glj.T);
   protected static final gmh.m ah = new gmh.m(glj.U);
   protected static final gmh.m ai = new gmh.m(glj.V);
   protected static final gmh.m aj = new gmh.m(glj.W);
   protected static final gmh.m ak = new gmh.m(glj.X);
   protected static final gmh.m al = new gmh.m(glj.Z);
   protected static final gmh.m am = new gmh.m(glj.aa);
   protected static final gmh.m an = new gmh.m(glj.ab);
   protected static final gmh.m ao = new gmh.m(glj.ac);
   protected static final gmh.m ap = new gmh.m(glj.ad);
   protected static final gmh.n aq = new gmh.n(her.d, bad.b, true);
   protected static final gmh.n ar = new gmh.n(her.d, bad.b, false);
   protected static final gmh.e as = new gmh.e();
   protected static final gmh.o at = new gmh.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gmh.o au = new gmh.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmh.o av = new gmh.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmh.g aw = new gmh.g(true);
   protected static final gmh.g ax = new gmh.g(false);
   protected static final gmh.l ay = new gmh.l(true);
   protected static final gmh.l az = new gmh.l(false);
   protected static final gmh.c aA = new gmh.c(true);
   protected static final gmh.c aB = new gmh.c(false);
   protected static final gmh.d aC = new gmh.d("always", 519);
   protected static final gmh.d aD = new gmh.d("==", 514);
   protected static final gmh.d aE = new gmh.d("<=", 515);
   protected static final gmh.d aF = new gmh.d(">", 516);
   protected static final gmh.q aG = new gmh.q(true, true);
   protected static final gmh.q aH = new gmh.q(true, false);
   protected static final gmh.q aI = new gmh.q(false, true);
   protected static final gmh.f aJ = new gmh.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gmh.f aK = new gmh.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmh.f aL = new gmh.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmh.f aM = new gmh.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmh.f aN = new gmh.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmh.k aO = new gmh.k("main_target", () -> flj.Q().h().a(false), () -> {
   });
   protected static final gmh.k aP = new gmh.k("outline_target", () -> {
      fee $$0 = flj.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.k aQ = new gmh.k("translucent_target", () -> {
      fee $$0 = flj.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.k aR = new gmh.k("particles_target", () -> {
      fee $$0 = flj.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.k aS = new gmh.k("weather_target", () -> {
      fee $$0 = flj.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.k aT = new gmh.k("clouds_target", () -> {
      fee $$0 = flj.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.k aU = new gmh.k("item_entity_target", () -> {
      fee $$0 = flj.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmh.h aV = new gmh.h(OptionalDouble.of(1.0));
   protected static final gmh.b aW = new gmh.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gmh.b aX = new gmh.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gmh(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)af.c() * flj.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gmh {
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

   protected static class b extends gmh {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gmh.a {
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

   protected static class d extends gmh {
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

   protected static class e extends gmh {
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

   protected static class f extends gmh {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gmh.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               flj.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               flj.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gmh {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)flj.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gmh.e {
      private final Optional<akv> aY;

      i(List<gmh.i.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gmh.i.b $$2 = $$0.get($$1);
               heu $$3 = flj.Q().aa();
               hed $$4 = $$3.b($$2.a);
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

      public static gmh.i.a d() {
         return new gmh.i.a();
      }

      public static final class a {
         private final Builder<gmh.i.b> a = new Builder();

         public gmh.i.a a(akv $$0, boolean $$1, boolean $$2) {
            this.a.add(new gmh.i.b($$0, $$1, $$2));
            return this;
         }

         public gmh.i a() {
            return new gmh.i(this.a.build());
         }
      }

      static record b(akv a, boolean b, boolean c) {
      }
   }

   protected static final class j extends gmh.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gmh {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gmh.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               flj.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               flj.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gmh {
      private final Optional<gmq> aY;

      public m(gmq $$0) {
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

   protected static class n extends gmh.e {
      private final Optional<akv> aY;
      private final bad aZ;
      private final boolean ba;

      public n(akv $$0, bad $$1, boolean $$2) {
         super(() -> {
            heu $$3 = flj.Q().aa();
            hed $$4 = $$3.b($$0);
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

   protected static class o extends gmh {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gmh {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gmh {
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
