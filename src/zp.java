import java.util.Optional;
import java.util.UUID;

public record zp(Optional<UUID> b) implements zd<zj> {
   public static final yu<vs, zp> a = zd.a(zp::a, zp::new);

   private zp(vs $$0) {
      this($$0.b(jy.g));
   }

   private void a(vs $$0) {
      $$0.a(this.b, jy.g);
   }

   @Override
   public zf<zp> a() {
      return zv.f;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }
}
