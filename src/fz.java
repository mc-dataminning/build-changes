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

public class fz<T> implements ArgumentType<jr<T>> {
   private static final Collection<String> b = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wo.b("argument.resource_or_id.failed_to_parse", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wo.c("argument.resource_or_id.invalid"));
   private final jt.a d;
   private final boolean e;
   private final Codec<jr<T>> f;

   protected fz(et $$0, akt<ke<T>> $$1, Codec<jr<T>> $$2) {
      this.d = $$0;
      this.e = $$0.a($$1).isPresent();
      this.f = $$2;
   }

   public static fz.c a(et $$0) {
      return new fz.c($$0);
   }

   public static jr<evu> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return d($$0, $$1);
   }

   public static fz.a b(et $$0) {
      return new fz.a($$0);
   }

   public static jr<exd> b(CommandContext<ex> $$0, String $$1) {
      return d($$0, $$1);
   }

   public static fz.b c(et $$0) {
      return new fz.b($$0);
   }

   public static jr<eyy> c(CommandContext<ex> $$0, String $$1) {
      return d($$0, $$1);
   }

   private static <T> jr<T> d(CommandContext<ex> $$0, String $$1) {
      return (jr<T>)$$0.getArgument($$1, jr.class);
   }

   @Nullable
   public jr<T> a(StringReader $$0) throws CommandSyntaxException {
      un $$1 = b($$0);
      if (!this.e) {
         return null;
      } else {
         aks<un> $$2 = this.d.a(ue.a);
         return (jr<T>)this.f.parse($$2, $$1).getOrThrow($$1x -> a.createWithContext($$0, $$1x));
      }
   }

   @VisibleForTesting
   static un b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      un $$2 = new uo($$0).d();
      if (c($$0)) {
         return $$2;
      } else {
         $$0.setCursor($$1);
         aku $$3 = aku.a($$0);
         if (c($$0)) {
            return ul.a($$3.toString());
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

   public static class a extends fz<exd> {
      protected a(et $$0) {
         super($$0, mc.bh, exf.d);
      }
   }

   public static class b extends fz<eyy> {
      protected b(et $$0) {
         super($$0, mc.bi, eyy.f);
      }
   }

   public static class c extends fz<evu> {
      protected c(et $$0) {
         super($$0, mc.bg, evu.e);
      }
   }
}
