import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ggk implements AutoCloseable {
   private final Map<ahg, ggk.a> a;

   public ggk(Map<ahg, ahg> $$0, gem $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gek $$2 = new gek((ahg)$$1x.getKey());
         $$1.a((ahg)$$1x.getKey(), $$2);
         return new ggk.a($$2, (ahg)$$1x.getValue());
      }));
   }

   public gek a(ahg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(ggk.a::close);
      this.a.clear();
   }

   public Map<ahg, CompletableFuture<ggk.b>> a(aqh $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         ggk.a $$4 = $$3.getValue();
         return geg.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new ggk.b($$4.a, $$1xx));
      }));
   }

   static record a(gek a, ahg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gek a;
      private final geg.a b;

      public b(gek $$0, geg.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gel a(ahg $$0) {
         return this.b.f().get($$0);
      }

      public gel a() {
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
