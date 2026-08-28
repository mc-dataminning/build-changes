import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import org.slf4j.Logger;

public class fwq implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final bai b = bai.a();
   private static final float c = 32.0F;
   private final hks d;
   private final alr e;
   private fwu f;
   private fwu g;
   private List<fis.a> h = List.of();
   private List<fis> i = List.of();
   private final fwn<fwu> j = new fwn<>(fwu[]::new, fwu[][]::new);
   private final fwn<fwq.a> k = new fwn<>(fwq.a[]::new, fwq.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fwr> m = Lists.newArrayList();
   private final IntFunction<fwq.a> n = this::b;
   private final IntFunction<fwu> o = this::c;

   public fwq(hks $$0, alr $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fis.a> $$0, Set<fwp> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fwp> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.m.clear();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fww.b.bake(this::a);
      this.g = fww.a.bake(this::a);
   }

   private List<fis> b(List<fis.a> $$0, Set<fwp> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fis> $$3 = new ArrayList<>();

      for (fis.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fis> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fis $$3x : $$3) {
            fir $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fww.b) {
                  ((IntList)this.l.computeIfAbsent(azz.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.m.clear();
   }

   private static boolean b(fir $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fwq.a b(int $$0) {
      fir $$1 = null;

      for (fis $$2 : this.i) {
         fir $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fwq.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fwq.a($$1, fww.b) : fwq.a.c;
   }

   public fir a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fwu c(int $$0) {
      for (fis $$1 : this.i) {
         fir $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fwu a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fwu a(fit $$0) {
      for (fwr $$1 : this.m) {
         fwu $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alr $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fws $$5 = $$4 ? fws.b($$3) : fws.a($$3);
      fwr $$6 = new fwr($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fwu $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fwu a(fir $$0) {
      IntList $$1 = (IntList)this.l.get(azz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alr a() {
      return this.e;
   }

   public fwu b() {
      return this.g;
   }

   static record a(fir a, fir b) {
      static final fwq.a c = new fwq.a(fww.b, fww.b);

      fir a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
