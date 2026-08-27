import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class goy implements atr, AutoCloseable {
   private final gnu a;
   private final akn b;
   private final Set<asw<?>> c;

   public goy(gnw $$0, akn $$1, akn $$2) {
      this($$0, $$1, $$2, gnq.a);
   }

   public goy(gnw $$0, akn $$1, akn $$2, Set<asw<?>> $$3) {
      this.b = $$2;
      this.a = new gnu($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gnv a(akn $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      return gnq.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gnq.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gnq.a $$0, bmk $$1) {
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
