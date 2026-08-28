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

public class grh {
   private static final Logger a = LogUtils.getLogger();
   private static final jb[] b = jb.values();
   private static final int c = 60;
   private static final int d = jy.a(60);
   private static final double e = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean f = true;
   @Nullable
   private Future<?> g;
   @Nullable
   private grp h;
   private final AtomicReference<grh.b> i = new AtomicReference<>();
   private final AtomicReference<grh.a> j = new AtomicReference<>();
   private final AtomicBoolean k = new AtomicBoolean(false);

   public void a(@Nullable grp $$0) {
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
         this.i.set(new grh.b($$0));
         this.a();
      } else {
         this.i.set(null);
      }
   }

   public void a() {
      this.f = true;
   }

   public void a(guk $$0, List<gug.b> $$1, List<gug.b> $$2) {
      this.i.get().a().b.a(($$2x, $$3, $$4, $$5) -> {
         gug.b $$6 = $$2x.a();
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

   public void a(dir $$0) {
      grh.a $$1 = this.j.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      grh.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(gug.b $$0) {
      grh.a $$1 = this.j.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      grh.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fpb $$1, guk $$2, List<gug.b> $$3, LongOpenHashSet $$4) {
      ffc $$5 = $$1.b();
      if (this.f && (this.g == null || this.g.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fpb $$1, ffc $$2, LongOpenHashSet $$3) {
      this.f = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.g = CompletableFuture.runAsync(() -> {
         grh.b $$4x = new grh.b(this.h);
         this.j.set($$4x.b);
         Queue<grh.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.i.set($$4x);
         this.j.set(null);
         this.k.set(true);
      }, ag.h());
   }

   private void a(boolean $$0, guk $$1, List<gug.b> $$2, ffc $$3, LongOpenHashSet $$4) {
      grh.b $$5 = this.i.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<grh.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            gug.b $$7 = $$5.b.b.poll();
            grh.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         guk $$9 = gqm.a($$1);
         Consumer<gug.b> $$10 = $$1x -> {
            if ($$9.a($$1x.b())) {
               this.k.set(true);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(grh.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<gug.b> $$3 = (List<gug.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(grh.a $$0, dir $$1) {
      $$0.a.add(dir.c($$1.h - 1, $$1.i));
      $$0.a.add(dir.c($$1.h, $$1.i - 1));
      $$0.a.add(dir.c($$1.h + 1, $$1.i));
      $$0.a.add(dir.c($$1.h, $$1.i + 1));
      $$0.a.add(dir.c($$1.h - 1, $$1.i - 1));
      $$0.a.add(dir.c($$1.h - 1, $$1.i + 1));
      $$0.a.add(dir.c($$1.h + 1, $$1.i - 1));
      $$0.a.add(dir.c($$1.h + 1, $$1.i + 1));
   }

   private void a(fpb $$0, Queue<grh.d> $$1) {
      iv $$2 = $$0.c();
      long $$3 = jy.c($$2);
      int $$4 = jy.c($$3);
      gug.b $$5 = this.h.a($$3);
      if ($$5 == null) {
         djo $$6 = this.h.c();
         boolean $$7 = $$4 < $$6.aq();
         int $$8 = $$7 ? $$6.aq() : $$6.ar();
         int $$9 = this.h.b();
         List<grh.d> $$10 = Lists.newArrayList();
         int $$11 = jy.b($$3);
         int $$12 = jy.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               gug.b $$15 = this.h.a(jy.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jb $$16 = $$7 ? jb.b : jb.a;
                  grh.d $$17 = new grh.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jb.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jb.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jb.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jb.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j(jy.a($$1x.a.g()).k())));
         $$1.addAll($$10);
      } else {
         $$1.add(new grh.d($$5, null, 0));
      }
   }

   private void a(grh.c $$0, ffc $$1, Queue<grh.d> $$2, boolean $$3, Consumer<gug.b> $$4, LongOpenHashSet $$5) {
      jy $$6 = jy.a($$1);
      long $$7 = $$6.s();
      iv $$8 = $$6.k();

      while (!$$2.isEmpty()) {
         grh.d $$9 = $$2.poll();
         gug.b $$10 = $$9.a;
         if (!$$5.contains($$9.a.g())) {
            if ($$0.b.a($$9.a)) {
               $$4.accept($$9.a);
            }
         } else {
            $$9.a.c.compareAndSet(gug.a.a, gug.a.b);
         }

         long $$11 = $$10.g();
         boolean $$12 = Math.abs(jy.b($$11) - $$6.a()) > d || Math.abs(jy.c($$11) - $$6.b()) > d || Math.abs(jy.d($$11) - $$6.c()) > d;

         for (jb $$13 : b) {
            gug.b $$14 = this.a($$7, $$10, $$13);
            if ($$14 != null && (!$$3 || !$$9.a($$13.g()))) {
               if ($$3 && $$9.a()) {
                  gug.a $$15 = $$10.d();
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
                  int $$18 = jy.c(jy.b($$11));
                  int $$19 = jy.c(jy.c($$11));
                  int $$20 = jy.c(jy.d($$11));
                  boolean $$21 = $$13.o() == jb.a.a ? $$8.u() > $$18 : $$8.u() < $$18;
                  boolean $$22 = $$13.o() == jb.a.b ? $$8.v() > $$19 : $$8.v() < $$19;
                  boolean $$23 = $$13.o() == jb.a.c ? $$8.w() > $$20 : $$8.w() < $$20;
                  Vector3d $$24 = new Vector3d((double)($$18 + ($$21 ? 16 : 0)), (double)($$19 + ($$22 ? 16 : 0)), (double)($$20 + ($$23 ? 16 : 0)));
                  Vector3d $$25 = new Vector3d($$1.d, $$1.e, $$1.f).sub($$24).normalize().mul(e);
                  boolean $$26 = true;

                  while ($$24.distanceSquared($$1.d, $$1.e, $$1.f) > 3600.0) {
                     $$24.add($$25);
                     djo $$27 = this.h.c();
                     if ($$24.y > (double)$$27.ao() || $$24.y < (double)$$27.G_()) {
                        break;
                     }

                     gug.b $$28 = this.h.a(iv.a($$24.x, $$24.y, $$24.z));
                     if ($$28 == null || $$0.a.a($$28) == null) {
                        $$26 = false;
                        break;
                     }
                  }

                  if (!$$26) {
                     continue;
                  }
               }

               grh.d $$29 = $$0.a.a($$14);
               if ($$29 != null) {
                  $$29.b($$13);
               } else {
                  grh.d $$30 = new grh.d($$14, $$13, $$9.b + 1);
                  $$30.a($$9.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$30);
                     $$0.a.a($$14, $$30);
                  } else if (this.a($$7, $$14.g())) {
                     $$0.a.a($$14, $$30);
                     long $$31 = jy.g($$14.g());
                     ((List)$$0.c.computeIfAbsent($$31, $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return aqz.a(jy.b($$0), jy.d($$0), this.h.b(), jy.b($$1), jy.d($$1));
   }

   @Nullable
   private gug.b a(long $$0, gug.b $$1, jb $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azm.a(jy.c($$0) - jy.c($$3)) > this.h.b() ? null : this.h.a($$3);
      }
   }

   @Nullable
   @bav
   public grh.d b(gug.b $$0) {
      return this.i.get().a.a.a($$0);
   }

   public gqs c() {
      return this.i.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<gug.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(grh.c a, grh.a b) {

      b(grp $$0) {
         this(new grh.c($$0), new grh.a());
      }
   }

   static class c {
      public final grh.e a;
      public final gqs b;
      public final Long2ObjectMap<List<gug.b>> c;

      public c(grp $$0) {
         this.a = new grh.e($$0.f.length);
         this.b = new gqs($$0.d(), $$0.b(), $$0.c, $$0.b.G_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @bav
   public static class d {
      @bav
      protected final gug.b a;
      private byte c;
      byte d;
      @bav
      public final int b;

      d(gug.b $$0, @Nullable jb $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jb $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jb $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jb $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @bav
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
         return !($$0 instanceof grh.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final grh.d[] a;

      e(int $$0) {
         this.a = new grh.d[$$0];
      }

      public void a(gug.b $$0, grh.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public grh.d a(gug.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
