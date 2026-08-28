import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class jc implements iu<LongArgumentType, jc.a> {
   public void a(jc.a $$0, vr $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.l(iw.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public jc.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = iw.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = iw.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new jc.a($$2, $$3);
   }

   public void a(jc.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public jc.a a(LongArgumentType $$0) {
      return new jc.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements iu.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(et $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public iu<LongArgumentType, ?> a() {
         return jc.this;
      }
   }
}
