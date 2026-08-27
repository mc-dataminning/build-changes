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

public class hj<T extends eg<T>> {
   @VisibleForTesting
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("command.forkLimit", $$0));
   private final String b;
   private final ContextChain<T> c;

   public hj(String $$0, ContextChain<T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   protected void a(T $$0, List<T> $$1, hd<T> $$2, hf $$3, gy $$4) {
      ContextChain<T> $$5 = this.c;
      gy $$6 = $$4;
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
               if ($$10 instanceof hb<T> $$11) {
                  $$11.a($$0, $$7, $$5, $$6, he.a($$2, $$3));
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
            $$2.a(new gz<>($$3, hn.a()));
         }
      } else {
         CommandContext<T> $$17 = $$5.getTopContext();
         if ($$17.getCommand() instanceof ha<T> $$19) {
            he<T> $$20 = he.a($$2, $$3);

            for (T $$21 : $$7) {
               $$19.a($$21, $$5, $$6, $$20);
            }
         } else {
            if ($$6.c()) {
               T $$22 = $$7.get(0);
               $$22 = $$22.b(eb.chain($$22.p(), $$3.d()));
               $$7 = List.of($$22);
            }

            hm<T> $$23 = new hm<>(this.b, $$6, $$17);
            hl.a($$2, $$3, $$7, ($$1x, $$2x) -> new gz<>($$1x, $$23.bind((T)$$2x)));
         }
      }
   }

   protected void a(hd<T> $$0, hf $$1) {
      hg $$2 = $$0.b();
      if ($$2 != null) {
         $$2.a($$1.c(), this.b);
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static class a<T extends eg<T>> extends hj<T> implements hc<T> {
      private final gy b;
      private final T c;
      private final List<T> d;

      public a(String $$0, ContextChain<T> $$1, gy $$2, T $$3, List<T> $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.d = $$4;
         this.b = $$2;
      }

      @Override
      public void execute(hd<T> $$0, hf $$1) {
         this.a(this.c, this.d, $$0, $$1, this.b);
      }
   }

   public static class b<T extends eg<T>> extends hj<T> implements hc<T> {
      private final T b;

      public b(String $$0, ContextChain<T> $$1, T $$2) {
         super($$0, $$1);
         this.b = $$2;
      }

      @Override
      public void execute(hd<T> $$0, hf $$1) {
         this.a($$0, $$1);
         this.a(this.b, List.of(this.b), $$0, $$1, gy.a);
      }
   }

   public static class c<T extends eg<T>> extends hj<T> implements hh<T> {
      public c(String $$0, ContextChain<T> $$1) {
         super($$0, $$1);
      }

      public void a(T $$0, hd<T> $$1, hf $$2) {
         this.a($$1, $$2);
         this.a($$0, List.of($$0), $$1, $$2, gy.a);
      }
   }
}
