import java.util.Optional;
import java.util.UUID;

public record zh(Optional<UUID> b) implements yv<zb> {
   public static final ym<vl, zh> a = yv.a(zh::a, zh::new);

   private zh(vl $$0) {
      this($$0.b(kl.g));
   }

   private void a(vl $$0) {
      $$0.a(this.b, kl.g);
   }

   @Override
   public yx<zh> a() {
      return zn.f;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }
}
