import java.util.Map;

public class gmf implements des {
   private final Map<alj<dfa>, dfa> a;
   private final dfe.b<dfr> b;

   public gmf(Map<alj<dfa>, dfa> $$0, dfe.b<dfr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dfa a(alj<dfa> $$0) {
      return this.a.getOrDefault($$0, dfa.j);
   }

   @Override
   public dfe.b<dfr> a() {
      return this.b;
   }
}
