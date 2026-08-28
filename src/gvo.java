import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gvo implements gvq.a {
   final fqq a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gvo.a d;

   public gvo(fqq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fld $$0, grn $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ag.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         hpb $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gvo.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<djo, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.k().b().e * 0.85;

         for (Entry<djo, String> $$9 : this.d.a.entrySet()) {
            djo $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               gvq.a($$0, $$1, $$14, (double)jz.a($$10.h, 8), $$8 + (double)$$13, (double)jz.a($$10.i, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<djo, String> a;
      final CompletableFuture<Map<djo, String>> b;

      a(final hpb $$0, final double $$1, final double $$2) {
         glo $$3 = gvo.this.a.s;
         alq<dkj> $$4 = $$3.aj();
         int $$5 = jz.a($$1);
         int $$6 = jz.a($$2);
         Builder<djo, String> $$7 = ImmutableMap.builder();
         glk $$8 = $$3.h();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               djo $$11 = new djo($$9, $$10);
               String $$12 = "";
               edx $$13 = $$8.a($$9, $$10, false);
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
            asb $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<djo, String> $$5x = ImmutableMap.builder();
               ary $$6x = $$4x.m();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     djo $$9x = new djo($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
