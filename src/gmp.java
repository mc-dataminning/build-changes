import java.util.function.Function;

public enum gmp {
   a("movement", gmk::new),
   b("find_tree", gmj::new),
   c("punch_tree", gmm::new),
   d("open_inventory", gml::new),
   e("craft_planks", gmi::new),
   f("none", gmh::new);

   private final String g;
   private final Function<gmn, ? extends gmo> h;

   private <T extends gmo> gmp(String $$0, Function<gmn, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gmo a(gmn $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gmp a(String $$0) {
      for (gmp $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
