import java.util.Optional;
import java.util.UUID;

public record zw(Optional<UUID> b) implements zk<zq> {
   public static final zb<wa, zw> a = zk.a(zw::a, zw::new);

   private zw(wa $$0) {
      this($$0.b(kh.g));
   }

   private void a(wa $$0) {
      $$0.a(this.b, kh.g);
   }

   @Override
   public zm<zw> a() {
      return aac.f;
   }

   public void a(zq $$0) {
      $$0.a(this);
   }
}
