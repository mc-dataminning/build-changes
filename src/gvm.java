import java.util.function.Function;

public enum gvm {
   a("movement", gvh::new),
   b("find_tree", gvg::new),
   c("punch_tree", gvj::new),
   d("open_inventory", gvi::new),
   e("craft_planks", gvf::new),
   f("none", gve::new);

   private final String g;
   private final Function<gvk, ? extends gvl> h;

   private <T extends gvl> gvm(final String $$0, final Function<gvk, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gvl a(gvk $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gvm a(String $$0) {
      for (gvm $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
