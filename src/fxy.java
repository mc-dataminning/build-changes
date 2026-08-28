import java.util.Objects;

public class fxy extends fxc implements fya<cut> {
   private final cut y;
   private final cub z = new cub() {
      @Override
      public void a(ctn $$0, int $$1, cxy $$2) {
         fxy.this.M();
      }

      @Override
      public void a(ctn $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            fxy.this.N();
         }
      }
   };

   public fxy(cut $$0, cqh $$1, wv $$2) {
      this.y = $$0;
   }

   public cut L() {
      return this.y;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.y.a(this.z);
   }

   @Override
   public void aK_() {
      this.m.t.p();
      super.aK_();
   }

   @Override
   public void aE_() {
      super.aE_();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gv()) {
         this.c(fqn.a(wu.d, $$0 -> this.aK_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fqn.a(wv.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      cxy $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(fxc.a.a($$0), fxc.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
