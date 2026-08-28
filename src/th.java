import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class th {
   private final ub a;
   @Nullable
   private jh b;
   @Nullable
   private jh c;
   private final arx d;
   private final Collection<ti> e = Lists.newArrayList();
   private final int f;
   private final Collection<tl> g = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> h = new Object2LongOpenHashMap();
   private long i;
   private int j = 20;
   private boolean k;
   private boolean l;
   private long m;
   private boolean n;
   private final tu o;
   private final Stopwatch p = Stopwatch.createUnstarted();
   private boolean q;
   private final dqv r;
   @Nullable
   private Throwable s;
   @Nullable
   private dwi t;

   public th(ub $$0, dqv $$1, arx $$2, tu $$3) {
      this.a = $$0;
      this.d = $$2;
      this.o = $$3;
      this.f = $$0.f();
      this.r = $$0.e().a($$1);
   }

   void a(jh $$0) {
      this.b = $$0;
   }

   public th a(int $$0) {
      this.i = this.d.ad() + this.a.g() + (long)$$0;
      this.p.start();
      return this;
   }

   public th a() {
      if (this.k) {
         return this;
      } else {
         this.j = 0;
         this.k = true;
         dwi $$0 = this.f();
         $$0.c(this.d);
         env $$1 = tx.b($$0);
         this.d.n().a($$1);
         this.d.a($$1);
         return this;
      }
   }

   private boolean E() {
      if (this.k) {
         return true;
      } else if (this.j > 0) {
         this.j--;
         return false;
      } else {
         this.a().a(0);
         return true;
      }
   }

   public void a(tk $$0) {
      if (!this.k()) {
         if (this.t == null) {
            this.a(new IllegalStateException("Running test without structure block entity"));
         }

         if (this.l || tx.b(this.t).b().allMatch($$0x -> this.d.f($$0x.l()))) {
            this.l = true;
            if (this.E()) {
               this.F();
               if (this.k()) {
                  if (this.s != null) {
                     this.e.forEach($$1 -> $$1.b(this, $$0));
                  } else {
                     this.e.forEach($$1 -> $$1.a(this, $$0));
                  }
               }
            }
         }
      }
   }

   private void F() {
      this.m = this.d.ad() - this.i;
      if (this.m >= 0L) {
         if (!this.n) {
            this.G();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.h.object2LongEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry<Runnable>)$$0.next();
            if ($$1.getLongValue() <= this.m) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (Exception var4) {
                  this.a(var4);
               }

               $$0.remove();
            }
         }

         if (this.m > (long)this.f) {
            if (this.g.isEmpty()) {
               this.a(new to("Didn't succeed or fail within " + this.a.f() + " ticks"));
            } else {
               this.g.forEach($$0x -> $$0x.b(this.m));
               if (this.s == null) {
                  this.a(new to("No sequences finished"));
               }
            }
         } else {
            this.g.forEach($$0x -> $$0x.a(this.m));
         }
      }
   }

   private void G() {
      if (!this.n) {
         this.n = true;

         try {
            this.a.a(new tg(this));
         } catch (Exception var2) {
            this.a(var2);
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.h.put($$1, $$0);
   }

   public String b() {
      return this.a.c();
   }

   @Nullable
   public jh c() {
      return this.b;
   }

   public jh d() {
      return tx.c(this.t);
   }

   public fbm e() {
      dwi $$0 = this.f();
      return tx.a($$0);
   }

   public dwi f() {
      if (this.t == null) {
         if (this.b == null) {
            throw new IllegalStateException("Could not find a structureBlockEntity for this GameTestInfo");
         }

         this.t = (dwi)this.d.c_(this.b);
         if (this.t == null) {
            throw new IllegalStateException("Could not find a structureBlockEntity at the given coordinate " + this.b);
         }
      }

      return this.t;
   }

   public arx g() {
      return this.d;
   }

   public boolean h() {
      return this.q && this.s == null;
   }

   public boolean i() {
      return this.s != null;
   }

   public boolean j() {
      return this.n;
   }

   public boolean k() {
      return this.q;
   }

   public long l() {
      return this.p.elapsed(TimeUnit.MILLISECONDS);
   }

   private void H() {
      if (!this.q) {
         this.q = true;
         if (this.p.isRunning()) {
            this.p.stop();
         }
      }
   }

   public void m() {
      if (this.s == null) {
         this.H();
         fbm $$0 = this.e();
         List<bvb> $$1 = this.g().a(bvb.class, $$0.g(1.0), $$0x -> !($$0x instanceof cpo));
         $$1.forEach($$0x -> $$0x.a(bvb.d.b));
      }
   }

   public void a(Throwable $$0) {
      this.s = $$0;
      this.H();
   }

   @Nullable
   public Throwable n() {
      return this.s;
   }

   @Override
   public String toString() {
      return this.b();
   }

   public void a(ti $$0) {
      this.e.add($$0);
   }

   public th o() {
      jh $$0 = this.D();
      this.t = tx.b(this, $$0, this.u(), this.d);
      this.b = this.t.aB_();
      tx.a(this.b, new jh(1, 0, -1), this.u(), this.d);
      tx.a(this.e(), this.d, !this.a.l());
      this.e.forEach($$0x -> $$0x.a(this));
      return this;
   }

   long p() {
      return this.m;
   }

   tl q() {
      tl $$0 = new tl(this);
      this.g.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.h();
   }

   public boolean s() {
      return !this.a.h();
   }

   public String t() {
      return this.a.d();
   }

   public dqv u() {
      return this.r;
   }

   public ub v() {
      return this.a;
   }

   public int w() {
      return this.f;
   }

   public boolean x() {
      return this.a.a();
   }

   public int y() {
      return this.a.j();
   }

   public int z() {
      return this.a.k();
   }

   public tu A() {
      return this.o;
   }

   public Stream<ti> B() {
      return this.e.stream();
   }

   public th C() {
      th $$0 = new th(this.a, this.r, this.d, this.A());
      if (this.c != null) {
         $$0.b(this.c);
      }

      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }

   public jh D() {
      if (this.c == null) {
         env $$0 = tx.b(this.f());
         this.c = new jh($$0.h(), $$0.i(), $$0.j());
      }

      return this.c;
   }

   public void b(jh $$0) {
      this.c = $$0;
   }
}
