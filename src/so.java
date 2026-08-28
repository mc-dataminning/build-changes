import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class so {
   private final js.c<sp> a;
   @Nullable
   private jj b;
   private final arn c;
   private final Collection<sr> d = Lists.newArrayList();
   private final int e;
   private final Collection<su> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private boolean h;
   private boolean i;
   private int j;
   private boolean k;
   private final te l;
   private final Stopwatch m = Stopwatch.createUnstarted();
   private boolean n;
   private final drm o;
   @Nullable
   private Throwable p;
   @Nullable
   private dxg q;

   public so(js.c<sp> $$0, drm $$1, arn $$2, te $$3) {
      this.a = $$0;
      this.c = $$2;
      this.l = $$3;
      this.e = $$0.a().f();
      this.o = $$1;
   }

   public void a(@Nullable jj $$0) {
      this.b = $$0;
   }

   public so a(int $$0) {
      this.j = -(this.a.a().g() + $$0 + 1);
      return this;
   }

   public void a() {
      if (!this.h) {
         dxg $$0 = this.f();
         if (!$$0.A()) {
            this.a(new IllegalStateException("Failed to place test structure for " + $$0.k()));
         }

         this.h = true;
         $$0.C();
         eoy $$1 = $$0.d();
         this.c.n().a($$1);
         this.c.a($$1);
         this.d.forEach($$0x -> $$0x.a(this));
      }
   }

   public void a(st $$0) {
      if (!this.k()) {
         if (!this.h) {
            this.a(new IllegalStateException("Ticking test before placing structure"));
         }

         if (this.q == null) {
            this.a(new IllegalStateException("Running test without structure block entity"));
         }

         if (this.i || this.q.d().b().allMatch(this.c::a)) {
            this.i = true;
            this.E();
            if (this.k()) {
               if (this.p != null) {
                  this.d.forEach($$1 -> $$1.b(this, $$0));
               } else {
                  this.d.forEach($$1 -> $$1.a(this, $$0));
               }
            }
         }
      }
   }

   private void E() {
      this.j++;
      if (this.j >= 0) {
         if (!this.k) {
            this.F();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.g.object2LongEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry<Runnable>)$$0.next();
            if ($$1.getLongValue() <= (long)this.j) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (Exception var4) {
                  this.a(var4);
               }

               $$0.remove();
            }
         }

         if (this.j > this.e) {
            if (this.f.isEmpty()) {
               this.a(new sx("Didn't succeed or fail within " + this.a.a().f() + " ticks"));
            } else {
               this.f.forEach($$0x -> $$0x.c(this.j));
               if (this.p == null) {
                  this.a(new sx("No sequences finished"));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.b(this.j));
         }
      }
   }

   private void F() {
      if (!this.k) {
         this.k = true;
         this.f().x();

         try {
            this.a.a().a(new sn(this));
         } catch (Exception var2) {
            this.a(var2);
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public ald b() {
      return this.a.h().a();
   }

   @Nullable
   public jj c() {
      return this.b;
   }

   public jj d() {
      return this.q.B();
   }

   public fcp e() {
      dxg $$0 = this.f();
      return $$0.f();
   }

   public dxg f() {
      if (this.q == null) {
         if (this.b == null) {
            throw new IllegalStateException("This GameTestInfo has no position");
         }

         if (this.c.c_(this.b) instanceof dxg $$0) {
            this.q = $$0;
         }

         if (this.q == null) {
            throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + this.b);
         }
      }

      return this.q;
   }

   public arn g() {
      return this.c;
   }

   public boolean h() {
      return this.n && this.p == null;
   }

   public boolean i() {
      return this.p != null;
   }

   public boolean j() {
      return this.k;
   }

   public boolean k() {
      return this.n;
   }

   public long l() {
      return this.m.elapsed(TimeUnit.MILLISECONDS);
   }

   private void G() {
      if (!this.n) {
         this.n = true;
         if (this.m.isRunning()) {
            this.m.stop();
         }
      }
   }

   public void m() {
      if (this.p == null) {
         this.G();
         fcp $$0 = this.e();
         List<bvs> $$1 = this.g().a(bvs.class, $$0.g(1.0), $$0x -> !($$0x instanceof cqi));
         $$1.forEach($$0x -> $$0x.a(bvs.e.b));
      }
   }

   public void a(Throwable $$0) {
      this.p = $$0;
      this.G();
   }

   @Nullable
   public Throwable n() {
      return this.p;
   }

   @Override
   public String toString() {
      return this.b().toString();
   }

   public void a(sr $$0) {
      this.d.add($$0);
   }

   public so o() {
      this.q = this.a(Objects.requireNonNull(this.b), this.o, this.c);
      this.a();
      return this;
   }

   private dxg a(jj $$0, drm $$1, arn $$2) {
      $$2.b($$0, dkw.pF.m());
      dxg $$3 = Objects.requireNonNull((dxg)$$2.c_($$0));
      alc<sp> $$4 = this.w().h();
      kn $$5 = dxg.a($$2, $$4).orElse(new kn(1, 1, 1));
      $$3.a(new dxg.a(Optional.of($$4), $$5, $$1, false, dxg.b.a, Optional.empty()));
      return $$3;
   }

   int p() {
      return this.j;
   }

   su q() {
      su $$0 = new su(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.a().h();
   }

   public boolean s() {
      return !this.a.a().h();
   }

   public ald t() {
      return this.a.a().e();
   }

   public drm u() {
      return this.a.a().n().f().a(this.o);
   }

   public sp v() {
      return this.a.a();
   }

   public js.c<sp> w() {
      return this.a;
   }

   public int x() {
      return this.e;
   }

   public boolean y() {
      return this.a.a().j() > 1;
   }

   public int z() {
      return this.a.a().j();
   }

   public int A() {
      return this.a.a().k();
   }

   public te B() {
      return this.l;
   }

   public Stream<sr> C() {
      return this.d.stream();
   }

   public so D() {
      so $$0 = new so(this.a, this.o, this.c, this.B());
      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }
}
