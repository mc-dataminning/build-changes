import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hgs implements AutoCloseable {
   private final Map<akv, hgs.a> a;

   public hgs(Map<akv, akv> $$0, hev $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hes $$2 = new hes((akv)$$1x.getKey());
         $$1.a((akv)$$1x.getKey(), $$2);
         return new hgs.a($$2, (akv)$$1x.getValue());
      }));
   }

   public hes a(akv $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hgs.a::close);
      this.a.clear();
   }

   public Map<akv, CompletableFuture<hgs.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hgs.a $$4 = $$3.getValue();
         return heo.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hgs.b($$4.a, $$1xx));
      }));
   }

   static record a(hes a, akv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hes a;
      private final heo.a b;

      public b(hes $$0, heo.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public het a(akv $$0) {
         return this.b.f().get($$0);
      }

      public het a() {
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
