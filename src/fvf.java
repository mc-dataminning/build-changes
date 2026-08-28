import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvf extends fwf {
   private static final wv a = wv.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fub c = new fub(this);
   private final fwf d;
   private final Consumer<js<dis>> s;
   final kf<dis> u;
   private fvf.a v;
   js<dis> w;
   private fqn x;

   public fvf(fwf $$0, gbq $$1, Consumer<js<dis>> $$2) {
      super(wv.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(me.aM);
      js<dis> $$3 = this.u.a(diz.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   @Override
   protected void aN_() {
      fuf $$0 = this.c.a(fuf.d().a(8));
      $$0.c().b();
      $$0.a(new fru(this.n(), this.p));
      $$0.a(new fru(a, this.p));
      this.v = this.c.c(new fvf.a());
      fuf $$1 = this.c.b(fuf.e().a(8));
      this.x = $$1.a(fqn.a(wu.d, $$0x -> {
         this.s.accept(this.w);
         this.aK_();
      }).a());
      $$1.a(fqn.a(wu.e, $$0x -> this.aK_()).a());
      this.v.a(this.v.aD_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends frj<fvf.a.a> {
      a() {
         super(fvf.this.m, fvf.this.n, fvf.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fvf.this.u.c().map($$0x -> new fvf.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fvf.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fvf.this.w = $$0.b;
         }

         fvf.this.m();
      }

      class a extends frj.a<fvf.a.a> {
         final js.c<dis> b;
         final wv c;

         public a(final js.c<dis> $$0) {
            this.b = $$0;
            ald $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tr.a().b($$2)) {
               this.c = wv.c($$2);
            } else {
               this.c = wv.b($$1.toString());
            }
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", this.c);
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fvf.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
