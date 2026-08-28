import java.util.Objects;

public class gal extends fzp implements gan<cwl> {
   private final cwl y;
   private final cvt z = new cvt() {
      @Override
      public void a(cvf $$0, int $$1, czn $$2) {
         gal.this.M();
      }

      @Override
      public void a(cvf $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            gal.this.N();
         }
      }
   };

   public gal(cwl $$0, crl $$1, wy $$2) {
      this.y = $$0;
   }

   public cwl L() {
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
         this.c(fta.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fta.a(wy.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      czn $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fzp.a.a($$0), fzp.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
