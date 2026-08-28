import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gmm {
   public static final gmm a = new gmm();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gmm.a[] c;
   private final alp[] d;

   private gmm() {
      this.c = new gmm.a[0];
      this.d = new alp[0];
   }

   public gmm(hdr $$0, List<gmw> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gmw.b::a).distinct().toArray(alp[]::new);
      Object2IntMap<alp> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gmm.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gmw $$6 = $$1.get($$5);
         hdi $$7 = $$0.a($$6.a(), hdj.a);
         gmm.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gmm.b($$2x, $$1x.b());
         }).toArray(gmm.b[]::new);
         $$4.add(new gmm.a($$8, $$7));
      }

      this.c = $$4.toArray(new gmm.a[0]);
   }

   @Nullable
   public hdi a(cxg $$0, @Nullable gff $$1, @Nullable bvx $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            alp $$7 = this.d[$$6];
            ham $$8 = hal.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gmm.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gmm.b[] a, @Nullable hdi b) {

      boolean a(float[] $$0) {
         for (gmm.b $$1 : this.a) {
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
