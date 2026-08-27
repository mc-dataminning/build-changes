import java.util.Map;

public class xm implements xd<xg> {
   private final Map<ahc<? extends it<?>>, ast.a> a;

   public xm(Map<ahc<? extends it<?>>, ast.a> $$0) {
      this.a = $$0;
   }

   public xm(ug $$0) {
      this.a = $$0.a(ug::u, ast.a::b);
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, ug::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public void a(xg $$0) {
      $$0.a(this);
   }

   public Map<ahc<? extends it<?>>, ast.a> a() {
      return this.a;
   }
}
