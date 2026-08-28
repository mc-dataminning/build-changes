import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class gbn {
   private static final alk a = alk.b("container/inventory/effect_background_large");
   private static final alk b = alk.b("container/inventory/effect_background_small");
   private final gau<?> c;
   private final frf d;

   public gbn(gau<?> $$0) {
      this.c = $$0;
      this.d = frf.Q();
   }

   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2);
   }

   public boolean a() {
      int $$0 = this.c.C + this.c.s + 2;
      int $$1 = this.c.n - $$0;
      return $$1 >= 32;
   }

   private void a(ftz $$0, int $$1, int $$2) {
      int $$3 = this.c.C + this.c.s + 2;
      int $$4 = this.c.n - $$3;
      Collection<bvz> $$5 = this.d.t.eD();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bvz> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.c.D;
            bvz $$10 = null;

            for (bvz $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<xc> $$12 = List.of(this.a($$10), bwa.a($$10, 1.0F, this.d.s.u().f()));
               $$0.a(this.c.B(), $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(ftz $$0, int $$1, int $$2, Iterable<bvz> $$3, boolean $$4) {
      int $$5 = this.c.D;

      for (bvz $$6 : $$3) {
         if ($$4) {
            $$0.a(gsn::H, a, $$1, $$5, 120, 32);
         } else {
            $$0.a(gsn::H, b, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(ftz $$0, int $$1, int $$2, Iterable<bvz> $$3, boolean $$4) {
      hmc $$5 = this.d.aG();
      int $$6 = this.c.D;

      for (bvz $$7 : $$3) {
         jg<bvx> $$8 = $$7.c();
         hlc $$9 = $$5.a($$8);
         $$0.a(gsn::H, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(ftz $$0, int $$1, int $$2, Iterable<bvz> $$3) {
      int $$4 = this.c.D;

      for (bvz $$5 : $$3) {
         xc $$6 = this.a($$5);
         $$0.b(this.c.B(), $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         xc $$7 = bwa.a($$5, 1.0F, this.d.s.u().f());
         $$0.b(this.c.B(), $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private xc a(bvz $$0) {
      xq $$1 = $$0.c().a().g().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(xb.v).b(xc.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
