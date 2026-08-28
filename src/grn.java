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

public class grn {
   private final gri a = new gri();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gol c;
   private final gom d;
   private volatile int e;
   private volatile boolean f;
   private final bsg g;
   private final ae h;
   ghz i;
   final gnu j;
   private fcu k = fcu.c;
   final grm l;

   public grn(ghz $$0, gnu $$1, ae $$2, gog $$3, gpc $$4, gqj $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bsg($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new grm($$4, $$5);
   }

   public void a(ghz $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         grn.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gol $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<grn.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fnd.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == grn.c.a) {
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

   public void a(fcu $$0) {
      this.k = $$0;
   }

   public fcu e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(grn.b $$0, grl $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(grn.b.a $$0) {
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

   public CompletableFuture<Void> a(fhn $$0, fhr $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqg $$2 = bqa.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fhr.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fhl.a $$0, fhr $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bqg $$2 = bqa.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fhr.b();
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
      public static final grn.a a = new grn.a() {
         @Override
         public boolean a(jo $$0, jo $$1) {
            return false;
         }
      };
      public static final grn.a b = new grn.a() {
         @Override
         public boolean a(jo $$0, jo $$1) {
            return true;
         }
      };
      final Set<goi> c = new ObjectArraySet(goi.Q().size());
      final List<dvl> d = Lists.newArrayList();
      grp e = new grp();
      @Nullable
      fhn.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(goi $$0) {
         return !this.c.contains($$0);
      }

      public List<dvl> b() {
         return this.d;
      }

      public boolean a(jo $$0, jo $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<grn.a> c = new AtomicReference<>(grn.a.a);
      public final AtomicReference<grn.d> d = new AtomicReference<>(null);
      @Nullable
      private grn.b.b f;
      @Nullable
      private grn.b.c g;
      private final Set<dvl> h = Sets.newHashSet();
      private final Map<goi, fhr> i = goi.Q().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fhr(ffi.b)));
      private fcp j;
      private boolean k = true;
      volatile long l = kl.b(-1, -1, -1);
      final jj.a m = new jj.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         eaj $$1 = grn.this.i.a(kl.b($$0), kl.d($$0), ebk.n, false);
         return $$1 != null && grn.this.i.x_().a(kl.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kl.a(this.l, jo.e))
               && this.b(kl.a(this.l, jo.c))
               && this.b(kl.a(this.l, jo.f))
               && this.b(kl.a(this.l, jo.d))
               && this.b(kl.a(this.l, -1, 0, -1))
               && this.b(kl.a(this.l, -1, 0, 1))
               && this.b(kl.a(this.l, 1, 0, -1))
               && this.b(kl.a(this.l, 1, 0, 1));
      }

      public fcp b() {
         return this.j;
      }

      public fhr a(goi $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kl.c(kl.b($$0));
         int $$2 = kl.c(kl.c($$0));
         int $$3 = kl.c(kl.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fcp((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fml $$0 = fnd.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public grn.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(grn.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fhr::close);
      }

      public jj f() {
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

      public long a(jo $$0) {
         return kl.a(this.l, $$0);
      }

      public void a(grn $$0) {
         this.g = new grn.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(goi.f());
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

      public grn.b.a a(grl $$0) {
         this.m();
         grk $$1 = $$0.a(grn.this.i, kl.a(this.l));
         boolean $$2 = this.c.get() != grn.a.a;
         this.f = new grn.b.b($$1, $$2);
         return this.f;
      }

      public void a(grn $$0, grl $$1) {
         grn.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dvl> $$0) {
         Set<dvl> $$1 = Sets.newHashSet($$0);
         Set<dvl> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         grn.this.j.a($$2, $$1);
      }

      public void b(grl $$0) {
         grn.b.a $$1 = this.a($$0);
         $$1.a(grn.this.c);
      }

      void a(grn.a $$0) {
         this.c.set($$0);
         grn.this.j.a(this);
      }

      fhw a(kl $$0) {
         fcu $$1 = grn.this.e();
         return fhw.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<grn.c> a(gol var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jj d() {
            return b.this.m;
         }
      }

      class b extends grn.b.a {
         @Nullable
         protected volatile grk e;

         public b(@Nullable final grk $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<grn.c> a(gol $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(grn.c.b);
            } else {
               grk $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(grn.a.b);
                  return CompletableFuture.completedFuture(grn.c.a);
               } else {
                  long $$2 = b.this.l;
                  kl $$3 = kl.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(grn.c.b);
                  } else {
                     grm.a $$5;
                     try (bqg $$4 = bqa.a().d("Compile Section")) {
                        $$5 = grn.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     grn.d $$7 = grn.d.a(grn.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(grn.c.b);
                     } else {
                        grn.a $$8 = new grn.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(grn.this.a($$3x, b.this.a($$2x)));
                           $$8.c.add($$2x);
                        });
                        return af.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              fnd.Q().a(o.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return grn.c.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return grn.c.a;
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

      class c extends grn.b.a {
         private final grn.a f;

         public c(final grn.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<grn.c> a(gol $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(grn.c.b);
            } else {
               fhn.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(goi.f())) {
                  long $$2 = b.this.l;
                  fhw $$3 = b.this.a(kl.a($$2));
                  grn.d $$4 = grn.d.a(grn.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(grn.c.b);
                  } else {
                     fhl.a $$5 = $$1.a($$0.a(goi.f()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(grn.c.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(grn.c.b);
                     } else {
                        CompletableFuture<grn.c> $$6 = grn.this.a($$5, b.this.a(goi.f())).thenApply($$0x -> grn.c.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fnd.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return grn.c.b;
                           } else {
                              b.this.d.set($$4);
                              return grn.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(grn.c.b);
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

      public static grn.d a(fcu $$0, long $$1) {
         return new grn.d().b($$0, $$1);
      }

      public grn.d b(fcu $$0, long $$1) {
         this.a = a($$0.a(), kl.b($$1));
         this.b = a($$0.b(), kl.c($$1));
         this.c = a($$0.c(), kl.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = kl.b($$0) - $$1;
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
            return !($$0 instanceof grn.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
