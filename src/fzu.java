import java.util.Objects;

public class fzu extends fyy implements fzw<cwb> {
   private final cwb y;
   private final cvj z = new cvj() {
      @Override
      public void a(cuv $$0, int $$1, czd $$2) {
         fzu.this.M();
      }

      @Override
      public void a(cuv $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fzu.this.N();
         }
      }
   };

   public fzu(cwb $$0, crb $$1, wy $$2) {
      this.y = $$0;
   }

   public cwb L() {
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
      if (this.m.t.gw()) {
         this.c(fsj.a(wx.d, $$0 -> this.aL_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fsj.a(wy.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      czd $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fyy.a.a($$0), fyy.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
