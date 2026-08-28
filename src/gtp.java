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

public class gtp {
   private final gtk a = new gtk();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gqn c;
   private final gqo d;
   private volatile int e;
   private volatile boolean f;
   private final bst g;
   private final ae h;
   gjz i;
   final gpv j;
   private feq k = feq.c;
   final gto l;

   public gtp(gjz $$0, gpv $$1, ae $$2, gqi $$3, gre $$4, gsl $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bst($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gto($$4, $$5);
   }

   public void a(gjz $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gtp.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gqn $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gtp.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  foz.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gtp.c.a) {
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

   public void a(feq $$0) {
      this.k = $$0;
   }

   public feq e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gtp.b $$0, gtn $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gtp.b.a $$0) {
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

   public CompletableFuture<Void> a(fji $$0, fjm $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqt $$2 = bqn.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fjm.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fjg.a $$0, fjm $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqt $$2 = bqn.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fjm.b();
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
      public static final gtp.a a = new gtp.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return false;
         }
      };
      public static final gtp.a b = new gtp.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return true;
         }
      };
      final Set<gqk> c = new ObjectArraySet(gqk.R().size());
      final List<dxf> d = Lists.newArrayList();
      gtr e = new gtr();
      @Nullable
      fji.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gqk $$0) {
         return !this.c.contains($$0);
      }

      public List<dxf> b() {
         return this.d;
      }

      public boolean a(ja $$0, ja $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gtp.a> c = new AtomicReference<>(gtp.a.a);
      public final AtomicReference<gtp.d> d = new AtomicReference<>(null);
      @Nullable
      private gtp.b.b f;
      @Nullable
      private gtp.b.c g;
      private final Set<dxf> h = Sets.newHashSet();
      private final Map<gqk, fjm> i = gqk.R().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fjm(fhe.b)));
      private fel j;
      private boolean k = true;
      volatile long l = jx.b(-1, -1, -1);
      final iu.a m = new iu.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         ece $$1 = gtp.this.i.a(jx.b($$0), jx.d($$0), edf.n, false);
         return $$1 != null && gtp.this.i.x_().a(jx.f($$0));
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

      public fel b() {
         return this.j;
      }

      public fjm a(gqk $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jx.c(jx.b($$0));
         int $$2 = jx.c(jx.c($$0));
         int $$3 = jx.c(jx.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fel((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fog $$0 = foz.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gtp.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gtp.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fjm::close);
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

      public void a(gtp $$0) {
         this.g = new gtp.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gqk.f());
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

      public gtp.b.a a(gtn $$0) {
         this.m();
         gtm $$1 = $$0.a(gtp.this.i, jx.a(this.l));
         boolean $$2 = this.c.get() != gtp.a.a;
         this.f = new gtp.b.b($$1, $$2);
         return this.f;
      }

      public void a(gtp $$0, gtn $$1) {
         gtp.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dxf> $$0) {
         Set<dxf> $$1 = Sets.newHashSet($$0);
         Set<dxf> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gtp.this.j.a($$2, $$1);
      }

      public void b(gtn $$0) {
         gtp.b.a $$1 = this.a($$0);
         $$1.a(gtp.this.c);
      }

      void a(gtp.a $$0) {
         this.c.set($$0);
         gtp.this.j.a(this);
      }

      fjr a(jx $$0) {
         feq $$1 = gtp.this.e();
         return fjr.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gtp.c> a(gqn var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iu d() {
            return b.this.m;
         }
      }

      class b extends gtp.b.a {
         @Nullable
         protected volatile gtm e;

         public b(@Nullable final gtm $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gtp.c> a(gqn $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gtp.c.b);
            } else {
               gtm $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gtp.a.b);
                  return CompletableFuture.completedFuture(gtp.c.a);
               } else {
                  long $$2 = b.this.l;
                  jx $$3 = jx.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gtp.c.b);
                  } else {
                     gto.a $$5;
                     try (bqt $$4 = bqn.a().d("Compile Section")) {
                        $$5 = gtp.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gtp.d $$7 = gtp.d.a(gtp.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gtp.c.b);
                     } else {
                        gtp.a $$8 = new gtp.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(gtp.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return af.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              foz.Q().a(o.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gtp.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gtp.c.a;
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

      class c extends gtp.b.a {
         private final gtp.a f;

         public c(final gtp.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gtp.c> a(gqn $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gtp.c.b);
            } else {
               fji.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gqk.f())) {
                  long $$2 = b.this.l;
                  fjr $$3 = b.this.a(jx.a($$2));
                  gtp.d $$4 = gtp.d.a(gtp.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gtp.c.b);
                  } else {
                     fjg.a $$5 = $$1.a($$0.a(gqk.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gtp.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gtp.c.b);
                     } else {
                        CompletableFuture<gtp.c> $$6 = gtp.this.a($$5, b.this.a(gqk.f())).thenApply($$0x -> gtp.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              foz.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gtp.c.b;
                           } else {
                              b.this.d.set($$4);
                              return gtp.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gtp.c.b);
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

      public static gtp.d a(feq $$0, long $$1) {
         return new gtp.d().b($$0, $$1);
      }

      public gtp.d b(feq $$0, long $$1) {
         this.a = a($$0.a(), jx.b($$1));
         this.b = a($$0.b(), jx.c($$1));
         this.c = a($$0.c(), jx.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = jx.b($$0) - $$1;
         return azm.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gtp.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
