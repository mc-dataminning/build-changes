import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ggc {
   private final apk a;
   private final Map<agi, CompletableFuture<elw>> b = Maps.newHashMap();

   public ggc(apk $$0) {
      this.a = $$0;
   }

   public CompletableFuture<elw> a(agi $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               elw var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  elu $$2 = new elu($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new elw($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gfy> a(agi $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gfy)($$1 ? new gga(elu::new, $$2) : new elu($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(elw::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gez> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
