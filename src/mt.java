import java.util.function.UnaryOperator;

public class mt {
   @Deprecated
   public static ajh a(String $$0) {
      return new ajh("minecraft", "block/" + $$0);
   }

   public static ajh b(String $$0) {
      return new ajh("minecraft", "item/" + $$0);
   }

   public static ajh a(daa $$0, String $$1) {
      ajh $$2 = ki.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajh a(daa $$0) {
      ajh $$1 = ki.e.b($$0);
      return $$1.d("block/");
   }

   public static ajh a(cqf $$0) {
      ajh $$1 = ki.h.b($$0);
      return $$1.d("item/");
   }

   public static ajh a(cqf $$0, String $$1) {
      ajh $$2 = ki.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
