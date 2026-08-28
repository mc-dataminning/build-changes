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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gky {
   private final gkt a = new gkt();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final ghy c;
   private final ghz d;
   private volatile int e;
   private volatile boolean f;
   private final bql<Runnable> g;
   private final Executor h;
   gbm i;
   final ghh j;
   private eyw k = eyw.c;
   final gkx l;

   public gky(gbm $$0, ghh $$1, Executor $$2, ght $$3, gio $$4, gjv $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = bql.a($$2, "Section Renderer");
      this.g.a(this::j);
      this.l = new gkx($$4, $$5);
   }

   public void a(gbm $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gky.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            ghy $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.supplyAsync(ad.a($$0.b(), () -> $$0.a($$1)), this.h).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  fip.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.g.a(() -> {
                     if ($$1x == gky.c.a) {
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

   public void a(eyw $$0) {
      this.k = $$0;
   }

   public eyw e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gky.b $$0, gkw $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gky.b.a $$0) {
      if (!this.f) {
         this.g.a(() -> {
            if (!this.f) {
               this.a.a($$0);
               this.e = this.a.a();
               this.j();
            }
         });
      }
   }

   public CompletableFuture<Void> a(fdh $$0, fdl $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdl.b();
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fdf.a $$0, fdl $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdl.b();
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
      public static final gky.a a = new gky.a() {
         @Override
         public boolean a(jk $$0, jk $$1) {
            return false;
         }
      };
      public static final gky.a b = new gky.a() {
         @Override
         public boolean a(jk $$0, jk $$1) {
            return true;
         }
      };
      final Set<ghv> c = new ObjectArraySet(ghv.L().size());
      final List<drv> d = Lists.newArrayList();
      gla e = new gla();
      @Nullable
      fdh.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(ghv $$0) {
         return !this.c.contains($$0);
      }

      public List<drv> b() {
         return this.d;
      }

      public boolean a(jk $$0, jk $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gky.a> c = new AtomicReference<>(gky.a.a);
      @Nullable
      private gky.b.b e;
      @Nullable
      private gky.b.c f;
      private final Set<drv> g = Sets.newHashSet();
      private final Map<ghv, fdl> h = ghv.L().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fdl(fdl.a.a)));
      private eyr i;
      private boolean j = true;
      private long k = kh.b(-1, -1, -1);
      final jf.a l = new jf.a(-1, -1, -1);
      private boolean m;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return gky.this.i.a(kh.b($$0), kh.d($$0), dxp.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kh.a(this.k, jk.e)) && this.b(kh.a(this.k, jk.c)) && this.b(kh.a(this.k, jk.f)) && this.b(kh.a(this.k, jk.d));
      }

      public eyr b() {
         return this.i;
      }

      public fdl a(ghv $$0) {
         return this.h.get($$0);
      }

      public void a(long $$0) {
         this.l();
         this.k = $$0;
         int $$1 = kh.c(kh.b($$0));
         int $$2 = kh.c(kh.c($$0));
         int $$3 = kh.c(kh.d($$0));
         this.l.d($$1, $$2, $$3);
         this.i = new eyr((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fhy $$0 = fip.Q().j.k();
         double $$1 = this.i.a + 8.0 - $$0.b().d;
         double $$2 = this.i.b + 8.0 - $$0.b().e;
         double $$3 = this.i.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gky.a d() {
         return this.c.get();
      }

      private void l() {
         this.k();
         this.c.set(gky.a.a);
         this.j = true;
      }

      public void e() {
         this.l();
         this.h.values().forEach(fdl::close);
      }

      public jf f() {
         return this.l;
      }

      public long g() {
         return this.k;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.j;
         this.j = true;
         this.m = $$0 | ($$1 && this.m);
      }

      public void h() {
         this.j = false;
         this.m = false;
      }

      public boolean i() {
         return this.j;
      }

      public boolean j() {
         return this.j && this.m;
      }

      public long a(jk $$0) {
         return kh.a(this.k, $$0);
      }

      public boolean a(ghv $$0, gky $$1) {
         gky.a $$2 = this.d();
         if (this.f != null) {
            this.f.a();
         }

         if (!$$2.c.contains($$0)) {
            return false;
         } else {
            this.f = new gky.b.c(this.c(), $$2);
            $$1.a(this.f);
            return true;
         }
      }

      protected void k() {
         if (this.e != null) {
            this.e.a();
            this.e = null;
         }

         if (this.f != null) {
            this.f.a();
            this.f = null;
         }
      }

      public gky.b.a a(gkw $$0) {
         this.k();
         gkv $$1 = $$0.a(gky.this.i, kh.a(this.k));
         boolean $$2 = this.c.get() != gky.a.a;
         this.e = new gky.b.b(this.c(), $$1, $$2);
         return this.e;
      }

      public void a(gky $$0, gkw $$1) {
         gky.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<drv> $$0) {
         Set<drv> $$1 = Sets.newHashSet($$0);
         Set<drv> $$2;
         synchronized (this.g) {
            $$2 = Sets.newHashSet(this.g);
            $$1.removeAll(this.g);
            $$2.removeAll($$0);
            this.g.clear();
            this.g.addAll($$0);
         }

         gky.this.j.a($$2, $$1);
      }

      public void b(gkw $$0) {
         gky.b.a $$1 = this.a($$0);
         $$1.a(gky.this.c);
      }

      public boolean a(int $$0, int $$1, int $$2) {
         return $$0 == kh.b(this.k) || $$2 == kh.d(this.k) || $$1 == kh.c(this.k);
      }

      void a(gky.a $$0) {
         this.c.set($$0);
         gky.this.j.a(this);
      }

      fdq m() {
         eyw $$0 = gky.this.e();
         return fdq.a((float)($$0.d - (double)this.l.u()), (float)($$0.e - (double)this.l.v()), (float)($$0.f - (double)this.l.w()));
      }

      public abstract class a implements Comparable<gky.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final double $$1, final boolean $$2) {
            this.a = $$1;
            this.c = $$2;
         }

         public abstract CompletableFuture<gky.c> a(ghy var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jf d() {
            return b.this.l;
         }

         public int a(gky.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends gky.b.a {
         @Nullable
         protected gkv e;

         public b(final double $$0, @Nullable final gkv $$1, final boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gky.c> a(ghy $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gky.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gky.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gky.c.b);
            } else {
               gkv $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gky.a.b);
                  return CompletableFuture.completedFuture(gky.c.a);
               } else {
                  kh $$2 = kh.a(b.this.l);
                  gkx.a $$3 = gky.this.l.a($$2, $$1, b.this.m(), $$0);
                  b.this.a($$3.a);
                  if (this.b.get()) {
                     $$3.a();
                     return CompletableFuture.completedFuture(gky.c.b);
                  } else {
                     gky.a $$4 = new gky.a();
                     $$4.e = $$3.d;
                     $$4.d.addAll($$3.b);
                     $$4.f = $$3.e;
                     List<CompletableFuture<Void>> $$5 = new ArrayList<>($$3.c.size());
                     $$3.c.forEach(($$2x, $$3x) -> {
                        $$5.add(gky.this.a($$3x, b.this.a($$2x)));
                        $$4.c.add($$2x);
                     });
                     return ad.e($$5).handle(($$1x, $$2x) -> {
                        if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                           fip.Q().a(o.a($$2x, "Rendering section"));
                        }

                        if (this.b.get()) {
                           return gky.c.b;
                        } else {
                           b.this.a($$4);
                           return gky.c.a;
                        }
                     });
                  }
               }
            }
         }

         @Override
         public void a() {
            this.e = null;
            if (this.b.compareAndSet(false, true)) {
               b.this.a(false);
            }
         }
      }

      class c extends gky.b.a {
         private final gky.a f;

         public c(final double $$0, final gky.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gky.c> a(ghy $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gky.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(gky.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gky.c.b);
            } else {
               fdh.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(ghv.f())) {
                  fdq $$2 = b.this.m();
                  fdf.a $$3 = $$1.a($$0.a(ghv.f()), $$2);
                  if ($$3 == null) {
                     return CompletableFuture.completedFuture(gky.c.b);
                  } else if (this.b.get()) {
                     $$3.close();
                     return CompletableFuture.completedFuture(gky.c.b);
                  } else {
                     CompletableFuture<gky.c> $$4 = gky.this.a($$3, b.this.a(ghv.f())).thenApply($$0x -> gky.c.b);
                     return $$4.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           fip.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? gky.c.b : gky.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(gky.c.b);
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
