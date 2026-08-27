import java.util.List;

public record zb(zb.a a, List<String> b) implements wk<yd> {
   public zb(tu $$0) {
      this($$0.b(zb.a.class), $$0.a(tu::s));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b, tu::a);
   }

   public void a(yd $$0) {
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
