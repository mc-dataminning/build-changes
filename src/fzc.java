import org.joml.Quaternionf;

public class fzc<T extends gvn> extends fym<T> {
   private static final String a = "cape";
   private final gbb b = this.q.b("cape");

   public fzc(gbb $$0) {
      super($$0);
   }

   public static gbh a() {
      gbj $$0 = fym.a(gbf.a, 0.0F);
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("head");
      $$2.a("hat");
      gbl $$3 = $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      $$3.a("cape", gbg.c().a(0, 0).a(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 1.0F, gbf.a, 1.0F, 0.5F), gbd.a(0.0F, 0.0F, 3.0F, 0.0F, (float) Math.PI, 0.0F));
      return gbh.a($$0, 64, 64);
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
