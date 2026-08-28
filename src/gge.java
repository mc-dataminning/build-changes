import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gge {
   public static final gge a = new gge();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gge.a[] c;
   private final akr[] d;

   private gge() {
      this.c = new gge.a[0];
      this.d = new akr[0];
   }

   public gge(gsp $$0, gfz $$1, List<ggd> $$2) {
      this.d = $$2.stream().flatMap(ggd::b).map(ggd.b::a).distinct().toArray(akr[]::new);
      Object2IntMap<akr> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gge.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         ggd $$7 = $$2.get($$6);
         gsk $$8 = this.a($$0, $$1, $$7);
         gge.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gge.b($$2x, $$1x.b());
         }).toArray(gge.b[]::new);
         $$5.add(new gge.a($$9, $$8));
      }

      this.c = $$5.toArray(new gge.a[0]);
   }

   @Nullable
   private gsk a(gsp $$0, gfz $$1, ggd $$2) {
      gsw $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gsl.a);
   }

   @Nullable
   public gsk a(gsk $$0, cuq $$1, @Nullable fzd $$2, @Nullable btn $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akr $$8 = this.d[$$7];
            gpr $$9 = gpq.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gge.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gsk $$11 = $$10.b;
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
      private final gge.b[] a;
      @Nullable
      final gsk b;

      a(gge.b[] $$0, @Nullable gsk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gge.b $$1 : this.a) {
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
