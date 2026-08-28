import java.util.function.Function;

public enum hpy {
   a("movement", hpt::new),
   b("find_tree", hps::new),
   c("punch_tree", hpv::new),
   d("open_inventory", hpu::new),
   e("craft_planks", hpr::new),
   f("none", hpq::new);

   private final String g;
   private final Function<hpw, ? extends hpx> h;

   private <T extends hpx> hpy(final String $$0, final Function<hpw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hpx a(hpw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hpy a(String $$0) {
      for (hpy $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
