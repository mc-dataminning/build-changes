import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gja {
   private final aql a;
   private final Map<ahg, CompletableFuture<eob>> b = Maps.newHashMap();

   public gja(aql $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eob> a(ahg $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eob var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  enz $$2 = new enz($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eob($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<giw> a(ahg $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (giw)($$1 ? new giy(enz::new, $$2) : new enz($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eob::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<ghx> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
