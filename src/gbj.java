import java.util.Objects;

public class gbj extends gan implements gbl<cxh> {
   private final cxh y;
   private final cwp z = new cwp() {
      @Override
      public void a(cwb $$0, int $$1, dak $$2) {
         gbj.this.M();
      }

      @Override
      public void a(cwb $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            gbj.this.N();
         }
      }
   };

   public gbj(cxh $$0, csh $$1, xg $$2) {
      this.y = $$0;
   }

   public cxh L() {
      return this.y;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.y.a(this.z);
   }

   @Override
   public void aQ_() {
      this.m.t.p();
      super.aQ_();
   }

   @Override
   public void aK_() {
      super.aK_();
      this.y.b(this.z);
   }

   @Override
   protected void m() {
      if (this.m.t.gw()) {
         this.c(fty.a(xf.d, $$0 -> this.aQ_()).a(this.n / 2 - 100, 196, 98, 20).a());
         this.c(fty.a(xg.c("lectern.take_book"), $$0 -> this.g(3)).a(this.n / 2 + 2, 196, 98, 20).a());
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
      dak $$0 = this.y.l();
      this.a(Objects.requireNonNullElse(gan.a.a($$0), gan.d));
   }

   void N() {
      this.a(this.y.m());
   }

   @Override
   protected void I() {
      this.m.t.p();
   }
}
