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

public class goy {
   private final got a = new got();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gly c;
   private final glz d;
   private volatile int e;
   private volatile boolean f;
   private final brz g;
   private final ad h;
   gfk i;
   final glh j;
   private fby k = fby.c;
   final gox l;

   public goy(gfk $$0, glh $$1, ad $$2, glt $$3, gmo $$4, gnv $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new brz($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gox($$4, $$5);
   }

   public void a(gfk $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         goy.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gly $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<goy.c>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fmg.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == goy.c.a) {
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

   public void a(fby $$0) {
      this.k = $$0;
   }

   public fby e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(goy.b $$0, gow $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(goy.b.a $$0) {
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

   public CompletableFuture<Void> a(fgr $$0, fgv $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpy $$2 = bps.a().d("Upload Section Layer")) {
               $$1.a();
               $$1.a($$0);
               fgv.b();
            }
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fgp.a $$0, fgv $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            try (bpy $$2 = bps.a().d("Upload Section Indices")) {
               $$1.a();
               $$1.a($$0);
               fgv.b();
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
      public static final goy.a a = new goy.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return false;
         }
      };
      public static final goy.a b = new goy.a() {
         @Override
         public boolean a(jm $$0, jm $$1) {
            return true;
         }
      };
      final Set<glv> c = new ObjectArraySet(glv.M().size());
      final List<dux> d = Lists.newArrayList();
      gpa e = new gpa();
      @Nullable
      fgr.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(glv $$0) {
         return !this.c.contains($$0);
      }

      public List<dux> b() {
         return this.d;
      }

      public boolean a(jm $$0, jm $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<goy.a> c = new AtomicReference<>(goy.a.a);
      public final AtomicReference<goy.d> d = new AtomicReference<>(null);
      @Nullable
      private goy.b.b f;
      @Nullable
      private goy.b.c g;
      private final Set<dux> h = Sets.newHashSet();
      private final Map<glv, fgv> i = glv.M().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fgv(fem.b)));
      private fbt j;
      private boolean k = true;
      long l = kj.b(-1, -1, -1);
      final jh.a m = new jh.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return goy.this.i.a(kj.b($$0), kj.d($$0), ear.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(kj.a(this.l, jm.e)) && this.b(kj.a(this.l, jm.c)) && this.b(kj.a(this.l, jm.f)) && this.b(kj.a(this.l, jm.d));
      }

      public fbt b() {
         return this.j;
      }

      public fgv a(glv $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = kj.c(kj.b($$0));
         int $$2 = kj.c(kj.c($$0));
         int $$3 = kj.c(kj.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new fbt((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         flp $$0 = fmg.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public goy.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(goy.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fgv::close);
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

      public void a(goy $$0) {
         this.g = new goy.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(glv.f());
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

      public goy.b.a a(gow $$0) {
         this.m();
         gov $$1 = $$0.a(goy.this.i, kj.a(this.l));
         boolean $$2 = this.c.get() != goy.a.a;
         this.f = new goy.b.b($$1, $$2);
         return this.f;
      }

      public void a(goy $$0, gow $$1) {
         goy.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dux> $$0) {
         Set<dux> $$1 = Sets.newHashSet($$0);
         Set<dux> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         goy.this.j.a($$2, $$1);
      }

      public void b(gow $$0) {
         goy.b.a $$1 = this.a($$0);
         $$1.a(goy.this.c);
      }

      void a(goy.a $$0) {
         this.c.set($$0);
         goy.this.j.a(this);
      }

      fha o() {
         fby $$0 = goy.this.e();
         return fha.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<goy.c> a(gly var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jh d() {
            return b.this.m;
         }
      }

      class b extends goy.b.a {
         @Nullable
         protected volatile gov e;

         public b(@Nullable final gov $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<goy.c> a(gly $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(goy.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(goy.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(goy.c.b);
            } else {
               gov $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(goy.a.b);
                  return CompletableFuture.completedFuture(goy.c.a);
               } else {
                  kj $$2 = kj.a(b.this.m);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(goy.c.b);
                  } else {
                     gox.a $$4;
                     try (bpy $$3 = bps.a().d("Compile Section")) {
                        $$4 = goy.this.l.a($$2, $$1, b.this.o(), $$0);
                     }

                     goy.d $$6 = goy.d.a(goy.this.e(), b.this.l);
                     b.this.a($$4.a);
                     if (this.a.get()) {
                        $$4.a();
                        return CompletableFuture.completedFuture(goy.c.b);
                     } else {
                        goy.a $$7 = new goy.a();
                        $$7.e = $$4.d;
                        $$7.d.addAll($$4.b);
                        $$7.f = $$4.e;
                        List<CompletableFuture<Void>> $$8 = new ArrayList<>($$4.c.size());
                        $$4.c.forEach(($$2x, $$3) -> {
                           $$8.add(goy.this.a($$3, b.this.a($$2x)));
                           $$7.c.add($$2x);
                        });
                        return ae.e($$8).handle(($$2x, $$3) -> {
                           if ($$3 != null && !($$3 instanceof CancellationException) && !($$3 instanceof InterruptedException)) {
                              fmg.Q().a(o.a($$3, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return goy.c.b;
                           } else {
                              b.this.a($$7);
                              b.this.d.set($$6);
                              return goy.c.a;
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

      class c extends goy.b.a {
         private final goy.a f;

         public c(final goy.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<goy.c> a(gly $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(goy.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(goy.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(goy.c.b);
            } else {
               fgr.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(glv.f())) {
                  fha $$2 = b.this.o();
                  goy.d $$3 = goy.d.a(goy.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(goy.c.b);
                  } else {
                     fgp.a $$4 = $$1.a($$0.a(glv.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(goy.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(goy.c.b);
                     } else {
                        CompletableFuture<goy.c> $$5 = goy.this.a($$4, b.this.a(glv.f())).thenApply($$0x -> goy.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fmg.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return goy.c.b;
                           } else {
                              b.this.d.set($$3);
                              return goy.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(goy.c.b);
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

      public static goy.d a(fby $$0, long $$1) {
         return new goy.d().b($$0, $$1);
      }

      public goy.d b(fby $$0, long $$1) {
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
            return !($$0 instanceof goy.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
