import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gha implements ghc.a {
   final ffh a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gha.a d;

   public gha(ffh $$0) {
      this.a = $$0;
   }

   @Override
   public void a(faa $$0, gdq $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         gtg $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gha.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dbh, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.l().b().d * 0.85;

         for (Entry<dbh, String> $$9 : this.d.a.entrySet()) {
            dbh $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               ghc.a($$0, $$1, $$14, (double)kb.a($$10.e, 8), $$8 + (double)$$13, (double)kb.a($$10.f, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dbh, String> a;
      final CompletableFuture<Map<dbh, String>> b;

      a(final gtg $$0, final double $$1, final double $$2) {
         fxx $$3 = gha.this.a.r;
         ale<dca> $$4 = $$3.af();
         int $$5 = kb.a($$1);
         int $$6 = kb.a($$2);
         Builder<dbh, String> $$7 = ImmutableMap.builder();
         fxt $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dbh $$11 = new dbh($$9, $$10);
               String $$12 = "";
               duk $$13 = $$8.a($$9, $$10, false);
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
            arf $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dbh, String> $$5x = ImmutableMap.builder();
               ard $$6x = $$4x.l();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dbh $$9x = new dbh($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
