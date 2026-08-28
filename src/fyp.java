import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.math.Fraction;

public class fyp implements fyr {
   private static final ald a = ald.b("container/bundle/bundle_progressbar_border");
   private static final ald b = ald.b("container/bundle/bundle_progressbar_fill");
   private static final ald c = ald.b("container/bundle/bundle_progressbar_full");
   private static final ald d = ald.b("container/bundle/slot_highlight_back");
   private static final ald e = ald.b("container/bundle/slot_highlight_front");
   private static final ald f = ald.b("container/bundle/slot_background");
   private static final int g = 4;
   private static final int h = 24;
   private static final int i = 96;
   private static final int j = 13;
   private static final int k = 96;
   private static final int l = 1;
   private static final int m = 94;
   private static final int n = 4;
   private static final wv o = wv.c("item.minecraft.bundle.full");
   private static final wv p = wv.c("item.minecraft.bundle.empty");
   private static final wv q = wv.c("item.minecraft.bundle.empty.description");
   private final czz r;

   public fyp(czz $$0) {
      this.r = $$0;
   }

   @Override
   public int a(fpx $$0) {
      return this.r.g() ? c($$0) : this.b();
   }

   @Override
   public int b(fpx $$0) {
      return 96;
   }

   @Override
   public boolean a() {
      return true;
   }

   private static int c(fpx $$0) {
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
      return azk.e(this.e(), 4);
   }

   private int e() {
      return Math.min(12, this.r.e());
   }

   @Override
   public void a(fpx $$0, int $$1, int $$2, int $$3, int $$4, fpz $$5) {
      if (this.r.g()) {
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         this.c($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private void b(fpx $$0, int $$1, int $$2, int $$3, int $$4, fpz $$5) {
      b($$1 + this.a($$3), $$2, $$0, $$5);
      this.a($$1 + this.a($$3), $$2 + d($$0) + 4, $$0, $$5);
   }

   private void c(fpx $$0, int $$1, int $$2, int $$3, int $$4, fpz $$5) {
      boolean $$6 = this.r.e() > 12;
      List<cxy> $$7 = this.b(this.r.a());
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

   private List<cxy> b(int $$0) {
      int $$1 = Math.min(this.r.e(), $$0);
      return this.r.b().toList().subList(0, $$1);
   }

   private static boolean a(boolean $$0, int $$1, int $$2) {
      return $$0 && $$1 * $$2 == 1;
   }

   private static boolean a(List<cxy> $$0, int $$1) {
      return $$0.size() >= $$1;
   }

   private int a(List<cxy> $$0) {
      return this.r.b().skip((long)$$0.size()).mapToInt(cxy::M).sum();
   }

   private void a(int $$0, int $$1, int $$2, List<cxy> $$3, int $$4, fpx $$5, fpz $$6) {
      int $$7 = $$3.size() - $$0;
      boolean $$8 = $$7 == this.r.h();
      cxy $$9 = $$3.get($$7);
      if ($$8) {
         $$6.a(goi::H, d, $$1, $$2, 24, 24);
      } else {
         $$6.a(goi::H, f, $$1, $$2, 24, 24);
      }

      $$6.a($$9, $$1 + 4, $$2 + 4, $$4);
      $$6.a($$5, $$9, $$1 + 4, $$2 + 4);
      if ($$8) {
         $$6.a(goi::F, e, $$1, $$2, 24, 24);
      }
   }

   private static void a(int $$0, int $$1, int $$2, fpx $$3, fpz $$4) {
      $$4.a($$3, "+" + $$2, $$0 + 12, $$1 + 10, 16777215);
   }

   private void a(fpx $$0, fpz $$1, int $$2, int $$3, int $$4) {
      if (this.r.i()) {
         cxy $$5 = this.r.a(this.r.h());
         wv $$6 = $$5.B();
         int $$7 = $$0.a($$6.g());
         int $$8 = $$2 + $$4 / 2 - 12;
         $$1.a($$0, $$6, $$8 - $$7 / 2, $$3 - 15, $$5.a(kx.H));
      }
   }

   private void a(int $$0, int $$1, fpx $$2, fpz $$3) {
      $$3.a(goi::H, this.g(), $$0 + 1, $$1, this.f(), 13);
      $$3.a(goi::H, a, $$0, $$1, 96, 13);
      wv $$4 = this.h();
      if ($$4 != null) {
         $$3.a($$2, $$4, $$0 + 48, $$1 + 3, 16777215);
      }
   }

   private static void b(int $$0, int $$1, fpx $$2, fpz $$3) {
      $$3.a($$2, q, $$0, $$1, 96, 11184810);
   }

   private static int d(fpx $$0) {
      return $$0.c(q, 96).size() * 9;
   }

   private int f() {
      return azk.a(azk.a(this.r.f(), 94), 0, 94);
   }

   private ald g() {
      return this.r.f().compareTo(Fraction.ONE) >= 0 ? c : b;
   }

   @Nullable
   private wv h() {
      if (this.r.g()) {
         return p;
      } else {
         return this.r.f().compareTo(Fraction.ONE) >= 0 ? o : null;
      }
   }
}
