import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class fxs extends fow<fxs.b> {
   private static final int a = 20;
   final fxt m;
   private int n;

   public fxs(fxt $$0, flh $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      flf[] $$2 = (flf[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (flf $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new fxs.a(wo.c($$5)));
         }

         wo $$6 = wo.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new fxs.c($$4, $$6));
      }
   }

   public void b() {
      flf.d();
      this.c();
   }

   public void c() {
      this.aH_().forEach(fxs.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends fxs.b {
      final wo b;
      private final int c;

      public a(final wo $$1) {
         this.b = $$1;
         this.c = fxs.this.c.h.a(this.b);
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fxs.this.c.h, this.b, fxs.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public fny a(fst $$0) {
         return null;
      }

      @Override
      public List<? extends fqn> aH_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fsl> b() {
         return ImmutableList.of(new fsl() {
            @Override
            public fsl.a w() {
               return fsl.a.b;
            }

            @Override
            public void b(fsn $$0) {
               $$0.a(fsm.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fow.a<fxs.b> {
      abstract void c();
   }

   public class c extends fxs.b {
      private static final wo b = wo.c("controls.reset");
      private static final int c = 10;
      private final flf d;
      private final wo e;
      private final fop f;
      private final fop g;
      private boolean h = false;

      c(final flf $$1, final wo $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fop.a($$2, $$1x -> {
            fxs.this.m.a = $$1;
            fxs.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? wo.a("narrator.controls.unbound", $$2) : wo.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fop.a(b, $$1x -> {
            $$1.b($$1.i());
            fxs.this.b();
         }).a(0, 0, 50, 20).a($$1x -> wo.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = fxs.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(fxs.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fqn> aH_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fsl> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xc $$0 = wo.i();
         if (!this.d.j()) {
            for (flf $$1 : fxs.this.c.n.V) {
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
            this.f.a(fqb.a(wo.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (fxs.this.m.a == this.d) {
            this.f.b(wo.b("> ").b(this.f.B().f().a(n.p, n.t)).f(" <").a(n.o));
         }
      }
   }
}
