import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class pw {
   private final qn a;
   @Nullable
   private gw b;
   private final akq c;
   private final Collection<px> d = Lists.newArrayList();
   private final int e;
   private final Collection<qa> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private final Stopwatch k = Stopwatch.createUnstarted();
   private boolean l;
   private final czh m;
   @Nullable
   private Throwable n;
   @Nullable
   private dei o;

   public pw(qn $$0, czh $$1, akq $$2) {
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
               this.a(new qd("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.n == null) {
                  this.a(new qd("No sequences finished"));
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
            this.a.a(new pv(this));
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
   public hy e() {
      dei $$0 = this.C();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public ehi f() {
      dei $$0 = this.C();
      return $$0 == null ? null : qj.a($$0);
   }

   @Nullable
   private dei C() {
      return (dei)this.c.c_(this.b);
   }

   public akq g() {
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

   public void a(px $$0) {
      this.d.add($$0);
   }

   public void a(gw $$0, int $$1) {
      this.o = qj.a(this.t(), $$0, this.u(), $$1, this.c, false);
      this.b = this.o.p();
      this.o.a(this.c());
      qj.a(this.b, new gw(1, 0, -1), this.u(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void o() {
      if (this.o == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dva $$0 = qj.b(this.o);
         qj.a($$0, this.b.v(), this.c);
      }
   }

   long p() {
      return this.i;
   }

   qa q() {
      qa $$0 = new qa(this);
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

   public czh u() {
      return this.m;
   }

   public qn v() {
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
