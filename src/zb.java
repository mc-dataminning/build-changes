import java.util.List;
import java.util.UUID;

public record zb(List<UUID> a) implements vf<wy> {
   public zb(sq $$0) {
      this($$0.a(sq::o));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, sq::a);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }
}
