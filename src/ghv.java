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

public class ghv {
   private static final Logger a = LogUtils.getLogger();
   private static final jj[] b = jj.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private gie g;
   private final AtomicReference<ghv.b> h = new AtomicReference<>();
   private final AtomicReference<ghv.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable gie $$0) {
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
         this.h.set(new ghv.b($$0));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(gkx $$0, List<gkt.b> $$1) {
      this.h.get().a().b.a(($$1x, $$2, $$3) -> {
         gkt.b $$4 = $$1x.a();
         if ($$4 != null) {
            $$1.add($$4);
         }
      }, $$0);
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(ddm $$0) {
      ghv.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      ghv.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(gkt.b $$0) {
      ghv.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      ghv.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fhu $$1, gkx $$2, List<gkt.b> $$3, LongOpenHashSet $$4) {
      eys $$5 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fhu $$1, eys $$2, LongOpenHashSet $$3) {
      this.e = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.f = ad.g().submit(() -> {
         ghv.b $$4x = new ghv.b(this.g);
         this.i.set($$4x.b);
         Queue<ghv.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.h.set($$4x);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, gkx $$1, List<gkt.b> $$2, eys $$3, LongOpenHashSet $$4) {
      ghv.b $$5 = this.h.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<ghv.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            gkt.b $$7 = $$5.b.b.poll();
            ghv.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         gkx $$9 = ghc.a($$1);
         Consumer<gkt.b> $$10 = $$2x -> {
            if ($$9.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(ghv.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<gkt.b> $$3 = (List<gkt.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(ghv.a $$0, ddm $$1) {
      $$0.a.add(ddm.c($$1.e - 1, $$1.f));
      $$0.a.add(ddm.c($$1.e, $$1.f - 1));
      $$0.a.add(ddm.c($$1.e + 1, $$1.f));
      $$0.a.add(ddm.c($$1.e, $$1.f + 1));
   }

   private void a(fhu $$0, Queue<ghv.d> $$1) {
      je $$2 = $$0.c();
      long $$3 = kg.c($$2);
      int $$4 = kg.c($$3);
      gkt.b $$5 = this.g.a($$3);
      if ($$5 == null) {
         dei $$6 = this.g.c();
         boolean $$7 = $$4 < $$6.ap();
         int $$8 = $$7 ? $$6.ap() : $$6.aq();
         int $$9 = this.g.b();
         List<ghv.d> $$10 = Lists.newArrayList();
         int $$11 = kg.b($$3);
         int $$12 = kg.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               gkt.b $$15 = this.g.a(kg.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jj $$16 = $$7 ? jj.b : jj.a;
                  ghv.d $$17 = new ghv.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jj.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jj.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jj.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jj.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$10);
      } else {
         $$1.add(new ghv.d($$5, null, 0));
      }
   }

   private void a(ghv.c $$0, eys $$1, Queue<ghv.d> $$2, boolean $$3, Consumer<gkt.b> $$4, LongOpenHashSet $$5) {
      int $$6 = 16;
      je $$7 = new je(azd.a($$1.d / 16.0) * 16, azd.a($$1.e / 16.0) * 16, azd.a($$1.f / 16.0) * 16);
      long $$8 = kg.c($$7);
      je $$9 = $$7.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         ghv.d $$10 = $$2.poll();
         gkt.b $$11 = $$10.a;
         if (!$$5.contains($$10.a.g())) {
            if ($$0.b.a($$10.a)) {
               $$4.accept($$10.a);
            }
         } else {
            $$10.a.c.compareAndSet(gkt.a.a, gkt.a.b);
         }

         boolean $$12 = Math.abs($$11.f().u() - $$7.u()) > 60 || Math.abs($$11.f().v() - $$7.v()) > 60 || Math.abs($$11.f().w() - $$7.w()) > 60;

         for (jj $$13 : b) {
            gkt.b $$14 = this.a($$8, $$11, $$13);
            if ($$14 != null && (!$$3 || !$$10.a($$13.g()))) {
               if ($$3 && $$10.a()) {
                  gkt.a $$15 = $$11.d();
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
                  je $$18 = $$14.f();
                  je $$19 = $$18.b(
                     ($$13.o() == jj.a.a ? $$9.u() <= $$18.u() : $$9.u() >= $$18.u()) ? 0 : 16,
                     ($$13.o() == jj.a.b ? $$9.v() <= $$18.v() : $$9.v() >= $$18.v()) ? 0 : 16,
                     ($$13.o() == jj.a.c ? $$9.w() <= $$18.w() : $$9.w() >= $$18.w()) ? 0 : 16
                  );
                  eys $$20 = new eys((double)$$19.u(), (double)$$19.v(), (double)$$19.w());
                  eys $$21 = $$1.d($$20).d().c(d);
                  boolean $$22 = true;

                  while ($$1.d($$20).h() > 3600.0) {
                     $$20 = $$20.e($$21);
                     dei $$23 = this.g.c();
                     if ($$20.e > (double)$$23.an() || $$20.e < (double)$$23.G_()) {
                        break;
                     }

                     gkt.b $$24 = this.g.a(je.a($$20.d, $$20.e, $$20.f));
                     if ($$24 == null || $$0.a.a($$24) == null) {
                        $$22 = false;
                        break;
                     }
                  }

                  if (!$$22) {
                     continue;
                  }
               }

               ghv.d $$25 = $$0.a.a($$14);
               if ($$25 != null) {
                  $$25.b($$13);
               } else {
                  ghv.d $$26 = new ghv.d($$14, $$13, $$10.b + 1);
                  $$26.a($$10.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$26);
                     $$0.a.a($$14, $$26);
                  } else if (this.a($$8, $$14.g())) {
                     $$0.a.a($$14, $$26);
                     ((List)$$0.c.computeIfAbsent(ddm.a($$14.f()), $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return aqs.a(kg.b($$0), kg.d($$0), this.g.b(), kg.b($$1), kg.d($$1));
   }

   @Nullable
   private gkt.b a(long $$0, gkt.b $$1, jj $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azd.a(kg.c($$0) - kg.c($$3)) > this.g.b() ? null : this.g.a($$3);
      }
   }

   @Nullable
   @baj
   public ghv.d b(gkt.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   public ghh c() {
      return this.h.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<gkt.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(ghv.c a, ghv.a b) {

      b(gie $$0) {
         this(new ghv.c($$0), new ghv.a());
      }
   }

   static class c {
      public final ghv.e a;
      public final ghh b;
      public final Long2ObjectMap<List<gkt.b>> c;

      public c(gie $$0) {
         this.a = new ghv.e($$0.f.length);
         this.b = new ghh($$0.d(), $$0.b(), $$0.c, $$0.b.G_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @baj
   public static class d {
      @baj
      protected final gkt.b a;
      private byte c;
      byte d;
      @baj
      public final int b;

      d(gkt.b $$0, @Nullable jj $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jj $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jj $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jj $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @baj
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
         return !($$0 instanceof ghv.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final ghv.d[] a;

      e(int $$0) {
         this.a = new ghv.d[$$0];
      }

      public void a(gkt.b $$0, ghv.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public ghv.d a(gkt.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
