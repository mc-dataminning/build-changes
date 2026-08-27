import java.util.List;

public record xn(xn.a a, List<String> b) implements uw<wo> {
   public xn(sh $$0) {
      this($$0.b(xn.a.class), $$0.a(sh::r));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sh::a);
   }

   public void a(wo $$0) {
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
