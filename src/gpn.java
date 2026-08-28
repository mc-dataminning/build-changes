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

public class gpn {
   private final gpi a = new gpi();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gmm c;
   private final gmn d;
   private volatile int e;
   private volatile boolean f;
   private final brb g;
   private final ae h;
   gga i;
   final glv j;
   private fbb k = fbb.c;
   final gpm l;

   public gpn(gga $$0, glv $$1, ae $$2, gmh $$3, gnd $$4, gok $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new brb($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gpm($$4, $$5);
   }

   public void a(gga $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gpn.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gmm $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gpn.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  flk.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gpn.c.a) {
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

   public void a(fbb $$0) {
      this.k = $$0;
   }

   public fbb e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gpn.b $$0, gpl $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gpn.b.a $$0) {
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

   public CompletableFuture<Void> a(ffu $$0, ffy $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (boz $$2 = bot.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               ffy.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(ffs.a $$0, ffy $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (boz $$2 = bot.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               ffy.b();
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
      public static final gpn.a a = new gpn.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return false;
         }
      };
      public static final gpn.a b = new gpn.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return true;
         }
      };
      final Set<gmj> c = new ObjectArraySet(gmj.Q().size());
      final List<dua> d = Lists.newArrayList();
      gpp e = new gpp();
      @Nullable
      ffu.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gmj $$0) {
         return !this.c.contains($$0);
      }

      public List<dua> b() {
         return this.d;
      }

      public boolean a(jn $$0, jn $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gpn.a> c = new AtomicReference<>(gpn.a.a);
      public final AtomicReference<gpn.d> d = new AtomicReference<>(null);
      @Nullable
      private gpn.b.b f;
      @Nullable
      private gpn.b.c g;
      private final Set<dua> h = Sets.newHashSet();
      private final Map<gmj, ffy> i = gmj.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new ffy(fdp.b)));
      private faw j;
      private boolean k = true;
      long l = kk.b(-1, -1, -1);
      final ji.a m = new ji.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         dyt $$1 = gpn.this.i.a(kk.b($$0), kk.d($$0), dzu.n, false);
         return $$1 != null && gpn.this.i.C_().a(kk.f($$0));
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

      public faw b() {
         return this.j;
      }

      public ffy a(gmj $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kk.c(kk.b($$0));
         int $$2 = kk.c(kk.c($$0));
         int $$3 = kk.c(kk.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new faw((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fks $$0 = flk.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gpn.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gpn.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(ffy::close);
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

      public void a(gpn $$0) {
         this.g = new gpn.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gmj.f());
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

      public gpn.b.a a(gpl $$0) {
         this.m();
         gpk $$1 = $$0.a(gpn.this.i, kk.a(this.l));
         boolean $$2 = this.c.get() != gpn.a.a;
         this.f = new gpn.b.b($$1, $$2);
         return this.f;
      }

      public void a(gpn $$0, gpl $$1) {
         gpn.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dua> $$0) {
         Set<dua> $$1 = Sets.newHashSet($$0);
         Set<dua> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gpn.this.j.a($$2, $$1);
      }

      public void b(gpl $$0) {
         gpn.b.a $$1 = this.a($$0);
         $$1.a(gpn.this.c);
      }

      void a(gpn.a $$0) {
         this.c.set($$0);
         gpn.this.j.a(this);
      }

      fgd o() {
         fbb $$0 = gpn.this.e();
         return fgd.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gpn.c> a(gmm var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public ji d() {
            return b.this.m;
         }
      }

      class b extends gpn.b.a {
         @Nullable
         protected volatile gpk e;

         public b(@Nullable final gpk $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gpn.c> a(gmm $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpn.c.b);
            } else {
               gpk $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gpn.a.b);
                  return CompletableFuture.completedFuture(gpn.c.a);
               } else {
                  kk $$2 = kk.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gpn.c.b);
                  } else {
                     gpm.a $$4;
                     try (boz $$3 = bot.a().d("Compile Section")) {
                        $$4 = gpn.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gpn.d $$6 = gpn.d.a(gpn.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gpn.c.b);
                     } else {
                        gpn.a $$7 = new gpn.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gpn.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return af.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              flk.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpn.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gpn.c.a;
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

      class c extends gpn.b.a {
         private final gpn.a f;

         public c(final gpn.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gpn.c> a(gmm $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gpn.c.b);
            } else {
               ffu.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gmj.f())) {
                  fgd $$2 = b.this.o();
                  gpn.d $$3 = gpn.d.a(gpn.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gpn.c.b);
                  } else {
                     ffs.a $$4 = $$1.a($$0.a(gmj.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gpn.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gpn.c.b);
                     } else {
                        CompletableFuture<gpn.c> $$5 = gpn.this.a($$4, b.this.a(gmj.f())).thenApply($$0x -> gpn.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              flk.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gpn.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gpn.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gpn.c.b);
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

      public static gpn.d a(fbb $$0, long $$1) {
         return new gpn.d().b($$0, $$1);
      }

      public gpn.d b(fbb $$0, long $$1) {
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
            return !($$0 instanceof gpn.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
