import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class fvl<T extends cth> implements fmz, fnt, fps, fvq {
   public static final fnj a = new fnj(all.b("recipe_book/button"), all.b("recipe_book/button_highlighted"));
   protected static final all b = all.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xl j = xl.c("gui.recipebook.search_hint").a(n.u).a(n.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final xl m = xl.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private dav<?> s;
   private final fvj u;
   private final List<fvn> v = Lists.newArrayList();
   @Nullable
   private fvn w;
   protected fnc e;
   protected final T f;
   protected fjx g;
   @Nullable
   private fmf x;
   private String y = "";
   private fji z;
   private final fvm A;
   @Nullable
   private dav<?> B;
   @Nullable
   private fvp C;
   private final cow D = new cow();
   private int E;
   private boolean F;
   private boolean G;
   private boolean H;
   @Nullable
   private fqe I;

   public fvl(T $$0) {
      this.f = $$0;
      fvs $$1 = () -> azn.d(this.r / 30.0F);
      this.u = new fvj($$1);
      this.A = new fvm($$1, $$0 instanceof cru);
   }

   public void a(int $$0, int $$1, fjx $$2, boolean $$3) {
      this.g = $$2;
      this.p = $$0;
      this.q = $$1;
      this.H = $$3;
      this.z = $$2.t.j();
      this.E = $$2.t.gl().l();
      this.G = this.m();
      if (this.G) {
         this.i();
      }
   }

   private void i() {
      boolean $$0 = this.o();
      this.o = this.H ? 0 : 86;
      int $$1 = this.k();
      int $$2 = this.j();
      this.D.a();
      this.g.t.gl().a(this.D);
      this.f.a(this.D);
      String $$3 = this.x != null ? this.x.a() : "";
      this.x = new fmf(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xl.c("itemGroup.search"));
      this.x.f(50);
      this.x.g(true);
      this.x.g(16777215);
      this.x.a($$3);
      this.x.c(j);
      this.I = fqe.a(fqb.a, $$1 + 8, this.x.E(), this.x.D() - this.k(), this.x.w());
      this.A.a(this.g, $$1, $$2);
      this.A.a(this);
      this.e = new fnc($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.l();
      this.a();
      this.v.clear();

      for (fke $$4 : fke.a(this.f.ao_())) {
         this.v.add(new fvn($$4));
      }

      if (this.w != null) {
         this.w = this.v.stream().filter($$0x -> $$0x.b().equals(this.w.b())).findFirst().orElse(null);
      }

      if (this.w == null) {
         this.w = this.v.get(0);
      }

      this.w.b(true);
      this.a(false, $$0);
      this.c($$0);
   }

   private int j() {
      return (this.q - 166) / 2;
   }

   private int k() {
      return (this.p - 147) / 2 - this.o;
   }

   private void l() {
      this.e.a(this.e.a() ? fnh.a(this.b()) : fnh.a(m));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.d() && !this.H) {
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
      return this.G;
   }

   private boolean m() {
      return this.z.a(this.f.ao_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.i();
      }

      this.G = $$0;
      this.z.a(this.f.ao_(), $$0);
      if (!$$0) {
         this.A.c();
      }

      this.h();
   }

   protected abstract boolean a(ctp var1);

   public void b(@Nullable ctp $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s();
         if (this.d()) {
            this.n();
         }
      }
   }

   protected abstract void a(fvp var1, cow var2, awr var3);

   private void a(boolean $$0, boolean $$1) {
      List<fvp> $$2 = this.z.a(this.w.b());
      $$2.forEach($$0x -> this.a($$0x, this.D, this.z));
      List<fvp> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      $$3.removeIf($$0x -> !$$0x.d());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         gcz $$5 = this.g.L();
         if ($$5 != null) {
            ObjectSet<fvp> $$6 = new ObjectLinkedOpenHashSet($$5.D().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf($$1x -> !$$6.contains($$1x));
         }
      }

      if ($$1) {
         $$3.removeIf($$0x -> !$$0x.c());
      }

      this.A.a($$3, $$0, $$1);
   }

   private void c(boolean $$0) {
      int $$1 = (this.p - 147) / 2 - this.o - 30;
      int $$2 = (this.q - 166) / 2 + 3;
      int $$3 = 27;
      int $$4 = 0;

      for (fvn $$5 : this.v) {
         fke $$6 = $$5.b();
         if ($$6 == fke.a || $$6 == fke.f) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.z)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.z, $$0);
         }
      }
   }

   public void e() {
      boolean $$0 = this.m();
      if (this.d() != $$0) {
         this.b($$0);
      }

      if (this.d()) {
         if (this.E != this.g.t.gl().l()) {
            this.n();
            this.E = this.g.t.gl().l();
         }
      }
   }

   private void n() {
      this.D.a();
      this.g.t.gl().a(this.D);
      this.f.a(this.D);
      this.a(false, this.o());
   }

   private boolean o() {
      return this.z.b(this.f.ao_());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      if (this.d()) {
         if (!frp.s()) {
            this.r += $$3;
         }

         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 100.0F);
         int $$4 = this.k();
         int $$5 = this.j();
         $$0.a(gjh::B, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (fvn $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.A.a($$0, $$4, $$5, $$1, $$2, $$3);
         $$0.c().b();
      }
   }

   public void a(flj $$0, int $$1, int $$2, @Nullable ctp $$3) {
      if (this.d()) {
         this.A.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xl b();

   public void a(flj $$0, int $$1, int $$2, boolean $$3) {
      this.u.a($$0, this.g, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.d() && !this.g.t.R_()) {
         if (this.A.a($$0, $$1, $$2, this.k(), this.j(), 147, 166)) {
            dav<?> $$3 = this.A.a();
            fvp $$4 = this.A.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.C = $$4;
               this.B = $$3;
               if (!this.r()) {
                  this.b(false);
               }
            }

            return true;
         } else {
            if (this.x != null) {
               boolean $$5 = this.I != null && this.I.a(azn.a($$0), azn.a($$1));
               if ($$5 || this.x.a($$0, $$1, $$2)) {
                  this.x.a(true);
                  return true;
               }

               this.x.a(false);
            }

            if (this.e.a($$0, $$1, $$2)) {
               boolean $$6 = this.p();
               this.e.b($$6);
               this.l();
               this.h();
               this.a(false, $$6);
               return true;
            } else {
               for (fvn $$7 : this.v) {
                  if ($$7.a($$0, $$1, $$2)) {
                     if (this.w != $$7) {
                        if (this.w != null) {
                           this.w.b(false);
                        }

                        this.w = $$7;
                        this.w.b(true);
                        this.a(true, this.o());
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

   private boolean a(fvp $$0, dav<?> $$1) {
      if (!$$0.a($$1) && this.s == $$1) {
         return false;
      } else {
         this.s();
         this.g.r.a(this.g.t.cd.l, $$1, frp.t());
         return true;
      }
   }

   private boolean p() {
      cti $$0 = this.f.ao_();
      boolean $$1 = !this.z.b($$0);
      this.z.b($$0, $$1);
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
      this.F = false;
      if (!this.d() || this.g.t.R_()) {
         return false;
      } else if ($$0 == 256 && !this.r()) {
         this.b(false);
         return true;
      } else if (this.x.a($$0, $$1, $$2)) {
         this.q();
         return true;
      } else if (this.x.aM_() && this.x.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.x.aM_()) {
         this.F = true;
         this.x.a(true);
         return true;
      } else if (fpz.a($$0) && this.C != null && this.B != null) {
         flu.b(fjx.Q().ak());
         return this.a(this.C, this.B);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.F = false;
      return fnt.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.F) {
         return false;
      } else if (!this.d() || this.g.t.R_()) {
         return false;
      } else if (this.x.a($$0, $$1)) {
         this.q();
         return true;
      } else {
         return fnt.super.a($$0, $$1);
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
   public boolean aM_() {
      return false;
   }

   private void q() {
      String $$0 = this.x.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.y)) {
         this.a(false, this.o());
         this.y = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         hac $$1 = this.g.ah();
         String $$2 = "en_pt";
         hab $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ab = "en_pt";
         this.g.l();
         this.g.n.ay();
      }
   }

   private boolean r() {
      return this.o == 86;
   }

   public void f() {
      this.c(this.o());
      if (this.d()) {
         this.a(false, this.o());
      }
   }

   @Override
   public void a(List<dav<?>> $$0) {
      for (dav<?> $$1 : $$0) {
         this.g.t.a($$1);
      }
   }

   private void s() {
      this.s = null;
      this.u.a();
   }

   public void a(dav<?> $$0) {
      this.s = $$0;
      this.u.a();
      this.a(this.u, $$0);
   }

   protected abstract void a(fvj var1, dav<?> var2);

   protected void h() {
      if (this.g.L() != null) {
         cti $$0 = this.f.ao_();
         boolean $$1 = this.z.a().a($$0);
         boolean $$2 = this.z.a().b($$0);
         this.g.L().b(new aig($$0, $$1, $$2));
      }
   }

   @Override
   public fps.a u() {
      return this.G ? fps.a.b : fps.a.a;
   }

   @Override
   public void b(fpu $$0) {
      List<fps> $$1 = Lists.newArrayList();
      this.A.a($$1x -> {
         if ($$1x.C()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      frp.b $$2 = frp.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }
}
