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
import org.slf4j.Logger;

public class giw {
   private static final Logger a = LogUtils.getLogger();
   private static final jm[] b = jm.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private gjf g;
   private final AtomicReference<giw.b> h = new AtomicReference<>();
   private final AtomicReference<giw.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable gjf $$0) {
      if (this.f != null) {
         try {
            this.f.get();
            this.f = null;
         } catch (Exception var3) {
            a.warn("Full update failed", var3);
         }
      }

      this.g = $$0;
      if ($$0 != null) {
         this.h.set(new giw.b($$0));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(gly $$0, List<glu.b> $$1, List<glu.b> $$2) {
      this.h.get().a().b.a(($$2x, $$3, $$4, $$5) -> {
         glu.b $$6 = $$2x.a();
         if ($$6 != null) {
            $$1.add($$6);
            if ($$5) {
               $$2.add($$6);
            }
         }
      }, $$0, 32);
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(deh $$0) {
      giw.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      giw.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(glu.b $$0) {
      giw.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      giw.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fir $$1, gly $$2, List<glu.b> $$3, LongOpenHashSet $$4) {
      ezn $$5 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fir $$1, ezn $$2, LongOpenHashSet $$3) {
      this.e = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.f = CompletableFuture.runAsync(() -> {
         giw.b $$4x = new giw.b(this.g);
         this.i.set($$4x.b);
         Queue<giw.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.h.set($$4x);
         this.i.set(null);
         this.j.set(true);
      }, ae.g());
   }

   private void a(boolean $$0, gly $$1, List<glu.b> $$2, ezn $$3, LongOpenHashSet $$4) {
      giw.b $$5 = this.h.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<giw.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            glu.b $$7 = $$5.b.b.poll();
            giw.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         gly $$9 = gid.a($$1);
         Consumer<glu.b> $$10 = $$1x -> {
            if ($$9.a($$1x.b())) {
               this.j.set(true);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(giw.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<glu.b> $$3 = (List<glu.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(giw.a $$0, deh $$1) {
      $$0.a.add(deh.c($$1.g - 1, $$1.h));
      $$0.a.add(deh.c($$1.g, $$1.h - 1));
      $$0.a.add(deh.c($$1.g + 1, $$1.h));
      $$0.a.add(deh.c($$1.g, $$1.h + 1));
   }

   private void a(fir $$0, Queue<giw.d> $$1) {
      jh $$2 = $$0.c();
      long $$3 = kj.c($$2);
      int $$4 = kj.c($$3);
      glu.b $$5 = this.g.a($$3);
      if ($$5 == null) {
         dfd $$6 = this.g.c();
         boolean $$7 = $$4 < $$6.an();
         int $$8 = $$7 ? $$6.an() : $$6.ao();
         int $$9 = this.g.b();
         List<giw.d> $$10 = Lists.newArrayList();
         int $$11 = kj.b($$3);
         int $$12 = kj.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               glu.b $$15 = this.g.a(kj.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jm $$16 = $$7 ? jm.b : jm.a;
                  giw.d $$17 = new giw.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jm.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jm.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jm.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jm.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$10);
      } else {
         $$1.add(new giw.d($$5, null, 0));
      }
   }

   private void a(giw.c $$0, ezn $$1, Queue<giw.d> $$2, boolean $$3, Consumer<glu.b> $$4, LongOpenHashSet $$5) {
      int $$6 = 16;
      jh $$7 = new jh(azk.a($$1.d / 16.0) * 16, azk.a($$1.e / 16.0) * 16, azk.a($$1.f / 16.0) * 16);
      long $$8 = kj.c($$7);
      jh $$9 = $$7.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         giw.d $$10 = $$2.poll();
         glu.b $$11 = $$10.a;
         if (!$$5.contains($$10.a.g())) {
            if ($$0.b.a($$10.a)) {
               $$4.accept($$10.a);
            }
         } else {
            $$10.a.c.compareAndSet(glu.a.a, glu.a.b);
         }

         boolean $$12 = Math.abs($$11.f().u() - $$7.u()) > 60 || Math.abs($$11.f().v() - $$7.v()) > 60 || Math.abs($$11.f().w() - $$7.w()) > 60;

         for (jm $$13 : b) {
            glu.b $$14 = this.a($$8, $$11, $$13);
            if ($$14 != null && (!$$3 || !$$10.a($$13.g()))) {
               if ($$3 && $$10.a()) {
                  glu.a $$15 = $$11.d();
                  boolean $$16 = false;

                  for (int $$17 = 0; $$17 < b.length; $$17++) {
                     if ($$10.a($$17) && $$15.a(b[$$17].g(), $$13)) {
                        $$16 = true;
                        break;
                     }
                  }

                  if (!$$16) {
                     continue;
                  }
               }

               if ($$3 && $$12) {
                  jh $$18 = $$14.f();
                  jh $$19 = $$18.b(
                     ($$13.o() == jm.a.a ? $$9.u() <= $$18.u() : $$9.u() >= $$18.u()) ? 0 : 16,
                     ($$13.o() == jm.a.b ? $$9.v() <= $$18.v() : $$9.v() >= $$18.v()) ? 0 : 16,
                     ($$13.o() == jm.a.c ? $$9.w() <= $$18.w() : $$9.w() >= $$18.w()) ? 0 : 16
                  );
                  ezn $$20 = new ezn((double)$$19.u(), (double)$$19.v(), (double)$$19.w());
                  ezn $$21 = $$1.d($$20).d().c(d);
                  boolean $$22 = true;

                  while ($$1.d($$20).h() > 3600.0) {
                     $$20 = $$20.e($$21);
                     dfd $$23 = this.g.c();
                     if ($$20.e > (double)$$23.al() || $$20.e < (double)$$23.I_()) {
                        break;
                     }

                     glu.b $$24 = this.g.a(jh.a($$20.d, $$20.e, $$20.f));
                     if ($$24 == null || $$0.a.a($$24) == null) {
                        $$22 = false;
                        break;
                     }
                  }

                  if (!$$22) {
                     continue;
                  }
               }

               giw.d $$25 = $$0.a.a($$14);
               if ($$25 != null) {
                  $$25.b($$13);
               } else {
                  giw.d $$26 = new giw.d($$14, $$13, $$10.b + 1);
                  $$26.a($$10.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$26);
                     $$0.a.a($$14, $$26);
                  } else if (this.a($$8, $$14.g())) {
                     $$0.a.a($$14, $$26);
                     ((List)$$0.c.computeIfAbsent(deh.a($$14.f()), $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return aqy.a(kj.b($$0), kj.d($$0), this.g.b(), kj.b($$1), kj.d($$1));
   }

   @Nullable
   private glu.b a(long $$0, glu.b $$1, jm $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azk.a(kj.c($$0) - kj.c($$3)) > this.g.b() ? null : this.g.a($$3);
      }
   }

   @Nullable
   @baq
   public giw.d b(glu.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   public gii c() {
      return this.h.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<glu.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(giw.c a, giw.a b) {

      b(gjf $$0) {
         this(new giw.c($$0), new giw.a());
      }
   }

   static class c {
      public final giw.e a;
      public final gii b;
      public final Long2ObjectMap<List<glu.b>> c;

      public c(gjf $$0) {
         this.a = new giw.e($$0.f.length);
         this.b = new gii($$0.d(), $$0.b(), $$0.c, $$0.b.I_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @baq
   public static class d {
      @baq
      protected final glu.b a;
      private byte c;
      byte d;
      @baq
      public final int b;

      d(glu.b $$0, @Nullable jm $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jm $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jm $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jm $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @baq
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
         return !($$0 instanceof giw.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final giw.d[] a;

      e(int $$0) {
         this.a = new giw.d[$$0];
      }

      public void a(glu.b $$0, giw.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public giw.d a(glu.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
