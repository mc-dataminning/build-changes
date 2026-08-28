import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gew {
   public static final gew a = new gew();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gew.a[] c;
   private final alf[] d;

   private gew() {
      this.c = new gew.a[0];
      this.d = new alf[0];
   }

   public gew(grf $$0, ger $$1, List<gev> $$2) {
      this.d = $$2.stream().flatMap(gev::b).map(gev.b::a).distinct().toArray(alf[]::new);
      Object2IntMap<alf> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gew.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gev $$7 = $$2.get($$6);
         grb $$8 = this.a($$0, $$1, $$7);
         gew.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gew.b($$2x, $$1x.b());
         }).toArray(gew.b[]::new);
         $$5.add(new gew.a($$9, $$8));
      }

      this.c = $$5.toArray(new gew.a[0]);
   }

   @Nullable
   private grb a(grf $$0, ger $$1, gev $$2) {
      grm $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), grc.a);
   }

   @Nullable
   public grb a(grb $$0, cuq $$1, @Nullable fxw $$2, @Nullable btq $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            alf $$8 = this.d[$$7];
            goi $$9 = goh.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gew.a $$10 : this.c) {
            if ($$10.a($$6)) {
               grb $$11 = $$10.b;
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
      private final gew.b[] a;
      @Nullable
      final grb b;

      a(gew.b[] $$0, @Nullable grb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gew.b $$1 : this.a) {
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
