import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxg extends foj<fxg.b> {
   private static final int a = 20;
   final fxh m;
   private int n;

   public fxg(fxh $$0, fme $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fmc[] $$2 = (fmc[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fmc $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxg.a(xv.c($$5)));
         }

         xv $$6 = xv.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxg.c($$4, $$6));
      }
   }

   public void b() {
      fmc.d();
      this.c();
   }

   public void c() {
      this.aI_().forEach(fxg.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxg.b {
      final xv b;
      private final int c;

      public a(final xv $$1) {
         this.b = $$1;
         this.c = fxg.this.c.h.a(this.b);
      }

      @Override
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fxg.this.c.h, this.b, fxg.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fnn a(fsh $$0) {
         return null;
      }

      @Override
      public List<? extends fqb> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends frz> b() {
         return ImmutableList.of(new frz() {
            @Override
            public frz.a u() {
               return frz.a.b;
            }

            @Override
            public void b(fsb $$0) {
               $$0.a(fsa.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends foj.a<fxg.b> {
      abstract void c();
   }

   public class c extends fxg.b {
      private static final xv b = xv.c("controls.reset");
      private static final int c = 10;
      private final fmc d;
      private final xv e;
      private final fod f;
      private final fod g;
      private boolean h = false;

      c(final fmc $$1, final xv $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fod.a($$2, $$1x -> {
            fxg.this.m.a = $$1;
            fxg.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xv.a("narrator.controls.unbound", $$2) : xv.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fod.a(b, $$1x -> {
            $$1.b($$1.i());
            fxg.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xv.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxg.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxg.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqb> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends frz> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yj $$0 = xv.i();
         if (!this.d.j()) {
            for (fmc $$1 : fxg.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xv.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xv.b("[ ").b(this.f.z().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fpp.a(xv.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxg.this.m.a == this.d) {
            this.f.b(xv.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
