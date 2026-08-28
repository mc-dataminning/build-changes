import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fvg extends fmj<fvg.b> {
   private static final int a = 20;
   final fvh m;
   private int n;

   public fvg(fvh $$0, fke $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fkc[] $$2 = (fkc[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fkc $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fvg.a(xj.c($$5)));
         }

         xj $$6 = xj.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fvg.c($$4, $$6));
      }
   }

   public void c() {
      fkc.d();
      this.J();
   }

   public void J() {
      this.aH_().forEach(fvg.b::c);
   }

   @Override
   public int b() {
      return 340;
   }

   public class a extends fvg.b {
      final xj b;
      private final int c;

      public a(final xj $$1) {
         this.b = $$1;
         this.c = fvg.this.c.h.a(this.b);
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fvg.this.c.h, this.b, fvg.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fln a(fqh $$0) {
         return null;
      }

      @Override
      public List<? extends foa> aH_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fpz> b() {
         return ImmutableList.of(new fpz() {
            @Override
            public fpz.a u() {
               return fpz.a.b;
            }

            @Override
            public void b(fqb $$0) {
               $$0.a(fqa.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fmj.a<fvg.b> {
      abstract void c();
   }

   public class c extends fvg.b {
      private static final xj b = xj.c("controls.reset");
      private static final int c = 10;
      private final fkc d;
      private final xj e;
      private final fmd f;
      private final fmd g;
      private boolean h = false;

      c(final fkc $$1, final xj $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fmd.a($$2, $$1x -> {
            fvg.this.m.a = $$1;
            fvg.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xj.a("narrator.controls.unbound", $$2) : xj.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fmd.a(b, $$1x -> {
            $$1.b($$1.i());
            fvg.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xj.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fvg.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fvg.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends foa> aH_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fpz> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xx $$0 = xj.i();
         if (!this.d.j()) {
            for (fkc $$1 : fvg.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xj.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xj.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fno.a(xj.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fvg.this.m.a == this.d) {
            this.f.b(xj.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
