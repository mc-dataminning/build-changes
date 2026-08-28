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

public class fx<T> implements ArgumentType<jp<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("argument.resource_or_id.invalid"));
   private final jr.a d;
   private final boolean e;
   private final Codec<jp<T>> f;

   protected fx(er $$0, alg<kc<T>> $$1, Codec<jp<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fx.c a(er $$0) {
      return new fx.c($$0);
   }

   public static jp<eub> a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fx.a b(er $$0) {
      return new fx.a($$0);
   }

   public static jp<evk> b(CommandContext<ev> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fx.b c(er $$0) {
      return new fx.b($$0);
   }

   public static jp<exh> c(CommandContext<ev> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jp<T> d(CommandContext<ev> $$0, String $$1) {
      return (jp<T>)$$0.getArgument($$1, jp.class);
   }

   @Nullable
   public jp<T> a(StringReader $$0) throws CommandSyntaxException {
      vg $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         alf<vg> $$2 = this.d.a(ux.a);
         return (jp<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static vg b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      vg $$2 = new vh($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         alh $$3 = alh.a($$0);
         if (c($$0)) {
            return ve.a($$3.toString());
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

   public static class a extends fx<evk> {
      protected a(er $$0) {
         super($$0, ly.be, evm.d);
      }
   }

   public static class b extends fx<exh> {
      protected b(er $$0) {
         super($$0, ly.bf, exh.f);
      }
   }

   public static class c extends fx<eub> {
      protected c(er $$0) {
         super($$0, ly.bd, eub.e);
      }
   }
}
