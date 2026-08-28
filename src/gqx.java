import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqx implements AutoCloseable {
   private final Map<ale, gqx.a> a;

   public gqx(Map<ale, ale> $$0, goy $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gow $$2 = new gow((ale)$$1x.getKey());
         $$1.a((ale)$$1x.getKey(), $$2);
         return new gqx.a($$2, (ale)$$1x.getValue());
      }));
   }

   public gow a(ale $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gqx.a::close);
      this.a.clear();
   }

   public Map<ale, CompletableFuture<gqx.b>> a(auo $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gqx.a $$4 = $$3.getValue();
         return gos.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gqx.b($$4.a, $$1xx));
      }));
   }

   static record a(gow a, ale b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gow a;
      private final gos.a b;

      public b(gow $$0, gos.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gox a(ale $$0) {
         return this.b.f().get($$0);
      }

      public gox a() {
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
