import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gdz implements AutoCloseable {
   private final Map<agm, gdz.a> a;

   public gdz(Map<agm, agm> $$0, gca $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gby $$2 = new gby((agm)$$1x.getKey());
         $$1.a((agm)$$1x.getKey(), $$2);
         return new gdz.a($$2, (agm)$$1x.getValue());
      }));
   }

   public gby a(agm $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gdz.a::close);
      this.a.clear();
   }

   public Map<agm, CompletableFuture<gdz.b>> a(apl $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gdz.a $$4 = $$3.getValue();
         return gbu.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gdz.b($$4.a, $$1xx));
      }));
   }

   static record a(gby a, agm b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gby a;
      private final gbu.a b;

      public b(gby $$0, gbu.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gbz a(agm $$0) {
         return this.b.f().get($$0);
      }

      public gbz a() {
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
