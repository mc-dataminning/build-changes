import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fuy extends fmc<fuy.b> {
   private static final int a = 20;
   final fuz m;
   private int n;

   public fuy(fuz $$0, fjx $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fjv[] $$2 = (fjv[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fjv $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fuy.a(xl.c($$5)));
         }

         xl $$6 = xl.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fuy.c($$4, $$6));
      }
   }

   public void c() {
      fjv.d();
      this.J();
   }

   public void J() {
      this.aI_().forEach(fuy.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fuy.b {
      final xl b;
      private final int c;

      public a(final xl $$1) {
         this.b = $$1;
         this.c = fuy.this.c.h.a(this.b);
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fuy.this.c.h, this.b, fuy.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public flg a(fqa $$0) {
         return null;
      }

      @Override
      public List<? extends fnt> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fps> b() {
         return ImmutableList.of(new fps() {
            @Override
            public fps.a u() {
               return fps.a.b;
            }

            @Override
            public void b(fpu $$0) {
               $$0.a(fpt.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fmc.a<fuy.b> {
      abstract void c();
   }

   public class c extends fuy.b {
      private static final xl b = xl.c("controls.reset");
      private static final int c = 10;
      private final fjv d;
      private final xl e;
      private final flw f;
      private final flw g;
      private boolean h = false;

      c(final fjv $$1, final xl $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = flw.a($$2, $$1x -> {
            fuy.this.m.a = $$1;
            fuy.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xl.a("narrator.controls.unbound", $$2) : xl.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = flw.a(b, $$1x -> {
            $$1.b($$1.i());
            fuy.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xl.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fuy.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fuy.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fnt> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fps> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xz $$0 = xl.i();
         if (!this.d.j()) {
            for (fjv $$1 : fuy.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xl.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xl.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fnh.a(xl.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fuy.this.m.a == this.d) {
            this.f.b(xl.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
