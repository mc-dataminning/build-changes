import java.util.function.Function;

public enum gkx {
   a("movement", gks::new),
   b("find_tree", gkr::new),
   c("punch_tree", gku::new),
   d("open_inventory", gkt::new),
   e("craft_planks", gkq::new),
   f("none", gkp::new);

   private final String g;
   private final Function<gkv, ? extends gkw> h;

   private <T extends gkw> gkx(String $$0, Function<gkv, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gkw a(gkv $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gkx a(String $$0) {
      for (gkx $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
