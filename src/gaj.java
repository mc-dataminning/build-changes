import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gaj extends gaf {
   private static final xc b = xc.c("gui.stats");
   static final alk c = alk.b("container/slot");
   static final alk d = alk.b("statistics/header");
   static final alk s = alk.b("statistics/sort_up");
   static final alk u = alk.b("statistics/sort_down");
   private static final xc v = xc.c("multiplayer.downloadingStats");
   static final xc w = xc.c("stats.none");
   private static final xc x = xc.c("stat.generalButton");
   private static final xc y = xc.c("stat.itemsButton");
   private static final xc z = xc.c("stat.mobsButton");
   protected final gaf a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fyb D = new fyb(this, 33, 58);
   @Nullable
   private gaj.a E;
   @Nullable
   gaj.b F;
   @Nullable
   private gaj.c G;
   final axc H;
   @Nullable
   private fvj<?> I;
   private boolean J = true;

   public gaj(gaf $$0, axc $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aS_() {
      this.D.c(new fvc(this.p, v));
      this.m.L().b(new ahe(ahe.a.b));
   }

   public void m() {
      this.E = new gaj.a(this.m);
      this.F = new gaj.b(this.m);
      this.G = new gaj.c(this.m);
   }

   public void E() {
      fyb $$0 = new fyb(this, 33, 58);
      $$0.a(b, this.p);
      fyf $$1 = $$0.b(fyf.d()).a(5);
      $$1.c().b();
      fyf $$2 = $$1.a(fyf.e()).a(5);
      $$2.a(fun.a(x, $$0x -> this.a(this.E)).a(120).a());
      fun $$3 = $$2.a(fun.a(y, $$0x -> this.a(this.F)).a(120).a());
      fun $$4 = $$2.a(fun.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fun.a(xb.d, $$0x -> this.aP_()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         ful var10000 = this.c($$1x);
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

   public void a(@Nullable fvj<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awy<alk> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fvj<gaj.a.a> {
      public a(final frf $$0) {
         super($$0, gaj.this.n, gaj.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awy<alk>> $$1 = new ObjectArrayList(axb.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hmk.a(gaj.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awy<alk> $$2 = (awy<alk>)var4.next();
            this.b(new gaj.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fvj.a<gaj.a.a> {
         private final awy<alk> b;
         private final xc c;

         a(final awy<alk> $$0) {
            this.b = $$0;
            this.c = xc.c(gaj.a($$0));
         }

         private String b() {
            return this.b.a(gaj.this.H.a(this.b));
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(gaj.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(gaj.this.p, $$12, $$3 + $$4 - gaj.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", xc.i().b(this.c).b(xb.v).f(this.b()));
         }
      }
   }

   class b extends fvj<gaj.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alk[] z = new alk[]{
         alk.b("statistics/block_mined"),
         alk.b("statistics/item_broken"),
         alk.b("statistics/item_crafted"),
         alk.b("statistics/item_used"),
         alk.b("statistics/item_picked_up"),
         alk.b("statistics/item_dropped")
      };
      protected final List<axa<dne>> a;
      protected final List<axa<czw>> m;
      protected final Comparator<gaj.b.a> n = new gaj.b.b();
      @Nullable
      protected axa<?> o;
      protected int p = -1;
      protected int q;

      public b(final frf $$0) {
         super($$0, gaj.this.n, gaj.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(axb.a);
         this.m = Lists.newArrayList(new axa[]{axb.d, axb.b, axb.c, axb.e, axb.f});
         Set<czw> $$1 = Sets.newIdentityHashSet();

         for (czw $$2 : mh.g) {
            boolean $$3 = false;

            for (axa<czw> $$4 : this.m) {
               if ($$4.a($$2) && gaj.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dne $$5 : mh.e) {
            boolean $$6 = false;

            for (axa<dne> $$7 : this.a) {
               if ($$7.a($$5) && gaj.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(dae.a);

         for (czw $$8 : $$1) {
            this.b(new gaj.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(ftz $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alk $$4 = this.p == $$3 ? gaj.c : gaj.d;
            $$0.a(gsn::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            alk $$6 = this.q == 1 ? gaj.s : gaj.u;
            $$0.a(gsn::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gsn::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hou.a(awr.Bv, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private axa<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(axa<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ftz $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            gaj.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               czw $$5 = $$3.b();
               $$0.a(gaj.this.p, $$5.l(), $$1, $$2, $$5.f().a(kl.G));
            } else {
               xc $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(gaj.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(axa<?> $$0) {
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

      class a extends fvj.a<gaj.b.a> {
         private final czw b;

         a(final czw $$0) {
            this.b = $$0;
         }

         public czw b() {
            return this.b;
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gsn::H, gaj.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (gaj.this.F != null) {
               for (int $$10 = 0; $$10 < gaj.this.F.a.size(); $$10++) {
                  awy<dne> $$12;
                  if (this.b instanceof cyi $$11) {
                     $$12 = gaj.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < gaj.this.F.m.size(); $$14++) {
                  this.a($$0, gaj.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + gaj.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(ftz $$0, @Nullable awy<?> $$1, int $$2, int $$3, boolean $$4) {
            xc $$5 = (xc)($$1 == null ? gaj.w : xc.b($$1.a(gaj.this.H.a($$1))));
            $$0.b(gaj.this.p, $$5, $$2 - gaj.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<gaj.b.a> {
         public int a(gaj.b.a $$0, gaj.b.a $$1) {
            czw $$2 = $$0.b();
            czw $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               axa<dne> $$6 = (axa<dne>)b.this.o;
               $$4 = $$2 instanceof cyi ? gaj.this.H.a($$6, ((cyi)$$2).c()) : -1;
               $$5 = $$3 instanceof cyi ? gaj.this.H.a($$6, ((cyi)$$3).c()) : -1;
            } else {
               axa<czw> $$9 = (axa<czw>)b.this.o;
               $$4 = gaj.this.H.a($$9, $$2);
               $$5 = gaj.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(czw.a($$2), czw.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fvj<gaj.c.a> {
      public c(final frf $$0) {
         super($$0, gaj.this.n, gaj.this.o - 33 - 58, 33, 9 * 4);

         for (bxe<?> $$1 : mh.f) {
            if (gaj.this.H.a(axb.g.b($$1)) > 0 || gaj.this.H.a(axb.h.b($$1)) > 0) {
               this.b(new gaj.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fvj.a<gaj.c.a> {
         private final xc b;
         private final xc c;
         private final xc d;
         private final boolean e;
         private final boolean f;

         public a(final bxe<?> $$0) {
            this.b = $$0.h();
            int $$1 = gaj.this.H.a(axb.g.b($$0));
            if ($$1 == 0) {
               this.c = xc.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xc.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = gaj.this.H.a(axb.h.b($$0));
            if ($$2 == 0) {
               this.d = xc.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xc.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(gaj.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(gaj.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(gaj.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", xb.a(this.c, this.d));
         }
      }
   }
}
