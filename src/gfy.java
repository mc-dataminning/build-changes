import java.util.Map;

public class gfy implements dbd {
   private final Map<akt<dbl>, dbl> a;
   private final dbp.b<dcc> b;

   public gfy(Map<akt<dbl>, dbl> $$0, dbp.b<dcc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dbl a(akt<dbl> $$0) {
      return this.a.getOrDefault($$0, dbl.j);
   }

   @Override
   public dbp.b<dcc> a() {
      return this.b;
   }
}
