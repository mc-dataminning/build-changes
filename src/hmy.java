import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hmy {
   private final ave a;
   private final Map<ale, CompletableFuture<fgh>> b = Maps.newHashMap();

   public hmy(ave $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fgh> a(ale $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fgh var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hms $$2 = new hmu($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fgh($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.j()));
   }

   public CompletableFuture<hmp> a(ale $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hmp)($$1 ? new hmv(hmu::new, $$2) : new hmu($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fgh::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hlt> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
