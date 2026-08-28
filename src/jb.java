import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class jb implements it<LongArgumentType, jb.a> {
   public void a(jb.a $$0, vl $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.l(iv.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public jb.a a(vl $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = iv.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = iv.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new jb.a($$2, $$3);
   }

   public void a(jb.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public jb.a a(LongArgumentType $$0) {
      return new jb.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements it.a<LongArgumentType> {
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
      public it<LongArgumentType, ?> a() {
         return jb.this;
      }
   }
}
