import java.util.function.Function;

public enum ger {
   a("movement", gem::new),
   b("find_tree", gel::new),
   c("punch_tree", geo::new),
   d("open_inventory", gen::new),
   e("craft_planks", gek::new),
   f("none", gej::new);

   private final String g;
   private final Function<gep, ? extends geq> h;

   private <T extends geq> ger(String $$0, Function<gep, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public geq a(gep $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static ger a(String $$0) {
      for (ger $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
