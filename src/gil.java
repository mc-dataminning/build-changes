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

public class gil {
   private static final Logger a = LogUtils.getLogger();
   private static final jl[] b = jl.values();
   private static final int c = 60;
   private static final double d = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean e = true;
   @Nullable
   private Future<?> f;
   @Nullable
   private giu g;
   private final AtomicReference<gil.b> h = new AtomicReference<>();
   private final AtomicReference<gil.a> i = new AtomicReference<>();
   private final AtomicBoolean j = new AtomicBoolean(false);

   public void a(@Nullable giu $$0) {
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
         this.h.set(new gil.b($$0));
         this.a();
      } else {
         this.h.set(null);
      }
   }

   public void a() {
      this.e = true;
   }

   public void a(gln $$0, List<glj.b> $$1, List<glj.b> $$2) {
      this.h.get().a().b.a(($$2x, $$3, $$4, $$5) -> {
         glj.b $$6 = $$2x.a();
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

   public void a(deb $$0) {
      gil.a $$1 = this.i.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      gil.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(glj.b $$0) {
      gil.a $$1 = this.i.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      gil.a $$2 = this.h.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, fij $$1, gln $$2, List<glj.b> $$3, LongOpenHashSet $$4) {
      ezh $$5 = $$1.b();
      if (this.e && (this.f == null || this.f.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, fij $$1, ezh $$2, LongOpenHashSet $$3) {
      this.e = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.f = ad.g().submit(() -> {
         gil.b $$4x = new gil.b(this.g);
         this.i.set($$4x.b);
         Queue<gil.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {
         }, $$4);
         this.h.set($$4x);
         this.i.set(null);
         this.j.set(true);
      });
   }

   private void a(boolean $$0, gln $$1, List<glj.b> $$2, ezh $$3, LongOpenHashSet $$4) {
      gil.b $$5 = this.h.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<gil.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            glj.b $$7 = $$5.b.b.poll();
            gil.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         gln $$9 = ghs.a($$1);
         Consumer<glj.b> $$10 = $$1x -> {
            if ($$9.a($$1x.b())) {
               this.j.set(true);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(gil.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<glj.b> $$3 = (List<glj.b>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(gil.a $$0, deb $$1) {
      $$0.a.add(deb.c($$1.e - 1, $$1.f));
      $$0.a.add(deb.c($$1.e, $$1.f - 1));
      $$0.a.add(deb.c($$1.e + 1, $$1.f));
      $$0.a.add(deb.c($$1.e, $$1.f + 1));
   }

   private void a(fij $$0, Queue<gil.d> $$1) {
      jg $$2 = $$0.c();
      long $$3 = ki.c($$2);
      int $$4 = ki.c($$3);
      glj.b $$5 = this.g.a($$3);
      if ($$5 == null) {
         dex $$6 = this.g.c();
         boolean $$7 = $$4 < $$6.ap();
         int $$8 = $$7 ? $$6.ap() : $$6.aq();
         int $$9 = this.g.b();
         List<gil.d> $$10 = Lists.newArrayList();
         int $$11 = ki.b($$3);
         int $$12 = ki.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               glj.b $$15 = this.g.a(ki.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.g())) {
                  jl $$16 = $$7 ? jl.b : jl.a;
                  gil.d $$17 = new gil.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jl.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jl.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jl.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jl.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j($$1x.a.f().b(8, 8, 8))));
         $$1.addAll($$10);
      } else {
         $$1.add(new gil.d($$5, null, 0));
      }
   }

   private void a(gil.c $$0, ezh $$1, Queue<gil.d> $$2, boolean $$3, Consumer<glj.b> $$4, LongOpenHashSet $$5) {
      int $$6 = 16;
      jg $$7 = new jg(azj.a($$1.d / 16.0) * 16, azj.a($$1.e / 16.0) * 16, azj.a($$1.f / 16.0) * 16);
      long $$8 = ki.c($$7);
      jg $$9 = $$7.b(8, 8, 8);

      while (!$$2.isEmpty()) {
         gil.d $$10 = $$2.poll();
         glj.b $$11 = $$10.a;
         if (!$$5.contains($$10.a.g())) {
            if ($$0.b.a($$10.a)) {
               $$4.accept($$10.a);
            }
         } else {
            $$10.a.c.compareAndSet(glj.a.a, glj.a.b);
         }

         boolean $$12 = Math.abs($$11.f().u() - $$7.u()) > 60 || Math.abs($$11.f().v() - $$7.v()) > 60 || Math.abs($$11.f().w() - $$7.w()) > 60;

         for (jl $$13 : b) {
            glj.b $$14 = this.a($$8, $$11, $$13);
            if ($$14 != null && (!$$3 || !$$10.a($$13.g()))) {
               if ($$3 && $$10.a()) {
                  glj.a $$15 = $$11.d();
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
                  jg $$18 = $$14.f();
                  jg $$19 = $$18.b(
                     ($$13.o() == jl.a.a ? $$9.u() <= $$18.u() : $$9.u() >= $$18.u()) ? 0 : 16,
                     ($$13.o() == jl.a.b ? $$9.v() <= $$18.v() : $$9.v() >= $$18.v()) ? 0 : 16,
                     ($$13.o() == jl.a.c ? $$9.w() <= $$18.w() : $$9.w() >= $$18.w()) ? 0 : 16
                  );
                  ezh $$20 = new ezh((double)$$19.u(), (double)$$19.v(), (double)$$19.w());
                  ezh $$21 = $$1.d($$20).d().c(d);
                  boolean $$22 = true;

                  while ($$1.d($$20).h() > 3600.0) {
                     $$20 = $$20.e($$21);
                     dex $$23 = this.g.c();
                     if ($$20.e > (double)$$23.an() || $$20.e < (double)$$23.I_()) {
                        break;
                     }

                     glj.b $$24 = this.g.a(jg.a($$20.d, $$20.e, $$20.f));
                     if ($$24 == null || $$0.a.a($$24) == null) {
                        $$22 = false;
                        break;
                     }
                  }

                  if (!$$22) {
                     continue;
                  }
               }

               gil.d $$25 = $$0.a.a($$14);
               if ($$25 != null) {
                  $$25.b($$13);
               } else {
                  gil.d $$26 = new gil.d($$14, $$13, $$10.b + 1);
                  $$26.a($$10.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$26);
                     $$0.a.a($$14, $$26);
                  } else if (this.a($$8, $$14.g())) {
                     $$0.a.a($$14, $$26);
                     ((List)$$0.c.computeIfAbsent(deb.a($$14.f()), $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return aqx.a(ki.b($$0), ki.d($$0), this.g.b(), ki.b($$1), ki.d($$1));
   }

   @Nullable
   private glj.b a(long $$0, glj.b $$1, jl $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return azj.a(ki.c($$0) - ki.c($$3)) > this.g.b() ? null : this.g.a($$3);
      }
   }

   @Nullable
   @bap
   public gil.d b(glj.b $$0) {
      return this.h.get().a.a.a($$0);
   }

   public ghx c() {
      return this.h.get().a.b;
   }

   static record a(LongSet a, BlockingQueue<glj.b> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   static record b(gil.c a, gil.a b) {

      b(giu $$0) {
         this(new gil.c($$0), new gil.a());
      }
   }

   static class c {
      public final gil.e a;
      public final ghx b;
      public final Long2ObjectMap<List<glj.b>> c;

      public c(giu $$0) {
         this.a = new gil.e($$0.f.length);
         this.b = new ghx($$0.d(), $$0.b(), $$0.c, $$0.b.I_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @bap
   public static class d {
      @bap
      protected final glj.b a;
      private byte c;
      byte d;
      @bap
      public final int b;

      d(glj.b $$0, @Nullable jl $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jl $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jl $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jl $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @bap
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
         return !($$0 instanceof gil.d $$1) ? false : this.a.g() == $$1.a.g();
      }
   }

   static class e {
      private final gil.d[] a;

      e(int $$0) {
         this.a = new gil.d[$$0];
      }

      public void a(glj.b $$0, gil.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public gil.d a(glj.b $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
