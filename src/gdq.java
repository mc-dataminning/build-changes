import javax.annotation.Nullable;

public class gdq extends gdj {
   private static final xa v = xa.c("controls.keybinds.title");
   @Nullable
   public frb a;
   public long u;
   private gdp w;
   private ful x;

   public gdq(gad $$0, frh $$1) {
      super($$0, $$1, v);
   }

   @Override
   protected void F() {
      this.w = this.s.c(new gdp(this, this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      this.x = ful.a(xa.c("controls.resetAll"), $$0x -> {
         for (frb $$1 : this.c.V) {
            $$1.b($$1.i());
         }

         this.w.b();
      }).a();
      fyd $$0 = this.s.b(fyd.e().a(8));
      $$0.a(this.x);
      $$0.a(ful.a(wz.d, $$0x -> this.aP_()).a());
   }

   @Override
   protected void c() {
      this.s.a();
      this.w.a(this.n, this.s);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.a != null) {
         this.a.b(fka.b.c.a($$2));
         this.a = null;
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.a != null) {
         if ($$0 == 256) {
            this.a.b(fka.bv);
         } else {
            this.a.b(fka.a($$0, $$1));
         }

         this.a = null;
         this.u = ag.c();
         this.w.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      boolean $$4 = false;

      for (frb $$5 : this.c.V) {
         if (!$$5.l()) {
            $$4 = true;
            break;
         }
      }

      this.x.j = $$4;
   }
}
