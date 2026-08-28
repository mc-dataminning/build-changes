import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fxo<T extends cui> implements fpc, fpw, fru {
   public static final fpm a = new fpm(alp.b("recipe_book/button"), alp.b("recipe_book/button_highlighted"));
   protected static final alp b = alp.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xk j = xk.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final xk m = xk.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private ddc s;
   private final fxm u;
   private final List<fxq> v = Lists.newArrayList();
   @Nullable
   private fxq w;
   protected fpf e;
   protected final T f;
   protected flz g;
   @Nullable
   private foh x;
   private String y = "";
   private final List<fxo.a> z;
   private flk A;
   private final fxp B;
   @Nullable
   private ddc C;
   @Nullable
   private fxs D;
   private final cpt E = new cpt();
   private int F;
   private boolean G;
   private boolean H;
   private boolean I;
   @Nullable
   private fsg J;

   public fxo(T $$0, List<fxo.a> $$1) {
      this.f = $$0;
      this.z = $$1;
      fxv $$2 = () -> azu.d(this.r / 30.0F);
      this.u = new fxm($$2);
      this.B = new fxp(this, $$2, $$0 instanceof csv);
   }

   public void a(int $$0, int $$1, flz $$2, boolean $$3) {
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
      this.x = new foh(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xk.c("itemGroup.search"));
      this.x.f(50);
      this.x.g(true);
      this.x.g(16777215);
      this.x.a($$3);
      this.x.c(j);
      this.J = fsg.a(fsd.a, $$1 + 8, this.x.E(), this.x.D() - this.k(), this.x.w());
      this.B.a(this.g, $$1, $$2);
      this.e = new fpf($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.l();
      this.a();
      this.v.clear();

      for (fxo.a $$4 : this.z) {
         this.v.add(new fxq($$4));
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
      this.e.a(this.e.a() ? fpk.a(this.b()) : fpk.a(m));
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

   protected abstract boolean a(cuq var1);

   public void b(@Nullable cuq $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s = null;
         this.u.a();
         if (this.d()) {
            this.o();
         }
      }
   }

   private void n() {
      for (fxo.a $$0 : this.z) {
         for (fxs $$1 : this.A.a($$0.c())) {
            this.a($$1, this.E);
         }
      }
   }

   protected abstract void a(fxs var1, cpt var2);

   private void a(boolean $$0, boolean $$1) {
      List<fxs> $$2 = this.A.a(this.w.b());
      List<fxs> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         gfg $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<fxs> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
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

      for (fxq $$5 : this.v) {
         dbn $$6 = $$5.b();
         if ($$6 instanceof fxu) {
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!ftr.r()) {
            this.r += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = this.k();
         int $$5 = this.j();
         $$0.a(glq::H, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (fxq $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fnl $$0, int $$1, int $$2, @Nullable cuq $$3) {
      if (this.d()) {
         this.B.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xk b();

   public void a(fnl $$0, boolean $$1) {
      this.u.a($$0, this.g, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.aa_()) {
         if (this.B.a($$0, $$1, $$2, this.k(), this.j(), 147, 166)) {
            ddc $$3 = this.B.a();
            fxs $$4 = this.B.b();
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
               boolean $$5 = this.J != null && this.J.a(azu.a($$0), azu.a($$1));
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
               for (fxq $$7 : this.v) {
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

   private boolean a(fxs $$0, ddc $$1) {
      if (!$$0.a($$1) && $$1.equals(this.s)) {
         return false;
      } else {
         this.s = $$1;
         this.u.a();
         this.g.r.a(this.g.t.cd.l, $$1, ftr.s());
         return true;
      }
   }

   private boolean q() {
      cuj $$0 = this.f.an_();
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
      } else if (fsb.a($$0) && this.D != null && this.C != null) {
         fnw.b(flz.Q().ak());
         return this.a(this.D, this.C);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.G = false;
      return fpw.super.c($$0, $$1, $$2);
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
         return fpw.super.a($$0, $$1);
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
         hcp $$1 = this.g.ah();
         String $$2 = "en_pt";
         hco $$3 = $$1.b("en_pt");
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

   public void a(ddc $$0) {
      this.g.t.a($$0);
   }

   public void a(dda $$0) {
      this.u.a();
      bbf $$1 = ddh.a(Objects.requireNonNull(this.g.s));
      this.a(this.u, $$0, $$1);
   }

   protected abstract void a(fxm var1, dda var2, bbf var3);

   protected void h() {
      if (this.g.L() != null) {
         cuj $$0 = this.f.an_();
         boolean $$1 = this.A.a().a($$0);
         boolean $$2 = this.A.a().b($$0);
         this.g.L().b(new aik($$0, $$1, $$2));
      }
   }

   @Override
   public fru.a u() {
      return this.H ? fru.a.b : fru.a.a;
   }

   @Override
   public void b(frw $$0) {
      List<fru> $$1 = Lists.newArrayList();
      this.B.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      ftr.b $$2 = ftr.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }

   public static record a(cxg a, Optional<cxg> b, dbn c) {
      public a(fxu $$0) {
         this(new cxg(cxk.rz), Optional.empty(), $$0);
      }

      public a(cxc $$0, dby $$1) {
         this(new cxg($$0), Optional.empty(), $$1);
      }

      public a(cxc $$0, cxc $$1, dby $$2) {
         this(new cxg($$0), Optional.of(new cxg($$1)), $$2);
      }
   }
}
