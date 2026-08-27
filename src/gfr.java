public class gfr extends geo<cdg, fos<cdg>> {
   private static final aiy a = new aiy("textures/entity/wither/wither_armor.png");
   private final fos<cdg> b;

   public gfr(gcn<cdg, fos<cdg>> $$0, foy $$1) {
      super($$0);
      this.b = new fos<>($$1.a(fpb.bS));
   }

   @Override
   protected float a(float $$0) {
      return awh.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aiy a() {
      return a;
   }

   @Override
   protected fmb<cdg> b() {
      return this.b;
   }
}
