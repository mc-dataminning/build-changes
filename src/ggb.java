import java.util.Map;

public class ggb implements dbf {
   private final Map<aku<dbn>, dbn> a;
   private final dbr.b<dce> b;

   public ggb(Map<aku<dbn>, dbn> $$0, dbr.b<dce> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dbn a(aku<dbn> $$0) {
      return this.a.getOrDefault($$0, dbn.j);
   }

   @Override
   public dbr.b<dce> a() {
      return this.b;
   }
}
