import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ggl implements AutoCloseable {
   private final Map<ahg, ggl.a> a;

   public ggl(Map<ahg, ahg> $$0, gen $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gel $$2 = new gel((ahg)$$1x.getKey());
         $$1.a((ahg)$$1x.getKey(), $$2);
         return new ggl.a($$2, (ahg)$$1x.getValue());
      }));
   }

   public gel a(ahg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(ggl.a::close);
      this.a.clear();
   }

   public Map<ahg, CompletableFuture<ggl.b>> a(aqh $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         ggl.a $$4 = $$3.getValue();
         return geh.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new ggl.b($$4.a, $$1xx));
      }));
   }

   static record a(gel a, ahg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gel a;
      private final geh.a b;

      public b(gel $$0, geh.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gem a(ahg $$0) {
         return this.b.f().get($$0);
      }

      public gem a() {
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
