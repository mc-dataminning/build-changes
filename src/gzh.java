import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gzh implements AutoCloseable {
   private final Map<ale, gzh.a> a;

   public gzh(Map<ale, ale> $$0, gxh $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gxf $$2 = new gxf((ale)$$1x.getKey());
         $$1.a((ale)$$1x.getKey(), $$2);
         return new gzh.a($$2, (ale)$$1x.getValue());
      }));
   }

   public gxf a(ale $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gzh.a::close);
      this.a.clear();
   }

   public Map<ale, CompletableFuture<gzh.b>> a(auv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gzh.a $$4 = $$3.getValue();
         return gxb.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gzh.b($$4.a, $$1xx));
      }));
   }

   static record a(gxf a, ale b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gxf a;
      private final gxb.a b;

      public b(gxf $$0, gxb.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gxg a(ale $$0) {
         return this.b.f().get($$0);
      }

      public gxg a() {
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
