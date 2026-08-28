import java.util.function.Function;

public enum gwi {
   a("movement", gwd::new),
   b("find_tree", gwc::new),
   c("punch_tree", gwf::new),
   d("open_inventory", gwe::new),
   e("craft_planks", gwb::new),
   f("none", gwa::new);

   private final String g;
   private final Function<gwg, ? extends gwh> h;

   private <T extends gwh> gwi(final String $$0, final Function<gwg, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gwh a(gwg $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gwi a(String $$0) {
      for (gwi $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
