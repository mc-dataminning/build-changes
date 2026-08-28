import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class gfe {
   public static final gfe a = new gfe();
   public static final float b = Float.NEGATIVE_INFINITY;
   private final gfe.a[] c;
   private final akk[] d;

   private gfe() {
      this.c = new gfe.a[0];
      this.d = new akk[0];
   }

   public gfe(grn $$0, gez $$1, List<gfd> $$2) {
      this.d = $$2.stream().flatMap(gfd::b).map(gfd.b::a).distinct().toArray(akk[]::new);
      Object2IntMap<akk> $$3 = new Object2IntOpenHashMap();

      for (int $$4 = 0; $$4 < this.d.length; $$4++) {
         $$3.put(this.d[$$4], $$4);
      }

      List<gfe.a> $$5 = Lists.newArrayList();

      for (int $$6 = $$2.size() - 1; $$6 >= 0; $$6--) {
         gfd $$7 = $$2.get($$6);
         grj $$8 = this.a($$0, $$1, $$7);
         gfe.b[] $$9 = $$7.b().map($$1x -> {
            int $$2x = $$3.getInt($$1x.a());
            return new gfe.b($$2x, $$1x.b());
         }).toArray(gfe.b[]::new);
         $$5.add(new gfe.a($$9, $$8));
      }

      this.c = $$5.toArray(new gfe.a[0]);
   }

   @Nullable
   private grj a(grn $$0, gez $$1, gfd $$2) {
      gru $$3 = $$0.a($$2.a());
      return Objects.equals($$3, $$1) ? null : $$0.a($$2.a(), grk.a);
   }

   @Nullable
   public grj a(grj $$0, cua $$1, @Nullable fyd $$2, @Nullable bsy $$3, int $$4) {
      if (this.c.length != 0) {
         int $$5 = this.d.length;
         float[] $$6 = new float[$$5];

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            akk $$8 = this.d[$$7];
            goq $$9 = gop.a($$1, $$8);
            if ($$9 != null) {
               $$6[$$7] = $$9.call($$1, $$2, $$3, $$4);
            } else {
               $$6[$$7] = Float.NEGATIVE_INFINITY;
            }
         }

         for (gfe.a $$10 : this.c) {
            if ($$10.a($$6)) {
               grj $$11 = $$10.b;
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
      private final gfe.b[] a;
      @Nullable
      final grj b;

      a(gfe.b[] $$0, @Nullable grj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      boolean a(float[] $$0) {
         for (gfe.b $$1 : this.a) {
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
