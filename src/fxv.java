import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fxv {
   public static final int a = 20;
   private static final fps b = new fps(alz.b("recipe_book/page_forward"), alz.b("recipe_book/page_forward_highlighted"));
   private static final fps c = new fps(alz.b("recipe_book/page_backward"), alz.b("recipe_book/page_backward_highlighted"));
   private final List<fxx> d = Lists.newArrayListWithCapacity(20);
   @Nullable
   private fxx e;
   private final fxt f;
   private fmf g;
   private final fxu<?> h;
   private List<fxy> i = ImmutableList.of();
   private fpl j;
   private fpl k;
   private int l;
   private int m;
   private flq n;
   @Nullable
   private ddk o;
   @Nullable
   private fxy p;
   private boolean q;

   public fxv(fxu<?> $$0, fyb $$1, boolean $$2) {
      this.h = $$0;
      this.f = new fxt($$1, $$2);

      for (int $$3 = 0; $$3 < 20; $$3++) {
         this.d.add(new fxx($$1));
      }
   }

   public void a(fmf $$0, int $$1, int $$2) {
      this.g = $$0;
      this.n = $$0.t.n();

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.d.get($$3).c($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
      }

      this.j = new fpl($$1 + 93, $$2 + 137, 12, 17, false);
      this.j.a(b);
      this.k = new fpl($$1 + 38, $$2 + 137, 12, 17, true);
      this.k.a(c);
   }

   public void a(List<fxy> $$0, boolean $$1, boolean $$2) {
      this.i = $$0;
      this.q = $$2;
      this.l = (int)Math.ceil((double)$$0.size() / 20.0);
      if (this.l <= this.m || $$1) {
         this.m = 0;
      }

      this.e();
   }

   private void e() {
      int $$0 = 20 * this.m;
      bbp $$1 = ddp.a(this.g.s);

      for (int $$2 = 0; $$2 < this.d.size(); $$2++) {
         fxx $$3 = this.d.get($$2);
         if ($$0 + $$2 < this.i.size()) {
            fxy $$4 = this.i.get($$0 + $$2);
            $$3.a($$4, this.q, this, $$1);
            $$3.k = true;
         } else {
            $$3.k = false;
         }
      }

      this.f();
   }

   private void f() {
      this.j.k = this.l > 1 && this.m < this.l - 1;
      this.k.k = this.l > 1 && this.m > 0;
   }

   public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      if (this.l > 1) {
         xv $$6 = xv.a("gui.recipebook.page", this.m + 1, this.l);
         int $$7 = this.g.h.a($$6);
         $$0.a(this.g.h, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1, false);
      }

      this.e = null;

      for (fxx $$8 : this.d) {
         $$8.a($$0, $$3, $$4, $$5);
         if ($$8.k && $$8.B()) {
            this.e = $$8;
         }
      }

      this.k.a($$0, $$3, $$4, $$5);
      this.j.a($$0, $$3, $$4, $$5);
      this.f.a($$0, $$3, $$4, $$5);
   }

   public void a(fnr $$0, int $$1, int $$2) {
      if (this.g.z != null && this.e != null && !this.f.c()) {
         cxo $$3 = this.e.e();
         alz $$4 = $$3.a(ku.G);
         $$0.a(this.g.h, this.e.a($$3), $$1, $$2, $$4);
      }
   }

   @Nullable
   public ddk a() {
      return this.o;
   }

   @Nullable
   public fxy b() {
      return this.p;
   }

   public void c() {
      this.f.b(false);
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      this.o = null;
      this.p = null;
      if (this.f.c()) {
         if (this.f.a($$0, $$1, $$2)) {
            this.o = this.f.b();
            this.p = this.f.a();
         } else {
            this.f.b(false);
         }

         return true;
      } else if (this.j.a($$0, $$1, $$2)) {
         this.m++;
         this.e();
         return true;
      } else if (this.k.a($$0, $$1, $$2)) {
         this.m--;
         this.e();
         return true;
      } else {
         bbp $$7 = ddp.a(this.g.s);

         for (fxx $$8 : this.d) {
            if ($$8.a($$0, $$1, $$2)) {
               if ($$2 == 0) {
                  this.o = $$8.c();
                  this.p = $$8.a();
               } else if ($$2 == 1 && !this.f.c() && !$$8.b()) {
                  this.f.a($$8.a(), $$7, this.q, $$8.D(), $$8.E(), $$3 + $$5 / 2, $$4 + 13 + $$6 / 2, (float)$$8.y());
               }

               return true;
            }
         }

         return false;
      }
   }

   public void a(ddk $$0) {
      this.h.a($$0);
   }

   public flq d() {
      return this.n;
   }

   protected void a(Consumer<foc> $$0) {
      $$0.accept(this.j);
      $$0.accept(this.k);
      this.d.forEach($$0);
   }
}
