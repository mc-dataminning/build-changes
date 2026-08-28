import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class fve {
   private static final alz a = alz.b("container/inventory/effect_background_large");
   private static final alz b = alz.b("container/inventory/effect_background_small");
   private final ful<?> c;
   private final fme d;

   public fve(ful<?> $$0) {
      this.c = $$0;
      this.d = fme.Q();
   }

   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2);
   }

   public boolean a() {
      int $$0 = this.c.C + this.c.s + 2;
      int $$1 = this.c.n - $$0;
      return $$1 >= 32;
   }

   private void a(fnq $$0, int $$1, int $$2) {
      int $$3 = this.c.C + this.c.s + 2;
      int $$4 = this.c.n - $$3;
      Collection<buo> $$5 = this.d.t.eA();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<buo> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.c.D;
            buo $$10 = null;

            for (buo $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<xv> $$12 = List.of(this.a($$10), bup.a($$10, 1.0F, this.d.s.t().f()));
               $$0.a(this.c.B(), $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fnq $$0, int $$1, int $$2, Iterable<buo> $$3, boolean $$4) {
      int $$5 = this.c.D;

      for (buo $$6 : $$3) {
         if ($$4) {
            $$0.a(glt::B, a, $$1, $$5, 120, 32);
         } else {
            $$0.a(glt::B, b, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fnq $$0, int $$1, int $$2, Iterable<buo> $$3, boolean $$4) {
      hci $$5 = this.d.aG();
      int $$6 = this.c.D;

      for (buo $$7 : $$3) {
         jq<bum> $$8 = $$7.c();
         hbj $$9 = $$5.a($$8);
         $$0.a(glt::B, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(fnq $$0, int $$1, int $$2, Iterable<buo> $$3) {
      int $$4 = this.c.D;

      for (buo $$5 : $$3) {
         xv $$6 = this.a($$5);
         $$0.b(this.c.B(), $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         xv $$7 = bup.a($$5, 1.0F, this.d.s.t().f());
         $$0.b(this.c.B(), $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private xv a(buo $$0) {
      yj $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(xu.v).b(xv.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
