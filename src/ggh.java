import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ggh {
   private final apo a;
   private final Map<agm, CompletableFuture<emb>> b = Maps.newHashMap();

   public ggh(apo $$0) {
      this.a = $$0;
   }

   public CompletableFuture<emb> a(agm $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               emb var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  elz $$2 = new elz($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new emb($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<ggd> a(agm $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (ggd)($$1 ? new ggf(elz::new, $$2) : new elz($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(emb::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gfe> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
