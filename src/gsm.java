import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gsm {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable x;
   private final Runnable y;
   protected static final gsm.j c = new gsm.j(hlb.c, baw.b, true);
   protected static final gsm.j d = new gsm.j(hlb.c, baw.b, false);
   protected static final gsm.b e = new gsm.b();
   protected static final gsm.k f = new gsm.k("default_texturing", () -> {
   }, () -> {
   });
   protected static final gsm.k g = new gsm.k("glint_texturing", () -> a(8.0F), RenderSystem::resetTextureMatrix);
   protected static final gsm.k h = new gsm.k("entity_glint_texturing", () -> a(0.5F), RenderSystem::resetTextureMatrix);
   protected static final gsm.k i = new gsm.k("armor_entity_glint_texturing", () -> a(0.16F), RenderSystem::resetTextureMatrix);
   protected static final gsm.d j = new gsm.d(true);
   protected static final gsm.d k = new gsm.d(false);
   protected static final gsm.i l = new gsm.i(true);
   protected static final gsm.i m = new gsm.i(false);
   protected static final gsm.c n = new gsm.c("no_layering", () -> {
   }, () -> {
   });
   protected static final gsm.c o = new gsm.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gsm.c p = new gsm.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gsm.h q = new gsm.h("main_target", () -> frf.Q().h());
   protected static final gsm.h r = new gsm.h("outline_target", () -> {
      fjs $$0 = frf.Q().f.p();
      return $$0 != null ? $$0 : frf.Q().h();
   });
   protected static final gsm.h s = new gsm.h("translucent_target", () -> {
      fjs $$0 = frf.Q().f.q();
      return $$0 != null ? $$0 : frf.Q().h();
   });
   protected static final gsm.h t = new gsm.h("particles_target", () -> {
      fjs $$0 = frf.Q().f.s();
      return $$0 != null ? $$0 : frf.Q().h();
   });
   protected static final gsm.h u = new gsm.h("weather_target", () -> {
      fjs $$0 = frf.Q().f.t();
      return $$0 != null ? $$0 : frf.Q().h();
   });
   protected static final gsm.h v = new gsm.h("item_entity_target", () -> {
      fjs $$0 = frf.Q().f.r();
      return $$0 != null ? $$0 : frf.Q().h();
   });
   protected static final gsm.e w = new gsm.e(OptionalDouble.of(1.0));

   public gsm(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ag.c() * frf.Q().n.ap().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gsm {
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

   protected static class b extends gsm {
      public b(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      b() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<alk> d() {
         return Optional.empty();
      }
   }

   protected static class c extends gsm {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends gsm.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               frf.Q().j.l().d();
            }
         }, () -> {
            if ($$0) {
               frf.Q().j.l().c();
            }
         }, $$0);
      }
   }

   protected static class e extends gsm {
      private final OptionalDouble x;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)frf.Q().aO().k() / 1920.0F * 2.5F));
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

   protected static class f extends gsm.b {
      private final Optional<alk> x;

      f(List<gsm.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gsm.f.b $$2 = $$0.get($$1);
               hle $$3 = frf.Q().aa();
               hkn $$4 = $$3.b($$2.a);
               $$4.a($$2.b, $$2.c);
               RenderSystem.setShaderTexture($$1, $$4.a());
            }
         }, () -> {
         });
         this.x = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<alk> d() {
         return this.x;
      }

      public static gsm.f.a e() {
         return new gsm.f.a();
      }

      public static final class a {
         private final Builder<gsm.f.b> a = new Builder();

         public gsm.f.a a(alk $$0, boolean $$1, boolean $$2) {
            this.a.add(new gsm.f.b($$0, $$1, $$2));
            return this;
         }

         public gsm.f a() {
            return new gsm.f(this.a.build());
         }
      }

      static record b(alk a, boolean b, boolean c) {
      }
   }

   protected static final class g extends gsm.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends gsm {
      private final Supplier<fjs> x;

      public h(String $$0, Supplier<fjs> $$1) {
         super($$0, () -> {
         }, () -> {
         });
         this.x = $$1;
      }

      public fjs d() {
         return this.x.get();
      }
   }

   protected static class i extends gsm.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               frf.Q().j.m().a();
            }
         }, () -> {
            if ($$0) {
               frf.Q().j.m().b();
            }
         }, $$0);
      }
   }

   protected static class j extends gsm.b {
      private final Optional<alk> x;
      private final baw y;
      private final boolean z;

      public j(alk $$0, baw $$1, boolean $$2) {
         super(() -> {
            hle $$3 = frf.Q().aa();
            hkn $$4 = $$3.b($$0);
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
      protected Optional<alk> d() {
         return this.x;
      }
   }

   protected static class k extends gsm {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
