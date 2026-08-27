import java.util.function.Function;

public enum gah {
   a("movement", gac::new),
   b("find_tree", gab::new),
   c("punch_tree", gae::new),
   d("open_inventory", gad::new),
   e("craft_planks", gaa::new),
   f("none", fzz::new);

   private final String g;
   private final Function<gaf, ? extends gag> h;

   private <T extends gag> gah(String $$0, Function<gaf, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gag a(gaf $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gah a(String $$0) {
      for (gah $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
