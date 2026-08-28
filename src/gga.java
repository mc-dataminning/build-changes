import java.util.Map;

public class gga implements dbf {
   private final Map<akt<dbn>, dbn> a;
   private final dbr.b<dce> b;

   public gga(Map<akt<dbn>, dbn> $$0, dbr.b<dce> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dbn a(akt<dbn> $$0) {
      return this.a.getOrDefault($$0, dbn.j);
   }

   @Override
   public dbr.b<dce> a() {
      return this.b;
   }
}
