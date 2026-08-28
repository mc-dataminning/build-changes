import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class gwu {
   private final alb a;
   private final auq b;
   private final AtomicReference<fbp> c = new AtomicReference<>();
   private final AtomicInteger d;

   public gwu(alb $$0, auq $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = new AtomicInteger($$2);
   }

   public fbp a() throws IOException {
      fbp $$0 = this.c.get();
      if ($$0 == null) {
         synchronized (this) {
            $$0 = this.c.get();
            if ($$0 == null) {
               try (InputStream $$1 = this.b.d()) {
                  $$0 = fbp.a($$1);
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
         fbp $$1 = this.c.getAndSet(null);
         if ($$1 != null) {
            $$1.close();
         }
      }
   }
}
