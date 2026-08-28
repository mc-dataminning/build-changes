import java.util.Set;

public class ggu extends ggo<hdh> {
   public static final gip a = new gea(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public ggu(gig $$0) {
      super($$0);
   }

   public static gim a() {
      gio $$0 = ggo.a(12, gik.a);
      giq $$1 = $$0.a();
      $$1.a("head", gil.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gii.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gil.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gii.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gim.a($$0, 64, 32);
   }

   public void a(hdh $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
