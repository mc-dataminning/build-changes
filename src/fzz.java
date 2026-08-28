public class fzz extends fsj {
   private static final alg a = alg.b("widget/page_forward_highlighted");
   private static final alg b = alg.b("widget/page_forward");
   private static final alg c = alg.b("widget/page_backward_highlighted");
   private static final alg d = alg.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fzz(int $$0, int $$1, boolean $$2, fsj.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wx.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(frv $$0, int $$1, int $$2, float $$3) {
      alg $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gqk::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hoa $$0) {
      if (this.v) {
         $$0.a(hmp.a(awn.cy, 1.0F));
      }
   }
}
