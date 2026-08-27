import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gdc {
   private final anp a;
   private final Map<aer, CompletableFuture<ejf>> b = Maps.newHashMap();

   public gdc(anp $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ejf> a(aer $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ejf var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ejd $$2 = new ejd($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ejf($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gcy> a(aer $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gcy)($$1 ? new gda(ejd::new, $$2) : new ejd($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ejf::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gbz> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
