import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hjr(fiz a, @Nullable hln b) implements Closeable {
   public static hjr a(avd $$0, alg $$1) throws IOException {
      avb $$2 = $$0.getResourceOrThrow($$1);

      fiz $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fiz.a($$3);
      }

      hln $$6 = $$2.f().a(hln.d).orElse(null);
      return new hjr($$4, $$6);
   }

   public static hjr a() {
      return new hjr(hjf.a(), null);
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

   public fiz d() {
      return this.a;
   }

   @Nullable
   public hln e() {
      return this.b;
   }
}
