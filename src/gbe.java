import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gbe implements AutoCloseable {
   private final Map<aew, gbe.a> a;

   public gbe(Map<aew, aew> $$0, fzf $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fzd $$2 = new fzd((aew)$$1x.getKey());
         $$1.a((aew)$$1x.getKey(), $$2);
         return new gbe.a($$2, (aew)$$1x.getValue());
      }));
   }

   public fzd a(aew $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gbe.a::close);
      this.a.clear();
   }

   public Map<aew, CompletableFuture<gbe.b>> a(ant $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gbe.a $$4 = $$3.getValue();
         return fyz.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gbe.b($$4.a, $$1xx));
      }));
   }

   static record a(fzd a, aew b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fzd a;
      private final fyz.a b;

      public b(fzd $$0, fyz.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fze a(aew $$0) {
         return this.b.f().get($$0);
      }

      public fze a() {
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
