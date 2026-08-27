import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class ggn {
   public static final ggn a = new ggn();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final ggn.a[] c;
   private final akt[] d;

   private ggn() {
      this.c = new ggn.a[0];
      this.d = new akt[0];
   }

   public ggn(gtd $$0, ggi $$1, List<ggm> $$2) {
      this.d = $$2.stream().flatMap(ggm::b).map(ggm.b::a).distinct().toArray(akt[]::new);
      Object2IntMap<akt> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<ggn.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         ggm $$7 = $$2.get($$6);
         gsz $$8 = this.a($$0, $$1, $$7);
         ggn.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new ggn.b($$2x, $$1x.b());
         }).toArray(ggn.b[]::new);
         $$5.add(new ggn.a($$9, $$8));
      }

      this.c = $$5.toArray(new ggn.a[0]);
   }

   @Nullable
   private gsz a(gtd $$0, ggi $$1, ggm $$2) {
      gtk $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gta.a);
   }

   @Nullable
   public gsz a(gsz $$0, cuh $$1, @Nullable fzn $$2, @Nullable bso $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akt $$8 = this.d[$$7];
            gqg $$9 = gqf.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (ggn.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gsz $$11 = $$10.b;
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
      private final ggn.b[] a;
      @Nullable
      final gsz b;

      a(ggn.b[] $$0, @Nullable gsz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (ggn.b $$1 : this.a) {
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
