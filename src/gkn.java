import java.util.Map;

public class gkn implements dec {
   private final Map<alf<dek>, dek> a;
   private final deo.b<dfb> b;

   public gkn(Map<alf<dek>, dek> $$0, deo.b<dfb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dek a(alf<dek> $$0) {
      return this.a.getOrDefault($$0, dek.j);
   }

   @Override
   public deo.b<dfb> a() {
      return this.b;
   }
}
