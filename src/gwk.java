import java.util.function.Function;

public enum gwk {
   a("movement", gwf::new),
   b("find_tree", gwe::new),
   c("punch_tree", gwh::new),
   d("open_inventory", gwg::new),
   e("craft_planks", gwd::new),
   f("none", gwc::new);

   private final String g;
   private final Function<gwi, ? extends gwj> h;

   private <T extends gwj> gwk(final String $$0, final Function<gwi, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gwj a(gwi $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gwk a(String $$0) {
      for (gwk $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
