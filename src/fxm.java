import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fxm extends fxi {
   private static final ww b = ww.c("gui.stats");
   static final ale c = ale.b("container/slot");
   static final ale d = ale.b("statistics/header");
   static final ale s = ale.b("statistics/sort_up");
   static final ale u = ale.b("statistics/sort_down");
   private static final ww v = ww.c("multiplayer.downloadingStats");
   static final ww w = ww.c("stats.none");
   private static final ww x = ww.c("stat.generalButton");
   private static final ww y = ww.c("stat.itemsButton");
   private static final ww z = ww.c("stat.mobsButton");
   protected final fxi a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fve D = new fve(this, 33, 58);
   @Nullable
   private fxm.a E;
   @Nullable
   fxm.b F;
   @Nullable
   private fxm.c G;
   final aww H;
   @Nullable
   private fsm<?> I;
   private boolean J = true;

   public fxm(fxi $$0, aww $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aN_() {
      this.D.c(new fsf(this.p, v));
      this.m.L().b(new agy(agy.a.b));
   }

   public void m() {
      this.E = new fxm.a(this.m);
      this.F = new fxm.b(this.m);
      this.G = new fxm.c(this.m);
   }

   public void E() {
      fve $$0 = new fve(this, 33, 58);
      $$0.a(b, this.p);
      fvi $$1 = $$0.b(fvi.d()).a(5);
      $$1.c().b();
      fvi $$2 = $$1.a(fvi.e()).a(5);
      $$2.a(frq.a(x, $$0x -> this.a(this.E)).a(120).a());
      frq $$3 = $$2.a(frq.a(y, $$0x -> this.a(this.F)).a(120).a());
      frq $$4 = $$2.a(frq.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(frq.a(wv.d, $$0x -> this.aK_()).a(200).a());
      if (this.F != null && this.F.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fro var10000 = this.c($$1x);
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

   public void a(@Nullable fsm<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(aws<ale> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fsm<fxm.a.a> {
      public a(final fof $$0) {
         super($$0, fxm.this.n, fxm.this.o - 33 - 58, 33, 14);
         ObjectArrayList<aws<ale>> $$1 = new ObjectArrayList(awv.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hjg.a(fxm.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aws<ale> $$2 = (aws<ale>)var4.next();
            this.b(new fxm.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fsm.a<fxm.a.a> {
         private final aws<ale> b;
         private final ww c;

         a(final aws<ale> $$0) {
            this.b = $$0;
            this.c = ww.c(fxm.a($$0));
         }

         private String b() {
            return this.b.a(fxm.this.H.a(this.b));
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fxm.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fxm.this.p, $$12, $$3 + $$4 - fxm.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", ww.i().b(this.c).b(wv.v).f(this.b()));
         }
      }
   }

   class b extends fsm<fxm.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ale[] z = new ale[]{
         ale.b("statistics/block_mined"),
         ale.b("statistics/item_broken"),
         ale.b("statistics/item_crafted"),
         ale.b("statistics/item_used"),
         ale.b("statistics/item_picked_up"),
         ale.b("statistics/item_dropped")
      };
      protected final List<awu<dlu>> a;
      protected final List<awu<cyo>> m;
      protected final Comparator<fxm.b.a> n = new fxm.b.b();
      @Nullable
      protected awu<?> o;
      protected int p = -1;
      protected int q;

      public b(final fof $$0) {
         super($$0, fxm.this.n, fxm.this.o - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(awv.a);
         this.m = Lists.newArrayList(new awu[]{awv.d, awv.b, awv.c, awv.e, awv.f});
         Set<cyo> $$1 = Sets.newIdentityHashSet();

         for (cyo $$2 : mf.g) {
            boolean $$3 = false;

            for (awu<cyo> $$4 : this.m) {
               if ($$4.a($$2) && fxm.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dlu $$5 : mf.e) {
            boolean $$6 = false;

            for (awu<dlu> $$7 : this.a) {
               if ($$7.a($$5) && fxm.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(cyw.a);

         for (cyo $$8 : $$1) {
            this.b(new fxm.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(frc $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ale $$4 = this.p == $$3 ? fxm.c : fxm.d;
            $$0.a(gpn::H, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            ale $$6 = this.q == 1 ? fxm.s : fxm.u;
            $$0.a(gpn::H, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gpn::H, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hlr.a(awl.Bp, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private awu<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awu<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(frc $$0, int $$1, int $$2) {
         if ($$2 >= this.G() && $$2 <= this.I()) {
            fxm.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cyo $$5 = $$3.b();
               $$0.a(fxm.this.p, $$5.l(), $$1, $$2, $$5.f().a(kj.G));
            } else {
               ww $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fxm.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awu<?> $$0) {
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

      class a extends fsm.a<fxm.b.a> {
         private final cyo b;

         a(final cyo $$0) {
            this.b = $$0;
         }

         public cyo b() {
            return this.b;
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gpn::H, fxm.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (fxm.this.F != null) {
               for (int $$10 = 0; $$10 < fxm.this.F.a.size(); $$10++) {
                  aws<dlu> $$12;
                  if (this.b instanceof cxa $$11) {
                     $$12 = fxm.this.F.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fxm.this.F.m.size(); $$14++) {
                  this.a($$0, fxm.this.F.m.get($$14).b(this.b), $$3 + b.this.m($$14 + fxm.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(frc $$0, @Nullable aws<?> $$1, int $$2, int $$3, boolean $$4) {
            ww $$5 = (ww)($$1 == null ? fxm.w : ww.b($$1.a(fxm.this.H.a($$1))));
            $$0.b(fxm.this.p, $$5, $$2 - fxm.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<fxm.b.a> {
         public int a(fxm.b.a $$0, fxm.b.a $$1) {
            cyo $$2 = $$0.b();
            cyo $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awu<dlu> $$6 = (awu<dlu>)b.this.o;
               $$4 = $$2 instanceof cxa ? fxm.this.H.a($$6, ((cxa)$$2).c()) : -1;
               $$5 = $$3 instanceof cxa ? fxm.this.H.a($$6, ((cxa)$$3).c()) : -1;
            } else {
               awu<cyo> $$9 = (awu<cyo>)b.this.o;
               $$4 = fxm.this.H.a($$9, $$2);
               $$5 = fxm.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cyo.a($$2), cyo.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fsm<fxm.c.a> {
      public c(final fof $$0) {
         super($$0, fxm.this.n, fxm.this.o - 33 - 58, 33, 9 * 4);

         for (bwj<?> $$1 : mf.f) {
            if (fxm.this.H.a(awv.g.b($$1)) > 0 || fxm.this.H.a(awv.h.b($$1)) > 0) {
               this.b(new fxm.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fsm.a<fxm.c.a> {
         private final ww b;
         private final ww c;
         private final ww d;
         private final boolean e;
         private final boolean f;

         public a(final bwj<?> $$0) {
            this.b = $$0.h();
            int $$1 = fxm.this.H.a(awv.g.b($$0));
            if ($$1 == 0) {
               this.c = ww.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = ww.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fxm.this.H.a(awv.h.b($$0));
            if ($$2 == 0) {
               this.d = ww.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = ww.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fxm.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fxm.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fxm.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", wv.a(this.c, this.d));
         }
      }
   }
}
