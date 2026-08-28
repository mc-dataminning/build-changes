import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fxs extends fys {
   private static final wy a = wy.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fwo c = new fwo(this);
   private final fys d;
   private final Consumer<jf<dkp>> s;
   final js<dkp> u;
   private fxs.a v;
   jf<dkp> w;
   private fta x;

   public fxs(fys $$0, ged $$1, Consumer<jf<dkp>> $$2) {
      super(wy.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mh.aG);
      jf<dkp> $$3 = this.u.a(dkw.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aL_() {
      this.m.a(this.d);
   }

   @Override
   protected void aO_() {
      fws $$0 = this.c.a(fws.d().a(8));
      $$0.c().b();
      $$0.a(new fuh(this.n(), this.p));
      $$0.a(new fuh(a, this.p));
      this.v = this.c.c(new fxs.a());
      fws $$1 = this.c.b(fws.e().a(8));
      this.x = $$1.a(fta.a(wx.d, $$0x -> {
         this.s.accept(this.w);
         this.aL_();
      }).a());
      $$1.a(fta.a(wx.e, $$0x -> this.aL_()).a());
      this.v.a(this.v.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends ftw<fxs.a.a> {
      a() {
         super(fxs.this.m, fxs.this.n, fxs.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fxs.this.u.c().map($$0x -> new fxs.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fxs.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fxs.this.w = $$0.b;
         }

         fxs.this.m();
      }

      class a extends ftw.a<fxs.a.a> {
         final jf.c<dkp> b;
         final wy c;

         public a(final jf.c<dkp> $$0) {
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
         public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fxs.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
