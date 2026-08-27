import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fyx {
   public static final fyx a = new fyx();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fyx.a[] c;
   private final ajh[] d;

   private fyx() {
      this.c = new fyx.a[0];
      this.d = new ajh[0];
   }

   public fyx(gld $$0, fys $$1, List<fyw> $$2) {
      this.d = $$2.stream().flatMap(fyw::b).map(fyw.b::a).distinct().toArray(ajh[]::new);
      Object2IntMap<ajh> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fyx.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fyw $$7 = $$2.get($$6);
         gkz $$8 = this.a($$0, $$1, $$7);
         fyx.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fyx.b($$2x, $$1x.b());
         }).toArray(fyx.b[]::new);
         $$5.add(new fyx.a($$9, $$8));
      }

      this.c = $$5.toArray(new fyx.a[0]);
   }

   @Nullable
   private gkz a(gld $$0, fys $$1, fyw $$2) {
      glk $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gla.a);
   }

   @Nullable
   public gkz a(gkz $$0, cqk $$1, @Nullable fry $$2, @Nullable bpo $$3, int $$4) {
      if (this.c.length != 0) {
         cqf $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ajh $$9 = this.d[$$8];
            gih $$10 = gig.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fyx.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gkz $$12 = $$11.b;
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
      private final fyx.b[] a;
      @Nullable
      final gkz b;

      a(fyx.b[] $$0, @Nullable gkz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fyx.b $$1 : this.a) {
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
