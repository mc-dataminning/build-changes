import java.util.function.Function;

public enum gvg {
   a("movement", gvb::new),
   b("find_tree", gva::new),
   c("punch_tree", gvd::new),
   d("open_inventory", gvc::new),
   e("craft_planks", guz::new),
   f("none", guy::new);

   private final String g;
   private final Function<gve, ? extends gvf> h;

   private <T extends gvf> gvg(final String $$0, final Function<gve, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gvf a(gve $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gvg a(String $$0) {
      for (gvg $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
