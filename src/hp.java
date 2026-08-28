import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.context.ContextChain.Stage;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;

public class hp<T extends ek<T>> {
   @VisibleForTesting
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ww.b("command.forkLimit", $$0));
   private final String b;
   private final ContextChain<T> c;

   public hp(String $$0, ContextChain<T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected void a(T $$0, List<T> $$1, hj<T> $$2, hl $$3, he $$4) {
      ContextChain<T> $$5 = this.c;
      he $$6 = $$4;
      List<T> $$7 = $$1;
      if ($$5.getStage() != Stage.EXECUTE) {
         $$2.c().a(() -> "prepare " + this.b);

         try {
            for (int $$8 = $$2.d(); $$5.getStage() != Stage.EXECUTE; $$5 = $$5.nextStage()) {
               CommandContext<T> $$9 = $$5.getTopContext();
               if ($$9.isForked()) {
                  $$6 = $$6.b();
               }

               RedirectModifier<T> $$10 = $$9.getRedirectModifier();
               if ($$10 instanceof hh<T> $$11) {
                  $$11.a($$0, $$7, $$5, $$6, hk.a($$2, $$3));
                  return;
               }

               if ($$10 != null) {
                  $$2.e();
                  boolean $$12 = $$6.a();
                  List<T> $$13 = new ObjectArrayList();

                  for (T $$14 : $$7) {
                     try {
                        Collection<T> $$15 = ContextChain.runModifier($$9, $$14, ($$0x, $$1x, $$2x) -> {
                        }, $$12);
                        if ($$13.size() + $$15.size() >= $$8) {
                           $$0.a(a.create($$8), $$12, $$2.b());
                           return;
                        }

                        $$13.addAll($$15);
                     } catch (CommandSyntaxException var20) {
                        $$14.a(var20, $$12, $$2.b());
                        if (!$$12) {
                           return;
                        }
                     }
                  }

                  $$7 = $$13;
               }
            }
         } finally {
            $$2.c().c();
         }
      }

      if ($$7.isEmpty()) {
         if ($$6.c()) {
            $$2.a(new hf<>($$3, ht.a()));
         }
      } else {
         CommandContext<T> $$17 = $$5.getTopContext();
         if ($$17.getCommand() instanceof hg<T> $$19) {
            hk<T> $$20 = hk.a($$2, $$3);

            for (T $$21 : $$7) {
               $$19.a($$21, $$5, $$6, $$20);
            }
         } else {
            if ($$6.c()) {
               T $$22 = $$7.get(0);
               $$22 = $$22.b(ef.chain($$22.p(), $$3.d()));
               $$7 = List.of($$22);
            }

            hs<T> $$23 = new hs<>(this.b, $$6, $$17);
            hr.a($$2, $$3, $$7, ($$1x, $$2x) -> new hf<>($$1x, $$23.bind((T)$$2x)));
         }
      }
   }

   protected void a(hj<T> $$0, hl $$1) {
      hm $$2 = $$0.b();
      if ($$2 != null) {
         $$2.a($$1.c(), this.b);
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static class a<T extends ek<T>> extends hp<T> implements hi<T> {
      private final he b;
      private final T c;
      private final List<T> d;

      public a(String $$0, ContextChain<T> $$1, he $$2, T $$3, List<T> $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.d = $$4;
         this.b = $$2;
      }

      @Override
      public void execute(hj<T> $$0, hl $$1) {
         this.a(this.c, this.d, $$0, $$1, this.b);
      }
   }

   public static class b<T extends ek<T>> extends hp<T> implements hi<T> {
      private final T b;

      public b(String $$0, ContextChain<T> $$1, T $$2) {
         super($$0, $$1);
         this.b = $$2;
      }

      @Override
      public void execute(hj<T> $$0, hl $$1) {
         this.a($$0, $$1);
         this.a(this.b, List.of(this.b), $$0, $$1, he.a);
      }
   }

   public static class c<T extends ek<T>> extends hp<T> implements hn<T> {
      public c(String $$0, ContextChain<T> $$1) {
         super($$0, $$1);
      }

      public void a(T $$0, hj<T> $$1, hl $$2) {
         this.a($$1, $$2);
         this.a($$0, List.of($$0), $$1, $$2, he.a);
      }
   }
}
