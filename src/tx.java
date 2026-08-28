import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tx<T> implements ts, ua {
   static final ua a = Stream::empty;
   static final ts b = Stream::empty;
   private final ua c;
   private final ts d;
   private final ev e;
   private final Function<tx<T>, T> f;

   @Override
   public Stream<jg> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tx(ev $$0, Function<tx<T>, T> $$1, ua $$2, ts $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ev a() {
      return this.e;
   }

   @Override
   public Stream<ty> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tx<T>, T> a;
      private final UnaryOperator<Supplier<Stream<ty>>> b;
      private final UnaryOperator<Supplier<Stream<jg>>> c;

      public a(Function<tx<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tx<T>, T> $$0, UnaryOperator<Supplier<Stream<ty>>> $$1, UnaryOperator<Supplier<Stream<jg>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tx.a<T> a(int $$0) {
         return new tx.a<>(this.a, b($$0), b($$0));
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

      private T a(ev $$0, ua $$1, ts $$2) {
         return new tx<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ev> $$0, int $$1) {
         ev $$2 = (ev)$$0.getSource();
         jg $$3 = jg.a((jz)$$2.d());
         return this.a($$2, tx.a, () -> tu.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ev> $$0) {
         ev $$1 = (ev)$$0.getSource();
         jg $$2 = jg.a((jz)$$1.d());
         return this.a($$1, tx.a, () -> tu.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ev> $$0) {
         ev $$1 = (ev)$$0.getSource();
         jg $$2 = jg.a((jz)$$1.d());
         return this.a($$1, tx.a, () -> tu.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ev> $$0) {
         ev $$1 = (ev)$$0.getSource();
         return this.a($$1, tx.a, () -> tu.a(jg.a((jz)$$1.d()), $$1.i().M(), $$1.e()));
      }

      public T d(CommandContext<ev> $$0) {
         return this.a((ev)$$0.getSource(), () -> tg.a().stream().filter($$0x -> !$$0x.i()), tx.b);
      }

      public T a(CommandContext<ev> $$0, String $$1) {
         return this.a((ev)$$0.getSource(), () -> tg.a($$1).filter($$0xx -> !$$0xx.i()), tx.b);
      }

      public T a(CommandContext<ev> $$0, boolean $$1) {
         return this.a((ev)$$0.getSource(), () -> tg.c().filter($$1x -> !$$1 || $$1x.h()), tx.b);
      }

      public T b(CommandContext<ev> $$0, String $$1) {
         return this.a((ev)$$0.getSource(), () -> Stream.of(tz.a($$0, $$1)), tx.b);
      }

      public T c(CommandContext<ev> $$0, String $$1) {
         ev $$2 = (ev)$$0.getSource();
         jg $$3 = jg.a((jz)$$2.d());
         return this.a($$2, tx.a, () -> tu.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ev> $$0) {
         return this.a($$0, false);
      }
   }
}
