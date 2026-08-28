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

public class gkt {
   private final gko a = new gko();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final ght c;
   private final ghu d;
   private volatile int e;
   private volatile boolean f;
   private final bqi<Runnable> g;
   private final Executor h;
   gbh i;
   final ghc j;
   private eys k = eys.c;
   final gks l;

   public gkt(gbh $$0, ghc $$1, Executor $$2, gho $$3, gij $$4, gjq $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = bqi.a($$2, "Section Renderer");
      this.g.a(this::j);
      this.l = new gks($$4, $$5);
   }

   public void a(gbh $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gkt.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            ght $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.supplyAsync(ad.a($$0.b(), () -> $$0.a($$1)), this.h).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  fil.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.g.a(() -> {
                     if ($$1x == gkt.c.a) {
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

   public void a(eys $$0) {
      this.k = $$0;
   }

   public eys e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gkt.b $$0, gkr $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gkt.b.a $$0) {
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

   public CompletableFuture<Void> a(fdd $$0, fdh $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdh.b();
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fdb.a $$0, fdh $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdh.b();
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
      public static final gkt.a a = new gkt.a() {
         @Override
         public boolean a(jj $$0, jj $$1) {
            return false;
         }
      };
      public static final gkt.a b = new gkt.a() {
         @Override
         public boolean a(jj $$0, jj $$1) {
            return true;
         }
      };
      final Set<ghq> c = new ObjectArraySet(ghq.L().size());
      final List<drs> d = Lists.newArrayList();
      gkv e = new gkv();
      @Nullable
      fdd.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(ghq $$0) {
         return !this.c.contains($$0);
      }

      public List<drs> b() {
         return this.d;
      }

      public boolean a(jj $$0, jj $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gkt.a> c = new AtomicReference<>(gkt.a.a);
      @Nullable
      private gkt.b.b e;
      @Nullable
      private gkt.b.c f;
      private final Set<drs> g = Sets.newHashSet();
      private final Map<ghq, fdh> h = ghq.L().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fdh(fdh.a.a)));
      private eyn i;
      private boolean j = true;
      private long k = kg.b(-1, -1, -1);
      final je.a l = new je.a(-1, -1, -1);
      private boolean m;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return gkt.this.i.a(kg.b($$0), kg.d($$0), dxl.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kg.a(this.k, jj.e)) && this.b(kg.a(this.k, jj.c)) && this.b(kg.a(this.k, jj.f)) && this.b(kg.a(this.k, jj.d));
      }

      public eyn b() {
         return this.i;
      }

      public fdh a(ghq $$0) {
         return this.h.get($$0);
      }

      public void a(long $$0) {
         this.l();
         this.k = $$0;
         int $$1 = kg.c(kg.b($$0));
         int $$2 = kg.c(kg.c($$0));
         int $$3 = kg.c(kg.d($$0));
         this.l.d($$1, $$2, $$3);
         this.i = new eyn((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fhu $$0 = fil.Q().j.k();
         double $$1 = this.i.a + 8.0 - $$0.b().d;
         double $$2 = this.i.b + 8.0 - $$0.b().e;
         double $$3 = this.i.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gkt.a d() {
         return this.c.get();
      }

      private void l() {
         this.k();
         this.c.set(gkt.a.a);
         this.j = true;
      }

      public void e() {
         this.l();
         this.h.values().forEach(fdh::close);
      }

      public je f() {
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

      public long a(jj $$0) {
         return kg.a(this.k, $$0);
      }

      public boolean a(ghq $$0, gkt $$1) {
         gkt.a $$2 = this.d();
         if (this.f != null) {
            this.f.a();
         }

         if (!$$2.c.contains($$0)) {
            return false;
         } else {
            this.f = new gkt.b.c(this.c(), $$2);
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

      public gkt.b.a a(gkr $$0) {
         this.k();
         gkq $$1 = $$0.a(gkt.this.i, kg.a(this.k));
         boolean $$2 = this.c.get() != gkt.a.a;
         this.e = new gkt.b.b(this.c(), $$1, $$2);
         return this.e;
      }

      public void a(gkt $$0, gkr $$1) {
         gkt.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<drs> $$0) {
         Set<drs> $$1 = Sets.newHashSet($$0);
         Set<drs> $$2;
         synchronized (this.g) {
            $$2 = Sets.newHashSet(this.g);
            $$1.removeAll(this.g);
            $$2.removeAll($$0);
            this.g.clear();
            this.g.addAll($$0);
         }

         gkt.this.j.a($$2, $$1);
      }

      public void b(gkr $$0) {
         gkt.b.a $$1 = this.a($$0);
         $$1.a(gkt.this.c);
      }

      public boolean a(int $$0, int $$1, int $$2) {
         return $$0 == kg.b(this.k) || $$2 == kg.d(this.k) || $$1 == kg.c(this.k);
      }

      void a(gkt.a $$0) {
         this.c.set($$0);
         gkt.this.j.a(this);
      }

      fdm m() {
         eys $$0 = gkt.this.e();
         return fdm.a((float)($$0.d - (double)this.l.u()), (float)($$0.e - (double)this.l.v()), (float)($$0.f - (double)this.l.w()));
      }

      public abstract class a implements Comparable<gkt.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final double $$1, final boolean $$2) {
            this.a = $$1;
            this.c = $$2;
         }

         public abstract CompletableFuture<gkt.c> a(ght var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public je d() {
            return b.this.l;
         }

         public int a(gkt.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends gkt.b.a {
         @Nullable
         protected gkq e;

         public b(final double $$0, @Nullable final gkq $$1, final boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gkt.c> a(ght $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gkt.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gkt.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gkt.c.b);
            } else {
               gkq $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gkt.a.b);
                  return CompletableFuture.completedFuture(gkt.c.a);
               } else {
                  kg $$2 = kg.a(b.this.l);
                  gks.a $$3 = gkt.this.l.a($$2, $$1, b.this.m(), $$0);
                  b.this.a($$3.a);
                  if (this.b.get()) {
                     $$3.a();
                     return CompletableFuture.completedFuture(gkt.c.b);
                  } else {
                     gkt.a $$4 = new gkt.a();
                     $$4.e = $$3.d;
                     $$4.d.addAll($$3.b);
                     $$4.f = $$3.e;
                     List<CompletableFuture<Void>> $$5 = new ArrayList<>($$3.c.size());
                     $$3.c.forEach(($$2x, $$3x) -> {
                        $$5.add(gkt.this.a($$3x, b.this.a($$2x)));
                        $$4.c.add($$2x);
                     });
                     return ad.e($$5).handle(($$1x, $$2x) -> {
                        if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                           fil.Q().a(o.a($$2x, "Rendering section"));
                        }

                        if (this.b.get()) {
                           return gkt.c.b;
                        } else {
                           b.this.a($$4);
                           return gkt.c.a;
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

      class c extends gkt.b.a {
         private final gkt.a f;

         public c(final double $$0, final gkt.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gkt.c> a(ght $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gkt.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(gkt.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gkt.c.b);
            } else {
               fdd.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(ghq.f())) {
                  fdm $$2 = b.this.m();
                  fdb.a $$3 = $$1.a($$0.a(ghq.f()), $$2);
                  if ($$3 == null) {
                     return CompletableFuture.completedFuture(gkt.c.b);
                  } else if (this.b.get()) {
                     $$3.close();
                     return CompletableFuture.completedFuture(gkt.c.b);
                  } else {
                     CompletableFuture<gkt.c> $$4 = gkt.this.a($$3, b.this.a(ghq.f())).thenApply($$0x -> gkt.c.b);
                     return $$4.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           fil.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? gkt.c.b : gkt.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(gkt.c.b);
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
