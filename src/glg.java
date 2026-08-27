import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class glg {
   private final asd a;
   private final Map<aiy, CompletableFuture<eqa>> b = Maps.newHashMap();

   public glg(asd $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eqa> a(aiy $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eqa var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  epy $$2 = new epy($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eqa($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<glc> a(aiy $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (glc)($$1 ? new gle(epy::new, $$2) : new epy($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eqa::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gkd> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
