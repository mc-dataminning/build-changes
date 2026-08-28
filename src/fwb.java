import java.util.Objects;

public class fwb extends fvf implements fwd<ctg> {
   private final ctg y;
   private final cso z = new cso() {
      @Override
      public void a(csa $$0, int $$1, cwn $$2) {
         fwb.this.M();
      }

      @Override
      public void a(csa $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fwb.this.N();
         }
      }
   };

   public fwb(ctg $$0, cou $$1, wo $$2) {
      this.y = $$0;
   }

   public ctg L() {
      return this.y;
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.y.a(this.z);
   }

   @Override
   public void aO_() {
      this.m.t.p();
      super.aO_();
   }

   @Override
   public void aI_() {
      super.aI_();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gv()) {
         this.c(fop.a(wn.d, $$0 -> this.aO_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fop.a(wo.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.m();
      }
   }

   @Override
   protected void G() {
      this.g(1);
   }

   @Override
   protected void H() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.y.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.m.r.a(this.y.l, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void M() {
      cwn $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fvf.a.a($$0), fvf.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
