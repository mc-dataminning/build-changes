import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class uh<T> implements uc, uk {
   static final uk a = Stream::empty;
   static final uc b = Stream::empty;
   private final uk c;
   private final uc d;
   private final ep e;
   private final Function<uh<T>, T> f;

   @Override
   public Stream<iz> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   uh(ep $$0, Function<uh<T>, T> $$1, uk $$2, uc $$3) {
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
   public Stream<ui> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<uh<T>, T> a;
      private final UnaryOperator<Supplier<Stream<ui>>> b;
      private final UnaryOperator<Supplier<Stream<iz>>> c;

      public a(Function<uh<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<uh<T>, T> $$0, UnaryOperator<Supplier<Stream<ui>>> $$1, UnaryOperator<Supplier<Stream<iz>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public uh.a<T> a(int $$0) {
         return new uh.a<>(this.a, b($$0), b($$0));
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

      private T a(ep $$0, uk $$1, uc $$2) {
         return new uh<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ep> $$0, int $$1) {
         ep $$2 = (ep)$$0.getSource();
         iz $$3 = iz.a($$2.d());
         return this.a($$2, uh.a, () -> ue.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         iz $$2 = iz.a($$1.d());
         return this.a($$1, uh.a, () -> ue.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         iz $$2 = iz.a($$1.d());
         return this.a($$1, uh.a, () -> ue.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ep> $$0) {
         ep $$1 = (ep)$$0.getSource();
         return this.a($$1, uh.a, () -> ue.a(iz.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<ep> $$0) {
         return this.a((ep)$$0.getSource(), () -> tq.a().stream().filter($$0x -> !$$0x.i()), uh.b);
      }

      public T a(CommandContext<ep> $$0, String $$1) {
         return this.a((ep)$$0.getSource(), () -> tq.a($$1).filter($$0xx -> !$$0xx.i()), uh.b);
      }

      public T a(CommandContext<ep> $$0, boolean $$1) {
         return this.a((ep)$$0.getSource(), () -> tq.c().filter($$1x -> !$$1 || $$1x.h()), uh.b);
      }

      public T b(CommandContext<ep> $$0, String $$1) {
         return this.a((ep)$$0.getSource(), () -> Stream.of(uj.a($$0, $$1)), uh.b);
      }

      public T c(CommandContext<ep> $$0, String $$1) {
         ep $$2 = (ep)$$0.getSource();
         iz $$3 = iz.a($$2.d());
         return this.a($$2, uh.a, () -> ue.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ep> $$0) {
         return this.a($$0, false);
      }
   }
}
