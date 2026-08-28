import java.util.Map;

public class glq implements dfc {
   private final Map<alq<dfk>, dfk> a;
   private final dfo.b<dgb> b;

   public glq(Map<alq<dfk>, dfk> $$0, dfo.b<dgb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dfk a(alq<dfk> $$0) {
      return this.a.getOrDefault($$0, dfk.j);
   }

   @Override
   public dfo.b<dgb> a() {
      return this.b;
   }
}
