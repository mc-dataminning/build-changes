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

public class fui implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final azt b = azt.a();
   private static final float c = 32.0F;
   private final hib d;
   private final ale e;
   private fum f;
   private fum g;
   private List<fgp.a> h = List.of();
   private List<fgp> i = List.of();
   private final fuf<fum> j = new fuf<>(fum[]::new, fum[][]::new);
   private final fuf<fui.a> k = new fuf<>(fui.a[]::new, fui.a[][]::new);
   private final Int2ObjectMap<IntList> l = new Int2ObjectOpenHashMap();
   private final List<fuj> m = Lists.newArrayList();
   private final IntFunction<fui.a> n = this::b;
   private final IntFunction<fum> o = this::c;

   public fui(hib $$0, ale $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(List<fgp.a> $$0, Set<fuh> $$1) {
      this.h = $$0;
      this.a($$1);
   }

   public void a(Set<fuh> $$0) {
      this.i = List.of();
      this.c();
      this.i = this.b(this.h, $$0);
   }

   private void c() {
      this.d();
      this.j.a();
      this.k.a();
      this.l.clear();
      this.f = fuo.b.bake(this::a);
      this.g = fuo.a.bake(this::a);
   }

   private List<fgp> b(List<fgp.a> $$0, Set<fuh> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fgp> $$3 = new ArrayList<>();

      for (fgp.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fgp> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fgp $$3x : $$3) {
            fgo $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fuo.b) {
                  ((IntList)this.l.computeIfAbsent(azk.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fuj $$0 : this.m) {
         $$0.close();
      }

      this.m.clear();
   }

   private static boolean b(fgo $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fui.a b(int $$0) {
      fgo $$1 = null;

      for (fgp $$2 : this.i) {
         fgo $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fui.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fui.a($$1, fuo.b) : fui.a.c;
   }

   public fgo a(int $$0, boolean $$1) {
      return this.k.a($$0, this.n).a($$1);
   }

   private fum c(int $$0) {
      for (fgp $$1 : this.i) {
         fgo $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      a.warn("Couldn't find glyph for character {} (\\u{})", Character.toString($$0), String.format("%04x", $$0));
      return this.f;
   }

   public fum a(int $$0) {
      return this.j.a($$0, this.o);
   }

   private fum a(fgq $$0) {
      for (fuj $$1 : this.m) {
         fum $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ale $$3 = this.e.g("/" + this.m.size());
      boolean $$4 = $$0.c();
      fuk $$5 = $$4 ? fuk.b($$3) : fuk.a($$3);
      fuj $$6 = new fuj($$5, $$4);
      this.m.add($$6);
      this.d.a($$3, $$6);
      fum $$7 = $$6.a($$0);
      return $$7 == null ? this.f : $$7;
   }

   public fum a(fgo $$0) {
      IntList $$1 = (IntList)this.l.get(azk.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(b.a($$1.size()))) : this.f;
   }

   public ale a() {
      return this.e;
   }

   public fum b() {
      return this.g;
   }

   static record a(fgo a, fgo b) {
      static final fui.a c = new fui.a(fuo.b, fuo.b);

      fgo a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
