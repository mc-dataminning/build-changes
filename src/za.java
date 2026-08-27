import java.util.List;
import java.util.UUID;

public record za(List<UUID> a) implements ve<wx> {
   public za(so $$0) {
      this($$0.a(so::p));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }
}
