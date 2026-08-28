import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hia(fhq a, @Nullable hjv b) implements Closeable {
   public static hia a(avb $$0, ale $$1) throws IOException {
      auz $$2 = $$0.getResourceOrThrow($$1);

      fhq $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fhq.a($$3);
      }

      hjv $$6 = $$2.f().a(hjv.d).orElse(null);
      return new hia($$4, $$6);
   }

   public static hia a() {
      return new hia(hho.a(), null);
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

   public fhq d() {
      return this.a;
   }

   @Nullable
   public hjv e() {
      return this.b;
   }
}
