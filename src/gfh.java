import java.util.Map;

public class gfh implements dbw {
   private final Map<alo<dce>, dce> a;
   private final dci.b<dcv> b;

   public gfh(Map<alo<dce>, dce> $$0, dci.b<dcv> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dce a(alo<dce> $$0) {
      return this.a.getOrDefault($$0, dce.j);
   }

   @Override
   public dci.b<dcv> a() {
      return this.b;
   }
}
