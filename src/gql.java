import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gql implements ato, AutoCloseable {
   private final gph a;
   private final akk b;
   private final Set<ast<?>> c;

   public gql(gpj $$0, akk $$1, akk $$2) {
      this($$0, $$1, $$2, gpd.a);
   }

   public gql(gpj $$0, akk $$1, akk $$2, Set<ast<?>> $$3) {
      this.b = $$2;
      this.a = new gph($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gpi a(akk $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      return gpd.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gpd.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gpd.a $$0, bmr $$1) {
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
