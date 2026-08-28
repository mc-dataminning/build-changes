import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hgt(fgo a, @Nullable hip b) implements Closeable {
   public static hgt a(ava $$0, ald $$1) throws IOException {
      auy $$2 = $$0.getResourceOrThrow($$1);

      fgo $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fgo.a($$3);
      }

      hip $$6 = $$2.f().a(hip.d).orElse(null);
      return new hgt($$4, $$6);
   }

   public static hgt a() {
      return new hgt(hgh.a(), null);
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

   public fgo d() {
      return this.a;
   }

   @Nullable
   public hip e() {
      return this.b;
   }
}
