import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzd extends gad {
   private static final xa a = xa.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fxz c = new fxz(this);
   private final gad d;
   private final Consumer<jf<dla>> s;
   final js<dla> u;
   private fzd.a v;
   jf<dla> w;
   private ful x;

   public fzd(gad $$0, gfo $$1, Consumer<jf<dla>> $$2) {
      super(xa.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mh.aG);
      jf<dla> $$3 = this.u.a(dlh.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aS_() {
      fyd $$0 = this.c.a(fyd.d().a(8));
      $$0.c().b();
      $$0.a(new fvs(this.n(), this.p));
      $$0.a(new fvs(a, this.p));
      this.v = this.c.c(new fzd.a());
      fyd $$1 = this.c.b(fyd.e().a(8));
      this.x = $$1.a(ful.a(wz.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(ful.a(wz.e, $$0x -> this.aP_()).a());
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

   class a extends fvh<fzd.a.a> {
      a() {
         super(fzd.this.m, fzd.this.n, fzd.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fzd.this.u.c().map($$0x -> new fzd.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fzd.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fzd.this.w = $$0.b;
         }

         fzd.this.m();
      }

      class a extends fvh.a<fzd.a.a> {
         final jf.c<dla> b;
         final xa c;

         public a(final jf.c<dla> $$0) {
            this.b = $$0;
            ali $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tu.a().b($$2)) {
               this.c = xa.c($$2);
            } else {
               this.c = xa.b($$1.toString());
            }
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", this.c);
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fzd.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
