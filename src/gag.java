import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gag implements AutoCloseable {
   private final Map<aep, gag.a> a;

   public gag(Map<aep, aep> $$0, fyh $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fyf $$2 = new fyf((aep)$$1x.getKey());
         $$1.a((aep)$$1x.getKey(), $$2);
         return new gag.a($$2, (aep)$$1x.getValue());
      }));
   }

   public fyf a(aep $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gag.a::close);
      this.a.clear();
   }

   public Map<aep, CompletableFuture<gag.b>> a(ank $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gag.a $$4 = $$3.getValue();
         return fyb.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gag.b($$4.a, $$1xx));
      }));
   }

   static record a(fyf a, aep b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fyf a;
      private final fyb.a b;

      public b(fyf $$0, fyb.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fyg a(aep $$0) {
         return this.b.f().get($$0);
      }

      public fyg a() {
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
