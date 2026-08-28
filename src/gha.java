import java.util.Map;

public class gha implements dbw {
   private final Map<akt<dce>, dce> a;
   private final dci.b<dcv> b;

   public gha(Map<akt<dce>, dce> $$0, dci.b<dcv> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dce a(akt<dce> $$0) {
      return this.a.getOrDefault($$0, dce.j);
   }

   @Override
   public dci.b<dcv> a() {
      return this.b;
   }
}
