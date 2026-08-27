import java.util.List;
import java.util.UUID;

public record yt(List<UUID> a) implements ux<wp> {
   public yt(si $$0) {
      this($$0.a(si::o));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, si::a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }
}
