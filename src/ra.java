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

public class ra {
   private final rq a;
   @Nullable
   private ht b;
   private final ame c;
   private final Collection<rb> d = Lists.newArrayList();
   private final int e;
   private final Collection<re> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private boolean k;
   private final Stopwatch l = Stopwatch.createUnstarted();
   private boolean m;
   private final dbm n;
   @Nullable
   private Throwable o;
   @Nullable
   private dgr p;

   public ra(rq $$0, dbm $$1, ame $$2) {
      this.a = $$0;
      this.c = $$2;
      this.e = $$0.c();
      this.n = $$0.g().a($$1);
   }

   void a(ht $$0) {
      this.b = $$0;
   }

   void a() {
      this.h = this.c.W() + 1L + this.a.f();
      this.l.start();
   }

   public void b() {
      if (!this.l()) {
         this.C();
         if (this.l()) {
            if (this.o != null) {
               this.d.forEach($$0 -> $$0.c(this));
            } else {
               this.d.forEach($$0 -> $$0.b(this));
            }
         }
      }
   }

   private void C() {
      this.i = this.c.W() - this.h;
      if (this.i >= 0L) {
         if (this.i == 0L) {
            this.D();
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
               this.a(new rh("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.o == null) {
                  this.a(new rh("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.a(this.i));
         }
      }
   }

   private void D() {
      if (this.j) {
         throw new IllegalStateException("Test already started");
      } else {
         this.j = true;

         try {
            this.a.a(new qz(this));
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
   public ht e() {
      dgr $$0 = this.E();
      return $$0 == null ? null : rn.c($$0);
   }

   @Nullable
   public iw f() {
      dgr $$0 = this.E();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public ejp g() {
      dgr $$0 = this.E();
      return $$0 == null ? null : rn.a($$0);
   }

   @Nullable
   private dgr E() {
      return (dgr)this.c.c_(this.b);
   }

   public ame h() {
      return this.c;
   }

   public boolean i() {
      return this.m && this.o == null;
   }

   public boolean j() {
      return this.o != null;
   }

   public boolean k() {
      return this.j;
   }

   public boolean l() {
      return this.m;
   }

   public long m() {
      return this.l.elapsed(TimeUnit.MILLISECONDS);
   }

   private void F() {
      if (!this.m) {
         this.m = true;
         this.l.stop();
      }
   }

   public void n() {
      if (this.o == null) {
         this.F();
         ejp $$0 = this.g();
         List<bkq> $$1 = this.h().a(bkq.class, $$0.g(1.0), $$0x -> !($$0x instanceof cdu));
         $$1.forEach($$0x -> $$0x.a(bkq.c.b));
      }
   }

   public void a(Throwable $$0) {
      this.o = $$0;
      this.F();
   }

   @Nullable
   public Throwable o() {
      return this.o;
   }

   @Override
   public String toString() {
      return this.c();
   }

   public void a(rb $$0) {
      this.d.add($$0);
   }

   public void b(ht $$0) {
      this.p = rn.a(this.u(), $$0, this.v(), this.c, false);
      this.b = this.p.p();
      this.p.a(this.c());
      rn.a(this.b, new ht(1, 0, -1), this.v(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void p() {
      if (this.p == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dwz $$0 = rn.b(this.p);
         rn.a($$0, this.c);
      }
   }

   long q() {
      return this.i;
   }

   re r() {
      re $$0 = new re(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean s() {
      return this.a.d();
   }

   public boolean t() {
      return !this.a.d();
   }

   public String u() {
      return this.a.b();
   }

   public dbm v() {
      return this.n;
   }

   public rq w() {
      return this.a;
   }

   public int x() {
      return this.e;
   }

   public boolean y() {
      return this.a.h();
   }

   public int z() {
      return this.a.i();
   }

   public int A() {
      return this.a.j();
   }

   public void a(boolean $$0) {
      this.k = $$0;
   }

   public boolean B() {
      return this.k;
   }
}
