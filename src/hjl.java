import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hjl(fiu a, @Nullable hlg b) implements Closeable {
   public static hjl a(avd $$0, alg $$1) throws IOException {
      avb $$2 = $$0.getResourceOrThrow($$1);

      fiu $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fiu.a($$3);
      }

      hlg $$6 = $$2.f().a(hlg.d).orElse(null);
      return new hjl($$4, $$6);
   }

   public static hjl a() {
      return new hjl(hiz.a(), null);
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

   public fiu d() {
      return this.a;
   }

   @Nullable
   public hlg e() {
      return this.b;
   }
}
