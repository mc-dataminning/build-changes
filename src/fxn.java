import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class fxn {
   private static final ald a = ald.b("container/inventory/effect_background_large");
   private static final ald b = ald.b("container/inventory/effect_background_small");
   private final fwu<?> c;
   private final fnd d;

   public fxn(fwu<?> $$0) {
      this.c = $$0;
      this.d = fnd.Q();
   }

   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$1, $$2);
   }

   public boolean a() {
      int $$0 = this.c.C + this.c.s + 2;
      int $$1 = this.c.n - $$0;
      return $$1 >= 32;
   }

   private void a(fpz $$0, int $$1, int $$2) {
      int $$3 = this.c.C + this.c.s + 2;
      int $$4 = this.c.n - $$3;
      Collection<buw> $$5 = this.d.t.eC();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<buw> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.c.D;
            buw $$10 = null;

            for (buw $$11 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  $$10 = $$11;
               }

               $$9 += $$7;
            }

            if ($$10 != null) {
               List<wv> $$12 = List.of(this.a($$10), bux.a($$10, 1.0F, this.d.s.u().f()));
               $$0.a(this.c.B(), $$12, Optional.empty(), $$1, $$2);
            }
         }
      }
   }

   private void a(fpz $$0, int $$1, int $$2, Iterable<buw> $$3, boolean $$4) {
      int $$5 = this.c.D;

      for (buw $$6 : $$3) {
         if ($$4) {
            $$0.a(goi::H, a, $$1, $$5, 120, 32);
         } else {
            $$0.a(goi::H, b, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fpz $$0, int $$1, int $$2, Iterable<buw> $$3, boolean $$4) {
      hhs $$5 = this.d.aG();
      int $$6 = this.c.D;

      for (buw $$7 : $$3) {
         js<buu> $$8 = $$7.c();
         hgs $$9 = $$5.a($$8);
         $$0.a(goi::H, $$9, $$1 + ($$4 ? 6 : 7), $$6 + 7, 18, 18);
         $$6 += $$2;
      }
   }

   private void a(fpz $$0, int $$1, int $$2, Iterable<buw> $$3) {
      int $$4 = this.c.D;

      for (buw $$5 : $$3) {
         wv $$6 = this.a($$5);
         $$0.b(this.c.B(), $$6, $$1 + 10 + 18, $$4 + 6, 16777215);
         wv $$7 = bux.a($$5, 1.0F, this.d.s.u().f());
         $$0.b(this.c.B(), $$7, $$1 + 10 + 18, $$4 + 6 + 10, 8355711);
         $$4 += $$2;
      }
   }

   private wv a(buw $$0) {
      xj $$1 = $$0.c().a().g().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(wu.v).b(wv.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
