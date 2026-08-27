import java.util.function.Function;

public enum gro {
   a("movement", grj::new),
   b("find_tree", gri::new),
   c("punch_tree", grl::new),
   d("open_inventory", grk::new),
   e("craft_planks", grh::new),
   f("none", grg::new);

   private final String g;
   private final Function<grm, ? extends grn> h;

   private <T extends grn> gro(String $$0, Function<grm, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public grn a(grm $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gro a(String $$0) {
      for (gro $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
