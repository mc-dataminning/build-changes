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

public class fvs implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azv b = azv.a();
   private static final float c = 32.0F;
   private final hjs d;
   private final alg e;
   private fvw f;
   private fvw g;
   private List<fhw.a> h = List.of();
   private List<fhw> i = List.of();
   private final fvp<fvw> j = new fvp<>(fvw[]::new, fvw[][]::new);
   private final fvp<fvs.a> k = new fvp<>(fvs.a[]::new, fvs.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fvt> m = Lists.newArrayList();
   private final IntFunction<fvs.a> n = this::b;
   private final IntFunction<fvw> o = this::c;

   public fvs(hjs $$0, alg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fhw.a> $$0, Set<fvr> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fvr> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.m.clear();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fvy.b.bake(this::a);
      this.g = fvy.a.bake(this::a);
   }

   private List<fhw> b(List<fhw.a> $$0, Set<fvr> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fhw> $$3 = new ArrayList<>();

      for (fhw.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fhw> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fhw $$3x : $$3) {
            fhv $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fvy.b) {
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
      this.m.clear();
   }

   private static boolean b(fhv $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fvs.a b(int $$0) {
      fhv $$1 = null;

      for (fhw $$2 : this.i) {
         fhv $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fvs.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fvs.a($$1, fvy.b) : fvs.a.c;
   }

   public fhv a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fvw c(int $$0) {
      for (fhw $$1 : this.i) {
         fhv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fvw a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fvw a(fhx $$0) {
      for (fvt $$1 : this.m) {
         fvw $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alg $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fvu $$5 = $$4 ? fvu.b($$3) : fvu.a($$3);
      fvt $$6 = new fvt($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fvw $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fvw a(fhv $$0) {
      IntList $$1 = (IntList)this.l.get(azm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alg a() {
      return this.e;
   }

   public fvw b() {
      return this.g;
   }

   static record a(fhv a, fhv b) {
      static final fvs.a c = new fvs.a(fvy.b, fvy.b);

      fhv a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
