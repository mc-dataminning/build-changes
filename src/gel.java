import java.util.function.Function;

public enum gel {
   a("movement", geg::new),
   b("find_tree", gef::new),
   c("punch_tree", gei::new),
   d("open_inventory", geh::new),
   e("craft_planks", gee::new),
   f("none", ged::new);

   private final String g;
   private final Function<gej, ? extends gek> h;

   private <T extends gek> gel(String $$0, Function<gej, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gek a(gej $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gel a(String $$0) {
      for (gel $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
