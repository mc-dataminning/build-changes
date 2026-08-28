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
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xk.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xk.c("argument.resource_or_id.invalid"));
   private final js.a d;
   private final boolean e;
   private final Codec<jq<T>> f;

   protected fy(es $$0, alo<kd<T>> $$1, Codec<jq<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fy.c a(es $$0) {
      return new fy.c($$0);
   }

   public static jq<ewn> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fy.a b(es $$0) {
      return new fy.a($$0);
   }

   public static jq<exw> b(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fy.b c(es $$0) {
      return new fy.b($$0);
   }

   public static jq<ezr> c(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jq<T> d(CommandContext<ew> $$0, String $$1) {
      return (jq<T>)$$0.getArgument($$1, jq.class);
   }

   @Nullable
   public jq<T> a(StringReader $$0) throws CommandSyntaxException {
      vj $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         aln<vj> $$2 = this.d.a(va.a);
         return (jq<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vj b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vj $$2 = new vk($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         alp $$3 = alp.a($$0);
         if (c($$0)) {
            return vh.a($$3.toString());
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

   public static class a extends fy<exw> {
      protected a(es $$0) {
         super($$0, mb.bh, exy.d);
      }
   }

   public static class b extends fy<ezr> {
      protected b(es $$0) {
         super($$0, mb.bi, ezr.f);
      }
   }

   public static class c extends fy<ewn> {
      protected c(es $$0) {
         super($$0, mb.bg, ewn.e);
      }
   }
}
