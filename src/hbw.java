import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hbw {
   private final auw a;
   private final Map<alc, CompletableFuture<fba>> b = Maps.newHashMap();

   public hbw(auw $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fba> a(alc $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fba var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hbr $$2 = new hbt($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fba($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<hbo> a(alc $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hbo)($$1 ? new hbu(hbt::new, $$2) : new hbt($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fba::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<has> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
