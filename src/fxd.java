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

public class fxd implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azx b = azx.a();
   private static final float c = 32.0F;
   private final hlc d;
   private final ali e;
   private fxh f;
   private fxh g;
   private List<fik.a> h = List.of();
   private List<fik> i = List.of();
   private final fxa<fxh> j = new fxa<>(fxh[]::new, fxh[][]::new);
   private final fxa<fxd.a> k = new fxa<>(fxd.a[]::new, fxd.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fxe> m = Lists.newArrayList();
   private final IntFunction<fxd.a> n = this::b;
   private final IntFunction<fxh> o = this::c;

   public fxd(hlc $$0, ali $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fik.a> $$0, Set<fxc> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fxc> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.m.clear();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fxj.b.bake(this::a);
      this.g = fxj.a.bake(this::a);
   }

   private List<fik> b(List<fik.a> $$0, Set<fxc> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fik> $$3 = new ArrayList<>();

      for (fik.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fik> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fik $$3x : $$3) {
            fij $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fxj.b) {
                  ((IntList)this.l.computeIfAbsent(azo.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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

   private static boolean b(fij $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fxd.a b(int $$0) {
      fij $$1 = null;

      for (fik $$2 : this.i) {
         fij $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fxd.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fxd.a($$1, fxj.b) : fxd.a.c;
   }

   public fij a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fxh c(int $$0) {
      for (fik $$1 : this.i) {
         fij $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fxh a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fxh a(fil $$0) {
      for (fxe $$1 : this.m) {
         fxh $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ali $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fxf $$5 = $$4 ? fxf.b($$3) : fxf.a($$3);
      fxe $$6 = new fxe($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fxh $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fxh a(fij $$0) {
      IntList $$1 = (IntList)this.l.get(azo.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public ali a() {
      return this.e;
   }

   public fxh b() {
      return this.g;
   }

   static record a(fij a, fij b) {
      static final fxd.a c = new fxd.a(fxj.b, fxj.b);

      fij a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
