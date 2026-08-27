import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gin {
   private final aqf a;
   private final Map<ahd, CompletableFuture<ent>> b = Maps.newHashMap();

   public gin(aqf $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ent> a(ahd $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ent var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  enr $$2 = new enr($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ent($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gij> a(ahd $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gij)($$1 ? new gil(enr::new, $$2) : new enr($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ent::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<ghk> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
