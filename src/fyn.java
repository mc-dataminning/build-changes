import org.joml.Quaternionf;

public class fyn<T extends guw> extends fxx<T> {
   private static final String a = "cape";
   private final gal b = this.q.b("cape");

   public fyn(gal $$0) {
      super($$0);
   }

   public static gar b() {
      gat $$0 = fxx.a(gap.a, 0.0F);
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("head");
      $$2.a("hat");
      gav $$3 = $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      $$3.a("cape", gaq.c().a(0, 0).a(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 1.0F, gap.a, 1.0F, 0.5F), gan.a(0.0F, 0.0F, 3.0F, 0.0F, (float) Math.PI, 0.0F));
      return gar.a($$0, 64, 64);
   }

   public void a(T $$0) {
      super.a($$0);
      this.b.c();
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
