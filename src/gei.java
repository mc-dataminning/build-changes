import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gei {
   private final aow a;
   private final Map<afw, CompletableFuture<ekh>> b = Maps.newHashMap();

   public gei(aow $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ekh> a(afw $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ekh var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ekf $$2 = new ekf($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ekh($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gee> a(afw $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gee)($$1 ? new geg(ekf::new, $$2) : new ekf($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ekh::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gdf> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
