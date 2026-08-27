import java.util.function.Function;

public enum gmq {
   a("movement", gml::new),
   b("find_tree", gmk::new),
   c("punch_tree", gmn::new),
   d("open_inventory", gmm::new),
   e("craft_planks", gmj::new),
   f("none", gmi::new);

   private final String g;
   private final Function<gmo, ? extends gmp> h;

   private <T extends gmp> gmq(String $$0, Function<gmo, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gmp a(gmo $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gmq a(String $$0) {
      for (gmq $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
