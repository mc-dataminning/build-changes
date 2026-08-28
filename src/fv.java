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

public class fv<T> implements ArgumentType<jm<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wz.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("argument.resource_or_id.invalid"));
   private final jo.a d;
   private final boolean e;
   private final Codec<jm<T>> f;

   protected fv(ep $$0, akq<jz<T>> $$1, Codec<jm<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fv.c a(ep $$0) {
      return new fv.c($$0);
   }

   public static jm<eru> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fv.a b(ep $$0) {
      return new fv.a($$0);
   }

   public static jm<etd> b(CommandContext<et> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fv.b c(ep $$0) {
      return new fv.b($$0);
   }

   public static jm<eva> c(CommandContext<et> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jm<T> d(CommandContext<et> $$0, String $$1) {
      return (jm<T>)$$0.getArgument($$1, jm.class);
   }

   @Nullable
   public jm<T> a(StringReader $$0) throws CommandSyntaxException {
      uy $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         akp<uy> $$2 = this.d.a(up.a);
         return (jm<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static uy b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      uy $$2 = new uz($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         akr $$3 = akr.a($$0);
         if (c($$0)) {
            return uw.a($$3.toString());
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

   public static class a extends fv<etd> {
      protected a(ep $$0) {
         super($$0, lu.bd, etf.d);
      }
   }

   public static class b extends fv<eva> {
      protected b(ep $$0) {
         super($$0, lu.be, eva.f);
      }
   }

   public static class c extends fv<eru> {
      protected c(ep $$0) {
         super($$0, lu.bc, eru.e);
      }
   }
}
