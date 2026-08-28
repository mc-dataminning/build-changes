import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fxs<T extends cgf> extends fwu<T> {
   private static final String j = "egg_belly";
   private final fyk k;

   public fxs(fyk $$0) {
      super($$0, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.k = $$0.b("egg_belly");
   }

   public static fyq c() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      $$1.a("head", fyp.c().a(3, 0).a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), fym.a(0.0F, 19.0F, -10.0F));
      $$1.a(
         "body",
         fyp.c().a(7, 37).a("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).a(31, 1).a("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         fym.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("egg_belly", fyp.c().a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), fym.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 1;
      $$1.a("right_hind_leg", fyp.c().a(1, 23).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), fym.a(-3.5F, 22.0F, 11.0F));
      $$1.a("left_hind_leg", fyp.c().a(1, 12).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), fym.a(3.5F, 22.0F, 11.0F));
      $$1.a("right_front_leg", fyp.c().a(27, 30).a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), fym.a(-5.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", fyp.c().a(27, 24).a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), fym.a(5.0F, 21.0F, -4.0F));
      return fyq.a($$0, 128, 64);
   }

   @Override
   protected Iterable<fyk> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.k));
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.f.e = ayo.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.g.e = ayo.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.h.g = ayo.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.i.g = ayo.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.h.e = 0.0F;
      this.i.e = 0.0F;
      this.h.f = 0.0F;
      this.i.f = 0.0F;
      this.f.f = 0.0F;
      this.g.f = 0.0F;
      if (!$$0.bf() && $$0.aF()) {
         float $$6 = $$0.t() ? 4.0F : 1.0F;
         float $$7 = $$0.t() ? 2.0F : 1.0F;
         float $$8 = 5.0F;
         this.h.f = ayo.b($$6 * $$1 * 5.0F + (float) Math.PI) * 8.0F * $$2 * $$7;
         this.h.g = 0.0F;
         this.i.f = ayo.b($$6 * $$1 * 5.0F) * 8.0F * $$2 * $$7;
         this.i.g = 0.0F;
         this.f.f = ayo.b($$1 * 5.0F + (float) Math.PI) * 3.0F * $$2;
         this.f.e = 0.0F;
         this.g.f = ayo.b($$1 * 5.0F) * 3.0F * $$2;
         this.g.e = 0.0F;
      }

      this.k.k = !this.e && $$0.s();
   }

   @Override
   public void a(fbi $$0, fbm $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = this.k.k;
      if ($$5) {
         $$0.a();
         $$0.a(0.0F, -0.08F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$5) {
         $$0.b();
      }
   }
}
