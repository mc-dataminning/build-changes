import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gmk {
   public static final gmk a = new gmk();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gmk.a[] c;
   private final alz[] d;

   private gmk() {
      this.c = new gmk.a[0];
      this.d = new alz[0];
   }

   public gmk(hdp $$0, List<gmu> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gmu.b::a).distinct().toArray(alz[]::new);
      Object2IntMap<alz> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gmk.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gmu $$6 = $$1.get($$5);
         hdg $$7 = $$0.a($$6.a(), hdh.a);
         gmk.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gmk.b($$2x, $$1x.b());
         }).toArray(gmk.b[]::new);
         $$4.add(new gmk.a($$8, $$7));
      }

      this.c = $$4.toArray(new gmk.a[0]);
   }

   @Nullable
   public hdg a(cxk $$0, @Nullable gfd $$1, @Nullable bwb $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            alz $$7 = this.d[$$6];
            hak $$8 = haj.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gmk.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gmk.b[] a, @Nullable hdg b) {

      boolean a(float[] $$0) {
         for (gmk.b $$1 : this.a) {
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
