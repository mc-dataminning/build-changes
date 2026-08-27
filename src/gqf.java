import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gqf {
   private final ath a;
   private final Map<ajv, CompletableFuture<eur>> b = Maps.newHashMap();

   public gqf(ath $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eur> a(ajv $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eur var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eup $$2 = new eup($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eur($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gqb> a(ajv $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gqb)($$1 ? new gqd(eup::new, $$2) : new eup($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eur::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gpc> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
