import java.util.Optional;
import java.util.UUID;

public record zm(Optional<UUID> b) implements zb<zh> {
   public static final ys<vr, zm> a = zb.a(zm::a, zm::new);

   private zm(vr $$0) {
      this($$0.b(kd.g));
   }

   private void a(vr $$0) {
      $$0.a(this.b, kd.g);
   }

   @Override
   public zd<zm> a() {
      return zr.e;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }
}
