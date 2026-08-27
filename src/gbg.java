import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gbg {
   public static final gbg a = new gbg();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gbg.a[] c;
   private final ajt[] d;

   private gbg() {
      this.c = new gbg.a[0];
      this.d = new ajt[0];
   }

   public gbg(gnn $$0, gbb $$1, List<gbf> $$2) {
      this.d = $$2.stream().flatMap(gbf::b).map(gbf.b::a).distinct().toArray(ajt[]::new);
      Object2IntMap<ajt> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gbg.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gbf $$7 = $$2.get($$6);
         gnj $$8 = this.a($$0, $$1, $$7);
         gbg.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gbg.b($$2x, $$1x.b());
         }).toArray(gbg.b[]::new);
         $$5.add(new gbg.a($$9, $$8));
      }

      this.c = $$5.toArray(new gbg.a[0]);
   }

   @Nullable
   private gnj a(gnn $$0, gbb $$1, gbf $$2) {
      gnu $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gnk.a);
   }

   @Nullable
   public gnj a(gnj $$0, crj $$1, @Nullable fuh $$2, @Nullable bqo $$3, int $$4) {
      if (this.c.length != 0) {
         cre $$5 = $$1.f();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            ajt $$9 = this.d[$$8];
            gkr $$10 = gkq.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gbg.a $$11 : this.c) {
            if ($$11.a($$7)) {
               gnj $$12 = $$11.b;
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
      private final gbg.b[] a;
      @Nullable
      final gnj b;

      a(gbg.b[] $$0, @Nullable gnj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gbg.b $$1 : this.a) {
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
