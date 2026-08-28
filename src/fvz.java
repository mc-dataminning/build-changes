import com.google.common.collect.ImmutableList;

public class fvz<T extends cgx> extends fsq<T> {
   private final fwv a;
   private final fwv b;

   public fvz(fwv $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fxb c() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", fxa.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), fwx.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", fxa.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), fwx.a(0.0F, 22.0F, 0.0F));
      return fxb.a($$0, 16, 16);
   }

   @Override
   protected Iterable<fwv> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fwv> b() {
      return ImmutableList.of(this.b);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$0.be() ? 1.0F : 1.5F;
      this.b.f = -$$6 * 0.25F * ayu.a(0.3F * $$3);
   }
}
