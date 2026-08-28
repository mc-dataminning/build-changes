import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hae implements AutoCloseable {
   private final Map<ali, hae.a> a;

   public hae(Map<ali, ali> $$0, gye $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gyc $$2 = new gyc((ali)$$1x.getKey());
         $$1.a((ali)$$1x.getKey(), $$2);
         return new hae.a($$2, (ali)$$1x.getValue());
      }));
   }

   public gyc a(ali $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hae.a::close);
      this.a.clear();
   }

   public Map<ali, CompletableFuture<hae.b>> a(avb $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hae.a $$4 = $$3.getValue();
         return gxy.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hae.b($$4.a, $$1xx));
      }));
   }

   static record a(gyc a, ali b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gyc a;
      private final gxy.a b;

      public b(gyc $$0, gxy.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gyd a(ali $$0) {
         return this.b.f().get($$0);
      }

      public gyd a() {
         return this.b.e();
      }

      public CompletableFuture<Void> b() {
         return this.b.g();
      }

      public void c() {
         this.a.a(this.b);
      }
   }
}
