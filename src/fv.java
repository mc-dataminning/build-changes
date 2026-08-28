import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fv<T extends dk<?>> extends ArgumentType<T> {
   static fv.b a() {
      return new fv.b();
   }

   static fv.a b() {
      return new fv.a();
   }

   public static class a implements fv<dk.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static dk.c a(CommandContext<ex> $$0, String $$1) {
         return (dk.c)$$0.getArgument($$1, dk.c.class);
      }

      public dk.c a(StringReader $$0) throws CommandSyntaxException {
         return dk.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fv<dk.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static dk.d a(CommandContext<ex> $$0, String $$1) {
         return (dk.d)$$0.getArgument($$1, dk.d.class);
      }

      public dk.d a(StringReader $$0) throws CommandSyntaxException {
         return dk.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
