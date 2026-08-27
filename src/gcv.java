import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gcv {
   public static final gcv a = new gcv();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gcv.a[] c;
   private final akh[] d;

   private gcv() {
      this.c = new gcv.a[0];
      this.d = new akh[0];
   }

   public gcv(gpd $$0, gcq $$1, List<gcu> $$2) {
      this.d = $$2.stream().flatMap(gcu::b).map(gcu.b::a).distinct().toArray(akh[]::new);
      Object2IntMap<akh> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gcv.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gcu $$7 = $$2.get($$6);
         goz $$8 = this.a($$0, $$1, $$7);
         gcv.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gcv.b($$2x, $$1x.b());
         }).toArray(gcv.b[]::new);
         $$5.add(new gcv.a($$9, $$8));
      }

      this.c = $$5.toArray(new gcv.a[0]);
   }

   @Nullable
   private goz a(gpd $$0, gcq $$1, gcu $$2) {
      gpk $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gpa.a);
   }

   @Nullable
   public goz a(goz $$0, csz $$1, @Nullable fvw $$2, @Nullable bsa $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akh $$8 = this.d[$$7];
            gmg $$9 = gmf.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gcv.a $$10 : this.c) {
            if ($$10.a($$6)) {
               goz $$11 = $$10.b;
               if ($$11 == null) {
                  return $$0;
               }

               return $$11;
            }
         }
      }

      return $$0;
   }

   static class a {
      private final gcv.b[] a;
      @Nullable
      final goz b;

      a(gcv.b[] $$0, @Nullable goz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gcv.b $$1 : this.a) {
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
