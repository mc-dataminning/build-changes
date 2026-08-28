import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gex {
   public static final gex a = new gex();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gex.a[] c;
   private final alf[] d;

   private gex() {
      this.c = new gex.a[0];
      this.d = new alf[0];
   }

   public gex(grg $$0, ges $$1, List<gew> $$2) {
      this.d = $$2.stream().flatMap(gew::b).map(gew.b::a).distinct().toArray(alf[]::new);
      Object2IntMap<alf> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gex.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gew $$7 = $$2.get($$6);
         grc $$8 = this.a($$0, $$1, $$7);
         gex.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gex.b($$2x, $$1x.b());
         }).toArray(gex.b[]::new);
         $$5.add(new gex.a($$9, $$8));
      }

      this.c = $$5.toArray(new gex.a[0]);
   }

   @Nullable
   private grc a(grg $$0, ges $$1, gew $$2) {
      grn $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), grd.a);
   }

   @Nullable
   public grc a(grc $$0, cur $$1, @Nullable fxx $$2, @Nullable btr $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            alf $$8 = this.d[$$7];
            goj $$9 = goi.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gex.a $$10 : this.c) {
            if ($$10.a($$6)) {
               grc $$11 = $$10.b;
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
      private final gex.b[] a;
      @Nullable
      final grc b;

      a(gex.b[] $$0, @Nullable grc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gex.b $$1 : this.a) {
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
