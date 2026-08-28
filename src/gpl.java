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

public class gpl {
   private final gpg a = new gpg();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gmk c;
   private final gml d;
   private volatile int e;
   private volatile boolean f;
   private final bqz g;
   private final ae h;
   gfy i;
   final glt j;
   private faz k = faz.c;
   final gpk l;

   public gpl(gfy $$0, glt $$1, ae $$2, gmf $$3, gnb $$4, goi $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bqz($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gpk($$4, $$5);
   }

   public void a(gfy $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gpl.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gmk $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gpl.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fli.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gpl.c.a) {
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

   public void a(faz $$0) {
      this.k = $$0;
   }

   public faz e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gpl.b $$0, gpj $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gpl.b.a $$0) {
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

   public CompletableFuture<Void> a(ffs $$0, ffw $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (box $$2 = bor.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               ffw.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(ffq.a $$0, ffw $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (box $$2 = bor.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               ffw.b();
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
      public static final gpl.a a = new gpl.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return false;
         }
      };
      public static final gpl.a b = new gpl.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return true;
         }
      };
      final Set<gmh> c = new ObjectArraySet(gmh.Q().size());
      final List<dty> d = Lists.newArrayList();
      gpn e = new gpn();
      @Nullable
      ffs.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gmh $$0) {
         return !this.c.contains($$0);
      }

      public List<dty> b() {
         return this.d;
      }

      public boolean a(jn $$0, jn $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gpl.a> c = new AtomicReference<>(gpl.a.a);
      public final AtomicReference<gpl.d> d = new AtomicReference<>(null);
      @Nullable
      private gpl.b.b f;
      @Nullable
      private gpl.b.c g;
      private final Set<dty> h = Sets.newHashSet();
      private final Map<gmh, ffw> i = gmh.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new ffw(fdn.b)));
      private fau j;
      private boolean k = true;
      long l = kk.b(-1, -1, -1);
      final ji.a m = new ji.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         dyr $$1 = gpl.this.i.a(kk.b($$0), kk.d($$0), dzs.n, false);
         return $$1 != null && gpl.this.i.C_().a(kk.f($$0));
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

      public fau b() {
         return this.j;
      }

      public ffw a(gmh $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kk.c(kk.b($$0));
         int $$2 = kk.c(kk.c($$0));
         int $$3 = kk.c(kk.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fau((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fkq $$0 = fli.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gpl.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gpl.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(ffw::close);
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

      public void a(gpl $$0) {
         this.g = new gpl.b.c(this.d());
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

      public gpl.b.a a(gpj $$0) {
         this.m();
         gpi $$1 = $$0.a(gpl.this.i, kk.a(this.l));
         boolean $$2 = this.c.get() != gpl.a.a;
         this.f = new gpl.b.b($$1, $$2);
         return this.f;
      }

      public void a(gpl $$0, gpj $$1) {
         gpl.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dty> $$0) {
         Set<dty> $$1 = Sets.newHashSet($$0);
         Set<dty> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gpl.this.j.a($$2, $$1);
      }

      public void b(gpj $$0) {
         gpl.b.a $$1 = this.a($$0);
         $$1.a(gpl.this.c);
      }

      void a(gpl.a $$0) {
         this.c.set($$0);
         gpl.this.j.a(this);
      }

      fgb o() {
         faz $$0 = gpl.this.e();
         return fgb.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gpl.c> a(gmk var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public ji d() {
            return b.this.m;
         }
      }

      class b extends gpl.b.a {
         @Nullable
         protected volatile gpi e;

         public b(@Nullable final gpi $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gpl.c> a(gmk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpl.c.b);
            } else {
               gpi $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gpl.a.b);
                  return CompletableFuture.completedFuture(gpl.c.a);
               } else {
                  kk $$2 = kk.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gpl.c.b);
                  } else {
                     gpk.a $$4;
                     try (box $$3 = bor.a().d("Compile Section")) {
                        $$4 = gpl.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gpl.d $$6 = gpl.d.a(gpl.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gpl.c.b);
                     } else {
                        gpl.a $$7 = new gpl.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gpl.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return af.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              fli.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpl.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gpl.c.a;
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

      class c extends gpl.b.a {
         private final gpl.a f;

         public c(final gpl.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gpl.c> a(gmk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpl.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(gpl.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gpl.c.b);
            } else {
               ffs.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gmh.f())) {
                  fgb $$2 = b.this.o();
                  gpl.d $$3 = gpl.d.a(gpl.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gpl.c.b);
                  } else {
                     ffq.a $$4 = $$1.a($$0.a(gmh.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gpl.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gpl.c.b);
                     } else {
                        CompletableFuture<gpl.c> $$5 = gpl.this.a($$4, b.this.a(gmh.f())).thenApply($$0x -> gpl.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fli.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpl.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gpl.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gpl.c.b);
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

      public static gpl.d a(faz $$0, long $$1) {
         return new gpl.d().b($$0, $$1);
      }

      public gpl.d b(faz $$0, long $$1) {
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
            return !($$0 instanceof gpl.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
