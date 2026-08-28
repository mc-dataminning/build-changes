import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hld(fki a, @Nullable hmz b) implements Closeable {
   public static hld a(avh $$0, alk $$1) throws IOException {
      avf $$2 = $$0.getResourceOrThrow($$1);

      fki $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fki.a($$3);
      }

      hmz $$6 = $$2.f().a(hmz.d).orElse(null);
      return new hld($$4, $$6);
   }

   public static hld a() {
      return new hld(hkr.a(), null);
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

   public fki d() {
      return this.a;
   }

   @Nullable
   public hmz e() {
      return this.b;
   }
}
