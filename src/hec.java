import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hec {
   private final avg a;
   private final Map<alj, CompletableFuture<fci>> b = Maps.newHashMap();

   public hec(avg $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fci> a(alj $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fci var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hdx $$2 = new hdz($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fci($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hdu> a(alj $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hdu)($$1 ? new hea(hdz::new, $$2) : new hdz($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fci::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hcy> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
