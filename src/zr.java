import java.util.Optional;
import java.util.UUID;

public record zr(Optional<UUID> b) implements zf<zl> {
   public static final yw<vv, zr> a = zf.a(zr::a, zr::new);

   private zr(vv $$0) {
      this($$0.b(kg.g));
   }

   private void a(vv $$0) {
      $$0.a(this.b, kg.g);
   }

   @Override
   public zh<zr> a() {
      return zx.f;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }
}
