import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tm<T> implements th, tp {
   static final tp a = Stream::empty;
   static final th b = Stream::empty;
   private final tp c;
   private final th d;
   private final eq e;
   private final Function<tm<T>, T> f;

   @Override
   public Stream<ja> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tm(eq $$0, Function<tm<T>, T> $$1, tp $$2, th $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public eq a() {
      return this.e;
   }

   @Override
   public Stream<tn> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tm<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tn>>> b;
      private final UnaryOperator<Supplier<Stream<ja>>> c;

      public a(Function<tm<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tm<T>, T> $$0, UnaryOperator<Supplier<Stream<tn>>> $$1, UnaryOperator<Supplier<Stream<ja>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tm.a<T> a(int $$0) {
         return new tm.a<>(this.a, b($$0), b($$0));
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

      private T a(eq $$0, tp $$1, th $$2) {
         return new tm<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<eq> $$0, int $$1) {
         eq $$2 = (eq)$$0.getSource();
         ja $$3 = ja.a($$2.d());
         return this.a($$2, tm.a, () -> tj.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<eq> $$0) {
         eq $$1 = (eq)$$0.getSource();
         ja $$2 = ja.a($$1.d());
         return this.a($$1, tm.a, () -> tj.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<eq> $$0) {
         eq $$1 = (eq)$$0.getSource();
         ja $$2 = ja.a($$1.d());
         return this.a($$1, tm.a, () -> tj.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<eq> $$0) {
         eq $$1 = (eq)$$0.getSource();
         return this.a($$1, tm.a, () -> tj.a(ja.a($$1.d()), $$1.i().L(), $$1.e()));
      }

      public T d(CommandContext<eq> $$0) {
         return this.a((eq)$$0.getSource(), () -> sv.a().stream().filter($$0x -> !$$0x.i()), tm.b);
      }

      public T a(CommandContext<eq> $$0, String $$1) {
         return this.a((eq)$$0.getSource(), () -> sv.a($$1).filter($$0xx -> !$$0xx.i()), tm.b);
      }

      public T a(CommandContext<eq> $$0, boolean $$1) {
         return this.a((eq)$$0.getSource(), () -> sv.c().filter($$1x -> !$$1 || $$1x.h()), tm.b);
      }

      public T b(CommandContext<eq> $$0, String $$1) {
         return this.a((eq)$$0.getSource(), () -> Stream.of(to.a($$0, $$1)), tm.b);
      }

      public T c(CommandContext<eq> $$0, String $$1) {
         eq $$2 = (eq)$$0.getSource();
         ja $$3 = ja.a($$2.d());
         return this.a($$2, tm.a, () -> tj.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<eq> $$0) {
         return this.a($$0, false);
      }
   }
}
