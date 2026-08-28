import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gjn {
   public static final gjn a = new gjn();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gjn.a[] c;
   private final ali[] d;

   private gjn() {
      this.c = new gjn.a[0];
      this.d = new ali[0];
   }

   public gjn(hao $$0, List<gjx> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gjx.b::a).distinct().toArray(ali[]::new);
      Object2IntMap<ali> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gjn.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gjx $$6 = $$1.get($$5);
         haf $$7 = $$0.a($$6.a(), hag.a);
         gjn.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gjn.b($$2x, $$1x.b());
         }).toArray(gjn.b[]::new);
         $$4.add(new gjn.a($$8, $$7));
      }

      this.c = $$4.toArray(new gjn.a[0]);
   }

   @Nullable
   public haf a(cwb $$0, @Nullable gci $$1, @Nullable bva $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            ali $$7 = this.d[$$6];
            gxj $$8 = gxi.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gjn.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gjn.b[] a, @Nullable haf b) {

      boolean a(float[] $$0) {
         for (gjn.b $$1 : this.a) {
            float $$2 = $$0[$$1.a];
            if ($$2 < $$1.b) {
               return false;
            }
         }

         return true;
      }
   }

   static record b(int a, float b) {
   }
}
