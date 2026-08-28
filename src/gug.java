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

public class gug {
   private final gub a = new gub();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final grf c;
   private final grg d;
   private volatile int e;
   private volatile boolean f;
   private final bsv g;
   private final af h;
   gkq i;
   final gqm j;
   private ffc k = ffc.c;
   final guf l;

   public gug(gkq $$0, gqm $$1, af $$2, gqz $$3, gru $$4, gtc $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bsv($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new guf($$4, $$5);
   }

   public void a(gkq $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gug.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            grf $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gug.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fpt.Q().a(p.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gug.c.a) {
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

   public void a(ffc $$0) {
      this.k = $$0;
   }

   public ffc e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gug.b $$0, gue $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gug.b.a $$0) {
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

   public CompletableFuture<Void> a(fkc $$0, fkg $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqv $$2 = bqp.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fkg.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fka.a $$0, fkg $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqv $$2 = bqp.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fkg.b();
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
      public static final gug.a a = new gug.a() {
         @Override
         public boolean a(jb $$0, jb $$1) {
            return false;
         }
      };
      public static final gug.a b = new gug.a() {
         @Override
         public boolean a(jb $$0, jb $$1) {
            return true;
         }
      };
      final Set<grc> c = new ObjectArraySet(grc.U().size());
      final List<dxr> d = Lists.newArrayList();
      gui e = new gui();
      @Nullable
      fkc.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(grc $$0) {
         return !this.c.contains($$0);
      }

      public List<dxr> b() {
         return this.d;
      }

      public boolean a(jb $$0, jb $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gug.a> c = new AtomicReference<>(gug.a.a);
      public final AtomicReference<gug.d> d = new AtomicReference<>(null);
      @Nullable
      private gug.b.b f;
      @Nullable
      private gug.b.c g;
      private final Set<dxr> h = Sets.newHashSet();
      private final Map<grc, fkg> i = grc.U().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fkg(fhr.b)));
      private fex j;
      private boolean k = true;
      volatile long l = jy.b(-1, -1, -1);
      final iv.a m = new iv.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         ecq $$1 = gug.this.i.a(jy.b($$0), jy.d($$0), edr.n, false);
         return $$1 != null && gug.this.i.x_().a(jy.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(jy.a(this.l, jb.e))
               && this.b(jy.a(this.l, jb.c))
               && this.b(jy.a(this.l, jb.f))
               && this.b(jy.a(this.l, jb.d))
               && this.b(jy.a(this.l, -1, 0, -1))
               && this.b(jy.a(this.l, -1, 0, 1))
               && this.b(jy.a(this.l, 1, 0, -1))
               && this.b(jy.a(this.l, 1, 0, 1));
      }

      public fex b() {
         return this.j;
      }

      public fkg a(grc $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jy.c(jy.b($$0));
         int $$2 = jy.c(jy.c($$0));
         int $$3 = jy.c(jy.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fex((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fpb $$0 = fpt.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gug.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gug.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fkg::close);
      }

      public iv f() {
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

      public long a(jb $$0) {
         return jy.a(this.l, $$0);
      }

      public void a(gug $$0) {
         this.g = new gug.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(grc.f());
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

      public gug.b.a a(gue $$0) {
         this.m();
         gud $$1 = $$0.a(gug.this.i, jy.a(this.l));
         boolean $$2 = this.c.get() != gug.a.a;
         this.f = new gug.b.b($$1, $$2);
         return this.f;
      }

      public void a(gug $$0, gue $$1) {
         gug.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dxr> $$0) {
         Set<dxr> $$1 = Sets.newHashSet($$0);
         Set<dxr> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gug.this.j.a($$2, $$1);
      }

      public void b(gue $$0) {
         gug.b.a $$1 = this.a($$0);
         $$1.a(gug.this.c);
      }

      void a(gug.a $$0) {
         this.c.set($$0);
         gug.this.j.a(this);
      }

      fkl a(jy $$0) {
         ffc $$1 = gug.this.e();
         return fkl.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gug.c> a(grf var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iv d() {
            return b.this.m;
         }
      }

      class b extends gug.b.a {
         @Nullable
         protected volatile gud e;

         public b(@Nullable final gud $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gug.c> a(grf $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gug.c.b);
            } else {
               gud $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gug.a.b);
                  return CompletableFuture.completedFuture(gug.c.a);
               } else {
                  long $$2 = b.this.l;
                  jy $$3 = jy.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gug.c.b);
                  } else {
                     guf.a $$5;
                     try (bqv $$4 = bqp.a().d("Compile Section")) {
                        $$5 = gug.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gug.d $$7 = gug.d.a(gug.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gug.c.b);
                     } else {
                        gug.a $$8 = new gug.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(gug.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return ag.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              fpt.Q().a(p.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gug.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gug.c.a;
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

      class c extends gug.b.a {
         private final gug.a f;

         public c(final gug.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gug.c> a(grf $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gug.c.b);
            } else {
               fkc.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(grc.f())) {
                  long $$2 = b.this.l;
                  fkl $$3 = b.this.a(jy.a($$2));
                  gug.d $$4 = gug.d.a(gug.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gug.c.b);
                  } else {
                     fka.a $$5 = $$1.a($$0.a(grc.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gug.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gug.c.b);
                     } else {
                        CompletableFuture<gug.c> $$6 = gug.this.a($$5, b.this.a(grc.f())).thenApply($$0x -> gug.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fpt.Q().a(p.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gug.c.b;
                           } else {
                              b.this.d.set($$4);
                              return gug.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gug.c.b);
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

      public static gug.d a(ffc $$0, long $$1) {
         return new gug.d().b($$0, $$1);
      }

      public gug.d b(ffc $$0, long $$1) {
         this.a = a($$0.a(), jy.b($$1));
         this.b = a($$0.b(), jy.c($$1));
         this.c = a($$0.c(), jy.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = jy.b($$0) - $$1;
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
            return !($$0 instanceof gug.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
