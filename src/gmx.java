import java.util.function.Function;

public enum gmx {
   a("movement", gms::new),
   b("find_tree", gmr::new),
   c("punch_tree", gmu::new),
   d("open_inventory", gmt::new),
   e("craft_planks", gmq::new),
   f("none", gmp::new);

   private final String g;
   private final Function<gmv, ? extends gmw> h;

   private <T extends gmw> gmx(String $$0, Function<gmv, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gmw a(gmv $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gmx a(String $$0) {
      for (gmx $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
