import java.util.function.Function;

public enum hcn {
   a("movement", hci::new),
   b("find_tree", hch::new),
   c("punch_tree", hck::new),
   d("open_inventory", hcj::new),
   e("craft_planks", hcg::new),
   f("none", hcf::new);

   private final String g;
   private final Function<hcl, ? extends hcm> h;

   private <T extends hcm> hcn(final String $$0, final Function<hcl, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hcm a(hcl $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hcn a(String $$0) {
      for (hcn $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
