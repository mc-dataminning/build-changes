import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hai implements auw, AutoCloseable {
   private final gzd a;
   private final alj b;
   private final Set<aub<?>> c;

   public hai(gzf $$0, alj $$1, alj $$2) {
      this($$0, $$1, $$2, gyz.a);
   }

   public hai(gzf $$0, alj $$1, alj $$2, Set<aub<?>> $$3) {
      this.b = $$2;
      this.a = new gzd($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gze a(alj $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return gyz.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(gyz.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(gyz.a $$0) {
      try (boz $$1 = bot.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
