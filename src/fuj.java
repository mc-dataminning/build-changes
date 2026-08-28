import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fuj extends fln<fuj.b> {
   private static final int a = 20;
   final fuk m;
   private int n;

   public fuj(fuk $$0, fji $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fjg[] $$2 = (fjg[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fjg $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fuj.a(xi.c($$5)));
         }

         xi $$6 = xi.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fuj.c($$4, $$6));
      }
   }

   public void c() {
      fjg.d();
      this.J();
   }

   public void J() {
      this.aI_().forEach(fuj.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fuj.b {
      final xi b;
      private final int c;

      public a(final xi $$1) {
         this.b = $$1;
         this.c = fuj.this.c.h.a(this.b);
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fuj.this.c.h, this.b, fuj.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fkr a(fpl $$0) {
         return null;
      }

      @Override
      public List<? extends fne> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fpd> b() {
         return ImmutableList.of(new fpd() {
            @Override
            public fpd.a u() {
               return fpd.a.b;
            }

            @Override
            public void b(fpf $$0) {
               $$0.a(fpe.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fln.a<fuj.b> {
      abstract void c();
   }

   public class c extends fuj.b {
      private static final xi b = xi.c("controls.reset");
      private static final int c = 10;
      private final fjg d;
      private final xi e;
      private final flh f;
      private final flh g;
      private boolean h = false;

      c(final fjg $$1, final xi $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = flh.a($$2, $$1x -> {
            fuj.this.m.a = $$1;
            fuj.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xi.a("narrator.controls.unbound", $$2) : xi.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = flh.a(b, $$1x -> {
            $$1.b($$1.i());
            fuj.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xi.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fuj.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fuj.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fne> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fpd> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xw $$0 = xi.i();
         if (!this.d.j()) {
            for (fjg $$1 : fuj.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xi.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xi.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fms.a(xi.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fuj.this.m.a == this.d) {
            this.f.b(xi.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
