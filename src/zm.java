import java.util.Optional;
import java.util.UUID;

public record zm(Optional<UUID> b) implements zb<zh> {
   public static final ys<vu, zm> a = zb.a(zm::a, zm::new);

   private zm(vu $$0) {
      this($$0.b(jq.g));
   }

   private void a(vu $$0) {
      $$0.a(this.b, jq.g);
   }

   @Override
   public zd<zm> a() {
      return zr.e;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }
}
