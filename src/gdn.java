public class gdn extends gaa<cht> {
   public static final aiy a = new aiy("textures/entity/projectiles/arrow.png");
   public static final aiy f = new aiy("textures/entity/projectiles/tipped_arrow.png");

   public gdn(gba.a $$0) {
      super($$0);
   }

   public aiy a(cht $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
