import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class qt {
   private final rk a;
   @Nullable
   private ht b;
   private final alq c;
   private final Collection<qu> d = Lists.newArrayList();
   private final int e;
   private final Collection<qx> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private boolean k;
   private final Stopwatch l = Stopwatch.createUnstarted();
   private boolean m;
   private final dal n;
   @Nullable
   private Throwable o;
   @Nullable
   private dfk p;

   public qt(rk $$0, dal $$1, alq $$2) {
      this.a = $$0;
      this.c = $$2;
      this.e = $$0.c();
      this.n = $$0.g().a($$1);
   }

   void a(ht $$0) {
      this.b = $$0;
   }

   void a() {
      this.h = this.c.V() + 1L + this.a.f();
      this.l.start();
   }

   public void b() {
      if (!this.k()) {
         this.B();
         if (this.k()) {
            if (this.o != null) {
               this.d.forEach($$0 -> $$0.c(this));
            } else {
               this.d.forEach($$0 -> $$0.b(this));
            }
         }
      }
   }

   private void B() {
      this.i = this.c.V() - this.h;
      if (this.i >= 0L) {
         if (this.i == 0L) {
            this.C();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.g.object2LongEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry<Runnable>)$$0.next();
            if ($$1.getLongValue() <= this.i) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (Exception var4) {
                  this.a(var4);
               }

               $$0.remove();
            }
         }

         if (this.i > (long)this.e) {
            if (this.f.isEmpty()) {
               this.a(new ra("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.o == null) {
                  this.a(new ra("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.a(this.i));
         }
      }
   }

   private void C() {
      if (this.j) {
         throw new IllegalStateException("Test already started");
      } else {
         this.j = true;

         try {
            this.a.a(new qs(this));
         } catch (Exception var2) {
            this.a(var2);
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public String c() {
      return this.a.a();
   }

   public ht d() {
      return this.b;
   }

   @Nullable
   public iw e() {
      dfk $$0 = this.D();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public eia f() {
      dfk $$0 = this.D();
      return $$0 == null ? null : rg.a($$0);
   }

   @Nullable
   private dfk D() {
      return (dfk)this.c.c_(this.b);
   }

   public alq g() {
      return this.c;
   }

   public boolean h() {
      return this.m && this.o == null;
   }

   public boolean i() {
      return this.o != null;
   }

   public boolean j() {
      return this.j;
   }

   public boolean k() {
      return this.m;
   }

   public long l() {
      return this.l.elapsed(TimeUnit.MILLISECONDS);
   }

   private void E() {
      if (!this.m) {
         this.m = true;
         this.l.stop();
      }
   }

   public void m() {
      if (this.o == null) {
         this.E();
         eia $$0 = this.f();
         List<bjt> $$1 = this.g().a(bjt.class, $$0.g(1.0), $$0x -> !($$0x instanceof ccx));
         $$1.forEach($$0x -> $$0x.a(bjt.c.b));
      }
   }

   public void a(Throwable $$0) {
      this.o = $$0;
      this.E();
   }

   @Nullable
   public Throwable n() {
      return this.o;
   }

   @Override
   public String toString() {
      return this.c();
   }

   public void a(qu $$0) {
      this.d.add($$0);
   }

   public void a(ht $$0, int $$1) {
      this.p = rg.a(this.t(), $$0, this.u(), $$1, this.c, false);
      this.b = this.p.p();
      this.p.a(this.c());
      rg.a(this.b, new ht(1, 0, -1), this.u(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void o() {
      if (this.p == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dvs $$0 = rg.b(this.p);
         rg.a($$0, this.b.v(), this.c);
      }
   }

   long p() {
      return this.i;
   }

   qx q() {
      qx $$0 = new qx(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.d();
   }

   public boolean s() {
      return !this.a.d();
   }

   public String t() {
      return this.a.b();
   }

   public dal u() {
      return this.n;
   }

   public rk v() {
      return this.a;
   }

   public int w() {
      return this.e;
   }

   public boolean x() {
      return this.a.h();
   }

   public int y() {
      return this.a.i();
   }

   public int z() {
      return this.a.j();
   }

   public void a(boolean $$0) {
      this.k = $$0;
   }

   public boolean A() {
      return this.k;
   }
}
