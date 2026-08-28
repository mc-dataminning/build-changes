import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fuq extends fum {
   private static final wp b = wp.c("gui.stats");
   static final akv c = akv.b("container/slot");
   static final akv d = akv.b("statistics/header");
   static final akv s = akv.b("statistics/sort_up");
   static final akv u = akv.b("statistics/sort_down");
   private static final wp v = wp.c("multiplayer.downloadingStats");
   static final wp w = wp.c("stats.none");
   private static final wp x = wp.c("stat.generalButton");
   private static final wp y = wp.c("stat.itemsButton");
   private static final wp z = wp.c("stat.mobsButton");
   protected final fum a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fsi D = new fsi(this, 33, 58);
   @Nullable
   private fuq.a E;
   @Nullable
   fuq.b F;
   @Nullable
   private fuq.c G;
   final awl H;
   @Nullable
   private fpq<?> I;
   private boolean J = true;

   public fuq(fum $$0, awl $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aR_() {
      this.D.c(new fpj(this.p, v));
      this.m.L().b(new agr(agr.a.b));
   }

   public void m() {
      this.E = new fuq.a(this.m);
      this.F = new fuq.b(this.m);
      this.G = new fuq.c(this.m);
   }

   public void E() {
      fsi $$0 = new fsi(this, 33, 58);
      $$0.a(b, this.p);
      fsm $$1 = $$0.b(fsm.d()).a(5);
      $$1.c().b();
      fsm $$2 = $$1.a(fsm.e()).a(5);
      $$2.a(fou.a(x, $$0x -> this.a(this.E)).a(120).a());
      fou $$3 = $$2.a(fou.a(y, $$0x -> this.a(this.F)).a(120).a());
      fou $$4 = $$2.a(fou.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fou.a(wo.d, $$0x -> this.aO_()).a(200).a());
      if (this.F != null && this.F.aH_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aH_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fos var10000 = this.c($$1x);
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

   public void a(@Nullable fpq<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awh<akv> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fpq<fuq.a.a> {
      public a(final flk $$0) {
         super($$0, fuq.this.n, fuq.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awh<akv>> $$1 = new ObjectArrayList(awk.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hgb.a(fuq.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awh<akv> $$2 = (awh<akv>)var4.next();
            this.b(new fuq.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpq.a<fuq.a.a> {
         private final awh<akv> b;
         private final wp c;

         a(final awh<akv> $$0) {
            this.b = $$0;
            this.c = wp.c(fuq.a($$0));
         }

         private String b() {
            return this.b.a(fuq.this.H.a(this.b));
         }

         @Override
         public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fuq.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fuq.this.p, $$12, $$3 + $$4 - fuq.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", wp.i().b(this.c).b(wo.v).f(this.b()));
         }
      }
   }

   class b extends fpq<fuq.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akv[] z = new akv[]{
         akv.b("statistics/block_mined"),
         akv.b("statistics/item_broken"),
         akv.b("statistics/item_crafted"),
         akv.b("statistics/item_used"),
         akv.b("statistics/item_picked_up"),
         akv.b("statistics/item_dropped")
      };
      protected final List<awj<djn>> a;
      protected final List<awj<cwm>> m;
      protected final Comparator<fuq.b.a> n = new fuq.b.b();
      @Nullable
      protected awj<?> o;
      protected int p = -1;
      protected int q;

      public b(final flk $$0) {
         super($$0, fuq.this.n, fuq.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awk.a);
         this.m = Lists.newArrayList(new awj[]{awk.d, awk.b, awk.c, awk.e, awk.f});
         Set<cwm> $$1 = Sets.newIdentityHashSet();

         for (cwm $$2 : mb.g) {
            boolean $$3 = false;

            for (awj<cwm> $$4 : this.m) {
               if ($$4.a($$2) && fuq.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (djn $$5 : mb.e) {
            boolean $$6 = false;

            for (awj<djn> $$7 : this.a) {
               if ($$7.a($$5) && fuq.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwu.a);

         for (cwm $$8 : $$1) {
            this.b(new fuq.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fof $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akv $$4 = this.p == $$3 ? fuq.c : fuq.d;
            $$0.a(gmj::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            akv $$6 = this.q == 1 ? fuq.s : fuq.u;
            $$0.a(gmj::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gmj::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hil.a(awa.Bf, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private awj<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awj<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fof $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fuq.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cwm $$5 = $$3.b();
               $$0.a(fuq.this.p, $$5.m(), $$1, $$2, $$5.g().a(kv.G));
            } else {
               wp $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fuq.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awj<?> $$0) {
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

      class a extends fpq.a<fuq.b.a> {
         private final cwm b;

         a(final cwm $$0) {
            this.b = $$0;
         }

         public cwm b() {
            return this.b;
         }

         @Override
         public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gmj::H, fuq.c, $$3, $$2, 18, 18);
            $$0.b(this.b.n(), $$3 + 1, $$2 + 1);
            if (fuq.this.F != null) {
               for (int $$10 = 0; $$10 < fuq.this.F.a.size(); $$10++) {
                  awh<djn> $$12;
                  if (this.b instanceof cuw $$11) {
                     $$12 = fuq.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fuq.this.F.m.size(); $$14++) {
                  this.a($$0, fuq.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fuq.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fof $$0, @Nullable awh<?> $$1, int $$2, int $$3, boolean $$4) {
            wp $$5 = (wp)($$1 == null ? fuq.w : wp.b($$1.a(fuq.this.H.a($$1))));
            $$0.b(fuq.this.p, $$5, $$2 - fuq.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", this.b.m());
         }
      }

      class b implements Comparator<fuq.b.a> {
         public int a(fuq.b.a $$0, fuq.b.a $$1) {
            cwm $$2 = $$0.b();
            cwm $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awj<djn> $$6 = (awj<djn>)b.this.o;
               $$4 = $$2 instanceof cuw ? fuq.this.H.a($$6, ((cuw)$$2).d()) : -1;
               $$5 = $$3 instanceof cuw ? fuq.this.H.a($$6, ((cuw)$$3).d()) : -1;
            } else {
               awj<cwm> $$9 = (awj<cwm>)b.this.o;
               $$4 = fuq.this.H.a($$9, $$2);
               $$5 = fuq.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cwm.a($$2), cwm.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fpq<fuq.c.a> {
      public c(final flk $$0) {
         super($$0, fuq.this.n, fuq.this.o - 33 - 58, 33, 9 * 4);

         for (but<?> $$1 : mb.f) {
            if (fuq.this.H.a(awk.g.b($$1)) > 0 || fuq.this.H.a(awk.h.b($$1)) > 0) {
               this.b(new fuq.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpq.a<fuq.c.a> {
         private final wp b;
         private final wp c;
         private final wp d;
         private final boolean e;
         private final boolean f;

         public a(final but<?> $$0) {
            this.b = $$0.h();
            int $$1 = fuq.this.H.a(awk.g.b($$0));
            if ($$1 == 0) {
               this.c = wp.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wp.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fuq.this.H.a(awk.h.b($$0));
            if ($$2 == 0) {
               this.d = wp.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wp.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fuq.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fuq.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fuq.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", wo.a(this.c, this.d));
         }
      }
   }
}
