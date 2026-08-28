import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gts {
   private final aus a;
   private final Map<alf, CompletableFuture<exz>> b = Maps.newHashMap();

   public gts(aus $$0) {
      this.a = $$0;
   }

   public CompletableFuture<exz> a(alf $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               exz var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gtn $$2 = new gtp($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new exz($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.i()));
   }

   public CompletableFuture<gtk> a(alf $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gtk)($$1 ? new gtq(gtp::new, $$2) : new gtp($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(exz::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gsl> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
