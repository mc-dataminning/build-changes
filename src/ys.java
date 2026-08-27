import java.util.List;
import java.util.UUID;

public record ys(List<UUID> a) implements uw<wo> {
   public ys(sh $$0) {
      this($$0.a(sh::o));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, sh::a);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }
}
