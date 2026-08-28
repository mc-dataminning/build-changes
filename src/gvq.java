import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import javax.annotation.Nullable;

public class gvq {
   private final gvl a = new gvl();
   final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gso c;
   private final gsp d;
   private volatile int e;
   volatile boolean f;
   private final btg g;
   private final af h;
   gmb i;
   final grv j;
   private ffq k = ffq.c;
   final gvp l;

   public gvq(gmb $$0, grv $$1, af $$2, gsi $$3, gtd $$4, gum $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new btg($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gvp($$4, $$5);
   }

   public void a(gmb $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gvq.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gso $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gvq.d>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  frd.Q().a(p.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gvq.d.a) {
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

   public void a(ffq $$0) {
      this.k = $$0;
   }

   public ffq e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gvq.b $$0, gvo $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gvq.b.a $$0) {
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
      public static final gvq.a a = new gvq.a() {
         @Override
         public boolean a(jb $$0, jb $$1) {
            return false;
         }
      };
      public static final gvq.a b = new gvq.a() {
         @Override
         public boolean a(jb $$0, jb $$1) {
            return true;
         }
      };
      final Set<gsl> c = new ObjectArraySet(gsl.N().size());
      final List<dyc> d = Lists.newArrayList();
      gvs e = new gvs();
      @Nullable
      fln.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gsl $$0) {
         return !this.c.contains($$0);
      }

      public List<dyc> b() {
         return this.d;
      }

      public boolean a(jb $$0, jb $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gvq.a> c = new AtomicReference<>(gvq.a.a);
      public final AtomicReference<gvq.e> d = new AtomicReference<>(null);
      @Nullable
      private gvq.b.b f;
      @Nullable
      private gvq.b.c g;
      private final Set<dyc> h = Sets.newHashSet();
      private final Map<gsl, gvq.c> i = new HashMap<>();
      private ffl j;
      private boolean k = true;
      volatile long l = jy.b(-1, -1, -1);
      final iv.a m = new iv.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         edb $$1 = gvq.this.i.a(jy.b($$0), jy.d($$0), eec.n, false);
         return $$1 != null && gvq.this.i.B_().a(jy.f($$0));
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

      public ffl b() {
         return this.j;
      }

      @Nullable
      public gvq.c a(gsl $$0) {
         return this.i.get($$0);
      }

      public CompletableFuture<Void> a(gsl $$0, fln $$1) {
         if (gvq.this.f) {
            $$1.close();
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(
               () -> {
                  try (brg $$2 = bra.a().d("Upload Section Layer")) {
                     fkz $$3 = RenderSystem.getDevice().b();
                     if (this.i.containsKey($$0)) {
                        gvq.c $$4 = this.i.get($$0);
                        if ($$4.a.a() < $$1.a().remaining()) {
                           $$4.a.close();
                           $$4.b(
                              RenderSystem.getDevice()
                                 .a(
                                    () -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jy.b(this.l) + ", " + jy.c(this.l) + ", " + jy.d(this.l),
                                    fie.a,
                                    fif.b,
                                    $$1.a()
                                 )
                           );
                        } else if (!$$4.a.d()) {
                           $$3.a($$4.a, $$1.a(), 0);
                        }

                        if ($$1.b() != null) {
                           if ($$4.b != null && $$4.b.a() >= $$1.b().remaining()) {
                              if (!$$4.b.d()) {
                                 $$3.a($$4.b, $$1.b(), 0);
                              }
                           } else {
                              if ($$4.b != null) {
                                 $$4.b.close();
                              }

                              $$4.a(
                                 RenderSystem.getDevice()
                                    .a(
                                       () -> "Section index buffer - layer: "
                                             + $$0.c()
                                             + "; cords: "
                                             + jy.b(this.l)
                                             + ", "
                                             + jy.c(this.l)
                                             + ", "
                                             + jy.d(this.l),
                                       fie.b,
                                       fif.b,
                                       $$1.b()
                                    )
                              );
                           }
                        } else if ($$4.b != null) {
                           $$4.b.close();
                           $$4.a(null);
                        }

                        $$4.a($$1.c().c());
                        $$4.a($$1.c().e());
                     } else {
                        fig $$5 = RenderSystem.getDevice()
                           .a(
                              () -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jy.b(this.l) + ", " + jy.c(this.l) + ", " + jy.d(this.l),
                              fie.a,
                              fif.b,
                              $$1.a()
                           );
                        fig $$6 = $$1.b() != null
                           ? RenderSystem.getDevice()
                              .a(
                                 () -> "Section index buffer - layer: " + $$0.c() + "; cords: " + jy.b(this.l) + ", " + jy.c(this.l) + ", " + jy.d(this.l),
                                 fie.b,
                                 fif.b,
                                 $$1.b()
                              )
                           : null;
                        gvq.c $$7 = new gvq.c($$5, $$6, $$1.c().c(), $$1.c().e());
                        this.i.put($$0, $$7);
                     }

                     $$1.close();
                  }
               },
               gvq.this.b::add
            );
         }
      }

      public CompletableFuture<Void> a(fll.a $$0, gsl $$1) {
         if (gvq.this.f) {
            $$0.close();
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(
               () -> {
                  try (brg $$2 = bra.a().d("Upload Section Indices")) {
                     gvq.c $$3 = this.a($$1);
                     if ($$3.b == null) {
                        $$3.a(
                           RenderSystem.getDevice()
                              .a(
                                 () -> "Section index buffer - layer: " + $$1.c() + "; cords: " + jy.b(this.l) + ", " + jy.c(this.l) + ", " + jy.d(this.l),
                                 fie.b,
                                 fif.b,
                                 $$0.a()
                              )
                        );
                     } else {
                        fkz $$4 = RenderSystem.getDevice().b();
                        if (!$$3.b.d()) {
                           $$4.a($$3.b, $$0.a(), 0);
                        }
                     }

                     $$0.close();
                  }
               },
               gvq.this.b::add
            );
         }
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jy.c(jy.b($$0));
         int $$2 = jy.c(jy.c($$0));
         int $$3 = jy.c(jy.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new ffl((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fql $$0 = frd.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gvq.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gvq.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(gvq.c::close);
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

      public void a(gvq $$0) {
         this.g = new gvq.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gsl.g());
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

      public gvq.b.a a(gvo $$0) {
         this.m();
         gvn $$1 = $$0.a(gvq.this.i, jy.a(this.l));
         boolean $$2 = this.c.get() != gvq.a.a;
         this.f = new gvq.b.b($$1, $$2);
         return this.f;
      }

      public void a(gvq $$0, gvo $$1) {
         gvq.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dyc> $$0) {
         Set<dyc> $$1 = Sets.newHashSet($$0);
         Set<dyc> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gvq.this.j.a($$2, $$1);
      }

      public void b(gvo $$0) {
         gvq.b.a $$1 = this.a($$0);
         $$1.a(gvq.this.c);
      }

      void a(gvq.a $$0) {
         this.c.set($$0);
         gvq.this.j.a(this);
      }

      flv a(jy $$0) {
         ffq $$1 = gvq.this.e();
         return flv.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gvq.d> a(gso var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iv d() {
            return b.this.m;
         }
      }

      class b extends gvq.b.a {
         @Nullable
         protected volatile gvn e;

         public b(@Nullable final gvn $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gvq.d> a(gso $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gvq.d.b);
            } else {
               gvn $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gvq.a.b);
                  return CompletableFuture.completedFuture(gvq.d.a);
               } else {
                  long $$2 = b.this.l;
                  jy $$3 = jy.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gvq.d.b);
                  } else {
                     gvp.a $$5;
                     try (brg $$4 = bra.a().d("Compile Section")) {
                        $$5 = gvq.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gvq.e $$7 = gvq.e.a(gvq.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gvq.d.b);
                     } else {
                        gvq.a $$8 = new gvq.a();
                        $$8.e = $$5.d;
                        $$8.d.addAll($$5.b);
                        $$8.f = $$5.e;
                        List<CompletableFuture<Void>> $$9 = new ArrayList<>($$5.c.size());
                        $$5.c.forEach(($$2x, $$3x) -> {
                           $$9.add(b.this.a($$2x, $$3x));
                           $$8.c.add($$2x);
                        });
                        return ag.e($$9).handle(($$2x, $$3x) -> {
                           if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                              frd.Q().a(p.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gvq.d.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gvq.d.a;
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

      class c extends gvq.b.a {
         private final gvq.a f;

         public c(final gvq.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gvq.d> a(gso $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gvq.d.b);
            } else {
               fln.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gsl.g())) {
                  long $$2 = b.this.l;
                  flv $$3 = b.this.a(jy.a($$2));
                  gvq.e $$4 = gvq.e.a(gvq.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gvq.d.b);
                  } else {
                     fll.a $$5 = $$1.a($$0.a(gsl.g()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gvq.d.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gvq.d.b);
                     } else {
                        CompletableFuture<gvq.d> $$6 = b.this.a($$5, gsl.g()).thenApply($$0x -> gvq.d.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              frd.Q().a(p.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gvq.d.b;
                           } else {
                              b.this.d.set($$4);
                              return gvq.d.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gvq.d.b);
               }
            }
         }

         @Override
         public void a() {
            this.a.set(true);
         }
      }
   }

   public static final class c implements AutoCloseable {
      fig a;
      @Nullable
      fig b;
      private int c;
      private fls.b d;

      public c(fig $$0, @Nullable fig $$1, int $$2, fls.b $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fig a() {
         return this.a;
      }

      @Nullable
      public fig b() {
         return this.b;
      }

      public void a(@Nullable fig $$0) {
         this.b = $$0;
      }

      public int c() {
         return this.c;
      }

      public fls.b d() {
         return this.d;
      }

      public void a(fls.b $$0) {
         this.d = $$0;
      }

      public void a(int $$0) {
         this.c = $$0;
      }

      public void b(fig $$0) {
         this.a = $$0;
      }

      @Override
      public void close() {
         this.a.close();
         if (this.b != null) {
            this.b.close();
         }
      }
   }

   static enum d {
      a,
      b;
   }

   public static final class e {
      private int a;
      private int b;
      private int c;

      public static gvq.e a(ffq $$0, long $$1) {
         return new gvq.e().b($$0, $$1);
      }

      public gvq.e b(ffq $$0, long $$1) {
         this.a = a($$0.a(), jy.b($$1));
         this.b = a($$0.b(), jy.c($$1));
         this.c = a($$0.c(), jy.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = jy.b($$0) - $$1;
         return azo.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gvq.e $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
