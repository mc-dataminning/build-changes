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

public class fvn implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azv b = azv.a();
   private static final float c = 32.0F;
   private final hjm d;
   private final alg e;
   private fvr f;
   private fvr g;
   private List<fhr.a> h = List.of();
   private List<fhr> i = List.of();
   private final fvk<fvr> j = new fvk<>(fvr[]::new, fvr[][]::new);
   private final fvk<fvn.a> k = new fvk<>(fvn.a[]::new, fvn.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fvo> m = Lists.newArrayList();
   private final IntFunction<fvn.a> n = this::b;
   private final IntFunction<fvr> o = this::c;

   public fvn(hjm $$0, alg $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fhr.a> $$0, Set<fvm> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fvm> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fvt.b.bake(this::a);
      this.g = fvt.a.bake(this::a);
   }

   private List<fhr> b(List<fhr.a> $$0, Set<fvm> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fhr> $$3 = new ArrayList<>();

      for (fhr.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fhr> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fhr $$3x : $$3) {
            fhq $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fvt.b) {
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
      for (fvo $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fhq $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fvn.a b(int $$0) {
      fhq $$1 = null;

      for (fhr $$2 : this.i) {
         fhq $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fvn.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fvn.a($$1, fvt.b) : fvn.a.c;
   }

   public fhq a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fvr c(int $$0) {
      for (fhr $$1 : this.i) {
         fhq $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fvr a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fvr a(fhs $$0) {
      for (fvo $$1 : this.m) {
         fvr $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alg $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fvp $$5 = $$4 ? fvp.b($$3) : fvp.a($$3);
      fvo $$6 = new fvo($$3::toString, $$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fvr $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fvr a(fhq $$0) {
      IntList $$1 = (IntList)this.l.get(azm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public alg a() {
      return this.e;
   }

   public fvr b() {
      return this.g;
   }

   static record a(fhq a, fhq b) {
      static final fvn.a c = new fvn.a(fvt.b, fvt.b);

      fhq a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
