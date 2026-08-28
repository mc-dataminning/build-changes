import javax.annotation.Nullable;

public class fwl implements gfz {
   private static final ali a = ali.b("hud/hotbar");
   private static final ali b = ali.b("hud/hotbar_selection");
   private static final long c = 5000L;
   private static final long d = 2000L;
   private final frd e;
   private long f;
   @Nullable
   private gfw g;

   public fwl(frd $$0) {
      this.e = $$0;
   }

   public void a(int $$0) {
      this.f = ag.c();
      if (this.g != null) {
         this.g.b($$0);
      } else {
         this.g = new gfw(this);
      }
   }

   private float c() {
      long $$0 = this.f - ag.c() + 5000L;
      return azo.a((float)$$0 / 2000.0F, 0.0F, 1.0F);
   }

   public void a(ftx $$0) {
      if (this.g != null) {
         float $$1 = this.c();
         if ($$1 <= 0.0F) {
            this.g.d();
         } else {
            int $$2 = $$0.a() / 2;
            $$0.c().a();
            $$0.c().a(0.0F, 0.0F, -90.0F);
            int $$3 = azo.d((float)$$0.b() - 22.0F * $$1);
            gga $$4 = this.g.f();
            this.a($$0, $$1, $$2, $$3, $$4);
            $$0.c().b();
         }
      }
   }

   protected void a(ftx $$0, float $$1, int $$2, int $$3, gga $$4) {
      int $$5 = axy.a($$1);
      $$0.a(gsl::H, a, $$2 - 91, $$3, 182, 22, $$5);
      if ($$4.a() >= 0) {
         $$0.a(gsl::H, b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 24, 23, $$5);
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a($$0, $$6, $$0.a() / 2 - 90 + $$6 * 20 + 2, (float)($$3 + 3), $$1, $$4.a($$6));
      }
   }

   private void a(ftx $$0, int $$1, int $$2, float $$3, float $$4, gfy $$5) {
      if ($$5 != gfw.a) {
         $$0.c().a();
         $$0.c().a((float)$$2, $$3, 0.0F);
         float $$6 = $$5.aU_() ? 1.0F : 0.25F;
         $$5.a($$0, $$6, $$4);
         $$0.c().b();
         int $$7 = (int)($$4 * 255.0F);
         if ($$7 > 3 && $$5.aU_()) {
            xa $$8 = this.e.n.S[$$1].k();
            $$0.b(this.e.h, $$8, $$2 + 19 - 2 - this.e.h.a($$8), (int)$$3 + 6 + 3, 16777215 + ($$7 << 24));
         }
      }
   }

   public void b(ftx $$0) {
      int $$1 = (int)(this.c() * 255.0F);
      if ($$1 > 3 && this.g != null) {
         gfy $$2 = this.g.b();
         xa $$3 = $$2 == gfw.a ? this.g.c().b() : $$2.aT_();
         if ($$3 != null) {
            int $$4 = this.e.h.a($$3);
            int $$5 = ($$0.a() - $$4) / 2;
            int $$6 = $$0.b() - 35;
            $$0.a(this.e.h, $$3, $$5, $$6, $$4, axy.c($$1, -1));
         }
      }
   }

   @Override
   public void a(gfw $$0) {
      this.g = null;
      this.f = 0L;
   }

   public boolean a() {
      return this.g != null;
   }

   public void b(int $$0) {
      int $$1 = this.g.e() + $$0;

      while ($$1 >= 0 && $$1 <= 8 && (this.g.a($$1) == gfw.a || !this.g.a($$1).aU_())) {
         $$1 += $$0;
      }

      if ($$1 >= 0 && $$1 <= 8) {
         this.g.b($$1);
         this.f = ag.c();
      }
   }

   public void b() {
      this.f = ag.c();
      if (this.a()) {
         int $$0 = this.g.e();
         if ($$0 != -1) {
            this.g.b($$0);
         }
      } else {
         this.g = new gfw(this);
      }
   }
}
