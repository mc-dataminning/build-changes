import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hgj {
   private final avy a;
   private final Map<alz, CompletableFuture<fej>> b = Maps.newHashMap();

   public hgj(avy $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fej> a(alz $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fej var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hge $$2 = new hgg($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fej($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hgb> a(alz $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hgb)($$1 ? new hgh(hgg::new, $$2) : new hgg($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fej::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hff> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
