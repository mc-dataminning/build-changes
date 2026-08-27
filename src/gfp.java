import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gfp {
   private final apg a;
   private final Map<agg, CompletableFuture<elk>> b = Maps.newHashMap();

   public gfp(apg $$0) {
      this.a = $$0;
   }

   public CompletableFuture<elk> a(agg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               elk var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eli $$2 = new eli($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new elk($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gfl> a(agg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gfl)($$1 ? new gfn(eli::new, $$2) : new eli($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(elk::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gem> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
