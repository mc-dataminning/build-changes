import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gjy implements AutoCloseable {
   private final Map<ajc, gjy.a> a;

   public gjy(Map<ajc, ajc> $$0, gia $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         ghy $$2 = new ghy((ajc)$$1x.getKey());
         $$1.a((ajc)$$1x.getKey(), $$2);
         return new gjy.a($$2, (ajc)$$1x.getValue());
      }));
   }

   public ghy a(ajc $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gjy.a::close);
      this.a.clear();
   }

   public Map<ajc, CompletableFuture<gjy.b>> a(asf $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gjy.a $$4 = $$3.getValue();
         return ghu.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gjy.b($$4.a, $$1xx));
      }));
   }

   static record a(ghy a, ajc b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final ghy a;
      private final ghu.a b;

      public b(ghy $$0, ghu.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public ghz a(ajc $$0) {
         return this.b.f().get($$0);
      }

      public ghz a() {
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
