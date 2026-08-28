import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gtp {
   private final aur a;
   private final Map<ale, CompletableFuture<exw>> b = Maps.newHashMap();

   public gtp(aur $$0) {
      this.a = $$0;
   }

   public CompletableFuture<exw> a(ale $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               exw var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gtk $$2 = new gtm($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new exw($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.i()));
   }

   public CompletableFuture<gth> a(ale $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gth)($$1 ? new gtn(gtm::new, $$2) : new gtm($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(exw::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gsi> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
