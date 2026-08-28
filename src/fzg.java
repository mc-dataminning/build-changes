public class fzg extends frq {
   private static final ale a = ale.b("widget/page_forward_highlighted");
   private static final ale b = ale.b("widget/page_forward");
   private static final ale c = ale.b("widget/page_backward_highlighted");
   private static final ale d = ale.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fzg(int $$0, int $$1, boolean $$2, frq.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wv.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      ale $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gpn::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hnc $$0) {
      if (this.v) {
         $$0.a(hlr.a(awl.cy, 1.0F));
      }
   }
}
