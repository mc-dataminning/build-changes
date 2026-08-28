import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gjb {
   public static final gjb a = new gjb();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gjb.a[] c;
   private final ale[] d;

   private gjb() {
      this.c = new gjb.a[0];
      this.d = new ale[0];
   }

   public gjb(gzo $$0, giw $$1, List<gja> $$2) {
      this.d = $$2.stream().flatMap(gja::b).map(gja.b::a).distinct().toArray(ale[]::new);
      Object2IntMap<ale> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gjb.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gja $$7 = $$2.get($$6);
         gzi $$8 = this.a($$0, $$1, $$7);
         gjb.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gjb.b($$2x, $$1x.b());
         }).toArray(gjb.b[]::new);
         $$5.add(new gjb.a($$9, $$8));
      }

      this.c = $$5.toArray(new gjb.a[0]);
   }

   @Nullable
   private gzi a(gzo $$0, giw $$1, gja $$2) {
      gzy $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gzj.a);
   }

   @Nullable
   public gzi a(gzi $$0, cvs $$1, @Nullable gbm $$2, @Nullable bun $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            ale $$8 = this.d[$$7];
            gwm $$9 = gwl.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gjb.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gzi $$11 = $$10.b;
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
      private final gjb.b[] a;
      @Nullable
      final gzi b;

      a(gjb.b[] $$0, @Nullable gzi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gjb.b $$1 : this.a) {
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
