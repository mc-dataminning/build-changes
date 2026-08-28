import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class gik implements gim.a {
   final fgo a;
   private double b = Double.MIN_VALUE;
   private final int c = 12;
   @Nullable
   private gik.a d;

   public gik(fgo $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ad.d();
      if ($$5 - this.b > 3.0E9) {
         this.b = $$5;
         guo $$6 = this.a.V();
         if ($$6 != null) {
            this.d = new gik.a($$6, $$2, $$4);
         } else {
            this.d = null;
         }
      }

      if (this.d != null) {
         Map<dcd, String> $$7 = this.d.b.getNow(null);
         double $$8 = this.a.j.l().b().d * 0.85;

         for (Entry<dcd, String> $$9 : this.d.a.entrySet()) {
            dcd $$10 = $$9.getKey();
            String $$11 = $$9.getValue();
            if ($$7 != null) {
               $$11 = $$11 + $$7.get($$10);
            }

            String[] $$12 = $$11.split("\n");
            int $$13 = 0;

            for (String $$14 : $$12) {
               gim.a($$0, $$1, $$14, (double)kf.a($$10.e, 8), $$8 + (double)$$13, (double)kf.a($$10.f, 8), -1, 0.15F, true, 0.0F, true);
               $$13 -= 2;
            }
         }
      }
   }

   final class a {
      final Map<dcd, String> a;
      final CompletableFuture<Map<dcd, String>> b;

      a(final guo $$0, final double $$1, final double $$2) {
         fzf $$3 = gik.this.a.r;
         akq<dcw> $$4 = $$3.af();
         int $$5 = kf.a($$1);
         int $$6 = kf.a($$2);
         Builder<dcd, String> $$7 = ImmutableMap.builder();
         fzb $$8 = $$3.i();

         for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; $$9++) {
            for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; $$10++) {
               dcd $$11 = new dcd($$9, $$10);
               String $$12 = "";
               dvi $$13 = $$8.a($$9, $$10, false);
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
            aqu $$4x = $$0.a($$4);
            if ($$4x == null) {
               return ImmutableMap.of();
            } else {
               Builder<dcd, String> $$5x = ImmutableMap.builder();
               aqs $$6x = $$4x.l();

               for (int $$7x = $$5 - 12; $$7x <= $$5 + 12; $$7x++) {
                  for (int $$8x = $$6 - 12; $$8x <= $$6 + 12; $$8x++) {
                     dcd $$9x = new dcd($$7x, $$8x);
                     $$5x.put($$9x, "Server: " + $$6x.a($$9x));
                  }
               }

               return $$5x.build();
            }
         });
      }
   }
}
