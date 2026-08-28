import java.util.function.UnaryOperator;

public class ny {
   @Deprecated
   public static akk a(String $$0) {
      return new akk("minecraft", "block/" + $$0);
   }

   public static akk b(String $$0) {
      return new akk("minecraft", "item/" + $$0);
   }

   public static akk a(dfh $$0, String $$1) {
      akk $$2 = lq.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akk a(dfh $$0) {
      akk $$1 = lq.e.b($$0);
      return $$1.d("block/");
   }

   public static akk a(ctx $$0) {
      akk $$1 = lq.g.b($$0);
      return $$1.d("item/");
   }

   public static akk a(ctx $$0, String $$1) {
      akk $$2 = lq.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
