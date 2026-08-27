import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gfo implements AutoCloseable {
   private final Map<agt, gfo.a> a;

   public gfo(Map<agt, agt> $$0, gdp $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gdn $$2 = new gdn((agt)$$1x.getKey());
         $$1.a((agt)$$1x.getKey(), $$2);
         return new gfo.a($$2, (agt)$$1x.getValue());
      }));
   }

   public gdn a(agt $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gfo.a::close);
      this.a.clear();
   }

   public Map<agt, CompletableFuture<gfo.b>> a(aps $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gfo.a $$4 = $$3.getValue();
         return gdj.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gfo.b($$4.a, $$1xx));
      }));
   }

   static record a(gdn a, agt b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gdn a;
      private final gdj.a b;

      public b(gdn $$0, gdj.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gdo a(agt $$0) {
         return this.b.f().get($$0);
      }

      public gdo a() {
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
