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

public abstract class gme {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aY;
   private final Runnable aZ;
   protected static final gme.p c = new gme.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final gme.p d = new gme.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gme.p e = new gme.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gme.p f = new gme.p(
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
   protected static final gme.p g = new gme.p(
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
   protected static final gme.p h = new gme.p(
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
   protected static final gme.p i = new gme.p(
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
   protected static final gme.p j = new gme.p("vignette_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gme.p k = new gme.p(
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
   protected static final gme.p l = new gme.p("mojang_logo_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final gme.p m = new gme.p(
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
   protected static final gme.m n = new gme.m();
   protected static final gme.m o = new gme.m(glg.f);
   protected static final gme.m p = new gme.m(glg.d);
   protected static final gme.m q = new gme.m(glg.h);
   protected static final gme.m r = new gme.m(glg.g);
   protected static final gme.m s = new gme.m(glg.e);
   protected static final gme.m t = new gme.m(glg.i);
   protected static final gme.m u = new gme.m(glg.c);
   protected static final gme.m v = new gme.m(glg.j);
   protected static final gme.m w = new gme.m(glg.k);
   protected static final gme.m x = new gme.m(glg.l);
   protected static final gme.m y = new gme.m(glg.m);
   protected static final gme.m z = new gme.m(glg.n);
   protected static final gme.m A = new gme.m(glg.o);
   protected static final gme.m B = new gme.m(glg.p);
   protected static final gme.m C = new gme.m(glg.q);
   protected static final gme.m D = new gme.m(glg.r);
   protected static final gme.m E = new gme.m(glg.s);
   protected static final gme.m F = new gme.m(glg.t);
   protected static final gme.m G = new gme.m(glg.u);
   protected static final gme.m H = new gme.m(glg.v);
   protected static final gme.m I = new gme.m(glg.w);
   protected static final gme.m J = new gme.m(glg.x);
   protected static final gme.m K = new gme.m(glg.y);
   protected static final gme.m L = new gme.m(glg.z);
   protected static final gme.m M = new gme.m(glg.A);
   protected static final gme.m N = new gme.m(glg.B);
   protected static final gme.m O = new gme.m(glg.C);
   protected static final gme.m P = new gme.m(glg.D);
   protected static final gme.m Q = new gme.m(glg.E);
   protected static final gme.m R = new gme.m(glg.F);
   protected static final gme.m S = new gme.m(glg.G);
   protected static final gme.m T = new gme.m(glg.H);
   protected static final gme.m U = new gme.m(glg.I);
   protected static final gme.m V = new gme.m(glg.J);
   protected static final gme.m W = new gme.m(glg.K);
   protected static final gme.m X = new gme.m(glg.L);
   protected static final gme.m Y = new gme.m(glg.Y);
   protected static final gme.m Z = new gme.m(glg.M);
   protected static final gme.m aa = new gme.m(glg.N);
   protected static final gme.m ab = new gme.m(glg.O);
   protected static final gme.m ac = new gme.m(glg.P);
   protected static final gme.m ad = new gme.m(glg.Q);
   protected static final gme.m ae = new gme.m(glg.R);
   protected static final gme.m af = new gme.m(glg.S);
   protected static final gme.m ag = new gme.m(glg.T);
   protected static final gme.m ah = new gme.m(glg.U);
   protected static final gme.m ai = new gme.m(glg.V);
   protected static final gme.m aj = new gme.m(glg.W);
   protected static final gme.m ak = new gme.m(glg.X);
   protected static final gme.m al = new gme.m(glg.Z);
   protected static final gme.m am = new gme.m(glg.aa);
   protected static final gme.m an = new gme.m(glg.ab);
   protected static final gme.m ao = new gme.m(glg.ac);
   protected static final gme.m ap = new gme.m(glg.ad);
   protected static final gme.n aq = new gme.n(hel.d, bac.b, true);
   protected static final gme.n ar = new gme.n(hel.d, bac.b, false);
   protected static final gme.e as = new gme.e();
   protected static final gme.o at = new gme.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final gme.o au = new gme.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gme.o av = new gme.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gme.g aw = new gme.g(true);
   protected static final gme.g ax = new gme.g(false);
   protected static final gme.l ay = new gme.l(true);
   protected static final gme.l az = new gme.l(false);
   protected static final gme.c aA = new gme.c(true);
   protected static final gme.c aB = new gme.c(false);
   protected static final gme.d aC = new gme.d("always", 519);
   protected static final gme.d aD = new gme.d("==", 514);
   protected static final gme.d aE = new gme.d("<=", 515);
   protected static final gme.d aF = new gme.d(">", 516);
   protected static final gme.q aG = new gme.q(true, true);
   protected static final gme.q aH = new gme.q(true, false);
   protected static final gme.q aI = new gme.q(false, true);
   protected static final gme.f aJ = new gme.f("no_layering", () -> {
   }, () -> {
   });
   protected static final gme.f aK = new gme.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gme.f aL = new gme.f("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gme.f aM = new gme.f("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gme.f aN = new gme.f("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gme.k aO = new gme.k("main_target", () -> flh.Q().h().a(false), () -> {
   });
   protected static final gme.k aP = new gme.k("outline_target", () -> {
      fec $$0 = flh.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.k aQ = new gme.k("translucent_target", () -> {
      fec $$0 = flh.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.k aR = new gme.k("particles_target", () -> {
      fec $$0 = flh.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.k aS = new gme.k("weather_target", () -> {
      fec $$0 = flh.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.k aT = new gme.k("clouds_target", () -> {
      fec $$0 = flh.Q().f.v();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.k aU = new gme.k("item_entity_target", () -> {
      fec $$0 = flh.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         flh.Q().h().a(false);
      }
   }, () -> flh.Q().h().a(false));
   protected static final gme.h aV = new gme.h(OptionalDouble.of(1.0));
   protected static final gme.b aW = new gme.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final gme.b aX = new gme.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.h.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public gme(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)af.c() * flh.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gme {
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

   protected static class b extends gme {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends gme.a {
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

   protected static class d extends gme {
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

   protected static class e extends gme {
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

   protected static class f extends gme {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends gme.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               flh.Q().j.l().c();
            }
         }, () -> {
            if ($$0) {
               flh.Q().j.l().b();
            }
         }, $$0);
      }
   }

   protected static class h extends gme {
      private final OptionalDouble aY;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)flh.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class i extends gme.e {
      private final Optional<aku> aY;

      i(ImmutableList<Triple<aku, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aku, Boolean, Boolean> $$2 = (Triple<aku, Boolean, Boolean>)var2.next();
               heo $$3 = flh.Q().aa();
               $$3.b((aku)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
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

      public static gme.i.a d() {
         return new gme.i.a();
      }

      public static final class a {
         private final Builder<Triple<aku, Boolean, Boolean>> a = new Builder();

         public gme.i.a a(aku $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public gme.i a() {
            return new gme.i(this.a.build());
         }
      }
   }

   protected static final class j extends gme.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends gme {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends gme.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               flh.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               flh.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class m extends gme {
      private final Optional<gmn> aY;

      public m(gmn $$0) {
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

   protected static class n extends gme.e {
      private final Optional<aku> aY;
      private final bac aZ;
      private final boolean ba;

      public n(aku $$0, bac $$1, boolean $$2) {
         super(() -> {
            heo $$3 = flh.Q().aa();
            hdx $$4 = $$3.b($$0);
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

   protected static class o extends gme {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends gme {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends gme {
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
