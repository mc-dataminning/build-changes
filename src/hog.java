import java.util.function.Function;

public enum hog {
   a("movement", hob::new),
   b("find_tree", hoa::new),
   c("punch_tree", hod::new),
   d("open_inventory", hoc::new),
   e("craft_planks", hnz::new),
   f("none", hny::new);

   private final String g;
   private final Function<hoe, ? extends hof> h;

   private <T extends hof> hog(final String $$0, final Function<hoe, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hof a(hoe $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hog a(String $$0) {
      for (hog $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
