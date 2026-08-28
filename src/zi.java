import java.util.Optional;
import java.util.UUID;

public record zi(Optional<UUID> b) implements yw<zc> {
   public static final yn<vl, zi> a = yw.a(zi::a, zi::new);

   private zi(vl $$0) {
      this($$0.b(kl.g));
   }

   private void a(vl $$0) {
      $$0.a(this.b, kl.g);
   }

   @Override
   public yy<zi> a() {
      return zo.f;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }
}
