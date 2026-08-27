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

public class fvy {
   private static final Logger a = LogUtils.getLogger();
   private static final ie[] b = ie.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private fwc g;
   private final AtomicReference<fvy.b> h = new AtomicReference<>();
   private final AtomicReference<fvy.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable fwc $$0) {
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
         this.h.set(new fvy.b($$0.f.length));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(fyo $$0, List<fyk.b> $$1) {
      for (fvy.d $$2 : this.h.get().a().b) {
         if ($$0.a($$2.a.b())) {
            $$1.add($$2.a);
         }
      }
   }

   public boolean b() {
      return this.j.compareAndSet(true, false);
   }

   public void a(cuu $$0) {
      fvy.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      fvy.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(fyk.b $$0) {
      fvy.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      fvy.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, ews $$1, fyo $$2, List<fyk.b> $$3) {
      ens $$4 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$4);
      }

      this.a($$0, $$2, $$3, $$4);
   }

   private void a(boolean $$0, ews $$1, ens $$2) {
      this.e = false;
      this.f = ac.f().submit(() -> {
         fvy.b $$3 = new fvy.b(this.g.f.length);
         this.i.set($$3.b);
         Queue<fvy.d> $$4 = Queues.newArrayDeque();
         this.a($$1, $$4);
         $$4.forEach($$1xx -> $$3.a.a.a($$1xx.a, $$1xx));
         this.a($$3.a, $$2, $$4, $$0, $$0xx -> {
         });
         this.h.set($$3);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, fyo $$1, List<fyk.b> $$2, ens $$3) {
      fvy.b $$4 = this.h.get();
      this.a($$4);
      if (!$$4.b.b.isEmpty()) {
         Queue<fvy.d> $$5 = Queues.newArrayDeque();

         while (!$$4.b.b.isEmpty()) {
            fyk.b $$6 = $$4.b.b.poll();
            fvy.d $$7 = $$4.a.a.a($$6);
            if ($$7 != null && $$7.a == $$6) {
               $$5.add($$7);
            }
         }

         fyo $$8 = fvj.a($$1);
         Consumer<fyk.b> $$9 = $$2x -> {
            if ($$8.a($$2x.b())) {
               $$2.add($$2x);
            }
         };
         this.a($$4.a, $$3, $$5, $$0, $$9);
      }
   }

   private void a(fvy.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<fyk.b> $$3 = (List<fyk.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(fvy.a $$0, cuu $$1) {
      $$0.a.add(cuu.c($$1.e - 1, $$1.f));
      $$0.a.add(cuu.c($$1.e, $$1.f - 1));
      $$0.a.add(cuu.c($$1.e + 1, $$1.f));
      $$0.a.add(cuu.c($$1.e, $$1.f + 1));
   }

   private void a(ews $$0, Queue<fvy.d> $$1) {
      int $$2 = 16;
      ens $$3 = $$0.b();
      hz $$4 = $$0.c();
      fyk.b $$5 = this.g.a($$4);
      if ($$5 == null) {
         cvp $$6 = this.g.c();
         boolean $$7 = $$4.v() > $$6.J_();
         int $$8 = $$7 ? $$6.al() - 8 : $$6.J_() + 8;
         int $$9 = awh.a($$3.c / 16.0) * 16;
         int $$10 = awh.a($$3.e / 16.0) * 16;
         int $$11 = this.g.b();
         List<fvy.d> $$12 = Lists.newArrayList();

         for (int $$13 = -$$11; $$13 <= $$11; $$13++) {
            for (int $$14 = -$$11; $$14 <= $$11; $$14++) {
               fyk.b $$15 = this.g.a(new hz($$9 + jb.a($$13, 8), $$8, $$10 + jb.a($$14, 8)));
               if ($$15 != null && this.a($$4, $$15.f())) {
                  ie $$16 = $$7 ? ie.a : ie.b;
                  fvy.d $$17 = new fvy.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, ie.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, ie.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, ie.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, ie.c);
                  }

                  $$12.add($$17);
               }
            }
         }

         $$12.sort(Comparator.comparingDouble($$1x -> $$4.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$12);
      } else {
         $$1.add(new fvy.d($$5, null, 0));
      }
   }

   private void a(fvy.c $$0, ens $$1, Queue<fvy.d> $$2, boolean $$3, Consumer<fyk.b> $$4) {
      int $$5 = 16;
      hz $$6 = new hz(awh.a($$1.c / 16.0) * 16, awh.a($$1.d / 16.0) * 16, awh.a($$1.e / 16.0) * 16);
      hz $$7 = $$6.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         fvy.d $$8 = $$2.poll();
         fyk.b $$9 = $$8.a;
         if ($$0.b.add($$8)) {
            $$4.accept($$8.a);
         }

         boolean $$10 = Math.abs($$9.f().u() - $$6.u()) > 60 || Math.abs($$9.f().v() - $$6.v()) > 60 || Math.abs($$9.f().w() - $$6.w()) > 60;

         for (ie $$11 : b) {
            fyk.b $$12 = this.a($$6, $$9, $$11);
            if ($$12 != null && (!$$3 || !$$8.a($$11.g()))) {
               if ($$3 && $$8.a()) {
                  fyk.a $$13 = $$9.d();
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
                  hz $$16 = $$12.f();
                  hz $$17 = $$16.b(
                     ($$11.o() == ie.a.a ? $$7.u() <= $$16.u() : $$7.u() >= $$16.u()) ? 0 : 16,
                     ($$11.o() == ie.a.b ? $$7.v() <= $$16.v() : $$7.v() >= $$16.v()) ? 0 : 16,
                     ($$11.o() == ie.a.c ? $$7.w() <= $$16.w() : $$7.w() >= $$16.w()) ? 0 : 16
                  );
                  ens $$18 = new ens((double)$$17.u(), (double)$$17.v(), (double)$$17.w());
                  ens $$19 = $$1.d($$18).d().a(d);
                  boolean $$20 = true;

                  while ($$1.d($$18).g() > 3600.0) {
                     $$18 = $$18.e($$19);
                     cvp $$21 = this.g.c();
                     if ($$18.d > (double)$$21.al() || $$18.d < (double)$$21.J_()) {
                        break;
                     }

                     fyk.b $$22 = this.g.a(hz.a($$18.c, $$18.d, $$18.e));
                     if ($$22 == null || $$0.a.a($$22) == null) {
                        $$20 = false;
                        break;
                     }
                  }

                  if (!$$20) {
                     continue;
                  }
               }

               fvy.d $$23 = $$0.a.a($$12);
               if ($$23 != null) {
                  $$23.b($$11);
               } else {
                  fvy.d $$24 = new fvy.d($$12, $$11, $$8.b + 1);
                  $$24.a($$8.d, $$11);
                  if ($$12.a()) {
                     $$2.add($$24);
                     $$0.a.a($$12, $$24);
                  } else if (this.a($$6, $$12.f())) {
                     $$0.a.a($$12, $$24);
                     ((List)$$0.c.computeIfAbsent(cuu.a($$12.f()), $$0x -> new ArrayList())).add($$12);
                  }
               }
            }
         }
      }
   }

   private boolean a(hz $$0, hz $$1) {
      int $$2 = jb.a($$0.u());
      int $$3 = jb.a($$0.w());
      int $$4 = jb.a($$1.u());
      int $$5 = jb.a($$1.w());
      return aoj.a($$2, $$3, this.g.b(), $$4, $$5);
   }

   @Nullable
   private fyk.b a(hz $$0, fyk.b $$1, ie $$2) {
      hz $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return awh.a($$0.v() - $$3.v()) > this.g.b() * 16 ? null : this.g.a($$3);
      }
   }

   @Nullable
   @axl
   protected fvy.d b(fyk.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   static record a(LongSet a, BlockingQueue<fyk.b> b) {

      public a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(fvy.c a, fvy.a b) {

      public b(int $$0) {
         this(new fvy.c($$0), new fvy.a());
      }
   }

   static class c {
      public final fvy.e a;
      public final LinkedHashSet<fvy.d> b;
      public final Long2ObjectMap<List<fyk.b>> c;

      public c(int $$0) {
         this.a = new fvy.e($$0);
         this.b = new LinkedHashSet<>($$0);
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @axl
   protected static class d {
      @axl
      protected final fyk.b a;
      private byte c;
      byte d;
      @axl
      protected final int b;

      d(fyk.b $$0, @Nullable ie $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, ie $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(ie $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(ie $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @axl
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
         return !($$0 instanceof fvy.d $$1) ? false : this.a.f().equals($$1.a.f());
      }
   }

   static class e {
      private final fvy.d[] a;

      e(int $$0) {
         this.a = new fvy.d[$$0];
      }

      public void a(fyk.b $$0, fvy.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public fvy.d a(fyk.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
