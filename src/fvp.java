public class fvp extends fny {
   private static final alz a = alz.b("widget/page_forward_highlighted");
   private static final alz b = alz.b("widget/page_forward");
   private static final alz c = alz.b("widget/page_backward_highlighted");
   private static final alz d = alz.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fvp(int $$0, int $$1, boolean $$2, fny.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, xu.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      alz $$4;
      if (this.u) {
         $$4 = this.B() ? a : b;
      } else {
         $$4 = this.B() ? c : d;
      }

      $$0.a(glo::B, $$4, this.D(), this.E(), 23, 13);
   }

   @Override
   public void a(hgg $$0) {
      if (this.v) {
         $$0.a(hew.a(axf.cy, 1.0F));
      }
   }
}
