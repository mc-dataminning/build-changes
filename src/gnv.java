import java.util.function.Function;

public enum gnv {
   a("movement", gnq::new),
   b("find_tree", gnp::new),
   c("punch_tree", gns::new),
   d("open_inventory", gnr::new),
   e("craft_planks", gno::new),
   f("none", gnn::new);

   private final String g;
   private final Function<gnt, ? extends gnu> h;

   private <T extends gnu> gnv(String $$0, Function<gnt, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gnu a(gnt $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gnv a(String $$0) {
      for (gnv $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
