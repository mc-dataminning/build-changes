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

public class fxf implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azz b = azz.a();
   private static final float c = 32.0F;
   private final hle d;
   private final alk e;
   private fxj f;
   private fxj g;
   private List<fim.a> h = List.of();
   private List<fim> i = List.of();
   private final fxc<fxj> j = new fxc<>(fxj[]::new, fxj[][]::new);
   private final fxc<fxf.a> k = new fxc<>(fxf.a[]::new, fxf.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fxg> m = Lists.newArrayList();
   private final IntFunction<fxf.a> n = this::b;
   private final IntFunction<fxj> o = this::c;

   public fxf(hle $$0, alk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fim.a> $$0, Set<fxe> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fxe> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.m.clear();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fxl.b.bake(this::a);
      this.g = fxl.a.bake(this::a);
   }

   private List<fim> b(List<fim.a> $$0, Set<fxe> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fim> $$3 = new ArrayList<>();

      for (fim.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fim> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fim $$3x : $$3) {
            fil $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fxl.b) {
                  ((IntList)this.l.computeIfAbsent(azq.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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

   private static boolean b(fil $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fxf.a b(int $$0) {
      fil $$1 = null;

      for (fim $$2 : this.i) {
         fil $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fxf.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fxf.a($$1, fxl.b) : fxf.a.c;
   }

   public fil a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fxj c(int $$0) {
      for (fim $$1 : this.i) {
         fil $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fxj a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fxj a(fin $$0) {
      for (fxg $$1 : this.m) {
         fxj $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alk $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fxh $$5 = $$4 ? fxh.b($$3) : fxh.a($$3);
      fxg $$6 = new fxg($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fxj $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fxj a(fil $$0) {
      IntList $$1 = (IntList)this.l.get(azq.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alk a() {
      return this.e;
   }

   public fxj b() {
      return this.g;
   }

   static record a(fil a, fil b) {
      static final fxf.a c = new fxf.a(fxl.b, fxl.b);

      fil a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
