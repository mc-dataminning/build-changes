import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ghw {
   private final apv a;
   private final Map<agt, CompletableFuture<end>> b = Maps.newHashMap();

   public ghw(apv $$0) {
      this.a = $$0;
   }

   public CompletableFuture<end> a(agt $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               end var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  enb $$2 = new enb($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new end($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<ghs> a(agt $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (ghs)($$1 ? new ghu(enb::new, $$2) : new enb($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(end::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<ggt> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
