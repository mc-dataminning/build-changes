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

public class gpm {
   private final gph a = new gph();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gml c;
   private final gmm d;
   private volatile int e;
   private volatile boolean f;
   private final bra g;
   private final ae h;
   gfz i;
   final glu j;
   private fba k = fba.c;
   final gpl l;

   public gpm(gfz $$0, glu $$1, ae $$2, gmg $$3, gnc $$4, goj $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bra($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gpl($$4, $$5);
   }

   public void a(gfz $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gpm.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gml $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gpm.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  flj.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gpm.c.a) {
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

   public void a(gpm.b $$0, gpk $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gpm.b.a $$0) {
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
            try (boy $$2 = bos.a().d("Upload Section Layer")) {
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
            try (boy $$2 = bos.a().d("Upload Section Indices")) {
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
      public static final gpm.a a = new gpm.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return false;
         }
      };
      public static final gpm.a b = new gpm.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return true;
         }
      };
      final Set<gmi> c = new ObjectArraySet(gmi.Q().size());
      final List<dtz> d = Lists.newArrayList();
      gpo e = new gpo();
      @Nullable
      fft.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gmi $$0) {
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
      public final AtomicReference<gpm.a> c = new AtomicReference<>(gpm.a.a);
      public final AtomicReference<gpm.d> d = new AtomicReference<>(null);
      @Nullable
      private gpm.b.b f;
      @Nullable
      private gpm.b.c g;
      private final Set<dtz> h = Sets.newHashSet();
      private final Map<gmi, ffx> i = gmi.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new ffx(fdo.b)));
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
         dys $$1 = gpm.this.i.a(kk.b($$0), kk.d($$0), dzt.n, false);
         return $$1 != null && gpm.this.i.C_().a(kk.f($$0));
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

      public ffx a(gmi $$0) {
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

      public gpm.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gpm.a.a);
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

      public void a(gpm $$0) {
         this.g = new gpm.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gmi.f());
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

      public gpm.b.a a(gpk $$0) {
         this.m();
         gpj $$1 = $$0.a(gpm.this.i, kk.a(this.l));
         boolean $$2 = this.c.get() != gpm.a.a;
         this.f = new gpm.b.b($$1, $$2);
         return this.f;
      }

      public void a(gpm $$0, gpk $$1) {
         gpm.b.a $$2 = this.a($$1);
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

         gpm.this.j.a($$2, $$1);
      }

      public void b(gpk $$0) {
         gpm.b.a $$1 = this.a($$0);
         $$1.a(gpm.this.c);
      }

      void a(gpm.a $$0) {
         this.c.set($$0);
         gpm.this.j.a(this);
      }

      fgc o() {
         fba $$0 = gpm.this.e();
         return fgc.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gpm.c> a(gml var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public ji d() {
            return b.this.m;
         }
      }

      class b extends gpm.b.a {
         @Nullable
         protected volatile gpj e;

         public b(@Nullable final gpj $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gpm.c> a(gml $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpm.c.b);
            } else {
               gpj $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gpm.a.b);
                  return CompletableFuture.completedFuture(gpm.c.a);
               } else {
                  kk $$2 = kk.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gpm.c.b);
                  } else {
                     gpl.a $$4;
                     try (boy $$3 = bos.a().d("Compile Section")) {
                        $$4 = gpm.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gpm.d $$6 = gpm.d.a(gpm.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gpm.c.b);
                     } else {
                        gpm.a $$7 = new gpm.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gpm.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return af.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              flj.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpm.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gpm.c.a;
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

      class c extends gpm.b.a {
         private final gpm.a f;

         public c(final gpm.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gpm.c> a(gml $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpm.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(gpm.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gpm.c.b);
            } else {
               fft.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gmi.f())) {
                  fgc $$2 = b.this.o();
                  gpm.d $$3 = gpm.d.a(gpm.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gpm.c.b);
                  } else {
                     ffr.a $$4 = $$1.a($$0.a(gmi.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gpm.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gpm.c.b);
                     } else {
                        CompletableFuture<gpm.c> $$5 = gpm.this.a($$4, b.this.a(gmi.f())).thenApply($$0x -> gpm.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              flj.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpm.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gpm.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gpm.c.b);
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

      public static gpm.d a(fba $$0, long $$1) {
         return new gpm.d().b($$0, $$1);
      }

      public gpm.d b(fba $$0, long $$1) {
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
            return !($$0 instanceof gpm.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
