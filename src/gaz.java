import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gaz implements AutoCloseable {
   private final Map<aeu, gaz.a> a;

   public gaz(Map<aeu, aeu> $$0, fza $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fyy $$2 = new fyy((aeu)$$1x.getKey());
         $$1.a((aeu)$$1x.getKey(), $$2);
         return new gaz.a($$2, (aeu)$$1x.getValue());
      }));
   }

   public fyy a(aeu $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gaz.a::close);
      this.a.clear();
   }

   public Map<aeu, CompletableFuture<gaz.b>> a(anp $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gaz.a $$4 = $$3.getValue();
         return fyu.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gaz.b($$4.a, $$1xx));
      }));
   }

   static record a(fyy a, aeu b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fyy a;
      private final fyu.a b;

      public b(fyy $$0, fyu.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fyz a(aeu $$0) {
         return this.b.f().get($$0);
      }

      public fyz a() {
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
