import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gbp {
   public static final gbp a = new gbp();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gbp.a[] c;
   private final ajv[] d;

   private gbp() {
      this.c = new gbp.a[0];
      this.d = new ajv[0];
   }

   public gbp(gnw $$0, gbk $$1, List<gbo> $$2) {
      this.d = $$2.stream().flatMap(gbo::b).map(gbo.b::a).distinct().toArray(ajv[]::new);
      Object2IntMap<ajv> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gbp.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gbo $$7 = $$2.get($$6);
         gns $$8 = this.a($$0, $$1, $$7);
         gbp.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gbp.b($$2x, $$1x.b());
         }).toArray(gbp.b[]::new);
         $$5.add(new gbp.a($$9, $$8));
      }

      this.c = $$5.toArray(new gbp.a[0]);
   }

   @Nullable
   private gns a(gnw $$0, gbk $$1, gbo $$2) {
      god $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gnt.a);
   }

   @Nullable
   public gns a(gns $$0, crs $$1, @Nullable fuq $$2, @Nullable bqt $$3, int $$4) {
      if (this.c.length != 0) {
         crn $$5 = $$1.f();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ajv $$9 = this.d[$$8];
            gla $$10 = gkz.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gbp.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gns $$12 = $$11.b;
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
      private final gbp.b[] a;
      @Nullable
      final gns b;

      a(gbp.b[] $$0, @Nullable gns $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gbp.b $$1 : this.a) {
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
