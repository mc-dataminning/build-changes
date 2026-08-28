import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hdh implements AutoCloseable {
   private final Map<alp, hdh.a> a;

   public hdh(Map<alp, alp> $$0, hbh $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hbf $$2 = new hbf((alp)$$1x.getKey());
         $$1.a((alp)$$1x.getKey(), $$2);
         return new hdh.a($$2, (alp)$$1x.getValue());
      }));
   }

   public hbf a(alp $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hdh.a::close);
      this.a.clear();
   }

   public Map<alp, CompletableFuture<hdh.b>> a(avl $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hdh.a $$4 = $$3.getValue();
         return hbb.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hdh.b($$4.a, $$1xx));
      }));
   }

   static record a(hbf a, alp b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hbf a;
      private final hbb.a b;

      public b(hbf $$0, hbb.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hbg a(alp $$0) {
         return this.b.f().get($$0);
      }

      public hbg a() {
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
