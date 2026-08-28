import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class gdp extends fur<gdp.b> {
   private static final int a = 20;
   final gdq m;
   private int n;

   public gdp(gdq $$0, frd $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      frb[] $$2 = (frb[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (frb $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new gdp.a(xa.c($$5)));
         }

         xa $$6 = xa.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new gdp.c($$4, $$6));
      }
   }

   public void b() {
      frb.d();
      this.c();
   }

   public void c() {
      this.aI_().forEach(gdp.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends gdp.b {
      final xa b;
      private final int c;

      public a(final xa $$1) {
         this.b = $$1;
         this.c = gdp.this.c.h.a(this.b);
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(gdp.this.c.h, this.b, gdp.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public ftu a(fyo $$0) {
         return null;
      }

      @Override
      public List<? extends fwi> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fyg> b() {
         return ImmutableList.of(new fyg() {
            @Override
            public fyg.a w() {
               return fyg.a.b;
            }

            @Override
            public void b(fyi $$0) {
               $$0.a(fyh.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fur.a<gdp.b> {
      abstract void c();
   }

   public class c extends gdp.b {
      private static final xa b = xa.c("controls.reset");
      private static final int c = 10;
      private final frb d;
      private final xa e;
      private final ful f;
      private final ful g;
      private boolean h = false;

      c(final frb $$1, final xa $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = ful.a($$2, $$1x -> {
            gdp.this.m.a = $$1;
            gdp.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xa.a("narrator.controls.unbound", $$2) : xa.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = ful.a(b, $$1x -> {
            $$1.b($$1.i());
            gdp.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xa.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = gdp.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(gdp.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fwi> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fyg> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xo $$0 = xa.i();
         if (!this.d.j()) {
            for (frb $$1 : gdp.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xa.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xa.b("[ ").b(this.f.B().f().a(o.p)).f(" ]").a(o.m));
            this.f.a(fvw.a(xa.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (gdp.this.m.a == this.d) {
            this.f.b(xa.b("> ").b(this.f.B().f().a(o.p, o.t)).f(" <").a(o.o));
         }
      }
   }
}
