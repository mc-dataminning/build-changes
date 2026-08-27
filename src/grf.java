import java.util.function.Function;

public enum grf {
   a("movement", gra::new),
   b("find_tree", gqz::new),
   c("punch_tree", grc::new),
   d("open_inventory", grb::new),
   e("craft_planks", gqy::new),
   f("none", gqx::new);

   private final String g;
   private final Function<grd, ? extends gre> h;

   private <T extends gre> grf(String $$0, Function<grd, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gre a(grd $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static grf a(String $$0) {
      for (grf $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
