import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class glo {
   private final ase a;
   private final Map<aiy, CompletableFuture<eqh>> b = Maps.newHashMap();

   public glo(ase $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eqh> a(aiy $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eqh var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eqf $$2 = new eqf($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eqh($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<glk> a(aiy $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (glk)($$1 ? new glm(eqf::new, $$2) : new eqf($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eqh::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gkl> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
