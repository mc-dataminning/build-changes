import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqc implements auj, AutoCloseable {
   private final goy a;
   private final alf b;
   private final Set<ato<?>> c;

   public gqc(gpa $$0, alf $$1, alf $$2) {
      this($$0, $$1, $$2, gou.a);
   }

   public gqc(gpa $$0, alf $$1, alf $$2, Set<ato<?>> $$3) {
      this.b = $$2;
      this.a = new goy($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected goz a(alf $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, bni $$2, bni $$3, Executor $$4, Executor $$5) {
      return gou.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gou.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gou.a $$0, bni $$1) {
      $$1.a();
      $$1.a("upload");
      this.a.a($$0);
      $$1.c();
      $$1.b();
   }

   @Override
   public void close() {
      this.a.f();
   }
}
