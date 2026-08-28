import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gih {
   public static final gih a = new gih();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gih.a[] c;
   private final alb[] d;

   private gih() {
      this.c = new gih.a[0];
      this.d = new alb[0];
   }

   public gih(gys $$0, gic $$1, List<gig> $$2) {
      this.d = $$2.stream().flatMap(gig::b).map(gig.b::a).distinct().toArray(alb[]::new);
      Object2IntMap<alb> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gih.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gig $$7 = $$2.get($$6);
         gym $$8 = this.a($$0, $$1, $$7);
         gih.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gih.b($$2x, $$1x.b());
         }).toArray(gih.b[]::new);
         $$5.add(new gih.a($$9, $$8));
      }

      this.c = $$5.toArray(new gih.a[0]);
   }

   @Nullable
   private gym a(gys $$0, gic $$1, gig $$2) {
      gzc $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gyn.a);
   }

   @Nullable
   public gym a(gym $$0, cvl $$1, @Nullable gax $$2, @Nullable buf $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            alb $$8 = this.d[$$7];
            gvq $$9 = gvp.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gih.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gym $$11 = $$10.b;
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
      private final gih.b[] a;
      @Nullable
      final gym b;

      a(gih.b[] $$0, @Nullable gym $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gih.b $$1 : this.a) {
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
