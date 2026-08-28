import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gkm {
   public static final gkm a = new gkm();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gkm.a[] c;
   private final alj[] d;

   private gkm() {
      this.c = new gkm.a[0];
      this.d = new alj[0];
   }

   public gkm(hbp $$0, List<gkw> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gkw.b::a).distinct().toArray(alj[]::new);
      Object2IntMap<alj> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gkm.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gkw $$6 = $$1.get($$5);
         hbg $$7 = $$0.a($$6.a(), hbh.a);
         gkm.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gkm.b($$2x, $$1x.b());
         }).toArray(gkm.b[]::new);
         $$4.add(new gkm.a($$8, $$7));
      }

      this.c = $$4.toArray(new gkm.a[0]);
   }

   @Nullable
   public hbg a(cwm $$0, @Nullable gdh $$1, @Nullable bvh $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            alj $$7 = this.d[$$6];
            gyk $$8 = gyj.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gkm.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gkm.b[] a, @Nullable hbg b) {

      boolean a(float[] $$0) {
         for (gkm.b $$1 : this.a) {
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
