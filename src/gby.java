import java.util.Objects;

public class gby extends gbc implements gca<cwy> {
   private final cwy y;
   private final cwg z = new cwg() {
      @Override
      public void a(cvs $$0, int $$1, daa $$2) {
         gby.this.M();
      }

      @Override
      public void a(cvs $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            gby.this.N();
         }
      }
   };

   public gby(cwy $$0, cry $$1, xc $$2) {
      this.y = $$0;
   }

   public cwy L() {
      return this.y;
   }

   @Override
   protected void aS_() {
      super.aS_();
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
   protected void m() {
      if (this.m.t.gw()) {
         this.c(fun.a(xb.d, $$0 -> this.aP_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fun.a(xc.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      daa $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(gbc.a.a($$0), gbc.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
