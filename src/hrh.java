import java.util.function.Function;

public enum hrh {
   a("movement", hrc::new),
   b("find_tree", hrb::new),
   c("punch_tree", hre::new),
   d("open_inventory", hrd::new),
   e("craft_planks", hra::new),
   f("none", hqz::new);

   private final String g;
   private final Function<hrf, ? extends hrg> h;

   private <T extends hrg> hrh(final String $$0, final Function<hrf, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hrg a(hrf $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hrh a(String $$0) {
      for (hrh $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
