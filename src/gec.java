import java.util.function.Function;

public enum gec {
   a("movement", gdx::new),
   b("find_tree", gdw::new),
   c("punch_tree", gdz::new),
   d("open_inventory", gdy::new),
   e("craft_planks", gdv::new),
   f("none", gdu::new);

   private final String g;
   private final Function<gea, ? extends geb> h;

   private <T extends geb> gec(String $$0, Function<gea, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public geb a(gea $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gec a(String $$0) {
      for (gec $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
