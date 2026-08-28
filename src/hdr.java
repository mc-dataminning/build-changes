import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hdr {
   private final avh a;
   private final Map<all, CompletableFuture<fcb>> b = Maps.newHashMap();

   public hdr(avh $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fcb> a(all $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fcb var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hdm $$2 = new hdo($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fcb($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hdj> a(all $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hdj)($$1 ? new hdp(hdo::new, $$2) : new hdo($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fcb::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hcn> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
