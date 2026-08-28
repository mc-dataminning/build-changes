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

public class gss {
   private final gsn a = new gsn();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gpq c;
   private final gpr d;
   private volatile int e;
   private volatile boolean f;
   private final bso g;
   private final ae h;
   gjd i;
   final goy j;
   private fdw k = fdw.c;
   final gsr l;

   public gss(gjd $$0, goy $$1, ae $$2, gpl $$3, gqh $$4, gro $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bso($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gsr($$4, $$5);
   }

   public void a(gjd $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gss.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gpq $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gss.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fof.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gss.c.a) {
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

   public void a(fdw $$0) {
      this.k = $$0;
   }

   public fdw e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gss.b $$0, gsq $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gss.b.a $$0) {
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

   public CompletableFuture<Void> a(fip $$0, fit $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqo $$2 = bqi.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fit.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fin.a $$0, fit $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqo $$2 = bqi.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fit.b();
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
      public static final gss.a a = new gss.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return false;
         }
      };
      public static final gss.a b = new gss.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return true;
         }
      };
      final Set<gpn> c = new ObjectArraySet(gpn.Q().size());
      final List<dwn> d = Lists.newArrayList();
      gsu e = new gsu();
      @Nullable
      fip.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gpn $$0) {
         return !this.c.contains($$0);
      }

      public List<dwn> b() {
         return this.d;
      }

      public boolean a(ja $$0, ja $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gss.a> c = new AtomicReference<>(gss.a.a);
      public final AtomicReference<gss.d> d = new AtomicReference<>(null);
      @Nullable
      private gss.b.b f;
      @Nullable
      private gss.b.c g;
      private final Set<dwn> h = Sets.newHashSet();
      private final Map<gpn, fit> i = gpn.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fit(fgk.b)));
      private fdr j;
      private boolean k = true;
      volatile long l = jx.b(-1, -1, -1);
      final iu.a m = new iu.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         ebl $$1 = gss.this.i.a(jx.b($$0), jx.d($$0), ecm.n, false);
         return $$1 != null && gss.this.i.x_().a(jx.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(jx.a(this.l, ja.e))
               && this.b(jx.a(this.l, ja.c))
               && this.b(jx.a(this.l, ja.f))
               && this.b(jx.a(this.l, ja.d))
               && this.b(jx.a(this.l, -1, 0, -1))
               && this.b(jx.a(this.l, -1, 0, 1))
               && this.b(jx.a(this.l, 1, 0, -1))
               && this.b(jx.a(this.l, 1, 0, 1));
      }

      public fdr b() {
         return this.j;
      }

      public fit a(gpn $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jx.c(jx.b($$0));
         int $$2 = jx.c(jx.c($$0));
         int $$3 = jx.c(jx.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fdr((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fnn $$0 = fof.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gss.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gss.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fit::close);
      }

      public iu f() {
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

      public long a(ja $$0) {
         return jx.a(this.l, $$0);
      }

      public void a(gss $$0) {
         this.g = new gss.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gpn.f());
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

      public gss.b.a a(gsq $$0) {
         this.m();
         gsp $$1 = $$0.a(gss.this.i, jx.a(this.l));
         boolean $$2 = this.c.get() != gss.a.a;
         this.f = new gss.b.b($$1, $$2);
         return this.f;
      }

      public void a(gss $$0, gsq $$1) {
         gss.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dwn> $$0) {
         Set<dwn> $$1 = Sets.newHashSet($$0);
         Set<dwn> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gss.this.j.a($$2, $$1);
      }

      public void b(gsq $$0) {
         gss.b.a $$1 = this.a($$0);
         $$1.a(gss.this.c);
      }

      void a(gss.a $$0) {
         this.c.set($$0);
         gss.this.j.a(this);
      }

      fiy a(jx $$0) {
         fdw $$1 = gss.this.e();
         return fiy.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gss.c> a(gpq var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iu d() {
            return b.this.m;
         }
      }

      class b extends gss.b.a {
         @Nullable
         protected volatile gsp e;

         public b(@Nullable final gsp $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gss.c> a(gpq $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gss.c.b);
            } else {
               gsp $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gss.a.b);
                  return CompletableFuture.completedFuture(gss.c.a);
               } else {
                  long $$2 = b.this.l;
                  jx $$3 = jx.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gss.c.b);
                  } else {
                     gsr.a $$5;
                     try (bqo $$4 = bqi.a().d("Compile Section")) {
                        $$5 = gss.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gss.d $$7 = gss.d.a(gss.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gss.c.b);
                     } else {
                        gss.a $$8 = new gss.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(gss.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return af.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              fof.Q().a(o.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gss.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gss.c.a;
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

      class c extends gss.b.a {
         private final gss.a f;

         public c(final gss.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gss.c> a(gpq $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gss.c.b);
            } else {
               fip.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gpn.f())) {
                  long $$2 = b.this.l;
                  fiy $$3 = b.this.a(jx.a($$2));
                  gss.d $$4 = gss.d.a(gss.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gss.c.b);
                  } else {
                     fin.a $$5 = $$1.a($$0.a(gpn.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gss.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gss.c.b);
                     } else {
                        CompletableFuture<gss.c> $$6 = gss.this.a($$5, b.this.a(gpn.f())).thenApply($$0x -> gss.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fof.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gss.c.b;
                           } else {
                              b.this.d.set($$4);
                              return gss.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gss.c.b);
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

      public static gss.d a(fdw $$0, long $$1) {
         return new gss.d().b($$0, $$1);
      }

      public gss.d b(fdw $$0, long $$1) {
         this.a = a($$0.a(), jx.b($$1));
         this.b = a($$0.b(), jx.c($$1));
         this.c = a($$0.c(), jx.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = jx.b($$0) - $$1;
         return azk.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gss.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
