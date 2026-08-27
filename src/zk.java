import java.util.Optional;
import java.util.UUID;

public record zk(Optional<UUID> b) implements yz<zf> {
   public static final yq<vs, zk> a = yz.a(zk::a, zk::new);

   private zk(vs $$0) {
      this($$0.b(jp.g));
   }

   private void a(vs $$0) {
      $$0.a(this.b, jp.g);
   }

   @Override
   public zb<zk> a() {
      return zp.e;
   }

   public void a(zf $$0) {
      $$0.a(this);
   }
}
