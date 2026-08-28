import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gqd implements auj, AutoCloseable {
   private final goz a;
   private final alf b;
   private final Set<ato<?>> c;

   public gqd(gpb $$0, alf $$1, alf $$2) {
      this($$0, $$1, $$2, gov.a);
   }

   public gqd(gpb $$0, alf $$1, alf $$2, Set<ato<?>> $$3) {
      this.b = $$2;
      this.a = new goz($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gpa a(alf $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, bnj $$2, bnj $$3, Executor $$4, Executor $$5) {
      return gov.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gov.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gov.a $$0, bnj $$1) {
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
