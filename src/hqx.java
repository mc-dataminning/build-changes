import java.util.function.Function;

public enum hqx {
   a("movement", hqs::new),
   b("find_tree", hqr::new),
   c("punch_tree", hqu::new),
   d("open_inventory", hqt::new),
   e("craft_planks", hqq::new),
   f("none", hqp::new);

   private final String g;
   private final Function<hqv, ? extends hqw> h;

   private <T extends hqw> hqx(final String $$0, final Function<hqv, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hqw a(hqv $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hqx a(String $$0) {
      for (hqx $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
