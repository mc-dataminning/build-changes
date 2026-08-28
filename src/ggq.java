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

public class ggq {
   private static final int a = 2;
   private final PriorityBlockingQueue<ggq.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<ggq.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final geb f;
   private final gec g;
   private volatile int h;
   private volatile boolean i;
   private final bpp<Runnable> j;
   private final Executor k;
   fxx l;
   final gdo m;
   private evt n = evt.b;

   public ggq(fxx $$0, gdo $$1, Executor $$2, gdw $$3) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bpp.a($$2, "Section Renderer");
      this.j.a(this::j);
   }

   public void a(fxx $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         ggq.b.a $$0 = this.k();
         if ($$0 != null) {
            geb $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  ffh.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == ggq.c.a) {
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
   private ggq.b.a k() {
      if (this.d <= 0) {
         ggq.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      ggq.b.a $$1 = this.b.poll();
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

   public void a(evt $$0) {
      this.n = $$0;
   }

   public evt e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(ggq.b $$0, ggp $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(ggq.b.a $$0) {
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

   public CompletableFuture<Void> a(ezv.b $$0, fad $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.e();
         } else {
            $$1.a();
            $$1.a($$0);
            fad.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         ggq.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         ggq.b.a $$1 = this.c.poll();
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
      public static final ggq.a a = new ggq.a() {
         @Override
         public boolean a(je $$0, je $$1) {
            return false;
         }
      };
      final Set<gdy> b = new ObjectArraySet(gdy.H().size());
      final List<dpj> c = Lists.newArrayList();
      ggs d = new ggs();
      @Nullable
      ezv.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(gdy $$0) {
         return !this.b.contains($$0);
      }

      public List<dpj> b() {
         return this.c;
      }

      public boolean a(je $$0, je $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<ggq.a> c = new AtomicReference<>(ggq.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private ggq.b.b f;
      @Nullable
      private ggq.b.c g;
      private final Set<dpj> h = Sets.newHashSet();
      private final Map<gdy, fad> i = gdy.H().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fad(fad.a.a)));
      private evo j;
      private boolean k = true;
      final iz.a l = new iz.a(-1, -1, -1);
      private final iz.a[] m = ac.a(new iz.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new iz.a();
         }
      });
      private boolean n;

      public b(final int $$1, final int $$2, final int $$3, final int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(iz $$0) {
         return ggq.this.l.a(kb.a($$0.u()), kb.a($$0.w()), duz.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[je.e.ordinal()]) && this.a(this.m[je.c.ordinal()]) && this.a(this.m[je.f.ordinal()]) && this.a(this.m[je.d.ordinal()]);
      }

      public evo b() {
         return this.j;
      }

      public fad a(gdy $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new evo((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (je $$3 : je.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         fes $$0 = ffh.Q().j.l();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(ezv $$0) {
         $$0.a(faf.b.h, ezy.j);
      }

      public ggq.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(ggq.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(fad::close);
      }

      public iz f() {
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

      public iz a(je $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(gdy $$0, ggq $$1) {
         ggq.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new ggq.b.c(this.c(), $$2);
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

      public ggq.b.a a(ggp $$0) {
         boolean $$1 = this.j();
         iz $$2 = this.l.i();
         int $$3 = 1;
         ggo $$4 = $$0.a(ggq.this.l, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == ggq.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new ggq.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(ggq $$0, ggp $$1) {
         ggq.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dpj> $$0) {
         Set<dpj> $$1 = Sets.newHashSet($$0);
         Set<dpj> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         ggq.this.m.a($$2, $$1);
      }

      public void b(ggp $$0) {
         ggq.b.a $$1 = this.a($$0);
         $$1.a(ggq.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         iz $$3 = this.f();
         return $$0 == kb.a($$3.u()) || $$2 == kb.a($$3.w()) || $$1 == kb.a($$3.v());
      }

      abstract class a implements Comparable<ggq.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final double $$0, final boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<ggq.c> a(geb var1);

         public abstract void a();

         protected abstract String b();

         public int a(ggq.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends ggq.b.a {
         @Nullable
         protected ggo d;

         public b(final double $$0, @Nullable final ggo $$1, final boolean $$2) {
            super($$0, $$2);
            this.d = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<ggq.c> a(geb $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(ggq.c.b);
            } else if (!b.this.a()) {
               this.d = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(ggq.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(ggq.c.b);
            } else {
               evt $$1 = ggq.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               ggq.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(ezv.b::e);
                  return CompletableFuture.completedFuture(ggq.c.b);
               } else {
                  ggq.a $$6 = new ggq.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(ggq.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.e($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        ffh.Q().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return ggq.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        ggq.this.m.a(b.this);
                        return ggq.c.a;
                     }
                  });
               }
            }
         }

         private ggq.b.b.a a(float $$0, float $$1, float $$2, geb $$3) {
            ggq.b.b.a $$4 = new ggq.b.b.a();
            int $$5 = 1;
            iz $$6 = b.this.l.i();
            iz $$7 = $$6.b(15, 15, 15);
            ggr $$8 = new ggr();
            ggo $$9 = this.d;
            this.d = null;
            faa $$10 = new faa();
            if ($$9 != null) {
               gem.a();
               Set<gdy> $$11 = new ReferenceArraySet(gdy.H().size());
               azh $$12 = azh.a();
               gek $$13 = ffh.Q().ao();

               for (iz $$14 : iz.c($$6, $$7)) {
                  dse $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dpj $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  enx $$17 = $$15.u();
                  if (!$$17.c()) {
                     gdy $$18 = gdl.a($$17);
                     ezv $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != dlh.a) {
                     gdy $$20 = gdl.a($$15);
                     ezv $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(gdy.f())) {
                  ezv $$22 = $$3.a(gdy.f());
                  if (!$$22.b()) {
                     $$22.a(fai.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (gdy $$23 : $$11) {
                  ezv.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               gem.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dpj> void a(ggq.b.b.a $$0, E $$1) {
            gfq<E> $$2 = ffh.Q().aq().a($$1);
            if ($$2 != null) {
               $$0.b.add($$1);
               if ($$2.a($$1)) {
                  $$0.a.add($$1);
               }
            }
         }

         @Override
         public void a() {
            this.d = null;
            if (this.b.compareAndSet(false, true)) {
               b.this.a(false);
            }
         }

         static final class a {
            public final List<dpj> a = new ArrayList<>();
            public final List<dpj> b = new ArrayList<>();
            public final Map<gdy, ezv.b> c = new Reference2ObjectArrayMap();
            public ggs d = new ggs();
            @Nullable
            public ezv.c e;
         }
      }

      class c extends ggq.b.a {
         private final ggq.a e;

         public c(final double $$0, final ggq.a $$1) {
            super($$0, true);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<ggq.c> a(geb $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(ggq.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(ggq.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(ggq.c.b);
            } else {
               evt $$1 = ggq.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               ezv.c $$5 = this.e.e;
               if ($$5 != null && !this.e.a(gdy.f())) {
                  ezv $$6 = $$0.a(gdy.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(fai.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.e.e = $$6.a();
                  ezv.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(ggq.c.b);
                  } else {
                     CompletableFuture<ggq.c> $$8 = ggq.this.a($$7, b.this.a(gdy.f())).thenApply($$0x -> ggq.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           ffh.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? ggq.c.b : ggq.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(ggq.c.b);
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
