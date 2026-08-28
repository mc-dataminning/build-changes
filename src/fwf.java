import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class fwf implements fwh {
   private static final alz a = alz.b("container/bundle/bundle_progressbar_border");
   private static final alz b = alz.b("container/bundle/bundle_progressbar_fill");
   private static final alz c = alz.b("container/bundle/bundle_progressbar_full");
   private static final alz d = alz.b("container/bundle/slot_highlight_back");
   private static final alz e = alz.b("container/bundle/slot_highlight_front");
   private static final int f = 4;
   private static final int g = 24;
   private static final int h = 96;
   private static final int i = 13;
   private static final int j = 96;
   private static final int k = 1;
   private static final int l = 94;
   private static final int m = 4;
   private static final xv n = xv.c("item.minecraft.bundle.full");
   private static final xv o = xv.c("item.minecraft.bundle.empty");
   private static final xv p = xv.c("item.minecraft.bundle.empty.description");
   private final czs q;

   public fwf(czs $$0) {
      this.q = $$0;
   }

   @Override
   public int a(fnp $$0) {
      return this.q.g() ? c($$0) : this.b();
   }

   @Override
   public int b(fnp $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(fnp $$0) {
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
      return bae.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.q.e());
   }

   @Override
   public void a(fnp $$0, int $$1, int $$2, int $$3, int $$4, fnr $$5) {
      if (this.q.g()) {
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         this.c($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private void b(fnp $$0, int $$1, int $$2, int $$3, int $$4, fnr $$5) {
      b($$1 + this.a($$3), $$2, $$0, $$5);
      this.a($$1 + this.a($$3), $$2 + d($$0) + 4, $$0, $$5);
   }

   private void c(fnp $$0, int $$1, int $$2, int $$3, int $$4, fnr $$5) {
      boolean $$6 = this.q.e() > 12;
      List<cxo> $$7 = this.b(this.q.a());
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

   private List<cxo> b(int $$0) {
      int $$1 = Math.min(this.q.e(), $$0);
      return this.q.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<cxo> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<cxo> $$0) {
      return this.q.b().skip((long)$$0.size()).mapToInt(cxo::L).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<cxo> $$3, int $$4, fnp $$5, fnr $$6) {
      int $$7 = $$3.size() - $$0;
      boolean $$8 = $$7 == this.q.h();
      cxo $$9 = $$3.get($$7);
      if ($$8) {
         $$6.a(glu::C, d, $$1, $$2, 24, 24);
      }

      $$6.a($$9, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$9, $$1 + 4, $$2 + 4);
      if ($$8) {
         $$6.a(glu::A, e, $$1, $$2, 24, 24);
      }
   }

   private static void a(int $$0, int $$1, int $$2, fnp $$3, fnr $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(fnp $$0, fnr $$1, int $$2, int $$3, int $$4) {
      if (this.q.i()) {
         cxo $$5 = this.q.a(this.q.h());
         xv $$6 = $$5.A();
         int $$7 = $$0.a($$6.g());
         int $$8 = $$2 + $$4 / 2 - 12;
         $$1.a($$0, $$6, $$8 - $$7 / 2, $$3 - 15, $$5.a(ku.G));
      }
   }

   private void a(int $$0, int $$1, fnp $$2, fnr $$3) {
      $$3.a(glu::C, this.g(), $$0 + 1, $$1, this.f(), 13);
      $$3.a(glu::C, a, $$0, $$1, 96, 13);
      xv $$4 = this.h();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, fnp $$2, fnr $$3) {
      $$3.a($$2, p, $$0, $$1, 96, 11184810);
   }

   private static int d(fnp $$0) {
      return $$0.c(p, 96).size() * 9;
   }

   private int f() {
      return bae.a(bae.a(this.q.f(), 94), 0, 94);
   }

   private alz g() {
      return this.q.f().compareTo(Fraction.ONE) >= 0 ? c : b;
   }

   @Nullable
   private xv h() {
      if (this.q.g()) {
         return o;
      } else {
         return this.q.f().compareTo(Fraction.ONE) >= 0 ? n : null;
      }
   }
}
