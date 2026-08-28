import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Vector3d;
import org.slf4j.Logger;

public class gss {
   private static final Logger a = LogUtils.getLogger();
   private static final jc[] b = jc.values();
   private static final int c = 60;
   private static final int d = jz.a(60);
   private static final double e = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean f = true;
   @Nullable
   private Future<?> g;
   @Nullable
   private gta h;
   private final AtomicReference<gss.b> i = new AtomicReference<>();
   private final AtomicReference<gss.a> j = new AtomicReference<>();
   private final AtomicBoolean k = new AtomicBoolean(false);

   public void a(@Nullable gta $$0) {
      if (this.g != null) {
         try {
            this.g.get();
            this.g = null;
         } catch (Exception var3) {
            a.warn("Full update failed", var3);
         }
      }

      this.h = $$0;
      if ($$0 != null) {
         this.i.set(new gss.b($$0));
         this.a();
      } else {
         this.i.set(null);
      }
   }

   public void a() {
      this.f = true;
   }

   public void a(gvw $$0, List<gvs.b> $$1, List<gvs.b> $$2) {
      this.i.get().a().b.a(($$2x, $$3, $$4, $$5) -> {
         gvs.b $$6 = $$2x.a();
         if ($$6 != null) {
            $$1.add($$6);
            if ($$5) {
               $$2.add($$6);
            }
         }
      }, $$0, 32);
   }

   public boolean b() {
      return this.k.compareAndSet(true, false);
   }

   public void a(dje $$0) {
      gss.a $$1 = this.j.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      gss.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(gvs.b $$0) {
      gss.a $$1 = this.j.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      gss.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fqn $$1, gvw $$2, List<gvs.b> $$3, LongOpenHashSet $$4) {
      ffs $$5 = $$1.b();
      if (this.f && (this.g == null || this.g.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fqn $$1, ffs $$2, LongOpenHashSet $$3) {
      this.f = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.g = CompletableFuture.runAsync(() -> {
         gss.b $$4x = new gss.b(this.h);
         this.j.set($$4x.b);
         Queue<gss.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.i.set($$4x);
         this.j.set(null);
         this.k.set(true);
      }, ag.h());
   }

   private void a(boolean $$0, gvw $$1, List<gvs.b> $$2, ffs $$3, LongOpenHashSet $$4) {
      gss.b $$5 = this.i.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<gss.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            gvs.b $$7 = $$5.b.b.poll();
            gss.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         gvw $$9 = grx.a($$1);
         Consumer<gvs.b> $$10 = $$1x -> {
            if ($$9.a($$1x.b())) {
               this.k.set(true);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(gss.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<gvs.b> $$3 = (List<gvs.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(gss.a $$0, dje $$1) {
      $$0.a.add(dje.c($$1.h - 1, $$1.i));
      $$0.a.add(dje.c($$1.h, $$1.i - 1));
      $$0.a.add(dje.c($$1.h + 1, $$1.i));
      $$0.a.add(dje.c($$1.h, $$1.i + 1));
      $$0.a.add(dje.c($$1.h - 1, $$1.i - 1));
      $$0.a.add(dje.c($$1.h - 1, $$1.i + 1));
      $$0.a.add(dje.c($$1.h + 1, $$1.i - 1));
      $$0.a.add(dje.c($$1.h + 1, $$1.i + 1));
   }

   private void a(fqn $$0, Queue<gss.d> $$1) {
      iw $$2 = $$0.c();
      long $$3 = jz.c($$2);
      int $$4 = jz.c($$3);
      gvs.b $$5 = this.h.a($$3);
      if ($$5 == null) {
         dkb $$6 = this.h.c();
         boolean $$7 = $$4 < $$6.aq();
         int $$8 = $$7 ? $$6.aq() : $$6.ar();
         int $$9 = this.h.b();
         List<gss.d> $$10 = Lists.newArrayList();
         int $$11 = jz.b($$3);
         int $$12 = jz.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               gvs.b $$15 = this.h.a(jz.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jc $$16 = $$7 ? jc.b : jc.a;
                  gss.d $$17 = new gss.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jc.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jc.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jc.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jc.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j(jz.a($$1x.a.g()).k())));
         $$1.addAll($$10);
      } else {
         $$1.add(new gss.d($$5, null, 0));
      }
   }

   private void a(gss.c $$0, ffs $$1, Queue<gss.d> $$2, boolean $$3, Consumer<gvs.b> $$4, LongOpenHashSet $$5) {
      jz $$6 = jz.a($$1);
      long $$7 = $$6.s();
      iw $$8 = $$6.k();

      while (!$$2.isEmpty()) {
         gss.d $$9 = $$2.poll();
         gvs.b $$10 = $$9.a;
         if (!$$5.contains($$9.a.g())) {
            if ($$0.b.a($$9.a)) {
               $$4.accept($$9.a);
            }
         } else {
            $$9.a.c.compareAndSet(gvs.a.a, gvs.a.b);
         }

         long $$11 = $$10.g();
         boolean $$12 = Math.abs(jz.b($$11) - $$6.a()) > d || Math.abs(jz.c($$11) - $$6.b()) > d || Math.abs(jz.d($$11) - $$6.c()) > d;

         for (jc $$13 : b) {
            gvs.b $$14 = this.a($$7, $$10, $$13);
            if ($$14 != null && (!$$3 || !$$9.a($$13.g()))) {
               if ($$3 && $$9.a()) {
                  gvs.a $$15 = $$10.d();
                  boolean $$16 = false;

                  for (int $$17 = 0; $$17 < b.length; $$17++) {
                     if ($$9.a($$17) && $$15.a(b[$$17].g(), $$13)) {
                        $$16 = true;
                        break;
                     }
                  }

                  if (!$$16) {
                     continue;
                  }
               }

               if ($$3 && $$12) {
                  int $$18 = jz.c(jz.b($$11));
                  int $$19 = jz.c(jz.c($$11));
                  int $$20 = jz.c(jz.d($$11));
                  boolean $$21 = $$13.o() == jc.a.a ? $$8.u() > $$18 : $$8.u() < $$18;
                  boolean $$22 = $$13.o() == jc.a.b ? $$8.v() > $$19 : $$8.v() < $$19;
                  boolean $$23 = $$13.o() == jc.a.c ? $$8.w() > $$20 : $$8.w() < $$20;
                  Vector3d $$24 = new Vector3d((double)($$18 + ($$21 ? 16 : 0)), (double)($$19 + ($$22 ? 16 : 0)), (double)($$20 + ($$23 ? 16 : 0)));
                  Vector3d $$25 = new Vector3d($$1.d, $$1.e, $$1.f).sub($$24).normalize().mul(e);
                  boolean $$26 = true;

                  while ($$24.distanceSquared($$1.d, $$1.e, $$1.f) > 3600.0) {
                     $$24.add($$25);
                     dkb $$27 = this.h.c();
                     if ($$24.y > (double)$$27.ao() || $$24.y < (double)$$27.K_()) {
                        break;
                     }

                     gvs.b $$28 = this.h.a(iw.a($$24.x, $$24.y, $$24.z));
                     if ($$28 == null || $$0.a.a($$28) == null) {
                        $$26 = false;
                        break;
                     }
                  }

                  if (!$$26) {
                     continue;
                  }
               }

               gss.d $$29 = $$0.a.a($$14);
               if ($$29 != null) {
                  $$29.b($$13);
               } else {
                  gss.d $$30 = new gss.d($$14, $$13, $$9.b + 1);
                  $$30.a($$9.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$30);
                     $$0.a.a($$14, $$30);
                  } else if (this.a($$7, $$14.g())) {
                     $$0.a.a($$14, $$30);
                     long $$31 = jz.g($$14.g());
                     ((List)$$0.c.computeIfAbsent($$31, $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return ard.a(jz.b($$0), jz.d($$0), this.h.b(), jz.b($$1), jz.d($$1));
   }

   @Nullable
   private gvs.b a(long $$0, gvs.b $$1, jc $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azq.a(jz.c($$0) - jz.c($$3)) > this.h.b() ? null : this.h.a($$3);
      }
   }

   @Nullable
   @baz
   public gss.d b(gvs.b $$0) {
      return this.i.get().a.a.a($$0);
   }

   public gsd c() {
      return this.i.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<gvs.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(gss.c a, gss.a b) {

      b(gta $$0) {
         this(new gss.c($$0), new gss.a());
      }
   }

   static class c {
      public final gss.e a;
      public final gsd b;
      public final Long2ObjectMap<List<gvs.b>> c;

      public c(gta $$0) {
         this.a = new gss.e($$0.f.length);
         this.b = new gsd($$0.d(), $$0.b(), $$0.c, $$0.b.K_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @baz
   public static class d {
      @baz
      protected final gvs.b a;
      private byte c;
      byte d;
      @baz
      public final int b;

      d(gvs.b $$0, @Nullable jc $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jc $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jc $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jc $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @baz
      public boolean a(int $$0) {
         return (this.c & 1 << $$0) > 0;
      }

      boolean a() {
         return this.c != 0;
      }

      @Override
      public int hashCode() {
         return Long.hashCode(this.a.g());
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof gss.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final gss.d[] a;

      e(int $$0) {
         this.a = new gss.d[$$0];
      }

      public void a(gvs.b $$0, gss.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public gss.d a(gvs.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
