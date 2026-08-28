public class fyd extends fqn {
   private static final ald a = ald.b("widget/page_forward_highlighted");
   private static final ald b = ald.b("widget/page_forward");
   private static final ald c = ald.b("widget/page_backward_highlighted");
   private static final ald d = ald.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fyd(int $$0, int $$1, boolean $$2, fqn.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wu.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      ald $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(goi::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hlv $$0) {
      if (this.v) {
         $$0.a(hkk.a(awk.cy, 1.0F));
      }
   }
}
