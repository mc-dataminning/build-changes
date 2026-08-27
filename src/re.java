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

public class re {
   private final ru a;
   @Nullable
   private hx b;
   private final ami c;
   private final Collection<rf> d = Lists.newArrayList();
   private final int e;
   private final Collection<ri> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private long h;
   private int i = 20;
   private boolean j;
   private boolean k;
   private long l;
   private boolean m;
   private boolean n;
   private final Stopwatch o = Stopwatch.createUnstarted();
   private boolean p;
   private final dbr q;
   @Nullable
   private Throwable r;
   @Nullable
   private dgw s;

   public re(ru $$0, dbr $$1, ami $$2) {
      this.a = $$0;
      this.c = $$2;
      this.e = $$0.c();
      this.q = $$0.g().a($$1);
   }

   void a(hx $$0) {
      this.b = $$0;
   }

   void a() {
      this.h = this.c.W() + this.a.f();
      this.o.start();
   }

   public void b() {
      if (!this.l()) {
         if (this.s == null) {
            this.a(new IllegalStateException("Running test without structure block entity"));
         }

         if (this.k || rr.b(this.s).b().allMatch($$0x -> this.c.e($$0x.l()))) {
            this.k = true;
            if (this.i > 0) {
               this.i--;
            } else {
               if (!this.j) {
                  this.j = true;
                  this.s.c(this.c);
                  dxe $$0 = rr.b(this.s);
                  this.c.l().a($$0);
                  this.c.a($$0);
                  this.a();
               }

               this.C();
               if (this.l()) {
                  if (this.r != null) {
                     this.d.forEach($$0x -> $$0x.c(this));
                  } else {
                     this.d.forEach($$0x -> $$0x.b(this));
                  }
               }
            }
         }
      }
   }

   private void C() {
      this.l = this.c.W() - this.h;
      if (this.l >= 0L) {
         if (this.l == 0L) {
            this.D();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.g.object2LongEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry<Runnable>)$$0.next();
            if ($$1.getLongValue() <= this.l) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (Exception var4) {
                  this.a(var4);
               }

               $$0.remove();
            }
         }

         if (this.l > (long)this.e) {
            if (this.f.isEmpty()) {
               this.a(new rl("Didn't succeed or fail within " + this.a.c() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.b(this.l));
               if (this.r == null) {
                  this.a(new rl("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.a(this.l));
         }
      }
   }

   private void D() {
      if (this.m) {
         throw new IllegalStateException("Test already started");
      } else {
         this.m = true;

         try {
            this.a.a(new rd(this));
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

   public hx d() {
      return this.b;
   }

   @Nullable
   public hx e() {
      dgw $$0 = this.E();
      return $$0 == null ? null : rr.c($$0);
   }

   @Nullable
   public ja f() {
      dgw $$0 = this.E();
      return $$0 == null ? null : $$0.l();
   }

   @Nullable
   public eju g() {
      dgw $$0 = this.E();
      return $$0 == null ? null : rr.a($$0);
   }

   @Nullable
   private dgw E() {
      return (dgw)this.c.c_(this.b);
   }

   public ami h() {
      return this.c;
   }

   public boolean i() {
      return this.p && this.r == null;
   }

   public boolean j() {
      return this.r != null;
   }

   public boolean k() {
      return this.m;
   }

   public boolean l() {
      return this.p;
   }

   public long m() {
      return this.o.elapsed(TimeUnit.MILLISECONDS);
   }

   private void F() {
      if (!this.p) {
         this.p = true;
         if (this.o.isRunning()) {
            this.o.stop();
         }
      }
   }

   public void n() {
      if (this.r == null) {
         this.F();
         eju $$0 = this.g();
         List<bkv> $$1 = this.h().a(bkv.class, $$0.g(1.0), $$0x -> !($$0x instanceof cdz));
         $$1.forEach($$0x -> $$0x.a(bkv.c.b));
      }
   }

   public void a(Throwable $$0) {
      this.r = $$0;
      this.F();
   }

   @Nullable
   public Throwable o() {
      return this.r;
   }

   @Override
   public String toString() {
      return this.c();
   }

   public void a(rf $$0) {
      this.d.add($$0);
   }

   public void b(hx $$0) {
      this.s = rr.a(this.u(), $$0, this.v(), this.c);
      this.b = this.s.aC_();
      this.s.a(this.u());
      rr.a(this.b, new hx(1, 0, -1), this.v(), this.c);
      this.d.forEach($$0x -> $$0x.a(this));
   }

   public void p() {
      if (this.s == null) {
         throw new IllegalStateException("Expected structure to be initialized, but it was null");
      } else {
         dxe $$0 = rr.b(this.s);
         rr.a($$0, this.c);
      }
   }

   long q() {
      return this.l;
   }

   ri r() {
      ri $$0 = new ri(this);
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

   public dbr v() {
      return this.q;
   }

   public ru w() {
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
      this.n = $$0;
   }

   public boolean B() {
      return this.n;
   }
}
