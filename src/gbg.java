import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class gbg extends fsi<gbg.b> {
   private static final int a = 20;
   final gbh m;
   private int n;

   public gbg(gbh $$0, fos $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fop[] $$2 = (fop[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fop $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new gbg.a(wy.c($$5)));
         }

         wy $$6 = wy.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new gbg.c($$4, $$6));
      }
   }

   public void b() {
      fop.d();
      this.c();
   }

   public void c() {
      this.aD_().forEach(gbg.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends gbg.b {
      final wy b;
      private final int c;

      public a(final wy $$1) {
         this.b = $$1;
         this.c = gbg.this.c.h.a(this.b);
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(gbg.this.c.h, this.b, gbg.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public frl a(fwf $$0) {
         return null;
      }

      @Override
      public List<? extends ftz> aD_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fvx> b() {
         return ImmutableList.of(new fvx() {
            @Override
            public fvx.a w() {
               return fvx.a.b;
            }

            @Override
            public void b(fvz $$0) {
               $$0.a(fvy.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fsi.a<gbg.b> {
      abstract void c();
   }

   public class c extends gbg.b {
      private static final wy b = wy.c("controls.reset");
      private static final int c = 10;
      private final fop d;
      private final wy e;
      private final fsc f;
      private final fsc g;
      private boolean h = false;

      c(final fop $$1, final wy $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fsc.a($$2, $$1x -> {
            gbg.this.m.a = $$1;
            gbg.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wy.a("narrator.controls.unbound", $$2) : wy.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fsc.a(b, $$1x -> {
            $$1.b($$1.i());
            gbg.this.b();
         }).a(0, 0, 50, 20).a($$1x -> wy.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = gbg.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(gbg.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends ftz> aD_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fvx> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xm $$0 = wy.i();
         if (!this.d.j()) {
            for (fop $$1 : gbg.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wy.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wy.b("[ ").b(this.f.B().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(ftn.a(wy.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (gbg.this.m.a == this.d) {
            this.f.b(wy.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
