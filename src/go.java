import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class go implements gg<LongArgumentType, go.a> {
   public void a(go.a $$0, sf $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.writeByte(gi.a($$2, $$3));
      if ($$2) {
         $$1.writeLong($$0.b);
      }

      if ($$3) {
         $$1.writeLong($$0.c);
      }
   }

   public go.a a(sf $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = gi.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = gi.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new go.a($$2, $$3);
   }

   public void a(go.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public go.a a(LongArgumentType $$0) {
      return new go.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gg.a<LongArgumentType> {
      final long b;
      final long c;

      a(long $$1, long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(dm $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public gg<LongArgumentType, ?> a() {
         return go.this;
      }
   }
}
