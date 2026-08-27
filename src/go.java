import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class go implements gh<IntegerArgumentType, go.a> {
   public void a(go.a $$0, sh $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(gj.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public go.a a(sh $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = gj.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = gj.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new go.a($$2, $$3);
   }

   public void a(go.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public go.a a(IntegerArgumentType $$0) {
      return new go.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gh.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dm $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public gh<IntegerArgumentType, ?> a() {
         return go.this;
      }
   }
}
