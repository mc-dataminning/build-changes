import java.util.List;

public record xv(xv.a a, List<String> b) implements vd<ww> {
   public xv(so $$0) {
      this($$0.b(xv.a.class), $$0.a(so::r));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      $$0.a(this.b, so::a);
   }

   public void a(ww $$0) {
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
