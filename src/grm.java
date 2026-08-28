import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class grm implements aty, AutoCloseable {
   private final gqi a;
   private final akr b;
   private final Set<atd<?>> c;

   public grm(gqk $$0, akr $$1, akr $$2) {
      this($$0, $$1, $$2, gqe.a);
   }

   public grm(gqk $$0, akr $$1, akr $$2, Set<atd<?>> $$3) {
      this.b = $$2;
      this.a = new gqi($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gqj a(akr $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      return gqe.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gqe.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gqe.a $$0, bnf $$1) {
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
