import java.util.Optional;
import java.util.UUID;

public record zv(Optional<UUID> b) implements zj<zp> {
   public static final za<vy, zv> a = zj.a(zv::a, zv::new);

   private zv(vy $$0) {
      this($$0.b(ka.g));
   }

   private void a(vy $$0) {
      $$0.a(this.b, ka.g);
   }

   @Override
   public zl<zv> a() {
      return aab.f;
   }

   public void a(zp $$0) {
      $$0.a(this);
   }
}
