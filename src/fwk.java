import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fwk {
   private static final alz f = alz.b("tooltip/background");
   private static final alz g = alz.b("tooltip/frame");
   public static final int a = 12;
   private static final int h = 3;
   public static final int b = 3;
   public static final int c = 3;
   public static final int d = 3;
   public static final int e = 3;
   private static final int i = 9;

   public static void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, @Nullable alz $$6) {
      int $$7 = $$1 - 3 - 9;
      int $$8 = $$2 - 3 - 9;
      int $$9 = $$3 + 3 + 3 + 18;
      int $$10 = $$4 + 3 + 3 + 18;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, (float)$$5);
      $$0.a(glt::B, a($$6), $$7, $$8, $$9, $$10);
      $$0.a(glt::B, b($$6), $$7, $$8, $$9, $$10);
      $$0.c().b();
   }

   private static alz a(@Nullable alz $$0) {
      return $$0 == null ? f : $$0.a((UnaryOperator<String>)($$0x -> "tooltip/" + $$0x + "_background"));
   }

   private static alz b(@Nullable alz $$0) {
      return $$0 == null ? g : $$0.a((UnaryOperator<String>)($$0x -> "tooltip/" + $$0x + "_frame"));
   }
}
