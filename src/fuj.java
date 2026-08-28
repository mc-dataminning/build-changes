import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fuj extends fui {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String w = "shoulder_stick";
   private static final String x = "base_plate";
   private final fyi y;
   private final fyi z;
   private final fyi A;
   private final fyi B;

   public fuj(fyi $$0) {
      super($$0);
      this.y = $$0.b("right_body_stick");
      this.z = $$0.b("left_body_stick");
      this.A = $$0.b("shoulder_stick");
      this.B = $$0.b("base_plate");
      this.l.k = false;
   }

   public static fyo c() {
      fyq $$0 = fvv.a(fym.a, 0.0F);
      fyr $$1 = $$0.a();
      $$1.a("head", fyn.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), fyk.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", fyn.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), fyk.a);
      $$1.a("right_arm", fyn.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fyn.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fyn.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fyk.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", fyn.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fyk.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", fyn.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fyk.a);
      $$1.a("left_body_stick", fyn.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fyk.a);
      $$1.a("shoulder_stick", fyn.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), fyk.a);
      $$1.a("base_plate", fyn.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), fyk.a(0.0F, 12.0F, 0.0F));
      return fyo.a($$0, 64, 64);
   }

   public void a(ciw $$0, float $$1, float $$2, float $$3) {
      this.B.e = 0.0F;
      this.B.f = (float) (Math.PI / 180.0) * -ayo.j($$3, $$0.O, $$0.dF());
      this.B.g = 0.0F;
   }

   @Override
   public void a(ciw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.o.k = $$0.v();
      this.n.k = $$0.v();
      this.B.k = !$$0.x();
      this.y.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.y.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.y.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.z.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.z.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.z.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.A.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.A.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.A.g = (float) (Math.PI / 180.0) * $$0.B().d();
   }

   @Override
   protected Iterable<fyi> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.y, this.z, this.A, this.B));
   }

   @Override
   public void a(btg $$0, fbg $$1) {
      fyi $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
