public class fwk extends fou {
   private static final akv a = akv.b("widget/page_forward_highlighted");
   private static final akv b = akv.b("widget/page_forward");
   private static final akv c = akv.b("widget/page_backward_highlighted");
   private static final akv d = akv.b("widget/page_backward");
   private final boolean u;
   private final boolean v;

   public fwk(int $$0, int $$1, boolean $$2, fou.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, wo.a, $$3, q);
      this.u = $$2;
      this.v = $$4;
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      akv $$4;
      if (this.u) {
         $$4 = this.D() ? a : b;
      } else {
         $$4 = this.D() ? c : d;
      }

      $$0.a(gmj::H, $$4, this.F(), this.G(), 23, 13);
   }

   @Override
   public void a(hjw $$0) {
      if (this.v) {
         $$0.a(hil.a(awa.cy, 1.0F));
      }
   }
}
