import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fxv<T extends cur> implements fpj, fqd, fsb {
   public static final fpt a = new fpt(alz.b("recipe_book/button"), alz.b("recipe_book/button_highlighted"));
   protected static final alz b = alz.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xv j = xv.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final xv m = xv.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private ddl s;
   private final fxt u;
   private final List<fxx> v = Lists.newArrayList();
   @Nullable
   private fxx w;
   protected fpm e;
   protected final T f;
   protected fmg g;
   @Nullable
   private foo x;
   private String y = "";
   private final List<fxv.a> z;
   private flr A;
   private final fxw B;
   @Nullable
   private ddl C;
   @Nullable
   private fxz D;
   private final cqc E = new cqc();
   private int F;
   private boolean G;
   private boolean H;
   private boolean I;
   @Nullable
   private fsn J;

   public fxv(T $$0, List<fxv.a> $$1) {
      this.f = $$0;
      this.z = $$1;
      fyc $$2 = () -> bae.d(this.r / 30.0F);
      this.u = new fxt($$2);
      this.B = new fxw(this, $$2, $$0 instanceof cte);
   }

   public void a(int $$0, int $$1, fmg $$2, boolean $$3) {
      this.g = $$2;
      this.p = $$0;
      this.q = $$1;
      this.I = $$3;
      this.A = $$2.t.n();
      this.F = $$2.t.gi().l();
      this.H = this.m();
      if (this.H) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.p();
      this.o = this.I ? 0 : 86;
      int $$1 = this.k();
      int $$2 = this.j();
      this.E.a();
      this.g.t.gi().a(this.E);
      this.f.a(this.E);
      String $$3 = this.x != null ? this.x.a() : "";
      this.x = new foo(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xv.c("itemGroup.search"));
      this.x.f(50);
      this.x.g(true);
      this.x.g(16777215);
      this.x.a($$3);
      this.x.c(j);
      this.J = fsn.a(fsk.a, $$1 + 8, this.x.E(), this.x.D() - this.k(), this.x.w());
      this.B.a(this.g, $$1, $$2);
      this.e = new fpm($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.l();
      this.a();
      this.v.clear();

      for (fxv.a $$4 : this.z) {
         this.v.add(new fxx($$4));
      }

      if (this.w != null) {
         this.w = this.v.stream().filter($$0x -> $$0x.b().equals(this.w.b())).findFirst().orElse(null);
      }

      if (this.w == null) {
         this.w = this.v.get(0);
      }

      this.w.b(true);
      this.n();
      this.c($$0);
      this.a(false, $$0);
   }

   private int j() {
      return (this.q - 166) / 2;
   }

   private int k() {
      return (this.p - 147) / 2 - this.o;
   }

   private void l() {
      this.e.a(this.e.a() ? fpr.a(this.b()) : fpr.a(m));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.d() && !this.I) {
         $$2 = 177 + ($$0 - $$1 - 200) / 2;
      } else {
         $$2 = ($$0 - $$1) / 2;
      }

      return $$2;
   }

   public void c() {
      this.b(!this.d());
   }

   public boolean d() {
      return this.H;
   }

   private boolean m() {
      return this.A.a(this.f.an_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.H = $$0;
      this.A.a(this.f.an_(), $$0);
      if (!$$0) {
         this.B.c();
      }

      this.h();
   }

   protected abstract boolean a(cuz var1);

   public void b(@Nullable cuz $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s = null;
         this.u.a();
         if (this.d()) {
            this.o();
         }
      }
   }

   private void n() {
      for (fxv.a $$0 : this.z) {
         for (fxz $$1 : this.A.a($$0.c())) {
            this.a($$1, this.E);
         }
      }
   }

   protected abstract void a(fxz var1, cqc var2);

   private void a(boolean $$0, boolean $$1) {
      List<fxz> $$2 = this.A.a(this.w.b());
      List<fxz> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         gfl $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<fxz> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf($$1x -> !$$6.contains($$1x));
         }
      }

      if ($$1) {
         $$3.removeIf($$0x -> !$$0x.a());
      }

      this.B.a($$3, $$0, $$1);
   }

   private void c(boolean $$0) {
      int $$1 = (this.p - 147) / 2 - this.o - 30;
      int $$2 = (this.q - 166) / 2 + 3;
      int $$3 = 27;
      int $$4 = 0;

      for (fxx $$5 : this.v) {
         dbw $$6 = $$5.b();
         if ($$6 instanceof fyb) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.A)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.A, $$0);
         }
      }
   }

   public void e() {
      boolean $$0 = this.m();
      if (this.d() != $$0) {
         this.b($$0);
      }

      if (this.d()) {
         if (this.F != this.g.t.gi().l()) {
            this.o();
            this.F = this.g.t.gi().l();
         }
      }
   }

   private void o() {
      this.E.a();
      this.g.t.gi().a(this.E);
      this.f.a(this.E);
      this.n();
      this.a(false, this.p());
   }

   private boolean p() {
      return this.A.b(this.f.an_());
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fty.r()) {
            this.r += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = this.k();
         int $$5 = this.j();
         $$0.a(glv::C, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (fxx $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fns $$0, int $$1, int $$2, @Nullable cuz $$3) {
      if (this.d()) {
         this.B.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xv b();

   public void a(fns $$0, boolean $$1) {
      this.u.a($$0, this.g, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.aa_()) {
         if (this.B.a($$0, $$1, $$2, this.k(), this.j(), 147, 166)) {
            ddl $$3 = this.B.a();
            fxz $$4 = this.B.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.D = $$4;
               this.C = $$3;
               if (!this.s()) {
                  this.b(false);
               }
            }

            return true;
         } else {
            if (this.x != null) {
               boolean $$5 = this.J != null && this.J.a(bae.a($$0), bae.a($$1));
               if ($$5 || this.x.a($$0, $$1, $$2)) {
                  this.x.a(true);
                  return true;
               }

               this.x.a(false);
            }

            if (this.e.a($$0, $$1, $$2)) {
               boolean $$6 = this.q();
               this.e.b($$6);
               this.l();
               this.h();
               this.a(false, $$6);
               return true;
            } else {
               for (fxx $$7 : this.v) {
                  if ($$7.a($$0, $$1, $$2)) {
                     if (this.w != $$7) {
                        if (this.w != null) {
                           this.w.b(false);
                        }

                        this.w = $$7;
                        this.w.b(true);
                        this.a(true, this.p());
                     }

                     return true;
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(fxz $$0, ddl $$1) {
      if (!$$0.a($$1) && $$1.equals(this.s)) {
         return false;
      } else {
         this.s = $$1;
         this.u.a();
         this.g.r.a(this.g.t.cd.l, $$1, fty.s());
         return true;
      }
   }

   private boolean q() {
      cus $$0 = this.f.an_();
      boolean $$1 = !this.A.b($$0);
      this.A.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.d()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.w.B();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.G = false;
      if (!this.d() || this.g.t.aa_()) {
         return false;
      } else if ($$0 == 256 && !this.s()) {
         this.b(false);
         return true;
      } else if (this.x.a($$0, $$1, $$2)) {
         this.r();
         return true;
      } else if (this.x.aN_() && this.x.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.x.aN_()) {
         this.G = true;
         this.x.a(true);
         return true;
      } else if (fsi.a($$0) && this.D != null && this.C != null) {
         fod.b(fmg.Q().ak());
         return this.a(this.D, this.C);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.G = false;
      return fqd.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.G) {
         return false;
      } else if (!this.d() || this.g.t.aa_()) {
         return false;
      } else if (this.x.a($$0, $$1)) {
         this.r();
         return true;
      } else {
         return fqd.super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aN_() {
      return false;
   }

   private void r() {
      String $$0 = this.x.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.y)) {
         this.a(false, this.p());
         this.y = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         hcu $$1 = this.g.ah();
         String $$2 = "en_pt";
         hct $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ab = "en_pt";
         this.g.l();
         this.g.n.az();
      }
   }

   private boolean s() {
      return this.o == 86;
   }

   public void g() {
      this.n();
      this.c(this.p());
      if (this.d()) {
         this.a(false, this.p());
      }
   }

   public void a(ddl $$0) {
      this.g.t.a($$0);
   }

   public void a(ddj $$0) {
      this.u.a();
      bbp $$1 = ddq.a(Objects.requireNonNull(this.g.s));
      this.a(this.u, $$0, $$1);
   }

   protected abstract void a(fxt var1, ddj var2, bbp var3);

   protected void h() {
      if (this.g.L() != null) {
         cus $$0 = this.f.an_();
         boolean $$1 = this.A.a().a($$0);
         boolean $$2 = this.A.a().b($$0);
         this.g.L().b(new aiu($$0, $$1, $$2));
      }
   }

   @Override
   public fsb.a u() {
      return this.H ? fsb.a.b : fsb.a.a;
   }

   @Override
   public void b(fsd $$0) {
      List<fsb> $$1 = Lists.newArrayList();
      this.B.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      fty.b $$2 = fty.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }

   public static record a(cxp a, Optional<cxp> b, dbw c) {
      public a(fyb $$0) {
         this(new cxp(cxt.rq), Optional.empty(), $$0);
      }

      public a(cxl $$0, dch $$1) {
         this(new cxp($$0), Optional.empty(), $$1);
      }

      public a(cxl $$0, cxl $$1, dch $$2) {
         this(new cxp($$0), Optional.of(new cxp($$1)), $$2);
      }
   }
}
