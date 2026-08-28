import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fyw extends fys {
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
   protected final fys a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fwo D = new fwo(this, 33, 58);
   @Nullable
   private fyw.a E;
   @Nullable
   fyw.b F;
   @Nullable
   private fyw.c G;
   final awy H;
   @Nullable
   private ftw<?> I;
   private boolean J = true;

   public fyw(fys $$0, awy $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aO_() {
      this.D.c(new ftp(this.p, v));
      this.m.L().b(new aha(aha.a.b));
   }

   public void m() {
      this.E = new fyw.a(this.m);
      this.F = new fyw.b(this.m);
      this.G = new fyw.c(this.m);
   }

   public void E() {
      fwo $$0 = new fwo(this, 33, 58);
      $$0.a(b, this.p);
      fws $$1 = $$0.b(fws.d()).a(5);
      $$1.c().b();
      fws $$2 = $$1.a(fws.e()).a(5);
      $$2.a(fta.a(x, $$0x -> this.a(this.E)).a(120).a());
      fta $$3 = $$2.a(fta.a(y, $$0x -> this.a(this.F)).a(120).a());
      fta $$4 = $$2.a(fta.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fta.a(wx.d, $$0x -> this.aL_()).a(200).a());
      if (this.F != null && this.F.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fsy var10000 = this.c($$1x);
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

   public void a(@Nullable ftw<?> $$0) {
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

   class a extends ftw<fyw.a.a> {
      public a(final fpt $$0) {
         super($$0, fyw.this.n, fyw.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awu<alg>> $$1 = new ObjectArrayList(awx.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hky.a(fyw.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awu<alg> $$2 = (awu<alg>)var4.next();
            this.b(new fyw.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends ftw.a<fyw.a.a> {
         private final awu<alg> b;
         private final wy c;

         a(final awu<alg> $$0) {
            this.b = $$0;
            this.c = wy.c(fyw.a($$0));
         }

         private String b() {
            return this.b.a(fyw.this.H.a(this.b));
         }

         @Override
         public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fyw.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fyw.this.p, $$12, $$3 + $$4 - fyw.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wy.i().b(this.c).b(wx.v).f(this.b()));
         }
      }
   }

   class b extends ftw<fyw.b.a> {
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
      protected final List<aww<dmr>> a;
      protected final List<aww<czj>> m;
      protected final Comparator<fyw.b.a> n = new fyw.b.b();
      @Nullable
      protected aww<?> o;
      protected int p = -1;
      protected int q;

      public b(final fpt $$0) {
         super($$0, fyw.this.n, fyw.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awx.a);
         this.m = Lists.newArrayList(new aww[]{awx.d, awx.b, awx.c, awx.e, awx.f});
         Set<czj> $$1 = Sets.newIdentityHashSet();

         for (czj $$2 : mg.g) {
            boolean $$3 = false;

            for (aww<czj> $$4 : this.m) {
               if ($$4.a($$2) && fyw.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dmr $$5 : mg.e) {
            boolean $$6 = false;

            for (aww<dmr> $$7 : this.a) {
               if ($$7.a($$5) && fyw.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(czr.a);

         for (czj $$8 : $$1) {
            this.b(new fyw.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fsm $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alg $$4 = this.p == $$3 ? fyw.c : fyw.d;
            $$0.a(grc::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            alg $$6 = this.q == 1 ? fyw.s : fyw.u;
            $$0.a(grc::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(grc::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hnj.a(awn.Bv, 1.0F));
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
      protected void b(fsm $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fyw.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               czj $$5 = $$3.b();
               $$0.a(fyw.this.p, $$5.l(), $$1, $$2, $$5.f().a(kk.G));
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
                  $$0.a(fyw.this.p, $$6, $$1, $$2);
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

         this.aE_().sort(this.n);
      }

      class a extends ftw.a<fyw.b.a> {
         private final czj b;

         a(final czj $$0) {
            this.b = $$0;
         }

         public czj b() {
            return this.b;
         }

         @Override
         public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(grc::H, fyw.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (fyw.this.F != null) {
               for (int $$10 = 0; $$10 < fyw.this.F.a.size(); $$10++) {
                  awu<dmr> $$12;
                  if (this.b instanceof cxv $$11) {
                     $$12 = fyw.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fyw.this.F.m.size(); $$14++) {
                  this.a($$0, fyw.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fyw.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fsm $$0, @Nullable awu<?> $$1, int $$2, int $$3, boolean $$4) {
            wy $$5 = (wy)($$1 == null ? fyw.w : wy.b($$1.a(fyw.this.H.a($$1))));
            $$0.b(fyw.this.p, $$5, $$2 - fyw.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<fyw.b.a> {
         public int a(fyw.b.a $$0, fyw.b.a $$1) {
            czj $$2 = $$0.b();
            czj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               aww<dmr> $$6 = (aww<dmr>)b.this.o;
               $$4 = $$2 instanceof cxv ? fyw.this.H.a($$6, ((cxv)$$2).c()) : -1;
               $$5 = $$3 instanceof cxv ? fyw.this.H.a($$6, ((cxv)$$3).c()) : -1;
            } else {
               aww<czj> $$9 = (aww<czj>)b.this.o;
               $$4 = fyw.this.H.a($$9, $$2);
               $$5 = fyw.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(czj.a($$2), czj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends ftw<fyw.c.a> {
      public c(final fpt $$0) {
         super($$0, fyw.this.n, fyw.this.o - 33 - 58, 33, 9 * 4);

         for (bwr<?> $$1 : mg.f) {
            if (fyw.this.H.a(awx.g.b($$1)) > 0 || fyw.this.H.a(awx.h.b($$1)) > 0) {
               this.b(new fyw.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends ftw.a<fyw.c.a> {
         private final wy b;
         private final wy c;
         private final wy d;
         private final boolean e;
         private final boolean f;

         public a(final bwr<?> $$0) {
            this.b = $$0.h();
            int $$1 = fyw.this.H.a(awx.g.b($$0));
            if ($$1 == 0) {
               this.c = wy.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wy.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fyw.this.H.a(awx.h.b($$0));
            if ($$2 == 0) {
               this.d = wy.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wy.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fyw.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fyw.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fyw.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wx.a(this.c, this.d));
         }
      }
   }
}
