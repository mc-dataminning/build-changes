import java.util.List;

public record xv(xv.a a, List<String> b) implements ve<wx> {
   public xv(sp $$0) {
      this($$0.b(xv.a.class), $$0.a(sp::r));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sp::a);
   }

   public void a(wx $$0) {
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
