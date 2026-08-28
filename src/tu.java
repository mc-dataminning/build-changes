import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tu<T> implements tp, tx {
   static final tx a = Stream::empty;
   static final tp b = Stream::empty;
   private final tx c;
   private final tp d;
   private final eu e;
   private final Function<tu<T>, T> f;

   @Override
   public Stream<jf> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tu(eu $$0, Function<tu<T>, T> $$1, tx $$2, tp $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public eu a() {
      return this.e;
   }

   @Override
   public Stream<tv> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tu<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tv>>> b;
      private final UnaryOperator<Supplier<Stream<jf>>> c;

      public a(Function<tu<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tu<T>, T> $$0, UnaryOperator<Supplier<Stream<tv>>> $$1, UnaryOperator<Supplier<Stream<jf>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tu.a<T> a(int $$0) {
         return new tu.a<>(this.a, b($$0), b($$0));
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

      private T a(eu $$0, tx $$1, tp $$2) {
         return new tu<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<eu> $$0, int $$1) {
         eu $$2 = (eu)$$0.getSource();
         jf $$3 = jf.a((jy)$$2.d());
         return this.a($$2, tu.a, () -> tr.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<eu> $$0) {
         eu $$1 = (eu)$$0.getSource();
         jf $$2 = jf.a((jy)$$1.d());
         return this.a($$1, tu.a, () -> tr.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<eu> $$0) {
         eu $$1 = (eu)$$0.getSource();
         jf $$2 = jf.a((jy)$$1.d());
         return this.a($$1, tu.a, () -> tr.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<eu> $$0) {
         eu $$1 = (eu)$$0.getSource();
         return this.a($$1, tu.a, () -> tr.a(jf.a((jy)$$1.d()), $$1.i().M(), $$1.e()));
      }

      public T d(CommandContext<eu> $$0) {
         return this.a((eu)$$0.getSource(), () -> td.a().stream().filter($$0x -> !$$0x.i()), tu.b);
      }

      public T a(CommandContext<eu> $$0, String $$1) {
         return this.a((eu)$$0.getSource(), () -> td.a($$1).filter($$0xx -> !$$0xx.i()), tu.b);
      }

      public T a(CommandContext<eu> $$0, boolean $$1) {
         return this.a((eu)$$0.getSource(), () -> td.c().filter($$1x -> !$$1 || $$1x.h()), tu.b);
      }

      public T b(CommandContext<eu> $$0, String $$1) {
         return this.a((eu)$$0.getSource(), () -> Stream.of(tw.a($$0, $$1)), tu.b);
      }

      public T c(CommandContext<eu> $$0, String $$1) {
         eu $$2 = (eu)$$0.getSource();
         jf $$3 = jf.a((jy)$$2.d());
         return this.a($$2, tu.a, () -> tr.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<eu> $$0) {
         return this.a($$0, false);
      }
   }
}
