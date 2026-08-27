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

public class qz {
   private final rq a;
   @Nullable
   private ht b;
   private final ama c;
   private final Collection<ra> d = Lists.newArrayList();
   private final int e;
   private final Collection<rd> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private long i;
   private boolean j;
   private boolean k;
   private final Stopwatch l = Stopwatch.createUnstarted();
   private boolean m;
   private final dbf n;
   @Nullable
   private Throwable o;
   @Nullable
   private dgf p;

   public qz(rq $$0, dbf $$1, ama $$2) {
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
               this.a(new rg("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.i));
               if (this.o == null) {
                  this.a(new rg("No sequences finished"));
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
            this.a.a(new qy(this));
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
      dgf $$0 = this.D();
      return $$0 == null ? null : $$0.j();
   }

   @Nullable
   public ejd f() {
      dgf $$0 = this.D();
      return $$0 == null ? null : rm.a($$0);
   }

   @Nullable
   private dgf D() {
      return (dgf)this.c.c_(this.b);
   }

   public ama g() {
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
         ejd $$0 = this.f();
         List<bki> $$1 = this.g().a(bki.class, $$0.g(1.0), $$0x -> !($$0x instanceof cdm));
         $$1.forEach($$0x -> $$0x.a(bki.c.b));
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

   public void a(ra $$0) {
      this.d.add($$0);
   }

   public void a(ht $$0, int $$1) {
      this.p = rm.a(this.t(), $$0, this.u(), $$1, this.c, false);
      this.b = this.p.p();
      this.p.a(this.c());
      rm.a(this.b, new ht(1, 0, -1), this.u(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void o() {
      if (this.p == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dwn $$0 = rm.b(this.p);
         rm.a($$0, this.b.v(), this.c);
      }
   }

   long p() {
      return this.i;
   }

   rd q() {
      rd $$0 = new rd(this);
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

   public dbf u() {
      return this.n;
   }

   public rq v() {
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
