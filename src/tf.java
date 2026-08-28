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

public class tf {
   private final tz a;
   @Nullable
   private jh b;
   @Nullable
   private jh c;
   private final arn d;
   private final Collection<tg> e = Lists.newArrayList();
   private final int f;
   private final Collection<tj> g = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> h = new Object2LongOpenHashMap();
   private long i;
   private int j = 20;
   private boolean k;
   private boolean l;
   private long m;
   private boolean n;
   private final ts o;
   private final Stopwatch p = Stopwatch.createUnstarted();
   private boolean q;
   private final dor r;
   @Nullable
   private Throwable s;
   @Nullable
   private dud t;

   public tf(tz $$0, dor $$1, arn $$2, ts $$3) {
      this.a = $$0;
      this.d = $$2;
      this.o = $$3;
      this.f = $$0.f();
      this.r = $$0.e().a($$1);
   }

   void a(jh $$0) {
      this.b = $$0;
   }

   public tf a(int $$0) {
      this.i = this.d.aa() + this.a.g() + (long)$$0;
      this.p.start();
      return this;
   }

   public tf a() {
      if (this.k) {
         return this;
      } else {
         this.j = 0;
         this.k = true;
         dud $$0 = this.e();
         $$0.c(this.d);
         elp $$1 = tv.b($$0);
         this.d.m().a($$1);
         this.d.a($$1);
         return this;
      }
   }

   private boolean D() {
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

   public void a(ti $$0) {
      if (!this.j()) {
         if (this.t == null) {
            this.a(new IllegalStateException("Running test without structure block entity"));
         }

         if (this.l || tv.b(this.t).b().allMatch($$0x -> this.d.f($$0x.l()))) {
            this.l = true;
            if (this.D()) {
               this.E();
               if (this.j()) {
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

   private void E() {
      this.m = this.d.aa() - this.i;
      if (this.m >= 0L) {
         if (!this.n) {
            this.F();
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
               this.a(new tm("Didn't succeed or fail within " + this.a.f() + " ticks"));
            } else {
               this.g.forEach($$0x -> $$0x.b(this.m));
               if (this.s == null) {
                  this.a(new tm("No sequences finished"));
               }
            }
         } else {
            this.g.forEach($$0x -> $$0x.a(this.m));
         }
      }
   }

   private void F() {
      if (!this.n) {
         this.n = true;

         try {
            this.a.a(new te(this));
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

   public ezi d() {
      dud $$0 = this.e();
      return tv.a($$0);
   }

   public dud e() {
      if (this.t == null) {
         if (this.b == null) {
            throw new IllegalStateException("Could not find a structureBlockEntity for this GameTestInfo");
         }

         this.t = (dud)this.d.c_(this.b);
         if (this.t == null) {
            throw new IllegalStateException("Could not find a structureBlockEntity at the given coordinate " + this.b);
         }
      }

      return this.t;
   }

   public arn f() {
      return this.d;
   }

   public boolean g() {
      return this.q && this.s == null;
   }

   public boolean h() {
      return this.s != null;
   }

   public boolean i() {
      return this.n;
   }

   public boolean j() {
      return this.q;
   }

   public long k() {
      return this.p.elapsed(TimeUnit.MILLISECONDS);
   }

   private void G() {
      if (!this.q) {
         this.q = true;
         if (this.p.isRunning()) {
            this.p.stop();
         }
      }
   }

   public void l() {
      if (this.s == null) {
         this.G();
         ezi $$0 = this.d();
         List<bue> $$1 = this.f().a(bue.class, $$0.g(1.0), $$0x -> !($$0x instanceof com));
         $$1.forEach($$0x -> $$0x.a(bue.c.b));
      }
   }

   public void a(Throwable $$0) {
      this.s = $$0;
      this.G();
   }

   @Nullable
   public Throwable m() {
      return this.s;
   }

   @Override
   public String toString() {
      return this.b();
   }

   public void a(tg $$0) {
      this.e.add($$0);
   }

   public tf n() {
      jh $$0 = this.C();
      this.t = tv.b(this, $$0, this.t(), this.d);
      this.b = this.t.aB_();
      tv.a(this.b, new jh(1, 0, -1), this.t(), this.d);
      tv.a(this.d(), this.d, !this.a.l());
      this.e.forEach($$0x -> $$0x.a(this));
      return this;
   }

   long o() {
      return this.m;
   }

   tj p() {
      tj $$0 = new tj(this);
      this.g.add($$0);
      return $$0;
   }

   public boolean q() {
      return this.a.h();
   }

   public boolean r() {
      return !this.a.h();
   }

   public String s() {
      return this.a.d();
   }

   public dor t() {
      return this.r;
   }

   public tz u() {
      return this.a;
   }

   public int v() {
      return this.f;
   }

   public boolean w() {
      return this.a.a();
   }

   public int x() {
      return this.a.j();
   }

   public int y() {
      return this.a.k();
   }

   public ts z() {
      return this.o;
   }

   public Stream<tg> A() {
      return this.e.stream();
   }

   public tf B() {
      tf $$0 = new tf(this.a, this.r, this.d, this.z());
      if (this.c != null) {
         $$0.b(this.c);
      }

      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }

   public jh C() {
      if (this.c == null) {
         elp $$0 = tv.b(this.e());
         this.c = new jh($$0.h(), $$0.i(), $$0.j());
      }

      return this.c;
   }

   public void b(jh $$0) {
      this.c = $$0;
   }
}
