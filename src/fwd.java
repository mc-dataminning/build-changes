import java.util.Objects;

public class fwd extends fvh implements fwf<cti> {
   private final cti y;
   private final csq z = new csq() {
      @Override
      public void a(csc $$0, int $$1, cwp $$2) {
         fwd.this.M();
      }

      @Override
      public void a(csc $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fwd.this.N();
         }
      }
   };

   public fwd(cti $$0, cow $$1, wo $$2) {
      this.y = $$0;
   }

   public cti L() {
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
         this.c(fos.a(wn.d, $$0 -> this.aO_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fos.a(wo.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cwp $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fvh.a.a($$0), fvh.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
