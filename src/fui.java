import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fui extends fvi {
   private static final wp a = wp.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fte c = new fte(this);
   private final fvi d;
   private final Consumer<jr<dic>> s;
   final ke<dic> u;
   private fui.a v;
   jr<dic> w;
   private fpq x;

   public fui(fvi $$0, gar $$1, Consumer<jr<dic>> $$2) {
      super(wp.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mc.aJ);
      jr<dic> $$3 = this.u.a(dij.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   protected void aR_() {
      fti $$0 = this.c.a(fti.d().a(8));
      $$0.c().b();
      $$0.a(new fqx(this.n(), this.p));
      $$0.a(new fqx(a, this.p));
      this.v = this.c.c(new fui.a());
      fti $$1 = this.c.b(fti.e().a(8));
      this.x = $$1.a(fpq.a(wo.d, $$0x -> {
         this.s.accept(this.w);
         this.aO_();
      }).a());
      $$1.a(fpq.a(wo.e, $$0x -> this.aO_()).a());
      this.v.a(this.v.aH_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.v.a(this.n, this.c);
   }

   void m() {
      this.x.j = this.v.p() != null;
   }

   class a extends fqm<fui.a.a> {
      a() {
         super(fui.this.m, fui.this.n, fui.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fui.this.u.c().map($$0x -> new fui.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fui.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fui.this.w = $$0.b;
         }

         fui.this.m();
      }

      class a extends fqm.a<fui.a.a> {
         final jr.c<dic> b;
         final wp c;

         public a(final jr.c<dic> $$0) {
            this.b = $$0;
            aku $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tl.a().b($$2)) {
               this.c = wp.c($$2);
            } else {
               this.c = wp.b($$1.toString());
            }
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", this.c);
         }

         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fui.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
