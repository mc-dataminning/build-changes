import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hlr {
   private final avd a;
   private final Map<ald, CompletableFuture<fff>> b = Maps.newHashMap();

   public hlr(avd $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fff> a(ald $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fff var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hll $$2 = new hln($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fff($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, af.j()));
   }

   public CompletableFuture<hli> a(ald $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hli)($$1 ? new hlo(hln::new, $$2) : new hln($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, af.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fff::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hkm> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
