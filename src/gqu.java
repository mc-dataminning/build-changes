import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqu implements AutoCloseable {
   private final Map<alb, gqu.a> a;

   public gqu(Map<alb, alb> $$0, gov $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         got $$2 = new got((alb)$$1x.getKey());
         $$1.a((alb)$$1x.getKey(), $$2);
         return new gqu.a($$2, (alb)$$1x.getValue());
      }));
   }

   public got a(alb $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gqu.a::close);
      this.a.clear();
   }

   public Map<alb, CompletableFuture<gqu.b>> a(aul $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gqu.a $$4 = $$3.getValue();
         return gop.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gqu.b($$4.a, $$1xx));
      }));
   }

   static record a(got a, alb b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final got a;
      private final gop.a b;

      public b(got $$0, gop.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gou a(alb $$0) {
         return this.b.f().get($$0);
      }

      public gou a() {
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
