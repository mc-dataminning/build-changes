import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hoq {
   private final avg a;
   private final Map<alg, CompletableFuture<fho>> b = Maps.newHashMap();

   public hoq(avg $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fho> a(alg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fho var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hok $$2 = new hom($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fho($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ag.j()));
   }

   public CompletableFuture<hoh> a(alg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hoh)($$1 ? new hon(hom::new, $$2) : new hom($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ag.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fho::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hnl> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
