import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hjr {
   private final aus a;
   private final Map<akv, CompletableFuture<fdl>> b = Maps.newHashMap();

   public hjr(aus $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fdl> a(akv $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fdl var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hjl $$2 = new hjn($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fdl($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.i()));
   }

   public CompletableFuture<hji> a(akv $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hji)($$1 ? new hjo(hjn::new, $$2) : new hjn($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fdl::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<him> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
