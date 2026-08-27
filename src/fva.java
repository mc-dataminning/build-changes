import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fva {
   public static final fva a = new fva();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fva.a[] c;
   private final ahh[] d;

   private fva() {
      this.c = new fva.a[0];
      this.d = new ahh[0];
   }

   public fva(ghf $$0, fuv $$1, List<fuz> $$2) {
      this.d = $$2.stream().flatMap(fuz::b).map(fuz.b::a).distinct().toArray(ahh[]::new);
      Object2IntMap<ahh> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fva.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fuz $$7 = $$2.get($$6);
         ghb $$8 = this.a($$0, $$1, $$7);
         fva.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fva.b($$2x, $$1x.b());
         }).toArray(fva.b[]::new);
         $$5.add(new fva.a($$9, $$8));
      }

      this.c = $$5.toArray(new fva.a[0]);
   }

   @Nullable
   private ghb a(ghf $$0, fuv $$1, fuz $$2) {
      ghm $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), ghc.a);
   }

   @Nullable
   public ghb a(ghb $$0, cng $$1, @Nullable foe $$2, @Nullable bmo $$3, int $$4) {
      if (this.c.length != 0) {
         cnb $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ahh $$9 = this.d[$$8];
            gej $$10 = gei.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fva.a $$11 : this.c) {
            if ($$11.a($$7)) {
               ghb $$12 = $$11.b;
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
      private final fva.b[] a;
      @Nullable
      final ghb b;

      a(fva.b[] $$0, @Nullable ghb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fva.b $$1 : this.a) {
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
