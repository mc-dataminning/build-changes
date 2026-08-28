import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fui implements hot {
   private static final long a = 3000L;
   private final fpt b;
   private final List<fui.b> c = Lists.newArrayList();
   private boolean d;
   private final List<fui.b> e = new ArrayList<>();

   public fui(fpt $$0) {
      this.b = $$0;
   }

   public void a(fsm $$0) {
      hou $$1 = this.b.ak();
      if (!this.d && this.b.n.Z().c()) {
         $$1.a(this);
         this.d = true;
      } else if (this.d && !this.b.n.Z().c()) {
         $$1.b(this);
         this.d = false;
      }

      if (this.d) {
         fhm $$2 = $$1.b();
         ffc $$3 = $$2.b();
         ffc $$4 = $$2.c();
         ffc $$5 = $$2.a();
         this.e.clear();

         for (fui.b $$6 : this.c) {
            if ($$6.c($$3)) {
               this.e.add($$6);
            }
         }

         if (!this.e.isEmpty()) {
            int $$7 = 0;
            int $$8 = 0;
            double $$9 = this.b.n.D().c();
            Iterator<fui.b> $$10 = this.e.iterator();

            while ($$10.hasNext()) {
               fui.b $$11 = $$10.next();
               $$11.a(3000.0 * $$9);
               if (!$$11.b()) {
                  $$10.remove();
               } else {
                  $$8 = Math.max($$8, this.b.h.a($$11.a()));
               }
            }

            $$8 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");

            for (fui.b $$12 : this.e) {
               int $$13 = 255;
               wy $$14 = $$12.a();
               fui.a $$15 = $$12.a($$3);
               if ($$15 != null) {
                  ffc $$16 = $$15.a.d($$3).d();
                  double $$17 = $$5.b($$16);
                  double $$18 = $$4.b($$16);
                  boolean $$19 = $$18 > 0.5;
                  int $$20 = $$8 / 2;
                  int $$21 = 9;
                  int $$22 = $$21 / 2;
                  float $$23 = 1.0F;
                  int $$24 = this.b.h.a($$14);
                  int $$25 = azm.d(azm.b(255.0F, 75.0F, (float)(ag.c() - $$15.b) / (float)(3000.0 * $$9)));
                  $$0.c().a();
                  $$0.c().a((float)$$0.a() - (float)$$20 * 1.0F - 2.0F, (float)($$0.b() - 35) - (float)($$7 * ($$21 + 1)) * 1.0F, 0.0F);
                  $$0.c().b(1.0F, 1.0F, 1.0F);
                  $$0.a(-$$20 - 1, -$$22 - 1, $$20 + 1, $$22 + 1, this.b.n.b(0.8F));
                  int $$26 = axw.a(255, $$25, $$25, $$25);
                  if (!$$19) {
                     if ($$17 > 0.0) {
                        $$0.b(this.b.h, ">", $$20 - this.b.h.b(">"), -$$22, $$26);
                     } else if ($$17 < 0.0) {
                        $$0.b(this.b.h, "<", -$$20, -$$22, $$26);
                     }
                  }

                  $$0.b(this.b.h, $$14, -$$24 / 2, -$$22, $$26);
                  $$0.c().b();
                  $$7++;
               }
            }
         }
      }
   }

   @Override
   public void a(hno $$0, hov $$1, float $$2) {
      if ($$1.a() != null) {
         wy $$3 = $$1.a();
         if (!this.c.isEmpty()) {
            for (fui.b $$4 : this.c) {
               if ($$4.a().equals($$3)) {
                  $$4.b(new ffc($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new fui.b($$3, $$2, new ffc($$0.h(), $$0.i(), $$0.j())));
      }
   }

   static record a(ffc a, long b) {
   }

   static class b {
      private final wy a;
      private final float b;
      private final List<fui.a> c = new ArrayList<>();

      public b(wy $$0, float $$1, ffc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c.add(new fui.a($$2, ag.c()));
      }

      public wy a() {
         return this.a;
      }

      @Nullable
      public fui.a a(ffc $$0) {
         if (this.c.isEmpty()) {
            return null;
         } else {
            return this.c.size() == 1 ? this.c.getFirst() : this.c.stream().min(Comparator.comparingDouble($$1 -> $$1.a().f($$0))).orElse(null);
         }
      }

      public void b(ffc $$0) {
         this.c.removeIf($$1 -> $$0.equals($$1.a()));
         this.c.add(new fui.a($$0, ag.c()));
      }

      public boolean c(ffc $$0) {
         if (Float.isInfinite(this.b)) {
            return true;
         } else if (this.c.isEmpty()) {
            return false;
         } else {
            fui.a $$1 = this.a($$0);
            return $$1 == null ? false : $$0.a((jp)$$1.a, (double)this.b);
         }
      }

      public void a(double $$0) {
         long $$1 = ag.c();
         this.c.removeIf($$2 -> (double)($$1 - $$2.b()) > $$0);
      }

      public boolean b() {
         return !this.c.isEmpty();
      }
   }
}
