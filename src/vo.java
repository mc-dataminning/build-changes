import java.util.List;

public record vo(vo.a a, List<String> b) implements uo<ur> {
   public vo(sf $$0) {
      this($$0.b(vo.a.class), $$0.a(sf::s));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sf::a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public List<String> c() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
