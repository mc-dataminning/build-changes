import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gjo {
   private final aqm a;
   private final Map<ahh, CompletableFuture<eok>> b = Maps.newHashMap();

   public gjo(aqm $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eok> a(ahh $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eok var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eoi $$2 = new eoi($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eok($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gjk> a(ahh $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gjk)($$1 ? new gjm(eoi::new, $$2) : new eoi($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eok::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gil> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
