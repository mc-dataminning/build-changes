import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gvm {
   private final aug a;
   private final Map<akt, CompletableFuture<ezc>> b = Maps.newHashMap();

   public gvm(aug $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ezc> a(akt $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ezc var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eza $$2 = new eza($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ezc($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.f()));
   }

   public CompletableFuture<gvi> a(akt $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gvi)($$1 ? new gvk(eza::new, $$2) : new eza($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ezc::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<guj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
