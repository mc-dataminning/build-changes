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

public class ggx {
   private static final int a = 2;
   private final PriorityBlockingQueue<ggx.b.a> b = Queues.newPriorityBlockingQueue();
   private final Queue<ggx.b.a> c = Queues.newLinkedBlockingDeque();
   private int d = 2;
   private final Queue<Runnable> e = Queues.newConcurrentLinkedQueue();
   final gei f;
   private final gej g;
   private volatile int h;
   private volatile boolean i;
   private final bow<Runnable> j;
   private final Executor k;
   fyd l;
   final gdv m;
   private evz n = evz.b;

   public ggx(fyd $$0, gdv $$1, Executor $$2, ged $$3) {
      this.l = $$0;
      this.m = $$1;
      this.f = $$3.a();
      this.g = $$3.b();
      this.k = $$2;
      this.j = bow.a($$2, "Section Renderer");
      this.j.a(this::j);
   }

   public void a(fyd $$0) {
      this.l = $$0;
   }

   private void j() {
      if (!this.i && !this.g.b()) {
         ggx.b.a $$0 = this.k();
         if ($$0 != null) {
            gei $$1 = Objects.requireNonNull(this.g.a());
            this.h = this.b.size() + this.c.size();
            CompletableFuture.supplyAsync(ac.a($$0.b(), () -> $$0.a($$1)), this.k).thenCompose($$0x -> $$0x).whenComplete(($$1x, $$2) -> {
               if ($$2 != null) {
                  ffn.Q().a(o.a($$2, "Batching sections"));
               } else {
                  this.j.a(() -> {
                     if ($$1x == ggx.c.a) {
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
   private ggx.b.a k() {
      if (this.d <= 0) {
         ggx.b.a $$0 = this.c.poll();
         if ($$0 != null) {
            this.d = 2;
            return $$0;
         }
      }

      ggx.b.a $$1 = this.b.poll();
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

   public void a(evz $$0) {
      this.n = $$0;
   }

   public evz e() {
      return this.n;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.e.poll()) != null) {
         $$0.run();
      }
   }

   public void a(ggx.b $$0, ggw $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.l();
   }

   public void a(ggx.b.a $$0) {
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

   public CompletableFuture<Void> a(fab.b $$0, faj $$1) {
      return this.i ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.e();
         } else {
            $$1.a();
            $$1.a($$0);
            faj.b();
         }
      }, this.e::add);
   }

   private void l() {
      while (!this.b.isEmpty()) {
         ggx.b.a $$0 = this.b.poll();
         if ($$0 != null) {
            $$0.a();
         }
      }

      while (!this.c.isEmpty()) {
         ggx.b.a $$1 = this.c.poll();
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
      public static final ggx.a a = new ggx.a() {
         @Override
         public boolean a(jf $$0, jf $$1) {
            return false;
         }
      };
      final Set<gef> b = new ObjectArraySet(gef.H().size());
      final List<dpn> c = Lists.newArrayList();
      ggz d = new ggz();
      @Nullable
      fab.c e;

      public boolean a() {
         return this.b.isEmpty();
      }

      public boolean a(gef $$0) {
         return !this.b.contains($$0);
      }

      public List<dpn> b() {
         return this.c;
      }

      public boolean a(jf $$0, jf $$1) {
         return this.d.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<ggx.a> c = new AtomicReference<>(ggx.a.a);
      final AtomicInteger e = new AtomicInteger(0);
      @Nullable
      private ggx.b.b f;
      @Nullable
      private ggx.b.c g;
      private final Set<dpn> h = Sets.newHashSet();
      private final Map<gef, faj> i = gef.H().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new faj(faj.a.a)));
      private evu j;
      private boolean k = true;
      final ja.a l = new ja.a(-1, -1, -1);
      private final ja.a[] m = ac.a(new ja.a[6], $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.length; $$1x++) {
            $$0x[$$1x] = new ja.a();
         }
      });
      private boolean n;

      public b(final int $$1, final int $$2, final int $$3, final int $$4) {
         this.b = $$1;
         this.a($$2, $$3, $$4);
      }

      private boolean a(ja $$0) {
         return ggx.this.l.a(kc.a($$0.u()), kc.a($$0.w()), dvc.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.a(this.m[jf.e.ordinal()]) && this.a(this.m[jf.c.ordinal()]) && this.a(this.m[jf.f.ordinal()]) && this.a(this.m[jf.d.ordinal()]);
      }

      public evu b() {
         return this.j;
      }

      public faj a(gef $$0) {
         return this.i.get($$0);
      }

      public void a(int $$0, int $$1, int $$2) {
         this.k();
         this.l.d($$0, $$1, $$2);
         this.j = new evu((double)$$0, (double)$$1, (double)$$2, (double)($$0 + 16), (double)($$1 + 16), (double)($$2 + 16));

         for (jf $$3 : jf.values()) {
            this.m[$$3.ordinal()].g(this.l).c($$3, 16);
         }
      }

      protected double c() {
         fey $$0 = ffn.Q().j.l();
         double $$1 = this.j.a + 8.0 - $$0.b().c;
         double $$2 = this.j.b + 8.0 - $$0.b().d;
         double $$3 = this.j.c + 8.0 - $$0.b().e;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      void a(fab $$0) {
         $$0.a(fal.b.h, fae.j);
      }

      public ggx.a d() {
         return this.c.get();
      }

      private void k() {
         this.j();
         this.c.set(ggx.a.a);
         this.k = true;
      }

      public void e() {
         this.k();
         this.i.values().forEach(faj::close);
      }

      public ja f() {
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

      public ja a(jf $$0) {
         return this.m[$$0.ordinal()];
      }

      public boolean a(gef $$0, ggx $$1) {
         ggx.a $$2 = this.d();
         if (this.g != null) {
            this.g.a();
         }

         if (!$$2.b.contains($$0)) {
            return false;
         } else {
            this.g = new ggx.b.c(this.c(), $$2);
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

      public ggx.b.a a(ggw $$0) {
         boolean $$1 = this.j();
         ja $$2 = this.l.i();
         int $$3 = 1;
         ggv $$4 = $$0.a(ggx.this.l, $$2.b(-1, -1, -1), $$2.b(16, 16, 16), 1);
         boolean $$5 = this.c.get() == ggx.a.a;
         if ($$5 && $$1) {
            this.e.incrementAndGet();
         }

         this.f = new ggx.b.b(this.c(), $$4, !$$5 || this.e.get() > 2);
         return this.f;
      }

      public void a(ggx $$0, ggw $$1) {
         ggx.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dpn> $$0) {
         Set<dpn> $$1 = Sets.newHashSet($$0);
         Set<dpn> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         ggx.this.m.a($$2, $$1);
      }

      public void b(ggw $$0) {
         ggx.b.a $$1 = this.a($$0);
         $$1.a(ggx.this.f);
      }

      public boolean b(int $$0, int $$1, int $$2) {
         ja $$3 = this.f();
         return $$0 == kc.a($$3.u()) || $$2 == kc.a($$3.w()) || $$1 == kc.a($$3.v());
      }

      abstract class a implements Comparable<ggx.b.a> {
         protected final double a;
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final double $$0, final boolean $$1) {
            this.a = $$0;
            this.c = $$1;
         }

         public abstract CompletableFuture<ggx.c> a(gei var1);

         public abstract void a();

         protected abstract String b();

         public int a(ggx.b.a $$0) {
            return Doubles.compare(this.a, $$0.a);
         }
      }

      class b extends ggx.b.a {
         @Nullable
         protected ggv d;

         public b(final double $$0, @Nullable final ggv $$1, final boolean $$2) {
            super($$0, $$2);
            this.d = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<ggx.c> a(gei $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(ggx.c.b);
            } else if (!b.this.a()) {
               this.d = null;
               b.this.a(false);
               this.b.set(true);
               return CompletableFuture.completedFuture(ggx.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(ggx.c.b);
            } else {
               evz $$1 = ggx.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               ggx.b.b.a $$5 = this.a($$2, $$3, $$4, $$0);
               b.this.a($$5.a);
               if (this.b.get()) {
                  $$5.c.values().forEach(fab.b::e);
                  return CompletableFuture.completedFuture(ggx.c.b);
               } else {
                  ggx.a $$6 = new ggx.a();
                  $$6.d = $$5.d;
                  $$6.c.addAll($$5.b);
                  $$6.e = $$5.e;
                  List<CompletableFuture<Void>> $$7 = Lists.newArrayList();
                  $$5.c.forEach(($$2x, $$3x) -> {
                     $$7.add(ggx.this.a($$3x, b.this.a($$2x)));
                     $$6.b.add($$2x);
                  });
                  return ac.e($$7).handle(($$1x, $$2x) -> {
                     if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                        ffn.Q().a(o.a($$2x, "Rendering section"));
                     }

                     if (this.b.get()) {
                        return ggx.c.b;
                     } else {
                        b.this.c.set($$6);
                        b.this.e.set(0);
                        ggx.this.m.a(b.this);
                        return ggx.c.a;
                     }
                  });
               }
            }
         }

         private ggx.b.b.a a(float $$0, float $$1, float $$2, gei $$3) {
            ggx.b.b.a $$4 = new ggx.b.b.a();
            int $$5 = 1;
            ja $$6 = b.this.l.i();
            ja $$7 = $$6.b(15, 15, 15);
            ggy $$8 = new ggy();
            ggv $$9 = this.d;
            this.d = null;
            fag $$10 = new fag();
            if ($$9 != null) {
               get.a();
               Set<gef> $$11 = new ReferenceArraySet(gef.H().size());
               aym $$12 = aym.a();
               ger $$13 = ffn.Q().ao();

               for (ja $$14 : ja.c($$6, $$7)) {
                  dsh $$15 = $$9.a_($$14);
                  if ($$15.i($$9, $$14)) {
                     $$8.a($$14);
                  }

                  if ($$15.t()) {
                     dpn $$16 = $$9.c_($$14);
                     if ($$16 != null) {
                        this.a($$4, $$16);
                     }
                  }

                  eob $$17 = $$15.u();
                  if (!$$17.c()) {
                     gef $$18 = gds.a($$17);
                     fab $$19 = $$3.a($$18);
                     if ($$11.add($$18)) {
                        b.this.a($$19);
                     }

                     $$13.a($$14, $$9, $$19, $$15, $$17);
                  }

                  if ($$15.l() != dll.a) {
                     gef $$20 = gds.a($$15);
                     fab $$21 = $$3.a($$20);
                     if ($$11.add($$20)) {
                        b.this.a($$21);
                     }

                     $$10.a();
                     $$10.a((float)($$14.u() & 15), (float)($$14.v() & 15), (float)($$14.w() & 15));
                     $$13.a($$15, $$14, $$9, $$10, $$21, true, $$12);
                     $$10.b();
                  }
               }

               if ($$11.contains(gef.f())) {
                  fab $$22 = $$3.a(gef.f());
                  if (!$$22.b()) {
                     $$22.a(fao.a($$0 - (float)$$6.u(), $$1 - (float)$$6.v(), $$2 - (float)$$6.w()));
                     $$4.e = $$22.a();
                  }
               }

               for (gef $$23 : $$11) {
                  fab.b $$24 = $$3.a($$23).c();
                  if ($$24 != null) {
                     $$4.c.put($$23, $$24);
                  }
               }

               get.b();
            }

            $$4.d = $$8.a();
            return $$4;
         }

         private <E extends dpn> void a(ggx.b.b.a $$0, E $$1) {
            gfx<E> $$2 = ffn.Q().aq().a($$1);
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
            public final List<dpn> a = new ArrayList<>();
            public final List<dpn> b = new ArrayList<>();
            public final Map<gef, fab.b> c = new Reference2ObjectArrayMap();
            public ggz d = new ggz();
            @Nullable
            public fab.c e;
         }
      }

      class c extends ggx.b.a {
         private final ggx.a e;

         public c(final double $$0, final ggx.a $$1) {
            super($$0, true);
            this.e = $$1;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<ggx.c> a(gei $$0) {
            if (this.b.get()) {
               return CompletableFuture.completedFuture(ggx.c.b);
            } else if (!b.this.a()) {
               this.b.set(true);
               return CompletableFuture.completedFuture(ggx.c.b);
            } else if (this.b.get()) {
               return CompletableFuture.completedFuture(ggx.c.b);
            } else {
               evz $$1 = ggx.this.e();
               float $$2 = (float)$$1.c;
               float $$3 = (float)$$1.d;
               float $$4 = (float)$$1.e;
               fab.c $$5 = this.e.e;
               if ($$5 != null && !this.e.a(gef.f())) {
                  fab $$6 = $$0.a(gef.f());
                  b.this.a($$6);
                  $$6.a($$5);
                  $$6.a(fao.a($$2 - (float)b.this.l.u(), $$3 - (float)b.this.l.v(), $$4 - (float)b.this.l.w()));
                  this.e.e = $$6.a();
                  fab.b $$7 = $$6.d();
                  if (this.b.get()) {
                     $$7.e();
                     return CompletableFuture.completedFuture(ggx.c.b);
                  } else {
                     CompletableFuture<ggx.c> $$8 = ggx.this.a($$7, b.this.a(gef.f())).thenApply($$0x -> ggx.c.b);
                     return $$8.handle(($$0x, $$1x) -> {
                        if ($$1x != null && !($$1x instanceof CancellationException) && !($$1x instanceof InterruptedException)) {
                           ffn.Q().a(o.a($$1x, "Rendering section"));
                        }

                        return this.b.get() ? ggx.c.b : ggx.c.a;
                     });
                  }
               } else {
                  return CompletableFuture.completedFuture(ggx.c.b);
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
