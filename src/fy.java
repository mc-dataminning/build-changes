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

public class fy<T> implements ArgumentType<jq<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xi.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xi.c("argument.resource_or_id.invalid"));
   private final js.a d;
   private final boolean e;
   private final Codec<jq<T>> f;

   protected fy(es $$0, alh<kd<T>> $$1, Codec<jq<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fy.c a(es $$0) {
      return new fy.c($$0);
   }

   public static jq<euh> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fy.a b(es $$0) {
      return new fy.a($$0);
   }

   public static jq<evq> b(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fy.b c(es $$0) {
      return new fy.b($$0);
   }

   public static jq<exn> c(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jq<T> d(CommandContext<ew> $$0, String $$1) {
      return (jq<T>)$$0.getArgument($$1, jq.class);
   }

   @Nullable
   public jq<T> a(StringReader $$0) throws CommandSyntaxException {
      vh $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         alg<vh> $$2 = this.d.a(uy.a);
         return (jq<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vh b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vh $$2 = new vi($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         ali $$3 = ali.a($$0);
         if (c($$0)) {
            return vf.a($$3.toString());
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

   public static class a extends fy<evq> {
      protected a(es $$0) {
         super($$0, lz.be, evs.d);
      }
   }

   public static class b extends fy<exn> {
      protected b(es $$0) {
         super($$0, lz.bf, exn.f);
      }
   }

   public static class c extends fy<euh> {
      protected c(es $$0) {
         super($$0, lz.bd, euh.e);
      }
   }
}
