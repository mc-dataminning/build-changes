import java.util.Set;

public class gda extends gcu<gzl> {
   public static final gev a = new gal(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public gda(gem $$0) {
      super($$0);
   }

   public static ges a() {
      geu $$0 = gcu.a(12, geq.a);
      gew $$1 = $$0.a();
      $$1.a("head", ger.c().a(0, 0).a(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), geo.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", ger.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), geo.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      return ges.a($$0, 64, 32);
   }

   public void a(gzl $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ab;
      this.b.e = $$0.b;
   }
}
