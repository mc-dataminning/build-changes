import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gsi {
   private final String a;
   private final fjr b;
   private final alk c;
   private final List<gsh.h> d;
   private final List<gsi.a> e = new ArrayList<>();

   public gsi(fjr $$0, alk $$1, List<gsh.h> $$2) {
      this.b = $$0;
      this.a = $$0.k().toString();
      this.c = $$1;
      this.d = $$2;
   }

   public void a(gsi.a $$0) {
      this.e.add($$0);
   }

   public void a(fir $$0, Map<alk, fkv<fjs>> $$1, Matrix4f $$2, @Nullable Consumer<fld> $$3) {
      fis $$4 = $$0.a(this.a);

      for (gsi.a $$5 : this.e) {
         $$5.a($$4, $$1);
      }

      fkv<fjs> $$6 = $$1.computeIfPresent(this.c, ($$1x, $$2x) -> $$4.b($$2x));
      if ($$6 == null) {
         throw new IllegalStateException("Missing handle for target " + this.c);
      } else {
         $$4.a(() -> {
            fjs $$4x = $$6.get();
            RenderSystem.backupProjectionMatrix();
            RenderSystem.setProjectionMatrix($$2, fhw.b);
            fii $$5x = RenderSystem.getQuadVertexBuffer();
            RenderSystem.a $$6x = RenderSystem.getSequentialBuffer(flu.c.h);

            try (fld $$7 = RenderSystem.getDevice().b().a($$4x.d(), OptionalInt.empty(), $$4x.h ? $$4x.e() : null, OptionalDouble.empty())) {
               $$7.a(this.b);
               $$7.a("OutSize", (float)$$4x.c, (float)$$4x.d);
               $$7.a(0, $$5x);
               $$7.a($$6x.b(6), $$6x.a());

               for (gsi.a $$8 : this.e) {
                  $$8.a($$7, $$1);
               }

               if ($$3 != null) {
                  $$3.accept($$7);
               }

               for (gsh.h $$9 : this.d) {
                  $$9.a($$7);
               }

               $$7.a(0, 6);
            }

            RenderSystem.restoreProjectionMatrix();

            for (gsi.a $$10 : this.e) {
               $$10.a($$1);
            }
         });
      }
   }

   public interface a {
      void a(fis var1, Map<alk, fkv<fjs>> var2);

      void a(fld var1, Map<alk, fkv<fjs>> var2);

      default void a(Map<alk, fkv<fjs>> $$0) {
      }
   }

   public static record b(String a, alk b, boolean c, boolean d) implements gsi.a {
      private fkv<fjs> b(Map<alk, fkv<fjs>> $$0) {
         fkv<fjs> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(fis $$0, Map<alk, fkv<fjs>> $$1) {
         $$0.a(this.b($$1));
      }

      @Override
      public void a(fld $$0, Map<alk, fkv<fjs>> $$1) {
         fkv<fjs> $$2 = this.b($$1);
         fjs $$3 = $$2.get();
         $$3.a(this.d ? fli.b : fli.a);
         flj $$4 = this.c ? $$3.e() : $$3.d();
         if ($$4 == null) {
            throw new IllegalStateException("Missing " + (this.c ? "depth" : "color") + "texture for target " + this.b);
         } else {
            $$0.a(this.a + "Sampler", $$4);
            $$0.a(this.a + "Size", (float)$$3.c, (float)$$3.d);
         }
      }

      @Override
      public void a(Map<alk, fkv<fjs>> $$0) {
         if (this.d) {
            this.b($$0).get().a(fli.a);
         }
      }
   }

   public static record c(String a, hkn b, int c, int d) implements gsi.a {
      @Override
      public void a(fis $$0, Map<alk, fkv<fjs>> $$1) {
      }

      @Override
      public void a(fld $$0, Map<alk, fkv<fjs>> $$1) {
         $$0.a(this.a + "Sampler", this.b.a());
         $$0.a(this.a + "Size", (float)this.c, (float)this.d);
      }
   }
}
