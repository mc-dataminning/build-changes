import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hgi {
   private final avy a;
   private final Map<alz, CompletableFuture<fei>> b = Maps.newHashMap();

   public hgi(avy $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fei> a(alz $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fei var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hgd $$2 = new hgf($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fei($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hga> a(alz $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hga)($$1 ? new hgg(hgf::new, $$2) : new hgf($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fei::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hfe> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
