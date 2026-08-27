import com.google.common.collect.ImmutableList;

public class fxc<T extends brv> extends fuk<T> {
   protected final fys a;
   protected final fys b;
   protected final fys f;
   protected final fys g;
   protected final fys h;
   protected final fys i;

   protected fxc(fys $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, (float)$$6);
      this.a = $$0.b("head");
      this.b = $$0.b("body");
      this.f = $$0.b("right_hind_leg");
      this.g = $$0.b("left_hind_leg");
      this.h = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
   }

   public static fza a(int $$0, fyw $$1) {
      fza $$2 = new fza();
      fzb $$3 = $$2.a();
      $$3.a("head", fyx.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), fyu.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", fyx.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), fyu.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fyx $$4 = fyx.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, fyu.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, fyu.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, fyu.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, fyu.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   @Override
   protected Iterable<fys> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fys> b() {
      return ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.e = $$5 * (float) (Math.PI / 180.0);
      this.a.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = aym.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = aym.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = aym.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = aym.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
