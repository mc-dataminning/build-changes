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

public class gmk {
   private final gmf a = new gmf();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gjk c;
   private final gjl d;
   private volatile int e;
   private volatile boolean f;
   private final bqx g;
   private final ad h;
   gcy i;
   final git j;
   private ezr k = ezr.c;
   final gmj l;

   public gmk(gcy $$0, git $$1, ad $$2, gjf $$3, gka $$4, glh $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bqx($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gmj($$4, $$5);
   }

   public void a(gcy $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gmk.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gjk $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gmk.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fjx.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gmk.c.a) {
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

   public void a(ezr $$0) {
      this.k = $$0;
   }

   public ezr e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gmk.b $$0, gmi $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gmk.b.a $$0) {
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

   public CompletableFuture<Void> a(fej $$0, fen $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bow $$2 = boq.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fen.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(feh.a $$0, fen $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bow $$2 = boq.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fen.b();
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
      public static final gmk.a a = new gmk.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return false;
         }
      };
      public static final gmk.a b = new gmk.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return true;
         }
      };
      final Set<gjh> c = new ObjectArraySet(gjh.L().size());
      final List<dsr> d = Lists.newArrayList();
      gmm e = new gmm();
      @Nullable
      fej.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gjh $$0) {
         return !this.c.contains($$0);
      }

      public List<dsr> b() {
         return this.d;
      }

      public boolean a(jm $$0, jm $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gmk.a> c = new AtomicReference<>(gmk.a.a);
      public final AtomicReference<gmk.d> d = new AtomicReference<>(null);
      @Nullable
      private gmk.b.b f;
      @Nullable
      private gmk.b.c g;
      private final Set<dsr> h = Sets.newHashSet();
      private final Map<gjh, fen> i = gjh.L().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fen(fce.b)));
      private ezm j;
      private boolean k = true;
      long l = kj.b(-1, -1, -1);
      final jh.a m = new jh.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return gmk.this.i.a(kj.b($$0), kj.d($$0), dyk.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kj.a(this.l, jm.e)) && this.b(kj.a(this.l, jm.c)) && this.b(kj.a(this.l, jm.f)) && this.b(kj.a(this.l, jm.d));
      }

      public ezm b() {
         return this.j;
      }

      public fen a(gjh $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kj.c(kj.b($$0));
         int $$2 = kj.c(kj.c($$0));
         int $$3 = kj.c(kj.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new ezm((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fjg $$0 = fjx.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gmk.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gmk.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fen::close);
      }

      public jh f() {
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

      public long a(jm $$0) {
         return kj.a(this.l, $$0);
      }

      public void a(gmk $$0) {
         this.g = new gmk.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gjh.f());
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

      public gmk.b.a a(gmi $$0) {
         this.m();
         gmh $$1 = $$0.a(gmk.this.i, kj.a(this.l));
         boolean $$2 = this.c.get() != gmk.a.a;
         this.f = new gmk.b.b($$1, $$2);
         return this.f;
      }

      public void a(gmk $$0, gmi $$1) {
         gmk.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dsr> $$0) {
         Set<dsr> $$1 = Sets.newHashSet($$0);
         Set<dsr> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gmk.this.j.a($$2, $$1);
      }

      public void b(gmi $$0) {
         gmk.b.a $$1 = this.a($$0);
         $$1.a(gmk.this.c);
      }

      void a(gmk.a $$0) {
         this.c.set($$0);
         gmk.this.j.a(this);
      }

      fes o() {
         ezr $$0 = gmk.this.e();
         return fes.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gmk.c> a(gjk var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jh d() {
            return b.this.m;
         }
      }

      class b extends gmk.b.a {
         @Nullable
         protected volatile gmh e;

         public b(@Nullable final gmh $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gmk.c> a(gjk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gmk.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gmk.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gmk.c.b);
            } else {
               gmh $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gmk.a.b);
                  return CompletableFuture.completedFuture(gmk.c.a);
               } else {
                  kj $$2 = kj.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gmk.c.b);
                  } else {
                     gmj.a $$4;
                     try (bow $$3 = boq.a().d("Compile Section")) {
                        $$4 = gmk.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gmk.d $$6 = gmk.d.a(gmk.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gmk.c.b);
                     } else {
                        gmk.a $$7 = new gmk.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gmk.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return ae.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              fjx.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gmk.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gmk.c.a;
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

      class c extends gmk.b.a {
         private final gmk.a f;

         public c(final gmk.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gmk.c> a(gjk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gmk.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(gmk.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gmk.c.b);
            } else {
               fej.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gjh.f())) {
                  fes $$2 = b.this.o();
                  gmk.d $$3 = gmk.d.a(gmk.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gmk.c.b);
                  } else {
                     feh.a $$4 = $$1.a($$0.a(gjh.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gmk.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gmk.c.b);
                     } else {
                        CompletableFuture<gmk.c> $$5 = gmk.this.a($$4, b.this.a(gjh.f())).thenApply($$0x -> gmk.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fjx.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gmk.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gmk.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gmk.c.b);
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

      public static gmk.d a(ezr $$0, long $$1) {
         return new gmk.d().b($$0, $$1);
      }

      public gmk.d b(ezr $$0, long $$1) {
         this.a = a($$0.a(), kj.b($$1));
         this.b = a($$0.b(), kj.c($$1));
         this.c = a($$0.c(), kj.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = kj.b($$0) - $$1;
         return azn.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gmk.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
