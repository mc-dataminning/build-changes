import java.util.List;
import java.util.UUID;

public record wx(List<UUID> a) implements uo<ur> {
   public wx(sf $$0) {
      this($$0.a(sf::o));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, sf::a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
