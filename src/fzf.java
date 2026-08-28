import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzf extends gaf {
   private static final xc a = xc.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fyb c = new fyb(this);
   private final gaf d;
   private final Consumer<jg<dlc>> s;
   final jt<dlc> u;
   private fzf.a v;
   jg<dlc> w;
   private fun x;

   public fzf(gaf $$0, gfq $$1, Consumer<jg<dlc>> $$2) {
      super(xc.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mi.aG);
      jg<dlc> $$3 = this.u.a(dlj.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aS_() {
      fyf $$0 = this.c.a(fyf.d().a(8));
      $$0.c().b();
      $$0.a(new fvu(this.n(), this.p));
      $$0.a(new fvu(a, this.p));
      this.v = this.c.c(new fzf.a());
      fyf $$1 = this.c.b(fyf.e().a(8));
      this.x = $$1.a(fun.a(xb.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(fun.a(xb.e, $$0x -> this.aP_()).a());
      this.v.a(this.v.aI_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends fvj<fzf.a.a> {
      a() {
         super(fzf.this.m, fzf.this.n, fzf.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fzf.this.u.c().map($$0x -> new fzf.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fzf.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fzf.this.w = $$0.b;
         }

         fzf.this.m();
      }

      class a extends fvj.a<fzf.a.a> {
         final jg.c<dlc> b;
         final xc c;

         public a(final jg.c<dlc> $$0) {
            this.b = $$0;
            alk $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tv.a().b($$2)) {
               this.c = xc.c($$2);
            } else {
               this.c = xc.b($$1.toString());
            }
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", this.c);
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fzf.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
