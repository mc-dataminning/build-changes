import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gtr {
   private final aus a;
   private final Map<alf, CompletableFuture<exy>> b = Maps.newHashMap();

   public gtr(aus $$0) {
      this.a = $$0;
   }

   public CompletableFuture<exy> a(alf $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               exy var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gtm $$2 = new gto($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new exy($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.i()));
   }

   public CompletableFuture<gtj> a(alf $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gtj)($$1 ? new gtp(gto::new, $$2) : new gto($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(exy::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gsk> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
