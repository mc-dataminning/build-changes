import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqe implements auj, AutoCloseable {
   private final gpa a;
   private final alf b;
   private final Set<ato<?>> c;

   public gqe(gpc $$0, alf $$1, alf $$2) {
      this($$0, $$1, $$2, gow.a);
   }

   public gqe(gpc $$0, alf $$1, alf $$2, Set<ato<?>> $$3) {
      this.b = $$2;
      this.a = new gpa($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gpb a(alf $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, bnk $$2, bnk $$3, Executor $$4, Executor $$5) {
      return gow.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gow.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gow.a $$0, bnk $$1) {
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
