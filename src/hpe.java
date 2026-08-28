import java.util.function.Function;

public enum hpe {
   a("movement", hoz::new),
   b("find_tree", hoy::new),
   c("punch_tree", hpb::new),
   d("open_inventory", hpa::new),
   e("craft_planks", hox::new),
   f("none", how::new);

   private final String g;
   private final Function<hpc, ? extends hpd> h;

   private <T extends hpd> hpe(final String $$0, final Function<hpc, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hpd a(hpc $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hpe a(String $$0) {
      for (hpe $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
