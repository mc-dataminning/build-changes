import java.util.Map;

public class gmv {
   public static final gmv a = new gmv(Map.of());
   private final Map<djm, hdw<?>> b;

   public gmv(Map<djm, hdw<?>> $$0) {
      this.b = $$0;
   }

   public static gmv a(gez $$0) {
      return new gmv(hdx.a($$0));
   }

   public void a(djm $$0, cwn $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      hdw<?> $$6 = this.b.get($$0);
      if ($$6 != null) {
         $$6.a(null, $$1, $$2, $$3, $$4, $$5, false);
      }
   }
}
