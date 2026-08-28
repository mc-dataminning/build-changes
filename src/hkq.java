import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hkq {
   private final aus a;
   private final Map<aku, CompletableFuture<fei>> b = Maps.newHashMap();

   public hkq(aus $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fei> a(aku $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fei var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hkk $$2 = new hkm($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fei($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.j()));
   }

   public CompletableFuture<hkh> a(aku $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hkh)($$1 ? new hkn(hkm::new, $$2) : new hkm($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fei::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hjl> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
