import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ghw implements aru, AutoCloseable {
   private final ggt a;
   private final aiy b;
   private final Set<ara<?>> c;

   public ghw(ggv $$0, aiy $$1, aiy $$2) {
      this($$0, $$1, $$2, ggp.a);
   }

   public ghw(ggv $$0, aiy $$1, aiy $$2, Set<ara<?>> $$3) {
      this.b = $$2;
      this.a = new ggt($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected ggu a(aiy $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      return ggp.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(ggp.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(ggp.a $$0, bil $$1) {
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
