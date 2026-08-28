import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyq extends fzq {
   private static final xg a = xg.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fxm c = new fxm(this);
   private final fzq d;
   private final Consumer<jg<dlm>> s;
   final jt<dlm> u;
   private fyq.a v;
   jg<dlm> w;
   private fty x;

   public fyq(fzq $$0, gfb $$1, Consumer<jg<dlm>> $$2) {
      super(xg.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().f(mi.aG);
      jg<dlm> $$3 = this.u.a(dlt.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aQ_() {
      this.m.a(this.d);
   }

   @Override
   protected void aT_() {
      fxq $$0 = this.c.a(fxq.d().a(8));
      $$0.c().b();
      $$0.a(new fvf(this.n(), this.p));
      $$0.a(new fvf(a, this.p));
      this.v = this.c.c(new fyq.a());
      fxq $$1 = this.c.b(fxq.e().a(8));
      this.x = $$1.a(fty.a(xf.d, $$0x -> {
         this.s.accept(this.w);
         this.aQ_();
      }).a());
      $$1.a(fty.a(xf.e, $$0x -> this.aQ_()).a());
      this.v.a(this.v.aJ_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends fuu<fyq.a.a> {
      a() {
         super(fyq.this.m, fyq.this.n, fyq.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fyq.this.u.c().map($$0x -> new fyq.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fyq.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fyq.this.w = $$0.b;
         }

         fyq.this.m();
      }

      class a extends fuu.a<fyq.a.a> {
         final jg.c<dlm> b;
         final xg c;

         public a(final jg.c<dlm> $$0) {
            this.b = $$0;
            alr $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tv.a().b($$2)) {
               this.c = xg.c($$2);
            } else {
               this.c = xg.b($$1.toString());
            }
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", this.c);
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fyq.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
