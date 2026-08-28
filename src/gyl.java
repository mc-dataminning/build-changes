import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gyl implements AutoCloseable {
   private final Map<alb, gyl.a> a;

   public gyl(Map<alb, alb> $$0, gwl $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gwj $$2 = new gwj((alb)$$1x.getKey());
         $$1.a((alb)$$1x.getKey(), $$2);
         return new gyl.a($$2, (alb)$$1x.getValue());
      }));
   }

   public gwj a(alb $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gyl.a::close);
      this.a.clear();
   }

   public Map<alb, CompletableFuture<gyl.b>> a(aus $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gyl.a $$4 = $$3.getValue();
         return gwf.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gyl.b($$4.a, $$1xx));
      }));
   }

   static record a(gwj a, alb b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gwj a;
      private final gwf.a b;

      public b(gwj $$0, gwf.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gwk a(alb $$0) {
         return this.b.f().get($$0);
      }

      public gwk a() {
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
