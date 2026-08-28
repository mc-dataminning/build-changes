import java.util.function.Function;

public enum hdj {
   a("movement", hde::new),
   b("find_tree", hdd::new),
   c("punch_tree", hdg::new),
   d("open_inventory", hdf::new),
   e("craft_planks", hdc::new),
   f("none", hdb::new);

   private final String g;
   private final Function<hdh, ? extends hdi> h;

   private <T extends hdi> hdj(final String $$0, final Function<hdh, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hdi a(hdh $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hdj a(String $$0) {
      for (hdj $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
