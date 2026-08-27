import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gal implements AutoCloseable {
   private final Map<aer, gal.a> a;

   public gal(Map<aer, aer> $$0, fym $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fyk $$2 = new fyk((aer)$$1x.getKey());
         $$1.a((aer)$$1x.getKey(), $$2);
         return new gal.a($$2, (aer)$$1x.getValue());
      }));
   }

   public fyk a(aer $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gal.a::close);
      this.a.clear();
   }

   public Map<aer, CompletableFuture<gal.b>> a(anm $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gal.a $$4 = $$3.getValue();
         return fyg.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gal.b($$4.a, $$1xx));
      }));
   }

   static record a(fyk a, aer b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fyk a;
      private final fyg.a b;

      public b(fyk $$0, fyg.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fyl a(aer $$0) {
         return this.b.f().get($$0);
      }

      public fyl a() {
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
