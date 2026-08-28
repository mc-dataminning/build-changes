import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class gcp implements gcr {
   private static final alk a = alk.b("container/bundle/bundle_progressbar_border");
   private static final alk b = alk.b("container/bundle/bundle_progressbar_fill");
   private static final alk c = alk.b("container/bundle/bundle_progressbar_full");
   private static final alk d = alk.b("container/bundle/slot_highlight_back");
   private static final alk e = alk.b("container/bundle/slot_highlight_front");
   private static final alk f = alk.b("container/bundle/slot_background");
   private static final int g = 4;
   private static final int h = 24;
   private static final int i = 96;
   private static final int j = 13;
   private static final int k = 96;
   private static final int l = 1;
   private static final int m = 94;
   private static final int n = 4;
   private static final xc o = xc.c("item.minecraft.bundle.full");
   private static final xc p = xc.c("item.minecraft.bundle.empty");
   private static final xc q = xc.c("item.minecraft.bundle.empty.description");
   private final dcd r;

   public gcp(dcd $$0) {
      this.r = $$0;
   }

   @Override
   public int a(ftx $$0) {
      return this.r.g() ? c($$0) : this.b();
   }

   @Override
   public int b(ftx $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(ftx $$0) {
      return d($$0) + 13 + 8;
   }

   private int b() {
      return this.c() + 13 + 8;
   }

   private int c() {
      return this.d() * 24;
   }

   private int a(int $$0) {
      return ($$0 - 96) / 2;
   }

   private int d() {
      return azq.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.r.e());
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, ftz $$5) {
      if (this.r.g()) {
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         this.c($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private void b(ftx $$0, int $$1, int $$2, int $$3, int $$4, ftz $$5) {
      b($$1 + this.a($$3), $$2, $$0, $$5);
      this.a($$1 + this.a($$3), $$2 + d($$0) + 4, $$0, $$5);
   }

   private void c(ftx $$0, int $$1, int $$2, int $$3, int $$4, ftz $$5) {
      boolean $$6 = this.r.e() > 12;
      List<daa> $$7 = this.b(this.r.a());
      int $$8 = $$1 + this.a($$3) + 96;
      int $$9 = $$2 + this.d() * 24;
      int $$10 = 1;

      for (int $$11 = 1; $$11 <= this.d(); $$11++) {
         for (int $$12 = 1; $$12 <= 4; $$12++) {
            int $$13 = $$8 - $$12 * 24;
            int $$14 = $$9 - $$11 * 24;
            if (a($$6, $$12, $$11)) {
               a($$13, $$14, this.a($$7), $$0, $$5);
            } else if (a($$7, $$10)) {
               this.a($$10, $$13, $$14, $$7, $$10, $$0, $$5);
               $$10++;
            }
         }
      }

      this.a($$0, $$5, $$1, $$2, $$3);
      this.a($$1 + this.a($$3), $$2 + this.c() + 4, $$0, $$5);
   }

   private List<daa> b(int $$0) {
      int $$1 = Math.min(this.r.e(), $$0);
      return this.r.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<daa> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<daa> $$0) {
      return this.r.b().skip((long)$$0.size()).mapToInt(daa::M).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<daa> $$3, int $$4, ftx $$5, ftz $$6) {
      int $$7 = $$3.size() - $$0;
      boolean $$8 = $$7 == this.r.h();
      daa $$9 = $$3.get($$7);
      if ($$8) {
         $$6.a(gsn::H, d, $$1, $$2, 24, 24);
      } else {
         $$6.a(gsn::H, f, $$1, $$2, 24, 24);
      }

      $$6.a($$9, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$9, $$1 + 4, $$2 + 4);
      if ($$8) {
         $$6.a(gsn::F, e, $$1, $$2, 24, 24);
      }
   }

   private static void a(int $$0, int $$1, int $$2, ftx $$3, ftz $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(ftx $$0, ftz $$1, int $$2, int $$3, int $$4) {
      if (this.r.i()) {
         daa $$5 = this.r.a(this.r.h());
         xc $$6 = $$5.B();
         int $$7 = $$0.a($$6.g());
         int $$8 = $$2 + $$4 / 2 - 12;
         $$1.a($$0, $$6, $$8 - $$7 / 2, $$3 - 15, $$5.a(kl.G));
      }
   }

   private void a(int $$0, int $$1, ftx $$2, ftz $$3) {
      $$3.a(gsn::H, this.g(), $$0 + 1, $$1, this.f(), 13);
      $$3.a(gsn::H, a, $$0, $$1, 96, 13);
      xc $$4 = this.h();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, ftx $$2, ftz $$3) {
      $$3.a($$2, q, $$0, $$1, 96, 11184810);
   }

   private static int d(ftx $$0) {
      return $$0.c(q, 96).size() * 9;
   }

   private int f() {
      return azq.a(azq.a(this.r.f(), 94), 0, 94);
   }

   private alk g() {
      return this.r.f().compareTo(Fraction.ONE) >= 0 ? c : b;
   }

   @Nullable
   private xc h() {
      if (this.r.g()) {
         return p;
      } else {
         return this.r.f().compareTo(Fraction.ONE) >= 0 ? o : null;
      }
   }
}
