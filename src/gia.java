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
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gia {
   private static final Logger a = LogUtils.getLogger();
   private static final jk[] b = jk.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private gij g;
   private final AtomicReference<gia.b> h = new AtomicReference<>();
   private final AtomicReference<gia.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable gij $$0) {
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
         this.h.set(new gia.b($$0));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(glc $$0, List<gky.b> $$1) {
      this.h.get().a().b.a(($$1x, $$2, $$3) -> {
         gky.b $$4 = $$1x.a();
         if ($$4 != null) {
            $$1.add($$4);
         }
      }, $$0);
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(ddp $$0) {
      gia.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      gia.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(gky.b $$0) {
      gia.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      gia.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fhy $$1, glc $$2, List<gky.b> $$3, LongOpenHashSet $$4) {
      eyw $$5 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fhy $$1, eyw $$2, LongOpenHashSet $$3) {
      this.e = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.f = ad.g().submit(() -> {
         gia.b $$4x = new gia.b(this.g);
         this.i.set($$4x.b);
         Queue<gia.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.h.set($$4x);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, glc $$1, List<gky.b> $$2, eyw $$3, LongOpenHashSet $$4) {
      gia.b $$5 = this.h.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<gia.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            gky.b $$7 = $$5.b.b.poll();
            gia.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         glc $$9 = ghh.a($$1);
         Consumer<gky.b> $$10 = $$2x -> {
            if ($$9.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(gia.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<gky.b> $$3 = (List<gky.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(gia.a $$0, ddp $$1) {
      $$0.a.add(ddp.c($$1.e - 1, $$1.f));
      $$0.a.add(ddp.c($$1.e, $$1.f - 1));
      $$0.a.add(ddp.c($$1.e + 1, $$1.f));
      $$0.a.add(ddp.c($$1.e, $$1.f + 1));
   }

   private void a(fhy $$0, Queue<gia.d> $$1) {
      jf $$2 = $$0.c();
      long $$3 = kh.c($$2);
      int $$4 = kh.c($$3);
      gky.b $$5 = this.g.a($$3);
      if ($$5 == null) {
         del $$6 = this.g.c();
         boolean $$7 = $$4 < $$6.ap();
         int $$8 = $$7 ? $$6.ap() : $$6.aq();
         int $$9 = this.g.b();
         List<gia.d> $$10 = Lists.newArrayList();
         int $$11 = kh.b($$3);
         int $$12 = kh.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               gky.b $$15 = this.g.a(kh.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jk $$16 = $$7 ? jk.b : jk.a;
                  gia.d $$17 = new gia.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jk.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jk.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jk.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jk.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$10);
      } else {
         $$1.add(new gia.d($$5, null, 0));
      }
   }

   private void a(gia.c $$0, eyw $$1, Queue<gia.d> $$2, boolean $$3, Consumer<gky.b> $$4, LongOpenHashSet $$5) {
      int $$6 = 16;
      jf $$7 = new jf(azf.a($$1.d / 16.0) * 16, azf.a($$1.e / 16.0) * 16, azf.a($$1.f / 16.0) * 16);
      long $$8 = kh.c($$7);
      jf $$9 = $$7.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         gia.d $$10 = $$2.poll();
         gky.b $$11 = $$10.a;
         if (!$$5.contains($$10.a.g())) {
            if ($$0.b.a($$10.a)) {
               $$4.accept($$10.a);
            }
         } else {
            $$10.a.c.compareAndSet(gky.a.a, gky.a.b);
         }

         boolean $$12 = Math.abs($$11.f().u() - $$7.u()) > 60 || Math.abs($$11.f().v() - $$7.v()) > 60 || Math.abs($$11.f().w() - $$7.w()) > 60;

         for (jk $$13 : b) {
            gky.b $$14 = this.a($$8, $$11, $$13);
            if ($$14 != null && (!$$3 || !$$10.a($$13.g()))) {
               if ($$3 && $$10.a()) {
                  gky.a $$15 = $$11.d();
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
                  jf $$18 = $$14.f();
                  jf $$19 = $$18.b(
                     ($$13.o() == jk.a.a ? $$9.u() <= $$18.u() : $$9.u() >= $$18.u()) ? 0 : 16,
                     ($$13.o() == jk.a.b ? $$9.v() <= $$18.v() : $$9.v() >= $$18.v()) ? 0 : 16,
                     ($$13.o() == jk.a.c ? $$9.w() <= $$18.w() : $$9.w() >= $$18.w()) ? 0 : 16
                  );
                  eyw $$20 = new eyw((double)$$19.u(), (double)$$19.v(), (double)$$19.w());
                  eyw $$21 = $$1.d($$20).d().c(d);
                  boolean $$22 = true;

                  while ($$1.d($$20).h() > 3600.0) {
                     $$20 = $$20.e($$21);
                     del $$23 = this.g.c();
                     if ($$20.e > (double)$$23.an() || $$20.e < (double)$$23.H_()) {
                        break;
                     }

                     gky.b $$24 = this.g.a(jf.a($$20.d, $$20.e, $$20.f));
                     if ($$24 == null || $$0.a.a($$24) == null) {
                        $$22 = false;
                        break;
                     }
                  }

                  if (!$$22) {
                     continue;
                  }
               }

               gia.d $$25 = $$0.a.a($$14);
               if ($$25 != null) {
                  $$25.b($$13);
               } else {
                  gia.d $$26 = new gia.d($$14, $$13, $$10.b + 1);
                  $$26.a($$10.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$26);
                     $$0.a.a($$14, $$26);
                  } else if (this.a($$8, $$14.g())) {
                     $$0.a.a($$14, $$26);
                     ((List)$$0.c.computeIfAbsent(ddp.a($$14.f()), $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return aqu.a(kh.b($$0), kh.d($$0), this.g.b(), kh.b($$1), kh.d($$1));
   }

   @Nullable
   private gky.b a(long $$0, gky.b $$1, jk $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azf.a(kh.c($$0) - kh.c($$3)) > this.g.b() ? null : this.g.a($$3);
      }
   }

   @Nullable
   @bal
   public gia.d b(gky.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   public ghm c() {
      return this.h.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<gky.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(gia.c a, gia.a b) {

      b(gij $$0) {
         this(new gia.c($$0), new gia.a());
      }
   }

   static class c {
      public final gia.e a;
      public final ghm b;
      public final Long2ObjectMap<List<gky.b>> c;

      public c(gij $$0) {
         this.a = new gia.e($$0.f.length);
         this.b = new ghm($$0.d(), $$0.b(), $$0.c, $$0.b.H_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @bal
   public static class d {
      @bal
      protected final gky.b a;
      private byte c;
      byte d;
      @bal
      public final int b;

      d(gky.b $$0, @Nullable jk $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jk $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jk $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jk $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @bal
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
         return !($$0 instanceof gia.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final gia.d[] a;

      e(int $$0) {
         this.a = new gia.d[$$0];
      }

      public void a(gky.b $$0, gia.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public gia.d a(gky.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
