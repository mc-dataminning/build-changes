import java.util.Map;

public class ggc implements dbg {
   private final Map<aku<dbo>, dbo> a;
   private final dbs.b<dcf> b;

   public ggc(Map<aku<dbo>, dbo> $$0, dbs.b<dcf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dbo a(aku<dbo> $$0) {
      return this.a.getOrDefault($$0, dbo.j);
   }

   @Override
   public dbs.b<dcf> a() {
      return this.b;
   }
}
