import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwi extends fxi {
   private static final ww a = ww.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fve c = new fve(this);
   private final fxi d;
   private final Consumer<je<djs>> s;
   final jr<djs> u;
   private fwi.a v;
   je<djs> w;
   private frq x;

   public fwi(fxi $$0, gct $$1, Consumer<je<djs>> $$2) {
      super(ww.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mg.aG);
      je<djs> $$3 = this.u.a(djz.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   @Override
   protected void aN_() {
      fvi $$0 = this.c.a(fvi.d().a(8));
      $$0.c().b();
      $$0.a(new fsx(this.n(), this.p));
      $$0.a(new fsx(a, this.p));
      this.v = this.c.c(new fwi.a());
      fvi $$1 = this.c.b(fvi.e().a(8));
      this.x = $$1.a(frq.a(wv.d, $$0x -> {
         this.s.accept(this.w);
         this.aK_();
      }).a());
      $$1.a(frq.a(wv.e, $$0x -> this.aK_()).a());
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

   class a extends fsm<fwi.a.a> {
      a() {
         super(fwi.this.m, fwi.this.n, fwi.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fwi.this.u.c().map($$0x -> new fwi.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fwi.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fwi.this.w = $$0.b;
         }

         fwi.this.m();
      }

      class a extends fsm.a<fwi.a.a> {
         final je.c<djs> b;
         final ww c;

         public a(final je.c<djs> $$0) {
            this.b = $$0;
            ale $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ts.a().b($$2)) {
               this.c = ww.c($$2);
            } else {
               this.c = ww.b($$1.toString());
            }
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", this.c);
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fwi.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
