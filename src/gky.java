import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gky implements AutoCloseable {
   private final Map<ajh, gky.a> a;

   public gky(Map<ajh, ajh> $$0, gja $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         giy $$2 = new giy((ajh)$$1x.getKey());
         $$1.a((ajh)$$1x.getKey(), $$2);
         return new gky.a($$2, (ajh)$$1x.getValue());
      }));
   }

   public giy a(ajh $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gky.a::close);
      this.a.clear();
   }

   public Map<ajh, CompletableFuture<gky.b>> a(aso $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gky.a $$4 = $$3.getValue();
         return giu.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gky.b($$4.a, $$1xx));
      }));
   }

   static record a(giy a, ajh b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final giy a;
      private final giu.a b;

      public b(giy $$0, giu.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public giz a(ajh $$0) {
         return this.b.f().get($$0);
      }

      public giz a() {
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
