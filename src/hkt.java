import java.util.function.Function;

public enum hkt {
   a("movement", hko::new),
   b("find_tree", hkn::new),
   c("punch_tree", hkq::new),
   d("open_inventory", hkp::new),
   e("craft_planks", hkm::new),
   f("none", hkl::new);

   private final String g;
   private final Function<hkr, ? extends hks> h;

   private <T extends hks> hkt(final String $$0, final Function<hkr, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hks a(hkr $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hkt a(String $$0) {
      for (hkt $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
