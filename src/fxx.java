import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fxx {
   public static final fxx a = new fxx();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fxx.a[] c;
   private final ajc[] d;

   private fxx() {
      this.c = new fxx.a[0];
      this.d = new ajc[0];
   }

   public fxx(gkd $$0, fxs $$1, List<fxw> $$2) {
      this.d = $$2.stream().flatMap(fxw::b).map(fxw.b::a).distinct().toArray(ajc[]::new);
      Object2IntMap<ajc> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fxx.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fxw $$7 = $$2.get($$6);
         gjz $$8 = this.a($$0, $$1, $$7);
         fxx.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fxx.b($$2x, $$1x.b());
         }).toArray(fxx.b[]::new);
         $$5.add(new fxx.a($$9, $$8));
      }

      this.c = $$5.toArray(new fxx.a[0]);
   }

   @Nullable
   private gjz a(gkd $$0, fxs $$1, fxw $$2) {
      gkk $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gka.a);
   }

   @Nullable
   public gjz a(gjz $$0, cpq $$1, @Nullable fra $$2, @Nullable box $$3, int $$4) {
      if (this.c.length != 0) {
         cpl $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ajc $$9 = this.d[$$8];
            ghh $$10 = ghg.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fxx.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gjz $$12 = $$11.b;
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
      private final fxx.b[] a;
      @Nullable
      final gjz b;

      a(fxx.b[] $$0, @Nullable gjz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fxx.b $$1 : this.a) {
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
