import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gis implements AutoCloseable {
   private final Map<aiy, gis.a> a;

   public gis(Map<aiy, aiy> $$0, ggu $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         ggs $$2 = new ggs((aiy)$$1x.getKey());
         $$1.a((aiy)$$1x.getKey(), $$2);
         return new gis.a($$2, (aiy)$$1x.getValue());
      }));
   }

   public ggs a(aiy $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gis.a::close);
      this.a.clear();
   }

   public Map<aiy, CompletableFuture<gis.b>> a(asa $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gis.a $$4 = $$3.getValue();
         return ggo.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gis.b($$4.a, $$1xx));
      }));
   }

   static record a(ggs a, aiy b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final ggs a;
      private final ggo.a b;

      public b(ggs $$0, ggo.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public ggt a(aiy $$0) {
         return this.b.f().get($$0);
      }

      public ggt a() {
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
