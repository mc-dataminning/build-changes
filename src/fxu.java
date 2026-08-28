import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxu extends foy<fxu.b> {
   private static final int a = 20;
   final fxv m;
   private int n;

   public fxu(fxv $$0, flj $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      flh[] $$2 = (flh[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (flh $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxu.a(wo.c($$5)));
         }

         wo $$6 = wo.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxu.c($$4, $$6));
      }
   }

   public void b() {
      flh.d();
      this.c();
   }

   public void c() {
      this.aH_().forEach(fxu.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxu.b {
      final wo b;
      private final int c;

      public a(final wo $$1) {
         this.b = $$1;
         this.c = fxu.this.c.h.a(this.b);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fxu.this.c.h, this.b, fxu.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public foa a(fsv $$0) {
         return null;
      }

      @Override
      public List<? extends fqp> aH_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fsn> b() {
         return ImmutableList.of(new fsn() {
            @Override
            public fsn.a w() {
               return fsn.a.b;
            }

            @Override
            public void b(fsp $$0) {
               $$0.a(fso.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends foy.a<fxu.b> {
      abstract void c();
   }

   public class c extends fxu.b {
      private static final wo b = wo.c("controls.reset");
      private static final int c = 10;
      private final flh d;
      private final wo e;
      private final fos f;
      private final fos g;
      private boolean h = false;

      c(final flh $$1, final wo $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fos.a($$2, $$1x -> {
            fxu.this.m.a = $$1;
            fxu.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wo.a("narrator.controls.unbound", $$2) : wo.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fos.a(b, $$1x -> {
            $$1.b($$1.i());
            fxu.this.b();
         }).a(0, 0, 50, 20).a($$1x -> wo.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxu.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxu.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqp> aH_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fsn> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xc $$0 = wo.i();
         if (!this.d.j()) {
            for (flh $$1 : fxu.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(wo.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(wo.b("[ ").b(this.f.B().f().a(n.p)).f(" ]").a(n.m));
            this.f.a(fqd.a(wo.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxu.this.m.a == this.d) {
            this.f.b(wo.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
