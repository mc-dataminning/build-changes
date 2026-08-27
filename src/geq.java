import java.util.function.Function;

public enum geq {
   a("movement", gel::new),
   b("find_tree", gek::new),
   c("punch_tree", gen::new),
   d("open_inventory", gem::new),
   e("craft_planks", gej::new),
   f("none", gei::new);

   private final String g;
   private final Function<geo, ? extends gep> h;

   private <T extends gep> geq(String $$0, Function<geo, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gep a(geo $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static geq a(String $$0) {
      for (geq $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
