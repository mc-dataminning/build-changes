import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fun {
   public static final fun a = new fun();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fun.a[] c;
   private final ahg[] d;

   private fun() {
      this.c = new fun.a[0];
      this.d = new ahg[0];
   }

   public fun(ggq $$0, fui $$1, List<fum> $$2) {
      this.d = $$2.stream().flatMap(fum::b).map(fum.b::a).distinct().toArray(ahg[]::new);
      Object2IntMap<ahg> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fun.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fum $$7 = $$2.get($$6);
         ggm $$8 = this.a($$0, $$1, $$7);
         fun.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fun.b($$2x, $$1x.b());
         }).toArray(fun.b[]::new);
         $$5.add(new fun.a($$9, $$8));
      }

      this.c = $$5.toArray(new fun.a[0]);
   }

   @Nullable
   private ggm a(ggq $$0, fui $$1, fum $$2) {
      ggx $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), ggn.a);
   }

   @Nullable
   public ggm a(ggm $$0, cmx $$1, @Nullable fnr $$2, @Nullable bmk $$3, int $$4) {
      if (this.c.length != 0) {
         cms $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ahg $$9 = this.d[$$8];
            gdu $$10 = gdt.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fun.a $$11 : this.c) {
            if ($$11.a($$7)) {
               ggm $$12 = $$11.b;
               if ($$12 == null) {
                  return $$0;
               }

               return $$12;
            }
         }
      }

      return $$0;
   }

   static class a {
      private final fun.b[] a;
      @Nullable
      final ggm b;

      a(fun.b[] $$0, @Nullable ggm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fun.b $$1 : this.a) {
            float $$2 = $$0[$$1.a];
            if ($$2 < $$1.b) {
               return false;
            }
         }

         return true;
      }
   }

   static class b {
      public final int a;
      public final float b;

      b(int $$0, float $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
