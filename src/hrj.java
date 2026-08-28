import java.util.function.Function;

public enum hrj {
   a("movement", hre::new),
   b("find_tree", hrd::new),
   c("punch_tree", hrg::new),
   d("open_inventory", hrf::new),
   e("craft_planks", hrc::new),
   f("none", hrb::new);

   private final String g;
   private final Function<hrh, ? extends hri> h;

   private <T extends hri> hrj(final String $$0, final Function<hrh, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hri a(hrh $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hrj a(String $$0) {
      for (hrj $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
