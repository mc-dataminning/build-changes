import java.util.Map;

public class gga implements dbe {
   private final Map<aku<dbm>, dbm> a;
   private final dbq.b<dcd> b;

   public gga(Map<aku<dbm>, dbm> $$0, dbq.b<dcd> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dbm a(aku<dbm> $$0) {
      return this.a.getOrDefault($$0, dbm.j);
   }

   @Override
   public dbq.b<dcd> a() {
      return this.b;
   }
}
