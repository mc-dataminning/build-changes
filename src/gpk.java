import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class gpk {
   private final alf a;
   private final aun b;
   private final AtomicReference<eza> c = new AtomicReference<>();
   private final AtomicInteger d;

   public gpk(alf $$0, aun $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = new AtomicInteger($$2);
   }

   public eza a() throws IOException {
      eza $$0 = this.c.get();
      if ($$0 == null) {
         synchronized (this) {
            $$0 = this.c.get();
            if ($$0 == null) {
               try (InputStream $$1 = this.b.d()) {
                  $$0 = eza.a($$1);
                  this.c.set($$0);
               } catch (IOException var9) {
                  throw new IOException("Failed to load image " + this.a, var9);
               }
            }
         }
      }

      return $$0;
   }

   public void b() {
      int $$0 = this.d.decrementAndGet();
      if ($$0 <= 0) {
         eza $$1 = this.c.getAndSet(null);
         if ($$1 != null) {
            $$1.close();
         }
      }
   }
}
