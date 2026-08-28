import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gqw implements gqy.a {
   final fmg a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gqw.a d;

   public gqw(fmg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fgr $$0, gmx $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)af.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         hkc $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gqw.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dgg, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.k().b().e * 0.85;

         for (Entry<dgg, String> $$9 : this.d.a.entrySet()) {
            dgg $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               gqy.a($$0, $$1, $$14, (double)kk.a($$10.h, 8), $$8 + (double)$$13, (double)kk.a($$10.i, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dgg, String> a;
      final CompletableFuture<Map<dgg, String>> b;

      a(final hkc $$0, final double $$1, final double $$2) {
         ggy $$3 = gqw.this.a.s;
         akt<dgz> $$4 = $$3.aj();
         int $$5 = kk.a($$1);
         int $$6 = kk.a($$2);
         Builder<dgg, String> $$7 = ImmutableMap.builder();
         ggu $$8 = $$3.h();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dgg $$11 = new dgg($$9, $$10);
               String $$12 = "";
               dzw $$13 = $$8.a($$9, $$10, false);
               $$12 = $$12 + "Client: ";
               if ($$13 == null) {
                  $$12 = $$12 + "0n/a\n";
               } else {
                  $$12 = $$12 + ($$13.E() ? " E" : "");
                  $$12 = $$12 + "\n";
               }

               $$7.put($$11, $$12);
            }
         }

         this.a = $$7.build();
         this.b = $$0.a(() -> {
            ard $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dgg, String> $$5x = ImmutableMap.builder();
               ara $$6x = $$4x.m();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dgg $$9x = new dgg($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
