import java.util.function.Function;

public enum gsv {
   a("movement", gsq::new),
   b("find_tree", gsp::new),
   c("punch_tree", gss::new),
   d("open_inventory", gsr::new),
   e("craft_planks", gso::new),
   f("none", gsn::new);

   private final String g;
   private final Function<gst, ? extends gsu> h;

   private <T extends gsu> gsv(String $$0, Function<gst, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gsu a(gst $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gsv a(String $$0) {
      for (gsv $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
