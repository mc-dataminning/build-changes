import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsj implements AutoCloseable {
   private final Map<akr, gsj.a> a;

   public gsj(Map<akr, akr> $$0, gqk $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gqi $$2 = new gqi((akr)$$1x.getKey());
         $$1.a((akr)$$1x.getKey(), $$2);
         return new gsj.a($$2, (akr)$$1x.getValue());
      }));
   }

   public gqi a(akr $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gsj.a::close);
      this.a.clear();
   }

   public Map<akr, CompletableFuture<gsj.b>> a(aue $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gsj.a $$4 = $$3.getValue();
         return gqe.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gsj.b($$4.a, $$1xx));
      }));
   }

   static record a(gqi a, akr b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gqi a;
      private final gqe.a b;

      public b(gqi $$0, gqe.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gqj a(akr $$0) {
         return this.b.f().get($$0);
      }

      public gqj a() {
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
