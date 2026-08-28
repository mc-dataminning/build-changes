import java.util.Objects;

public class gag extends fzk implements gai<cwi> {
   private final cwi y;
   private final cvq z = new cvq() {
      @Override
      public void a(cvc $$0, int $$1, czk $$2) {
         gag.this.M();
      }

      @Override
      public void a(cvc $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            gag.this.N();
         }
      }
   };

   public gag(cwi $$0, cri $$1, wy $$2) {
      this.y = $$0;
   }

   public cwi L() {
      return this.y;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.y.a(this.z);
   }

   @Override
   public void aL_() {
      this.m.t.p();
      super.aL_();
   }

   @Override
   public void aF_() {
      super.aF_();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gv()) {
         this.c(fsv.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fsv.a(wy.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      czk $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fzk.a.a($$0), fzk.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
