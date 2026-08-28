import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxi extends fol<fxi.b> {
   private static final int a = 20;
   final fxj m;
   private int n;

   public fxi(fxj $$0, fmg $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fme[] $$2 = (fme[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fme $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxi.a(xv.c($$5)));
         }

         xv $$6 = xv.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxi.c($$4, $$6));
      }
   }

   public void b() {
      fme.d();
      this.c();
   }

   public void c() {
      this.aI_().forEach(fxi.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxi.b {
      final xv b;
      private final int c;

      public a(final xv $$1) {
         this.b = $$1;
         this.c = fxi.this.c.h.a(this.b);
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fxi.this.c.h, this.b, fxi.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fnp a(fsj $$0) {
         return null;
      }

      @Override
      public List<? extends fqd> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fsb> b() {
         return ImmutableList.of(new fsb() {
            @Override
            public fsb.a u() {
               return fsb.a.b;
            }

            @Override
            public void b(fsd $$0) {
               $$0.a(fsc.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fol.a<fxi.b> {
      abstract void c();
   }

   public class c extends fxi.b {
      private static final xv b = xv.c("controls.reset");
      private static final int c = 10;
      private final fme d;
      private final xv e;
      private final fof f;
      private final fof g;
      private boolean h = false;

      c(final fme $$1, final xv $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fof.a($$2, $$1x -> {
            fxi.this.m.a = $$1;
            fxi.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xv.a("narrator.controls.unbound", $$2) : xv.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fof.a(b, $$1x -> {
            $$1.b($$1.i());
            fxi.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xv.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxi.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxi.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqd> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fsb> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yj $$0 = xv.i();
         if (!this.d.j()) {
            for (fme $$1 : fxi.this.c.n.V) {
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
            this.f.a(fpr.a(xv.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxi.this.m.a == this.d) {
            this.f.b(xv.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
