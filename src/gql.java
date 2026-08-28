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

public class gql {
   private final gqg a = new gqg();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gnk c;
   private final gnl d;
   private volatile int e;
   private volatile boolean f;
   private final bro g;
   private final ae h;
   ggy i;
   final gmt j;
   private fbx k = fbx.c;
   final gqk l;

   public gql(ggy $$0, gmt $$1, ae $$2, gnf $$3, gob $$4, gpi $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bro($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gqk($$4, $$5);
   }

   public void a(ggy $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gql.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gnk $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gql.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fmg.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gql.c.a) {
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

   public void a(fbx $$0) {
      this.k = $$0;
   }

   public fbx e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gql.b $$0, gqj $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gql.b.a $$0) {
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

   public CompletableFuture<Void> a(fgq $$0, fgu $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpo $$2 = bpi.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fgu.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fgo.a $$0, fgu $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpo $$2 = bpi.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fgu.b();
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
      public static final gql.a a = new gql.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return false;
         }
      };
      public static final gql.a b = new gql.a() {
         @Override
         public boolean a(jn $$0, jn $$1) {
            return true;
         }
      };
      final Set<gnh> c = new ObjectArraySet(gnh.Q().size());
      final List<dus> d = Lists.newArrayList();
      gqn e = new gqn();
      @Nullable
      fgq.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gnh $$0) {
         return !this.c.contains($$0);
      }

      public List<dus> b() {
         return this.d;
      }

      public boolean a(jn $$0, jn $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gql.a> c = new AtomicReference<>(gql.a.a);
      public final AtomicReference<gql.d> d = new AtomicReference<>(null);
      @Nullable
      private gql.b.b f;
      @Nullable
      private gql.b.c g;
      private final Set<dus> h = Sets.newHashSet();
      private final Map<gnh, fgu> i = gnh.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fgu(fel.b)));
      private fbs j;
      private boolean k = true;
      volatile long l = kk.b(-1, -1, -1);
      final ji.a m = new ji.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         dzm $$1 = gql.this.i.a(kk.b($$0), kk.d($$0), ean.n, false);
         return $$1 != null && gql.this.i.x_().a(kk.f($$0));
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

      public fbs b() {
         return this.j;
      }

      public fgu a(gnh $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kk.c(kk.b($$0));
         int $$2 = kk.c(kk.c($$0));
         int $$3 = kk.c(kk.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fbs((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         flo $$0 = fmg.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gql.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gql.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fgu::close);
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

      public void a(gql $$0) {
         this.g = new gql.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gnh.f());
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

      public gql.b.a a(gqj $$0) {
         this.m();
         gqi $$1 = $$0.a(gql.this.i, kk.a(this.l));
         boolean $$2 = this.c.get() != gql.a.a;
         this.f = new gql.b.b($$1, $$2);
         return this.f;
      }

      public void a(gql $$0, gqj $$1) {
         gql.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dus> $$0) {
         Set<dus> $$1 = Sets.newHashSet($$0);
         Set<dus> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gql.this.j.a($$2, $$1);
      }

      public void b(gqj $$0) {
         gql.b.a $$1 = this.a($$0);
         $$1.a(gql.this.c);
      }

      void a(gql.a $$0) {
         this.c.set($$0);
         gql.this.j.a(this);
      }

      fgz a(kk $$0) {
         fbx $$1 = gql.this.e();
         return fgz.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gql.c> a(gnk var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public ji d() {
            return b.this.m;
         }
      }

      class b extends gql.b.a {
         @Nullable
         protected volatile gqi e;

         public b(@Nullable final gqi $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gql.c> a(gnk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gql.c.b);
            } else {
               gqi $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gql.a.b);
                  return CompletableFuture.completedFuture(gql.c.a);
               } else {
                  long $$2 = b.this.l;
                  kk $$3 = kk.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gql.c.b);
                  } else {
                     gqk.a $$5;
                     try (bpo $$4 = bpi.a().d("Compile Section")) {
                        $$5 = gql.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gql.d $$7 = gql.d.a(gql.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gql.c.b);
                     } else {
                        gql.a $$8 = new gql.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(gql.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return af.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              fmg.Q().a(o.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gql.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gql.c.a;
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

      class c extends gql.b.a {
         private final gql.a f;

         public c(final gql.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gql.c> a(gnk $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gql.c.b);
            } else {
               fgq.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gnh.f())) {
                  long $$2 = b.this.l;
                  fgz $$3 = b.this.a(kk.a($$2));
                  gql.d $$4 = gql.d.a(gql.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gql.c.b);
                  } else {
                     fgo.a $$5 = $$1.a($$0.a(gnh.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gql.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gql.c.b);
                     } else {
                        CompletableFuture<gql.c> $$6 = gql.this.a($$5, b.this.a(gnh.f())).thenApply($$0x -> gql.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fmg.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gql.c.b;
                           } else {
                              b.this.d.set($$4);
                              return gql.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gql.c.b);
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

      public static gql.d a(fbx $$0, long $$1) {
         return new gql.d().b($$0, $$1);
      }

      public gql.d b(fbx $$0, long $$1) {
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
            return !($$0 instanceof gql.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
