import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gdh {
   private final ans a;
   private final Map<aeu, CompletableFuture<ejk>> b = Maps.newHashMap();

   public gdh(ans $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ejk> a(aeu $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ejk var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eji $$2 = new eji($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ejk($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gdd> a(aeu $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gdd)($$1 ? new gdf(eji::new, $$2) : new eji($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ejk::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gce> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
