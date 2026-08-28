import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gsg {
   private final String a;
   private final fjp b;
   private final ali c;
   private final List<gsf.h> d;
   private final List<gsg.a> e = new ArrayList<>();

   public gsg(fjp $$0, ali $$1, List<gsf.h> $$2) {
      this.b = $$0;
      this.a = $$0.k().toString();
      this.c = $$1;
      this.d = $$2;
   }

   public void a(gsg.a $$0) {
      this.e.add($$0);
   }

   public void a(fip $$0, Map<ali, fkt<fjq>> $$1, Matrix4f $$2, @Nullable Consumer<flb> $$3) {
      fiq $$4 = $$0.a(this.a);

      for (gsg.a $$5 : this.e) {
         $$5.a($$4, $$1);
      }

      fkt<fjq> $$6 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$4.b($$2x));
      if ($$6 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$4.a(() -> {
            fjq $$4x = $$6.get();
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fhu.b);
            fig $$5x = RenderSystem.getQuadVertexBuffer(() -> "Post pass vertex buffer");
            RenderSystem.a $$6x = RenderSystem.getSequentialBuffer(fls.c.h);

            try (flb $$7 = RenderSystem.getDevice().b().a($$4x.d(), OptionalInt.empty(), $$4x.h ? $$4x.e() : null, OptionalDouble.empty())) {
               $$7.a(this.b);
               $$7.a("OutSize", (float)$$4x.c, (float)$$4x.d);
               $$7.a(0, $$5x);
               $$7.a($$6x.b(6), $$6x.a());

               for (gsg.a $$8 : this.e) {
                  $$8.a($$7, $$1);
               }

               if ($$3 != null) {
                  $$3.accept($$7);
               }

               for (gsf.h $$9 : this.d) {
                  $$9.a($$7);
               }

               $$7.a(0, 6);
            }

            RenderSystem.restoreProjectionMatrix();

            for (gsg.a $$10 : this.e) {
               $$10.a($$1);
            }
         });
      }
   }

   public interface a {
      void a(fiq var1, Map<ali, fkt<fjq>> var2);

      void a(flb var1, Map<ali, fkt<fjq>> var2);

      default void a(Map<ali, fkt<fjq>> $$0) {
      }
   }

   public static record b(String a, ali b, boolean c, boolean d) implements gsg.a {
      private fkt<fjq> b(Map<ali, fkt<fjq>> $$0) {
         fkt<fjq> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fiq $$0, Map<ali, fkt<fjq>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(flb $$0, Map<ali, fkt<fjq>> $$1) {
         fkt<fjq> $$2 = this.b($$1);
         fjq $$3 = $$2.get();
         $$3.a(this.d ? flg.b : flg.a);
         flh $$4 = this.c ? $$3.e() : $$3.d();
         if ($$4 == null) {
            throw new IllegalStateException("Missing " + (this.c ? "depth" : "color") + "texture for target " + this.b);
         } else {
            $$0.a(this.a + "Sampler", $$4);
            $$0.a(this.a + "Size", (float)$$3.c, (float)$$3.d);
         }
      }

      @Override
      public void a(Map<ali, fkt<fjq>> $$0) {
         if (this.d) {
            this.b($$0).get().a(flg.a);
         }
      }
   }

   public static record c(String a, hkl b, int c, int d) implements gsg.a {
      @Override
      public void a(fiq $$0, Map<ali, fkt<fjq>> $$1) {
      }

      @Override
      public void a(flb $$0, Map<ali, fkt<fjq>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.a(this.a + "Size", (float)this.c, (float)this.d);
      }
   }
}
