import java.util.Optional;
import java.util.UUID;

public record xo(Optional<UUID> a) implements xg<xj> {
   public xo(uj $$0) {
      this($$0.b(uj::p));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, uj::a);
   }

   public void a(xj $$0) {
      $$0.a(this);
   }
}
