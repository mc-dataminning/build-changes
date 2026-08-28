import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class fuo<T extends csy> implements fmc, fmw, fov, fut {
   public static final fmm a = new fmm(alh.b("recipe_book/button"), alh.b("recipe_book/button_highlighted"));
   protected static final alh b = alh.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xh j = xh.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final xh l = xh.c("gui.recipebook.toggleRecipes.all");
   private static final int m = 30;
   private int n;
   private int o;
   private int p;
   private float q;
   @Nullable
   private dal<?> r;
   private final fum s;
   private final List<fuq> u = Lists.newArrayList();
   @Nullable
   private fuq v;
   protected fmf e;
   protected final T f;
   protected fja g;
   @Nullable
   private fli w;
   private String x = "";
   private fil y;
   private final fup z;
   @Nullable
   private dal<?> A;
   @Nullable
   private fus B;
   private final com C = new com();
   private int D;
   private boolean E;
   private boolean F;
   private boolean G;

   public fuo(T $$0) {
      this.f = $$0;
      fuv $$1 = () -> azj.d(this.q / 30.0F);
      this.s = new fum($$1);
      this.z = new fup($$1, $$0 instanceof crl);
   }

   public void a(int $$0, int $$1, fja $$2, boolean $$3) {
      this.g = $$2;
      this.o = $$0;
      this.p = $$1;
      this.G = $$3;
      this.y = $$2.t.j();
      this.D = $$2.t.gk().l();
      this.F = this.k();
      if (this.F) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.m();
      this.n = this.G ? 0 : 86;
      int $$1 = (this.o - 147) / 2 - this.n;
      int $$2 = (this.p - 166) / 2;
      this.C.a();
      this.g.t.gk().a(this.C);
      this.f.a(this.C);
      String $$3 = this.w != null ? this.w.a() : "";
      this.w = new fli(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xh.c("itemGroup.search"));
      this.w.f(50);
      this.w.g(true);
      this.w.g(16777215);
      this.w.a($$3);
      this.w.c(j);
      this.z.a(this.g, $$1, $$2);
      this.z.a(this);
      this.e = new fmf($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.j();
      this.a();
      this.u.clear();

      for (fjh $$4 : fjh.a(this.f.ao_())) {
         this.u.add(new fuq($$4));
      }

      if (this.v != null) {
         this.v = this.u.stream().filter($$0x -> $$0x.b().equals(this.v.b())).findFirst().orElse(null);
      }

      if (this.v == null) {
         this.v = this.u.get(0);
      }

      this.v.b(true);
      this.a(false, $$0);
      this.c($$0);
   }

   private void j() {
      this.e.a(this.e.a() ? fmk.a(this.b()) : fmk.a(l));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.d() && !this.G) {
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
      return this.F;
   }

   private boolean k() {
      return this.y.a(this.f.ao_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.F = $$0;
      this.y.a(this.f.ao_(), $$0);
      if (!$$0) {
         this.z.c();
      }

      this.h();
   }

   protected abstract boolean a(ctg var1);

   public void b(@Nullable ctg $$0) {
      if ($$0 != null && this.a($$0)) {
         this.q();
         if (this.d()) {
            this.l();
         }
      }
   }

   protected abstract void a(fus var1, com var2, awn var3);

   private void a(boolean $$0, boolean $$1) {
      List<fus> $$2 = this.y.a(this.v.b());
      $$2.forEach($$0x -> this.a($$0x, this.C, this.y));
      List<fus> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      $$3.removeIf($$0x -> !$$0x.d());
      String $$4 = this.w.a();
      if (!$$4.isEmpty()) {
         gby $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<fus> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf($$1x -> !$$6.contains($$1x));
         }
      }

      if ($$1) {
         $$3.removeIf($$0x -> !$$0x.c());
      }

      this.z.a($$3, $$0, $$1);
   }

   private void c(boolean $$0) {
      int $$1 = (this.o - 147) / 2 - this.n - 30;
      int $$2 = (this.p - 166) / 2 + 3;
      int $$3 = 27;
      int $$4 = 0;

      for (fuq $$5 : this.u) {
         fjh $$6 = $$5.b();
         if ($$6 == fjh.a || $$6 == fjh.f) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.y)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.y, $$0);
         }
      }
   }

   public void e() {
      boolean $$0 = this.k();
      if (this.d() != $$0) {
         this.b($$0);
      }

      if (this.d()) {
         if (this.D != this.g.t.gk().l()) {
            this.l();
            this.D = this.g.t.gk().l();
         }
      }
   }

   private void l() {
      this.C.a();
      this.g.t.gk().a(this.C);
      this.f.a(this.C);
      this.a(false, this.m());
   }

   private boolean m() {
      return this.y.b(this.f.ao_());
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fqs.s()) {
            this.q += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = (this.o - 147) / 2 - this.n;
         int $$5 = (this.p - 166) / 2;
         $$0.a(gig::B, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.w.a($$0, $$1, $$2, $$3);

         for (fuq $$6 : this.u) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.z.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fkm $$0, int $$1, int $$2, @Nullable ctg $$3) {
      if (this.d()) {
         this.z.a($$0, $$1, $$2);
         this.s.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xh b();

   public void a(fkm $$0, int $$1, int $$2, boolean $$3) {
      this.s.a($$0, this.g, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.R_()) {
         if (this.z.a($$0, $$1, $$2, (this.o - 147) / 2 - this.n, (this.p - 166) / 2, 147, 166)) {
            dal<?> $$3 = this.z.a();
            fus $$4 = this.z.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.B = $$4;
               this.A = $$3;
               if (!this.p()) {
                  this.b(false);
               }
            }

            return true;
         } else if (this.w.a($$0, $$1, $$2)) {
            this.w.a(true);
            return true;
         } else {
            this.w.a(false);
            if (this.e.a($$0, $$1, $$2)) {
               boolean $$5 = this.n();
               this.e.b($$5);
               this.j();
               this.h();
               this.a(false, $$5);
               return true;
            } else {
               for (fuq $$6 : this.u) {
                  if ($$6.a($$0, $$1, $$2)) {
                     if (this.v != $$6) {
                        if (this.v != null) {
                           this.v.b(false);
                        }

                        this.v = $$6;
                        this.v.b(true);
                        this.a(true, this.m());
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

   private boolean a(fus $$0, dal<?> $$1) {
      if (!$$0.a($$1) && this.r == $$1) {
         return false;
      } else {
         this.q();
         this.g.r.a(this.g.t.ca.l, $$1, fqs.t());
         return true;
      }
   }

   private boolean n() {
      csz $$0 = this.f.ao_();
      boolean $$1 = !this.y.b($$0);
      this.y.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.d()) {
         return true;
      } else {
         boolean $$7 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + $$4) || $$1 >= (double)($$3 + $$5);
         boolean $$8 = (double)($$2 - 147) < $$0 && $$0 < (double)$$2 && (double)$$3 < $$1 && $$1 < (double)($$3 + $$5);
         return $$7 && !$$8 && !this.v.B();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.E = false;
      if (!this.d() || this.g.t.R_()) {
         return false;
      } else if ($$0 == 256 && !this.p()) {
         this.b(false);
         return true;
      } else if (this.w.a($$0, $$1, $$2)) {
         this.o();
         return true;
      } else if (this.w.aN_() && this.w.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.w.aN_()) {
         this.E = true;
         this.w.a(true);
         return true;
      } else if (fpc.a($$0) && this.B != null && this.A != null) {
         fkx.b(fja.Q().ak());
         return this.a(this.B, this.A);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.E = false;
      return fmw.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.E) {
         return false;
      } else if (!this.d() || this.g.t.R_()) {
         return false;
      } else if (this.w.a($$0, $$1)) {
         this.o();
         return true;
      } else {
         return fmw.super.a($$0, $$1);
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

   private void o() {
      String $$0 = this.w.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.x)) {
         this.a(false, this.m());
         this.x = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         gzb $$1 = this.g.ah();
         String $$2 = "en_pt";
         gza $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ab = "en_pt";
         this.g.l();
         this.g.n.ay();
      }
   }

   private boolean p() {
      return this.n == 86;
   }

   public void f() {
      this.c(this.m());
      if (this.d()) {
         this.a(false, this.m());
      }
   }

   @Override
   public void a(List<dal<?>> $$0) {
      for (dal<?> $$1 : $$0) {
         this.g.t.a($$1);
      }
   }

   private void q() {
      this.r = null;
      this.s.a();
   }

   public void a(dal<?> $$0) {
      this.r = $$0;
      this.s.a();
      this.a(this.s, $$0);
   }

   protected abstract void a(fum var1, dal<?> var2);

   protected void h() {
      if (this.g.L() != null) {
         csz $$0 = this.f.ao_();
         boolean $$1 = this.y.a().a($$0);
         boolean $$2 = this.y.a().b($$0);
         this.g.L().b(new aic($$0, $$1, $$2));
      }
   }

   @Override
   public fov.a u() {
      return this.F ? fov.a.b : fov.a.a;
   }

   @Override
   public void b(fox $$0) {
      List<fov> $$1 = Lists.newArrayList();
      this.z.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.w);
      $$1.add(this.e);
      $$1.addAll(this.u);
      fqs.b $$2 = fqs.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
