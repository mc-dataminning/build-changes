import java.util.List;

public record zv(zv.a a, List<String> b) implements xd<yx> {
   public zv(ug $$0) {
      this($$0.b(zv.a.class), $$0.a(ug::s));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ug::a);
   }

   public void a(yx $$0) {
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
