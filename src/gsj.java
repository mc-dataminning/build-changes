import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gsj {
   private final aua a;
   private final Map<akn, CompletableFuture<ewu>> b = Maps.newHashMap();

   public gsj(aua $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ewu> a(akn $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ewu var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ews $$2 = new ews($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ewu($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.g()));
   }

   public CompletableFuture<gsf> a(akn $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gsf)($$1 ? new gsh(ews::new, $$2) : new ews($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.g());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ewu::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<grg> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
