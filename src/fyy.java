import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class fyy {
   private final ala a;
   private final Map<acq, CompletableFuture<egj>> b = Maps.newHashMap();

   public fyy(ala $$0) {
      this.a = $$0;
   }

   public CompletableFuture<egj> a(acq $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               egj var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  egh $$2 = new egh($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new egj($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<fyu> a(acq $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (fyu)($$1 ? new fyw(egh::new, $$2) : new egh($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(egj::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<fxv> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
