import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gja implements AutoCloseable {
   private final Map<aiy, gja.a> a;

   public gja(Map<aiy, aiy> $$0, ghc $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gha $$2 = new gha((aiy)$$1x.getKey());
         $$1.a((aiy)$$1x.getKey(), $$2);
         return new gja.a($$2, (aiy)$$1x.getValue());
      }));
   }

   public gha a(aiy $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gja.a::close);
      this.a.clear();
   }

   public Map<aiy, CompletableFuture<gja.b>> a(asb $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gja.a $$4 = $$3.getValue();
         return ggw.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gja.b($$4.a, $$1xx));
      }));
   }

   static record a(gha a, aiy b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gha a;
      private final ggw.a b;

      public b(gha $$0, ggw.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public ghb a(aiy $$0) {
         return this.b.f().get($$0);
      }

      public ghb a() {
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
