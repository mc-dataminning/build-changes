import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

public record heu(fev a, @Nullable hgq b) implements Closeable {
   public static heu a(aup $$0, akv $$1) throws IOException {
      aun $$2 = $$0.getResourceOrThrow($$1);

      fev $$4;
      try (InputStream $$3 = $$2.d()) {
         $$4 = fev.a($$3);
      }

      hgq $$6 = $$2.f().a(hgq.d).orElse(null);
      return new heu($$4, $$6);
   }

   public static heu a() {
      return new heu(hei.a(), null);
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

   public fev d() {
      return this.a;
   }

   @Nullable
   public hgq e() {
      return this.b;
   }
}
