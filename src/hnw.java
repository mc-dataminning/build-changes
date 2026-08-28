import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hnw {
   private final avg a;
   private final Map<alg, CompletableFuture<fhb>> b = Maps.newHashMap();

   public hnw(avg $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fhb> a(alg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fhb var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hnq $$2 = new hns($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fhb($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.j()));
   }

   public CompletableFuture<hnn> a(alg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hnn)($$1 ? new hnt(hns::new, $$2) : new hns($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fhb::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hmr> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
