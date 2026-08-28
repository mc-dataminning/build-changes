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

public class fv<T> implements ArgumentType<jn<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xd.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("argument.resource_or_id.invalid"));
   private final jp.a d;
   private final boolean e;
   private final Codec<jn<T>> f;

   protected fv(ep $$0, alb<ka<T>> $$1, Codec<jn<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fv.c a(ep $$0) {
      return new fv.c($$0);
   }

   public static jn<etm> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fv.a b(ep $$0) {
      return new fv.a($$0);
   }

   public static jn<euv> b(CommandContext<et> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fv.b c(ep $$0) {
      return new fv.b($$0);
   }

   public static jn<ews> c(CommandContext<et> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jn<T> d(CommandContext<et> $$0, String $$1) {
      return (jn<T>)$$0.getArgument($$1, jn.class);
   }

   @Nullable
   public jn<T> a(StringReader $$0) throws CommandSyntaxException {
      vc $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         ala<vc> $$2 = this.d.a(ut.a);
         return (jn<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vc b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vc $$2 = new vd($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         alc $$3 = alc.a($$0);
         if (c($$0)) {
            return va.a($$3.toString());
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

   public static class a extends fv<euv> {
      protected a(ep $$0) {
         super($$0, lv.be, eux.d);
      }
   }

   public static class b extends fv<ews> {
      protected b(ep $$0) {
         super($$0, lv.bf, ews.f);
      }
   }

   public static class c extends fv<etm> {
      protected c(ep $$0) {
         super($$0, lv.bd, etm.e);
      }
   }
}
