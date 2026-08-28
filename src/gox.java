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

public class gox {
   private final gos a = new gos();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final glx c;
   private final gly d;
   private volatile int e;
   private volatile boolean f;
   private final bry g;
   private final ad h;
   gfj i;
   final glg j;
   private fbx k = fbx.c;
   final gow l;

   public gox(gfj $$0, glg $$1, ad $$2, gls $$3, gmn $$4, gnu $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bry($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gow($$4, $$5);
   }

   public void a(gfj $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gox.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            glx $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gox.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fmf.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gox.c.a) {
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

   public void a(gox.b $$0, gov $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gox.b.a $$0) {
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
            try (bpx $$2 = bpr.a().d("Upload Section Layer")) {
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
            try (bpx $$2 = bpr.a().d("Upload Section Indices")) {
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
      public static final gox.a a = new gox.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return false;
         }
      };
      public static final gox.a b = new gox.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return true;
         }
      };
      final Set<glu> c = new ObjectArraySet(glu.M().size());
      final List<duw> d = Lists.newArrayList();
      goz e = new goz();
      @Nullable
      fgq.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(glu $$0) {
         return !this.c.contains($$0);
      }

      public List<duw> b() {
         return this.d;
      }

      public boolean a(jm $$0, jm $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gox.a> c = new AtomicReference<>(gox.a.a);
      public final AtomicReference<gox.d> d = new AtomicReference<>(null);
      @Nullable
      private gox.b.b f;
      @Nullable
      private gox.b.c g;
      private final Set<duw> h = Sets.newHashSet();
      private final Map<glu, fgu> i = glu.M().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fgu(fel.b)));
      private fbs j;
      private boolean k = true;
      long l = kj.b(-1, -1, -1);
      final jh.a m = new jh.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return gox.this.i.a(kj.b($$0), kj.d($$0), eaq.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kj.a(this.l, jm.e)) && this.b(kj.a(this.l, jm.c)) && this.b(kj.a(this.l, jm.f)) && this.b(kj.a(this.l, jm.d));
      }

      public fbs b() {
         return this.j;
      }

      public fgu a(glu $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kj.c(kj.b($$0));
         int $$2 = kj.c(kj.c($$0));
         int $$3 = kj.c(kj.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fbs((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         flo $$0 = fmf.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gox.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gox.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fgu::close);
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

      public void a(gox $$0) {
         this.g = new gox.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(glu.f());
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

      public gox.b.a a(gov $$0) {
         this.m();
         gou $$1 = $$0.a(gox.this.i, kj.a(this.l));
         boolean $$2 = this.c.get() != gox.a.a;
         this.f = new gox.b.b($$1, $$2);
         return this.f;
      }

      public void a(gox $$0, gov $$1) {
         gox.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<duw> $$0) {
         Set<duw> $$1 = Sets.newHashSet($$0);
         Set<duw> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gox.this.j.a($$2, $$1);
      }

      public void b(gov $$0) {
         gox.b.a $$1 = this.a($$0);
         $$1.a(gox.this.c);
      }

      void a(gox.a $$0) {
         this.c.set($$0);
         gox.this.j.a(this);
      }

      fgz o() {
         fbx $$0 = gox.this.e();
         return fgz.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gox.c> a(glx var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jh d() {
            return b.this.m;
         }
      }

      class b extends gox.b.a {
         @Nullable
         protected volatile gou e;

         public b(@Nullable final gou $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gox.c> a(glx $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gox.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(gox.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gox.c.b);
            } else {
               gou $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gox.a.b);
                  return CompletableFuture.completedFuture(gox.c.a);
               } else {
                  kj $$2 = kj.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gox.c.b);
                  } else {
                     gow.a $$4;
                     try (bpx $$3 = bpr.a().d("Compile Section")) {
                        $$4 = gox.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     gox.d $$6 = gox.d.a(gox.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(gox.c.b);
                     } else {
                        gox.a $$7 = new gox.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(gox.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return ae.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              fmf.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gox.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return gox.c.a;
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

      class c extends gox.b.a {
         private final gox.a f;

         public c(final gox.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gox.c> a(glx $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gox.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(gox.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(gox.c.b);
            } else {
               fgq.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(glu.f())) {
                  fgz $$2 = b.this.o();
                  gox.d $$3 = gox.d.a(gox.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(gox.c.b);
                  } else {
                     fgo.a $$4 = $$1.a($$0.a(glu.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(gox.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(gox.c.b);
                     } else {
                        CompletableFuture<gox.c> $$5 = gox.this.a($$4, b.this.a(glu.f())).thenApply($$0x -> gox.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fmf.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gox.c.b;
                           } else {
                              b.this.d.set($$3);
                              return gox.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gox.c.b);
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

      public static gox.d a(fbx $$0, long $$1) {
         return new gox.d().b($$0, $$1);
      }

      public gox.d b(fbx $$0, long $$1) {
         this.a = a($$0.a(), kj.b($$1));
         this.b = a($$0.b(), kj.c($$1));
         this.c = a($$0.c(), kj.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = kj.b($$0) - $$1;
         return bae.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gox.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
