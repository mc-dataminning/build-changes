public class gcd extends fun {
   private static final alk a = alk.b("widget/page_forward_highlighted");
   private static final alk b = alk.b("widget/page_forward");
   private static final alk c = alk.b("widget/page_backward_highlighted");
   private static final alk d = alk.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public gcd(int $$0, int $$1, boolean $$2, fun.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xb.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      alk $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gsn::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hqf $$0) {
      if (this.v) {
         $$0.a(hou.a(awr.cy, 1.0F));
      }
   }
}
