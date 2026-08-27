import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class grm {
   private final atu a;
   private final Map<akh, CompletableFuture<evx>> b = Maps.newHashMap();

   public grm(atu $$0) {
      this.a = $$0;
   }

   public CompletableFuture<evx> a(akh $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               evx var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  evv $$2 = new evv($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new evx($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gri> a(akh $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gri)($$1 ? new grk(evv::new, $$2) : new evv($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(evx::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gqj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
