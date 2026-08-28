import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class geu {
   public static final geu a = new geu();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final geu.a[] c;
   private final ale[] d;

   private geu() {
      this.c = new geu.a[0];
      this.d = new ale[0];
   }

   public geu(grd $$0, gep $$1, List<get> $$2) {
      this.d = $$2.stream().flatMap(get::b).map(get.b::a).distinct().toArray(ale[]::new);
      Object2IntMap<ale> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<geu.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         get $$7 = $$2.get($$6);
         gqz $$8 = this.a($$0, $$1, $$7);
         geu.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new geu.b($$2x, $$1x.b());
         }).toArray(geu.b[]::new);
         $$5.add(new geu.a($$9, $$8));
      }

      this.c = $$5.toArray(new geu.a[0]);
   }

   @Nullable
   private gqz a(grd $$0, gep $$1, get $$2) {
      grk $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gra.a);
   }

   @Nullable
   public gqz a(gqz $$0, cuo $$1, @Nullable fxu $$2, @Nullable bto $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            ale $$8 = this.d[$$7];
            gog $$9 = gof.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (geu.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gqz $$11 = $$10.b;
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
      private final geu.b[] a;
      @Nullable
      final gqz b;

      a(geu.b[] $$0, @Nullable gqz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (geu.b $$1 : this.a) {
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
