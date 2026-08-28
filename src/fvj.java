import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fvj extends fwf {
   private static final ald a = ald.b("icon/draft_report");
   private int b;
   private final wv c;
   private final boolean d;
   private wv s;
   private final List<fqn> u = Lists.newArrayList();
   @Nullable
   private fqn v;

   public fvj(@Nullable wv $$0, boolean $$1) {
      super(wv.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.b = 0;
      this.u.clear();
      wv $$0 = this.d ? wv.c("deathScreen.spectate") : wv.c("deathScreen.respawn");
      this.u.add(this.c(fqn.a($$0, $$0x -> {
         this.m.t.gf();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.v = this.c(
         fqn.a(wv.c("deathScreen.titleScreen"), $$0x -> this.m.ba().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.u.add(this.v);
      this.c(false);
      this.s = wv.a("deathScreen.score.value", wv.b(Integer.toString(this.m.t.gc())).a(n.o));
   }

   @Override
   public boolean aC_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.E();
      } else {
         fvd $$0 = new fvj.a($$0x -> {
            if ($$0x) {
               this.E();
            } else {
               this.m.t.gf();
               this.m.a(null);
            }
         }, wv.c("deathScreen.quit.confirm"), wu.a, wv.c("deathScreen.titleScreen"), wv.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void E() {
      if (this.m.s != null) {
         this.m.s.ad();
      }

      this.m.b(new fvq(wv.c("menu.savingLevel")));
      this.m.a(new fwh());
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.p, this.l, this.n / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.p, this.c, this.n / 2, 85, 16777215);
      }

      $$0.a(this.p, this.s, this.n / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         xs $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.v != null && this.m.ba().c()) {
         $$0.a(goi::H, a, this.v.F() + this.v.A() - 17, this.v.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      a($$0, this.n, this.o);
   }

   static void a(fpz $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private xs a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.m.h.a(this.c);
         int $$2 = this.n / 2 - $$1 / 2;
         int $$3 = this.n / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.m.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         xs $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.i() != null && $$3.i().a() == wt.a.a) {
            this.a($$3);
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public void e() {
      super.e();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (fqn $$1 : this.u) {
         $$1.j = $$0;
      }
   }

   public static class a extends fvd {
      public a(BooleanConsumer $$0, wv $$1, wv $$2, wv $$3, wv $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         fvj.a($$0, this.n, this.o);
      }
   }
}
