import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fzu extends fzq {
   private static final xg b = xg.c("gui.stats");
   static final alr c = alr.b("container/slot");
   static final alr d = alr.b("statistics/header");
   static final alr s = alr.b("statistics/sort_up");
   static final alr u = alr.b("statistics/sort_down");
   private static final xg v = xg.c("multiplayer.downloadingStats");
   static final xg w = xg.c("stats.none");
   private static final xg x = xg.c("stat.generalButton");
   private static final xg y = xg.c("stat.itemsButton");
   private static final xg z = xg.c("stat.mobsButton");
   protected final fzq a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fxm D = new fxm(this, 33, 58);
   @Nullable
   private fzu.a E;
   @Nullable
   fzu.b F;
   @Nullable
   private fzu.c G;
   final axj H;
   @Nullable
   private fuu<?> I;
   private boolean J = true;

   public fzu(fzq $$0, axj $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aO_() {
      this.D.c(new fun(this.p, v));
      this.m.L().b(new ahl(ahl.a.b));
   }

   public void m() {
      this.E = new fzu.a(this.m);
      this.F = new fzu.b(this.m);
      this.G = new fzu.c(this.m);
   }

   public void E() {
      fxm $$0 = new fxm(this, 33, 58);
      $$0.a(b, this.p);
      fxq $$1 = $$0.b(fxq.d()).a(5);
      $$1.c().b();
      fxq $$2 = $$1.a(fxq.e()).a(5);
      $$2.a(fty.a(x, $$0x -> this.a(this.E)).a(120).a());
      fty $$3 = $$2.a(fty.a(y, $$0x -> this.a(this.F)).a(120).a());
      fty $$4 = $$2.a(fty.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fty.a(xf.d, $$0x -> this.aL_()).a(200).a());
      if (this.F != null && this.F.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      if (this.I != null) {
         this.I.a(this.n, this.D);
      }
   }

   @Override
   public void aL_() {
      this.m.a(this.a);
   }

   public void F() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.E();
         this.aC_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fuu<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(axf<alr> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fuu<fzu.a.a> {
      public a(final fqq $$0) {
         super($$0, fzu.this.n, fzu.this.o - 33 - 58, 33, 14);
         ObjectArrayList<axf<alr>> $$1 = new ObjectArrayList(axi.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hly.a(fzu.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            axf<alr> $$2 = (axf<alr>)var4.next();
            this.b(new fzu.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fuu.a<fzu.a.a> {
         private final axf<alr> b;
         private final xg c;

         a(final axf<alr> $$0) {
            this.b = $$0;
            this.c = xg.c(fzu.a($$0));
         }

         private String b() {
            return this.b.a(fzu.this.H.a(this.b));
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fzu.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fzu.this.p, $$12, $$3 + $$4 - fzu.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", xg.i().b(this.c).b(xf.v).f(this.b()));
         }
      }
   }

   class b extends fuu<fzu.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alr[] z = new alr[]{
         alr.b("statistics/block_mined"),
         alr.b("statistics/item_broken"),
         alr.b("statistics/item_crafted"),
         alr.b("statistics/item_used"),
         alr.b("statistics/item_picked_up"),
         alr.b("statistics/item_dropped")
      };
      protected final List<axh<dno>> a;
      protected final List<axh<dag>> m;
      protected final Comparator<fzu.b.a> n = new fzu.b.b();
      @Nullable
      protected axh<?> o;
      protected int p = -1;
      protected int q;

      public b(final fqq $$0) {
         super($$0, fzu.this.n, fzu.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(axi.a);
         this.m = Lists.newArrayList(new axh[]{axi.d, axi.b, axi.c, axi.e, axi.f});
         Set<dag> $$1 = Sets.newIdentityHashSet();

         for (dag $$2 : mh.g) {
            boolean $$3 = false;

            for (axh<dag> $$4 : this.m) {
               if ($$4.a($$2) && fzu.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dno $$5 : mh.e) {
            boolean $$6 = false;

            for (axh<dno> $$7 : this.a) {
               if ($$7.a($$5) && fzu.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(dao.a);

         for (dag $$8 : $$1) {
            this.b(new fzu.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(ftk $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alr $$4 = this.p == $$3 ? fzu.c : fzu.d;
            $$0.a(gry::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            alr $$6 = this.q == 1 ? fzu.s : fzu.u;
            $$0.a(gry::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gry::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         boolean $$3 = super.a($$0, $$1, $$2);
         return !$$3
               && this.a((int)($$0 - ((double)this.F() + (double)this.g / 2.0 - (double)this.a() / 2.0)), (int)($$1 - (double)this.G()) + (int)this.g() - 4)
            ? true
            : $$3;
      }

      protected boolean a(int $$0, int $$1) {
         this.p = -1;

         for (int $$2 = 0; $$2 < this.z.length; $$2++) {
            int $$3 = $$0 - this.m($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.n(this.p));
            this.c.ak().a(hoi.a(awy.Bv, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private axh<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(axh<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ftk $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fzu.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               dag $$5 = $$3.b();
               $$0.a(fzu.this.p, $$5.l(), $$1, $$2, $$5.f().a(kl.G));
            } else {
               xg $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fzu.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(axh<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aE_().sort(this.n);
      }

      class a extends fuu.a<fzu.b.a> {
         private final dag b;

         a(final dag $$0) {
            this.b = $$0;
         }

         public dag b() {
            return this.b;
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gry::H, fzu.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (fzu.this.F != null) {
               for (int $$10 = 0; $$10 < fzu.this.F.a.size(); $$10++) {
                  axf<dno> $$12;
                  if (this.b instanceof cys $$11) {
                     $$12 = fzu.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fzu.this.F.m.size(); $$14++) {
                  this.a($$0, fzu.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fzu.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(ftk $$0, @Nullable axf<?> $$1, int $$2, int $$3, boolean $$4) {
            xg $$5 = (xg)($$1 == null ? fzu.w : xg.b($$1.a(fzu.this.H.a($$1))));
            $$0.b(fzu.this.p, $$5, $$2 - fzu.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<fzu.b.a> {
         public int a(fzu.b.a $$0, fzu.b.a $$1) {
            dag $$2 = $$0.b();
            dag $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               axh<dno> $$6 = (axh<dno>)b.this.o;
               $$4 = $$2 instanceof cys ? fzu.this.H.a($$6, ((cys)$$2).c()) : -1;
               $$5 = $$3 instanceof cys ? fzu.this.H.a($$6, ((cys)$$3).c()) : -1;
            } else {
               axh<dag> $$9 = (axh<dag>)b.this.o;
               $$4 = fzu.this.H.a($$9, $$2);
               $$5 = fzu.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(dag.a($$2), dag.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fuu<fzu.c.a> {
      public c(final fqq $$0) {
         super($$0, fzu.this.n, fzu.this.o - 33 - 58, 33, 9 * 4);

         for (bxn<?> $$1 : mh.f) {
            if (fzu.this.H.a(axi.g.b($$1)) > 0 || fzu.this.H.a(axi.h.b($$1)) > 0) {
               this.b(new fzu.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fuu.a<fzu.c.a> {
         private final xg b;
         private final xg c;
         private final xg d;
         private final boolean e;
         private final boolean f;

         public a(final bxn<?> $$0) {
            this.b = $$0.h();
            int $$1 = fzu.this.H.a(axi.g.b($$0));
            if ($$1 == 0) {
               this.c = xg.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xg.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fzu.this.H.a(axi.h.b($$0));
            if ($$2 == 0) {
               this.d = xg.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xg.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fzu.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fzu.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fzu.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", xf.a(this.c, this.d));
         }
      }
   }
}
