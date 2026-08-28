import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ii<T> {
   ale a();

   ik<T> a(@Nullable ug var1, CommandDispatcher<T> var2) throws ex;

   private static boolean b(CharSequence $$0) {
      int $$1 = $$0.length();
      return $$1 > 0 && $$0.charAt($$1 - 1) == '\\';
   }

   static <T extends ew<T>> ii<T> a(ale $$0, CommandDispatcher<T> $$1, T $$2, List<String> $$3) {
      ij<T> $$4 = new ij<>();

      for (int $$5 = 0; $$5 < $$3.size(); $$5++) {
         int $$6 = $$5 + 1;
         String $$7 = $$3.get($$5).trim();
         String $$10;
         if (b($$7)) {
            StringBuilder $$8 = new StringBuilder($$7);

            do {
               if (++$$5 == $$3.size()) {
                  throw new IllegalArgumentException("Line continuation at end of file");
               }

               $$8.deleteCharAt($$8.length() - 1);
               String $$9 = $$3.get($$5).trim();
               $$8.append($$9);
               a($$8);
            } while (b($$8));

            $$10 = $$8.toString();
         } else {
            $$10 = $$7;
         }

         a($$10);
         StringReader $$12 = new StringReader($$10);
         if ($$12.canRead() && $$12.peek() != '#') {
            if ($$12.peek() == '/') {
               $$12.skip();
               if ($$12.peek() == '/') {
                  throw new IllegalArgumentException(
                     "Unknown or invalid command '" + $$10 + "' on line " + $$6 + " (if you intended to make a comment, use '#' not '//')"
                  );
               }

               String $$13 = $$12.readUnquotedString();
               throw new IllegalArgumentException(
                  "Unknown or invalid command '" + $$10 + "' on line " + $$6 + " (did you mean '" + $$13 + "'? Do not use a preceding forwards slash.)"
               );
            }

            if ($$12.peek() == '$') {
               $$4.a($$10.substring(1), $$6, $$2);
            } else {
               try {
                  $$4.a(a($$1, $$2, $$12));
               } catch (CommandSyntaxException var11) {
                  throw new IllegalArgumentException("Whilst parsing command on line " + $$6 + ": " + var11.getMessage());
               }
            }
         }
      }

      return $$4.a($$0);
   }

   static void a(CharSequence $$0) {
      if ($$0.length() > 2000000) {
         CharSequence $$1 = $$0.subSequence(0, Math.min(512, 2000000));
         throw new IllegalStateException("Command too long: " + $$0.length() + " characters, contents: " + $$1 + "...");
      }
   }

   static <T extends ew<T>> hy<T> a(CommandDispatcher<T> $$0, T $$1, StringReader $$2) throws CommandSyntaxException {
      ParseResults<T> $$3 = $$0.parse($$2, $$1);
      ev.a($$3);
      Optional<ContextChain<T>> $$4 = ContextChain.tryFlatten($$3.getContext().build($$2.getString()));
      if ($$4.isEmpty()) {
         throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$3.getReader());
      } else {
         return new ia.c<>($$2.getString(), $$4.get());
      }
   }
}
