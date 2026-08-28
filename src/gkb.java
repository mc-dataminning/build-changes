import java.util.Map;

public class gkb implements ddv {
   private final Map<alf<ded>, ded> a;
   private final deh.b<deu> b;

   public gkb(Map<alf<ded>, ded> $$0, deh.b<deu> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ded a(alf<ded> $$0) {
      return this.a.getOrDefault($$0, ded.j);
   }

   @Override
   public deh.b<deu> a() {
      return this.b;
   }
}
