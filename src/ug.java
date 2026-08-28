import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ug<T> implements ub, uj {
   static final uj a = Stream::empty;
   static final ub b = Stream::empty;
   private final uj c;
   private final ub d;
   private final ep e;
   private final Function<ug<T>, T> f;

   @Override
   public Stream<iz> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   ug(ep $$0, Function<ug<T>, T> $$1, uj $$2, ub $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ep a() {
      return this.e;
   }

   @Override
   public Stream<uh> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<ug<T>, T> a;
      private final UnaryOperator<Supplier<Stream<uh>>> b;
      private final UnaryOperator<Supplier<Stream<iz>>> c;

      public a(Function<ug<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<ug<T>, T> $$0, UnaryOperator<Supplier<Stream<uh>>> $$1, UnaryOperator<Supplier<Stream<iz>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ug.a<T> a(int $$0) {
         return new ug.a<>(this.a, b($$0), b($$0));
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

      private T a(ep $$0, uj $$1, ub $$2) {
         return new ug<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ep> $$0, int $$1) {
         ep $$2 = (ep)$$0.getSource();
         iz $$3 = iz.a($$2.d());
         return this.a($$2, ug.a, () -> ud.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         iz $$2 = iz.a($$1.d());
         return this.a($$1, ug.a, () -> ud.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         iz $$2 = iz.a($$1.d());
         return this.a($$1, ug.a, () -> ud.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         return this.a($$1, ug.a, () -> ud.a(iz.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<ep> $$0) {
         return this.a((ep)$$0.getSource(), () -> tp.a().stream().filter($$0x -> !$$0x.i()), ug.b);
      }

      public T a(CommandContext<ep> $$0, String $$1) {
         return this.a((ep)$$0.getSource(), () -> tp.a($$1).filter($$0xx -> !$$0xx.i()), ug.b);
      }

      public T a(CommandContext<ep> $$0, boolean $$1) {
         return this.a((ep)$$0.getSource(), () -> tp.c().filter($$1x -> !$$1 || $$1x.h()), ug.b);
      }

      public T b(CommandContext<ep> $$0, String $$1) {
         return this.a((ep)$$0.getSource(), () -> Stream.of(ui.a($$0, $$1)), ug.b);
      }

      public T c(CommandContext<ep> $$0, String $$1) {
         ep $$2 = (ep)$$0.getSource();
         iz $$3 = iz.a($$2.d());
         return this.a($$2, ug.a, () -> ud.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ep> $$0) {
         return this.a($$0, false);
      }
   }
}
