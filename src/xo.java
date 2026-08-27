import java.util.List;

public record xo(xo.a a, List<String> b) implements ux<wp> {
   public xo(si $$0) {
      this($$0.b(xo.a.class), $$0.a(si::r));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b, si::a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public List<String> d() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
