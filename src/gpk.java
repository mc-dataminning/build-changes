import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gpk {
   private final gpf a = new gpf();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gmk c;
   private final gml d;
   private volatile int e;
   private volatile boolean f;
   private final bqz g;
   private final ae h;
   gfy i;
   final glt j;
   private fba k = fba.c;
   final gpj l;

   public gpk(gfy $$0, glt $$1, ae $$2, gmf $$3, gnb $$4, goh $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bqz($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gpj($$4, $$5);
   }

   public void a(gfy $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gpk.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gmk $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gpk.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  flj.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gpk.c.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.d.a($$1);
                     this.j();
                  });
               }
            });
         }
      }
   }

   public String a() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.e, this.b.size(), this.d.c());
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.b.size();
   }

   public int d() {
      return this.d.c();
   }

   public void a(fba $$0) {
      this.k = $$0;
   }

   public fba e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gpk.b $$0, gpi $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gpk.b.a $$0) {
      if (!this.f) {
         this.g.a_(() -> {
            if (!this.f) {
               this.a.a($$0);
               this.e = this.a.a();
               this.j();
            }
         });
      }
   }

   public CompletableFuture<Void> a(fft $$0, ffx $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (box $$2 = bor.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               ffx.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(ffr.a $$0, ffx $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (box $$2 = bor.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               ffx.b();
            }
         }
      }, this.b::add);
   }

   private void k() {
      this.a.b();
      this.e = 0;
   }

   public boolean h() {
      return this.e == 0 && this.b.isEmpty();
   }

   public void i() {
      this.f = true;
      this.k();
      this.f();
   }

   public static class a {
      public static final gpk.a a = new gpk.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return false;
         }
      };
      public static final gpk.a b = new gpk.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return true;
         }
      };
      final Set<gmh> c = new ObjectArraySet(gmh.Q().size());
      final List<dtz> d = Lists.newArrayList();
      gpm e = new gpm();
      @Nullable
      fft.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gmh $$0) {
         return !this.c.contains($$0);
      }

      public List<dtz> b() {
         return this.d;
      }

      public boolean a(jn $$0, jn $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gpk.a> c = new AtomicReference<>(gpk.a.a);
      public final AtomicReference<gpk.d> d = new AtomicReference<>(null);
      @Nullable
      private gpk.b.b f;
      @Nullable
      private gpk.b.c g;
      private final Set<dtz> h = Sets.newHashSet();
      private final Map<gmh, ffx> i = gmh.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new ffx(fdo.b)));
      private fav j;
      private boolean k = true;
      long l = kk.b(-1, -1, -1);
      final ji.a m = new ji.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         dys $$1 = gpk.this.i.a(kk.b($$0), kk.d($$0), dzt.n, false);
         return $$1 != null && gpk.this.i.C_().a(kk.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kk.a(this.l, jn.e))
               && this.b(kk.a(this.l, jn.c))
               && this.b(kk.a(this.l, jn.f))
               && this.b(kk.a(this.l, jn.d))
               && this.b(kk.a(this.l, -1, 0, -1))
               && this.b(kk.a(this.l, -1, 0, 1))
               && this.b(kk.a(this.l, 1, 0, -1))
               && this.b(kk.a(this.l, 1, 0, 1));
      }

      public fav b() {
         return this.j;
      }

      public ffx a(gmh $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kk.c(kk.b($$0));
         int $$2 = kk.c(kk.c($$0));
         int $$3 = kk.c(kk.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fav((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fkr $$0 = flj.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gpk.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gpk.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(ffx::close);
      }

      public ji f() {
         return this.m;
      }

      public long g() {
         return this.l;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.k;
         this.k = true;
         this.n = $$0 | ($$1 && this.n);
      }

      public void h() {
         this.k = false;
         this.n = false;
      }

      public boolean i() {
         return this.k;
      }

      public boolean j() {
         return this.k && this.n;
      }

      public long a(jn $$0) {
         return kk.a(this.l, $$0);
      }

      public void a(gpk $$0) {
         this.g = new gpk.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gmh.f());
      }

      public boolean l() {
         return this.g != null && !this.g.b.get();
      }

      protected void m() {
         if (this.f != null) {
            this.f.a();
            this.f = null;
         }

         if (this.g != null) {
            this.g.a();
            this.g = null;
         }
      }

      public gpk.b.a a(gpi $$0) {
         this.m();
         gph $$1 = $$0.a(gpk.this.i, kk.a(this.l));
         boolean $$2 = this.c.get() != gpk.a.a;
         this.f = new gpk.b.b($$1, $$2);
         return this.f;
      }

      public void a(gpk $$0, gpi $$1) {
         gpk.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dtz> $$0) {
         Set<dtz> $$1 = Sets.newHashSet($$0);
         Set<dtz> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gpk.this.j.a($$2, $$1);
      }

      public void b(gpi $$0) {
         gpk.b.a $$1 = this.a($$0);
         $$1.a(gpk.this.c);
      }

      void a(gpk.a $$0) {
         this.c.set($$0);
         gpk.this.j.a(this);
      }

      fgc o() {
         fba $$0 = gpk.this.e();
         return fgc.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gpk.c> a(gmk var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public ji d() {
            return b.this.m;
         }
      }

      class b extends gpk.b.a {
         @Nullable
         protected volatile gph e;

         public b(@Nullable final gph $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gpk.c> a(gmk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpk.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gpk.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gpk.c.b);
            } else {
               gph $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gpk.a.b);
                  return CompletableFuture.completedFuture(gpk.c.a);
               } else {
                  kk $$2 = kk.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gpk.c.b);
                  } else {
                     gpj.a $$4;
                     try (box $$3 = bor.a().d("Compile Section")) {
                        $$4 = gpk.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gpk.d $$6 = gpk.d.a(gpk.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gpk.c.b);
                     } else {
                        gpk.a $$7 = new gpk.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gpk.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return af.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              flj.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpk.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gpk.c.a;
                           }
                        });
                     }
                  }
               }
            }
         }

         @Override
         public void a() {
            this.e = null;
            if (this.a.compareAndSet(false, true)) {
               b.this.a(false);
            }
         }
      }

      class c extends gpk.b.a {
         private final gpk.a f;

         public c(final gpk.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gpk.c> a(gmk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpk.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(gpk.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gpk.c.b);
            } else {
               fft.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gmh.f())) {
                  fgc $$2 = b.this.o();
                  gpk.d $$3 = gpk.d.a(gpk.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gpk.c.b);
                  } else {
                     ffr.a $$4 = $$1.a($$0.a(gmh.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gpk.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gpk.c.b);
                     } else {
                        CompletableFuture<gpk.c> $$5 = gpk.this.a($$4, b.this.a(gmh.f())).thenApply($$0x -> gpk.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              flj.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpk.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gpk.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gpk.c.b);
               }
            }
         }

         @Override
         public void a() {
            this.a.set(true);
         }
      }
   }

   static enum c {
      a,
      b;
   }

   public static final class d {
      private int a;
      private int b;
      private int c;

      public static gpk.d a(fba $$0, long $$1) {
         return new gpk.d().b($$0, $$1);
      }

      public gpk.d b(fba $$0, long $$1) {
         this.a = a($$0.a(), kk.b($$1));
         this.b = a($$0.b(), kk.c($$1));
         this.c = a($$0.c(), kk.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = kk.b($$0) - $$1;
         return ayz.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gpk.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
