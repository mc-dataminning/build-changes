import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.primitives.Doubles;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
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
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gee {
   private static final int a = 2;
   private final PriorityBlockingQueue<gee.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<gee.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final gbp f;
   private final gbq g;
   private volatile int h;
   private volatile boolean i;
   private final bnj<Runnable> j;
   private final Executor k;
   fvm l;
   final gbc m;
   private etf n = etf.b;

   public gee(fvm $$0, gbc $$1, Executor $$2, gbk $$3) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bnj.a($$2, "Section Renderer");
      this.j.a(this::j);
   }

   public void a(fvm $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         gee.b.a $$0 = this.k();
         if ($$0 != null) {
            gbp $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  fcu.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == gee.c.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.g.a($$1);
                     this.j();
                  });
               }
            });
         }
      }
   }

   @Nullable
   private gee.b.a k() {
      if (this.d <= 0) {
         gee.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      gee.b.a $$1 = this.b.poll();
      if ($$1 != null) {
         this.d--;
         return $$1;
      } else {
         this.d = 2;
         return this.c.poll();
      }
   }

   public String a() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.h, this.e.size(), this.g.c());
   }

   public int b() {
      return this.h;
   }

   public int c() {
      return this.e.size();
   }

   public int d() {
      return this.g.c();
   }

   public void a(etf $$0) {
      this.n = $$0;
   }

   public etf e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(gee.b $$0, ged $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(gee.b.a $$0) {
      if (!this.i) {
         this.j.a(() -> {
            if (!this.i) {
               if ($$0.c) {
                  this.b.offer($$0);
               } else {
                  this.c.offer($$0);
               }

               this.h = this.b.size() + this.c.size();
               this.j();
            }
         });
      }
   }

   public CompletableFuture<Void> a(exi.b $$0, exq $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.e();
         } else {
            $$1.a();
            $$1.a($$0);
            exq.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         gee.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         gee.b.a $$1 = this.c.poll();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.h = 0;
   }

   public boolean h() {
      return this.h == 0 && this.e.isEmpty();
   }

   public void i() {
      this.i = true;
      this.l();
      this.f();
   }

   public static class a {
      public static final gee.a a = new gee.a() {
         @Override
         public boolean a(ir $$0, ir $$1) {
            return false;
         }
      };
      final Set<gbm> b = new ObjectArraySet(gbm.H().size());
      final List<dnd> c = Lists.newArrayList();
      geg d = new geg();
      @Nullable
      exi.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(gbm $$0) {
         return !this.b.contains($$0);
      }

      public List<dnd> b() {
         return this.c;
      }

      public boolean a(ir $$0, ir $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<gee.a> c = new AtomicReference<>(gee.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private gee.b.b f;
      @Nullable
      private gee.b.c g;
      private final Set<dnd> h = Sets.newHashSet();
      private final Map<gbm, exq> i = gbm.H().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new exq(exq.a.a)));
      private eta j;
      private boolean k = true;
      final im.a l = new im.a(-1, -1, -1);
      private final im.a[] m = ac.a(new im.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new im.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(im $$0) {
         return gee.this.l.a(jo.a($$0.u()), jo.a($$0.w()), dst.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ir.e.ordinal()]) && this.a(this.m[ir.c.ordinal()]) && this.a(this.m[ir.f.ordinal()]) && this.a(this.m[ir.d.ordinal()]);
      }

      public eta b() {
         return this.j;
      }

      public exq a(gbm $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new eta((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ir $$3 : ir.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         fcf $$0 = fcu.Q().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(exi $$0) {
         $$0.a(exs.b.h, exl.j);
      }

      public gee.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(gee.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(exq::close);
      }

      public im f() {
         return this.l;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.k;
         this.k = true;
         this.n = $$0 | ($$1 && this.n);
      }

      public void g() {
         this.k = false;
         this.n = false;
      }

      public boolean h() {
         return this.k;
      }

      public boolean i() {
         return this.k && this.n;
      }

      public im a(ir $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(gbm $$0, gee $$1) {
         gee.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new gee.b.c(this.c(), $$2);
            $$1.a(this.g);
            return true;
         }
      }

      protected boolean j() {
         boolean $$0 = false;
         if (this.f != null) {
            this.f.a();
            this.f = null;
            $$0 = true;
         }

         if (this.g != null) {
            this.g.a();
            this.g = null;
         }

         return $$0;
      }

      public gee.b.a a(ged $$0) {
         boolean $$1 = this.j();
         im $$2 = this.l.i();
         int $$3 = 1;
         gec $$4 = $$0.a(gee.this.l, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == gee.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new gee.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(gee $$0, ged $$1) {
         gee.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dnd> $$0) {
         Set<dnd> $$1 = Sets.newHashSet($$0);
         Set<dnd> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         gee.this.m.a($$2, $$1);
      }

      public void b(ged $$0) {
         gee.b.a $$1 = this.a($$0);
         $$1.a(gee.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         im $$3 = this.f();
         return $$0 == jo.a($$3.u()) || $$2 == jo.a($$3.w()) || $$1 == jo.a($$3.v());
      }

      abstract class a implements Comparable<gee.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<gee.c> a(gbp var1);

         public abstract void a();

         protected abstract String b();

         public int a(gee.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends gee.b.a {
         @Nullable
         protected gec e;

         public b(double $$0, @Nullable gec $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<gee.c> a(gbp $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gee.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(gee.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gee.c.b);
            } else {
               etf $$1 = gee.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               gee.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(exi.b::e);
                  return CompletableFuture.completedFuture(gee.c.b);
               } else {
                  gee.a $$6 = new gee.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(gee.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.e($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        fcu.Q().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return gee.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        gee.this.m.a(b.this);
                        return gee.c.a;
                     }
                  });
               }
            }
         }

         private gee.b.b.a a(float $$0, float $$1, float $$2, gbp $$3) {
            gee.b.b.a $$4 = new gee.b.b.a();
            int $$5 = 1;
            im $$6 = b.this.l.i();
            im $$7 = $$6.b(15, 15, 15);
            gef $$8 = new gef();
            gec $$9 = this.e;
            this.e = null;
            exn $$10 = new exn();
            if ($$9 != null) {
               gca.a();
               Set<gbm> $$11 = new ReferenceArraySet(gbm.H().size());
               ayd $$12 = ayd.a();
               gby $$13 = fcu.Q().ap();

               for (im $$14 : im.c($$6, $$7)) {
                  dpy $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dnd $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  elr $$17 = $$15.u();
                  if (!$$17.c()) {
                     gbm $$18 = gaz.a($$17);
                     exi $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != djb.a) {
                     gbm $$20 = gaz.a($$15);
                     exi $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(gbm.f())) {
                  exi $$22 = $$3.a(gbm.f());
                  if (!$$22.b()) {
                     $$22.a(exv.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (gbm $$23 : $$11) {
                  exi.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               gca.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dnd> void a(gee.b.b.a $$0, E $$1) {
            gde<E> $$2 = fcu.Q().ar().a($$1);
            if ($$2 != null) {
               $$0.b.add($$1);
               if ($$2.a($$1)) {
                  $$0.a.add($$1);
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

         static final class a {
            public final List<dnd> a = new ArrayList<>();
            public final List<dnd> b = new ArrayList<>();
            public final Map<gbm, exi.b> c = new Reference2ObjectArrayMap();
            public geg d = new geg();
            @Nullable
            public exi.c e;
         }
      }

      class c extends gee.b.a {
         private final gee.a f;

         public c(double $$0, gee.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<gee.c> a(gbp $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(gee.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(gee.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(gee.c.b);
            } else {
               etf $$1 = gee.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               exi.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(gbm.f())) {
                  exi $$6 = $$0.a(gbm.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(exv.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  exi.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(gee.c.b);
                  } else {
                     CompletableFuture<gee.c> $$8 = gee.this.a($$7, b.this.a(gbm.f())).thenApply($$0x -> gee.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           fcu.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? gee.c.b : gee.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(gee.c.b);
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
