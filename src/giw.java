import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class giw {
   public static final giw a = new giw();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final giw.a[] c;
   private final alc[] d;

   private giw() {
      this.c = new giw.a[0];
      this.d = new alc[0];
   }

   public giw(gzj $$0, gir $$1, List<giv> $$2) {
      this.d = $$2.stream().flatMap(giv::b).map(giv.b::a).distinct().toArray(alc[]::new);
      Object2IntMap<alc> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<giw.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         giv $$7 = $$2.get($$6);
         gzd $$8 = this.a($$0, $$1, $$7);
         giw.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new giw.b($$2x, $$1x.b());
         }).toArray(giw.b[]::new);
         $$5.add(new giw.a($$9, $$8));
      }

      this.c = $$5.toArray(new giw.a[0]);
   }

   @Nullable
   private gzd a(gzj $$0, gir $$1, giv $$2) {
      gzt $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gze.a);
   }

   @Nullable
   public gzd a(gzd $$0, cvp $$1, @Nullable gbh $$2, @Nullable buk $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            alc $$8 = this.d[$$7];
            gwh $$9 = gwg.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (giw.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gzd $$11 = $$10.b;
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
      private final giw.b[] a;
      @Nullable
      final gzd b;

      a(giw.b[] $$0, @Nullable gzd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (giw.b $$1 : this.a) {
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
