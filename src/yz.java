import java.util.List;
import java.util.UUID;

public record yz(List<UUID> a) implements vd<ww> {
   public yz(so $$0) {
      this($$0.a(so::o));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }
}
