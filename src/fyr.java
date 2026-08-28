import org.joml.Quaternionf;

public class fyr<T extends gvb> extends fyb<T> {
   private static final String a = "cape";
   private final gaq b = this.q.b("cape");

   public fyr(gaq $$0) {
      super($$0);
   }

   public static gaw a() {
      gay $$0 = fyb.a(gau.a, 0.0F);
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("head");
      $$2.a("hat");
      gba $$3 = $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      $$3.a("cape", gav.c().a(0, 0).a(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 1.0F, gau.a, 1.0F, 0.5F), gas.a(0.0F, 0.0F, 3.0F, 0.0F, (float) Math.PI, 0.0F));
      return gaw.a($$0, 64, 64);
   }

   public void a(T $$0) {
      super.a($$0);
      if (!$$0.Q.f()) {
         this.b.d++;
         this.b.c -= 0.85F;
      }

      this.b
         .a(
            new Quaternionf()
               .rotationX((6.0F + $$0.c / 2.0F + $$0.b) * (float) (Math.PI / 180.0))
               .rotateZ($$0.d / 2.0F * (float) (Math.PI / 180.0))
               .rotateY(-$$0.d / 2.0F * (float) (Math.PI / 180.0))
         );
   }
}
