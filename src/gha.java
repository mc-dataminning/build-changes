import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gha implements AutoCloseable {
   private final Map<ahh, gha.a> a;

   public gha(Map<ahh, ahh> $$0, gfc $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gfa $$2 = new gfa((ahh)$$1x.getKey());
         $$1.a((ahh)$$1x.getKey(), $$2);
         return new gha.a($$2, (ahh)$$1x.getValue());
      }));
   }

   public gfa a(ahh $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gha.a::close);
      this.a.clear();
   }

   public Map<ahh, CompletableFuture<gha.b>> a(aqj $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gha.a $$4 = $$3.getValue();
         return gew.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gha.b($$4.a, $$1xx));
      }));
   }

   static record a(gfa a, ahh b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gfa a;
      private final gew.a b;

      public b(gfa $$0, gew.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gfb a(ahh $$0) {
         return this.b.f().get($$0);
      }

      public gfb a() {
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
