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

public class fwf {
   private static final int a = 2;
   private final PriorityBlockingQueue<fwf.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<fwf.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final ftr f;
   private final fts g;
   private volatile int h;
   private volatile boolean i;
   private final bit<Runnable> j;
   private final Executor k;
   fnr l;
   final fte m;
   private els n = els.b;

   public fwf(fnr $$0, fte $$1, Executor $$2, ftm $$3) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bit.a($$2, "Section Renderer");
      this.j.a(this::j);
   }

   public void a(fnr $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         fwf.b.a $$0 = this.k();
         if ($$0 != null) {
            ftr $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  evh.O().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == fwf.c.a) {
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
   private fwf.b.a k() {
      if (this.d <= 0) {
         fwf.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      fwf.b.a $$1 = this.b.poll();
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

   public void a(els $$0) {
      this.n = $$0;
   }

   public els e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fwf.b $$0, fwe $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fwf.b.a $$0) {
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

   public CompletableFuture<Void> a(epv.b $$0, eqd $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.e();
         } else {
            $$1.a();
            $$1.a($$0);
            eqd.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         fwf.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         fwf.b.a $$1 = this.c.poll();
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
      public static final fwf.a a = new fwf.a() {
         @Override
         public boolean a(ic $$0, ic $$1) {
            return false;
         }
      };
      final Set<fto> b = new ObjectArraySet(fto.F().size());
      final List<dgu> c = Lists.newArrayList();
      fwh d = new fwh();
      @Nullable
      epv.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fto $$0) {
         return !this.b.contains($$0);
      }

      public List<dgu> b() {
         return this.c;
      }

      public boolean a(ic $$0, ic $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fwf.a> c = new AtomicReference<>(fwf.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fwf.b.b f;
      @Nullable
      private fwf.b.c g;
      private final Set<dgu> h = Sets.newHashSet();
      private final Map<fto, eqd> i = fto.F().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new eqd(eqd.a.a)));
      private eln j;
      private boolean k = true;
      final hx.a l = new hx.a(-1, -1, -1);
      private final hx.a[] m = ac.a(new hx.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new hx.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(hx $$0) {
         return fwf.this.l.a(iz.a($$0.u()), iz.a($$0.w()), dlh.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ic.e.ordinal()]) && this.a(this.m[ic.c.ordinal()]) && this.a(this.m[ic.f.ordinal()]) && this.a(this.m[ic.d.ordinal()]);
      }

      public eln b() {
         return this.j;
      }

      public eqd a(fto $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new eln((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ic $$3 : ic.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         eus $$0 = evh.O().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(epv $$0) {
         $$0.a(eqf.b.h, epy.j);
      }

      public fwf.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fwf.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(eqd::close);
      }

      public hx f() {
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

      public hx a(ic $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(fto $$0, fwf $$1) {
         fwf.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fwf.b.c(this.c(), $$2);
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

      public fwf.b.a a(fwe $$0) {
         boolean $$1 = this.j();
         hx $$2 = this.l.i();
         int $$3 = 1;
         fwd $$4 = $$0.a(fwf.this.l, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fwf.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fwf.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fwf $$0, fwe $$1) {
         fwf.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dgu> $$0) {
         Set<dgu> $$1 = Sets.newHashSet($$0);
         Set<dgu> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fwf.this.m.a($$2, $$1);
      }

      public void b(fwe $$0) {
         fwf.b.a $$1 = this.a($$0);
         $$1.a(fwf.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         hx $$3 = this.f();
         return $$0 == iz.a($$3.u()) || $$2 == iz.a($$3.w()) || $$1 == iz.a($$3.v());
      }

      abstract class a implements Comparable<fwf.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fwf.c> a(ftr var1);

         public abstract void a();

         protected abstract String b();

         public int a(fwf.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fwf.b.a {
         @Nullable
         protected fwd e;

         public b(double $$0, @Nullable fwd $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fwf.c> a(ftr $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fwf.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fwf.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fwf.c.b);
            } else {
               els $$1 = fwf.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fwf.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(epv.b::e);
                  return CompletableFuture.completedFuture(fwf.c.b);
               } else {
                  fwf.a $$6 = new fwf.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fwf.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        evh.O().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fwf.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fwf.this.m.a(b.this);
                        return fwf.c.a;
                     }
                  });
               }
            }
         }

         private fwf.b.b.a a(float $$0, float $$1, float $$2, ftr $$3) {
            fwf.b.b.a $$4 = new fwf.b.b.a();
            int $$5 = 1;
            hx $$6 = b.this.l.i();
            hx $$7 = $$6.b(15, 15, 15);
            fwg $$8 = new fwg();
            fwd $$9 = this.e;
            this.e = null;
            eqa $$10 = new eqa();
            if ($$9 != null) {
               fuc.a();
               Set<fto> $$11 = new ReferenceArraySet(fto.F().size());
               auu $$12 = auu.a();
               fua $$13 = evh.O().an();

               for (hx $$14 : hx.a($$6, $$7)) {
                  djg $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dgu $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eeq $$17 = $$15.u();
                  if (!$$17.c()) {
                     fto $$18 = ftb.a($$17);
                     epv $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != dcu.a) {
                     fto $$20 = ftb.a($$15);
                     epv $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fto.f())) {
                  epv $$22 = $$3.a(fto.f());
                  if (!$$22.b()) {
                     $$22.a(eqi.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (fto $$23 : $$11) {
                  epv.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fuc.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dgu> void a(fwf.b.b.a $$0, E $$1) {
            fvg<E> $$2 = evh.O().ap().a($$1);
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
            public final List<dgu> a = new ArrayList<>();
            public final List<dgu> b = new ArrayList<>();
            public final Map<fto, epv.b> c = new Reference2ObjectArrayMap();
            public fwh d = new fwh();
            @Nullable
            public epv.c e;
         }
      }

      class c extends fwf.b.a {
         private final fwf.a f;

         public c(double $$0, fwf.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fwf.c> a(ftr $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fwf.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fwf.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fwf.c.b);
            } else {
               els $$1 = fwf.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               epv.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fto.f())) {
                  epv $$6 = $$0.a(fto.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(eqi.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  epv.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fwf.c.b);
                  } else {
                     CompletableFuture<fwf.c> $$8 = fwf.this.a($$7, b.this.a(fto.f())).thenApply($$0x -> fwf.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           evh.O().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fwf.c.b : fwf.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fwf.c.b);
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
