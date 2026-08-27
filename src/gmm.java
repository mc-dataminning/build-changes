import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gmm {
   private final asi a;
   private final Map<ajc, CompletableFuture<erd>> b = Maps.newHashMap();

   public gmm(asi $$0) {
      this.a = $$0;
   }

   public CompletableFuture<erd> a(ajc $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               erd var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  erb $$2 = new erb($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new erd($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gmi> a(ajc $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gmi)($$1 ? new gmk(erb::new, $$2) : new erb($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(erd::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<glj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
