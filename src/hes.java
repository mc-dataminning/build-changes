import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hes(fet a, @Nullable hgo b) implements Closeable {
   public static hes a(aup $$0, akv $$1) throws IOException {
      aun $$2 = $$0.getResourceOrThrow($$1);

      fet $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fet.a($$3);
      }

      hgo $$6 = $$2.f().a(hgo.d).orElse(null);
      return new hes($$4, $$6);
   }

   public static hes a() {
      return new hes(heg.a(), null);
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

   public fet d() {
      return this.a;
   }

   @Nullable
   public hgo e() {
      return this.b;
   }
}
