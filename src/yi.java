import java.util.Optional;
import java.util.UUID;

public record yi(Optional<UUID> b) implements xx<yd> {
   public static final xo<uq, yi> a = xx.a(yi::a, yi::new);

   private yi(uq $$0) {
      this($$0.b(jc.f));
   }

   private void a(uq $$0) {
      $$0.a(this.b, jc.f);
   }

   @Override
   public xz<yi> a() {
      return yn.e;
   }

   public void a(yd $$0) {
      $$0.a(this);
   }
}
