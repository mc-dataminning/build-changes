import java.util.function.Function;

public enum how {
   a("movement", hor::new),
   b("find_tree", hoq::new),
   c("punch_tree", hot::new),
   d("open_inventory", hos::new),
   e("craft_planks", hop::new),
   f("none", hoo::new);

   private final String g;
   private final Function<hou, ? extends hov> h;

   private <T extends hov> how(final String $$0, final Function<hou, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hov a(hou $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static how a(String $$0) {
      for (how $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
