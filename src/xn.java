import java.util.Optional;
import java.util.UUID;

public record xn(Optional<UUID> a) implements xf<xi> {
   public xn(ui $$0) {
      this($$0.b(ui::p));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ui::a);
   }

   public void a(xi $$0) {
      $$0.a(this);
   }
}
