import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fum extends fui {
   private static final wo b = wo.c("gui.stats");
   static final aku c = aku.b("container/slot");
   static final aku d = aku.b("statistics/header");
   static final aku s = aku.b("statistics/sort_up");
   static final aku u = aku.b("statistics/sort_down");
   private static final wo v = wo.c("multiplayer.downloadingStats");
   static final wo w = wo.c("stats.none");
   private static final wo x = wo.c("stat.generalButton");
   private static final wo y = wo.c("stat.itemsButton");
   private static final wo z = wo.c("stat.mobsButton");
   protected final fui a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fse D = new fse(this, 33, 58);
   @Nullable
   private fum.a E;
   @Nullable
   fum.b F;
   @Nullable
   private fum.c G;
   final awk H;
   @Nullable
   private fpm<?> I;
   private boolean J = true;

   public fum(fui $$0, awk $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aR_() {
      this.D.c(new fpf(this.p, v));
      this.m.L().b(new agq(agq.a.b));
   }

   public void m() {
      this.E = new fum.a(this.m);
      this.F = new fum.b(this.m);
      this.G = new fum.c(this.m);
   }

   public void E() {
      fse $$0 = new fse(this, 33, 58);
      $$0.a(b, this.p);
      fsi $$1 = $$0.b(fsi.d()).a(5);
      $$1.c().b();
      fsi $$2 = $$1.a(fsi.e()).a(5);
      $$2.a(fop.a(x, $$0x -> this.a(this.E)).a(120).a());
      fop $$3 = $$2.a(fop.a(y, $$0x -> this.a(this.F)).a(120).a());
      fop $$4 = $$2.a(fop.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fop.a(wn.d, $$0x -> this.aO_()).a(200).a());
      if (this.F != null && this.F.aH_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aH_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fon var10000 = this.c($$1x);
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
   public void aO_() {
      this.m.a(this.a);
   }

   public void F() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.E();
         this.aF_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fpm<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awg<aku> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fpm<fum.a.a> {
      public a(final flh $$0) {
         super($$0, fum.this.n, fum.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awg<aku>> $$1 = new ObjectArrayList(awj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hfu.a(fum.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awg<aku> $$2 = (awg<aku>)var4.next();
            this.b(new fum.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpm.a<fum.a.a> {
         private final awg<aku> b;
         private final wo c;

         a(final awg<aku> $$0) {
            this.b = $$0;
            this.c = wo.c(fum.a($$0));
         }

         private String b() {
            return this.b.a(fum.this.H.a(this.b));
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fum.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fum.this.p, $$12, $$3 + $$4 - fum.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", wo.i().b(this.c).b(wn.v).f(this.b()));
         }
      }
   }

   class b extends fpm<fum.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final aku[] z = new aku[]{
         aku.b("statistics/block_mined"),
         aku.b("statistics/item_broken"),
         aku.b("statistics/item_crafted"),
         aku.b("statistics/item_used"),
         aku.b("statistics/item_picked_up"),
         aku.b("statistics/item_dropped")
      };
      protected final List<awi<djk>> a;
      protected final List<awi<cwj>> m;
      protected final Comparator<fum.b.a> n = new fum.b.b();
      @Nullable
      protected awi<?> o;
      protected int p = -1;
      protected int q;

      public b(final flh $$0) {
         super($$0, fum.this.n, fum.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awj.a);
         this.m = Lists.newArrayList(new awi[]{awj.d, awj.b, awj.c, awj.e, awj.f});
         Set<cwj> $$1 = Sets.newIdentityHashSet();

         for (cwj $$2 : mb.g) {
            boolean $$3 = false;

            for (awi<cwj> $$4 : this.m) {
               if ($$4.a($$2) && fum.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (djk $$5 : mb.e) {
            boolean $$6 = false;

            for (awi<djk> $$7 : this.a) {
               if ($$7.a($$5) && fum.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwr.a);

         for (cwj $$8 : $$1) {
            this.b(new fum.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fob $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            aku $$4 = this.p == $$3 ? fum.c : fum.d;
            $$0.a(gmf::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            aku $$6 = this.q == 1 ? fum.s : fum.u;
            $$0.a(gmf::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gmf::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hie.a(avz.Bf, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private awi<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awi<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fob $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fum.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cwj $$5 = $$3.b();
               $$0.a(fum.this.p, $$5.m(), $$1, $$2, $$5.g().a(kv.G));
            } else {
               wo $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fum.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awi<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aH_().sort(this.n);
      }

      class a extends fpm.a<fum.b.a> {
         private final cwj b;

         a(final cwj $$0) {
            this.b = $$0;
         }

         public cwj b() {
            return this.b;
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gmf::H, fum.c, $$3, $$2, 18, 18);
            $$0.b(this.b.n(), $$3 + 1, $$2 + 1);
            if (fum.this.F != null) {
               for (int $$10 = 0; $$10 < fum.this.F.a.size(); $$10++) {
                  awg<djk> $$12;
                  if (this.b instanceof cut $$11) {
                     $$12 = fum.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fum.this.F.m.size(); $$14++) {
                  this.a($$0, fum.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fum.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fob $$0, @Nullable awg<?> $$1, int $$2, int $$3, boolean $$4) {
            wo $$5 = (wo)($$1 == null ? fum.w : wo.b($$1.a(fum.this.H.a($$1))));
            $$0.b(fum.this.p, $$5, $$2 - fum.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", this.b.m());
         }
      }

      class b implements Comparator<fum.b.a> {
         public int a(fum.b.a $$0, fum.b.a $$1) {
            cwj $$2 = $$0.b();
            cwj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awi<djk> $$6 = (awi<djk>)b.this.o;
               $$4 = $$2 instanceof cut ? fum.this.H.a($$6, ((cut)$$2).d()) : -1;
               $$5 = $$3 instanceof cut ? fum.this.H.a($$6, ((cut)$$3).d()) : -1;
            } else {
               awi<cwj> $$9 = (awi<cwj>)b.this.o;
               $$4 = fum.this.H.a($$9, $$2);
               $$5 = fum.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cwj.a($$2), cwj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fpm<fum.c.a> {
      public c(final flh $$0) {
         super($$0, fum.this.n, fum.this.o - 33 - 58, 33, 9 * 4);

         for (buq<?> $$1 : mb.f) {
            if (fum.this.H.a(awj.g.b($$1)) > 0 || fum.this.H.a(awj.h.b($$1)) > 0) {
               this.b(new fum.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpm.a<fum.c.a> {
         private final wo b;
         private final wo c;
         private final wo d;
         private final boolean e;
         private final boolean f;

         public a(final buq<?> $$0) {
            this.b = $$0.h();
            int $$1 = fum.this.H.a(awj.g.b($$0));
            if ($$1 == 0) {
               this.c = wo.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wo.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fum.this.H.a(awj.h.b($$0));
            if ($$2 == 0) {
               this.d = wo.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wo.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fum.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fum.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fum.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", wn.a(this.c, this.d));
         }
      }
   }
}
