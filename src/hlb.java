import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hlb(fkg a, @Nullable hmx b) implements Closeable {
   public static hlb a(avf $$0, ali $$1) throws IOException {
      avd $$2 = $$0.getResourceOrThrow($$1);

      fkg $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fkg.a($$3);
      }

      hmx $$6 = $$2.f().a(hmx.d).orElse(null);
      return new hlb($$4, $$6);
   }

   public static hlb a() {
      return new hlb(hkp.a(), null);
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

   public fkg d() {
      return this.a;
   }

   @Nullable
   public hmx e() {
      return this.b;
   }
}
