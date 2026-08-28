import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record hfs(ffr a, @Nullable hho b) implements Closeable {
   public static hfs a(aup $$0, aku $$1) throws IOException {
      aun $$2 = $$0.getResourceOrThrow($$1);

      ffr $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = ffr.a($$3);
      }

      hho $$6 = $$2.f().a(hho.d).orElse(null);
      return new hfs($$4, $$6);
   }

   public static hfs a() {
      return new hfs(hfg.a(), null);
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

   public ffr d() {
      return this.a;
   }

   @Nullable
   public hho e() {
      return this.b;
   }
}
