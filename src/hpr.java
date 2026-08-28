import java.util.function.Function;

public enum hpr {
   a("movement", hpm::new),
   b("find_tree", hpl::new),
   c("punch_tree", hpo::new),
   d("open_inventory", hpn::new),
   e("craft_planks", hpk::new),
   f("none", hpj::new);

   private final String g;
   private final Function<hpp, ? extends hpq> h;

   private <T extends hpq> hpr(final String $$0, final Function<hpp, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hpq a(hpp $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hpr a(String $$0) {
      for (hpr $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
