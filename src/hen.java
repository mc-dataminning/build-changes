import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hen(fes a, @Nullable hgj b) implements Closeable {
   public static hen a(auo $$0, aku $$1) throws IOException {
      aum $$2 = $$0.getResourceOrThrow($$1);

      fes $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fes.a($$3);
      }

      hgj $$6 = $$2.f().a(hgj.d).orElse(null);
      return new hen($$4, $$6);
   }

   public static hen a() {
      return new hen(heb.a(), null);
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

   public fes d() {
      return this.a;
   }

   @Nullable
   public hgj e() {
      return this.b;
   }
}
