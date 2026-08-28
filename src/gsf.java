import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsf implements AutoCloseable {
   private final Map<akq, gsf.a> a;

   public gsf(Map<akq, akq> $$0, gqg $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gqe $$2 = new gqe((akq)$$1x.getKey());
         $$1.a((akq)$$1x.getKey(), $$2);
         return new gsf.a($$2, (akq)$$1x.getValue());
      }));
   }

   public gqe a(akq $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gsf.a::close);
      this.a.clear();
   }

   public Map<akq, CompletableFuture<gsf.b>> a(aud $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gsf.a $$4 = $$3.getValue();
         return gqa.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gsf.b($$4.a, $$1xx));
      }));
   }

   static record a(gqe a, akq b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gqe a;
      private final gqa.a b;

      public b(gqe $$0, gqa.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gqf a(akq $$0) {
         return this.b.f().get($$0);
      }

      public gqf a() {
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
