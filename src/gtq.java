import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gtq {
   private final aur a;
   private final Map<ale, CompletableFuture<exx>> b = Maps.newHashMap();

   public gtq(aur $$0) {
      this.a = $$0;
   }

   public CompletableFuture<exx> a(ale $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               exx var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gtl $$2 = new gtn($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new exx($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.i()));
   }

   public CompletableFuture<gti> a(ale $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gti)($$1 ? new gto(gtn::new, $$2) : new gtn($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(exx::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gsj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
