import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joml.Matrix4f;

public class gha implements AutoCloseable {
   private final ggh b;
   public final alb a;
   private final List<gha.a> c = new ArrayList<>();

   public gha(auv $$0, String $$1, alb $$2) throws IOException {
      this.b = new ggh($$0, $$1);
      this.a = $$2;
   }

   @Override
   public void close() {
      this.b.close();
   }

   public final String a() {
      return this.b.h();
   }

   public void a(gha.a $$0) {
      this.c.add($$0);
   }

   public void a(fat $$0, Map<alb, fcb<faz>> $$1, Matrix4f $$2, float $$3) {
      fau $$4 = $$0.a(this.a());

      for (gha.a $$5 : this.c) {
         $$5.a($$4, $$1);
      }

      fcb<faz> $$6 = $$1.computeIfPresent(this.a, ($$1x, $$2x) -> $$4.b($$2x));
      if ($$6 == null) {
         throw new IllegalStateException("Missing handle for target " + this.a);
      } else {
         $$4.a(() -> {
            faz $$4x = $$6.get();
            RenderSystem.viewport(0, 0, $$4x.c, $$4x.d);

            for (gha.a $$5x : this.c) {
               $$5x.a(this.b, $$1);
            }

            this.b.b("ProjMat").a($$2);
            this.b.b("OutSize").a((float)$$4x.c, (float)$$4x.d);
            this.b.b("Time").a($$3);
            fib $$6x = fib.Q();
            this.b.b("ScreenSize").a((float)$$6x.aO().l(), (float)$$6x.aO().m());
            this.b.g();
            $$4x.a(0.0F, 0.0F, 0.0F, 0.0F);
            $$4x.f();
            $$4x.a(false);
            RenderSystem.depthFunc(519);
            fcp $$7 = fcw.b().a(fcz.c.h, fcs.e);
            $$7.a(0.0F, 0.0F, 500.0F);
            $$7.a((float)$$4x.c, 0.0F, 500.0F);
            $$7.a((float)$$4x.c, (float)$$4x.d, 500.0F);
            $$7.a(0.0F, (float)$$4x.d, 500.0F);
            fcq.b($$7.b());
            RenderSystem.depthFunc(515);
            this.b.f();
            $$4x.e();

            for (gha.a $$8 : this.c) {
               $$8.a($$1);
            }
         });
      }
   }

   public ggh b() {
      return this.b;
   }

   public interface a {
      void a(fau var1, Map<alb, fcb<faz>> var2);

      void a(ggh var1, Map<alb, fcb<faz>> var2);

      default void a(Map<alb, fcb<faz>> $$0) {
      }
   }

   public static record b(String a, alb b, boolean c, boolean d) implements gha.a {
      private fcb<faz> b(Map<alb, fcb<faz>> $$0) {
         fcb<faz> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fau $$0, Map<alb, fcb<faz>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(ggh $$0, Map<alb, fcb<faz>> $$1) {
         fcb<faz> $$2 = this.b($$1);
         faz $$3 = $$2.get();
         $$3.a(this.d ? 9729 : 9728);
         $$0.a(this.a + "Sampler", this.c ? $$3::h : $$3::g);
         $$0.b(this.a + "Size").a((float)$$3.c, (float)$$3.d);
      }

      @Override
      public void a(Map<alb, fcb<faz>> $$0) {
         if (this.d) {
            this.b($$0).get().a(9728);
         }
      }
   }

   public static record c(String a, gvv b, int c, int d) implements gha.a {
      @Override
      public void a(fau $$0, Map<alb, fcb<faz>> $$1) {
      }

      @Override
      public void a(ggh $$0, Map<alb, fcb<faz>> $$1) {
         $$0.a(this.a + "Sampler", this.b::a);
         $$0.b(this.a + "Size").a((float)this.c, (float)this.d);
      }
   }
}
