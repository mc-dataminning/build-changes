import org.joml.Quaternionf;

public class gdf<T extends gzx> extends gcp<T> {
   private static final String a = "cape";
   private final gfe b = this.q.b("cape");

   public gdf(gfe $$0) {
      super($$0);
   }

   public static gfk a() {
      gfm $$0 = gcp.a(gfi.a, 0.0F);
      gfo $$1 = $$0.a();
      gfo $$2 = $$1.a("head");
      $$2.a("hat");
      gfo $$3 = $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      $$3.a("cape", gfj.c().a(0, 0).a(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, gfi.a, 1.0F, 0.5F), gfg.a(0.0F, 0.0F, 2.0F, 0.0F, (float) Math.PI, 0.0F));
      return gfk.a($$0, 64, 64);
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
