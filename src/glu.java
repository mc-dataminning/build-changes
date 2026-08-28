public class glu extends gif<cmp> {
   public static final akk a = new akk("textures/entity/projectiles/arrow.png");
   public static final akk f = new akk("textures/entity/projectiles/tipped_arrow.png");

   public glu(gjg.a $$0) {
      super($$0);
   }

   public akk a(cmp $$0) {
      return $$0.H() > 0 ? f : a;
   }
}
