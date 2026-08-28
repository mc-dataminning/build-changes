public class fxg extends fpq {
   private static final aku a = aku.b("widget/page_forward_highlighted");
   private static final aku b = aku.b("widget/page_forward");
   private static final aku c = aku.b("widget/page_backward_highlighted");
   private static final aku d = aku.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fxg(int $$0, int $$1, boolean $$2, fpq.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wo.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      aku $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gnh::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hku $$0) {
      if (this.v) {
         $$0.a(hjj.a(awa.cy, 1.0F));
      }
   }
}
