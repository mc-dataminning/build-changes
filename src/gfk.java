import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gfk {
   public static final gfk a = new gfk();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gfk.a[] c;
   private final akk[] d;

   private gfk() {
      this.c = new gfk.a[0];
      this.d = new akk[0];
   }

   public gfk(grt $$0, gff $$1, List<gfj> $$2) {
      this.d = $$2.stream().flatMap(gfj::b).map(gfj.b::a).distinct().toArray(akk[]::new);
      Object2IntMap<akk> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gfk.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gfj $$7 = $$2.get($$6);
         grp $$8 = this.a($$0, $$1, $$7);
         gfk.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gfk.b($$2x, $$1x.b());
         }).toArray(gfk.b[]::new);
         $$5.add(new gfk.a($$9, $$8));
      }

      this.c = $$5.toArray(new gfk.a[0]);
   }

   @Nullable
   private grp a(grt $$0, gff $$1, gfj $$2) {
      gsa $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), grq.a);
   }

   @Nullable
   public grp a(grp $$0, cuc $$1, @Nullable fyj $$2, @Nullable btb $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akk $$8 = this.d[$$7];
            gow $$9 = gov.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gfk.a $$10 : this.c) {
            if ($$10.a($$6)) {
               grp $$11 = $$10.b;
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
      private final gfk.b[] a;
      @Nullable
      final grp b;

      a(gfk.b[] $$0, @Nullable grp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gfk.b $$1 : this.a) {
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
