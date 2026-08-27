import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ggf implements AutoCloseable {
   private final Map<ahd, ggf.a> a;

   public ggf(Map<ahd, ahd> $$0, geg $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gee $$2 = new gee((ahd)$$1x.getKey());
         $$1.a((ahd)$$1x.getKey(), $$2);
         return new ggf.a($$2, (ahd)$$1x.getValue());
      }));
   }

   public gee a(ahd $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(ggf.a::close);
      this.a.clear();
   }

   public Map<ahd, CompletableFuture<ggf.b>> a(aqc $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         ggf.a $$4 = $$3.getValue();
         return gea.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new ggf.b($$4.a, $$1xx));
      }));
   }

   static record a(gee a, ahd b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gee a;
      private final gea.a b;

      public b(gee $$0, gea.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gef a(ahd $$0) {
         return this.b.f().get($$0);
      }

      public gef a() {
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
