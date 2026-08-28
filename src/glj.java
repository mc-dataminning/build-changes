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
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class glj {
   private final gle a = new gle();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final gij c;
   private final gik d;
   private volatile int e;
   private volatile boolean f;
   private final bqo g;
   private final Executor h;
   gbx i;
   final ghs j;
   private ezh k = ezh.c;
   final gli l;

   public glj(gbx $$0, ghs $$1, Executor $$2, gie $$3, giz $$4, gkg $$5) {
      this.i = $$0;
      this.j = $$1;
      this.c = $$3.a();
      this.d = $$3.b();
      this.h = $$2;
      this.g = new bqo($$2, "Section Renderer");
      this.g.a_(this::j);
      this.l = new gli($$4, $$5);
   }

   public void a(gbx $$0) {
      this.i = $$0;
   }

   private void j() {
      if (!this.f && !this.d.b()) {
         glj.b.a $$0 = this.a.a(this.e());
         if ($$0 != null) {
            gij $$1 = Objects.requireNonNull(this.d.a());
            this.e = this.a.a();
            CompletableFuture.supplyAsync(ad.a($$0.b(), () -> $$0.a($$1)), this.h).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fja.Q().a(o.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.g.a_(() -> {
                     if ($$2 == glj.c.a) {
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

   public void a(ezh $$0) {
      this.k = $$0;
   }

   public ezh e() {
      return this.k;
   }

   public void f() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }
   }

   public void a(glj.b $$0, glh $$1) {
      $$0.b($$1);
   }

   public void g() {
      this.k();
   }

   public void a(glj.b.a $$0) {
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

   public CompletableFuture<Void> a(fds $$0, fdw $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdw.b();
         }
      }, this.b::add);
   }

   public CompletableFuture<Void> a(fdq.a $$0, fdw $$1) {
      return this.f ? CompletableFuture.completedFuture(null) : CompletableFuture.runAsync(() -> {
         if ($$1.e()) {
            $$0.close();
         } else {
            $$1.a();
            $$1.a($$0);
            fdw.b();
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
      public static final glj.a a = new glj.a() {
         @Override
         public boolean a(jl $$0, jl $$1) {
            return false;
         }
      };
      public static final glj.a b = new glj.a() {
         @Override
         public boolean a(jl $$0, jl $$1) {
            return true;
         }
      };
      final Set<gig> c = new ObjectArraySet(gig.L().size());
      final List<dsg> d = Lists.newArrayList();
      gll e = new gll();
      @Nullable
      fds.b f;

      public boolean a() {
         return !this.c.isEmpty();
      }

      public boolean a(gig $$0) {
         return !this.c.contains($$0);
      }

      public List<dsg> b() {
         return this.d;
      }

      public boolean a(jl $$0, jl $$1) {
         return this.e.a($$0, $$1);
      }
   }

   public class b {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<glj.a> c = new AtomicReference<>(glj.a.a);
      public final AtomicReference<glj.d> d = new AtomicReference<>(null);
      @Nullable
      private glj.b.b f;
      @Nullable
      private glj.b.c g;
      private final Set<dsg> h = Sets.newHashSet();
      private final Map<gig, fdw> i = gig.L().stream().collect(Collectors.toMap($$0x -> $$0x, $$0x -> new fdw(fdw.a.a)));
      private ezc j;
      private boolean k = true;
      long l = ki.b(-1, -1, -1);
      final jg.a m = new jg.a(-1, -1, -1);
      private boolean n;

      public b(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         return glj.this.i.a(ki.b($$0), ki.d($$0), dya.n, false) != null;
      }

      public boolean a() {
         int $$0 = 24;
         return !(this.c() > 576.0)
            ? true
            : this.b(ki.a(this.l, jl.e)) && this.b(ki.a(this.l, jl.c)) && this.b(ki.a(this.l, jl.f)) && this.b(ki.a(this.l, jl.d));
      }

      public ezc b() {
         return this.j;
      }

      public fdw a(gig $$0) {
         return this.i.get($$0);
      }

      public void a(long $$0) {
         this.n();
         this.l = $$0;
         int $$1 = ki.c(ki.b($$0));
         int $$2 = ki.c(ki.c($$0));
         int $$3 = ki.c(ki.d($$0));
         this.m.d($$1, $$2, $$3);
         this.j = new ezc((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 16), (double)($$2 + 16), (double)($$3 + 16));
      }

      protected double c() {
         fij $$0 = fja.Q().j.k();
         double $$1 = this.j.a + 8.0 - $$0.b().d;
         double $$2 = this.j.b + 8.0 - $$0.b().e;
         double $$3 = this.j.c + 8.0 - $$0.b().f;
         return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
      }

      public glj.a d() {
         return this.c.get();
      }

      private void n() {
         this.m();
         this.c.set(glj.a.a);
         this.d.set(null);
         this.k = true;
      }

      public void e() {
         this.n();
         this.i.values().forEach(fdw::close);
      }

      public jg f() {
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

      public long a(jl $$0) {
         return ki.a(this.l, $$0);
      }

      public void a(glj $$0) {
         this.g = new glj.b.c(this.d());
         $$0.a(this.g);
      }

      public boolean k() {
         return this.d().c.contains(gig.f());
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

      public glj.b.a a(glh $$0) {
         this.m();
         glg $$1 = $$0.a(glj.this.i, ki.a(this.l));
         boolean $$2 = this.c.get() != glj.a.a;
         this.f = new glj.b.b($$1, $$2);
         return this.f;
      }

      public void a(glj $$0, glh $$1) {
         glj.b.a $$2 = this.a($$1);
         $$0.a($$2);
      }

      void a(Collection<dsg> $$0) {
         Set<dsg> $$1 = Sets.newHashSet($$0);
         Set<dsg> $$2;
         synchronized (this.h) {
            $$2 = Sets.newHashSet(this.h);
            $$1.removeAll(this.h);
            $$2.removeAll($$0);
            this.h.clear();
            this.h.addAll($$0);
         }

         glj.this.j.a($$2, $$1);
      }

      public void b(glh $$0) {
         glj.b.a $$1 = this.a($$0);
         $$1.a(glj.this.c);
      }

      void a(glj.a $$0) {
         this.c.set($$0);
         glj.this.j.a(this);
      }

      feb o() {
         ezh $$0 = glj.this.e();
         return feb.a((float)($$0.d - (double)this.m.u()), (float)($$0.e - (double)this.m.v()), (float)($$0.f - (double)this.m.w()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<glj.c> a(gij var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jg d() {
            return b.this.m;
         }
      }

      class b extends glj.b.a {
         @Nullable
         protected glg e;

         public b(@Nullable final glg $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<glj.c> a(gij $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(glj.c.b);
            } else if (!b.this.a()) {
               this.a();
               return CompletableFuture.completedFuture(glj.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(glj.c.b);
            } else {
               glg $$1 = this.e;
               this.e = null;
               if ($$1 == null) {
                  b.this.a(glj.a.b);
                  return CompletableFuture.completedFuture(glj.c.a);
               } else {
                  ki $$2 = ki.a(b.this.m);
                  gli.a $$3 = glj.this.l.a($$2, $$1, b.this.o(), $$0);
                  glj.d $$4 = glj.d.a(glj.this.e(), b.this.l);
                  b.this.a($$3.a);
                  if (this.a.get()) {
                     $$3.a();
                     return CompletableFuture.completedFuture(glj.c.b);
                  } else {
                     glj.a $$5 = new glj.a();
                     $$5.e = $$3.d;
                     $$5.d.addAll($$3.b);
                     $$5.f = $$3.e;
                     List<CompletableFuture<Void>> $$6 = new ArrayList<>($$3.c.size());
                     $$3.c.forEach(($$2x, $$3x) -> {
                        $$6.add(glj.this.a($$3x, b.this.a($$2x)));
                        $$5.c.add($$2x);
                     });
                     return ad.e($$6).handle(($$2x, $$3x) -> {
                        if ($$3x != null && !($$3x instanceof CancellationException) && !($$3x instanceof InterruptedException)) {
                           fja.Q().a(o.a($$3x, "Rendering section"));
                        }

                        if (this.a.get()) {
                           return glj.c.b;
                        } else {
                           b.this.a($$5);
                           b.this.d.set($$4);
                           return glj.c.a;
                        }
                     });
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

      class c extends glj.b.a {
         private final glj.a f;

         public c(final glj.a $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<glj.c> a(gij $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(glj.c.b);
            } else if (!b.this.a()) {
               this.a.set(true);
               return CompletableFuture.completedFuture(glj.c.b);
            } else if (this.a.get()) {
               return CompletableFuture.completedFuture(glj.c.b);
            } else {
               fds.b $$1 = this.f.f;
               if ($$1 != null && !this.f.a(gig.f())) {
                  feb $$2 = b.this.o();
                  glj.d $$3 = glj.d.a(glj.this.e(), b.this.l);
                  if ($$3.equals(b.this.d.get()) && !$$3.a()) {
                     return CompletableFuture.completedFuture(glj.c.b);
                  } else {
                     fdq.a $$4 = $$1.a($$0.a(gig.f()), $$2);
                     if ($$4 == null) {
                        return CompletableFuture.completedFuture(glj.c.b);
                     } else if (this.a.get()) {
                        $$4.close();
                        return CompletableFuture.completedFuture(glj.c.b);
                     } else {
                        CompletableFuture<glj.c> $$5 = glj.this.a($$4, b.this.a(gig.f())).thenApply($$0x -> glj.c.b);
                        return $$5.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fja.Q().a(o.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return glj.c.b;
                           } else {
                              b.this.d.set($$3);
                              return glj.c.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(glj.c.b);
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

      public static glj.d a(ezh $$0, long $$1) {
         return new glj.d().b($$0, $$1);
      }

      public glj.d b(ezh $$0, long $$1) {
         this.a = a($$0.a(), ki.b($$1));
         this.b = a($$0.b(), ki.c($$1));
         this.c = a($$0.c(), ki.d($$1));
         return this;
      }

      private static int a(double $$0, int $$1) {
         int $$2 = ki.b($$0) - $$1;
         return azj.a($$2, -1, 1);
      }

      public boolean a() {
         return this.a == 0 || this.b == 0 || this.c == 0;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 == this) {
            return true;
         } else {
            return !($$0 instanceof glj.d $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }
   }
}
