import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gdr {
   public static final gdr a = new gdr();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gdr.a[] c;
   private final akm[] d;

   private gdr() {
      this.c = new gdr.a[0];
      this.d = new akm[0];
   }

   public gdr(gqa $$0, gdm $$1, List<gdq> $$2) {
      this.d = $$2.stream().flatMap(gdq::b).map(gdq.b::a).distinct().toArray(akm[]::new);
      Object2IntMap<akm> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gdr.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gdq $$7 = $$2.get($$6);
         gpw $$8 = this.a($$0, $$1, $$7);
         gdr.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gdr.b($$2x, $$1x.b());
         }).toArray(gdr.b[]::new);
         $$5.add(new gdr.a($$9, $$8));
      }

      this.c = $$5.toArray(new gdr.a[0]);
   }

   @Nullable
   private gpw a(gqa $$0, gdm $$1, gdq $$2) {
      gqh $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gpx.a);
   }

   @Nullable
   public gpw a(gpw $$0, cto $$1, @Nullable fwr $$2, @Nullable bso $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akm $$8 = this.d[$$7];
            gnd $$9 = gnc.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gdr.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gpw $$11 = $$10.b;
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
      private final gdr.b[] a;
      @Nullable
      final gpw b;

      a(gdr.b[] $$0, @Nullable gpw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gdr.b $$1 : this.a) {
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
