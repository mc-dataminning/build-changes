import java.util.List;

public record xw(xw.a a, List<String> b) implements vf<wy> {
   public xw(sq $$0) {
      this($$0.b(xw.a.class), $$0.a(sq::r));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sq::a);
   }

   public void a(wy $$0) {
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
