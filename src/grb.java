import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class grb implements AutoCloseable {
   private final Map<alf, grb.a> a;

   public grb(Map<alf, alf> $$0, gpc $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gpa $$2 = new gpa((alf)$$1x.getKey());
         $$1.a((alf)$$1x.getKey(), $$2);
         return new grb.a($$2, (alf)$$1x.getValue());
      }));
   }

   public gpa a(alf $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(grb.a::close);
      this.a.clear();
   }

   public Map<alf, CompletableFuture<grb.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         grb.a $$4 = $$3.getValue();
         return gow.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new grb.b($$4.a, $$1xx));
      }));
   }

   static record a(gpa a, alf b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gpa a;
      private final gow.a b;

      public b(gpa $$0, gow.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gpb a(alf $$0) {
         return this.b.f().get($$0);
      }

      public gpb a() {
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
