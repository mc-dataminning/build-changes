import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class te<T> implements sz, th {
   static final th a = Stream::empty;
   static final sz b = Stream::empty;
   private final th c;
   private final sz d;
   private final ex e;
   private final Function<te<T>, T> f;

   @Override
   public Stream<ji> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   te(ex $$0, Function<te<T>, T> $$1, th $$2, sz $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ex a() {
      return this.e;
   }

   @Override
   public Stream<tf> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<te<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tf>>> b;
      private final UnaryOperator<Supplier<Stream<ji>>> c;

      public a(Function<te<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<te<T>, T> $$0, UnaryOperator<Supplier<Stream<tf>>> $$1, UnaryOperator<Supplier<Stream<ji>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public te.a<T> a(int $$0) {
         return new te.a<>(this.a, b($$0), b($$0));
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

      private T a(ex $$0, th $$1, sz $$2) {
         return new te<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ex> $$0, int $$1) {
         ex $$2 = (ex)$$0.getSource();
         ji $$3 = ji.a((kb)$$2.d());
         return this.a($$2, te.a, () -> tb.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         ji $$2 = ji.a((kb)$$1.d());
         return this.a($$1, te.a, () -> tb.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         ji $$2 = ji.a((kb)$$1.d());
         return this.a($$1, te.a, () -> tb.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         return this.a($$1, te.a, () -> tb.a(ji.a((kb)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public T d(CommandContext<ex> $$0) {
         return this.a((ex)$$0.getSource(), () -> sn.a().stream().filter($$0x -> !$$0x.i()), te.b);
      }

      public T a(CommandContext<ex> $$0, String $$1) {
         return this.a((ex)$$0.getSource(), () -> sn.a($$1).filter($$0xx -> !$$0xx.i()), te.b);
      }

      public T a(CommandContext<ex> $$0, boolean $$1) {
         return this.a((ex)$$0.getSource(), () -> sn.c().filter($$1x -> !$$1 || $$1x.h()), te.b);
      }

      public T b(CommandContext<ex> $$0, String $$1) {
         return this.a((ex)$$0.getSource(), () -> Stream.of(tg.a($$0, $$1)), te.b);
      }

      public T c(CommandContext<ex> $$0, String $$1) {
         ex $$2 = (ex)$$0.getSource();
         ji $$3 = ji.a((kb)$$2.d());
         return this.a($$2, te.a, () -> tb.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ex> $$0) {
         return this.a($$0, false);
      }
   }
}
