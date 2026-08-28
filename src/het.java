import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record het(feu a, @Nullable hgp b) implements Closeable {
   public static het a(aup $$0, akv $$1) throws IOException {
      aun $$2 = $$0.getResourceOrThrow($$1);

      feu $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = feu.a($$3);
      }

      hgp $$6 = $$2.f().a(hgp.d).orElse(null);
      return new het($$4, $$6);
   }

   public static het a() {
      return new het(heh.a(), null);
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

   public feu d() {
      return this.a;
   }

   @Nullable
   public hgp e() {
      return this.b;
   }
}
