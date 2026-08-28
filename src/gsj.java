import java.util.Map;

public class gsj {
   public static final gsj a = new gsj(Map.of());
   private final Map<dno, hju<?>> b;

   public gsj(Map<dno, hju<?>> $$0) {
      this.b = $$0;
   }

   public static gsj a(gkn $$0) {
      return new gsj(hjv.a($$0));
   }

   public void a(dno $$0, dai $$1, fld $$2, grn $$3, int $$4, int $$5) {
      hju<?> $$6 = this.b.get($$0);
      if ($$6 != null) {
         $$6.a(null, $$1, $$2, $$3, $$4, $$5, false);
      }
   }
}
