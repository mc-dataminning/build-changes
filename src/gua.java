import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gua implements guc.a {
   final foz a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gua.a d;

   public gua(foz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fjj $$0, gqa $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)af.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         hni $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gua.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dih, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.k().b().e * 0.85;

         for (Entry<dih, String> $$9 : this.d.a.entrySet()) {
            dih $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               guc.a($$0, $$1, $$14, (double)jx.a($$10.h, 8), $$8 + (double)$$13, (double)jx.a($$10.i, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dih, String> a;
      final CompletableFuture<Map<dih, String>> b;

      a(final hni $$0, final double $$1, final double $$2) {
         gjz $$3 = gua.this.a.s;
         alf<dja> $$4 = $$3.aj();
         int $$5 = jx.a($$1);
         int $$6 = jx.a($$2);
         Builder<dih, String> $$7 = ImmutableMap.builder();
         gjv $$8 = $$3.h();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dih $$11 = new dih($$9, $$10);
               String $$12 = "";
               eco $$13 = $$8.a($$9, $$10, false);
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
            arq $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dih, String> $$5x = ImmutableMap.builder();
               arn $$6x = $$4x.m();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dih $$9x = new dih($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
