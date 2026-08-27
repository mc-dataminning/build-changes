import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class giz {
   private final aqk a;
   private final Map<ahg, CompletableFuture<eoa>> b = Maps.newHashMap();

   public giz(aqk $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eoa> a(ahg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eoa var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eny $$2 = new eny($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eoa($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<giv> a(ahg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (giv)($$1 ? new gix(eny::new, $$2) : new eny($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eoa::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<ghw> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
