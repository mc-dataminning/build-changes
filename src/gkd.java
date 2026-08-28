import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gkd {
   public static final gkd a = new gkd();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gkd.a[] c;
   private final all[] d;

   private gkd() {
      this.c = new gkd.a[0];
      this.d = new all[0];
   }

   public gkd(hbe $$0, List<gkn> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gkn.b::a).distinct().toArray(all[]::new);
      Object2IntMap<all> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gkd.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gkn $$6 = $$1.get($$5);
         hav $$7 = $$0.a($$6.a(), haw.a);
         gkd.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gkd.b($$2x, $$1x.b());
         }).toArray(gkd.b[]::new);
         $$4.add(new gkd.a($$8, $$7));
      }

      this.c = $$4.toArray(new gkd.a[0]);
   }

   @Nullable
   public hav a(cwf $$0, @Nullable gcy $$1, @Nullable bve $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            all $$7 = this.d[$$6];
            gxz $$8 = gxy.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gkd.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gkd.b[] a, @Nullable hav b) {

      boolean a(float[] $$0) {
         for (gkd.b $$1 : this.a) {
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
