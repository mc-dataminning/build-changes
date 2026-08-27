public class gfo extends gca<cjc> {
   public static final ajh a = new ajh("textures/entity/projectiles/arrow.png");
   public static final ajh f = new ajh("textures/entity/projectiles/tipped_arrow.png");

   public gfo(gdb.a $$0) {
      super($$0);
   }

   public ajh a(cjc $$0) {
      return $$0.G() > 0 ? f : a;
   }
}
