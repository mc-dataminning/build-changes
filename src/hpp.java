import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hpp {
   private final avr a;
   private final Map<alr, CompletableFuture<fio>> b = Maps.newHashMap();

   public hpp(avr $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fio> a(alr $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fio var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hpj $$2 = new hpl($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fio($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ag.j()));
   }

   public CompletableFuture<hpg> a(alr $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hpg)($$1 ? new hpm(hpl::new, $$2) : new hpl($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ag.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fio::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hok> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
