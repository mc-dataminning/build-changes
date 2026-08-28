public class fvp extends fny {
   private static final alp a = alp.b("widget/page_forward_highlighted");
   private static final alp b = alp.b("widget/page_forward");
   private static final alp c = alp.b("widget/page_backward_highlighted");
   private static final alp d = alp.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fvp(int $$0, int $$1, boolean $$2, fny.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xj.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      alp $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(glq::H, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hgj $$0) {
      if (this.v) {
         $$0.a(hey.a(awv.cy, 1.0F));
      }
   }
}
