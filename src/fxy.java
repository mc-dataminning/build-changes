import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fxy extends fxu {
   private static final wy b = wy.c("gui.stats");
   static final alg c = alg.b("container/slot");
   static final alg d = alg.b("statistics/header");
   static final alg s = alg.b("statistics/sort_up");
   static final alg u = alg.b("statistics/sort_down");
   private static final wy v = wy.c("multiplayer.downloadingStats");
   static final wy w = wy.c("stats.none");
   private static final wy x = wy.c("stat.generalButton");
   private static final wy y = wy.c("stat.itemsButton");
   private static final wy z = wy.c("stat.mobsButton");
   protected final fxu a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fvq D = new fvq(this, 33, 58);
   @Nullable
   private fxy.a E;
   @Nullable
   fxy.b F;
   @Nullable
   private fxy.c G;
   final awy H;
   @Nullable
   private fsy<?> I;
   private boolean J = true;

   public fxy(fxu $$0, awy $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aN_() {
      this.D.c(new fsr(this.p, v));
      this.m.L().b(new aha(aha.a.b));
   }

   public void m() {
      this.E = new fxy.a(this.m);
      this.F = new fxy.b(this.m);
      this.G = new fxy.c(this.m);
   }

   public void E() {
      fvq $$0 = new fvq(this, 33, 58);
      $$0.a(b, this.p);
      fvu $$1 = $$0.b(fvu.d()).a(5);
      $$1.c().b();
      fvu $$2 = $$1.a(fvu.e()).a(5);
      $$2.a(fsc.a(x, $$0x -> this.a(this.E)).a(120).a());
      fsc $$3 = $$2.a(fsc.a(y, $$0x -> this.a(this.F)).a(120).a());
      fsc $$4 = $$2.a(fsc.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fsc.a(wx.d, $$0x -> this.aK_()).a(200).a());
      if (this.F != null && this.F.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fsa var10000 = this.c($$1x);
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
   public void aK_() {
      this.m.a(this.a);
   }

   public void F() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.E();
         this.aB_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fsy<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awu<alg> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fsy<fxy.a.a> {
      public a(final fos $$0) {
         super($$0, fxy.this.n, fxy.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awu<alg>> $$1 = new ObjectArrayList(awx.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hjw.a(fxy.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awu<alg> $$2 = (awu<alg>)var4.next();
            this.b(new fxy.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fsy.a<fxy.a.a> {
         private final awu<alg> b;
         private final wy c;

         a(final awu<alg> $$0) {
            this.b = $$0;
            this.c = wy.c(fxy.a($$0));
         }

         private String b() {
            return this.b.a(fxy.this.H.a(this.b));
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fxy.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fxy.this.p, $$12, $$3 + $$4 - fxy.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wy.i().b(this.c).b(wx.v).f(this.b()));
         }
      }
   }

   class b extends fsy<fxy.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alg[] z = new alg[]{
         alg.b("statistics/block_mined"),
         alg.b("statistics/item_broken"),
         alg.b("statistics/item_crafted"),
         alg.b("statistics/item_used"),
         alg.b("statistics/item_picked_up"),
         alg.b("statistics/item_dropped")
      };
      protected final List<aww<dma>> a;
      protected final List<aww<cyu>> m;
      protected final Comparator<fxy.b.a> n = new fxy.b.b();
      @Nullable
      protected aww<?> o;
      protected int p = -1;
      protected int q;

      public b(final fos $$0) {
         super($$0, fxy.this.n, fxy.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awx.a);
         this.m = Lists.newArrayList(new aww[]{awx.d, awx.b, awx.c, awx.e, awx.f});
         Set<cyu> $$1 = Sets.newIdentityHashSet();

         for (cyu $$2 : mf.g) {
            boolean $$3 = false;

            for (aww<cyu> $$4 : this.m) {
               if ($$4.a($$2) && fxy.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dma $$5 : mf.e) {
            boolean $$6 = false;

            for (aww<dma> $$7 : this.a) {
               if ($$7.a($$5) && fxy.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(czc.a);

         for (cyu $$8 : $$1) {
            this.b(new fxy.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fro $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alg $$4 = this.p == $$3 ? fxy.c : fxy.d;
            $$0.a(gqc::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            alg $$6 = this.q == 1 ? fxy.s : fxy.u;
            $$0.a(gqc::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gqc::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hmh.a(awn.Bs, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private aww<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(aww<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fro $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fxy.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cyu $$5 = $$3.b();
               $$0.a(fxy.this.p, $$5.l(), $$1, $$2, $$5.f().a(kj.G));
            } else {
               wy $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fxy.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(aww<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aD_().sort(this.n);
      }

      class a extends fsy.a<fxy.b.a> {
         private final cyu b;

         a(final cyu $$0) {
            this.b = $$0;
         }

         public cyu b() {
            return this.b;
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gqc::H, fxy.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (fxy.this.F != null) {
               for (int $$10 = 0; $$10 < fxy.this.F.a.size(); $$10++) {
                  awu<dma> $$12;
                  if (this.b instanceof cxg $$11) {
                     $$12 = fxy.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fxy.this.F.m.size(); $$14++) {
                  this.a($$0, fxy.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fxy.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fro $$0, @Nullable awu<?> $$1, int $$2, int $$3, boolean $$4) {
            wy $$5 = (wy)($$1 == null ? fxy.w : wy.b($$1.a(fxy.this.H.a($$1))));
            $$0.b(fxy.this.p, $$5, $$2 - fxy.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<fxy.b.a> {
         public int a(fxy.b.a $$0, fxy.b.a $$1) {
            cyu $$2 = $$0.b();
            cyu $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               aww<dma> $$6 = (aww<dma>)b.this.o;
               $$4 = $$2 instanceof cxg ? fxy.this.H.a($$6, ((cxg)$$2).c()) : -1;
               $$5 = $$3 instanceof cxg ? fxy.this.H.a($$6, ((cxg)$$3).c()) : -1;
            } else {
               aww<cyu> $$9 = (aww<cyu>)b.this.o;
               $$4 = fxy.this.H.a($$9, $$2);
               $$5 = fxy.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cyu.a($$2), cyu.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fsy<fxy.c.a> {
      public c(final fos $$0) {
         super($$0, fxy.this.n, fxy.this.o - 33 - 58, 33, 9 * 4);

         for (bwm<?> $$1 : mf.f) {
            if (fxy.this.H.a(awx.g.b($$1)) > 0 || fxy.this.H.a(awx.h.b($$1)) > 0) {
               this.b(new fxy.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fsy.a<fxy.c.a> {
         private final wy b;
         private final wy c;
         private final wy d;
         private final boolean e;
         private final boolean f;

         public a(final bwm<?> $$0) {
            this.b = $$0.h();
            int $$1 = fxy.this.H.a(awx.g.b($$0));
            if ($$1 == 0) {
               this.c = wy.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wy.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fxy.this.H.a(awx.h.b($$0));
            if ($$2 == 0) {
               this.d = wy.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wy.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fxy.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fxy.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fxy.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wx.a(this.c, this.d));
         }
      }
   }
}
