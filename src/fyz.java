import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fyz {
   public static final fyz a = new fyz();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final fyz.a[] c;
   private final ajh[] d;

   private fyz() {
      this.c = new fyz.a[0];
      this.d = new ajh[0];
   }

   public fyz(glg $$0, fyu $$1, List<fyy> $$2) {
      this.d = $$2.stream().flatMap(fyy::b).map(fyy.b::a).distinct().toArray(ajh[]::new);
      Object2IntMap<ajh> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<fyz.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         fyy $$7 = $$2.get($$6);
         glc $$8 = this.a($$0, $$1, $$7);
         fyz.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new fyz.b($$2x, $$1x.b());
         }).toArray(fyz.b[]::new);
         $$5.add(new fyz.a($$9, $$8));
      }

      this.c = $$5.toArray(new fyz.a[0]);
   }

   @Nullable
   private glc a(glg $$0, fyu $$1, fyy $$2) {
      gln $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gld.a);
   }

   @Nullable
   public glc a(glc $$0, cqm $$1, @Nullable fsa $$2, @Nullable bpp $$3, int $$4) {
      if (this.c.length != 0) {
         cqh $$5 = $$1.d();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ajh $$9 = this.d[$$8];
            gik $$10 = gij.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (fyz.a $$11 : this.c) {
            if ($$11.a($$7)) {
               glc $$12 = $$11.b;
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
      private final fyz.b[] a;
      @Nullable
      final glc b;

      a(fyz.b[] $$0, @Nullable glc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (fyz.b $$1 : this.a) {
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
