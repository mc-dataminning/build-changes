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

public class uk {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wg.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("argument.nbt.expected.key"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wg.c("argument.nbt.expected.value"));
   public static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("argument.nbt.list.mixed", $$0, $$1));
   public static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("argument.nbt.array.mixed", $$0, $$1));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wg.b("argument.nbt.array.invalid", $$0));
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
   public static final Codec<tm> i = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(new uk(new StringReader($$0)).a(), Lifecycle.stable());
      } catch (CommandSyntaxException var2) {
         return DataResult.error(var2::getMessage);
      }
   }, tm::toString);
   private final StringReader u;

   public static tm a(String $$0) throws CommandSyntaxException {
      return new uk(new StringReader($$0)).a();
   }

   @VisibleForTesting
   tm a() throws CommandSyntaxException {
      tm $$0 = this.f();
      this.u.skipWhitespace();
      if (this.u.canRead()) {
         throw a.createWithContext(this.u);
      } else {
         return $$0;
      }
   }

   public uk(StringReader $$0) {
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

   protected uj c() throws CommandSyntaxException {
      this.u.skipWhitespace();
      int $$0 = this.u.getCursor();
      if (StringReader.isQuotedStringStart(this.u.peek())) {
         return uh.a(this.u.readQuotedString());
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

   private uj b(String $$0) {
      try {
         if (p.matcher($$0).matches()) {
            return tp.a(Float.parseFloat($$0.substring(0, $$0.length() - 1)));
         }

         if (q.matcher($$0).matches()) {
            return tk.a(Byte.parseByte($$0.substring(0, $$0.length() - 1)));
         }

         if (r.matcher($$0).matches()) {
            return tu.a(Long.parseLong($$0.substring(0, $$0.length() - 1)));
         }

         if (s.matcher($$0).matches()) {
            return ue.a(Short.parseShort($$0.substring(0, $$0.length() - 1)));
         }

         if (t.matcher($$0).matches()) {
            return tr.a(Integer.parseInt($$0));
         }

         if (o.matcher($$0).matches()) {
            return tn.a(Double.parseDouble($$0.substring(0, $$0.length() - 1)));
         }

         if (n.matcher($$0).matches()) {
            return tn.a(Double.parseDouble($$0));
         }

         if ("true".equalsIgnoreCase($$0)) {
            return tk.c;
         }

         if ("false".equalsIgnoreCase($$0)) {
            return tk.b;
         }
      } catch (NumberFormatException var3) {
      }

      return uh.a($$0);
   }

   public uj d() throws CommandSyntaxException {
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

   protected uj e() throws CommandSyntaxException {
      return this.u.canRead(3) && !StringReader.isQuotedStringStart(this.u.peek(1)) && this.u.peek(2) == ';' ? this.h() : this.g();
   }

   public tm f() throws CommandSyntaxException {
      this.a('{');
      tm $$0 = new tm();
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

   private uj g() throws CommandSyntaxException {
      this.a('[');
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw c.createWithContext(this.u);
      } else {
         ts $$0 = new ts();
         ul<?> $$1 = null;

         while (this.u.peek() != ']') {
            int $$2 = this.u.getCursor();
            uj $$3 = this.d();
            ul<?> $$4 = $$3.c();
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

   private uj h() throws CommandSyntaxException {
      this.a('[');
      int $$0 = this.u.getCursor();
      char $$1 = this.u.read();
      this.u.read();
      this.u.skipWhitespace();
      if (!this.u.canRead()) {
         throw c.createWithContext(this.u);
      } else if ($$1 == 'B') {
         return new tj(this.a(tj.a, tk.a));
      } else if ($$1 == 'L') {
         return new tt(this.a(tt.a, tu.a));
      } else if ($$1 == 'I') {
         return new tq(this.a(tq.a, tr.a));
      } else {
         this.u.setCursor($$0);
         throw f.createWithContext(this.u, String.valueOf($$1));
      }
   }

   private <T extends Number> List<T> a(ul<?> $$0, ul<?> $$1) throws CommandSyntaxException {
      List<T> $$2 = Lists.newArrayList();

      while (this.u.peek() != ']') {
         int $$3 = this.u.getCursor();
         uj $$4 = this.d();
         ul<?> $$5 = $$4.c();
         if ($$5 != $$1) {
            this.u.setCursor($$3);
            throw e.createWithContext(this.u, $$5.b(), $$0.b());
         }

         if ($$1 == tk.a) {
            $$2.add((T)((uc)$$4).i());
         } else if ($$1 == tu.a) {
            $$2.add((T)((uc)$$4).f());
         } else {
            $$2.add((T)((uc)$$4).g());
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
