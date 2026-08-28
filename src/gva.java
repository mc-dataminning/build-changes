import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class gva {
   private static final int a = -1;
   private Optional<Instant> b = Optional.empty();
   private long c;
   private long d;

   public void a() {
      this.d = -1L;
      if (this.b.isEmpty()) {
         this.b = Optional.of(Instant.now());
      }
   }

   public void a(long $$0) {
      if (this.d != -1L) {
         this.c = this.c + Math.max(0L, $$0 - this.d);
      }

      this.d = $$0;
   }

   private int a(Instant $$0) {
      Duration $$1 = Duration.between($$0, Instant.now());
      return (int)$$1.toSeconds();
   }

   public void a(gup $$0) {
      this.b.ifPresent($$1 -> $$0.send(guq.e, $$1x -> {
            $$1x.a(gus.p, this.a($$1));
            $$1x.a(gus.q, (int)this.c);
         }));
   }
}
