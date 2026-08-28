import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gsk {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable w;
   private final Runnable x;
   protected static final gsk.j c = new gsk.j(hkz.c, bau.b, true);
   protected static final gsk.j d = new gsk.j(hkz.c, bau.b, false);
   protected static final gsk.b e = new gsk.b();
   protected static final gsk.k f = new gsk.k("default_texturing", () -> {
   }, () -> {
   });
   protected static final gsk.k g = new gsk.k("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final gsk.k h = new gsk.k("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final gsk.d i = new gsk.d(true);
   protected static final gsk.d j = new gsk.d(false);
   protected static final gsk.i k = new gsk.i(true);
   protected static final gsk.i l = new gsk.i(false);
   protected static final gsk.c m = new gsk.c("no_layering", () -> {
   }, () -> {
   });
   protected static final gsk.c n = new gsk.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gsk.c o = new gsk.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gsk.h p = new gsk.h("main_target", () -> frd.Q().h());
   protected static final gsk.h q = new gsk.h("outline_target", () -> {
      fjq $$0 = frd.Q().f.p();
      return $$0 != null ? $$0 : frd.Q().h();
   });
   protected static final gsk.h r = new gsk.h("translucent_target", () -> {
      fjq $$0 = frd.Q().f.q();
      return $$0 != null ? $$0 : frd.Q().h();
   });
   protected static final gsk.h s = new gsk.h("particles_target", () -> {
      fjq $$0 = frd.Q().f.s();
      return $$0 != null ? $$0 : frd.Q().h();
   });
   protected static final gsk.h t = new gsk.h("weather_target", () -> {
      fjq $$0 = frd.Q().f.t();
      return $$0 != null ? $$0 : frd.Q().h();
   });
   protected static final gsk.h u = new gsk.h("item_entity_target", () -> {
      fjq $$0 = frd.Q().f.r();
      return $$0 != null ? $$0 : frd.Q().h();
   });
   protected static final gsk.e v = new gsk.e(OptionalDouble.of(1.0));

   public gsk(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public void a() {
      this.w.run();
   }

   public void b() {
      this.x.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public String c() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ag.c() * frd.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gsk {
      private final boolean w;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.w = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.w + "]";
      }
   }

   protected static class b extends gsk {
      public b(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      b() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ali> d() {
         return Optional.empty();
      }
   }

   protected static class c extends gsk {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends gsk.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               frd.Q().j.l().d();
            }
         }, () -> {
            if ($$0) {
               frd.Q().j.l().c();
            }
         }, $$0);
      }
   }

   protected static class e extends gsk {
      private final OptionalDouble w;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)frd.Q().aO().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.w = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.w.isPresent() ? this.w.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class f extends gsk.b {
      private final Optional<ali> w;

      f(List<gsk.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gsk.f.b $$2 = $$0.get($$1);
               hlc $$3 = frd.Q().aa();
               hkl $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.w = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<ali> d() {
         return this.w;
      }

      public static gsk.f.a e() {
         return new gsk.f.a();
      }

      public static final class a {
         private final Builder<gsk.f.b> a = new Builder();

         public gsk.f.a a(ali $$0, boolean $$1, boolean $$2) {
            this.a.add(new gsk.f.b($$0, $$1, $$2));
            return this;
         }

         public gsk.f a() {
            return new gsk.f(this.a.build());
         }
      }

      static record b(ali a, boolean b, boolean c) {
      }
   }

   protected static final class g extends gsk.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends gsk {
      private final Supplier<fjq> w;

      public h(String $$0, Supplier<fjq> $$1) {
         super($$0, () -> {
         }, () -> {
         });
         this.w = $$1;
      }

      public fjq d() {
         return this.w.get();
      }
   }

   protected static class i extends gsk.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               frd.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               frd.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class j extends gsk.b {
      private final Optional<ali> w;
      private final bau x;
      private final boolean y;

      public j(ali $$0, bau $$1, boolean $$2) {
         super(() -> {
            hlc $$3 = frd.Q().aa();
            hkl $$4 = $$3.b($$0);
            $$4.a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$4.a());
         }, () -> {
         });
         this.w = Optional.of($$0);
         this.x = $$1;
         this.y = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.w + "(blur=" + this.x + ", mipmap=" + this.y + ")]";
      }

      @Override
      protected Optional<ali> d() {
         return this.w;
      }
   }

   protected static class k extends gsk {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
