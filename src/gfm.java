import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gfm {
   public static final gfm a = new gfm();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gfm.a[] c;
   private final akk[] d;

   private gfm() {
      this.c = new gfm.a[0];
      this.d = new akk[0];
   }

   public gfm(grv $$0, gfh $$1, List<gfl> $$2) {
      this.d = $$2.stream().flatMap(gfl::b).map(gfl.b::a).distinct().toArray(akk[]::new);
      Object2IntMap<akk> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gfm.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gfl $$7 = $$2.get($$6);
         grr $$8 = this.a($$0, $$1, $$7);
         gfm.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gfm.b($$2x, $$1x.b());
         }).toArray(gfm.b[]::new);
         $$5.add(new gfm.a($$9, $$8));
      }

      this.c = $$5.toArray(new gfm.a[0]);
   }

   @Nullable
   private grr a(grv $$0, gfh $$1, gfl $$2) {
      gsc $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), grs.a);
   }

   @Nullable
   public grr a(grr $$0, cud $$1, @Nullable fyl $$2, @Nullable btc $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akk $$8 = this.d[$$7];
            goy $$9 = gox.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gfm.a $$10 : this.c) {
            if ($$10.a($$6)) {
               grr $$11 = $$10.b;
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
      private final gfm.b[] a;
      @Nullable
      final grr b;

      a(gfm.b[] $$0, @Nullable grr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gfm.b $$1 : this.a) {
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
