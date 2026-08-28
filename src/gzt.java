import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gzt implements AutoCloseable {
   private final Map<alh, gzt.a> a;

   public gzt(Map<alh, alh> $$0, gxt $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gxr $$2 = new gxr((alh)$$1x.getKey());
         $$1.a((alh)$$1x.getKey(), $$2);
         return new gzt.a($$2, (alh)$$1x.getValue());
      }));
   }

   public gxr a(alh $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gzt.a::close);
      this.a.clear();
   }

   public Map<alh, CompletableFuture<gzt.b>> a(ava $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gzt.a $$4 = $$3.getValue();
         return gxn.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gzt.b($$4.a, $$1xx));
      }));
   }

   static record a(gxr a, alh b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gxr a;
      private final gxn.a b;

      public b(gxr $$0, gxn.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gxs a(alh $$0) {
         return this.b.f().get($$0);
      }

      public gxs a() {
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
