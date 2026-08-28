import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class gdp<T extends cxq> implements fvb, fvv, fxt {
   public static final fvl a = new fvl(alr.b("recipe_book/button"), alr.b("recipe_book/button_highlighted"));
   protected static final alr b = alr.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xg j = xg.c("gui.recipebook.search_hint").a(o.u).a(o.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final xg m = xg.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private dgj s;
   private final gdn u;
   private final List<gdr> v = Lists.newArrayList();
   @Nullable
   private gdr w;
   protected fve e;
   protected final T f;
   protected fqq g;
   @Nullable
   private fuh x;
   private String y = "";
   private final List<gdp.a> z;
   private fqb A;
   private final gdq B;
   @Nullable
   private dgj C;
   @Nullable
   private gdt D;
   private final cso E = new cso();
   private int F;
   private boolean G;
   private boolean H;
   private boolean I;
   @Nullable
   private fyf J;

   public gdp(T $$0, List<gdp.a> $$1) {
      this.f = $$0;
      this.z = $$1;
      gdw $$2 = () -> azz.d(this.r / 30.0F);
      this.u = new gdn($$2);
      this.B = new gdq(this, $$2, $$0 instanceof cwd);
   }

   public void a(int $$0, int $$1, fqq $$2, boolean $$3) {
      this.g = $$2;
      this.p = $$0;
      this.q = $$1;
      this.I = $$3;
      this.A = $$2.t.m();
      this.F = $$2.t.gj().n();
      this.H = this.n();
      if (this.H) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.q();
      this.o = this.I ? 0 : 86;
      int $$1 = this.l();
      int $$2 = this.k();
      this.E.a();
      this.g.t.gj().a(this.E);
      this.f.a(this.E);
      String $$3 = this.x != null ? this.x.a() : "";
      this.x = new fuh(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xg.c("itemGroup.search"));
      this.x.f(50);
      this.x.g(true);
      this.x.m(16777215);
      this.x.a($$3);
      this.x.c(j);
      this.J = fyf.a(fyc.a, $$1 + 8, this.x.G(), this.x.F() - this.l(), this.x.y());
      this.B.a(this.g, $$1, $$2);
      this.e = new fve($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.m();
      this.a();
      this.v.clear();

      for (gdp.a $$4 : this.z) {
         this.v.add(new gdr($$4));
      }

      if (this.w != null) {
         this.w = this.v.stream().filter($$0x -> $$0x.b().equals(this.w.b())).findFirst().orElse(null);
      }

      if (this.w == null) {
         this.w = this.v.get(0);
      }

      this.w.b(true);
      this.o();
      this.c($$0);
      this.a(false, $$0);
   }

   private int k() {
      return (this.q - 166) / 2;
   }

   private int l() {
      return (this.p - 147) / 2 - this.o;
   }

   private void m() {
      this.e.a(this.e.a() ? fvj.a(this.b()) : fvj.a(m));
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

   private boolean n() {
      return this.A.a(this.f.ao_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.H = $$0;
      this.A.a(this.f.ao_(), $$0);
      if (!$$0) {
         this.B.c();
      }

      this.h();
   }

   protected abstract boolean a(cxz var1);

   public void b(@Nullable cxz $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s = null;
         this.u.a();
         if (this.d()) {
            this.p();
         }
      }
   }

   private void o() {
      for (gdp.a $$0 : this.z) {
         for (gdt $$1 : this.A.a($$0.c())) {
            this.a($$1, this.E);
         }
      }
   }

   protected abstract void a(gdt var1, cso var2);

   private void a(boolean $$0, boolean $$1) {
      List<gdt> $$2 = this.A.a(this.w.b());
      List<gdt> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         glp $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<gdt> $$6 = new ObjectLinkedOpenHashSet($$5.C().b().search($$4.toLowerCase(Locale.ROOT)));
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

      for (gdr $$5 : this.v) {
         det $$6 = $$5.b();
         if ($$6 instanceof gdv) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.A)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.A, $$0);
         }
      }
   }

   public void e() {
      boolean $$0 = this.n();
      if (this.d() != $$0) {
         this.b($$0);
      }

      if (this.d()) {
         if (this.F != this.g.t.gj().n()) {
            this.p();
            this.F = this.g.t.gj().n();
         }
      }
   }

   private void p() {
      this.E.a();
      this.g.t.gj().a(this.E);
      this.f.a(this.E);
      this.o();
      this.a(false, this.q());
   }

   private boolean q() {
      return this.A.b(this.f.ao_());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fzq.s()) {
            this.r += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = this.l();
         int $$5 = this.k();
         $$0.a(gry::H, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (gdr $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(ftk $$0, int $$1, int $$2, @Nullable cxz $$3) {
      if (this.d()) {
         this.B.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xg b();

   public void a(ftk $$0, boolean $$1) {
      this.u.a($$0, this.g, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.aa_()) {
         if (this.B.a($$0, $$1, $$2, this.l(), this.k(), 147, 166)) {
            dgj $$3 = this.B.a();
            gdt $$4 = this.B.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.D = $$4;
               this.C = $$3;
               if (!this.t()) {
                  this.b(false);
               }
            }

            return true;
         } else {
            if (this.x != null) {
               boolean $$5 = this.J != null && this.J.a(azz.a($$0), azz.a($$1));
               if ($$5 || this.x.a($$0, $$1, $$2)) {
                  this.x.a(true);
                  return true;
               }

               this.x.a(false);
            }

            if (this.e.a($$0, $$1, $$2)) {
               boolean $$6 = this.r();
               this.e.b($$6);
               this.m();
               this.h();
               this.a(false, $$6);
               return true;
            } else {
               for (gdr $$7 : this.v) {
                  if ($$7.a($$0, $$1, $$2)) {
                     if (this.w != $$7) {
                        if (this.w != null) {
                           this.w.b(false);
                        }

                        this.w = $$7;
                        this.w.b(true);
                        this.a(true, this.q());
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

   private boolean a(gdt $$0, dgj $$1) {
      if (!$$0.a($$1) && $$1.equals(this.s)) {
         return false;
      } else {
         this.s = $$1;
         this.u.a();
         this.g.r.a(this.g.t.bR.l, $$1, fzq.t());
         return true;
      }
   }

   private boolean r() {
      cxr $$0 = this.f.ao_();
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
         return $$7 && !$$8 && !this.w.D();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.G = false;
      if (!this.d() || this.g.t.aa_()) {
         return false;
      } else if ($$0 == 256 && !this.t()) {
         this.b(false);
         return true;
      } else if (this.x.a($$0, $$1, $$2)) {
         this.s();
         return true;
      } else if (this.x.aO_() && this.x.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.x.aO_()) {
         this.G = true;
         this.x.a(true);
         return true;
      } else if (fya.a($$0) && this.D != null && this.C != null) {
         ftw.b(fqq.Q().ak());
         return this.a(this.D, this.C);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.G = false;
      return fvv.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.G) {
         return false;
      } else if (!this.d() || this.g.t.aa_()) {
         return false;
      } else if (this.x.a($$0, $$1)) {
         this.s();
         return true;
      } else {
         return fvv.super.a($$0, $$1);
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aO_() {
      return false;
   }

   private void s() {
      String $$0 = this.x.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.y)) {
         this.a(false, this.q());
         this.y = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         hma $$1 = this.g.ah();
         String $$2 = "en_pt";
         hlz $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ab = "en_pt";
         this.g.l();
         this.g.n.az();
      }
   }

   private boolean t() {
      return this.o == 86;
   }

   public void g() {
      this.o();
      this.c(this.q());
      if (this.d()) {
         this.a(false, this.q());
      }
   }

   public void a(dgj $$0) {
      this.g.t.a($$0);
   }

   public void a(dgh $$0) {
      this.u.a();
      bbm $$1 = dgo.a(Objects.requireNonNull(this.g.s));
      this.a(this.u, $$0, $$1);
   }

   protected abstract void a(gdn var1, dgh var2, bbm var3);

   protected void h() {
      if (this.g.L() != null) {
         cxr $$0 = this.f.ao_();
         boolean $$1 = this.A.a().a($$0);
         boolean $$2 = this.A.a().b($$0);
         this.g.L().b(new aik($$0, $$1, $$2));
      }
   }

   @Override
   public fxt.a w() {
      return this.H ? fxt.a.b : fxt.a.a;
   }

   @Override
   public void b(fxv $$0) {
      List<fxt> $$1 = Lists.newArrayList();
      this.B.a($$1x -> {
         if ($$1x.E()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      fzq.b $$2 = fzq.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }

   public static record a(dak a, Optional<dak> b, det c) {
      public a(gdv $$0) {
         this(new dak(dao.rK), Optional.empty(), $$0);
      }

      public a(dag $$0, dfe $$1) {
         this(new dak($$0), Optional.empty(), $$1);
      }

      public a(dag $$0, dag $$1, dfe $$2) {
         this(new dak($$0), Optional.of(new dak($$1)), $$2);
      }
   }
}
