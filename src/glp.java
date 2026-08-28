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

public abstract class glp {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final glp.p c = new glp.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final glp.p d = new glp.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glp.p e = new glp.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glp.p f = new glp.p(
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
   protected static final glp.p g = new glp.p(
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
   protected static final glp.p h = new glp.p(
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
   protected static final glp.p i = new glp.p(
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
   protected static final glp.p j = new glp.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glp.p k = new glp.p(
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
   protected static final glp.p l = new glp.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final glp.p m = new glp.p(
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
   protected static final glp.m n = new glp.m();
   protected static final glp.m o = new glp.m(gkq.f);
   protected static final glp.m p = new glp.m(gkq.d);
   protected static final glp.m q = new glp.m(gkq.h);
   protected static final glp.m r = new glp.m(gkq.g);
   protected static final glp.m s = new glp.m(gkq.e);
   protected static final glp.m t = new glp.m(gkq.i);
   protected static final glp.m u = new glp.m(gkq.c);
   protected static final glp.m v = new glp.m(gkq.j);
   protected static final glp.m w = new glp.m(gkq.k);
   protected static final glp.m x = new glp.m(gkq.l);
   protected static final glp.m y = new glp.m(gkq.m);
   protected static final glp.m z = new glp.m(gkq.n);
   protected static final glp.m A = new glp.m(gkq.o);
   protected static final glp.m B = new glp.m(gkq.p);
   protected static final glp.m C = new glp.m(gkq.q);
   protected static final glp.m D = new glp.m(gkq.r);
   protected static final glp.m E = new glp.m(gkq.s);
   protected static final glp.m F = new glp.m(gkq.t);
   protected static final glp.m G = new glp.m(gkq.u);
   protected static final glp.m H = new glp.m(gkq.v);
   protected static final glp.m I = new glp.m(gkq.w);
   protected static final glp.m J = new glp.m(gkq.x);
   protected static final glp.m K = new glp.m(gkq.y);
   protected static final glp.m L = new glp.m(gkq.z);
   protected static final glp.m M = new glp.m(gkq.A);
   protected static final glp.m N = new glp.m(gkq.B);
   protected static final glp.m O = new glp.m(gkq.C);
   protected static final glp.m P = new glp.m(gkq.D);
   protected static final glp.m Q = new glp.m(gkq.E);
   protected static final glp.m R = new glp.m(gkq.F);
   protected static final glp.m S = new glp.m(gkq.G);
   protected static final glp.m T = new glp.m(gkq.H);
   protected static final glp.m U = new glp.m(gkq.I);
   protected static final glp.m V = new glp.m(gkq.J);
   protected static final glp.m W = new glp.m(gkq.K);
   protected static final glp.m X = new glp.m(gkq.L);
   protected static final glp.m Y = new glp.m(gkq.Y);
   protected static final glp.m Z = new glp.m(gkq.M);
   protected static final glp.m aa = new glp.m(gkq.N);
   protected static final glp.m ab = new glp.m(gkq.O);
   protected static final glp.m ac = new glp.m(gkq.P);
   protected static final glp.m ad = new glp.m(gkq.Q);
   protected static final glp.m ae = new glp.m(gkq.R);
   protected static final glp.m af = new glp.m(gkq.S);
   protected static final glp.m ag = new glp.m(gkq.T);
   protected static final glp.m ah = new glp.m(gkq.U);
   protected static final glp.m ai = new glp.m(gkq.V);
   protected static final glp.m aj = new glp.m(gkq.W);
   protected static final glp.m ak = new glp.m(gkq.X);
   protected static final glp.m al = new glp.m(gkq.Z);
   protected static final glp.m am = new glp.m(gkq.aa);
   protected static final glp.m an = new glp.m(gkq.ab);
   protected static final glp.m ao = new glp.m(gkq.ac);
   protected static final glp.m ap = new glp.m(gkq.ad);
   protected static final glp.n aq = new glp.n(hbf.d, bay.b, true);
   protected static final glp.n ar = new glp.n(hbf.d, bay.b, false);
   protected static final glp.e as = new glp.e();
   protected static final glp.o at = new glp.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final glp.o au = new glp.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final glp.o av = new glp.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final glp.g aw = new glp.g(true);
   protected static final glp.g ax = new glp.g(false);
   protected static final glp.l ay = new glp.l(true);
   protected static final glp.l az = new glp.l(false);
   protected static final glp.c aA = new glp.c(true);
   protected static final glp.c aB = new glp.c(false);
   protected static final glp.d aC = new glp.d("always", 519);
   protected static final glp.d aD = new glp.d("==", 514);
   protected static final glp.d aE = new glp.d("<=", 515);
   protected static final glp.d aF = new glp.d(">", 516);
   protected static final glp.q aG = new glp.q(true, true);
   protected static final glp.q aH = new glp.q(true, false);
   protected static final glp.q aI = new glp.q(false, true);
   protected static final glp.f aJ = new glp.f("no_layering", () -> {
   }, () -> {
   });
   protected static final glp.f aK = new glp.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final glp.f aL = new glp.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glp.f aM = new glp.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final glp.f aN = new glp.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final glp.k aO = new glp.k("main_target", () -> flz.Q().h().a(false), () -> {
   });
   protected static final glp.k aP = new glp.k("outline_target", () -> {
      fev $$0 = flz.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.k aQ = new glp.k("translucent_target", () -> {
      fev $$0 = flz.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.k aR = new glp.k("particles_target", () -> {
      fev $$0 = flz.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.k aS = new glp.k("weather_target", () -> {
      fev $$0 = flz.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.k aT = new glp.k("clouds_target", () -> {
      fev $$0 = flz.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.k aU = new glp.k("item_entity_target", () -> {
      fev $$0 = flz.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flz.Q().h().a(false);
      }
   }, () -> flz.Q().h().a(false));
   protected static final glp.h aV = new glp.h(OptionalDouble.of(1.0));
   protected static final glp.b aW = new glp.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final glp.b aX = new glp.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public glp(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ae.c() * flz.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends glp {
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

   protected static class b extends glp {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends glp.a {
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

   protected static class d extends glp {
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

   protected static class e extends glp {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alp> c() {
         return Optional.empty();
      }
   }

   protected static class f extends glp {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends glp.a {
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

   protected static class h extends glp {
      private final OptionalDouble aY;

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
         this.aY = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aY.isPresent() ? this.aY.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends glp.e {
      private final Optional<alp> aY;

      i(ImmutableList<Triple<alp, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<alp, Boolean, Boolean> $$2 = (Triple<alp, Boolean, Boolean>)var2.next();
               hbh $$3 = flz.Q().aa();
               $$3.a((alp)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (alp)$$2.getLeft());
            }
         }, () -> {
         });
         this.aY = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<alp> c() {
         return this.aY;
      }

      public static glp.i.a d() {
         return new glp.i.a();
      }

      public static final class a {
         private final Builder<Triple<alp, Boolean, Boolean>> a = new Builder();

         public glp.i.a a(alp $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public glp.i a() {
            return new glp.i(this.a.build());
         }
      }
   }

   protected static final class j extends glp.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends glp {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends glp.a {
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

   protected static class m extends glp {
      private final Optional<gly> aY;

      public m(gly $$0) {
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

   protected static class n extends glp.e {
      private final Optional<alp> aY;
      private final bay aZ;
      private final boolean ba;

      public n(alp $$0, bay $$1, boolean $$2) {
         super(() -> {
            hbh $$3 = flz.Q().aa();
            har $$4 = $$3.a($$0);
            $$4.a($$1.a($$4.c()), $$2);
            RenderSystem.setShaderTexture(0, $$0);
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
      protected Optional<alp> c() {
         return this.aY;
      }
   }

   protected static class o extends glp {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends glp {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends glp {
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
