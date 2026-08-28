import java.util.Objects;

public class fvr extends fuv implements fvt<cui> {
   private final cui y;
   private final ctq z = new ctq() {
      @Override
      public void a(ctc $$0, int $$1, cxp $$2) {
         fvr.this.M();
      }

      @Override
      public void a(ctc $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fvr.this.N();
         }
      }
   };

   public fvr(cui $$0, cpw $$1, xv $$2) {
      this.y = $$0;
   }

   public cui L() {
      return this.y;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.y.a(this.z);
   }

   @Override
   public void aP_() {
      this.m.t.p();
      super.aP_();
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.y.b(this.z);
   }

   @Override
   protected void l() {
      if (this.m.t.gv()) {
         this.c(fof.a(xu.d, $$0 -> this.aP_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fof.a(xv.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void G() {
      this.g(1);
   }

   @Override
   protected void J() {
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
   public boolean j() {
      return false;
   }

   void M() {
      cxp $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fuv.a.a($$0), fuv.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void K() {
      this.m.t.p();
   }
}
