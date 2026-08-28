import java.util.Optional;
import java.util.UUID;

public record zx(Optional<UUID> b) implements zl<zr> {
   public static final zc<wb, zx> a = zl.a(zx::a, zx::new);

   private zx(wb $$0) {
      this($$0.b(ki.g));
   }

   private void a(wb $$0) {
      $$0.a(this.b, ki.g);
   }

   @Override
   public zn<zx> a() {
      return aad.f;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }
}
