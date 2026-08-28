import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.primitives.Doubles;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gkd {
   private static final int a = 2;
   private final PriorityBlockingQueue<gkd.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<gkd.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final ghh f;
   private final ghi g;
   private volatile int h;
   private volatile boolean i;
   private final bqd<Runnable> j;
   private final Executor k;
   gax l;
   final ggr m;
   private eye n = eye.c;
   final gkc o;

   public gkd(gax $$0, ggr $$1, Executor $$2, ghc $$3, ghu $$4, gjb $$5) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bqd.a($$2, "Section Renderer");
      this.j.a(this::j);
      this.o = new gkc($$4, $$5);
   }

   public void a(gax $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         gkd.b.a $$0 = this.k();
         if ($$0 != null) {
            ghh $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ad.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  fib.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == gkd.c.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.g.a($$1);
                     this.j();
                  });
               }
            });
         }
      }
   }

   @Nullable
   private gkd.b.a k() {
      if (this.d <= 0) {
         gkd.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      gkd.b.a $$1 = this.b.poll();
      if ($$1 != null) {
         this.d--;
         return $$1;
      } else {
         this.d = 2;
         return this.c.poll();
      }
   }

   public String a() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.h, this.e.size(), this.g.c());
   }

   public int b() {
      return this.h;
   }

   public int c() {
      return this.e.size();
   }

   public int d() {
      return this.g.c();
   }

   public void a(eye $$0) {
      this.n = $$0;
   }

   public eye e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gkd.b $$0, gkb $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(gkd.b.a $$0) {
      if (!this.i) {
         this.j.a(() -> {
            if (!this.i) {
               if ($$0.c) {
                  this.b.offer($$0);
               } else {
                  this.c.offer($$0);
               }

               this.h = this.b.size() + this.c.size();
               this.j();
            }
         });
      }
   }

   public CompletableFuture<Void> a(fct $$0, fcx $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fcx.b();
         }
      }, this.e::add);
   }

   public CompletableFuture<Void> a(fcr.a $$0, fcx $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fcx.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         gkd.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         gkd.b.a $$1 = this.c.poll();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.h = 0;
   }

   public boolean h() {
      return this.h == 0 && this.e.isEmpty();
   }

   public void i() {
      this.i = true;
      this.l();
      this.f();
   }

   public static class a {
      public static final gkd.a a = new gkd.a() {
         @Override
         public boolean a(jj $$0, jj $$1) {
            return false;
         }
      };
      public static final gkd.a b = new gkd.a() {
         @Override
         public boolean a(jj $$0, jj $$1) {
            return true;
         }
      };
      final Set<ghe> c = new ObjectArraySet(ghe.M().size());
      final List<dre> d = Lists.newArrayList();
      gkf e = new gkf();
      @Nullable
      fct.b f;

      public boolean a() {
         return this.c.isEmpty();
      }

      public boolean a(ghe $$0) {
         return !this.c.contains($$0);
      }

      public List<dre> b() {
         return this.d;
      }

      public boolean a(jj $$0, jj $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gkd.a> c = new AtomicReference<>(gkd.a.a);
      private final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private gkd.b.b f;
      @Nullable
      private gkd.b.c g;
      private final Set<dre> h = Sets.newHashSet();
      private final Map<ghe, fcx> i = ghe.M().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fcx(fcx.a.a)));
      private exz j;
      private boolean k = true;
      final je.a l = new je.a(-1, -1, -1);
      private final je.a[] m = ad.a(new je.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new je.a();
         }
      });
      private boolean n;

      public b(final int $$1, final int $$2, final int $$3, final int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(je $$0) {
         return gkd.this.l.a(kg.a($$0.u()), kg.a($$0.w()), dwx.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[jj.e.ordinal()]) && this.a(this.m[jj.c.ordinal()]) && this.a(this.m[jj.f.ordinal()]) && this.a(this.m[jj.d.ordinal()]);
      }

      public exz b() {
         return this.j;
      }

      public fcx a(ghe $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new exz((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (jj $$3 : jj.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         fhk $$0 = fib.Q().j.l();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gkd.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(gkd.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(fcx::close);
      }

      public je f() {
         return this.l;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.k;
         this.k = true;
         this.n = $$0 | ($$1 && this.n);
      }

      public void g() {
         this.k = false;
         this.n = false;
      }

      public boolean h() {
         return this.k;
      }

      public boolean i() {
         return this.k && this.n;
      }

      public je a(jj $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(ghe $$0, gkd $$1) {
         gkd.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.c.contains($$0)) {
            return false;
         } else {
            this.g = new gkd.b.c(this.c(), $$2);
            $$1.a(this.g);
            return true;
         }
      }

      protected boolean j() {
         boolean $$0 = false;
         if (this.f != null) {
            this.f.a();
            this.f = null;
            $$0 = true;
         }

         if (this.g != null) {
            this.g.a();
            this.g = null;
         }

         return $$0;
      }

      public gkd.b.a a(gkb $$0) {
         boolean $$1 = this.j();
         gka $$2 = $$0.a(gkd.this.l, kg.a(this.l));
         boolean $$3 = this.c.get() == gkd.a.a;
         if ($$3 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new gkd.b.b(this.c(), $$2, !$$3 || this.e.get() > 2);
         return this.f;
      }

      public void a(gkd $$0, gkb $$1) {
         gkd.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dre> $$0) {
         Set<dre> $$1 = Sets.newHashSet($$0);
         Set<dre> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gkd.this.m.a($$2, $$1);
      }

      public void b(gkb $$0) {
         gkd.b.a $$1 = this.a($$0);
         $$1.a(gkd.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         je $$3 = this.f();
         return $$0 == kg.a($$3.u()) || $$2 == kg.a($$3.w()) || $$1 == kg.a($$3.v());
      }

      void a(gkd.a $$0) {
         this.c.set($$0);
         this.e.set(0);
         gkd.this.m.a(this);
      }

      fdc l() {
         eye $$0 = gkd.this.e();
         return fdc.a((float)($$0.d - (double)this.l.u()), (float)($$0.e - (double)this.l.v()), (float)($$0.f - (double)this.l.w()));
      }

      abstract class a implements Comparable<gkd.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final double $$0, final boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<gkd.c> a(ghh var1);

         public abstract void a();

         protected abstract String b();

         public int a(gkd.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends gkd.b.a {
         @Nullable
         protected gka d;

         public b(final double $$0, @Nullable final gka $$1, final boolean $$2) {
            super($$0, $$2);
            this.d = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gkd.c> a(ghh $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gkd.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gkd.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gkd.c.b);
            } else {
               gka $$1 = this.d;
               this.d = null;
               if ($$1 == null) {
                  b.this.a(gkd.a.b);
                  return CompletableFuture.completedFuture(gkd.c.a);
               } else {
                  kg $$2 = kg.a(b.this.l);
                  gkc.a $$3 = gkd.this.o.a($$2, $$1, b.this.l(), $$0);
                  b.this.a($$3.a);
                  if (this.b.get()) {
                     $$3.a();
                     return CompletableFuture.completedFuture(gkd.c.b);
                  } else {
                     gkd.a $$4 = new gkd.a();
                     $$4.e = $$3.d;
                     $$4.d.addAll($$3.b);
                     $$4.f = $$3.e;
                     List<CompletableFuture<Void>> $$5 = new ArrayList<>($$3.c.size());
                     $$3.c.forEach(($$2x, $$3x) -> {
                        $$5.add(gkd.this.a($$3x, b.this.a($$2x)));
                        $$4.c.add($$2x);
                     });
                     return ad.e($$5).handle(($$1x, $$2x) -> {
                        if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                           fib.Q().a(o.a($$2x, "Rendering section"));
                        }

                        if (this.b.get()) {
                           return gkd.c.b;
                        } else {
                           b.this.a($$4);
                           return gkd.c.a;
                        }
                     });
                  }
               }
            }
         }

         @Override
         public void a() {
            this.d = null;
            if (this.b.compareAndSet(false, true)) {
               b.this.a(false);
            }
         }
      }

      class c extends gkd.b.a {
         private final gkd.a e;

         public c(final double $$0, final gkd.a $$1) {
            super($$0, true);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gkd.c> a(ghh $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gkd.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(gkd.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gkd.c.b);
            } else {
               fct.b $$1 = this.e.f;
               if ($$1 != null && !this.e.a(ghe.f())) {
                  fdc $$2 = b.this.l();
                  fcr.a $$3 = $$1.a($$0.a(ghe.f()), $$2);
                  if ($$3 == null) {
                     return CompletableFuture.completedFuture(gkd.c.b);
                  } else if (this.b.get()) {
                     $$3.close();
                     return CompletableFuture.completedFuture(gkd.c.b);
                  } else {
                     CompletableFuture<gkd.c> $$4 = gkd.this.a($$3, b.this.a(ghe.f())).thenApply($$0x -> gkd.c.b);
                     return $$4.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           fib.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? gkd.c.b : gkd.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(gkd.c.b);
               }
            }
         }

         @Override
         public void a() {
            this.b.set(true);
         }
      }
   }

   static enum c {
      a,
      b;
   }
}
