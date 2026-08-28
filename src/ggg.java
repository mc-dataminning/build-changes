import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class ggg {
   public static final ggg a = new ggg();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final ggg.a[] c;
   private final akr[] d;

   private ggg() {
      this.c = new ggg.a[0];
      this.d = new akr[0];
   }

   public ggg(gsr $$0, ggb $$1, List<ggf> $$2) {
      this.d = $$2.stream().flatMap(ggf::b).map(ggf.b::a).distinct().toArray(akr[]::new);
      Object2IntMap<akr> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<ggg.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         ggf $$7 = $$2.get($$6);
         gsm $$8 = this.a($$0, $$1, $$7);
         ggg.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new ggg.b($$2x, $$1x.b());
         }).toArray(ggg.b[]::new);
         $$5.add(new ggg.a($$9, $$8));
      }

      this.c = $$5.toArray(new ggg.a[0]);
   }

   @Nullable
   private gsm a(gsr $$0, ggb $$1, ggf $$2) {
      gsy $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gsn.a);
   }

   @Nullable
   public gsm a(gsm $$0, cuq $$1, @Nullable fzf $$2, @Nullable btn $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akr $$8 = this.d[$$7];
            gpt $$9 = gps.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (ggg.a $$10 : this.c) {
            if ($$10.a($$6)) {
               gsm $$11 = $$10.b;
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
      private final ggg.b[] a;
      @Nullable
      final gsm b;

      a(ggg.b[] $$0, @Nullable gsm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (ggg.b $$1 : this.a) {
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
