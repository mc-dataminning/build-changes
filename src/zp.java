import java.util.Optional;
import java.util.UUID;

public record zp(Optional<UUID> b) implements ze<zk> {
   public static final yv<vx, zp> a = ze.a(zp::a, zp::new);

   private zp(vx $$0) {
      this($$0.b(jr.g));
   }

   private void a(vx $$0) {
      $$0.a(this.b, jr.g);
   }

   @Override
   public zg<zp> a() {
      return zu.e;
   }

   public void a(zk $$0) {
      $$0.a(this);
   }
}
