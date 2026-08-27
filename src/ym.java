import java.util.Optional;
import java.util.UUID;

public record ym(Optional<UUID> b) implements yb<yh> {
   public static final xs<uu, ym> a = yb.a(ym::a, ym::new);

   private ym(uu $$0) {
      this($$0.b(jf.g));
   }

   private void a(uu $$0) {
      $$0.a(this.b, jf.g);
   }

   @Override
   public yd<ym> a() {
      return yr.e;
   }

   public void a(yh $$0) {
      $$0.a(this);
   }
}
