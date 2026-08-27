import java.util.function.Function;

public enum gjf {
   a("movement", gja::new),
   b("find_tree", giz::new),
   c("punch_tree", gjc::new),
   d("open_inventory", gjb::new),
   e("craft_planks", giy::new),
   f("none", gix::new);

   private final String g;
   private final Function<gjd, ? extends gje> h;

   private <T extends gje> gjf(String $$0, Function<gjd, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gje a(gjd $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gjf a(String $$0) {
      for (gjf $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
