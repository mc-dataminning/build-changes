public class fzm extends gay {
   static final ayk a = ayk.a();
   private final gat b;

   fzm(fwr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gat $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.C = true;
      this.b = $$7;
      this.D *= 0.75F;
      this.n = false;
      this.b($$7);
   }

   @Override
   public gac b() {
      return gac.c;
   }

   @Override
   public int a(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      $$1 = ayd.a($$1, 0.0F, 1.0F);
      int $$2 = super.a($$0);
      int $$3 = $$2 & 0xFF;
      int $$4 = $$2 >> 16 & 0xFF;
      $$3 += (int)($$1 * 15.0F * 16.0F);
      if ($$3 > 240) {
         $$3 = 240;
      }

      return $$3 | $$4 << 16;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gab<lb> {
      private final double a = 0.25;
      private final gat b;

      public a(gat $$0) {
         this.b = $$0;
      }

      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzm $$8 = new fzm($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
         $$8.a(1.0F, 0.9F, 1.0F);
         $$8.b($$5 * 0.25, $$6 * 0.25, $$7 * 0.25);
         int $$9 = 2;
         int $$10 = 4;
         $$8.a($$1.z.a(2) + 2);
         return $$8;
      }
   }

   public static class b implements gab<lb> {
      private final gat a;

      public b(gat $$0) {
         this.a = $$0;
      }

      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzm $$8 = new fzm($$1, $$2, $$3, $$4, 0.5 - fzm.a.j(), $$6, 0.5 - fzm.a.j(), this.a);
         if ($$1.z.h()) {
            $$8.a(0.6F, 1.0F, 0.8F);
         } else {
            $$8.a(0.08F, 0.4F, 0.4F);
         }

         $$8.k *= 0.2F;
         if ($$5 == 0.0 && $$7 == 0.0) {
            $$8.j *= 0.1F;
            $$8.l *= 0.1F;
         }

         $$8.a((int)(8.0 / ($$1.z.j() * 0.8 + 0.2)));
         return $$8;
      }
   }

   public static class c implements gab<lb> {
      private final double a = 0.01;
      private final gat b;

      public c(gat $$0) {
         this.b = $$0;
      }

      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzm $$8 = new fzm($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
         if ($$1.z.h()) {
            $$8.a(0.29F, 0.58F, 0.51F);
         } else {
            $$8.a(0.43F, 0.77F, 0.62F);
         }

         $$8.b($$5 * 0.01, $$6 * 0.01, $$7 * 0.01);
         int $$9 = 10;
         int $$10 = 40;
         $$8.a($$1.z.a(30) + 10);
         return $$8;
      }
   }

   public static class d implements gab<lb> {
      private final double a = 0.01;
      private final gat b;

      public d(gat $$0) {
         this.b = $$0;
      }

      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzm $$8 = new fzm($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
         $$8.a(1.0F, 0.9F, 1.0F);
         $$8.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
         int $$9 = 10;
         int $$10 = 40;
         $$8.a($$1.z.a(30) + 10);
         return $$8;
      }
   }

   public static class e implements gab<lb> {
      private final double a = 0.01;
      private final gat b;

      public e(gat $$0) {
         this.b = $$0;
      }

      public fzy a(lb $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fzm $$8 = new fzm($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, this.b);
         $$8.a(0.91F, 0.55F, 0.08F);
         $$8.b($$5 * 0.01 / 2.0, $$6 * 0.01, $$7 * 0.01 / 2.0);
         int $$9 = 10;
         int $$10 = 40;
         $$8.a($$1.z.a(30) + 10);
         return $$8;
      }
   }
}
