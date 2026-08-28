import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hiq(fic a, @Nullable hkl b) implements Closeable {
   public static hiq a(avd $$0, alg $$1) throws IOException {
      avb $$2 = $$0.getResourceOrThrow($$1);

      fic $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fic.a($$3);
      }

      hkl $$6 = $$2.f().a(hkl.d).orElse(null);
      return new hiq($$4, $$6);
   }

   public static hiq a() {
      return new hiq(hie.a(), null);
   }

   public boolean b() {
      return this.b != null ? this.b.a() : false;
   }

   public boolean c() {
      return this.b != null ? this.b.b() : false;
   }

   @Override
   public void close() {
      this.a.close();
   }

   public fic d() {
      return this.a;
   }

   @Nullable
   public hkl e() {
      return this.b;
   }
}
