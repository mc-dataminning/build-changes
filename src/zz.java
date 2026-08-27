import java.util.List;

public record zz(zz.a a, List<String> b) implements xg<zb> {
   public zz(uj $$0) {
      this($$0.b(zz.a.class), $$0.a(uj::s));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b, uj::a);
   }

   public void a(zb $$0) {
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
