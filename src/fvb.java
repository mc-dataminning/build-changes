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

public class fvb implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azv b = azv.a();
   private static final float c = 32.0F;
   private final hiz d;
   private final alg e;
   private fvf f;
   private fvf g;
   private List<fhj.a> h = List.of();
   private List<fhj> i = List.of();
   private final fuy<fvf> j = new fuy<>(fvf[]::new, fvf[][]::new);
   private final fuy<fvb.a> k = new fuy<>(fvb.a[]::new, fvb.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fvc> m = Lists.newArrayList();
   private final IntFunction<fvb.a> n = this::b;
   private final IntFunction<fvf> o = this::c;

   public fvb(hiz $$0, alg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fhj.a> $$0, Set<fva> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fva> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fvh.b.bake(this::a);
      this.g = fvh.a.bake(this::a);
   }

   private List<fhj> b(List<fhj.a> $$0, Set<fva> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fhj> $$3 = new ArrayList<>();

      for (fhj.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fhj> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fhj $$3x : $$3) {
            fhi $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fvh.b) {
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
      for (fvc $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fhi $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fvb.a b(int $$0) {
      fhi $$1 = null;

      for (fhj $$2 : this.i) {
         fhi $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fvb.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fvb.a($$1, fvh.b) : fvb.a.c;
   }

   public fhi a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fvf c(int $$0) {
      for (fhj $$1 : this.i) {
         fhi $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fvf a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fvf a(fhk $$0) {
      for (fvc $$1 : this.m) {
         fvf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alg $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fvd $$5 = $$4 ? fvd.b($$3) : fvd.a($$3);
      fvc $$6 = new fvc($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fvf $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fvf a(fhi $$0) {
      IntList $$1 = (IntList)this.l.get(azm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alg a() {
      return this.e;
   }

   public fvf b() {
      return this.g;
   }

   static record a(fhi a, fhi b) {
      static final fvb.a c = new fvb.a(fvh.b, fvh.b);

      fhi a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
