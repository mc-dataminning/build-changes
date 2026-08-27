import java.util.List;

public record zf(zf.a a, List<String> b) implements wo<yh> {
   public zf(ty $$0) {
      this($$0.b(zf.a.class), $$0.a(ty::s));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ty::a);
   }

   public void a(yh $$0) {
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
