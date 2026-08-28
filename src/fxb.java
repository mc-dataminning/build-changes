import java.util.Objects;

public class fxb extends fwf implements fxd<cuc> {
   private final cuc y;
   private final ctk z = new ctk() {
      @Override
      public void a(csw $$0, int $$1, cxh $$2) {
         fxb.this.M();
      }

      @Override
      public void a(csw $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fxb.this.N();
         }
      }
   };

   public fxb(cuc $$0, cpq $$1, wp $$2) {
      this.y = $$0;
   }

   public cuc L() {
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
      if (this.m.t.gy()) {
         this.c(fpq.a(wo.d, $$0 -> this.aO_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fpq.a(wp.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cxh $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fwf.a.a($$0), fwf.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
