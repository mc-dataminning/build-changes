import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fwj extends fwf {
   private static final wv b = wv.c("gui.stats");
   static final ald c = ald.b("container/slot");
   static final ald d = ald.b("statistics/header");
   static final ald s = ald.b("statistics/sort_up");
   static final ald u = ald.b("statistics/sort_down");
   private static final wv v = wv.c("multiplayer.downloadingStats");
   static final wv w = wv.c("stats.none");
   private static final wv x = wv.c("stat.generalButton");
   private static final wv y = wv.c("stat.itemsButton");
   private static final wv z = wv.c("stat.mobsButton");
   protected final fwf a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fub D = new fub(this, 33, 58);
   @Nullable
   private fwj.a E;
   @Nullable
   fwj.b F;
   @Nullable
   private fwj.c G;
   final awv H;
   @Nullable
   private frj<?> I;
   private boolean J = true;

   public fwj(fwf $$0, awv $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aN_() {
      this.D.c(new frc(this.p, v));
      this.m.L().b(new agx(agx.a.b));
   }

   public void m() {
      this.E = new fwj.a(this.m);
      this.F = new fwj.b(this.m);
      this.G = new fwj.c(this.m);
   }

   public void E() {
      fub $$0 = new fub(this, 33, 58);
      $$0.a(b, this.p);
      fuf $$1 = $$0.b(fuf.d()).a(5);
      $$1.c().b();
      fuf $$2 = $$1.a(fuf.e()).a(5);
      $$2.a(fqn.a(x, $$0x -> this.a(this.E)).a(120).a());
      fqn $$3 = $$2.a(fqn.a(y, $$0x -> this.a(this.F)).a(120).a());
      fqn $$4 = $$2.a(fqn.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fqn.a(wu.d, $$0x -> this.aK_()).a(200).a());
      if (this.F != null && this.F.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fql var10000 = this.c($$1x);
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

   public void a(@Nullable frj<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awr<ald> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends frj<fwj.a.a> {
      public a(final fnd $$0) {
         super($$0, fwj.this.n, fwj.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awr<ald>> $$1 = new ObjectArrayList(awu.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hia.a(fwj.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awr<ald> $$2 = (awr<ald>)var4.next();
            this.b(new fwj.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends frj.a<fwj.a.a> {
         private final awr<ald> b;
         private final wv c;

         a(final awr<ald> $$0) {
            this.b = $$0;
            this.c = wv.c(fwj.a($$0));
         }

         private String b() {
            return this.b.a(fwj.this.H.a(this.b));
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fwj.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fwj.this.p, $$12, $$3 + $$4 - fwj.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", wv.i().b(this.c).b(wu.v).f(this.b()));
         }
      }
   }

   class b extends frj<fwj.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ald[] z = new ald[]{
         ald.b("statistics/block_mined"),
         ald.b("statistics/item_broken"),
         ald.b("statistics/item_crafted"),
         ald.b("statistics/item_used"),
         ald.b("statistics/item_picked_up"),
         ald.b("statistics/item_dropped")
      };
      protected final List<awt<dku>> a;
      protected final List<awt<cxu>> m;
      protected final Comparator<fwj.b.a> n = new fwj.b.b();
      @Nullable
      protected awt<?> o;
      protected int p = -1;
      protected int q;

      public b(final fnd $$0) {
         super($$0, fwj.this.n, fwj.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awu.a);
         this.m = Lists.newArrayList(new awt[]{awu.d, awu.b, awu.c, awu.e, awu.f});
         Set<cxu> $$1 = Sets.newIdentityHashSet();

         for (cxu $$2 : md.g) {
            boolean $$3 = false;

            for (awt<cxu> $$4 : this.m) {
               if ($$4.a($$2) && fwj.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dku $$5 : md.e) {
            boolean $$6 = false;

            for (awt<dku> $$7 : this.a) {
               if ($$7.a($$5) && fwj.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.i());
            }
         }

         $$1.remove(cyc.a);

         for (cxu $$8 : $$1) {
            this.b(new fwj.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fpz $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ald $$4 = this.p == $$3 ? fwj.c : fwj.d;
            $$0.a(goi::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            ald $$6 = this.q == 1 ? fwj.s : fwj.u;
            $$0.a(goi::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(goi::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hkk.a(awk.Bp, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private awt<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awt<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fpz $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fwj.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cxu $$5 = $$3.b();
               $$0.a(fwj.this.p, $$5.m(), $$1, $$2, $$5.g().a(kx.H));
            } else {
               wv $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fwj.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awt<?> $$0) {
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

      class a extends frj.a<fwj.b.a> {
         private final cxu b;

         a(final cxu $$0) {
            this.b = $$0;
         }

         public cxu b() {
            return this.b;
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(goi::H, fwj.c, $$3, $$2, 18, 18);
            $$0.b(this.b.n(), $$3 + 1, $$2 + 1);
            if (fwj.this.F != null) {
               for (int $$10 = 0; $$10 < fwj.this.F.a.size(); $$10++) {
                  awr<dku> $$12;
                  if (this.b instanceof cwf $$11) {
                     $$12 = fwj.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fwj.this.F.m.size(); $$14++) {
                  this.a($$0, fwj.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fwj.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fpz $$0, @Nullable awr<?> $$1, int $$2, int $$3, boolean $$4) {
            wv $$5 = (wv)($$1 == null ? fwj.w : wv.b($$1.a(fwj.this.H.a($$1))));
            $$0.b(fwj.this.p, $$5, $$2 - fwj.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", this.b.m());
         }
      }

      class b implements Comparator<fwj.b.a> {
         public int a(fwj.b.a $$0, fwj.b.a $$1) {
            cxu $$2 = $$0.b();
            cxu $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awt<dku> $$6 = (awt<dku>)b.this.o;
               $$4 = $$2 instanceof cwf ? fwj.this.H.a($$6, ((cwf)$$2).d()) : -1;
               $$5 = $$3 instanceof cwf ? fwj.this.H.a($$6, ((cwf)$$3).d()) : -1;
            } else {
               awt<cxu> $$9 = (awt<cxu>)b.this.o;
               $$4 = fwj.this.H.a($$9, $$2);
               $$5 = fwj.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cxu.a($$2), cxu.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends frj<fwj.c.a> {
      public c(final fnd $$0) {
         super($$0, fwj.this.n, fwj.this.o - 33 - 58, 33, 9 * 4);

         for (bwb<?> $$1 : md.f) {
            if (fwj.this.H.a(awu.g.b($$1)) > 0 || fwj.this.H.a(awu.h.b($$1)) > 0) {
               this.b(new fwj.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends frj.a<fwj.c.a> {
         private final wv b;
         private final wv c;
         private final wv d;
         private final boolean e;
         private final boolean f;

         public a(final bwb<?> $$0) {
            this.b = $$0.h();
            int $$1 = fwj.this.H.a(awu.g.b($$0));
            if ($$1 == 0) {
               this.c = wv.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wv.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fwj.this.H.a(awu.h.b($$0));
            if ($$2 == 0) {
               this.d = wv.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wv.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fwj.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fwj.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fwj.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", wu.a(this.c, this.d));
         }
      }
   }
}
