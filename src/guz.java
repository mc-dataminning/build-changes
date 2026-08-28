import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class guz {
   private final auh a;
   private final Map<akr, CompletableFuture<ezh>> b = Maps.newHashMap();

   public guz(auh $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ezh> a(akr $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ezh var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  guu $$2 = new guw($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ezh($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<gur> a(akr $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gur)($$1 ? new gux(guw::new, $$2) : new guw($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ezh::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gtv> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
