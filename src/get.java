import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class get {
   public static final get a = new get();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final get.a[] c;
   private final ale[] d;

   private get() {
      this.c = new get.a[0];
      this.d = new ale[0];
   }

   public get(grc $$0, geo $$1, List<ges> $$2) {
      this.d = $$2.stream().flatMap(ges::b).map(ges.b::a).distinct().toArray(ale[]::new);
      Object2IntMap<ale> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<get.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         ges $$7 = $$2.get($$6);
         gqy $$8 = this.a($$0, $$1, $$7);
         get.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new get.b($$2x, $$1x.b());
         }).toArray(get.b[]::new);
         $$5.add(new get.a($$9, $$8));
      }

      this.c = $$5.toArray(new get.a[0]);
   }

   @Nullable
   private gqy a(grc $$0, geo $$1, ges $$2) {
      grj $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gqz.a);
   }

   @Nullable
   public gqy a(gqy $$0, cun $$1, @Nullable fxt $$2, @Nullable btn $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            ale $$8 = this.d[$$7];
            gof $$9 = goe.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (get.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gqy $$11 = $$10.b;
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
      private final get.b[] a;
      @Nullable
      final gqy b;

      a(get.b[] $$0, @Nullable gqy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (get.b $$1 : this.a) {
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
