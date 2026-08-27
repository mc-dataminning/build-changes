import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fwt {
   public static final fwt a = new fwt();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fwt.a[] c;
   private final aiy[] d;

   private fwt() {
      this.c = new fwt.a[0];
      this.d = new aiy[0];
   }

   public fwt(giy $$0, fwo $$1, List<fws> $$2) {
      this.d = $$2.stream().flatMap(fws::b).map(fws.b::a).distinct().toArray(aiy[]::new);
      Object2IntMap<aiy> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fwt.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fws $$7 = $$2.get($$6);
         giu $$8 = this.a($$0, $$1, $$7);
         fwt.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fwt.b($$2x, $$1x.b());
         }).toArray(fwt.b[]::new);
         $$5.add(new fwt.a($$9, $$8));
      }

      this.c = $$5.toArray(new fwt.a[0]);
   }

   @Nullable
   private giu a(giy $$0, fwo $$1, fws $$2) {
      gjf $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), giv.a);
   }

   @Nullable
   public giu a(giu $$0, coz $$1, @Nullable fpx $$2, @Nullable bog $$3, int $$4) {
      if (this.c.length != 0) {
         cou $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            aiy $$9 = this.d[$$8];
            ggc $$10 = ggb.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fwt.a $$11 : this.c) {
            if ($$11.a($$7)) {
               giu $$12 = $$11.b;
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
      private final fwt.b[] a;
      @Nullable
      final giu b;

      a(fwt.b[] $$0, @Nullable giu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fwt.b $$1 : this.a) {
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
