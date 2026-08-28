import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hcb {
   private final auz a;
   private final Map<ale, CompletableFuture<fbe>> b = Maps.newHashMap();

   public hcb(auz $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fbe> a(ale $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fbe var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hbw $$2 = new hby($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fbe($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<hbt> a(ale $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hbt)($$1 ? new hbz(hby::new, $$2) : new hby($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fbe::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hax> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
