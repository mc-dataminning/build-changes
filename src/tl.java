import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tl implements tn, to {
   static final tn a = Stream::empty;
   static final to b = Stream::empty;
   private final tn c;
   private final to d;
   private final ei e;

   @Override
   public Stream<iu> findTestPos() {
      return this.d.findTestPos();
   }

   public static tl.a a() {
      return new tl.a();
   }

   tl(ei $$0, tn $$1, to $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ei b() {
      return this.e;
   }

   @Override
   public Stream<je.c<sq>> findTests() {
      return this.c.findTests();
   }

   public static class a {
      private final UnaryOperator<Supplier<Stream<je.c<sq>>>> a;
      private final UnaryOperator<Supplier<Stream<iu>>> b;

      public a() {
         this.a = $$0 -> $$0;
         this.b = $$0 -> $$0;
      }

      private a(UnaryOperator<Supplier<Stream<je.c<sq>>>> $$0, UnaryOperator<Supplier<Stream<iu>>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public tl.a a(int $$0) {
         return new tl.a(b($$0), b($$0));
      }

      private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
         return $$1 -> {
            List<Q> $$2 = new LinkedList<>();
            List<Q> $$3 = ((Stream)$$1.get()).toList();

            for (int $$4 = 0; $$4 < $$0; $$4++) {
               $$2.addAll($$3);
            }

            return $$2::stream;
         };
      }

      private tl a(ei $$0, tn $$1, to $$2) {
         return new tl($$0, this.a.apply($$1::findTests)::get, this.b.apply($$2::findTestPos)::get);
      }

      public tl a(CommandContext<ei> $$0, int $$1) {
         ei $$2 = (ei)$$0.getSource();
         iu $$3 = iu.a((jo)$$2.d());
         return this.a($$2, tl.a, () -> th.c($$3, $$1, $$2.e()));
      }

      public tl a(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         iu $$2 = iu.a((jo)$$1.d());
         return this.a($$1, tl.a, () -> th.b($$2, 15, $$1.e()).stream());
      }

      public tl b(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         iu $$2 = iu.a((jo)$$1.d());
         return this.a($$1, tl.a, () -> th.c($$2, 200, $$1.e()));
      }

      public tl c(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         return this.a($$1, tl.a, () -> th.a(iu.a((jo)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public tl a(CommandContext<ei> $$0, boolean $$1) {
         return this.a((ei)$$0.getSource(), () -> sf.a().filter($$1x -> !$$1 || ((sq)$$1x.a()).h()), tl.b);
      }

      public tl a(CommandContext<ei> $$0, Collection<je.c<sq>> $$1) {
         return this.a((ei)$$0.getSource(), $$1::stream, tl.b);
      }

      public tl d(CommandContext<ei> $$0) {
         return this.a($$0, false);
      }
   }
}
