import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class gcm<T extends cwr> implements fty, fus, fwq {
   public static final fui a = new fui(alg.b("recipe_book/button"), alg.b("recipe_book/button_highlighted"));
   protected static final alg b = alg.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final wy j = wy.c("gui.recipebook.search_hint").a(o.u).a(o.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final wy m = wy.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private dfj s;
   private final gck u;
   private final List<gco> v = Lists.newArrayList();
   @Nullable
   private gco w;
   protected fub e;
   protected final T f;
   protected fpo g;
   @Nullable
   private fte x;
   private String y = "";
   private final List<gcm.a> z;
   private foz A;
   private final gcn B;
   @Nullable
   private dfj C;
   @Nullable
   private gcq D;
   private final crp E = new crp();
   private int F;
   private boolean G;
   private boolean H;
   private boolean I;
   @Nullable
   private fxc J;

   public gcm(T $$0, List<gcm.a> $$1) {
      this.f = $$0;
      this.z = $$1;
      gct $$2 = () -> azm.d(this.r / 30.0F);
      this.u = new gck($$2);
      this.B = new gcn(this, $$2, $$0 instanceof cve);
   }

   public void a(int $$0, int $$1, fpo $$2, boolean $$3) {
      this.g = $$2;
      this.p = $$0;
      this.q = $$1;
      this.I = $$3;
      this.A = $$2.t.m();
      this.F = $$2.t.gi().n();
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
      this.g.t.gi().a(this.E);
      this.f.a(this.E);
      String $$3 = this.x != null ? this.x.a() : "";
      this.x = new fte(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, wy.c("itemGroup.search"));
      this.x.f(50);
      this.x.g(true);
      this.x.m(16777215);
      this.x.a($$3);
      this.x.c(j);
      this.J = fxc.a(fwz.a, $$1 + 8, this.x.G(), this.x.F() - this.l(), this.x.y());
      this.B.a(this.g, $$1, $$2);
      this.e = new fub($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.m();
      this.a();
      this.v.clear();

      for (gcm.a $$4 : this.z) {
         this.v.add(new gco($$4));
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
      this.e.a(this.e.a() ? fug.a(this.b()) : fug.a(m));
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
      return this.A.a(this.f.aj_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.H = $$0;
      this.A.a(this.f.aj_(), $$0);
      if (!$$0) {
         this.B.c();
      }

      this.h();
   }

   protected abstract boolean a(cwz var1);

   public void b(@Nullable cwz $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s = null;
         this.u.a();
         if (this.d()) {
            this.p();
         }
      }
   }

   private void o() {
      for (gcm.a $$0 : this.z) {
         for (gcq $$1 : this.A.a($$0.c())) {
            this.a($$1, this.E);
         }
      }
   }

   protected abstract void a(gcq var1, crp var2);

   private void a(boolean $$0, boolean $$1) {
      List<gcq> $$2 = this.A.a(this.w.b());
      List<gcq> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         gkm $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<gcq> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
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

      for (gco $$5 : this.v) {
         ddt $$6 = $$5.b();
         if ($$6 instanceof gcs) {
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
         if (this.F != this.g.t.gi().n()) {
            this.p();
            this.F = this.g.t.gi().n();
         }
      }
   }

   private void p() {
      this.E.a();
      this.g.t.gi().a(this.E);
      this.f.a(this.E);
      this.o();
      this.a(false, this.q());
   }

   private boolean q() {
      return this.A.b(this.f.aj_());
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!fyn.s()) {
            this.r += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = this.l();
         int $$5 = this.k();
         $$0.a(gqx::H, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (gco $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(fsh $$0, int $$1, int $$2, @Nullable cwz $$3) {
      if (this.d()) {
         this.B.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract wy b();

   public void a(fsh $$0, boolean $$1) {
      this.u.a($$0, this.g, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.V_()) {
         if (this.B.a($$0, $$1, $$2, this.l(), this.k(), 147, 166)) {
            dfj $$3 = this.B.a();
            gcq $$4 = this.B.b();
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
               boolean $$5 = this.J != null && this.J.a(azm.a($$0), azm.a($$1));
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
               for (gco $$7 : this.v) {
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

   private boolean a(gcq $$0, dfj $$1) {
      if (!$$0.a($$1) && $$1.equals(this.s)) {
         return false;
      } else {
         this.s = $$1;
         this.u.a();
         this.g.r.a(this.g.t.bR.l, $$1, fyn.t());
         return true;
      }
   }

   private boolean r() {
      cws $$0 = this.f.aj_();
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
      if (!this.d() || this.g.t.V_()) {
         return false;
      } else if ($$0 == 256 && !this.t()) {
         this.b(false);
         return true;
      } else if (this.x.a($$0, $$1, $$2)) {
         this.s();
         return true;
      } else if (this.x.aJ_() && this.x.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.x.aJ_()) {
         this.G = true;
         this.x.a(true);
         return true;
      } else if (fwx.a($$0) && this.D != null && this.C != null) {
         fst.b(fpo.Q().ak());
         return this.a(this.D, this.C);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.G = false;
      return fus.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.G) {
         return false;
      } else if (!this.d() || this.g.t.V_()) {
         return false;
      } else if (this.x.a($$0, $$1)) {
         this.s();
         return true;
      } else {
         return fus.super.a($$0, $$1);
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
   public boolean aJ_() {
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
         hkt $$1 = this.g.ah();
         String $$2 = "en_pt";
         hks $$3 = $$1.b("en_pt");
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

   public void a(dfj $$0) {
      this.g.t.a($$0);
   }

   public void a(dfh $$0) {
      this.u.a();
      baz $$1 = dfo.a(Objects.requireNonNull(this.g.s));
      this.a(this.u, $$0, $$1);
   }

   protected abstract void a(gck var1, dfh var2, baz var3);

   protected void h() {
      if (this.g.L() != null) {
         cws $$0 = this.f.aj_();
         boolean $$1 = this.A.a().a($$0);
         boolean $$2 = this.A.a().b($$0);
         this.g.L().b(new ahz($$0, $$1, $$2));
      }
   }

   @Override
   public fwq.a w() {
      return this.H ? fwq.a.b : fwq.a.a;
   }

   @Override
   public void b(fws $$0) {
      List<fwq> $$1 = Lists.newArrayList();
      this.B.a($$1x -> {
         if ($$1x.E()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      fyn.b $$2 = fyn.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }

   public static record a(czk a, Optional<czk> b, ddt c) {
      public a(gcs $$0) {
         this(new czk(czo.rK), Optional.empty(), $$0);
      }

      public a(czg $$0, dee $$1) {
         this(new czk($$0), Optional.empty(), $$1);
      }

      public a(czg $$0, czg $$1, dee $$2) {
         this(new czk($$0), Optional.of(new czk($$1)), $$2);
      }
   }
}
