import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwu extends fxu {
   private static final wy a = wy.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fvq c = new fvq(this);
   private final fxu d;
   private final Consumer<je<djy>> s;
   final jr<djy> u;
   private fwu.a v;
   je<djy> w;
   private fsc x;

   public fwu(fxu $$0, gdf $$1, Consumer<je<djy>> $$2) {
      super(wy.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mg.aG);
      je<djy> $$3 = this.u.a(dkf.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   @Override
   protected void aN_() {
      fvu $$0 = this.c.a(fvu.d().a(8));
      $$0.c().b();
      $$0.a(new ftj(this.n(), this.p));
      $$0.a(new ftj(a, this.p));
      this.v = this.c.c(new fwu.a());
      fvu $$1 = this.c.b(fvu.e().a(8));
      this.x = $$1.a(fsc.a(wx.d, $$0x -> {
         this.s.accept(this.w);
         this.aK_();
      }).a());
      $$1.a(fsc.a(wx.e, $$0x -> this.aK_()).a());
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

   class a extends fsy<fwu.a.a> {
      a() {
         super(fwu.this.m, fwu.this.n, fwu.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fwu.this.u.c().map($$0x -> new fwu.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fwu.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fwu.this.w = $$0.b;
         }

         fwu.this.m();
      }

      class a extends fsy.a<fwu.a.a> {
         final je.c<djy> b;
         final wy c;

         public a(final je.c<djy> $$0) {
            this.b = $$0;
            alg $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tu.a().b($$2)) {
               this.c = wy.c($$2);
            } else {
               this.c = wy.b($$1.toString());
            }
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.c);
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fwu.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
