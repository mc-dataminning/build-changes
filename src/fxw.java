import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxw extends fpa<fxw.b> {
   private static final int a = 20;
   final fxx m;
   private int n;

   public fxw(fxx $$0, flk $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fli[] $$2 = (fli[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fli $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxw.a(wp.c($$5)));
         }

         wp $$6 = wp.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxw.c($$4, $$6));
      }
   }

   public void b() {
      fli.d();
      this.c();
   }

   public void c() {
      this.aH_().forEach(fxw.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxw.b {
      final wp b;
      private final int c;

      public a(final wp $$1) {
         this.b = $$1;
         this.c = fxw.this.c.h.a(this.b);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fxw.this.c.h, this.b, fxw.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public foc a(fsx $$0) {
         return null;
      }

      @Override
      public List<? extends fqr> aH_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fsp> b() {
         return ImmutableList.of(new fsp() {
            @Override
            public fsp.a w() {
               return fsp.a.b;
            }

            @Override
            public void b(fsr $$0) {
               $$0.a(fsq.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fpa.a<fxw.b> {
      abstract void c();
   }

   public class c extends fxw.b {
      private static final wp b = wp.c("controls.reset");
      private static final int c = 10;
      private final fli d;
      private final wp e;
      private final fou f;
      private final fou g;
      private boolean h = false;

      c(final fli $$1, final wp $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fou.a($$2, $$1x -> {
            fxw.this.m.a = $$1;
            fxw.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wp.a("narrator.controls.unbound", $$2) : wp.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fou.a(b, $$1x -> {
            $$1.b($$1.i());
            fxw.this.b();
         }).a(0, 0, 50, 20).a($$1x -> wp.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxw.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxw.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqr> aH_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fsp> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xd $$0 = wp.i();
         if (!this.d.j()) {
            for (fli $$1 : fxw.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wp.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wp.b("[ ").b(this.f.B().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fqf.a(wp.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxw.this.m.a == this.d) {
            this.f.b(wp.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
