import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gri implements AutoCloseable {
   private final Map<akk, gri.a> a;

   public gri(Map<akk, akk> $$0, gpj $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gph $$2 = new gph((akk)$$1x.getKey());
         $$1.a((akk)$$1x.getKey(), $$2);
         return new gri.a($$2, (akk)$$1x.getValue());
      }));
   }

   public gph a(akk $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gri.a::close);
      this.a.clear();
   }

   public Map<akk, CompletableFuture<gri.b>> a(atu $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gri.a $$4 = $$3.getValue();
         return gpd.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gri.b($$4.a, $$1xx));
      }));
   }

   static record a(gph a, akk b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gph a;
      private final gpd.a b;

      public b(gph $$0, gpd.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gpi a(akk $$0) {
         return this.b.f().get($$0);
      }

      public gpi a() {
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
