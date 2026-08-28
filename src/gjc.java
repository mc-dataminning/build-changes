import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class gjc {
   public static final gjc a = new gjc();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gjc.a[] c;
   private final alh[] d;

   private gjc() {
      this.c = new gjc.a[0];
      this.d = new alh[0];
   }

   public gjc(had $$0, List<gjm> $$1) {
      this.d = $$1.stream().flatMap($$0x -> $$0x.b().stream()).map(gjm.b::a).distinct().toArray(alh[]::new);
      Object2IntMap<alh> $$2 = new Object2IntOpenHashMap();

      for (int $$3 = 0; $$3 < this.d.length; $$3++) {
         $$2.put(this.d[$$3], $$3);
      }

      List<gjc.a> $$4 = Lists.newArrayList();

      for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
         gjm $$6 = $$1.get($$5);
         gzu $$7 = $$0.a($$6.a(), gzv.a);
         gjc.b[] $$8 = $$6.b().stream().map($$1x -> {
            int $$2x = $$2.getInt($$1x.a());
            return new gjc.b($$2x, $$1x.b());
         }).toArray(gjc.b[]::new);
         $$4.add(new gjc.a($$8, $$7));
      }

      this.c = $$4.toArray(new gjc.a[0]);
   }

   @Nullable
   public gzu a(cvx $$0, @Nullable gbx $$1, @Nullable buv $$2, int $$3) {
      int $$4 = this.d.length;
      if ($$4 != 0) {
         float[] $$5 = new float[$$4];

         for (int $$6 = 0; $$6 < $$4; $$6++) {
            alh $$7 = this.d[$$6];
            gwy $$8 = gwx.a($$0, $$7);
            if ($$8 != null) {
               $$5[$$6] = $$8.call($$0, $$1, $$2, $$3);
            } else {
               $$5[$$6] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gjc.a $$9 : this.c) {
            if ($$9.a($$5)) {
               return $$9.b;
            }
         }
      }

      return null;
   }

   static record a(gjc.b[] a, @Nullable gzu b) {

      boolean a(float[] $$0) {
         for (gjc.b $$1 : this.a) {
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
