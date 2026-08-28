import java.util.Set;

public class fza extends gat<gwm> {
   public static final gcu a = new fyl(false, 10.0F, 4.0F, Set.of("head"));

   public fza(gcl $$0) {
      super($$0);
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      int $$2 = 12;
      $$1.a(
         "head",
         gcq.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .a(22, 0)
            .a("right_horn", -5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F)
            .a(22, 0)
            .a("left_horn", 4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F),
         gcn.a(0.0F, 4.0F, -8.0F)
      );
      $$1.a(
         "body",
         gcq.c().a(18, 4).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).a(52, 0).a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         gcn.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      gcq $$3 = gcq.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      $$1.a("right_hind_leg", $$3, gcn.a(-4.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$3, gcn.a(4.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$3, gcn.a(-4.0F, 12.0F, -6.0F));
      $$1.a("left_front_leg", $$3, gcn.a(4.0F, 12.0F, -6.0F));
      return gcr.a($$0, 64, 32);
   }

   public gcl b() {
      return this.b;
   }
}
