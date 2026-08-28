import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fw<T> implements ArgumentType<jo<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.resource_or_id.invalid"));
   private final jq.a d;
   private final boolean e;
   private final Codec<jo<T>> f;

   protected fw(eq $$0, ald<kb<T>> $$1, Codec<jo<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fw.c a(eq $$0) {
      return new fw.c($$0);
   }

   public static jo<etq> a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fw.a b(eq $$0) {
      return new fw.a($$0);
   }

   public static jo<euz> b(CommandContext<eu> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fw.b c(eq $$0) {
      return new fw.b($$0);
   }

   public static jo<eww> c(CommandContext<eu> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jo<T> d(CommandContext<eu> $$0, String $$1) {
      return (jo<T>)$$0.getArgument($$1, jo.class);
   }

   @Nullable
   public jo<T> a(StringReader $$0) throws CommandSyntaxException {
      vd $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         alc<vd> $$2 = this.d.a(uu.a);
         return (jo<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vd b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vd $$2 = new ve($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         ale $$3 = ale.a($$0);
         if (c($$0)) {
            return vb.a($$3.toString());
         } else {
            $$0.setCursor($$1);
            throw c.createWithContext($$0);
         }
      }
   }

   private static boolean c(StringReader $$0) {
      return !$$0.canRead() || $$0.peek() == ' ';
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a extends fw<euz> {
      protected a(eq $$0) {
         super($$0, lw.bf, evb.d);
      }
   }

   public static class b extends fw<eww> {
      protected b(eq $$0) {
         super($$0, lw.bg, eww.f);
      }
   }

   public static class c extends fw<etq> {
      protected c(eq $$0) {
         super($$0, lw.be, etq.e);
      }
   }
}
