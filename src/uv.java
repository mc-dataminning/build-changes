import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import javax.annotation.Nullable;

public class uv<T> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("argument.nbt.expected.value"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ww.c("argument.nbt.expected.compound"));
   public static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("argument.nbt.array.mixed", $$0, $$1));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> ww.b("argument.nbt.array.invalid", $$0));
   public static final char g = ',';
   public static final char h = ':';
   private static final char k = '[';
   private static final char l = ']';
   private static final char m = '}';
   private static final char n = '{';
   private static final Pattern o = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern p = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern q = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern r = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern s = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern t = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern u = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   public static final Codec<tx> i = Codec.STRING.comapFlatMap($$0 -> {
      try {
         uu $$1 = a(ul.a, $$0);
         return $$1 instanceof tx $$2 ? DataResult.success($$2, Lifecycle.stable()) : DataResult.error(() -> "Expected compound tag, got " + $$1);
      } catch (CommandSyntaxException var3) {
         return DataResult.error(var3::getMessage);
      }
   }, tx::toString);
   public static final Codec<tx> j = Codec.withAlternative(i, tx.a);
   private final DynamicOps<T> v;
   private final StringReader w;

   private static tx a(StringReader $$0, uu $$1) throws CommandSyntaxException {
      if ($$1 instanceof tx) {
         return (tx)$$1;
      } else {
         throw d.createWithContext($$0);
      }
   }

   public static tx a(String $$0) throws CommandSyntaxException {
      StringReader $$1 = new StringReader($$0);
      return a($$1, a(ul.a, $$1));
   }

   public static <T> T a(DynamicOps<T> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, new StringReader($$1));
   }

   public static <T> T a(DynamicOps<T> $$0, StringReader $$1) throws CommandSyntaxException {
      T $$2 = new uv<T>($$0, $$1).c();
      $$1.skipWhitespace();
      if ($$1.canRead()) {
         throw a.createWithContext($$1);
      } else {
         return $$2;
      }
   }

   public static <T> T b(DynamicOps<T> $$0, StringReader $$1) throws CommandSyntaxException {
      return new uv<T>($$0, $$1).c();
   }

   public static tx a(StringReader $$0) throws CommandSyntaxException {
      uu $$1 = b(ul.a, $$0);
      return a($$0, $$1);
   }

   private uv(DynamicOps<T> $$0, StringReader $$1) {
      this.v = $$0;
      this.w = $$1;
   }

   @VisibleForTesting
   public static String b(StringReader $$0) throws CommandSyntaxException {
      $$0.skipWhitespace();
      if (!$$0.canRead()) {
         throw b.createWithContext($$0);
      } else {
         return $$0.readString();
      }
   }

   private T a() throws CommandSyntaxException {
      this.w.skipWhitespace();
      int $$0 = this.w.getCursor();
      if (StringReader.isQuotedStringStart(this.w.peek())) {
         return (T)this.v.createString(this.w.readQuotedString());
      } else {
         String $$1 = this.w.readUnquotedString();
         if ($$1.isEmpty()) {
            this.w.setCursor($$0);
            throw c.createWithContext(this.w);
         } else {
            return this.c($$1);
         }
      }
   }

   @Nullable
   private static Number b(String $$0) {
      try {
         char $$1 = Character.toLowerCase($$0.charAt($$0.length() - 1));
         switch ($$1) {
            case 'b':
               if (r.matcher($$0).matches()) {
                  return Byte.parseByte($$0.substring(0, $$0.length() - 1));
               }
               break;
            case 'd':
               if (p.matcher($$0).matches()) {
                  return Double.parseDouble($$0.substring(0, $$0.length() - 1));
               }
               break;
            case 'f':
               if (q.matcher($$0).matches()) {
                  return Float.parseFloat($$0.substring(0, $$0.length() - 1));
               }
               break;
            case 'l':
               if (s.matcher($$0).matches()) {
                  return Long.parseLong($$0.substring(0, $$0.length() - 1));
               }
               break;
            case 's':
               if (t.matcher($$0).matches()) {
                  return Short.parseShort($$0.substring(0, $$0.length() - 1));
               }
         }

         if (u.matcher($$0).matches()) {
            return Integer.parseInt($$0);
         }

         if (o.matcher($$0).matches()) {
            return Double.parseDouble($$0);
         }
      } catch (NumberFormatException var2) {
      }

      return null;
   }

   private T c(String $$0) {
      if ("true".equalsIgnoreCase($$0)) {
         return (T)this.v.createBoolean(true);
      } else if ("false".equalsIgnoreCase($$0)) {
         return (T)this.v.createBoolean(false);
      } else {
         Number $$1 = b($$0);
         if ($$1 != null) {
            Objects.requireNonNull($$1);

            return (T)(switch ($$1) {
               case Float $$2 -> (Object)this.v.createFloat($$2);
               case Double $$3 -> (Object)this.v.createDouble($$3);
               case Byte $$4 -> (Object)this.v.createByte($$4);
               case Short $$5 -> (Object)this.v.createShort($$5);
               case Integer $$6 -> (Object)this.v.createInt($$6);
               case Long $$7 -> (Object)this.v.createLong($$7);
               default -> throw new UnsupportedOperationException();
            });
         } else {
            return (T)this.v.createString($$0);
         }
      }
   }

   @Nullable
   private Number b() {
      String $$0 = this.w.readUnquotedString();
      return $$0.isEmpty() ? null : b($$0);
   }

   private T c() throws CommandSyntaxException {
      this.w.skipWhitespace();
      if (!this.w.canRead()) {
         throw c.createWithContext(this.w);
      } else {
         char $$0 = this.w.peek();
         if ($$0 == '{') {
            return this.e();
         } else {
            return $$0 == '[' ? this.d() : this.a();
         }
      }
   }

   private T d() throws CommandSyntaxException {
      return this.w.canRead(3) && !StringReader.isQuotedStringStart(this.w.peek(1)) && this.w.peek(2) == ';' ? this.g() : this.f();
   }

   private T e() throws CommandSyntaxException {
      this.a('{');
      Map<String, T> $$0 = new HashMap<>();
      this.w.skipWhitespace();

      while (this.w.canRead() && this.w.peek() != '}') {
         int $$1 = this.w.getCursor();
         String $$2 = b(this.w);
         if ($$2.isEmpty()) {
            this.w.setCursor($$1);
            throw b.createWithContext(this.w);
         }

         this.a(':');
         $$0.put($$2, this.c());
         if (!this.k()) {
            break;
         }

         if (!this.w.canRead()) {
            throw b.createWithContext(this.w);
         }
      }

      this.a('}');
      return (T)this.v.createMap($$0.entrySet().stream().map($$0x -> Pair.of(this.v.createString((String)$$0x.getKey()), $$0x.getValue())));
   }

   private T f() throws CommandSyntaxException {
      this.a('[');
      this.w.skipWhitespace();
      if (!this.w.canRead()) {
         throw c.createWithContext(this.w);
      } else {
         Builder<T> $$0 = Stream.builder();

         while (this.w.peek() != ']') {
            $$0.add(this.c());
            if (!this.k()) {
               break;
            }

            if (!this.w.canRead()) {
               throw c.createWithContext(this.w);
            }
         }

         this.a(']');
         return (T)this.v.createList($$0.build());
      }
   }

   private T g() throws CommandSyntaxException {
      this.a('[');
      int $$0 = this.w.getCursor();
      char $$1 = this.w.read();
      this.w.read();
      this.w.skipWhitespace();
      if (!this.w.canRead()) {
         throw c.createWithContext(this.w);
      } else if ($$1 == 'B') {
         return (T)this.v.createByteList(this.h());
      } else if ($$1 == 'L') {
         return (T)this.v.createLongList(this.j());
      } else if ($$1 == 'I') {
         return (T)this.v.createIntList(this.i());
      } else {
         this.w.setCursor($$0);
         throw f.createWithContext(this.w, String.valueOf($$1));
      }
   }

   private ByteBuffer h() throws CommandSyntaxException {
      ByteList $$0 = new ByteArrayList();

      while (this.w.peek() != ']') {
         int $$1 = this.w.getCursor();
         Number $$2 = this.b();
         if (!($$2 instanceof Byte $$3)) {
            this.w.setCursor($$1);
            throw e.createWithContext(this.w, $$2, "byte array");
         }

         $$0.add($$3);
         if (!this.k()) {
            break;
         }

         if (!this.w.canRead()) {
            throw c.createWithContext(this.w);
         }
      }

      this.a(']');
      return ByteBuffer.wrap($$0.toByteArray());
   }

   private IntStream i() throws CommandSyntaxException {
      IntList $$0 = new IntArrayList();

      while (this.w.peek() != ']') {
         int $$1 = this.w.getCursor();
         Number $$2 = this.b();
         if (!($$2 instanceof Integer $$3)) {
            this.w.setCursor($$1);
            throw e.createWithContext(this.w, $$2, "int array");
         }

         $$0.add($$3);
         if (!this.k()) {
            break;
         }

         if (!this.w.canRead()) {
            throw c.createWithContext(this.w);
         }
      }

      this.a(']');
      return $$0.intStream();
   }

   private LongStream j() throws CommandSyntaxException {
      LongList $$0 = new LongArrayList();

      while (this.w.peek() != ']') {
         int $$1 = this.w.getCursor();
         Number $$2 = this.b();
         if (!($$2 instanceof Long $$3)) {
            this.w.setCursor($$1);
            throw e.createWithContext(this.w, $$2, "long array");
         }

         $$0.add($$3);
         if (!this.k()) {
            break;
         }

         if (!this.w.canRead()) {
            throw c.createWithContext(this.w);
         }
      }

      this.a(']');
      return $$0.longStream();
   }

   private boolean k() {
      this.w.skipWhitespace();
      if (this.w.canRead() && this.w.peek() == ',') {
         this.w.skip();
         this.w.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void a(char $$0) throws CommandSyntaxException {
      this.w.skipWhitespace();
      this.w.expect($$0);
   }
}
