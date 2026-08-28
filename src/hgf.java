import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hgf {
   private final avo a;
   private final Map<alp, CompletableFuture<fec>> b = Maps.newHashMap();

   public hgf(avo $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fec> a(alp $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fec var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hfz $$2 = new hgb($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fec($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hfw> a(alp $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hfw)($$1 ? new hgc(hgb::new, $$2) : new hgb($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fec::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hfa> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
