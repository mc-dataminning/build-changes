import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gfu implements gfw.a {
   final feb a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gfu.a d;

   public gfu(feb $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eyu $$0, gck $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         gsa $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gfu.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dag, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.m().b().d * 0.85;

         for (Entry<dag, String> $$9 : this.d.a.entrySet()) {
            dag $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               gfw.a($$0, $$1, $$14, (double)jq.a($$10.e, 8), $$8 + (double)$$13, (double)jq.a($$10.f, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dag, String> a;
      final CompletableFuture<Map<dag, String>> b;

      a(gsa $$0, double $$1, double $$2) {
         fwr $$3 = gfu.this.a.r;
         akm<daz> $$4 = $$3.ae();
         int $$5 = jq.a($$1);
         int $$6 = jq.a($$2);
         Builder<dag, String> $$7 = ImmutableMap.builder();
         fwn $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dag $$11 = new dag($$9, $$10);
               String $$12 = "";
               dtj $$13 = $$8.a($$9, $$10, false);
               $$12 = $$12 + "Client: ";
               if ($$13 == null) {
                  $$12 = $$12 + "0n/a\n";
               } else {
                  $$12 = $$12 + ($$13.C() ? " E" : "");
                  $$12 = $$12 + "\n";
               }

               $$7.put($$11, $$12);
            }
         }

         this.a = $$7.build();
         this.b = $$0.a(() -> {
            aqn $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dag, String> $$5x = ImmutableMap.builder();
               aql $$6x = $$4x.l();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dag $$9x = new dag($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
