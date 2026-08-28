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

public class ve {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.nbt.list.mixed", $$0, $$1));
   public static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("argument.nbt.array.mixed", $$0, $$1));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xe.b("argument.nbt.array.invalid", $$0));
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
   public static final Codec<ug> i = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(new ve(new StringReader($$0)).a(), Lifecycle.stable());
      } catch (CommandSyntaxException var2) {
         return DataResult.error(var2::getMessage);
      }
   }, ug::toString);
   public static final Codec<ug> j = Codec.withAlternative(i, ug.a);
   private final StringReader v;

   public static ug a(String $$0) throws CommandSyntaxException {
      return new ve(new StringReader($$0)).a();
   }

   @VisibleForTesting
   ug a() throws CommandSyntaxException {
      ug $$0 = this.f();
      this.v.skipWhitespace();
      if (this.v.canRead()) {
         throw a.createWithContext(this.v);
      } else {
         return $$0;
      }
   }

   public ve(StringReader $$0) {
      this.v = $$0;
   }

   protected String b() throws CommandSyntaxException {
      this.v.skipWhitespace();
      if (!this.v.canRead()) {
         throw b.createWithContext(this.v);
      } else {
         return this.v.readString();
      }
   }

   protected vd c() throws CommandSyntaxException {
      this.v.skipWhitespace();
      int $$0 = this.v.getCursor();
      if (StringReader.isQuotedStringStart(this.v.peek())) {
         return vb.a(this.v.readQuotedString());
      } else {
         String $$1 = this.v.readUnquotedString();
         if ($$1.isEmpty()) {
            this.v.setCursor($$0);
            throw c.createWithContext(this.v);
         } else {
            return this.b($$1);
         }
      }
   }

   private vd b(String $$0) {
      try {
         if (q.matcher($$0).matches()) {
            return uj.a(Float.parseFloat($$0.substring(0, $$0.length() - 1)));
         }

         if (r.matcher($$0).matches()) {
            return ue.a(Byte.parseByte($$0.substring(0, $$0.length() - 1)));
         }

         if (s.matcher($$0).matches()) {
            return uo.a(Long.parseLong($$0.substring(0, $$0.length() - 1)));
         }

         if (t.matcher($$0).matches()) {
            return uy.a(Short.parseShort($$0.substring(0, $$0.length() - 1)));
         }

         if (u.matcher($$0).matches()) {
            return ul.a(Integer.parseInt($$0));
         }

         if (p.matcher($$0).matches()) {
            return uh.a(Double.parseDouble($$0.substring(0, $$0.length() - 1)));
         }

         if (o.matcher($$0).matches()) {
            return uh.a(Double.parseDouble($$0));
         }

         if ("true".equalsIgnoreCase($$0)) {
            return ue.c;
         }

         if ("false".equalsIgnoreCase($$0)) {
            return ue.b;
         }
      } catch (NumberFormatException var3) {
      }

      return vb.a($$0);
   }

   public vd d() throws CommandSyntaxException {
      this.v.skipWhitespace();
      if (!this.v.canRead()) {
         throw c.createWithContext(this.v);
      } else {
         char $$0 = this.v.peek();
         if ($$0 == '{') {
            return this.f();
         } else {
            return $$0 == '[' ? this.e() : this.c();
         }
      }
   }

   protected vd e() throws CommandSyntaxException {
      return this.v.canRead(3) && !StringReader.isQuotedStringStart(this.v.peek(1)) && this.v.peek(2) == ';' ? this.h() : this.g();
   }

   public ug f() throws CommandSyntaxException {
      this.a('{');
      ug $$0 = new ug();
      this.v.skipWhitespace();

      while (this.v.canRead() && this.v.peek() != '}') {
         int $$1 = this.v.getCursor();
         String $$2 = this.b();
         if ($$2.isEmpty()) {
            this.v.setCursor($$1);
            throw b.createWithContext(this.v);
         }

         this.a(':');
         $$0.a($$2, this.d());
         if (!this.i()) {
            break;
         }

         if (!this.v.canRead()) {
            throw b.createWithContext(this.v);
         }
      }

      this.a('}');
      return $$0;
   }

   private vd g() throws CommandSyntaxException {
      this.a('[');
      this.v.skipWhitespace();
      if (!this.v.canRead()) {
         throw c.createWithContext(this.v);
      } else {
         um $$0 = new um();
         vf<?> $$1 = null;

         while (this.v.peek() != ']') {
            int $$2 = this.v.getCursor();
            vd $$3 = this.d();
            vf<?> $$4 = $$3.c();
            if ($$1 == null) {
               $$1 = $$4;
            } else if ($$4 != $$1) {
               this.v.setCursor($$2);
               throw d.createWithContext(this.v, $$4.b(), $$1.b());
            }

            $$0.add($$3);
            if (!this.i()) {
               break;
            }

            if (!this.v.canRead()) {
               throw c.createWithContext(this.v);
            }
         }

         this.a(']');
         return $$0;
      }
   }

   private vd h() throws CommandSyntaxException {
      this.a('[');
      int $$0 = this.v.getCursor();
      char $$1 = this.v.read();
      this.v.read();
      this.v.skipWhitespace();
      if (!this.v.canRead()) {
         throw c.createWithContext(this.v);
      } else if ($$1 == 'B') {
         return new ud(this.a(ud.a, ue.a));
      } else if ($$1 == 'L') {
         return new un(this.a(un.a, uo.a));
      } else if ($$1 == 'I') {
         return new uk(this.a(uk.a, ul.a));
      } else {
         this.v.setCursor($$0);
         throw f.createWithContext(this.v, String.valueOf($$1));
      }
   }

   private <T extends Number> List<T> a(vf<?> $$0, vf<?> $$1) throws CommandSyntaxException {
      List<T> $$2 = Lists.newArrayList();

      while (this.v.peek() != ']') {
         int $$3 = this.v.getCursor();
         vd $$4 = this.d();
         vf<?> $$5 = $$4.c();
         if ($$5 != $$1) {
            this.v.setCursor($$3);
            throw e.createWithContext(this.v, $$5.b(), $$0.b());
         }

         if ($$1 == ue.a) {
            $$2.add((T)((uw)$$4).i());
         } else if ($$1 == uo.a) {
            $$2.add((T)((uw)$$4).f());
         } else {
            $$2.add((T)((uw)$$4).g());
         }

         if (!this.i()) {
            break;
         }

         if (!this.v.canRead()) {
            throw c.createWithContext(this.v);
         }
      }

      this.a(']');
      return $$2;
   }

   private boolean i() {
      this.v.skipWhitespace();
      if (this.v.canRead() && this.v.peek() == ',') {
         this.v.skip();
         this.v.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   private void a(char $$0) throws CommandSyntaxException {
      this.v.skipWhitespace();
      this.v.expect($$0);
   }
}
