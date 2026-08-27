import java.util.function.Function;

public enum gdx {
   a("movement", gds::new),
   b("find_tree", gdr::new),
   c("punch_tree", gdu::new),
   d("open_inventory", gdt::new),
   e("craft_planks", gdq::new),
   f("none", gdp::new);

   private final String g;
   private final Function<gdv, ? extends gdw> h;

   private <T extends gdw> gdx(String $$0, Function<gdv, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gdw a(gdv $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gdx a(String $$0) {
      for (gdx $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
