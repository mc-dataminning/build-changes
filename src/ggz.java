import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ggz implements ghb.a {
   final ffg a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private ggz.a d;

   public ggz(ffg $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezz $$0, gdp $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         gtf $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new ggz.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dbg, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.l().b().d * 0.85;

         for (Entry<dbg, String> $$9 : this.d.a.entrySet()) {
            dbg $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               ghb.a($$0, $$1, $$14, (double)kb.a($$10.e, 8), $$8 + (double)$$13, (double)kb.a($$10.f, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dbg, String> a;
      final CompletableFuture<Map<dbg, String>> b;

      a(final gtf $$0, final double $$1, final double $$2) {
         fxw $$3 = ggz.this.a.r;
         ale<dbz> $$4 = $$3.af();
         int $$5 = kb.a($$1);
         int $$6 = kb.a($$2);
         Builder<dbg, String> $$7 = ImmutableMap.builder();
         fxs $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dbg $$11 = new dbg($$9, $$10);
               String $$12 = "";
               duj $$13 = $$8.a($$9, $$10, false);
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
               Builder<dbg, String> $$5x = ImmutableMap.builder();
               ard $$6x = $$4x.l();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dbg $$9x = new dbg($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
