import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hmh implements avb, AutoCloseable {
   private final hlb a;
   private final alk b;
   private final Set<aug<?>> c;

   public hmh(hle $$0, alk $$1, alk $$2) {
      this($$0, $$1, $$2, hkx.a);
   }

   public hmh(hle $$0, alk $$1, alk $$2, Set<aug<?>> $$3) {
      this.b = $$2;
      this.a = new hlb($$1);
      $$0.a(this.a.e(), this.a);
      this.c = $$3;
   }

   protected hlc a(alk $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      return hkx.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hkx.a::a).thenCompose($$0::wait).thenAcceptAsync(this::a, $$3);
   }

   private void a(hkx.a $$0) {
      try (bri $$1 = brc.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.d();
   }
}
