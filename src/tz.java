import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.ArrayList;
import java.util.List;

public record tz<S>(List<tz.a<S>> a) {
   public static <S> tz<S> a(ParseResults<S> $$0) {
      String $$1 = $$0.getReader().getString();
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2;
      List<tz.a<S>> $$4 = a($$1, $$2);

      CommandContextBuilder<S> $$5;
      while (($$5 = $$3.getChild()) != null) {
         boolean $$6 = $$5.getRootNode() != $$2.getRootNode();
         if (!$$6) {
            break;
         }

         $$4.addAll(a($$1, $$5));
         $$3 = $$5;
      }

      return new tz<>($$4);
   }

   private static <S> List<tz.a<S>> a(String $$0, CommandContextBuilder<S> $$1) {
      List<tz.a<S>> $$2 = new ArrayList<>();

      for (ParsedCommandNode<S> $$3 : $$1.getNodes()) {
         CommandNode $$5 = $$3.getNode();
         if ($$5 instanceof ArgumentCommandNode) {
            ArgumentCommandNode<S, ?> $$4 = (ArgumentCommandNode<S, ?>)$$5;
            if ($$4.getType() instanceof ex) {
               ParsedArgument<S, ?> $$5x = (ParsedArgument<S, ?>)$$1.getArguments().get($$4.getName());
               if ($$5x != null) {
                  String $$6 = $$5x.getRange().get($$0);
                  $$2.add(new tz.a<>($$4, $$6));
               }
            }
         }
      }

      return $$2;
   }

   public static record a<S>(ArgumentCommandNode<S, ?> a, String b) {
      public String a() {
         return this.a.getName();
      }

      public ArgumentCommandNode<S, ?> b() {
         return this.a;
      }

      public String c() {
         return this.b;
      }
   }
}
