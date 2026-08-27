import java.util.List;
import java.util.UUID;

public record za(List<UUID> a) implements ve<wx> {
   public za(sp $$0) {
      this($$0.a(sp::o));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a, sp::a);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
