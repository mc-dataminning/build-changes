import java.util.Optional;
import java.util.UUID;

public record zr(Optional<UUID> b) implements zf<zl> {
   public static final yw<vu, zr> a = zf.a(zr::a, zr::new);

   private zr(vu $$0) {
      this($$0.b(jy.g));
   }

   private void a(vu $$0) {
      $$0.a(this.b, jy.g);
   }

   @Override
   public zh<zr> a() {
      return zx.f;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }
}
