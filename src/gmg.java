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

public abstract class gmg {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gmg.p c = new gmg.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gmg.p d = new gmg.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmg.p e = new gmg.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmg.p f = new gmg.p(
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
   protected static final gmg.p g = new gmg.p(
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
   protected static final gmg.p h = new gmg.p(
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
   protected static final gmg.p i = new gmg.p(
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
   protected static final gmg.p j = new gmg.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmg.p k = new gmg.p(
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
   protected static final gmg.p l = new gmg.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gmg.p m = new gmg.p(
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
   protected static final gmg.m n = new gmg.m();
   protected static final gmg.m o = new gmg.m(gli.f);
   protected static final gmg.m p = new gmg.m(gli.d);
   protected static final gmg.m q = new gmg.m(gli.h);
   protected static final gmg.m r = new gmg.m(gli.g);
   protected static final gmg.m s = new gmg.m(gli.e);
   protected static final gmg.m t = new gmg.m(gli.i);
   protected static final gmg.m u = new gmg.m(gli.c);
   protected static final gmg.m v = new gmg.m(gli.j);
   protected static final gmg.m w = new gmg.m(gli.k);
   protected static final gmg.m x = new gmg.m(gli.l);
   protected static final gmg.m y = new gmg.m(gli.m);
   protected static final gmg.m z = new gmg.m(gli.n);
   protected static final gmg.m A = new gmg.m(gli.o);
   protected static final gmg.m B = new gmg.m(gli.p);
   protected static final gmg.m C = new gmg.m(gli.q);
   protected static final gmg.m D = new gmg.m(gli.r);
   protected static final gmg.m E = new gmg.m(gli.s);
   protected static final gmg.m F = new gmg.m(gli.t);
   protected static final gmg.m G = new gmg.m(gli.u);
   protected static final gmg.m H = new gmg.m(gli.v);
   protected static final gmg.m I = new gmg.m(gli.w);
   protected static final gmg.m J = new gmg.m(gli.x);
   protected static final gmg.m K = new gmg.m(gli.y);
   protected static final gmg.m L = new gmg.m(gli.z);
   protected static final gmg.m M = new gmg.m(gli.A);
   protected static final gmg.m N = new gmg.m(gli.B);
   protected static final gmg.m O = new gmg.m(gli.C);
   protected static final gmg.m P = new gmg.m(gli.D);
   protected static final gmg.m Q = new gmg.m(gli.E);
   protected static final gmg.m R = new gmg.m(gli.F);
   protected static final gmg.m S = new gmg.m(gli.G);
   protected static final gmg.m T = new gmg.m(gli.H);
   protected static final gmg.m U = new gmg.m(gli.I);
   protected static final gmg.m V = new gmg.m(gli.J);
   protected static final gmg.m W = new gmg.m(gli.K);
   protected static final gmg.m X = new gmg.m(gli.L);
   protected static final gmg.m Y = new gmg.m(gli.Y);
   protected static final gmg.m Z = new gmg.m(gli.M);
   protected static final gmg.m aa = new gmg.m(gli.N);
   protected static final gmg.m ab = new gmg.m(gli.O);
   protected static final gmg.m ac = new gmg.m(gli.P);
   protected static final gmg.m ad = new gmg.m(gli.Q);
   protected static final gmg.m ae = new gmg.m(gli.R);
   protected static final gmg.m af = new gmg.m(gli.S);
   protected static final gmg.m ag = new gmg.m(gli.T);
   protected static final gmg.m ah = new gmg.m(gli.U);
   protected static final gmg.m ai = new gmg.m(gli.V);
   protected static final gmg.m aj = new gmg.m(gli.W);
   protected static final gmg.m ak = new gmg.m(gli.X);
   protected static final gmg.m al = new gmg.m(gli.Z);
   protected static final gmg.m am = new gmg.m(gli.aa);
   protected static final gmg.m an = new gmg.m(gli.ab);
   protected static final gmg.m ao = new gmg.m(gli.ac);
   protected static final gmg.m ap = new gmg.m(gli.ad);
   protected static final gmg.n aq = new gmg.n(hei.d, bad.b, true);
   protected static final gmg.n ar = new gmg.n(hei.d, bad.b, false);
   protected static final gmg.e as = new gmg.e();
   protected static final gmg.o at = new gmg.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gmg.o au = new gmg.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmg.o av = new gmg.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gmg.g aw = new gmg.g(true);
   protected static final gmg.g ax = new gmg.g(false);
   protected static final gmg.l ay = new gmg.l(true);
   protected static final gmg.l az = new gmg.l(false);
   protected static final gmg.c aA = new gmg.c(true);
   protected static final gmg.c aB = new gmg.c(false);
   protected static final gmg.d aC = new gmg.d("always", 519);
   protected static final gmg.d aD = new gmg.d("==", 514);
   protected static final gmg.d aE = new gmg.d("<=", 515);
   protected static final gmg.d aF = new gmg.d(">", 516);
   protected static final gmg.q aG = new gmg.q(true, true);
   protected static final gmg.q aH = new gmg.q(true, false);
   protected static final gmg.q aI = new gmg.q(false, true);
   protected static final gmg.f aJ = new gmg.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gmg.f aK = new gmg.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmg.f aL = new gmg.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmg.f aM = new gmg.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gmg.f aN = new gmg.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gmg.k aO = new gmg.k("main_target", () -> flj.Q().h().a(false), () -> {
   });
   protected static final gmg.k aP = new gmg.k("outline_target", () -> {
      fee $$0 = flj.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.k aQ = new gmg.k("translucent_target", () -> {
      fee $$0 = flj.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.k aR = new gmg.k("particles_target", () -> {
      fee $$0 = flj.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.k aS = new gmg.k("weather_target", () -> {
      fee $$0 = flj.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.k aT = new gmg.k("clouds_target", () -> {
      fee $$0 = flj.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.k aU = new gmg.k("item_entity_target", () -> {
      fee $$0 = flj.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flj.Q().h().a(false);
      }
   }, () -> flj.Q().h().a(false));
   protected static final gmg.h aV = new gmg.h(OptionalDouble.of(1.0));
   protected static final gmg.b aW = new gmg.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gmg.b aX = new gmg.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gmg(String $$0, Runnable $$1, Runnable $$2) {
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

   static class a extends gmg {
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

   protected static class b extends gmg {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gmg.a {
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

   protected static class d extends gmg {
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

   protected static class e extends gmg {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aku> c() {
         return Optional.empty();
      }
   }

   protected static class f extends gmg {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gmg.a {
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

   protected static class h extends gmg {
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

   protected static class i extends gmg.e {
      private final Optional<aku> aY;

      i(ImmutableList<Triple<aku, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aku, Boolean, Boolean> $$2 = (Triple<aku, Boolean, Boolean>)var2.next();
               hek $$3 = flj.Q().aa();
               $$3.a((aku)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aku)$$2.getLeft());
            }
         }, () -> {
         });
         this.aY = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aku> c() {
         return this.aY;
      }

      public static gmg.i.a d() {
         return new gmg.i.a();
      }

      public static final class a {
         private final Builder<Triple<aku, Boolean, Boolean>> a = new Builder();

         public gmg.i.a a(aku $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gmg.i a() {
            return new gmg.i(this.a.build());
         }
      }
   }

   protected static final class j extends gmg.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gmg {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gmg.a {
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

   protected static class m extends gmg {
      private final Optional<gmp> aY;

      public m(gmp $$0) {
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

   protected static class n extends gmg.e {
      private final Optional<aku> aY;
      private final bad aZ;
      private final boolean ba;

      public n(aku $$0, bad $$1, boolean $$2) {
         super(() -> {
            hek $$3 = flj.Q().aa();
            hdu $$4 = $$3.a($$0);
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
      protected Optional<aku> c() {
         return this.aY;
      }
   }

   protected static class o extends gmg {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gmg {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gmg {
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
