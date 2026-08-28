import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hcq {
   private final avd a;
   private final Map<alh, CompletableFuture<fbp>> b = Maps.newHashMap();

   public hcq(avd $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fbp> a(alh $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fbp var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hcl $$2 = new hcn($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fbp($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<hci> a(alh $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hci)($$1 ? new hco(hcn::new, $$2) : new hcn($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fbp::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hbm> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
