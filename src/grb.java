import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class grb {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable A;
   private final Runnable B;
   protected static final grb.j c = new grb.j(hjp.c, bas.b, true);
   protected static final grb.j d = new grb.j(hjp.c, bas.b, false);
   protected static final grb.b e = new grb.b();
   protected static final grb.k f = new grb.k("default_texturing", () -> {
   }, () -> {
   });
   protected static final grb.k g = new grb.k("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final grb.k h = new grb.k("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final grb.d i = new grb.d(true);
   protected static final grb.d j = new grb.d(false);
   protected static final grb.i k = new grb.i(true);
   protected static final grb.i l = new grb.i(false);
   protected static final grb.c m = new grb.c("no_layering", () -> {
   }, () -> {
   });
   protected static final grb.c n = new grb.c("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final grb.c o = new grb.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final grb.c p = new grb.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final grb.c q = new grb.c("world_border_layering", () -> {
      RenderSystem.polygonOffset(-3.0F, -3.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final grb.h r = new grb.h("main_target", () -> fpt.Q().h().a(false), () -> {
   });
   protected static final grb.h s = new grb.h("light_texture_target", () -> fpt.Q().j.l().a().a(true), () -> fpt.Q().h().a(true));
   protected static final grb.h t = new grb.h("outline_target", () -> {
      fij $$0 = fpt.Q().f.p();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.h u = new grb.h("translucent_target", () -> {
      fij $$0 = fpt.Q().f.q();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.h v = new grb.h("particles_target", () -> {
      fij $$0 = fpt.Q().f.s();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.h w = new grb.h("weather_target", () -> {
      fij $$0 = fpt.Q().f.t();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.h x = new grb.h("clouds_target", () -> {
      fij $$0 = fpt.Q().f.u();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.h y = new grb.h("item_entity_target", () -> {
      fij $$0 = fpt.Q().f.r();
      if ($$0 != null) {
         $$0.a(false);
      } else {
         fpt.Q().h().a(false);
      }
   }, () -> fpt.Q().h().a(false));
   protected static final grb.e z = new grb.e(OptionalDouble.of(1.0));

   public grb(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ag.c() * fpt.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends grb {
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

   protected static class b extends grb {
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

   protected static class c extends grb {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends grb.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fpt.Q().j.l().d();
            }
         }, () -> {
            if ($$0) {
               fpt.Q().j.l().c();
            }
         }, $$0);
      }
   }

   protected static class e extends grb {
      private final OptionalDouble A;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fpt.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class f extends grb.b {
      private final Optional<alg> A;

      f(List<grb.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               grb.f.b $$2 = $$0.get($$1);
               hjs $$3 = fpt.Q().aa();
               hjb $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.b());
            }
         }, () -> {
         });
         this.A = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alg> c() {
         return this.A;
      }

      public static grb.f.a d() {
         return new grb.f.a();
      }

      public static final class a {
         private final Builder<grb.f.b> a = new Builder();

         public grb.f.a a(alg $$0, boolean $$1, boolean $$2) {
            this.a.add(new grb.f.b($$0, $$1, $$2));
            return this;
         }

         public grb.f a() {
            return new grb.f(this.a.build());
         }
      }

      static record b(alg a, boolean b, boolean c) {
      }
   }

   protected static final class g extends grb.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends grb {
      public h(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class i extends grb.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fpt.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fpt.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class j extends grb.b {
      private final Optional<alg> A;
      private final bas B;
      private final boolean C;

      public j(alg $$0, bas $$1, boolean $$2) {
         super(() -> {
            hjs $$3 = fpt.Q().aa();
            hjb $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.b());
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

   protected static class k extends grb {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
