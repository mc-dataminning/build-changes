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

public class gth {
   private final gtc a = new gtc();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gqf c;
   private final gqg d;
   private volatile int e;
   private volatile boolean f;
   private final bsr g;
   private final ae h;
   gjr i;
   final gpn j;
   private fei k = fei.c;
   final gtg l;

   public gth(gjr $$0, gpn $$1, ae $$2, gqa $$3, gqw $$4, gsd $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bsr($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gtg($$4, $$5);
   }

   public void a(gjr $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gth.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gqf $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gth.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fos.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gth.c.a) {
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

   public void a(fei $$0) {
      this.k = $$0;
   }

   public fei e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gth.b $$0, gtf $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gth.b.a $$0) {
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

   public CompletableFuture<Void> a(fjb $$0, fjf $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqr $$2 = bql.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fjf.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fiz.a $$0, fjf $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqr $$2 = bql.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fjf.b();
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
      public static final gth.a a = new gth.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return false;
         }
      };
      public static final gth.a b = new gth.a() {
         @Override
         public boolean a(ja $$0, ja $$1) {
            return true;
         }
      };
      final Set<gqc> c = new ObjectArraySet(gqc.Q().size());
      final List<dwx> d = Lists.newArrayList();
      gtj e = new gtj();
      @Nullable
      fjb.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gqc $$0) {
         return !this.c.contains($$0);
      }

      public List<dwx> b() {
         return this.d;
      }

      public boolean a(ja $$0, ja $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gth.a> c = new AtomicReference<>(gth.a.a);
      public final AtomicReference<gth.d> d = new AtomicReference<>(null);
      @Nullable
      private gth.b.b f;
      @Nullable
      private gth.b.c g;
      private final Set<dwx> h = Sets.newHashSet();
      private final Map<gqc, fjf> i = gqc.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fjf(fgw.b)));
      private fed j;
      private boolean k = true;
      volatile long l = jx.b(-1, -1, -1);
      final iu.a m = new iu.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         ebw $$1 = gth.this.i.a(jx.b($$0), jx.d($$0), ecx.n, false);
         return $$1 != null && gth.this.i.x_().a(jx.f($$0));
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

      public fed b() {
         return this.j;
      }

      public fjf a(gqc $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jx.c(jx.b($$0));
         int $$2 = jx.c(jx.c($$0));
         int $$3 = jx.c(jx.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fed((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fnz $$0 = fos.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gth.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gth.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fjf::close);
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

      public void a(gth $$0) {
         this.g = new gth.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gqc.f());
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

      public gth.b.a a(gtf $$0) {
         this.m();
         gte $$1 = $$0.a(gth.this.i, jx.a(this.l));
         boolean $$2 = this.c.get() != gth.a.a;
         this.f = new gth.b.b($$1, $$2);
         return this.f;
      }

      public void a(gth $$0, gtf $$1) {
         gth.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dwx> $$0) {
         Set<dwx> $$1 = Sets.newHashSet($$0);
         Set<dwx> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gth.this.j.a($$2, $$1);
      }

      public void b(gtf $$0) {
         gth.b.a $$1 = this.a($$0);
         $$1.a(gth.this.c);
      }

      void a(gth.a $$0) {
         this.c.set($$0);
         gth.this.j.a(this);
      }

      fjk a(jx $$0) {
         fei $$1 = gth.this.e();
         return fjk.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gth.c> a(gqf var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iu d() {
            return b.this.m;
         }
      }

      class b extends gth.b.a {
         @Nullable
         protected volatile gte e;

         public b(@Nullable final gte $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gth.c> a(gqf $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gth.c.b);
            } else {
               gte $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gth.a.b);
                  return CompletableFuture.completedFuture(gth.c.a);
               } else {
                  long $$2 = b.this.l;
                  jx $$3 = jx.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gth.c.b);
                  } else {
                     gtg.a $$5;
                     try (bqr $$4 = bql.a().d("Compile Section")) {
                        $$5 = gth.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gth.d $$7 = gth.d.a(gth.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gth.c.b);
                     } else {
                        gth.a $$8 = new gth.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(gth.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return af.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              fos.Q().a(o.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gth.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gth.c.a;
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

      class c extends gth.b.a {
         private final gth.a f;

         public c(final gth.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gth.c> a(gqf $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gth.c.b);
            } else {
               fjb.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gqc.f())) {
                  long $$2 = b.this.l;
                  fjk $$3 = b.this.a(jx.a($$2));
                  gth.d $$4 = gth.d.a(gth.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gth.c.b);
                  } else {
                     fiz.a $$5 = $$1.a($$0.a(gqc.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gth.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gth.c.b);
                     } else {
                        CompletableFuture<gth.c> $$6 = gth.this.a($$5, b.this.a(gqc.f())).thenApply($$0x -> gth.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fos.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gth.c.b;
                           } else {
                              b.this.d.set($$4);
                              return gth.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gth.c.b);
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

      public static gth.d a(fei $$0, long $$1) {
         return new gth.d().b($$0, $$1);
      }

      public gth.d b(fei $$0, long $$1) {
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
            return !($$0 instanceof gth.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
