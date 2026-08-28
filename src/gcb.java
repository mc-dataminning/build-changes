public class gcb extends ful {
   private static final ali a = ali.b("widget/page_forward_highlighted");
   private static final ali b = ali.b("widget/page_forward");
   private static final ali c = ali.b("widget/page_backward_highlighted");
   private static final ali d = ali.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public gcb(int $$0, int $$1, boolean $$2, ful.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wz.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      ali $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gsl::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hqd $$0) {
      if (this.v) {
         $$0.a(hos.a(awp.cy, 1.0F));
      }
   }
}
