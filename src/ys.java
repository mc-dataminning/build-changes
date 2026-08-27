import java.util.List;

public record ys(ys.a a, List<String> b) implements wb<xu> {
   public ys(tl $$0) {
      this($$0.b(ys.a.class), $$0.a(tl::s));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, tl::a);
   }

   public void a(xu $$0) {
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
