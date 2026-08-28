import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fzr extends fqt<fzr.b> {
   private static final int a = 20;
   final fzs m;
   private int n;

   public fzr(fzs $$0, fnd $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fnb[] $$2 = (fnb[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fnb $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fzr.a(wv.c($$5)));
         }

         wv $$6 = wv.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fzr.c($$4, $$6));
      }
   }

   public void b() {
      fnb.d();
      this.c();
   }

   public void c() {
      this.aD_().forEach(fzr.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fzr.b {
      final wv b;
      private final int c;

      public a(final wv $$1) {
         this.b = $$1;
         this.c = fzr.this.c.h.a(this.b);
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fzr.this.c.h, this.b, fzr.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public fpw a(fuq $$0) {
         return null;
      }

      @Override
      public List<? extends fsk> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fui> b() {
         return ImmutableList.of(new fui() {
            @Override
            public fui.a w() {
               return fui.a.b;
            }

            @Override
            public void b(fuk $$0) {
               $$0.a(fuj.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fqt.a<fzr.b> {
      abstract void c();
   }

   public class c extends fzr.b {
      private static final wv b = wv.c("controls.reset");
      private static final int c = 10;
      private final fnb d;
      private final wv e;
      private final fqn f;
      private final fqn g;
      private boolean h = false;

      c(final fnb $$1, final wv $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fqn.a($$2, $$1x -> {
            fzr.this.m.a = $$1;
            fzr.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wv.a("narrator.controls.unbound", $$2) : wv.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fqn.a(b, $$1x -> {
            $$1.b($$1.i());
            fzr.this.b();
         }).a(0, 0, 50, 20).a($$1x -> wv.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fzr.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fzr.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fsk> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fui> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xj $$0 = wv.i();
         if (!this.d.j()) {
            for (fnb $$1 : fzr.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wv.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wv.b("[ ").b(this.f.B().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fry.a(wv.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fzr.this.m.a == this.d) {
            this.f.b(wv.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
