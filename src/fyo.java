public class fyo extends fyw {
   private static final axt a = axt.a();
   private final fyr b;

   fyo(fuq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fyr $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public fya b() {
      return fya.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.e(0.0F);
      } else {
         this.e(axm.i(0.05F, this.y, 1.0F));
      }
   }

   private boolean g() {
      fby $$0 = fby.Q();
      fzk $$1 = $$0.s;
      return $$1 != null && $$1.bu().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gx();
   }

   public static class a implements fxz<kq> {
      private final fyr a;

      public a(fyr $$0) {
         this.a = $$0;
      }

      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fxw $$8 = new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(0.15F);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class b implements fxz<kq> {
      private final fyr a;

      public b(fyr $$0) {
         this.a = $$0;
      }

      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class c implements fxz<kq> {
      private final fyr a;

      public c(fyr $$0) {
         this.a = $$0;
      }

      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fxw $$8 = new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a((float)$$5, (float)$$6, (float)$$7);
         return $$8;
      }
   }

   public static class d implements fxz<kq> {
      private final fyr a;

      public d(fyr $$0) {
         this.a = $$0;
      }

      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class e implements fxz<kq> {
      private final fyr a;

      public e(fyr $$0) {
         this.a = $$0;
      }

      public fxw a(kq $$0, fuq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fyo $$8 = new fyo($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
