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
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.resource_or_id.invalid"));
   private final js.a d;
   private final boolean e;
   private final Codec<jq<T>> f;

   protected fy(es $$0, alk<kd<T>> $$1, Codec<jq<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fy.c a(es $$0) {
      return new fy.c($$0);
   }

   public static jq<eul> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fy.a b(es $$0) {
      return new fy.a($$0);
   }

   public static jq<evu> b(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fy.b c(es $$0) {
      return new fy.b($$0);
   }

   public static jq<exr> c(CommandContext<ew> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jq<T> d(CommandContext<ew> $$0, String $$1) {
      return (jq<T>)$$0.getArgument($$1, jq.class);
   }

   @Nullable
   public jq<T> a(StringReader $$0) throws CommandSyntaxException {
      vk $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         alj<vk> $$2 = this.d.a(vb.a);
         return (jq<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vk b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vk $$2 = new vl($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         all $$3 = all.a($$0);
         if (c($$0)) {
            return vi.a($$3.toString());
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

   public static class a extends fy<evu> {
      protected a(es $$0) {
         super($$0, ma.be, evw.d);
      }
   }

   public static class b extends fy<exr> {
      protected b(es $$0) {
         super($$0, ma.bf, exr.f);
      }
   }

   public static class c extends fy<eul> {
      protected c(es $$0) {
         super($$0, ma.bd, eul.e);
      }
   }
}
