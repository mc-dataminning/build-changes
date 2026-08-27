import java.util.function.Function;

public enum ghl {
   a("movement", ghg::new),
   b("find_tree", ghf::new),
   c("punch_tree", ghi::new),
   d("open_inventory", ghh::new),
   e("craft_planks", ghe::new),
   f("none", ghd::new);

   private final String g;
   private final Function<ghj, ? extends ghk> h;

   private <T extends ghk> ghl(String $$0, Function<ghj, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public ghk a(ghj $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static ghl a(String $$0) {
      for (ghl $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
