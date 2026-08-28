import java.util.Set;

public class gdq extends gdk<hab> {
   public static final gfl a = new gaz(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gdq(gfc $$0) {
      super($$0);
   }

   public static gfi a() {
      gfk $$0 = gdk.a(12, gfg.a);
      gfm $$1 = $$0.a();
      $$1.a("head", gfh.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), gfe.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gfh.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), gfe.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return gfi.a($$0, 64, 32);
   }

   public void a(hab $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
