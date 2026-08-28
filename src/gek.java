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
import java.util.LinkedHashSet;
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

public class gek {
   private static final Logger a = LogUtils.getLogger();
   private static final jf[] b = jf.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private geo g;
   private final AtomicReference<gek.b> h = new AtomicReference<>();
   private final AtomicReference<gek.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable geo $$0) {
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
         this.h.set(new gek.b($$0.f.length));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(ghb $$0, List<ggx.b> $$1) {
      for (gek.d $$2 : this.h.get().a().b) {
         if ($$0.a($$2.a.b())) {
            $$1.add($$2.a);
         }
      }
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(dbk $$0) {
      gek.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      gek.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(ggx.b $$0) {
      gek.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      gek.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fey $$1, ghb $$2, List<ggx.b> $$3) {
      evz $$4 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$4);
      }

      this.a($$0, $$2, $$3, $$4);
   }

   private void a(boolean $$0, fey $$1, evz $$2) {
      this.e = false;
      this.f = ac.g().submit(() -> {
         gek.b $$3 = new gek.b(this.g.f.length);
         this.i.set($$3.b);
         Queue<gek.d> $$4 = Queues.newArrayDeque();
         this.a($$1, $$4);
         $$4.forEach($$1xx -> $$3.a.a.a($$1xx.a, $$1xx));
         this.a($$3.a, $$2, $$4, $$0, $$0xx -> {
         });
         this.h.set($$3);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, ghb $$1, List<ggx.b> $$2, evz $$3) {
      gek.b $$4 = this.h.get();
      this.a($$4);
      if (!$$4.b.b.isEmpty()) {
         Queue<gek.d> $$5 = Queues.newArrayDeque();

         while (!$$4.b.b.isEmpty()) {
            ggx.b $$6 = $$4.b.b.poll();
            gek.d $$7 = $$4.a.a.a($$6);
            if ($$7 != null && $$7.a == $$6) {
               $$5.add($$7);
            }
         }

         ghb $$8 = gdv.a($$1);
         Consumer<ggx.b> $$9 = $$2x -> {
            if ($$8.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$4.a, $$3, $$5, $$0, $$9);
      }
   }

   private void a(gek.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<ggx.b> $$3 = (List<ggx.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(gek.a $$0, dbk $$1) {
      $$0.a.add(dbk.c($$1.e - 1, $$1.f));
      $$0.a.add(dbk.c($$1.e, $$1.f - 1));
      $$0.a.add(dbk.c($$1.e + 1, $$1.f));
      $$0.a.add(dbk.c($$1.e, $$1.f + 1));
   }

   private void a(fey $$0, Queue<gek.d> $$1) {
      int $$2 = 16;
      evz $$3 = $$0.b();
      ja $$4 = $$0.c();
      ggx.b $$5 = this.g.a($$4);
      if ($$5 == null) {
         dcf $$6 = this.g.c();
         boolean $$7 = $$4.v() > $$6.I_();
         int $$8 = $$7 ? $$6.am() - 8 : $$6.I_() + 8;
         int $$9 = aye.a($$3.c / 16.0) * 16;
         int $$10 = aye.a($$3.e / 16.0) * 16;
         int $$11 = this.g.b();
         List<gek.d> $$12 = Lists.newArrayList();

         for (int $$13 = -$$11; $$13 <= $$11; $$13++) {
            for (int $$14 = -$$11; $$14 <= $$11; $$14++) {
               ggx.b $$15 = this.g.a(new ja($$9 + kc.a($$13, 8), $$8, $$10 + kc.a($$14, 8)));
               if ($$15 != null && this.a($$4, $$15.f())) {
                  jf $$16 = $$7 ? jf.a : jf.b;
                  gek.d $$17 = new gek.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jf.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jf.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jf.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jf.c);
                  }

                  $$12.add($$17);
               }
            }
         }

         $$12.sort(Comparator.comparingDouble($$1x -> $$4.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$12);
      } else {
         $$1.add(new gek.d($$5, null, 0));
      }
   }

   private void a(gek.c $$0, evz $$1, Queue<gek.d> $$2, boolean $$3, Consumer<ggx.b> $$4) {
      int $$5 = 16;
      ja $$6 = new ja(aye.a($$1.c / 16.0) * 16, aye.a($$1.d / 16.0) * 16, aye.a($$1.e / 16.0) * 16);
      ja $$7 = $$6.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         gek.d $$8 = $$2.poll();
         ggx.b $$9 = $$8.a;
         if ($$0.b.add($$8)) {
            $$4.accept($$8.a);
         }

         boolean $$10 = Math.abs($$9.f().u() - $$6.u()) > 60 || Math.abs($$9.f().v() - $$6.v()) > 60 || Math.abs($$9.f().w() - $$6.w()) > 60;

         for (jf $$11 : b) {
            ggx.b $$12 = this.a($$6, $$9, $$11);
            if ($$12 != null && (!$$3 || !$$8.a($$11.g()))) {
               if ($$3 && $$8.a()) {
                  ggx.a $$13 = $$9.d();
                  boolean $$14 = false;

                  for (int $$15 = 0; $$15 < b.length; $$15++) {
                     if ($$8.a($$15) && $$13.a(b[$$15].g(), $$11)) {
                        $$14 = true;
                        break;
                     }
                  }

                  if (!$$14) {
                     continue;
                  }
               }

               if ($$3 && $$10) {
                  ja $$16 = $$12.f();
                  ja $$17 = $$16.b(
                     ($$11.o() == jf.a.a ? $$7.u() <= $$16.u() : $$7.u() >= $$16.u()) ? 0 : 16,
                     ($$11.o() == jf.a.b ? $$7.v() <= $$16.v() : $$7.v() >= $$16.v()) ? 0 : 16,
                     ($$11.o() == jf.a.c ? $$7.w() <= $$16.w() : $$7.w() >= $$16.w()) ? 0 : 16
                  );
                  evz $$18 = new evz((double)$$17.u(), (double)$$17.v(), (double)$$17.w());
                  evz $$19 = $$1.d($$18).d().a(d);
                  boolean $$20 = true;

                  while ($$1.d($$18).g() > 3600.0) {
                     $$18 = $$18.e($$19);
                     dcf $$21 = this.g.c();
                     if ($$18.d > (double)$$21.am() || $$18.d < (double)$$21.I_()) {
                        break;
                     }

                     ggx.b $$22 = this.g.a(ja.a($$18.c, $$18.d, $$18.e));
                     if ($$22 == null || $$0.a.a($$22) == null) {
                        $$20 = false;
                        break;
                     }
                  }

                  if (!$$20) {
                     continue;
                  }
               }

               gek.d $$23 = $$0.a.a($$12);
               if ($$23 != null) {
                  $$23.b($$11);
               } else {
                  gek.d $$24 = new gek.d($$12, $$11, $$8.b + 1);
                  $$24.a($$8.d, $$11);
                  if ($$12.a()) {
                     $$2.add($$24);
                     $$0.a.a($$12, $$24);
                  } else if (this.a($$6, $$12.f())) {
                     $$0.a.a($$12, $$24);
                     ((List)$$0.c.computeIfAbsent(dbk.a($$12.f()), $$0x -> new ArrayList())).add($$12);
                  }
               }
            }
         }
      }
   }

   private boolean a(ja $$0, ja $$1) {
      int $$2 = kc.a($$0.u());
      int $$3 = kc.a($$0.w());
      int $$4 = kc.a($$1.u());
      int $$5 = kc.a($$1.w());
      return apy.a($$2, $$3, this.g.b(), $$4, $$5);
   }

   @Nullable
   private ggx.b a(ja $$0, ggx.b $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return aye.a($$0.v() - $$3.v()) > this.g.b() * 16 ? null : this.g.a($$3);
      }
   }

   @Nullable
   @azi
   protected gek.d b(ggx.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   static record a(LongSet a, BlockingQueue<ggx.b> b) {

      public a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(gek.c a, gek.a b) {

      public b(int $$0) {
         this(new gek.c($$0), new gek.a());
      }
   }

   static class c {
      public final gek.e a;
      public final LinkedHashSet<gek.d> b;
      public final Long2ObjectMap<List<ggx.b>> c;

      public c(int $$0) {
         this.a = new gek.e($$0);
         this.b = new LinkedHashSet<>($$0);
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @azi
   protected static class d {
      @azi
      protected final ggx.b a;
      private byte c;
      byte d;
      @azi
      protected final int b;

      d(ggx.b $$0, @Nullable jf $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jf $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jf $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jf $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @azi
      protected boolean a(int $$0) {
         return (this.c & 1 << $$0) > 0;
      }

      boolean a() {
         return this.c != 0;
      }

      @Override
      public int hashCode() {
         return this.a.f().hashCode();
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof gek.d $$1) ? false : this.a.f().equals($$1.a.f());
      }
   }

   static class e {
      private final gek.d[] a;

      e(int $$0) {
         this.a = new gek.d[$$0];
      }

      public void a(ggx.b $$0, gek.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public gek.d a(ggx.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
