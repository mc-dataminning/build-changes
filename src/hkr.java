import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hkr(fkf a, @Nullable hmn b) implements Closeable {
   public static hkr a(avo $$0, alr $$1) throws IOException {
      avm $$2 = $$0.getResourceOrThrow($$1);

      fkf $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fkf.a($$3);
      }

      hmn $$6 = $$2.f().a(hmn.d).orElse(null);
      return new hkr($$4, $$6);
   }

   public static hkr a() {
      return new hkr(hkf.a(), null);
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

   public fkf d() {
      return this.a;
   }

   @Nullable
   public hmn e() {
      return this.b;
   }
}
