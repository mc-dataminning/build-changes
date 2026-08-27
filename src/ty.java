import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import java.util.List;
import java.util.regex.Pattern;

public class ty {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vu.c("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("argument.nbt.list.mixed", $$0, $$1));
   public static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("argument.nbt.array.mixed", $$0, $$1));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> vu.b("argument.nbt.array.invalid", $$0));
   public static final char g = ',';
   public static final char h = ':';
   private static final char j = '[';
   private static final char k = ']';
   private static final char l = '}';
   private static final char m = '{';
   private static final Pattern n = Pattern.compile("[-+]?(?:[0-9]+[.]|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?", 2);
   private static final Pattern o = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?d", 2);
   private static final Pattern p = Pattern.compile("[-+]?(?:[0-9]+[.]?|[0-9]*[.][0-9]+)(?:e[-+]?[0-9]+)?f", 2);
   private static final Pattern q = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)b", 2);
   private static final Pattern r = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)l", 2);
   private static final Pattern s = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)s", 2);
   private static final Pattern t = Pattern.compile("[-+]?(?:0|[1-9][0-9]*)");
   public static final Codec<ta> i = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(new ty(new StringReader($$0)).a(), Lifecycle.stable());
      } catch (CommandSyntaxException var2) {
         return DataResult.error(var2::getMessage);
      }
   }, ta::toString);
   private final StringReader u;

   public static ta a(String $$0) throws CommandSyntaxException {
      return new ty(new StringReader($$0)).a();
   }

   @VisibleForTesting
   ta a() throws CommandSyntaxException {
      ta $$0 = this.f();
      this.u.skipWhitespace();
      if (this.u.canRead()) {
         throw a.createWithContext(this.u);
      } else {
         return $$0;
      }
   }

   public ty(StringReader $$0) {
      this.u = $$0;
   }

   protected String b() throws CommandSyntaxException {
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw b.createWithContext(this.u);
      } else {
         return this.u.readString();
      }
   }

   protected tx c() throws CommandSyntaxException {
      this.u.skipWhitespace();
      int $$0 = this.u.getCursor();
      if (StringReader.isQuotedStringStart(this.u.peek())) {
         return tv.a(this.u.readQuotedString());
      } else {
         String $$1 = this.u.readUnquotedString();
         if ($$1.isEmpty()) {
            this.u.setCursor($$0);
            throw c.createWithContext(this.u);
         } else {
            return this.b($$1);
         }
      }
   }

   private tx b(String $$0) {
      try {
         if (p.matcher($$0).matches()) {
            return td.a(Float.parseFloat($$0.substring(0, $$0.length() - 1)));
         }

         if (q.matcher($$0).matches()) {
            return sy.a(Byte.parseByte($$0.substring(0, $$0.length() - 1)));
         }

         if (r.matcher($$0).matches()) {
            return ti.a(Long.parseLong($$0.substring(0, $$0.length() - 1)));
         }

         if (s.matcher($$0).matches()) {
            return ts.a(Short.parseShort($$0.substring(0, $$0.length() - 1)));
         }

         if (t.matcher($$0).matches()) {
            return tf.a(Integer.parseInt($$0));
         }

         if (o.matcher($$0).matches()) {
            return tb.a(Double.parseDouble($$0.substring(0, $$0.length() - 1)));
         }

         if (n.matcher($$0).matches()) {
            return tb.a(Double.parseDouble($$0));
         }

         if ("true".equalsIgnoreCase($$0)) {
            return sy.c;
         }

         if ("false".equalsIgnoreCase($$0)) {
            return sy.b;
         }
      } catch (NumberFormatException var3) {
      }

      return tv.a($$0);
   }

   public tx d() throws CommandSyntaxException {
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw c.createWithContext(this.u);
      } else {
         char $$0 = this.u.peek();
         if ($$0 == '{') {
            return this.f();
         } else {
            return $$0 == '[' ? this.e() : this.c();
         }
      }
   }

   protected tx e() throws CommandSyntaxException {
      return this.u.canRead(3) && !StringReader.isQuotedStringStart(this.u.peek(1)) && this.u.peek(2) == ';' ? this.h() : this.g();
   }

   public ta f() throws CommandSyntaxException {
      this.a('{');
      ta $$0 = new ta();
      this.u.skipWhitespace();

      while (this.u.canRead() && this.u.peek() != '}') {
         int $$1 = this.u.getCursor();
         String $$2 = this.b();
         if ($$2.isEmpty()) {
            this.u.setCursor($$1);
            throw b.createWithContext(this.u);
         }

         this.a(':');
         $$0.a($$2, this.d());
         if (!this.i()) {
            break;
         }

         if (!this.u.canRead()) {
            throw b.createWithContext(this.u);
         }
      }

      this.a('}');
      return $$0;
   }

   private tx g() throws CommandSyntaxException {
      this.a('[');
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw c.createWithContext(this.u);
      } else {
         tg $$0 = new tg();
         tz<?> $$1 = null;

         while (this.u.peek() != ']') {
            int $$2 = this.u.getCursor();
            tx $$3 = this.d();
            tz<?> $$4 = $$3.c();
            if ($$1 == null) {
               $$1 = $$4;
            } else if ($$4 != $$1) {
               this.u.setCursor($$2);
               throw d.createWithContext(this.u, $$4.b(), $$1.b());
            }

            $$0.add($$3);
            if (!this.i()) {
               break;
            }

            if (!this.u.canRead()) {
               throw c.createWithContext(this.u);
            }
         }

         this.a(']');
         return $$0;
      }
   }

   private tx h() throws CommandSyntaxException {
      this.a('[');
      int $$0 = this.u.getCursor();
      char $$1 = this.u.read();
      this.u.read();
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw c.createWithContext(this.u);
      } else if ($$1 == 'B') {
         return new sx(this.a(sx.a, sy.a));
      } else if ($$1 == 'L') {
         return new th(this.a(th.a, ti.a));
      } else if ($$1 == 'I') {
         return new te(this.a(te.a, tf.a));
      } else {
         this.u.setCursor($$0);
         throw f.createWithContext(this.u, String.valueOf($$1));
      }
   }

   private <T extends Number> List<T> a(tz<?> $$0, tz<?> $$1) throws CommandSyntaxException {
      List<T> $$2 = Lists.newArrayList();

      while (this.u.peek() != ']') {
         int $$3 = this.u.getCursor();
         tx $$4 = this.d();
         tz<?> $$5 = $$4.c();
         if ($$5 != $$1) {
            this.u.setCursor($$3);
            throw e.createWithContext(this.u, $$5.b(), $$0.b());
         }

         if ($$1 == sy.a) {
            $$2.add((T)((tq)$$4).i());
         } else if ($$1 == ti.a) {
            $$2.add((T)((tq)$$4).f());
         } else {
            $$2.add((T)((tq)$$4).g());
         }

         if (!this.i()) {
            break;
         }

         if (!this.u.canRead()) {
            throw c.createWithContext(this.u);
         }
      }

      this.a(']');
      return $$2;
   }

   private boolean i() {
      this.u.skipWhitespace();
      if (this.u.canRead() && this.u.peek() == ',') {
         this.u.skip();
         this.u.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void a(char $$0) throws CommandSyntaxException {
      this.u.skipWhitespace();
      this.u.expect($$0);
   }
}
