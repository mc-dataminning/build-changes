import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class gdr extends fut<gdr.b> {
   private static final int a = 20;
   final gds m;
   private int n;

   public gdr(gds $$0, frf $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      frd[] $$2 = (frd[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (frd $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new gdr.a(xc.c($$5)));
         }

         xc $$6 = xc.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new gdr.c($$4, $$6));
      }
   }

   public void b() {
      frd.d();
      this.c();
   }

   public void c() {
      this.aI_().forEach(gdr.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends gdr.b {
      final xc b;
      private final int c;

      public a(final xc $$1) {
         this.b = $$1;
         this.c = gdr.this.c.h.a(this.b);
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(gdr.this.c.h, this.b, gdr.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public ftw a(fyq $$0) {
         return null;
      }

      @Override
      public List<? extends fwk> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fyi> b() {
         return ImmutableList.of(new fyi() {
            @Override
            public fyi.a w() {
               return fyi.a.b;
            }

            @Override
            public void b(fyk $$0) {
               $$0.a(fyj.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fut.a<gdr.b> {
      abstract void c();
   }

   public class c extends gdr.b {
      private static final xc b = xc.c("controls.reset");
      private static final int c = 10;
      private final frd d;
      private final xc e;
      private final fun f;
      private final fun g;
      private boolean h = false;

      c(final frd $$1, final xc $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fun.a($$2, $$1x -> {
            gdr.this.m.a = $$1;
            gdr.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xc.a("narrator.controls.unbound", $$2) : xc.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fun.a(b, $$1x -> {
            $$1.b($$1.i());
            gdr.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xc.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = gdr.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(gdr.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fwk> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fyi> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xq $$0 = xc.i();
         if (!this.d.j()) {
            for (frd $$1 : gdr.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xc.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xc.b("[ ").b(this.f.B().f().a(o.p)).f(" ]").a(o.m));
            this.f.a(fvy.a(xc.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (gdr.this.m.a == this.d) {
            this.f.b(xc.b("> ").b(this.f.B().f().a(o.p, o.t)).f(" <").a(o.o));
         }
      }
   }
}
