import org.joml.Quaternionf;

public class gci<T extends gyz> extends gbs<T> {
   private static final String a = "cape";
   private final geh b = this.q.b("cape");

   public gci(geh $$0) {
      super($$0);
   }

   public static gen a() {
      gep $$0 = gbs.a(gel.a, 0.0F);
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("head");
      $$2.a("hat");
      ger $$3 = $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      $$3.a("cape", gem.c().a(0, 0).a(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, gel.a, 1.0F, 0.5F), gej.a(0.0F, 0.0F, 2.0F, 0.0F, (float) Math.PI, 0.0F));
      return gen.a($$0, 64, 64);
   }

   public void a(T $$0) {
      super.a($$0);
      this.b
         .a(
            new Quaternionf()
               .rotateY((float) -Math.PI)
               .rotateX((6.0F + $$0.c / 2.0F + $$0.b) * (float) (Math.PI / 180.0))
               .rotateZ($$0.d / 2.0F * (float) (Math.PI / 180.0))
               .rotateY((180.0F - $$0.d / 2.0F) * (float) (Math.PI / 180.0))
         );
   }
}
