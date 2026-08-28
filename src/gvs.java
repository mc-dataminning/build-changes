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

public class gvs {
   private final gvn a = new gvn();
   final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gsq c;
   private final gsr d;
   private volatile int e;
   volatile boolean f;
   private final bti g;
   private final af h;
   gmd i;
   final grx j;
   private ffs k = ffs.c;
   final gvr l;

   public gvs(gmd $$0, grx $$1, af $$2, gsk $$3, gtf $$4, guo $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bti($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gvr($$4, $$5);
   }

   public void a(gmd $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         gvs.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gsq $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.<CompletableFuture<gvs.d>>supplyAsync(() -> $$0.a($$1), this.h.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  frf.Q().a(p.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == gvs.d.a) {
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

   public void a(ffs $$0) {
      this.k = $$0;
   }

   public ffs e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gvs.b $$0, gvq $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(gvs.b.a $$0) {
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
      public static final gvs.a a = new gvs.a() {
         @Override
         public boolean a(jc $$0, jc $$1) {
            return false;
         }
      };
      public static final gvs.a b = new gvs.a() {
         @Override
         public boolean a(jc $$0, jc $$1) {
            return true;
         }
      };
      final Set<gsn> c = new ObjectArraySet(gsn.N().size());
      final List<dye> d = Lists.newArrayList();
      gvu e = new gvu();
      @Nullable
      flp.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gsn $$0) {
         return !this.c.contains($$0);
      }

      public List<dye> b() {
         return this.d;
      }

      public boolean a(jc $$0, jc $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gvs.a> c = new AtomicReference<>(gvs.a.a);
      public final AtomicReference<gvs.e> d = new AtomicReference<>(null);
      @Nullable
      private gvs.b.b f;
      @Nullable
      private gvs.b.c g;
      private final Set<dye> h = Sets.newHashSet();
      private final Map<gsn, gvs.c> i = new HashMap<>();
      private ffn j;
      private boolean k = true;
      volatile long l = jz.b(-1, -1, -1);
      final iw.a m = new iw.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         edd $$1 = gvs.this.i.a(jz.b($$0), jz.d($$0), eee.n, false);
         return $$1 != null && gvs.this.i.B_().a(jz.f($$0));
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(jz.a(this.l, jc.e))
               && this.b(jz.a(this.l, jc.c))
               && this.b(jz.a(this.l, jc.f))
               && this.b(jz.a(this.l, jc.d))
               && this.b(jz.a(this.l, -1, 0, -1))
               && this.b(jz.a(this.l, -1, 0, 1))
               && this.b(jz.a(this.l, 1, 0, -1))
               && this.b(jz.a(this.l, 1, 0, 1));
      }

      public ffn b() {
         return this.j;
      }

      @Nullable
      public gvs.c a(gsn $$0) {
         return this.i.get($$0);
      }

      public CompletableFuture<Void> a(gsn $$0, flp $$1) {
         if (gvs.this.f) {
            $$1.close();
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(
               () -> {
                  try (bri $$2 = brc.a().d("Upload Section Layer")) {
                     flb $$3 = RenderSystem.getDevice().b();
                     if (this.i.containsKey($$0)) {
                        gvs.c $$4 = this.i.get($$0);
                        if ($$4.a.a() < $$1.a().remaining()) {
                           $$4.a.close();
                           $$4.b(
                              RenderSystem.getDevice()
                                 .a(
                                    () -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jz.b(this.l) + ", " + jz.c(this.l) + ", " + jz.d(this.l),
                                    fig.a,
                                    fih.b,
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
                                             + jz.b(this.l)
                                             + ", "
                                             + jz.c(this.l)
                                             + ", "
                                             + jz.d(this.l),
                                       fig.b,
                                       fih.b,
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
                        fii $$5 = RenderSystem.getDevice()
                           .a(
                              () -> "Section vertex buffer - layer: " + $$0.c() + "; cords: " + jz.b(this.l) + ", " + jz.c(this.l) + ", " + jz.d(this.l),
                              fig.a,
                              fih.b,
                              $$1.a()
                           );
                        fii $$6 = $$1.b() != null
                           ? RenderSystem.getDevice()
                              .a(
                                 () -> "Section index buffer - layer: " + $$0.c() + "; cords: " + jz.b(this.l) + ", " + jz.c(this.l) + ", " + jz.d(this.l),
                                 fig.b,
                                 fih.b,
                                 $$1.b()
                              )
                           : null;
                        gvs.c $$7 = new gvs.c($$5, $$6, $$1.c().c(), $$1.c().e());
                        this.i.put($$0, $$7);
                     }

                     $$1.close();
                  }
               },
               gvs.this.b::add
            );
         }
      }

      public CompletableFuture<Void> a(fln.a $$0, gsn $$1) {
         if (gvs.this.f) {
            $$0.close();
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(
               () -> {
                  try (bri $$2 = brc.a().d("Upload Section Indices")) {
                     gvs.c $$3 = this.a($$1);
                     if ($$3.b == null) {
                        $$3.a(
                           RenderSystem.getDevice()
                              .a(
                                 () -> "Section index buffer - layer: " + $$1.c() + "; cords: " + jz.b(this.l) + ", " + jz.c(this.l) + ", " + jz.d(this.l),
                                 fig.b,
                                 fih.b,
                                 $$0.a()
                              )
                        );
                     } else {
                        flb $$4 = RenderSystem.getDevice().b();
                        if (!$$3.b.d()) {
                           $$4.a($$3.b, $$0.a(), 0);
                        }
                     }

                     $$0.close();
                  }
               },
               gvs.this.b::add
            );
         }
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = jz.c(jz.b($$0));
         int $$2 = jz.c(jz.c($$0));
         int $$3 = jz.c(jz.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new ffn((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fqn $$0 = frf.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public gvs.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(gvs.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(gvs.c::close);
      }

      public iw f() {
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

      public long a(jc $$0) {
         return jz.a(this.l, $$0);
      }

      public void a(gvs $$0) {
         this.g = new gvs.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gsn.g());
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

      public gvs.b.a a(gvq $$0) {
         this.m();
         gvp $$1 = $$0.a(gvs.this.i, jz.a(this.l));
         boolean $$2 = this.c.get() != gvs.a.a;
         this.f = new gvs.b.b($$1, $$2);
         return this.f;
      }

      public void a(gvs $$0, gvq $$1) {
         gvs.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dye> $$0) {
         Set<dye> $$1 = Sets.newHashSet($$0);
         Set<dye> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gvs.this.j.a($$2, $$1);
      }

      public void b(gvq $$0) {
         gvs.b.a $$1 = this.a($$0);
         $$1.a(gvs.this.c);
      }

      void a(gvs.a $$0) {
         this.c.set($$0);
         gvs.this.j.a(this);
      }

      flx a(jz $$0) {
         ffs $$1 = gvs.this.e();
         return flx.a((float)($$1.d - (double)$$0.d()), (float)($$1.e - (double)$$0.e()), (float)($$1.f - (double)$$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<gvs.d> a(gsq var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public iw d() {
            return b.this.m;
         }
      }

      class b extends gvs.b.a {
         @Nullable
         protected volatile gvp e;

         public b(@Nullable final gvp $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gvs.d> a(gsq $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gvs.d.b);
            } else {
               gvp $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(gvs.a.b);
                  return CompletableFuture.completedFuture(gvs.d.a);
               } else {
                  long $$2 = b.this.l;
                  jz $$3 = jz.a($$2);
                  if (this.a.get()) {
                     return CompletableFuture.completedFuture(gvs.d.b);
                  } else {
                     gvr.a $$5;
                     try (bri $$4 = brc.a().d("Compile Section")) {
                        $$5 = gvs.this.l.a($$3, $$1, b.this.a($$3), $$0);
                     }

                     gvs.e $$7 = gvs.e.a(gvs.this.e(), $$2);
                     b.this.a($$5.a);
                     if (this.a.get()) {
                        $$5.a();
                        return CompletableFuture.completedFuture(gvs.d.b);
                     } else {
                        gvs.a $$8 = new gvs.a();
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
                              frf.Q().a(p.a($$3x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gvs.d.b;
                           } else {
                              b.this.a($$8);
                              b.this.d.set($$7);
                              return gvs.d.a;
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

      class c extends gvs.b.a {
         private final gvs.a f;

         public c(final gvs.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gvs.d> a(gsq $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(gvs.d.b);
            } else {
               flp.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gsn.g())) {
                  long $$2 = b.this.l;
                  flx $$3 = b.this.a(jz.a($$2));
                  gvs.e $$4 = gvs.e.a(gvs.this.e(), $$2);
                  if ($$4.equals(b.this.d.get()) && !$$4.a()) {
                     return CompletableFuture.completedFuture(gvs.d.b);
                  } else {
                     fln.a $$5 = $$1.a($$0.a(gsn.g()), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(gvs.d.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(gvs.d.b);
                     } else {
                        CompletableFuture<gvs.d> $$6 = b.this.a($$5, gsn.g()).thenApply($$0x -> gvs.d.b);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              frf.Q().a(p.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return gvs.d.b;
                           } else {
                              b.this.d.set($$4);
                              return gvs.d.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(gvs.d.b);
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
      fii a;
      @Nullable
      fii b;
      private int c;
      private flu.b d;

      public c(fii $$0, @Nullable fii $$1, int $$2, flu.b $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fii a() {
         return this.a;
      }

      @Nullable
      public fii b() {
         return this.b;
      }

      public void a(@Nullable fii $$0) {
         this.b = $$0;
      }

      public int c() {
         return this.c;
      }

      public flu.b d() {
         return this.d;
      }

      public void a(flu.b $$0) {
         this.d = $$0;
      }

      public void a(int $$0) {
         this.c = $$0;
      }

      public void b(fii $$0) {
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

      public static gvs.e a(ffs $$0, long $$1) {
         return new gvs.e().b($$0, $$1);
      }

      public gvs.e b(ffs $$0, long $$1) {
         this.a = a($$0.a(), jz.b($$1));
         this.b = a($$0.b(), jz.c($$1));
         this.c = a($$0.c(), jz.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = jz.b($$0) - $$1;
         return azq.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof gvs.e $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
