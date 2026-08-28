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

public class sq {
   private final jf.c<sr> a;
   @Nullable
   private iv b;
   private final ars c;
   private final Collection<st> d = Lists.newArrayList();
   private final int e;
   private final Collection<sw> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private boolean h;
   private boolean i;
   private int j;
   private boolean k;
   private final tg l;
   private final Stopwatch m = Stopwatch.createUnstarted();
   private boolean n;
   private final dtw o;
   @Nullable
   private so p;
   @Nullable
   private dzx q;

   public sq(jf.c<sr> $$0, dtw $$1, ars $$2, tg $$3) {
      this.a = $$0;
      this.c = $$2;
      this.l = $$3;
      this.e = $$0.a().f();
      this.o = $$1;
   }

   public void a(@Nullable iv $$0) {
      this.b = $$0;
   }

   public sq a(int $$0) {
      this.j = -(this.a.a().g() + $$0 + 1);
      return this;
   }

   public void a() {
      if (!this.h) {
         dzx $$0 = this.f();
         if (!$$0.A()) {
            this.a(xa.a("test.error.structure.failure", $$0.k().getString()));
         }

         this.h = true;
         $$0.C();
         ert $$1 = $$0.d();
         this.c.n().a($$1);
         this.c.a($$1);
         this.d.forEach($$0x -> $$0x.a(this));
      }
   }

   public void a(sv $$0) {
      if (!this.k()) {
         if (!this.h) {
            this.a(xa.c("test.error.ticking_without_structure"));
         }

         if (this.q == null) {
            this.a(xa.c("test.error.missing_block_entity"));
         }

         if (this.p != null) {
            this.G();
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
               } catch (so var4) {
                  this.a(var4);
               } catch (Exception var5) {
                  this.a(new tr(var5));
               }

               $$0.remove();
            }
         }

         if (this.j > this.e) {
            if (this.f.isEmpty()) {
               this.a(new sz(xa.a("test.error.timeout.no_result", this.a.a().f())));
            } else {
               this.f.forEach($$0x -> $$0x.c(this.j));
               if (this.p == null) {
                  this.a(new sz(xa.a("test.error.timeout.no_sequences_finished", this.a.a().f())));
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
            this.a.a().a(new sp(this));
         } catch (so var2) {
            this.a(var2);
         } catch (Exception var3) {
            this.a(new tr(var3));
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public ali b() {
      return this.a.h().a();
   }

   @Nullable
   public iv c() {
      return this.b;
   }

   public iv d() {
      return this.q.B();
   }

   public ffl e() {
      dzx $$0 = this.f();
      return $$0.f();
   }

   public dzx f() {
      if (this.q == null) {
         if (this.b == null) {
            throw new IllegalStateException("This GameTestInfo has no position");
         }

         if (this.c.c_(this.b) instanceof dzx $$0) {
            this.q = $$0;
         }

         if (this.q == null) {
            throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + this.b);
         }
      }

      return this.q;
   }

   public ars g() {
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
         ffl $$0 = this.e();
         List<bwt> $$1 = this.g().a(bwt.class, $$0.g(1.0), $$0x -> !($$0x instanceof crx));
         $$1.forEach($$0x -> $$0x.a(bwt.d.b));
      }
   }

   public void a(xa $$0) {
      this.a(new sh($$0, this.j));
   }

   public void a(so $$0) {
      this.p = $$0;
   }

   @Nullable
   public so n() {
      return this.p;
   }

   @Override
   public String toString() {
      return this.b().toString();
   }

   public void a(st $$0) {
      this.d.add($$0);
   }

   public sq o() {
      this.q = this.a(Objects.requireNonNull(this.b), this.o, this.c);
      this.a();
      return this;
   }

   private dzx a(iv $$0, dtw $$1, ars $$2) {
      $$2.b($$0, dne.pJ.m());
      dzx $$3 = Objects.requireNonNull((dzx)$$2.c_($$0));
      alh<sr> $$4 = this.w().h();
      ka $$5 = dzx.a($$2, $$4).orElse(new ka(1, 1, 1));
      $$3.a(new dzx.a(Optional.of($$4), $$5, $$1, false, dzx.b.a, Optional.empty()));
      return $$3;
   }

   int p() {
      return this.j;
   }

   sw q() {
      sw $$0 = new sw(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.a().h();
   }

   public boolean s() {
      return !this.a.a().h();
   }

   public ali t() {
      return this.a.a().e();
   }

   public dtw u() {
      return this.a.a().n().f().a(this.o);
   }

   public sr v() {
      return this.a.a();
   }

   public jf.c<sr> w() {
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

   public tg B() {
      return this.l;
   }

   public Stream<st> C() {
      return this.d.stream();
   }

   public sq D() {
      sq $$0 = new sq(this.a, this.o, this.c, this.B());
      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }
}
