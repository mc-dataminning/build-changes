import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ul<T> implements ug, uo {
   static final uo a = Stream::empty;
   static final ug b = Stream::empty;
   private final uo c;
   private final ug d;
   private final ew e;
   private final Function<ul<T>, T> f;

   @Override
   public Stream<jh> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   ul(ew $$0, Function<ul<T>, T> $$1, uo $$2, ug $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ew a() {
      return this.e;
   }

   @Override
   public Stream<um> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<ul<T>, T> a;
      private final UnaryOperator<Supplier<Stream<um>>> b;
      private final UnaryOperator<Supplier<Stream<jh>>> c;

      public a(Function<ul<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<ul<T>, T> $$0, UnaryOperator<Supplier<Stream<um>>> $$1, UnaryOperator<Supplier<Stream<jh>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ul.a<T> a(int $$0) {
         return new ul.a<>(this.a, b($$0), b($$0));
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

      private T a(ew $$0, uo $$1, ug $$2) {
         return new ul<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ew> $$0, int $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ul.a, () -> ui.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ul.a, () -> ui.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ul.a, () -> ui.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         return this.a($$1, ul.a, () -> ui.a(jh.a((ka)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public T d(CommandContext<ew> $$0) {
         return this.a((ew)$$0.getSource(), () -> tu.a().stream().filter($$0x -> !$$0x.i()), ul.b);
      }

      public T a(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> tu.a($$1).filter($$0xx -> !$$0xx.i()), ul.b);
      }

      public T a(CommandContext<ew> $$0, boolean $$1) {
         return this.a((ew)$$0.getSource(), () -> tu.c().filter($$1x -> !$$1 || $$1x.h()), ul.b);
      }

      public T b(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> Stream.of(un.a($$0, $$1)), ul.b);
      }

      public T c(CommandContext<ew> $$0, String $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ul.a, () -> ui.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ew> $$0) {
         return this.a($$0, false);
      }
   }
}
