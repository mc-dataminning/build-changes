import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gjb implements arz, AutoCloseable {
   private final ghy a;
   private final ajc b;
   private final Set<arf<?>> c;

   public gjb(gia $$0, ajc $$1, ajc $$2) {
      this($$0, $$1, $$2, ghu.a);
   }

   public gjb(gia $$0, ajc $$1, ajc $$2, Set<arf<?>> $$3) {
      this.b = $$2;
      this.a = new ghy($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected ghz a(ajc $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      return ghu.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(ghu.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(ghu.a $$0, bjc $$1) {
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
