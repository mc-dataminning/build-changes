import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gah extends gad {
   private static final xa b = xa.c("gui.stats");
   static final ali c = ali.b("container/slot");
   static final ali d = ali.b("statistics/header");
   static final ali s = ali.b("statistics/sort_up");
   static final ali u = ali.b("statistics/sort_down");
   private static final xa v = xa.c("multiplayer.downloadingStats");
   static final xa w = xa.c("stats.none");
   private static final xa x = xa.c("stat.generalButton");
   private static final xa y = xa.c("stat.itemsButton");
   private static final xa z = xa.c("stat.mobsButton");
   protected final gad a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fxz D = new fxz(this, 33, 58);
   @Nullable
   private gah.a E;
   @Nullable
   gah.b F;
   @Nullable
   private gah.c G;
   final axa H;
   @Nullable
   private fvh<?> I;
   private boolean J = true;

   public gah(gad $$0, axa $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aS_() {
      this.D.c(new fva(this.p, v));
      this.m.L().b(new ahc(ahc.a.b));
   }

   public void m() {
      this.E = new gah.a(this.m);
      this.F = new gah.b(this.m);
      this.G = new gah.c(this.m);
   }

   public void E() {
      fxz $$0 = new fxz(this, 33, 58);
      $$0.a(b, this.p);
      fyd $$1 = $$0.b(fyd.d()).a(5);
      $$1.c().b();
      fyd $$2 = $$1.a(fyd.e()).a(5);
      $$2.a(ful.a(x, $$0x -> this.a(this.E)).a(120).a());
      ful $$3 = $$2.a(ful.a(y, $$0x -> this.a(this.F)).a(120).a());
      ful $$4 = $$2.a(ful.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(ful.a(wz.d, $$0x -> this.aP_()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fuj var10000 = this.c($$1x);
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
   public void aP_() {
      this.m.a(this.a);
   }

   public void F() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.E();
         this.aG_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fvh<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(aww<ali> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fvh<gah.a.a> {
      public a(final frd $$0) {
         super($$0, gah.this.n, gah.this.o - 33 - 58, 33, 14);
         ObjectArrayList<aww<ali>> $$1 = new ObjectArrayList(awz.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hmi.a(gah.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aww<ali> $$2 = (aww<ali>)var4.next();
            this.b(new gah.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fvh.a<gah.a.a> {
         private final aww<ali> b;
         private final xa c;

         a(final aww<ali> $$0) {
            this.b = $$0;
            this.c = xa.c(gah.a($$0));
         }

         private String b() {
            return this.b.a(gah.this.H.a(this.b));
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(gah.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(gah.this.p, $$12, $$3 + $$4 - gah.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", xa.i().b(this.c).b(wz.v).f(this.b()));
         }
      }
   }

   class b extends fvh<gah.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ali[] z = new ali[]{
         ali.b("statistics/block_mined"),
         ali.b("statistics/item_broken"),
         ali.b("statistics/item_crafted"),
         ali.b("statistics/item_used"),
         ali.b("statistics/item_picked_up"),
         ali.b("statistics/item_dropped")
      };
      protected final List<awy<dnc>> a;
      protected final List<awy<czu>> m;
      protected final Comparator<gah.b.a> n = new gah.b.b();
      @Nullable
      protected awy<?> o;
      protected int p = -1;
      protected int q;

      public b(final frd $$0) {
         super($$0, gah.this.n, gah.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awz.a);
         this.m = Lists.newArrayList(new awy[]{awz.d, awz.b, awz.c, awz.e, awz.f});
         Set<czu> $$1 = Sets.newIdentityHashSet();

         for (czu $$2 : mg.g) {
            boolean $$3 = false;

            for (awy<czu> $$4 : this.m) {
               if ($$4.a($$2) && gah.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dnc $$5 : mg.e) {
            boolean $$6 = false;

            for (awy<dnc> $$7 : this.a) {
               if ($$7.a($$5) && gah.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(dac.a);

         for (czu $$8 : $$1) {
            this.b(new gah.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(ftx $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ali $$4 = this.p == $$3 ? gah.c : gah.d;
            $$0.a(gsl::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            ali $$6 = this.q == 1 ? gah.s : gah.u;
            $$0.a(gsl::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gsl::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hos.a(awp.Bv, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private awy<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awy<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ftx $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            gah.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               czu $$5 = $$3.b();
               $$0.a(gah.this.p, $$5.l(), $$1, $$2, $$5.f().a(kk.G));
            } else {
               xa $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(gah.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awy<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aI_().sort(this.n);
      }

      class a extends fvh.a<gah.b.a> {
         private final czu b;

         a(final czu $$0) {
            this.b = $$0;
         }

         public czu b() {
            return this.b;
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gsl::H, gah.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (gah.this.F != null) {
               for (int $$10 = 0; $$10 < gah.this.F.a.size(); $$10++) {
                  aww<dnc> $$12;
                  if (this.b instanceof cyg $$11) {
                     $$12 = gah.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < gah.this.F.m.size(); $$14++) {
                  this.a($$0, gah.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + gah.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(ftx $$0, @Nullable aww<?> $$1, int $$2, int $$3, boolean $$4) {
            xa $$5 = (xa)($$1 == null ? gah.w : xa.b($$1.a(gah.this.H.a($$1))));
            $$0.b(gah.this.p, $$5, $$2 - gah.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<gah.b.a> {
         public int a(gah.b.a $$0, gah.b.a $$1) {
            czu $$2 = $$0.b();
            czu $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awy<dnc> $$6 = (awy<dnc>)b.this.o;
               $$4 = $$2 instanceof cyg ? gah.this.H.a($$6, ((cyg)$$2).c()) : -1;
               $$5 = $$3 instanceof cyg ? gah.this.H.a($$6, ((cyg)$$3).c()) : -1;
            } else {
               awy<czu> $$9 = (awy<czu>)b.this.o;
               $$4 = gah.this.H.a($$9, $$2);
               $$5 = gah.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(czu.a($$2), czu.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fvh<gah.c.a> {
      public c(final frd $$0) {
         super($$0, gah.this.n, gah.this.o - 33 - 58, 33, 9 * 4);

         for (bxc<?> $$1 : mg.f) {
            if (gah.this.H.a(awz.g.b($$1)) > 0 || gah.this.H.a(awz.h.b($$1)) > 0) {
               this.b(new gah.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fvh.a<gah.c.a> {
         private final xa b;
         private final xa c;
         private final xa d;
         private final boolean e;
         private final boolean f;

         public a(final bxc<?> $$0) {
            this.b = $$0.h();
            int $$1 = gah.this.H.a(awz.g.b($$0));
            if ($$1 == 0) {
               this.c = xa.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xa.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = gah.this.H.a(awz.h.b($$0));
            if ($$2 == 0) {
               this.d = xa.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xa.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(gah.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(gah.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(gah.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", wz.a(this.c, this.d));
         }
      }
   }
}
