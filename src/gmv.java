import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gmv implements gmx.a {
   final fjx a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gmv.a d;

   public gmv(fjx $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fek $$0, gix $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ae.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         hde $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gmv.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<del, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.k().b().e * 0.85;

         for (Entry<del, String> $$9 : this.d.a.entrySet()) {
            del $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               gmx.a($$0, $$1, $$14, (double)kj.a($$10.g, 8), $$8 + (double)$$13, (double)kj.a($$10.h, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<del, String> a;
      final CompletableFuture<Map<del, String>> b;

      a(final hde $$0, final double $$1, final double $$2) {
         gcy $$3 = gmv.this.a.s;
         alk<dff> $$4 = $$3.ag();
         int $$5 = kj.a($$1);
         int $$6 = kj.a($$2);
         Builder<del, String> $$7 = ImmutableMap.builder();
         gcu $$8 = $$3.h();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               del $$11 = new del($$9, $$10);
               String $$12 = "";
               dxt $$13 = $$8.a($$9, $$10, false);
               $$12 = $$12 + "Client: ";
               if ($$13 == null) {
                  $$12 = $$12 + "0n/a\n";
               } else {
                  $$12 = $$12 + ($$13.B() ? " E" : "");
                  $$12 = $$12 + "\n";
               }

               $$7.put($$11, $$12);
            }
         }

         this.a = $$7.build();
         this.b = $$0.a(() -> {
            arq $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<del, String> $$5x = ImmutableMap.builder();
               aro $$6x = $$4x.l();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     del $$9x = new del($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
