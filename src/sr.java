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

public class sr {
   private final jg.c<ss> a;
   @Nullable
   private iw b;
   private final aru c;
   private final Collection<su> d = Lists.newArrayList();
   private final int e;
   private final Collection<sx> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private boolean h;
   private boolean i;
   private int j;
   private boolean k;
   private final th l;
   private final Stopwatch m = Stopwatch.createUnstarted();
   private boolean n;
   private final dty o;
   @Nullable
   private sp p;
   @Nullable
   private dzz q;

   public sr(jg.c<ss> $$0, dty $$1, aru $$2, th $$3) {
      this.a = $$0;
      this.c = $$2;
      this.l = $$3;
      this.e = $$0.a().f();
      this.o = $$1;
   }

   public void a(@Nullable iw $$0) {
      this.b = $$0;
   }

   public sr a(int $$0) {
      this.j = -(this.a.a().g() + $$0 + 1);
      return this;
   }

   public void a() {
      if (!this.h) {
         dzz $$0 = this.f();
         if (!$$0.A()) {
            this.a(xc.a("test.error.structure.failure", $$0.k().getString()));
         }

         this.h = true;
         $$0.C();
         erv $$1 = $$0.d();
         this.c.n().a($$1);
         this.c.a($$1);
         this.d.forEach($$0x -> $$0x.a(this));
      }
   }

   public void a(sw $$0) {
      if (!this.k()) {
         if (!this.h) {
            this.a(xc.c("test.error.ticking_without_structure"));
         }

         if (this.q == null) {
            this.a(xc.c("test.error.missing_block_entity"));
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
               } catch (sp var4) {
                  this.a(var4);
               } catch (Exception var5) {
                  this.a(new ts(var5));
               }

               $$0.remove();
            }
         }

         if (this.j > this.e) {
            if (this.f.isEmpty()) {
               this.a(new ta(xc.a("test.error.timeout.no_result", this.a.a().f())));
            } else {
               this.f.forEach($$0x -> $$0x.c(this.j));
               if (this.p == null) {
                  this.a(new ta(xc.a("test.error.timeout.no_sequences_finished", this.a.a().f())));
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
            this.a.a().a(new sq(this));
         } catch (sp var2) {
            this.a(var2);
         } catch (Exception var3) {
            this.a(new ts(var3));
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public alk b() {
      return this.a.h().a();
   }

   @Nullable
   public iw c() {
      return this.b;
   }

   public iw d() {
      return this.q.B();
   }

   public ffn e() {
      dzz $$0 = this.f();
      return $$0.f();
   }

   public dzz f() {
      if (this.q == null) {
         if (this.b == null) {
            throw new IllegalStateException("This GameTestInfo has no position");
         }

         if (this.c.c_(this.b) instanceof dzz $$0) {
            this.q = $$0;
         }

         if (this.q == null) {
            throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + this.b);
         }
      }

      return this.q;
   }

   public aru g() {
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
         ffn $$0 = this.e();
         List<bwv> $$1 = this.g().a(bwv.class, $$0.g(1.0), $$0x -> !($$0x instanceof crz));
         $$1.forEach($$0x -> $$0x.a(bwv.d.b));
      }
   }

   public void a(xc $$0) {
      this.a(new si($$0, this.j));
   }

   public void a(sp $$0) {
      this.p = $$0;
   }

   @Nullable
   public sp n() {
      return this.p;
   }

   @Override
   public String toString() {
      return this.b().toString();
   }

   public void a(su $$0) {
      this.d.add($$0);
   }

   public sr o() {
      this.q = this.a(Objects.requireNonNull(this.b), this.o, this.c);
      this.a();
      return this;
   }

   private dzz a(iw $$0, dty $$1, aru $$2) {
      $$2.b($$0, dng.pJ.m());
      dzz $$3 = Objects.requireNonNull((dzz)$$2.c_($$0));
      alj<ss> $$4 = this.w().h();
      kb $$5 = dzz.a($$2, $$4).orElse(new kb(1, 1, 1));
      $$3.a(new dzz.a(Optional.of($$4), $$5, $$1, false, dzz.b.a, Optional.empty()));
      return $$3;
   }

   int p() {
      return this.j;
   }

   sx q() {
      sx $$0 = new sx(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.a().h();
   }

   public boolean s() {
      return !this.a.a().h();
   }

   public alk t() {
      return this.a.a().e();
   }

   public dty u() {
      return this.a.a().n().f().a(this.o);
   }

   public ss v() {
      return this.a.a();
   }

   public jg.c<ss> w() {
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

   public th B() {
      return this.l;
   }

   public Stream<su> C() {
      return this.d.stream();
   }

   public sr D() {
      sr $$0 = new sr(this.a, this.o, this.c, this.B());
      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }
}
