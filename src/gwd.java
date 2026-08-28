import java.util.function.Function;

public enum gwd {
   a("movement", gvy::new),
   b("find_tree", gvx::new),
   c("punch_tree", gwa::new),
   d("open_inventory", gvz::new),
   e("craft_planks", gvw::new),
   f("none", gvv::new);

   private final String g;
   private final Function<gwb, ? extends gwc> h;

   private <T extends gwc> gwd(final String $$0, final Function<gwb, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gwc a(gwb $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gwd a(String $$0) {
      for (gwd $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
