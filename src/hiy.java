import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hiy(fik a, @Nullable hkt b) implements Closeable {
   public static hiy a(avd $$0, alg $$1) throws IOException {
      avb $$2 = $$0.getResourceOrThrow($$1);

      fik $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fik.a($$3);
      }

      hkt $$6 = $$2.f().a(hkt.d).orElse(null);
      return new hiy($$4, $$6);
   }

   public static hiy a() {
      return new hiy(him.a(), null);
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

   public fik d() {
      return this.a;
   }

   @Nullable
   public hkt e() {
      return this.b;
   }
}
