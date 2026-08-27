import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gba implements AutoCloseable {
   private final Map<aez, gba.a> a;

   public gba(Map<aez, aez> $$0, fzb $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fyz $$2 = new fyz((aez)$$1x.getKey());
         $$1.a((aez)$$1x.getKey(), $$2);
         return new gba.a($$2, (aez)$$1x.getValue());
      }));
   }

   public fyz a(aez $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gba.a::close);
      this.a.clear();
   }

   public Map<aez, CompletableFuture<gba.b>> a(anw $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gba.a $$4 = $$3.getValue();
         return fyv.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gba.b($$4.a, $$1xx));
      }));
   }

   static record a(fyz a, aez b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fyz a;
      private final fyv.a b;

      public b(fyz $$0, fyv.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fza a(aez $$0) {
         return this.b.f().get($$0);
      }

      public fza a() {
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
