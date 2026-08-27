import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gcl {
   public static final gcl a = new gcl();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gcl.a[] c;
   private final akf[] d;

   private gcl() {
      this.c = new gcl.a[0];
      this.d = new akf[0];
   }

   public gcl(gos $$0, gcg $$1, List<gck> $$2) {
      this.d = $$2.stream().flatMap(gck::b).map(gck.b::a).distinct().toArray(akf[]::new);
      Object2IntMap<akf> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gcl.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gck $$7 = $$2.get($$6);
         goo $$8 = this.a($$0, $$1, $$7);
         gcl.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gcl.b($$2x, $$1x.b());
         }).toArray(gcl.b[]::new);
         $$5.add(new gcl.a($$9, $$8));
      }

      this.c = $$5.toArray(new gcl.a[0]);
   }

   @Nullable
   private goo a(gos $$0, gcg $$1, gck $$2) {
      goz $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), gop.a);
   }

   @Nullable
   public goo a(goo $$0, csd $$1, @Nullable fvm $$2, @Nullable bre $$3, int $$4) {
      if (this.c.length != 0) {
         cry $$5 = $$1.f();
         int $$6 = this.d.length;
         float[] $$7 = new float[$$6];

         for (int $$8 = 0; $$8 < $$6; $$8++) {
            akf $$9 = this.d[$$8];
            glw $$10 = glv.a($$5, $$9);
            if ($$10 != null) {
               $$7[$$8] = $$10.call($$1, $$2, $$3, $$4);
            } else {
               $$7[$$8] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gcl.a $$11 : this.c) {
            if ($$11.a($$7)) {
               goo $$12 = $$11.b;
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
      private final gcl.b[] a;
      @Nullable
      final goo b;

      a(gcl.b[] $$0, @Nullable goo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gcl.b $$1 : this.a) {
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
