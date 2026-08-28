import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class fvq {
   private static final aku a = aku.b("container/inventory/effect_background_large");
   private static final aku b = aku.b("container/inventory/effect_background_small");
   private final fux<?> c;
   private final flh d;

   public fvq(fux<?> $$0) {
      this.c = $$0;
      this.d = flh.Q();
   }

   public void a(fob $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2);
   }

   public boolean a() {
      int $$0 = this.c.C + this.c.s + 2;
      int $$1 = this.c.n - $$0;
      return $$1 >= 32;
   }

   private void a(fob $$0, int $$1, int $$2) {
      int $$3 = this.c.C + this.c.s + 2;
      int $$4 = this.c.n - $$3;
      Collection<bto> $$5 = this.d.t.eB();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<bto> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.c.D;
            bto $$10 = null;

            for (bto $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wo> $$12 = List.of(this.a($$10), btp.a($$10, 1.0F, this.d.s.u().f()));
               $$0.a(this.c.B(), $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fob $$0, int $$1, int $$2, Iterable<bto> $$3, boolean $$4) {
      int $$5 = this.c.D;

      for (bto $$6 : $$3) {
         if ($$4) {
            $$0.a(gmf::H, a, $$1, $$5, 120, 32);
         } else {
            $$0.a(gmf::H, b, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fob $$0, int $$1, int $$2, Iterable<bto> $$3, boolean $$4) {
      hfm $$5 = this.d.aG();
      int $$6 = this.c.D;

      for (bto $$7 : $$3) {
         jr<btm> $$8 = $$7.c();
         hem $$9 = $$5.a($$8);
         $$0.a(gmf::H, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(fob $$0, int $$1, int $$2, Iterable<bto> $$3) {
      int $$4 = this.c.D;

      for (bto $$5 : $$3) {
         wo $$6 = this.a($$5);
         $$0.b(this.c.B(), $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wo $$7 = btp.a($$5, 1.0F, this.d.s.u().f());
         $$0.b(this.c.B(), $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wo a(bto $$0) {
      xc $$1 = $$0.c().a().e().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(wn.v).b(wo.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
