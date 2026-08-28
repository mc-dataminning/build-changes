import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public class uz<T> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("argument.nbt.expected.compound"));
   public static final char c = ',';
   public static final char d = ':';
   private static final uz<uy> g = a(un.a);
   public static final Codec<tz> e = Codec.STRING.comapFlatMap($$0 -> {
      try {
         uy $$1 = g.b($$0);
         return $$1 instanceof tz $$2 ? DataResult.success($$2, Lifecycle.stable()) : DataResult.error(() -> "Expected compound tag, got " + $$1);
      } catch (CommandSyntaxException var3) {
         return DataResult.error(var3::getMessage);
      }
   }, tz::toString);
   public static final Codec<tz> f = Codec.withAlternative(e, tz.a);
   private final bqf<T> h;

   public uz(bqf<T> $$0) {
      this.h = $$0;
   }

   public static <T> uz<T> a(DynamicOps<T> $$0) {
      return new uz<>(ut.a($$0));
   }

   private static tz a(StringReader $$0, uy $$1) throws CommandSyntaxException {
      if ($$1 instanceof tz) {
         return (tz)$$1;
      } else {
         throw b.createWithContext($$0);
      }
   }

   public static tz a(String $$0) throws CommandSyntaxException {
      StringReader $$1 = new StringReader($$0);
      return a($$1, g.a($$1));
   }

   public T b(String $$0) throws CommandSyntaxException {
      return this.a(new StringReader($$0));
   }

   public T a(StringReader $$0) throws CommandSyntaxException {
      T $$1 = this.h.a($$0);
      $$0.skipWhitespace();
      if ($$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         return $$1;
      }
   }

   public T b(StringReader $$0) throws CommandSyntaxException {
      return this.h.a($$0);
   }

   public static tz c(StringReader $$0) throws CommandSyntaxException {
      uy $$1 = g.b($$0);
      return a($$0, $$1);
   }
}
