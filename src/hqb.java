import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hqb {
   private final avk a;
   private final Map<alk, CompletableFuture<fie>> b = Maps.newHashMap();

   public hqb(avk $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fie> a(alk $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fie var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hpv $$2 = new hpx($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fie($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ag.j()));
   }

   public CompletableFuture<hps> a(alk $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hps)($$1 ? new hpy(hpx::new, $$2) : new hpx($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ag.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fie::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<how> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
