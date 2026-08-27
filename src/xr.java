import java.util.List;

public record xr(xr.a a, List<String> b) implements va<ws> {
   public xr(sl $$0) {
      this($$0.b(xr.a.class), $$0.a(sl::r));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sl::a);
   }

   public void a(ws $$0) {
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
