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

public class fvh {
   private static final int a = 2;
   private final PriorityBlockingQueue<fvh.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<fvh.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final fst f;
   private final fsu g;
   private volatile int h;
   private volatile boolean i;
   private final bie<Runnable> j;
   private final Executor k;
   fmt l;
   final fsg m;
   private elb n = elb.b;

   public fvh(fmt $$0, fsg $$1, Executor $$2, fso $$3) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bie.a($$2, "Section Renderer");
      this.j.a(this::j);
   }

   public void a(fmt $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         fvh.b.a $$0 = this.k();
         if ($$0 != null) {
            fst $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  euk.N().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == fvh.c.a) {
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
   private fvh.b.a k() {
      if (this.d <= 0) {
         fvh.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      fvh.b.a $$1 = this.b.poll();
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

   public void a(elb $$0) {
      this.n = $$0;
   }

   public elb e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(fvh.b $$0, fvg $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(fvh.b.a $$0) {
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

   public CompletableFuture<Void> a(eoy.b $$0, epg $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.e();
         } else {
            $$1.a();
            $$1.a($$0);
            epg.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         fvh.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         fvh.b.a $$1 = this.c.poll();
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
      public static final fvh.a a = new fvh.a() {
         @Override
         public boolean a(ia $$0, ia $$1) {
            return false;
         }
      };
      final Set<fsq> b = new ObjectArraySet(fsq.F().size());
      final List<dgd> c = Lists.newArrayList();
      fvj d = new fvj();
      @Nullable
      eoy.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(fsq $$0) {
         return !this.b.contains($$0);
      }

      public List<dgd> b() {
         return this.c;
      }

      public boolean a(ia $$0, ia $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<fvh.a> c = new AtomicReference<>(fvh.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private fvh.b.b f;
      @Nullable
      private fvh.b.c g;
      private final Set<dgd> h = Sets.newHashSet();
      private final Map<fsq, epg> i = fsq.F().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new epg(epg.a.a)));
      private ekw j;
      private boolean k = true;
      final hv.a l = new hv.a(-1, -1, -1);
      private final hv.a[] m = ac.a(new hv.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new hv.a();
         }
      });
      private boolean n;

      public b(int $$1, int $$2, int $$3, int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(hv $$0) {
         return fvh.this.l.a(ix.a($$0.u()), ix.a($$0.w()), dkq.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[ia.e.ordinal()]) && this.a(this.m[ia.c.ordinal()]) && this.a(this.m[ia.f.ordinal()]) && this.a(this.m[ia.d.ordinal()]);
      }

      public ekw b() {
         return this.j;
      }

      public epg a(fsq $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new ekw((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (ia $$3 : ia.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         etv $$0 = euk.N().j.m();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(eoy $$0) {
         $$0.a(epi.b.h, epb.j);
      }

      public fvh.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(fvh.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(epg::close);
      }

      public hv f() {
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

      public hv a(ia $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(fsq $$0, fvh $$1) {
         fvh.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new fvh.b.c(this.c(), $$2);
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

      public fvh.b.a a(fvg $$0) {
         boolean $$1 = this.j();
         hv $$2 = this.l.i();
         int $$3 = 1;
         fvf $$4 = $$0.a(fvh.this.l, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == fvh.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new fvh.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(fvh $$0, fvg $$1) {
         fvh.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dgd> $$0) {
         Set<dgd> $$1 = Sets.newHashSet($$0);
         Set<dgd> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         fvh.this.m.a($$2, $$1);
      }

      public void b(fvg $$0) {
         fvh.b.a $$1 = this.a($$0);
         $$1.a(fvh.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         hv $$3 = this.f();
         return $$0 == ix.a($$3.u()) || $$2 == ix.a($$3.w()) || $$1 == ix.a($$3.v());
      }

      abstract class a implements Comparable<fvh.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(double $$0, boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<fvh.c> a(fst var1);

         public abstract void a();

         protected abstract String b();

         public int a(fvh.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends fvh.b.a {
         @Nullable
         protected fvf e;

         public b(double $$0, @Nullable fvf $$1, boolean $$2) {
            super($$0, $$2);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<fvh.c> a(fst $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fvh.c.b);
            } else if (!b.this.a()) {
               this.e = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(fvh.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fvh.c.b);
            } else {
               elb $$1 = fvh.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fvh.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(eoy.b::e);
                  return CompletableFuture.completedFuture(fvh.c.b);
               } else {
                  fvh.a $$6 = new fvh.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(fvh.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.c($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        euk.N().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return fvh.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        fvh.this.m.a(b.this);
                        return fvh.c.a;
                     }
                  });
               }
            }
         }

         private fvh.b.b.a a(float $$0, float $$1, float $$2, fst $$3) {
            fvh.b.b.a $$4 = new fvh.b.b.a();
            int $$5 = 1;
            hv $$6 = b.this.l.i();
            hv $$7 = $$6.b(15, 15, 15);
            fvi $$8 = new fvi();
            fvf $$9 = this.e;
            this.e = null;
            epd $$10 = new epd();
            if ($$9 != null) {
               fte.a();
               Set<fsq> $$11 = new ReferenceArraySet(fsq.F().size());
               auf $$12 = auf.a();
               ftc $$13 = euk.N().am();

               for (hv $$14 : hv.a($$6, $$7)) {
                  dip $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dgd $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  edz $$17 = $$15.u();
                  if (!$$17.c()) {
                     fsq $$18 = fsd.a($$17);
                     eoy $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != dce.a) {
                     fsq $$20 = fsd.a($$15);
                     eoy $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(fsq.f())) {
                  eoy $$22 = $$3.a(fsq.f());
                  if (!$$22.b()) {
                     $$22.a(epl.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (fsq $$23 : $$11) {
                  eoy.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               fte.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dgd> void a(fvh.b.b.a $$0, E $$1) {
            fui<E> $$2 = euk.N().ao().a($$1);
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
            public final List<dgd> a = new ArrayList<>();
            public final List<dgd> b = new ArrayList<>();
            public final Map<fsq, eoy.b> c = new Reference2ObjectArrayMap();
            public fvj d = new fvj();
            @Nullable
            public eoy.c e;
         }
      }

      class c extends fvh.b.a {
         private final fvh.a f;

         public c(double $$0, fvh.a $$1) {
            super($$0, true);
            this.f = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<fvh.c> a(fst $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(fvh.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(fvh.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(fvh.c.b);
            } else {
               elb $$1 = fvh.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               eoy.c $$5 = this.f.e;
               if ($$5 != null && !this.f.a(fsq.f())) {
                  eoy $$6 = $$0.a(fsq.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(epl.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.f.e = $$6.a();
                  eoy.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(fvh.c.b);
                  } else {
                     CompletableFuture<fvh.c> $$8 = fvh.this.a($$7, b.this.a(fsq.f())).thenApply($$0x -> fvh.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           euk.N().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? fvh.c.b : fvh.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(fvh.c.b);
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
