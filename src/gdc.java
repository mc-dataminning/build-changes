import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class gdc extends fue<gdc.b> {
   private static final int a = 20;
   final gdd m;
   private int n;

   public gdc(gdd $$0, fqq $$1) {
      super($$1, $$0.n, $$0.s.d(), $$0.s.c(), 20);
      this.m = $$0;
      fqo[] $$2 = (fqo[])ArrayUtils.clone($$1.n.V);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fqo $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new gdc.a(xg.c($$5)));
         }

         xg $$6 = xg.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new gdc.c($$4, $$6));
      }
   }

   public void b() {
      fqo.d();
      this.c();
   }

   public void c() {
      this.aJ_().forEach(gdc.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends gdc.b {
      final xg b;
      private final int c;

      public a(final xg $$1) {
         this.b = $$1;
         this.c = gdc.this.c.h.a(this.b);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(gdc.this.c.h, this.b, gdc.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public fth a(fyb $$0) {
         return null;
      }

      @Override
      public List<? extends fvv> aJ_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends fxt> b() {
         return ImmutableList.of(new fxt() {
            @Override
            public fxt.a w() {
               return fxt.a.b;
            }

            @Override
            public void b(fxv $$0) {
               $$0.a(fxu.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fue.a<gdc.b> {
      abstract void c();
   }

   public class c extends gdc.b {
      private static final xg b = xg.c("controls.reset");
      private static final int c = 10;
      private final fqo d;
      private final xg e;
      private final fty f;
      private final fty g;
      private boolean h = false;

      c(final fqo $$1, final xg $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fty.a($$2, $$1x -> {
            gdc.this.m.a = $$1;
            gdc.this.b();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xg.a("narrator.controls.unbound", $$2) : xg.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fty.a(b, $$1x -> {
            $$1.b($$1.i());
            gdc.this.b();
         }).a(0, 0, 50, 20).a($$1x -> xg.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = gdc.this.l() - this.g.A() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.A();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(gdc.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.F() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fvv> aJ_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends fxt> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         xu $$0 = xg.i();
         if (!this.d.j()) {
            for (fqo $$1 : gdc.this.c.n.V) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xg.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xg.b("[ ").b(this.f.B().f().a(o.p)).f(" ]").a(o.m));
            this.f.a(fvj.a(xg.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (gdc.this.m.a == this.d) {
            this.f.b(xg.b("> ").b(this.f.B().f().a(o.p, o.t)).f(" <").a(o.o));
         }
      }
   }
}
