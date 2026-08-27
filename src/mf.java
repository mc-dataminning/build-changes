import java.util.function.UnaryOperator;

public class mf {
   @Deprecated
   public static agi a(String $$0) {
      return new agi("minecraft", "block/" + $$0);
   }

   public static agi b(String $$0) {
      return new agi("minecraft", "item/" + $$0);
   }

   public static agi a(cva $$0, String $$1) {
      agi $$2 = jy.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agi a(cva $$0) {
      agi $$1 = jy.f.b($$0);
      return $$1.d("block/");
   }

   public static agi a(cle $$0) {
      agi $$1 = jy.i.b($$0);
      return $$1.d("item/");
   }

   public static agi a(cle $$0, String $$1) {
      agi $$2 = jy.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
