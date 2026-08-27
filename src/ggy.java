import java.util.function.Function;

public enum ggy {
   a("movement", ggt::new),
   b("find_tree", ggs::new),
   c("punch_tree", ggv::new),
   d("open_inventory", ggu::new),
   e("craft_planks", ggr::new),
   f("none", ggq::new);

   private final String g;
   private final Function<ggw, ? extends ggx> h;

   private <T extends ggx> ggy(String $$0, Function<ggw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public ggx a(ggw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static ggy a(String $$0) {
      for (ggy $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
