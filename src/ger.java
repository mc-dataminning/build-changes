import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ger implements apm, AutoCloseable {
   private final gdn a;
   private final agt b;
   private final Set<aos<?>> c;

   public ger(gdp $$0, agt $$1, agt $$2) {
      this($$0, $$1, $$2, gdj.a);
   }

   public ger(gdp $$0, agt $$1, agt $$2, Set<aos<?>> $$3) {
      this.b = $$2;
      this.a = new gdn($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gdo a(agt $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      return gdj.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gdj.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gdj.a $$0, bgc $$1) {
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
