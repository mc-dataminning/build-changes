import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tb<T> implements sw, te {
   static final te a = Stream::empty;
   static final sw b = Stream::empty;
   private final te c;
   private final sw d;
   private final du e;
   private final Function<tb<T>, T> f;

   @Override
   public Stream<ib> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tb(du $$0, Function<tb<T>, T> $$1, te $$2, sw $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public du a() {
      return this.e;
   }

   @Override
   public Stream<tc> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tb<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tc>>> b;
      private final UnaryOperator<Supplier<Stream<ib>>> c;

      public a(Function<tb<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tb<T>, T> $$0, UnaryOperator<Supplier<Stream<tc>>> $$1, UnaryOperator<Supplier<Stream<ib>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tb.a<T> a(int $$0) {
         return new tb.a<>(this.a, b($$0), b($$0));
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

      private T a(du $$0, te $$1, sw $$2) {
         return new tb<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<du> $$0, int $$1) {
         du $$2 = (du)$$0.getSource();
         return this.a($$2, tb.a, () -> sy.a($$1, $$2.d(), $$2.e()));
      }

      public T a(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return this.a($$1, tb.a, () -> sy.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         ib $$2 = ib.a($$1.d());
         return this.a($$1, tb.a, () -> sy.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<du> $$0) {
         du $$1 = (du)$$0.getSource();
         return this.a($$1, tb.a, () -> sy.a(ib.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<du> $$0) {
         return this.a((du)$$0.getSource(), () -> sk.a().stream().filter($$0x -> !$$0x.i()), tb.b);
      }

      public T a(CommandContext<du> $$0, String $$1) {
         return this.a((du)$$0.getSource(), () -> sk.a($$1).filter($$0xx -> !$$0xx.i()), tb.b);
      }

      public T a(CommandContext<du> $$0, boolean $$1) {
         return this.a((du)$$0.getSource(), () -> sk.c().filter($$1x -> !$$1 || $$1x.h()), tb.b);
      }

      public T b(CommandContext<du> $$0, String $$1) {
         return this.a((du)$$0.getSource(), () -> Stream.of(td.a($$0, $$1)), tb.b);
      }

      public T e(CommandContext<du> $$0) {
         return this.a($$0, false);
      }
   }
}
