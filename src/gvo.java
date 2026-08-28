import java.util.function.Function;

public enum gvo {
   a("movement", gvj::new),
   b("find_tree", gvi::new),
   c("punch_tree", gvl::new),
   d("open_inventory", gvk::new),
   e("craft_planks", gvh::new),
   f("none", gvg::new);

   private final String g;
   private final Function<gvm, ? extends gvn> h;

   private <T extends gvn> gvo(final String $$0, final Function<gvm, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gvn a(gvm $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gvo a(String $$0) {
      for (gvo $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
