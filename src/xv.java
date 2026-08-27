import java.util.List;

public record xv(xv.a a, List<String> b) implements ve<wx> {
   public xv(so $$0) {
      this($$0.b(xv.a.class), $$0.a(so::s));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b, so::a);
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
