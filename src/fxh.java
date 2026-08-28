import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxh extends fok<fxh.b> {
   private static final int a = 20;
   final fxi m;
   private int n;

   public fxh(fxi $$0, fmf $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fmd[] $$2 = (fmd[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fmd $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxh.a(xv.c($$5)));
         }

         xv $$6 = xv.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxh.c($$4, $$6));
      }
   }

   public void b() {
      fmd.d();
      this.c();
   }

   public void c() {
      this.aI_().forEach(fxh.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxh.b {
      final xv b;
      private final int c;

      public a(final xv $$1) {
         this.b = $$1;
         this.c = fxh.this.c.h.a(this.b);
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fxh.this.c.h, this.b, fxh.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1, false);
      }

      @Nullable
      @Override
      public fno a(fsi $$0) {
         return null;
      }

      @Override
      public List<? extends fqc> aI_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fsa> b() {
         return ImmutableList.of(new fsa() {
            @Override
            public fsa.a u() {
               return fsa.a.b;
            }

            @Override
            public void b(fsc $$0) {
               $$0.a(fsb.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fok.a<fxh.b> {
      abstract void c();
   }

   public class c extends fxh.b {
      private static final xv b = xv.c("controls.reset");
      private static final int c = 10;
      private final fmd d;
      private final xv e;
      private final foe f;
      private final foe g;
      private boolean h = false;

      c(final fmd $$1, final xv $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = foe.a($$2, $$1x -> {
            fxh.this.m.a = $$1;
            fxh.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xv.a("narrator.controls.unbound", $$2) : xv.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = foe.a(b, $$1x -> {
            $$1.b($$1.i());
            fxh.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xv.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxh.this.q() - this.g.y() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.y();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxh.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.D() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqc> aI_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fsa> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yj $$0 = xv.i();
         if (!this.d.j()) {
            for (fmd $$1 : fxh.this.c.n.V) {
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
            this.f.a(fpq.a(xv.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxh.this.m.a == this.d) {
            this.f.b(xv.b("> ").b(this.f.z().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
