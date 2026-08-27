import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class glb implements AutoCloseable {
   private final Map<ajh, glb.a> a;

   public glb(Map<ajh, ajh> $$0, gjd $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gjb $$2 = new gjb((ajh)$$1x.getKey());
         $$1.a((ajh)$$1x.getKey(), $$2);
         return new glb.a($$2, (ajh)$$1x.getValue());
      }));
   }

   public gjb a(ajh $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(glb.a::close);
      this.a.clear();
   }

   public Map<ajh, CompletableFuture<glb.b>> a(aso $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         glb.a $$4 = $$3.getValue();
         return gix.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new glb.b($$4.a, $$1xx));
      }));
   }

   static record a(gjb a, ajh b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gjb a;
      private final gix.a b;

      public b(gjb $$0, gix.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gjc a(ajh $$0) {
         return this.b.f().get($$0);
      }

      public gjc a() {
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
