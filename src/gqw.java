import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gqw {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable A;
   private final Runnable B;
   protected static final gqw.j c = new gqw.j(hjj.c, bas.b, true);
   protected static final gqw.j d = new gqw.j(hjj.c, bas.b, false);
   protected static final gqw.b e = new gqw.b();
   protected static final gqw.k f = new gqw.k("default_texturing", () -> {
   }, () -> {
   });
   protected static final gqw.k g = new gqw.k("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqw.k h = new gqw.k("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gqw.d i = new gqw.d(true);
   protected static final gqw.d j = new gqw.d(false);
   protected static final gqw.i k = new gqw.i(true);
   protected static final gqw.i l = new gqw.i(false);
   protected static final gqw.c m = new gqw.c("no_layering", () -> {
   }, () -> {
   });
   protected static final gqw.c n = new gqw.c("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqw.c o = new gqw.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqw.c p = new gqw.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gqw.c q = new gqw.c("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final gqw.h r = new gqw.h("main_target", () -> fpo.Q().h().a(false), () -> {
   });
   protected static final gqw.h s = new gqw.h("light_texture_target", () -> fpo.Q().j.l().a().a(true), () -> fpo.Q().h().a(true));
   protected static final gqw.h t = new gqw.h("outline_target", () -> {
      fie $$0 = fpo.Q().f.p();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.h u = new gqw.h("translucent_target", () -> {
      fie $$0 = fpo.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.h v = new gqw.h("particles_target", () -> {
      fie $$0 = fpo.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.h w = new gqw.h("weather_target", () -> {
      fie $$0 = fpo.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.h x = new gqw.h("clouds_target", () -> {
      fie $$0 = fpo.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.h y = new gqw.h("item_entity_target", () -> {
      fie $$0 = fpo.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpo.Q().h().a(false);
      }
   }, () -> fpo.Q().h().a(false));
   protected static final gqw.e z = new gqw.e(OptionalDouble.of(1.0));

   public gqw(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.A = $$1;
      this.B = $$2;
   }

   public void a() {
      this.A.run();
   }

   public void b() {
      this.B.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ag.c() * fpo.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gqw {
      private final boolean A;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.A = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.A + "]";
      }
   }

   protected static class b extends gqw {
      public b(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      b() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alg> c() {
         return Optional.empty();
      }
   }

   protected static class c extends gqw {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends gqw.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fpo.Q().j.l().d();
            }
         }, () -> {
            if ($$0) {
               fpo.Q().j.l().c();
            }
         }, $$0);
      }
   }

   protected static class e extends gqw {
      private final OptionalDouble A;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fpo.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.A = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.A.isPresent() ? this.A.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class f extends gqw.b {
      private final Optional<alg> A;

      f(List<gqw.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gqw.f.b $$2 = $$0.get($$1);
               hjm $$3 = fpo.Q().aa();
               hiv $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.d());
            }
         }, () -> {
         });
         this.A = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alg> c() {
         return this.A;
      }

      public static gqw.f.a d() {
         return new gqw.f.a();
      }

      public static final class a {
         private final Builder<gqw.f.b> a = new Builder();

         public gqw.f.a a(alg $$0, boolean $$1, boolean $$2) {
            this.a.add(new gqw.f.b($$0, $$1, $$2));
            return this;
         }

         public gqw.f a() {
            return new gqw.f(this.a.build());
         }
      }

      static record b(alg a, boolean b, boolean c) {
      }
   }

   protected static final class g extends gqw.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends gqw {
      public h(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class i extends gqw.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fpo.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fpo.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class j extends gqw.b {
      private final Optional<alg> A;
      private final bas B;
      private final boolean C;

      public j(alg $$0, bas $$1, boolean $$2) {
         super(() -> {
            hjm $$3 = fpo.Q().aa();
            hiv $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.d());
         }, () -> {
         });
         this.A = Optional.of($$0);
         this.B = $$1;
         this.C = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.A + "(blur=" + this.B + ", mipmap=" + this.C + ")]";
      }

      @Override
      protected Optional<alg> c() {
         return this.A;
      }
   }

   protected static class k extends gqw {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
