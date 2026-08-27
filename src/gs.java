import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.context.ContextChain.Stage;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class gs<T extends dw<T>> {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ui.b("command.forkLimit", $$0));
   private final String b;
   private final ContextChain<T> c;

   public gs(String $$0, ContextChain<T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected void a(List<T> $$0, gn<T> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      ContextChain<T> $$4 = this.c;
      boolean $$5 = $$3;
      List<T> $$6 = $$0;
      if ($$4.getStage() != Stage.EXECUTE) {
         $$1.c().a(() -> "prepare " + this.b);

         try {
            for (int $$7 = $$1.d(); $$4.getStage() != Stage.EXECUTE; $$4 = $$4.nextStage()) {
               CommandContext<T> $$8 = $$4.getTopContext();
               $$5 |= $$8.isForked();
               RedirectModifier<T> $$9 = $$8.getRedirectModifier();
               if ($$9 instanceof gl<T> $$10) {
                  $$10.a($$6, $$4, $$5, b($$1, $$2));
                  return;
               }

               if ($$9 != null) {
                  $$1.e();
                  List<T> $$11 = new ArrayList<>();

                  for (T $$12 : $$6) {
                     Collection<T> $$13 = ContextChain.runModifier($$8, $$12, dw.a_(), $$5);
                     $$11.addAll($$13);
                     if ($$11.size() >= $$7) {
                        throw a.create($$7);
                     }
                  }

                  $$6 = $$11;
               }
            }
         } finally {
            $$1.c().c();
         }
      }

      CommandContext<T> $$14 = $$4.getTopContext();
      if ($$14.getCommand() instanceof gk<T> $$16) {
         go<T> $$17 = b($$1, $$2);

         for (T $$18 : $$6) {
            $$16.a($$18, $$4, $$5, $$17);
         }
      } else {
         gv<T> $$19 = new gv<>(this.b, $$5, $$14);
         gu.a($$1, $$2, $$6, ($$1x, $$2x) -> new gj<>($$1x, $$19.bind((T)$$2x)));
      }
   }

   private static <T extends dw<T>> go<T> b(final gn<T> $$0, final int $$1) {
      return new go<T>() {
         @Override
         public void a(gm<T> $$0x) {
            $$0.a(new gj<>($$1, $$0));
         }

         @Override
         public void a() {
            $$0.a($$1);
         }

         @Override
         public void a(@Nullable gp $$0x) {
            $$0.a($$0);
         }

         @Nullable
         @Override
         public gp b() {
            return $$0.b();
         }
      };
   }

   protected void a(gn<T> $$0, int $$1) {
      gp $$2 = $$0.b();
      if ($$2 != null) {
         $$2.a($$1, this.b);
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static class a<T extends dw<T>> extends gs<T> implements gm<T> {
      private final boolean a;
      private final List<T> b;

      public a(String $$0, ContextChain<T> $$1, boolean $$2, List<T> $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      @Override
      public void execute(gn<T> $$0, int $$1) throws CommandSyntaxException {
         this.a(this.b, $$0, $$1, this.a);
      }
   }

   public static class b<T extends dw<T>> extends gs<T> implements gm<T> {
      private final T a;

      public b(String $$0, ContextChain<T> $$1, T $$2) {
         super($$0, $$1);
         this.a = $$2;
      }

      @Override
      public void execute(gn<T> $$0, int $$1) throws CommandSyntaxException {
         this.a($$0, $$1);
         this.a(List.of(this.a), $$0, $$1, false);
      }
   }

   public static class c<T extends dw<T>> extends gs<T> implements gq<T> {
      public c(String $$0, ContextChain<T> $$1) {
         super($$0, $$1);
      }

      public void a(T $$0, gn<T> $$1, int $$2) throws CommandSyntaxException {
         this.a($$1, $$2);
         this.a(List.of($$0), $$1, $$2, false);
      }
   }
}
