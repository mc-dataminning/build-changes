import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class gau extends frw<gau.b> {
   private static final int a = 20;
   final gav m;
   private int n;

   public gau(gav $$0, fof $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fod[] $$2 = (fod[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fod $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new gau.a(ww.c($$5)));
         }

         ww $$6 = ww.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new gau.c($$4, $$6));
      }
   }

   public void b() {
      fod.d();
      this.c();
   }

   public void c() {
      this.aD_().forEach(gau.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends gau.b {
      final ww b;
      private final int c;

      public a(final ww $$1) {
         this.b = $$1;
         this.c = gau.this.c.h.a(this.b);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(gau.this.c.h, this.b, gau.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public fqz a(fvt $$0) {
         return null;
      }

      @Override
      public List<? extends ftn> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fvl> b() {
         return ImmutableList.of(new fvl() {
            @Override
            public fvl.a w() {
               return fvl.a.b;
            }

            @Override
            public void b(fvn $$0) {
               $$0.a(fvm.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends frw.a<gau.b> {
      abstract void c();
   }

   public class c extends gau.b {
      private static final ww b = ww.c("controls.reset");
      private static final int c = 10;
      private final fod d;
      private final ww e;
      private final frq f;
      private final frq g;
      private boolean h = false;

      c(final fod $$1, final ww $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = frq.a($$2, $$1x -> {
            gau.this.m.a = $$1;
            gau.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? ww.a("narrator.controls.unbound", $$2) : ww.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = frq.a(b, $$1x -> {
            $$1.b($$1.i());
            gau.this.b();
         }).a(0, 0, 50, 20).a($$1x -> ww.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = gau.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(gau.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends ftn> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fvl> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xk $$0 = ww.i();
         if (!this.d.j()) {
            for (fod $$1 : gau.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(ww.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(ww.b("[ ").b(this.f.B().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(ftb.a(ww.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (gau.this.m.a == this.d) {
            this.f.b(ww.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
