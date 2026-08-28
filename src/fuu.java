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

public class fuu implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azv b = azv.a();
   private static final float c = 32.0F;
   private final hir d;
   private final alg e;
   private fuy f;
   private fuy g;
   private List<fhb.a> h = List.of();
   private List<fhb> i = List.of();
   private final fur<fuy> j = new fur<>(fuy[]::new, fuy[][]::new);
   private final fur<fuu.a> k = new fur<>(fuu.a[]::new, fuu.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fuv> m = Lists.newArrayList();
   private final IntFunction<fuu.a> n = this::b;
   private final IntFunction<fuy> o = this::c;

   public fuu(hir $$0, alg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fhb.a> $$0, Set<fut> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fut> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fva.b.bake(this::a);
      this.g = fva.a.bake(this::a);
   }

   private List<fhb> b(List<fhb.a> $$0, Set<fut> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fhb> $$3 = new ArrayList<>();

      for (fhb.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fhb> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fhb $$3x : $$3) {
            fha $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fva.b) {
                  ((IntList)this.l.computeIfAbsent(azm.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (fuv $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fha $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fuu.a b(int $$0) {
      fha $$1 = null;

      for (fhb $$2 : this.i) {
         fha $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fuu.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fuu.a($$1, fva.b) : fuu.a.c;
   }

   public fha a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fuy c(int $$0) {
      for (fhb $$1 : this.i) {
         fha $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fuy a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fuy a(fhc $$0) {
      for (fuv $$1 : this.m) {
         fuy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alg $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fuw $$5 = $$4 ? fuw.b($$3) : fuw.a($$3);
      fuv $$6 = new fuv($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fuy $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fuy a(fha $$0) {
      IntList $$1 = (IntList)this.l.get(azm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alg a() {
      return this.e;
   }

   public fuy b() {
      return this.g;
   }

   static record a(fha a, fha b) {
      static final fuu.a c = new fuu.a(fva.b, fva.b);

      fha a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
