import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class pu {
   private final ql a;
   @Nullable
   private gw b;
   private final akn c;
   private final Collection<pv> d = Lists.newArrayList();
   private final int e;
   private final Collection<py> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private final Stopwatch k = Stopwatch.createUnstarted();
   private boolean l;
   private final czc m;
   @Nullable
   private Throwable n;
   @Nullable
   private ded o;

   public pu(ql $$0, czc $$1, akn $$2) {
      this.a = $$0;
      this.c = $$2;
      this.e = $$0.c();
      this.m = $$0.g().a($$1);
   }

   void a(gw $$0) {
      this.b = $$0;
   }

   void a() {
      this.h = this.c.V() + 1L + this.a.f();
      this.k.start();
   }

   public void b() {
      if (!this.k()) {
         this.A();
         if (this.k()) {
            if (this.n != null) {
               this.d.forEach($$0 -> $$0.c(this));
            } else {
               this.d.forEach($$0 -> $$0.b(this));
            }
         }
      }
   }

   private void A() {
      this.i = this.c.V() - this.h;
      if (this.i >= 0L) {
         if (this.i == 0L) {
            this.B();
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
               this.a(new qb("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.n == null) {
                  this.a(new qb("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.a(this.i));
         }
      }
   }

   private void B() {
      if (this.j) {
         throw new IllegalStateException("Test already started");
      } else {
         this.j = true;

         try {
            this.a.a(new pt(this));
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

   public gw d() {
      return this.b;
   }

   @Nullable
   public ib e() {
      ded $$0 = this.C();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public ehd f() {
      ded $$0 = this.C();
      return $$0 == null ? null : qh.a($$0);
   }

   @Nullable
   private ded C() {
      return (ded)this.c.c_(this.b);
   }

   public akn g() {
      return this.c;
   }

   public boolean h() {
      return this.l && this.n == null;
   }

   public boolean i() {
      return this.n != null;
   }

   public boolean j() {
      return this.j;
   }

   public boolean k() {
      return this.l;
   }

   public long l() {
      return this.k.elapsed(TimeUnit.MILLISECONDS);
   }

   private void D() {
      if (!this.l) {
         this.l = true;
         this.k.stop();
      }
   }

   public void m() {
      if (this.n == null) {
         this.D();
      }
   }

   public void a(Throwable $$0) {
      this.n = $$0;
      this.D();
   }

   @Nullable
   public Throwable n() {
      return this.n;
   }

   @Override
   public String toString() {
      return this.c();
   }

   public void a(pv $$0) {
      this.d.add($$0);
   }

   public void a(gw $$0, int $$1) {
      this.o = qh.a(this.t(), $$0, this.u(), $$1, this.c, false);
      this.b = this.o.p();
      this.o.a(this.c());
      qh.a(this.b, new gw(1, 0, -1), this.u(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void o() {
      if (this.o == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         duv $$0 = qh.b(this.o);
         qh.a($$0, this.b.v(), this.c);
      }
   }

   long p() {
      return this.i;
   }

   py q() {
      py $$0 = new py(this);
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

   public czc u() {
      return this.m;
   }

   public ql v() {
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
}
