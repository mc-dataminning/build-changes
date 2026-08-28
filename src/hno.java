import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hno {
   private final avg a;
   private final Map<alg, CompletableFuture<fgt>> b = Maps.newHashMap();

   public hno(avg $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fgt> a(alg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fgt var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hni $$2 = new hnk($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fgt($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.j()));
   }

   public CompletableFuture<hnf> a(alg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hnf)($$1 ? new hnl(hnk::new, $$2) : new hnk($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fgt::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hmj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
