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

public class got {
   private final goo a = new goo();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final glt c;
   private final glu d;
   private volatile int e;
   private volatile boolean f;
   private final brq g;
   private final ad h;
   gff i;
   final glc j;
   private fbr k = fbr.c;
   final gos l;

   public got(gff $$0, glc $$1, ad $$2, glo $$3, gmj $$4, gnq $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new brq($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gos($$4, $$5);
   }

   public void a(gff $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         got.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            glt $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<got.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  flz.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == got.c.a) {
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

   public void a(fbr $$0) {
      this.k = $$0;
   }

   public fbr e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(got.b $$0, gor $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(got.b.a $$0) {
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

   public CompletableFuture<Void> a(fgk $$0, fgo $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpo $$2 = bpi.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fgo.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fgi.a $$0, fgo $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpo $$2 = bpi.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fgo.b();
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
      public static final got.a a = new got.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return false;
         }
      };
      public static final got.a b = new got.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return true;
         }
      };
      final Set<glq> c = new ObjectArraySet(glq.Q().size());
      final List<duq> d = Lists.newArrayList();
      gov e = new gov();
      @Nullable
      fgk.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(glq $$0) {
         return !this.c.contains($$0);
      }

      public List<duq> b() {
         return this.d;
      }

      public boolean a(jm $$0, jm $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<got.a> c = new AtomicReference<>(got.a.a);
      public final AtomicReference<got.d> d = new AtomicReference<>(null);
      @Nullable
      private got.b.b f;
      @Nullable
      private got.b.c g;
      private final Set<duq> h = Sets.newHashSet();
      private final Map<glq, fgo> i = glq.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fgo(fef.b)));
      private fbm j;
      private boolean k = true;
      long l = kj.b(-1, -1, -1);
      final jh.a m = new jh.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         dzj $$1 = got.this.i.a(kj.b($$0), kj.d($$0), eak.n, false);
         return $$1 != null && got.this.i.C_().a(kj.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kj.a(this.l, jm.e))
               && this.b(kj.a(this.l, jm.c))
               && this.b(kj.a(this.l, jm.f))
               && this.b(kj.a(this.l, jm.d))
               && this.b(kj.a(this.l, -1, 0, -1))
               && this.b(kj.a(this.l, -1, 0, 1))
               && this.b(kj.a(this.l, 1, 0, -1))
               && this.b(kj.a(this.l, 1, 0, 1));
      }

      public fbm b() {
         return this.j;
      }

      public fgo a(glq $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kj.c(kj.b($$0));
         int $$2 = kj.c(kj.c($$0));
         int $$3 = kj.c(kj.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fbm((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fli $$0 = flz.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public got.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(got.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fgo::close);
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

      public void a(got $$0) {
         this.g = new got.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(glq.f());
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

      public got.b.a a(gor $$0) {
         this.m();
         goq $$1 = $$0.a(got.this.i, kj.a(this.l));
         boolean $$2 = this.c.get() != got.a.a;
         this.f = new got.b.b($$1, $$2);
         return this.f;
      }

      public void a(got $$0, gor $$1) {
         got.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<duq> $$0) {
         Set<duq> $$1 = Sets.newHashSet($$0);
         Set<duq> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         got.this.j.a($$2, $$1);
      }

      public void b(gor $$0) {
         got.b.a $$1 = this.a($$0);
         $$1.a(got.this.c);
      }

      void a(got.a $$0) {
         this.c.set($$0);
         got.this.j.a(this);
      }

      fgt o() {
         fbr $$0 = got.this.e();
         return fgt.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<got.c> a(glt var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jh d() {
            return b.this.m;
         }
      }

      class b extends got.b.a {
         @Nullable
         protected volatile goq e;

         public b(@Nullable final goq $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<got.c> a(glt $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(got.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(got.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(got.c.b);
            } else {
               goq $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(got.a.b);
                  return CompletableFuture.completedFuture(got.c.a);
               } else {
                  kj $$2 = kj.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(got.c.b);
                  } else {
                     gos.a $$4;
                     try (bpo $$3 = bpi.a().d("Compile Section")) {
                        $$4 = got.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     got.d $$6 = got.d.a(got.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(got.c.b);
                     } else {
                        got.a $$7 = new got.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(got.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return ae.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              flz.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return got.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return got.c.a;
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

      class c extends got.b.a {
         private final got.a f;

         public c(final got.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<got.c> a(glt $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(got.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(got.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(got.c.b);
            } else {
               fgk.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(glq.f())) {
                  fgt $$2 = b.this.o();
                  got.d $$3 = got.d.a(got.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(got.c.b);
                  } else {
                     fgi.a $$4 = $$1.a($$0.a(glq.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(got.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(got.c.b);
                     } else {
                        CompletableFuture<got.c> $$5 = got.this.a($$4, b.this.a(glq.f())).thenApply($$0x -> got.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              flz.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return got.c.b;
                           } else {
                              b.this.d.set($$3);
                              return got.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(got.c.b);
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

      public static got.d a(fbr $$0, long $$1) {
         return new got.d().b($$0, $$1);
      }

      public got.d b(fbr $$0, long $$1) {
         this.a = a($$0.a(), kj.b($$1));
         this.b = a($$0.b(), kj.c($$1));
         this.c = a($$0.c(), kj.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = kj.b($$0) - $$1;
         return azu.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof got.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
