import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public class vb<T> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("argument.nbt.expected.compound"));
   public static final char c = ',';
   public static final char d = ':';
   private static final vb<va> g = a(uo.a);
   public static final Codec<ua> e = Codec.STRING.comapFlatMap($$0 -> {
      try {
         va $$1 = g.b($$0);
         return $$1 instanceof ua $$2 ? DataResult.success($$2, Lifecycle.stable()) : DataResult.error(() -> "Expected compound tag, got " + $$1);
      } catch (CommandSyntaxException var3) {
         return DataResult.error(var3::getMessage);
      }
   }, ua::toString);
   public static final Codec<ua> f = Codec.withAlternative(e, ua.a);
   private final DynamicOps<T> h;
   private final bqq<T> i;

   private vb(DynamicOps<T> $$0, bqq<T> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public DynamicOps<T> a() {
      return this.h;
   }

   public static <T> vb<T> a(DynamicOps<T> $$0) {
      return new vb<>($$0, uu.a($$0));
   }

   private static ua a(StringReader $$0, va $$1) throws CommandSyntaxException {
      if ($$1 instanceof ua) {
         return (ua)$$1;
      } else {
         throw b.createWithContext($$0);
      }
   }

   public static ua a(String $$0) throws CommandSyntaxException {
      StringReader $$1 = new StringReader($$0);
      return a($$1, g.a($$1));
   }

   public T b(String $$0) throws CommandSyntaxException {
      return this.a(new StringReader($$0));
   }

   public T a(StringReader $$0) throws CommandSyntaxException {
      T $$1 = this.i.a($$0);
      $$0.skipWhitespace();
      if ($$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         return $$1;
      }
   }

   public T b(StringReader $$0) throws CommandSyntaxException {
      return this.i.a($$0);
   }

   public static ua c(StringReader $$0) throws CommandSyntaxException {
      va $$1 = g.b($$0);
      return a($$0, $$1);
   }
}
