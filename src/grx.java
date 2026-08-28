import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class grx {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable x;
   private final Runnable y;
   protected static final grx.j c = new grx.j(hkp.c, bbf.b, true);
   protected static final grx.j d = new grx.j(hkp.c, bbf.b, false);
   protected static final grx.b e = new grx.b();
   protected static final grx.k f = new grx.k("default_texturing", () -> {
   }, () -> {
   });
   protected static final grx.k g = new grx.k("glint_texturing", () -> a(8.0F), RenderSystem::resetTextureMatrix);
   protected static final grx.k h = new grx.k("entity_glint_texturing", () -> a(0.5F), RenderSystem::resetTextureMatrix);
   protected static final grx.k i = new grx.k("armor_entity_glint_texturing", () -> a(0.16F), RenderSystem::resetTextureMatrix);
   protected static final grx.d j = new grx.d(true);
   protected static final grx.d k = new grx.d(false);
   protected static final grx.i l = new grx.i(true);
   protected static final grx.i m = new grx.i(false);
   protected static final grx.c n = new grx.c("no_layering", () -> {
   }, () -> {
   });
   protected static final grx.c o = new grx.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final grx.c p = new grx.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final grx.h q = new grx.h("main_target", () -> fqq.Q().h());
   protected static final grx.h r = new grx.h("outline_target", () -> {
      fjr $$0 = fqq.Q().f.p();
      return $$0 != null ? $$0 : fqq.Q().h();
   });
   protected static final grx.h s = new grx.h("translucent_target", () -> {
      fjr $$0 = fqq.Q().f.q();
      return $$0 != null ? $$0 : fqq.Q().h();
   });
   protected static final grx.h t = new grx.h("particles_target", () -> {
      fjr $$0 = fqq.Q().f.s();
      return $$0 != null ? $$0 : fqq.Q().h();
   });
   protected static final grx.h u = new grx.h("weather_target", () -> {
      fjr $$0 = fqq.Q().f.t();
      return $$0 != null ? $$0 : fqq.Q().h();
   });
   protected static final grx.h v = new grx.h("item_entity_target", () -> {
      fjr $$0 = fqq.Q().f.r();
      return $$0 != null ? $$0 : fqq.Q().h();
   });
   protected static final grx.e w = new grx.e(OptionalDouble.of(1.0));

   public grx(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public void a() {
      this.x.run();
   }

   public void b() {
      this.y.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public String c() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ag.c() * fqq.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends grx {
      private final boolean x;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.x = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.x + "]";
      }
   }

   protected static class b extends grx {
      public b(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      b() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alr> d() {
         return Optional.empty();
      }
   }

   protected static class c extends grx {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends grx.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fqq.Q().j.l().d();
            }
         }, () -> {
            if ($$0) {
               fqq.Q().j.l().c();
            }
         }, $$0);
      }
   }

   protected static class e extends grx {
      private final OptionalDouble x;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)fqq.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.x = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.x.isPresent() ? this.x.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class f extends grx.b {
      private final Optional<alr> x;

      f(List<grx.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               grx.f.b $$2 = $$0.get($$1);
               hks $$3 = fqq.Q().aa();
               hkb $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.x = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alr> d() {
         return this.x;
      }

      public static grx.f.a e() {
         return new grx.f.a();
      }

      public static final class a {
         private final Builder<grx.f.b> a = new Builder();

         public grx.f.a a(alr $$0, boolean $$1, boolean $$2) {
            this.a.add(new grx.f.b($$0, $$1, $$2));
            return this;
         }

         public grx.f a() {
            return new grx.f(this.a.build());
         }
      }

      static record b(alr a, boolean b, boolean c) {
      }
   }

   protected static final class g extends grx.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends grx {
      private final Supplier<fjr> x;

      public h(String $$0, Supplier<fjr> $$1) {
         super($$0, () -> {
         }, () -> {
         });
         this.x = $$1;
      }

      public fjr d() {
         return this.x.get();
      }
   }

   protected static class i extends grx.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fqq.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               fqq.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class j extends grx.b {
      private final Optional<alr> x;
      private final bbf y;
      private final boolean z;

      public j(alr $$0, bbf $$1, boolean $$2) {
         super(() -> {
            hks $$3 = fqq.Q().aa();
            hkb $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.a());
         }, () -> {
         });
         this.x = Optional.of($$0);
         this.y = $$1;
         this.z = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.x + "(blur=" + this.y + ", mipmap=" + this.z + ")]";
      }

      @Override
      protected Optional<alr> d() {
         return this.x;
      }
   }

   protected static class k extends grx {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
