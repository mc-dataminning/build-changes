import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hmf implements auz, AutoCloseable {
   private final hkz a;
   private final ali b;
   private final Set<aue<?>> c;

   public hmf(hlc $$0, ali $$1, ali $$2) {
      this($$0, $$1, $$2, hkv.a);
   }

   public hmf(hlc $$0, ali $$1, ali $$2, Set<aue<?>> $$3) {
      this.b = $$2;
      this.a = new hkz($$1);
      $$0.a(this.a.e(), this.a);
      this.c = $$3;
   }

   protected hla a(ali $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      return hkv.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hkv.a::a).thenCompose($$0::wait).thenAcceptAsync(this::a, $$3);
   }

   private void a(hkv.a $$0) {
      try (brg $$1 = bra.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.d();
   }
}
