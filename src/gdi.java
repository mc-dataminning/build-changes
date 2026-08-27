import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gdi {
   private final anz a;
   private final Map<aez, CompletableFuture<ejj>> b = Maps.newHashMap();

   public gdi(anz $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ejj> a(aez $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ejj var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ejh $$2 = new ejh($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ejj($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gde> a(aez $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gde)($$1 ? new gdg(ejh::new, $$2) : new ejh($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ejj::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gcf> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
