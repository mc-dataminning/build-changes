import java.util.function.Function;

public enum hks {
   a("movement", hkn::new),
   b("find_tree", hkm::new),
   c("punch_tree", hkp::new),
   d("open_inventory", hko::new),
   e("craft_planks", hkl::new),
   f("none", hkk::new);

   private final String g;
   private final Function<hkq, ? extends hkr> h;

   private <T extends hkr> hks(final String $$0, final Function<hkq, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hkr a(hkq $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hks a(String $$0) {
      for (hks $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
