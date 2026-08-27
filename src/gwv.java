import java.util.function.Function;

public enum gwv {
   a("movement", gwq::new),
   b("find_tree", gwp::new),
   c("punch_tree", gws::new),
   d("open_inventory", gwr::new),
   e("craft_planks", gwo::new),
   f("none", gwn::new);

   private final String g;
   private final Function<gwt, ? extends gwu> h;

   private <T extends gwu> gwv(String $$0, Function<gwt, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gwu a(gwt $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gwv a(String $$0) {
      for (gwv $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
